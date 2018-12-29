package converter;

import org.springframework.core.convert.converter.Converter;

import model.GoodsModel;

public class GoodsConverter implements Converter<String, GoodsModel>{

	@Override
	public GoodsModel convert(String source) {
		GoodsModel goods = new GoodsModel();
		
		String stringValue[] = source.split(",");
		if (stringValue != null && stringValue.length == 3) {
			goods.setGoodsName(stringValue[0]);
			goods.setGoodsPrice(Double.parseDouble(stringValue[1]));
			goods.setGoodsNo(Integer.parseInt(stringValue[2]));
			return goods;
		} else {
			throw new IllegalArgumentException(String.format("类型转换失败，需要格式'apple,10.58,200',但格式是[%s]", source));
		}
	}

}
