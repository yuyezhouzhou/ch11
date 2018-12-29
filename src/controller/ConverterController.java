package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import model.GoodsModel;

@Controller
@RequestMapping("/my")
public class ConverterController {
	@RequestMapping("/converter")
	public String myConventer(@RequestParam("goods") GoodsModel goods, Model model) {
		model.addAttribute("goods",goods);
		return "showGoods";
	}
}
