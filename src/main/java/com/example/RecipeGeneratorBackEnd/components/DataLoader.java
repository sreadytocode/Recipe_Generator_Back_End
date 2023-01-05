package com.example.RecipeGeneratorBackEnd.components;

import com.example.RecipeGeneratorBackEnd.models.*;
import com.example.RecipeGeneratorBackEnd.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    IngredientRepository ingredientRepository;
    @Autowired
    InstructionRepository instructionRepository;

    @Autowired
    QuantityRepository quantityRepository;
    @Autowired
    RecipeRepository recipeRepository;

    public DataLoader() {}

    public void run(ApplicationArguments args) {
        // Ingredients list for the 3 seed Recipes

        //Healthy Sausage Casserole
        // Recipe is recipeName, recipeDescription, serving, rating, DietType, CuisineType, MealType
        Recipe recipe1 = new Recipe("Healthy Sausage Casserole","https://ichef.bbci.co.uk/food/ic/food_16x9_1600/recipes/healthy_sausage_16132_16x9.jpg","A Sausage Casserole filled with healthy goodness", 4, 3, DietType.NONE, CuisineType.FRENCH, MealType.DINNER);
        recipeRepository.save(recipe1);


        //Quantity and ingredient for red pepper
        Ingredient redPepper = new Ingredient("Red Peppers");
        ingredientRepository.save(redPepper);
        Quantity redPepperQuantity1 = new Quantity(2, "Whole", redPepper, recipe1);
        quantityRepository.save(redPepperQuantity1);

        //Quantity and ingredient for Carrots
        Ingredient carrot = new Ingredient("Carrots");
        ingredientRepository.save(carrot);
        Quantity carrots = new Quantity(2, "Whole", carrot, recipe1);
        quantityRepository.save(carrots);

        //Quantity and ingredient for Red Onions
        Ingredient redOnion = new Ingredient("Red Onions");
        ingredientRepository.save(redOnion);
        Quantity redOnions = new Quantity(2, "Whole", redOnion, recipe1);
        quantityRepository.save(redOnions);

        //Quality and ingredient for Garlic
        Ingredient garlicClove = new Ingredient("Garlic Cloves");
        ingredientRepository.save(garlicClove);
        Quantity garlicCloves = new Quantity(5, "Whole", garlicClove, recipe1);
        quantityRepository.save(garlicCloves);

        //Quantity and ingredient for sausages
        Ingredient leanSausage = new Ingredient("Lean Sausages");
        ingredientRepository.save(leanSausage);
        Quantity leanSausages = new Quantity(8, "Whole", leanSausage, recipe1);
        quantityRepository.save(leanSausages);

        //Quantity and ingredient for Cherry Tomatoes
        Ingredient cherryTomato = new Ingredient("Tin peeled Cherry Tomatoes");
        ingredientRepository.save(cherryTomato);
        Quantity cherryTomatoes = new Quantity(400, "gr", cherryTomato, recipe1);
        quantityRepository.save(cherryTomatoes);

        //Quantity and ingredient for Chickpeas
        Ingredient chickpea = new Ingredient("Tin Chickpeas");
        ingredientRepository.save(chickpea);
        Quantity chickpeas = new Quantity(400, "gr", chickpea, recipe1);
        quantityRepository.save(chickpeas);

        //Quantity and ingredient for Veg Stock
        Ingredient vegStock = new Ingredient("Vegetable Stock");
        ingredientRepository.save(vegStock);
        Quantity vegetableStock = new Quantity(200, "ml", vegStock, recipe1);
        quantityRepository.save(vegetableStock);

        //Quantity and ingredient for Green Chilli
        Ingredient greenChilli = new Ingredient("Green Chilli");
        ingredientRepository.save(greenChilli);
        Quantity greenChillies = new Quantity(1, "Whole", greenChilli, recipe1);
        quantityRepository.save(greenChillies);

        //Quantity and ingredient for Paprika
        Ingredient paprika = new Ingredient("Paprika");
        ingredientRepository.save(paprika);
        Quantity paprikas = new Quantity(1, "tsp", paprika, recipe1);
        quantityRepository.save(paprikas);

        //Quantity and ingredient for French mustard
        Ingredient frenchMustard = new Ingredient("French Mustard");
        ingredientRepository.save(frenchMustard);
        Quantity french_Mustard = new Quantity(2, "tsp", frenchMustard, recipe1);
        quantityRepository.save(french_Mustard);

        //Quantity and ingredient for mixed veg
        Ingredient mixedVegetables = new Ingredient("Frozen mixed vegetables");
        ingredientRepository.save(mixedVegetables);
        Quantity frozenMixedVeg = new Quantity(100, "gr", mixedVegetables, recipe1);
        quantityRepository.save(frozenMixedVeg);

        // Instructions
        Instruction instruction1 = new Instruction(1, "Preheat the oven to 220C/200C Fan/Gas 7.", recipe1);
        instructionRepository.save(instruction1);

        Instruction instruction2 = new Instruction(2, "Put the peppers, carrots, onions and garlic into a deep baking dish and roast for 20 minutes. Add the sausages and roast for a further 10 minutes.", recipe1);
        instructionRepository.save(instruction2);

        Instruction instruction3 = new Instruction(3, "Turn the oven down to 200C/180C Fan/Gas 6. Pour the tomatoes and chickpeas into the baking dish, then stir in the stock, chilli and paprika. Bake for another 35 minutes.", recipe1);
        instructionRepository.save(instruction3);

        Instruction instruction4 = new Instruction(4, "Stir in the mustard and the frozen mixed veg and return to the oven for 5 minutes. Leave to rest for 10 minutes before serving.", recipe1);
        instructionRepository.save(instruction4);

/////////////////////////////////////////
        //Harissa-roasted cauliflower steaks recipe
        Recipe recipe2 = new Recipe("Harissa-roasted cauliflower steaks", "https://ichef.bbci.co.uk/food/ic/food_16x9_1600/recipes/harissa-roasted_35227_16x9.jpg","Made from a few simple ingredients, this vegan cauliflower dish would not look out of place in a smart restaurant. Serve as a starter, or with a salad for lunch or a light meal. Making your own harissa is really easy, but if you’re short of time you can use a jar of ready-made harissa instead.", 2, 4, DietType.VEGAN, CuisineType.PAKISTANI, MealType.LUNCH);
        recipeRepository.save(recipe2);


        //Q&I for Cauliflower
        Ingredient cauliflower = new Ingredient("Cauliflower");
        ingredientRepository.save(cauliflower);
        Quantity slicedCauliflower = new Quantity(1, "Whole", cauliflower, recipe2);
        quantityRepository.save(slicedCauliflower);

        //Q&I
        Quantity garlicCloves3 = new Quantity(2, "Whole", garlicClove, recipe2);
        quantityRepository.save(garlicCloves3);

        //Q&I
        Ingredient harissaPaste = new Ingredient("Harissa Paste");
        ingredientRepository.save(harissaPaste);
        Quantity harissaSashe = new Quantity(2, "tbsp", harissaPaste, recipe2);
        quantityRepository.save(harissaSashe);

        //Q&I
        Ingredient oliveOil = new Ingredient("Olive Oil");
        ingredientRepository.save(oliveOil);
        Quantity olive_Oil = new Quantity(2, "tsp", oliveOil, recipe2);
        quantityRepository.save(olive_Oil);
        Quantity olive_Oil2 = new Quantity(125, "ml", oliveOil, recipe2);
        quantityRepository.save(olive_Oil2);

        //Q&I
        Ingredient chilliFlake = new Ingredient("Chilli Flakes");
        ingredientRepository.save(chilliFlake);
        Quantity chilliFlakes = new Quantity(1, "tsp", chilliFlake, recipe2);
        quantityRepository.save(chilliFlakes);

        //Q&I
        Ingredient seaSaltFlake = new Ingredient("Sea Salt flakes");
        ingredientRepository.save(seaSaltFlake);
        Quantity seaSaltFlakes = new Quantity(0, "To taste", seaSaltFlake, recipe2);
        quantityRepository.save(seaSaltFlakes);

        //Q&I
        Ingredient cumin = new Ingredient("Cumin");
        ingredientRepository.save(cumin);
        Quantity groundCumin = new Quantity(2, "tsp", cumin, recipe2);
        quantityRepository.save(groundCumin);

        //Q&I
        Ingredient corianderSeed = new Ingredient("Coriander Seeds");
        ingredientRepository.save(corianderSeed);
        Quantity corianderSeeds = new Quantity(0.5, "tsp", corianderSeed, recipe2);
        quantityRepository.save(corianderSeeds);

        //Q&I
        Ingredient smokedPaprika = new Ingredient("Hot smoked Paprika");
        ingredientRepository.save(smokedPaprika);
        Quantity smokedPaprikas =  new Quantity(2, "tsp", smokedPaprika, recipe2);
        quantityRepository.save(smokedPaprikas);

        //Q&I
        Quantity garlicCloves2 = new Quantity(4, "Peeled Whole", garlicClove, recipe2);
        quantityRepository.save(garlicCloves2);

        //Q&I
        Ingredient chargrilledPepper = new Ingredient("Large Char-grilled Pepper");
        ingredientRepository.save(chargrilledPepper);
        Quantity chargrilledPeppers = new Quantity(1, "Large", chargrilledPepper, recipe2);
        quantityRepository.save(chargrilledPeppers);

        //Instructions
        Instruction instruction5 = new Instruction(1, "To make the harissa, place all the ingredients into a food processor with a pinch of salt and blend, or use a pestle and mortar to grind until smooth.", recipe2);
        instructionRepository.save(instruction5);

        Instruction instruction6 = new Instruction(2, "Preheat the oven to 200C/180C Fan/Gas 6.", recipe2);
        instructionRepository.save(instruction6);

        Instruction instruction7 = new Instruction(3, "Rub the garlic cloves over the cauliflower steaks, then rub a teaspoon of the harissa you made and a pinch of salt over each steak, ensuring the entire steak is covered. Drizzle 1 teaspoon of the olive oil over a baking tray. Place the cauliflower on the baking tray and bake for 20 minutes. Turn over and bake for another 15 minutes (or 20–23 minutes if you like a slightly crispier texture).", recipe2);
        instructionRepository.save(instruction7);

        Instruction instruction8 = new Instruction(4, "Oil another baking tray. Wash the reserved leaves and remove any tough stalks. Put the leaves in a bowl along with 1 teaspoon of harissa and ¼ teaspoon of salt then rub the leaves to coat them in harissa. Place on the baking tray. Bake for 15 minutes, or until crisp.", recipe2);
        instructionRepository.save(instruction8);

        Instruction instruction9 = new Instruction(5, "To serve, divide the hummus between two plates and top with the cauliflower steaks. Add the crispy leaves around the plate and finish with a sprinkling of toasted pine nuts and a drizzle of harissa.", recipe2);
        instructionRepository.save(instruction9);

/////////////////////////////////////////
        //Chickpea and Quinoa Salad recipe
        Recipe recipe3 =new Recipe("Chickpea and Quinoa Salad", "https://foodrevolution.org/wp-content/uploads/Chickpea-Quinoa-Salad-2.jpg","A super easy and healthy mediterranean dish packed fill of nutrition and goodness.", 4, 4, DietType.VEGETARIAN, CuisineType.FRENCH, MealType.LUNCH);
        recipeRepository.save(recipe3);

        //Q&I
        Ingredient quinoa = new Ingredient("Quinoa");
        ingredientRepository.save(quinoa);
        Quantity quinoas = new Quantity(180, "gr", quinoa, recipe3);
        quantityRepository.save(quinoas);

        //Q&I
        Ingredient stock = new Ingredient("Stock (chicken, beef or vegetable)");
        ingredientRepository.save(stock);
        Quantity stocks = new Quantity(480, "ml", stock, recipe3);
        quantityRepository.save(stocks);

        //Q&I
        Quantity chickpeas2 = new Quantity(440, "gr", chickpea, recipe3);
        quantityRepository.save(chickpeas2);

        //Q&I
        Ingredient avocado = new Ingredient("Avocado");
        ingredientRepository.save(avocado);
        Quantity avocados = new Quantity(1, "Whole", avocado, recipe3);
        quantityRepository.save(avocados);

        //Q&I
        Quantity carrots2 = new Quantity(5, "Whole", carrot, recipe3);
        quantityRepository.save(carrots2);

        //Q&I
        Ingredient freshCherryTomatoes = new Ingredient("Cherry Tomatoes");
        ingredientRepository.save(freshCherryTomatoes);
        Quantity cherryTomotoes2 = new Quantity(0, "As many as you want", freshCherryTomatoes, recipe3);
        quantityRepository.save(cherryTomotoes2);

        //Q&I
        Quantity smokedPaprika2 = new Quantity(3, "tsp", smokedPaprika, recipe3);
        quantityRepository.save(smokedPaprika2);

        //Q&I
        Ingredient seaSalt = new Ingredient("Sea Salt");
        ingredientRepository.save(seaSalt);
        Quantity pinch = new Quantity(0, "Pinch of Sea Salt", seaSalt, recipe3);
        quantityRepository.save(pinch);

        //Q&I
        Ingredient cucumber = new Ingredient("Cucumber");
        ingredientRepository.save(cucumber);
        Quantity cucumbers = new Quantity(0.5, "Half a cucumber", cucumber, recipe3);
        quantityRepository.save(cucumbers);

        Quantity oliveOils2 = new Quantity(2, "tbsp", oliveOil, recipe3);
        quantityRepository.save(oliveOils2);

        //Q&I
        Ingredient blackPepper = new Ingredient(" Black pepper");
        ingredientRepository.save(blackPepper);
        Quantity blackPeppers = new Quantity(0, "Dash", blackPepper, recipe3);
        quantityRepository.save(blackPeppers);

        //Q&I
        Ingredient oregano = new Ingredient(" Dried oregano");
        ingredientRepository.save(oregano);
        Quantity driedOregano = new Quantity(1, "tsp", oregano, recipe3);
        quantityRepository.save(driedOregano);

        //Q&I
        Quantity chilliFlakes2 = new Quantity(1, "tsp", chilliFlake, recipe3);
        quantityRepository.save(chilliFlakes2);

        //Q&I
        Ingredient nandosHotSauce = new Ingredient("Nando's hot sauce");
        ingredientRepository.save(nandosHotSauce);
        Quantity piriHotSauce = new Quantity(0, "(Optional) As much as you want", nandosHotSauce, recipe3);
        quantityRepository.save(piriHotSauce);

        Ingredient lemonJuice = new Ingredient("Lemon juice");
        ingredientRepository.save(lemonJuice);
        Quantity lemonJuices = new Quantity(1, "tsp", lemonJuice, recipe3);
        quantityRepository.save(lemonJuices);

        //Instructions
        // DON'T DELETE \n it looks weird I know but you need for it to go onto the next line
        Instruction instruction10 = new Instruction(1, "Add quinoa to a sieve, wash under cold water for around 30 seconds or until\n" +
                "water is clear. Add quinoa to sauce pan with stock, smoked paprika, chilli flakes, pinch of \n" +
                "sea salt. Heat to high heat, when it comes to a boil place a lid, lower to low \n" +
                "heat and set it simmer for 15 minutes. When liquid is absorbed remove from\n" +
                "heat, let it sit for 5 minutes. Then with a fork fluff quinoa. \n", recipe3);
        instructionRepository.save(instruction10);

        Instruction instruction11 = new Instruction(2, "Drain can of chickpeas, use 1tsp of olive oil and fry for 5 minutes until soft and tender in a pan. \n" +
                "Then set aside into a bowl. Grate the carrots, chop the avocado and cucumber, wash and chop the cherry tomatoes and add to same bowl.", recipe3);
        instructionRepository.save(instruction11);

        Instruction instruction12 = new Instruction(3, "Add olive oil, paprika, sea salt, black pepper, lemon juice, oregano to bowl and mix everything together. If you want add hot nando's sauce to give it more flavour.", recipe3);
        instructionRepository.save(instruction12);

        Instruction instruction13 = new Instruction(4, "Add cooled quinoa to bowl. Mix together and enjoy!", recipe3);
        instructionRepository.save(instruction13);

/////////////////////////////////////////
        //End of file or add new recipe below
       //Japanese fried chicken recipe
        Recipe recipe4 =new Recipe("Japanese fried chicken", "https://ichef.bbci.co.uk/food/ic/food_16x9_1600/recipes/chicken_karaage_with_47513_16x9.jpg","With hint of garlic and soy sauce, Japanese fried chicken (kara-age) is one of the most popular dishes in Japan.", 4, 4, DietType.NONE, CuisineType.JAPANESE, MealType.DINNER);
        recipeRepository.save(recipe4);

        //Q&I
        Ingredient chicken = new Ingredient("Chicken");
        ingredientRepository.save(chicken);
        Quantity chickens = new Quantity(450, "gr", chicken, recipe4);
        quantityRepository.save(chickens);

        //Q&I
        Ingredient mirin = new Ingredient("Mirin");
        ingredientRepository.save(mirin);
        Quantity mirins = new Quantity(15, "ml", mirin, recipe4);
        quantityRepository.save(mirins);


        //Q&I
        Ingredient soysauce = new Ingredient("Soy Sauce");
        ingredientRepository.save(soysauce);
        Quantity soysauces = new Quantity(30, "ml", soysauce, recipe4);
        quantityRepository.save(soysauces);


        //Q&I
        Ingredient garlicpaste = new Ingredient("Garlic Paste");
        ingredientRepository.save(garlicpaste);
        Quantity garlicpastes = new Quantity(10, "gr", garlicpaste, recipe4);
        quantityRepository.save(garlicpastes);


        //Q&I
        Ingredient egg = new Ingredient("Egg");
        ingredientRepository.save(egg);
        Quantity eggs = new Quantity(0.5, "Half an egg", egg, recipe4);
        quantityRepository.save(eggs);


        //Q&I
        Ingredient vegetableOil = new Ingredient("Vegetable Oil");
        ingredientRepository.save(vegetableOil);
        Quantity vegetableOils = new Quantity(0, "Adequate Amount For Deep Frying", vegetableOil, recipe4);
        quantityRepository.save(vegetableOils);

        //Q&I
        Ingredient flour = new Ingredient("Flour");
        ingredientRepository.save(flour);
        Quantity flours = new Quantity(40, "gr", flour, recipe4);
        quantityRepository.save(flours);

        //Instructions
        // DON'T DELETE \n it looks weird I know but you need for it to go onto the next line
        Instruction instruction14 = new Instruction(1,
                "In a large bowl, combine the chicken, sake, sugar, soy sauce, ginger, and \n" +
                        "garlic. Mix well. Cover with plastic and marinate for at least 15 minutes \n" +
                        "in the fridge.\n", recipe4);
        instructionRepository.save(instruction14);

        Instruction instruction15 = new Instruction(2, "Add the egg and potato starch to the chicken.", recipe3);
        instructionRepository.save(instruction15);

        Instruction instruction16 = new Instruction(3, "Heat the oil to 340˚F (170˚C). Fry the chicken until golden brown \n" +
                " and fully cooked, 5-7 minutes.\n", recipe4);
        instructionRepository.save(instruction16);

        //Gluten-free blueberry bread recipe
        Recipe recipe5 =new Recipe("Blueberry Oat Bread", "https://www.laurafuentes.com/wp-content/uploads/2020/09/Blueberry-Bread-with-Oats-post-6.jpg",
                "Healthy and fun gluten-free breakfast choice that works for everyone!", 4, 5, DietType.GLUTEN_FREE, CuisineType.AMERICAN, MealType.BREAKFAST);
        recipeRepository.save(recipe5);

        //Q&I
        Ingredient oatFlour = new Ingredient("Oat Flour");
        ingredientRepository.save(oatFlour);
        Quantity oatFlours = new Quantity(400, "gr", oatFlour, recipe5);
        quantityRepository.save(oatFlours);

        //Q&I
        Ingredient blueberry = new Ingredient("Blueberry");
        ingredientRepository.save(blueberry);
        Quantity blueberries = new Quantity(150, "gr", blueberry, recipe5);
        quantityRepository.save(blueberries);


        //Q&I
        Ingredient bakingPowder = new Ingredient("Baking Powder");
        ingredientRepository.save(bakingPowder);
        Quantity bakingPowders = new Quantity(10, "gr", bakingPowder, recipe5);
        quantityRepository.save(bakingPowders);


        //Q&I
        Ingredient honey = new Ingredient("Honey");
        ingredientRepository.save(honey);
        Quantity honeys = new Quantity(2, "tbsp", honey, recipe5);
        quantityRepository.save(honeys);


        //Q&I
//        the second time for eggs

        Quantity eggs2 = new Quantity(2, "Whole", egg, recipe5);
        quantityRepository.save(eggs2);


        //Q&I
        Ingredient coconutOil = new Ingredient("Coconut Oil");
        ingredientRepository.save(coconutOil);
        Quantity coconutOils = new Quantity(100, "ml", coconutOil, recipe5);
        quantityRepository.save(coconutOils);

        //Q&I
        Ingredient banana = new Ingredient("Banana");
        ingredientRepository.save(banana);
        Quantity bananas = new Quantity(2, "Whole", banana, recipe5);
        quantityRepository.save(bananas);

        //Instructions
        // DON'T DELETE \n it looks weird I know but you need for it to go onto the next line
        Instruction instruction17 = new Instruction(1,
                "Preheat the oven to 180 degree. Line a 9 x 5-inch (23 x 10cm) loaf pan with parchment paper.\n", recipe5);
        instructionRepository.save(instruction17);

        Instruction instruction18 = new Instruction(2, "In a large bowl, whisk together the oat flour, baking powder and salt.\n", recipe5);
        instructionRepository.save(instruction18);

        Instruction instruction19 = new Instruction(3, "In a blender, place the honey, banana, coconut oil and eggs.\n" +
                "Blend on medium speed until the ingredients are combined,\n" + " and you have a smooth, frothy texture. \n", recipe5);
        instructionRepository.save(instruction19);

        Instruction instruction20 = new Instruction(4, "Pour the wet mixture into the dry ingredient bowl,\n" +
                "and slowly whisk until combined. Add in the oats, and mix,\n" + "then gently fold in the blueberries into the batter.\n", recipe5);
        instructionRepository.save(instruction20);

        Instruction instruction21 = new Instruction(5, "Pour the batter into the pan and bake 45 – 55 minutes or \n" +
                "until a toothpick comes out clean. If your bread loaf is looking \n" + "golden around minute 35, cover with a piece of tin foil.\n", recipe5);
        instructionRepository.save(instruction21);

        Instruction instruction22 = new Instruction(6, "Remove the loaf from the oven and allow it to cool down \n" +
                "in the pan for 10 minutes before lifting the parchment paper \n" + "out of the pan and slicing the blueberry loaf.\n", recipe5);
        instructionRepository.save(instruction22);

        //Keto veggie breakfast bake recipe
        Recipe recipe6 = new Recipe("Vegetable Breakfast Bake",
                "https://ichef.bbci.co.uk/food/ic/food_16x9_1600/recipes/the_ultimate_vegan_12214_16x9.jpg",
                "Hit 3 of your 5-a-day with this alternative fry-up - it's packed with vegetables and easy oven-baked.",
                4, 3, DietType.KETO, CuisineType.ITALIAN, MealType.BREAKFAST);
        recipeRepository.save(recipe6);


        //Q&I
        Ingredient largeFieldMushroom = new Ingredient("Large Field Mushroom");
        ingredientRepository.save(largeFieldMushroom);
        Quantity largeFieldMushrooms = new Quantity(4, "Whole", largeFieldMushroom, recipe6);
        quantityRepository.save(largeFieldMushrooms);

        //Q&I
        Quantity garlicCloves4 = new Quantity(1, "Whole", garlicClove, recipe6);
        quantityRepository.save(garlicCloves4);

        //Q&I

        Quantity oliveOil3 = new Quantity(2, "tsp", oliveOil, recipe6);
        quantityRepository.save(oliveOil3);


        //Q&I
        Ingredient tomato = new Ingredient("Tomatoes");
        ingredientRepository.save(tomato);
        Quantity tomatoes = new Quantity(8, "Whole", tomato, recipe6);
        quantityRepository.save(tomatoes);

        //Q&I
        Ingredient spinach = new Ingredient("Spinach");
        ingredientRepository.save(spinach);
        Quantity spinachs = new Quantity(200, "gr", spinach, recipe6);
        quantityRepository.save(spinachs);

        //Q&I
        Quantity eggs3 = new Quantity(4, "Whole", egg, recipe6);
        quantityRepository.save(eggs3);


        //Instructions
        Instruction instruction23 = new Instruction(1, "Heat oven to 200C/180C fan/gas 6. Put the mushrooms and tomatoes \n" + "into 4 ovenproof dishes.\n", recipe6);
        instructionRepository.save(instruction23);

        Instruction instruction24 = new Instruction(2, "Divide sliced garlic between the dishes, drizzle over \n" +
                "the oil and some seasoning, then bake for 10 mins.\n", recipe6);
        instructionRepository.save(instruction24);

        Instruction instruction25 = new Instruction(3, "Meanwhile, put the spinach into a large colander, then pour over \n" +
                "a kettle of boiling water to wilt it. Squeeze out \n" + "any excess water, then add the spinach to the dishes.\n", recipe6);
        instructionRepository.save(instruction25);

        Instruction instruction26 = new Instruction(4, "Make a little gap between the vegetables and crack an egg \n" +
                "into each dish.\n", recipe6);
        instructionRepository.save(instruction26);

        Instruction instruction27 = new Instruction(5, "Return to the oven and cook for a further 8-10 mins \n" +
                "or until the egg is cooked to your liking.\n", recipe6);
        instructionRepository.save(instruction27);

    }

}
