package cn.far.ssm.controller;

import cn.far.ssm.pojo.Item;
import cn.far.ssm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
//    @Qualifier("itemService")
    private ItemService itemService;

    @RequestMapping("/one/{id}")
    public String go(@PathVariable("id") int id, Model model) {
        Item one = itemService.findOne(id);
        model.addAttribute("one",one);
        System.out.println(one);
        return "show";
    }
}
