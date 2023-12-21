package com.fst.srt.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.fst.srt.entities.Produit;
import com.fst.srt.repositories.ProductRepository;
@Controller
@RequestMapping("produit")
public class ProduitController {
	@Autowired
ProductRepository produitRepository;
	@GetMapping("/list")
	public String afficher(Model model)
	{
		//List<Produit>produits=new ArrayList<>();
	model.addAttribute("produits",produitRepository.findAll());
		return "afficher";	
	}
@GetMapping("/add")
//@ResponseBody
public String ajouter()
{
return "ajout";
	}
@PostMapping("/add")
//@ResponseBody
public String ajout(@RequestParam("nom") String nom, @RequestParam("description") String description,
		@RequestParam("prix") double prix)
{
	Produit produit=new Produit(nom,description,prix);
	Produit success=produitRepository.save(produit);
	return "redirect:list";
	}
@GetMapping("delete/{id}")
public String supprimer(@PathVariable("id") long id)
{
	//Optional<Produit> produit=produitRepository.findById((long) id);
	produitRepository.deleteById(id);
	return "redirect:../list";
	}
@GetMapping("update/{id}")
public String maj(Model model,@PathVariable("id") long id)
{
	Optional<Produit> produit=produitRepository.findById(id);
	model.addAttribute("p",produit);
	return "modifier";
	}
@PostMapping("update")
public String modifier(Produit produit)
{

	produitRepository.save(produit);
	return "redirect:list";
	
}


}
