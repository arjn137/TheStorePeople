import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Main {
	// all departments get their own array
	private static ArrayList<ProductShell> Cars = new ArrayList<ProductShell>();
	private static ArrayList<ProductShell> Health = new ArrayList<ProductShell>();
	private static ArrayList<ProductShell> Outdoors = new ArrayList<ProductShell>();
	private static ArrayList<ProductShell> Clothing = new ArrayList<ProductShell>();
	private static ArrayList<ProductShell> Entertainment = new ArrayList<ProductShell>();
	private static ArrayList<ProductShell> Food = new ArrayList<ProductShell>();
	private static ArrayList<ProductShell> Furniture = new ArrayList<ProductShell>();
	private static ArrayList<ProductShell> Technology = new ArrayList<ProductShell>();
	public static ShoppingCart shop = new ShoppingCart();

	public static void main(String[] args) {
		// add every product to their respective array
		Cars.add(new ProductShell("Ferrari 488 GTB",
				"<html><center> The 488 GTB name marks a return to the classic Ferrari model designation with the 488 in its moniker indicating the engine's unitary displacement, while the GTB stands for Gran Turismo Berlinetta. <br> The new car not only delivers unparalleled performance, it also makes that extreme power exploitable and controllable to an unprecedented level even by less expert drivers. </center></html>",
				290000, new ImageIcon(Main.class.getResource("Product Images/Cars/ferrari.jpg"))));
		Cars.add(new ProductShell("Lamborghini Huracan",
				"<html><center>Discover all the new models of this exclusive car family, created to shape to your deepest emotions. <br> Combining the highest expression of Lamborghini's power with the exclusive refinement of Italian handicraft, this series embodies authentic design and state-of-the-art mechanical technology. <br> The Lamborghini Huracán is the perfect fusion of technology and design.</center></html>",
				262000, new ImageIcon(Main.class.getResource("Product Images/Cars/lamborghini.jpg"))));
		Cars.add(new ProductShell("Bugatti Veyron 16.4",
				"<html><center>Bugatti set the benchmark even higher with the plan of turning the supercar into a luxury road car suitable for everyday use. <br>The development of the Veyron was one of the greatest technological challenges ever known in the automotive industry. <br> Barely any parts, components or systems could be taken from existing car concepts and used in the Veyron. </center></html>",
				1700000, new ImageIcon(Main.class.getResource("Product Images/Cars/bugatti.jpg"))));
		Cars.add(new ProductShell("Aston Martin Rapide",
				"<html><center>Rapide S is the world’s most beautiful four-door sports car. <br> Created with the finest ingredients, conceived with a unique vision, it combines sensational sports car performance and supreme refinement in one compelling form. Ground-breaking and yet possessed of timeless beauty, Rapide S is sublime, thrilling and every inch an Aston Martin. </center></html>",
				206000, new ImageIcon(Main.class.getResource("Product Images/Cars/astonmartin.jpg"))));
		Cars.add(new ProductShell("Bentley Continental GT",
				"<html><center>The luxury of spontaneity – the freedom to take to the open road on your own terms. <br> No other car on the road today exemplifies the spirit of life’s grand tour more than the Bentley Continental GT. <br>The new model sports an even more powerful W12 twin turbo engine, up to 590 PS from 575 PS. </center></html>",
				263000, new ImageIcon(Main.class.getResource("Product Images/Cars/bentley.jpg"))));
		Cars.add(new ProductShell("Corvette Grand Sport",
				"<html><center>The latest member of the Corvette lineup, the 2017 Grand Sport carries on the racing spirit of the original 1963 model, <br> combining the power of the legendary LT1 6.2L engine with a lightweight, race-bred chassis and aerodynamics package to provide incredible grip and handling. </center></html>",
				72000, new ImageIcon(Main.class.getResource("Product Images/Cars/chevrolet.jpg"))));
		Cars.add(new ProductShell("Ford Shelby GT350 Mustang",
				"<html><center>Just looking at the Shelby GT350® makes your heart beat faster. <br> A true example of form beautifully following function. Now imagine strapping yourself in and firing up that 5.2L V8. Revving it. Feeling that incredible horsepower chomping at the bit. </center></html>",
				54570, new ImageIcon(Main.class.getResource("Product Images/Cars/mustang.jpg"))));
		Cars.add(new ProductShell("Audi R8",
				"<html><center>The 2017 R8 exclusive edition comes standard equipped with a gloss anthracite front grille and full LED headlights supplemented by a laser high beam module, <br> the latest production technology in a long line of lighting innovations from Audi. </center></html>",
				115400, new ImageIcon(Main.class.getResource("Product Images/Cars/audi.jpg"))));
		Cars.add(new ProductShell("Mercedes-Benz S-Class Maybach",
				"<html><center>Superior performance, exquisite style, and cutting-edge technology are what you expect from Mercedes-Benz. <br> For as long as you drive your vehicle, our commitment to you continues with world-class Mercedes-Benz service, parts and accessories. </center></html>",
				166000, new ImageIcon(Main.class.getResource("Product Images/Cars/mercedes.jpg"))));
		Cars.add(new ProductShell("Acura NSX",
				"<html><center>NSX TURNS HEADS AND SETS HEARTS RACING. <br> From those who fell for the first-generation supercar in 1991, to those who got their first glimpse in a Super Bowl ad, NSX has always provoked an intense reaction. <br> And when it’s driven, the response is unparalleled.</center></html>",
				168000, new ImageIcon(Main.class.getResource("Product Images/Cars/acura.jpg"))));

		Health.add(new ProductShell("Life Fitness T5 Go Treadmill",
				"<html><center>Adjustable FlexDeck Select allows user to pick the level of firmness on the deck that suits them best. <br> Features a spacious 22 x 60 inch running surface, and Energy Saver feature reduces power draw when not in use. </center></html>",
				3999, new ImageIcon(Main.class.getResource("Product Images/Health/treadmill.JPG"))));
		Health.add(new ProductShell("Bowflex SelectTech 1090 Adjustable Dumbbells (Pair), Series 3.1 Bench, and Stand",
				"<html><center>Weight adjusts on each dumbbell from 10 pounds up to 90 pounds in 5-pound increments with the twist of a dial; <br> suitable for both basic toning and strength exercises and heavy leg lifts; durable molding surrounds the metal plates to create smooth, <br> quiet liftoff; includes \"Secrets of the 4-Step Rep\" DVD with more than 30 exercises.</center></html>",
				828, new ImageIcon(Main.class.getResource("Product Images/Health/weights.JPG"))));
		Health.add(new ProductShell("Body-Solid EXM3000LPS Light Commercial Gym",
				"<html><center>Home gym offers impressive array of strength training exercises for up to three simultaneous users, in compact, space-saving design. <br> Multi-function Press Arm Station provides bench press, incline press, shoulder press, and chest-supported mid-row exercises; <br> fully-adjustable Perfect Pec Station with range limiters allows users to achieve deeper muscle penetration.</center></html>",
				2485, new ImageIcon(Main.class.getResource("Product Images/Health/gym.JPG"))));
		Health.add(new ProductShell("Rhino Full Outdoor Basketball Court",
				"<html><center>Rhino Sports provides the best surface available for playing the greatest game ever invented! <br> If you're looking for a state-of-the-art surface for a basketball court, Rhino Sports has it. <br>Whether it's for your backyard, an indoor court or a neighborhood park, we can design a fully customized court to fit your needs and color scheme.</center></html>",
				25000, new ImageIcon(Main.class.getResource("Product Images/Health/bball.JPG"))));
		Health.add(new ProductShell(
				"FORTRESS Trapezoid Baseball Batting Cage [Complete Package] - Softball Hitting Cage Net",
				"<html><center>The incredible FORTRESS trapezoid baseball batting cage! Available in 35ft, 55ft and 70ft. Made from black coated galvanized steel and package includes heavy duty corner connectors. <br> Net hanging inside frame to prevent rebounding baseballs. <br> Width of 10ft and height of 10ft for all 3 sizes. Can be used on grass or hard surfaces like concrete. The perfect complete cage package for backyards or indoor facilities.</center></html>",
				1099, new ImageIcon(Main.class.getResource("Product Images/Health/batcage.JPG"))));

		Outdoors.add(new ProductShell("S-Works + McLaren Venge Bicycle",
				"<html><center>The S-Works + McLaren Venge Bicycle uses its technological advantage to lessen the stiffness of an already lightweight carbon-fiber rocket. This directly translates to speed.</center></html>",
				18000, new ImageIcon(Main.class.getResource("Product Images/Outdoors/bike.JPG"))));
		Outdoors.add(new ProductShell("K750GB Wood-fired Built-in Grill",
				"<html><center>Elevate your grilling to a higher level with the new Gaucho Grill by Kalamazoo Outdoor Gourmet. <br> Inspired by traditional Argentinian wood-fired grilling, the Gaucho allows you to create amazing flavors with a live fire. <br> The 30-inch spoked wheel effortlessly raises and lowers the grill grates and rotisserie, allowing you to control heat intensity by adjusting the proximity of food to flame.</center></html>",
				19995, new ImageIcon(Main.class.getResource("Product Images/Outdoors/grill.JPG"))));
		Outdoors.add(new ProductShell("Petra Candle Torch by Porta Forma",
				"<html><center>The Petra Candle Torch is composed of bound teak planks that assemble in linear proclamation. <br> Cone-shaped stainless steel cradles an illuminating candle.</center></html>",
				499, new ImageIcon(Main.class.getResource("Product Images/Outdoors/sofa.JPG"))));
		Outdoors.add(new ProductShell("Hershyway Days Ends Sofa Style Rope Daybed Swing",
				"<html><center>Hand crafted by Amish craftmen with luxurious cypress wood and coated with gorgeous water resistant white paint. <br> Cypress is a very durable outdoor wood, and the Hershyway Swing will last a lifetime. <br> It includes a supreme rope that is smooth to the touch and can hold up to 500 pounds of weight. <br> The pillows and cushions are sold separately.</center></html>",
				1899, new ImageIcon(Main.class.getResource("Product Images/Outdoors/swing.JPG"))));
		Outdoors.add(new ProductShell("Tuscan 11 Piece Outdoor Wicker Patio Furniture Set 11b 2 for 1 Cover Set",
				"<html><center>Custom hand woven all-weather, high density, PE (polyethylene) wicker; strong rust resistant; <br> powder coated aluminum frame for maximum durability; commercial grade construction; <br> no sag solid wicker bottoms with extra flexible strapping providing long-lasting suspension; <br> perfect for outdoor use in all climates. </center></html>",
				6285, new ImageIcon(Main.class.getResource("Product Images/Outdoors/torch.JPG"))));

		Clothing.add(new ProductShell("Gucci Washed T-shirt with Donald Duck",
				"<html><center>Donald Duck makes an appearance on several of the Spring Summer 2017 looks. <br> This t-shirt has an embroidered appliqué featuring the cartoon character's face framed <br> with Gucci print and a reference to the Greco-Egyptian deity Serapis. <br> Made in washed cotton jersey with small holes in the fabric for a vintage effect. </center></html>",
				570, new ImageIcon(Main.class.getResource("Product Images/Clothing/gucci.JPG"))));
		Clothing.add(new ProductShell("Chanel Goatskin Silver Heeled Sandals",
				"<html><center>These elegant sandals, perfect for a formal or casual occasion, are handmade with the finest goatskin. </center></html>",
				1100, new ImageIcon(Main.class.getResource("Product Images/Clothing/chanelshoe.JPG"))));
		Clothing.add(new ProductShell("Louis Vuitton Mens Messenger PM",
				"<html><center>A perfect city bag, the Messenger PM Explorer’s beautiful leather details enhance the new Monogram Eclipse canvas. <br> The suppleness of the strap combined with the lightweight canvas make the bag very comfortable to wear. <br> Secured thanks to the buckle fastener.</center></html>",
				2340, new ImageIcon(Main.class.getResource("Product Images/Clothing/handbag.JPG"))));
		Clothing.add(new ProductShell("Balenciaga Women’s Windbreaker",
				"<html><center>Windbreaker coat featured in the SS17 Runway Show. This sophisticated  yet versatile jacket is made in Italy with elastic cuffs and an iconic chain at the collar</center></html>",
				1395, new ImageIcon(Main.class.getResource("Product Images/Clothing/windbreaker.JPG"))));
		Clothing.add(new ProductShell("Giorgio Armani Wall Street Line Dinner Suit in Wool and Cashmere",
				"<html><center>Refined dinner suit from the Trader Blu line in solid wool and cashmere with classic smooth satin details. <br> The soft fit piece features a single-breasted jacket with two covered buttons, <br> notched lapels, straight shoulders and no vents. <br> Flat front trousers with 22 cm cuff width.</center></html>",
				4495, new ImageIcon(Main.class.getResource("Product Images/Clothing/armani.JPG"))));
		Clothing.add(new ProductShell("Burberry Unisex Tropical Gabardine Car Coat with Exaggerated Cuffs",
				"<html><center>A unisex car coat crafted in England from new lightweight tropical gabardine, with exaggerated details. <br>The tonic-coloured cotton twill is woven for weatherproof protection at the Burberry mill, <br> and tumbled and washed to imbue softness and fluidity. <br> Complementing the supple drape of the cloth, it is cut for a relaxed fit with minimal lining. </center></html>",
				1795, new ImageIcon(Main.class.getResource("Product Images/Clothing/jacket.JPG"))));
		Clothing.add(new ProductShell("Ferragamo Gancini Print Swim Trunk",
				"<html><center>Gancini print swim trunk features elastic waist and drawstring closure in 100% nylon.</center></html>",
				320, new ImageIcon(Main.class.getResource("Product Images/Clothing/ferragamo.JPG"))));
		Clothing.add(new ProductShell("Dolce and Gabbana Cotton Tailcoat With Bejewelled Applique and Embroidery",
				"<html><center>Double-breasted tailcoat-style jacket in cotton embellished by bejeweled appliqué <br> and embroidery that has been beautifully hand-applied, making this piece utterly exquisite and unique</center></html>",
				13500, new ImageIcon(Main.class.getResource("Product Images/Clothing/dolce.JPG"))));
		Clothing.add(new ProductShell("Givenchy Star-Appliquéd Cotton Sweater",
				"<html><center>Givenchy's red stockinette-stitched cotton crewneck sweater is appliquéd with grey and black star embroidered patches.</center></html>",
				745, new ImageIcon(Main.class.getResource("Product Images/Clothing/givenchy.JPG"))));
		Clothing.add(new ProductShell("Prada Sandal",
				"<html><center>Shiny calf leather double band slip-on sandal,leather insole, Two-tone micro, and cord wedge heel</center></html>",
				920, new ImageIcon(Main.class.getResource("Product Images/Clothing/shoe.JPG"))));

		Entertainment.add(new ProductShell("Klipsch Gallery G-16 7.1 Home Theater",
				"<html><center>Designed to complement the thinnest flat-panel televisions, <br> the Klipsch® Gallery™ G-16 LCRS delivers pure performance and power that leaves you yearning for more. <br> Most importantly, it can be configured as a left, right, center or surround speaker.</center></html>",
				2500, new ImageIcon(Main.class.getResource("Product Images/Entertainment/sound.JPG"))));
		Entertainment.add(new ProductShell("Allen & Heath 24-Channel Sound Recording System",
				"<html><center>Studio recording mixer with 24 mic/line input pre-amps and motorized faders; <br> 24 channels of 4 band EQ with fully parametric mids; 2 dual stereo inputs with EQ, 2 additional valve inputs; <br> 6 auxes, 4 subgroups, main stereo plus Mono bus; PFL, AFL plus Solo in Place </center></html>",
				10000, new ImageIcon(Main.class.getResource("Product Images/Entertainment/mixer.JPG"))));
		Entertainment.add(new ProductShell("Bob Dylan Hand-Signed Series Harmonicas",
				"<html><center>Played and Hand Signed by Bob Dylan. Set of 7 Hohner Marine Band Harmonicas. <br> Comes with an attractive presentation case. Keys of A, B, C, D, E, F and G. <br> Made in Germany. </center></html>",
				25000, new ImageIcon(Main.class.getResource("Product Images/Entertainment/harmonica.JPG"))));
		Entertainment.add(new ProductShell("Gibson Custom Electric Guitar",
				"<html><center>Designed to benefit all musicians, crisp bright tone, natural.</center></html>", 26500,
				new ImageIcon(Main.class.getResource("Product Images/Entertainment/guitar.JPG"))));
		Entertainment.add(new ProductShell("Titiana’s Palace",
				"<html><center>Eat your heart out, Barbie. Your Dream House is cute and all, but it’s nothing compared to Titiana's Palace. <br> Begun in 1907 and finished in 1922 by British painter Sir Nevile Wilkinson, <br> it contains 18 rooms and 3000 separate pieces of miniature art, <br> including tiny mahogany furniture.</center></html>",
				256500, new ImageIcon(Main.class.getResource("Product Images/Entertainment/dollhouse.JPG"))));

		Food.add(new ProductShell("Annie's Homegrown Shells & White Cheddar Macaroni & Cheese 6-Ounce",
				"<html><center>Vegetarian product, zero grams trans fat, good source of protein, <br> ships in Certified Frustration-Free Packaging, <br> made with real white cheddar cheese </center></html>",
				3500, new ImageIcon(Main.class.getResource("Product Images/Food/mac.JPG"))));
		Food.add(new ProductShell("Fortress Stilt Fisherman Indulgence Dessert",
				"<html><center>This strangely-named dessert is from Sri Lanka, and can only be found at The Fortress’ Wine restaurant. <br> It’s described as “a gold leaf Italian cassata”, which is a traditional round sponge cake. <br> This particular cake is flavored with Irish cream that’s been infused with fruit.</center></html>",
				14500, new ImageIcon(Main.class.getResource("Product Images/Food/flower.JPG"))));
		Food.add(new ProductShell("English Wagyu Beef Pie",
				"<html><center>The world’s fanciest steak and mushroom pie is stuffed with Wagyu beef (about $1,000 worth),<br> matsutake mushrooms, black truffles, gold leaf, <br> and $8,400 in 1982 Chateau Mouton Rothschild red wine, <br> which is only two bottles.</center></html>",
				15900, new ImageIcon(Main.class.getResource("Product Images/Food/pie.JPG"))));
		Food.add(new ProductShell("Fabergé Chocolate Pudding",
				"<html><center>For just $34,500 you could get your hands on a very fancy chocolate pudding created by Marc Guibert, <br> the head chef of the Lindeth Howe Country House Hotel. <br> Made of four varieties of Belgian chocolate and flavored with peach, orange and whiskey, <br> it also includes the requisite edible gold leaf and some champagne caviar. </center></html>",
				34500, new ImageIcon(Main.class.getResource("Product Images/Food/cake.JPG"))));
		Food.add(new ProductShell("Almas Caviar 2lbs ",
				"<html><center>This isn’t any ordinary caviar. Harvested from rare albino beluga sturgeon, <br> ‘Almas’ is an almost pearl white in color and possesses a spongy texture. <br> The fish that this roe is harvested from are between 60 and 100 years old, <br> and can weigh upwards of 2,000 lbs. <br> It’s usually sold in a gold container. </center></html>",
				34500, new ImageIcon(Main.class.getResource("Product Images/Food/caviar.JPG"))));
		// needs 1 desc
		Furniture.add(new ProductShell("Cleopatra Classic Heated Lounge Chair in Limestone",
				"<html><center>The Cleopatra Classic Heated Lounge Chair is easily the most comfortable chair you will ever sit in. <br> The limestone glides across the curvature of the chair for <br> an elegant look of luxury in addition to premium comfort. </center></html>",
				14650, new ImageIcon(Main.class.getResource("Product Images/Furniture/chair.jpg"))));
		Furniture.add(new ProductShell("Solid Gold Stool",
				"<html><center>Sold by a jewelry store in China’s Jiangsu province, <br> this expensive stool is made of 110 lbs of solid gold and is priced at $1.3 million. <br> Unfortunately, that’s about all we know about it.</center></html>",
				1300000, new ImageIcon(Main.class.getResource("Product Images/Furniture/stool.JPG"))));
		Furniture.add(new ProductShell("Ruijssenaars Magnetic Floating Bed",
				"<html><center>Ruijssenaars reportedly worked on the technology <br> for this expensive bed for six years in collaboration with Bakker Magnetics. Permanent opposing industrial-strength magnets <br> allow the bed to float around 40cm off the floor and can hold 900kg. </center></html>",
				1600000, new ImageIcon(Main.class.getResource("Product Images/Furniture/bed.JPG"))));
		Furniture.add(new ProductShell("Galvin Three-Piece Sectional Sofa",
				"<html><center>Hardwood frame. Upholstered in polyester/cotton and cotton/acrylic/nylon. <br> Includes six 27\"Sq. throw pillows with 2\" diamond quilting and two 18\"Sq. striped throw pillows. <br> Comfort-down seat cushions. 170\"W x 26\"T. Chaise, 93\"D; <br> armless section, 48\"D. Seat, 17\"T. <br> Handcrafted in the USA. Boxed weight, approximately 450 lbs. </center></html>",
				12499, new ImageIcon(Main.class.getResource("Product Images/Furniture/couch.JPG"))));
		Furniture.add(new ProductShell("Queen Victoria’s Jubilee Billiard Table",
				"<html><center>The billiard table is beautifully carved in high relief with references to the industrial growth <br> and cultural variety encompassed by the 50 years of Queen Victoria’s reign. <br> The cushions are decorated with ribbons of quotations from Shakespeare and Tennyson, <br> while above each leg are portrait figures of <br> William of Normandy, Henry I, Henry II, John, among others. </center></html>",
				1500000, new ImageIcon(Main.class.getResource("Product Images/Furniture/table.JPG"))));
		// needs 2 descs
		Technology.add(new ProductShell("The Harry Winston Opus 12 Watch",
				"<html><center>Who said a watch needs to be digital to have an unorthodox interface? <br> The Harry Winston Opus 12 Watch is an exercise in high-end watch wizardry, <br> built around 12 pairs of hands that point towards the center <br> and rotate in place to turn blue when they're telling the time. </center></html>",
				260000, new ImageIcon(Main.class.getResource("Product Images/Tech/watch.JPG"))));
		Technology.add(new ProductShell("The Kohler Numi Toilet System",
				"<html><center>The Numi toilet combines unmatched design, technology and engineering <br> to bring you the finest in personal comfort and cleansing. <br> From its striking form and features to its unrivaled water efficiency, <br> the Numi toilet marks a new standard of excellence in the bathroom.</center></html>",
				6400, new ImageIcon(Main.class.getResource("Product Images/Tech/toilet.JPG"))));
		Technology.add(new ProductShell("Advent Gold iPhone 7 case by Gray",
				"<html><center>Using an advanced Titanium Nitride Coat which is traditionally used to <br> harden machining tools to improve the precision and accuracy of the final product, <br> the Advent is transformed into an object with a 24K Gold luster <br> while remaining extremely durable to daily wear and tear. </center></html>",
				1000, new ImageIcon(Main.class.getResource("Product Images/Tech/case.JPG"))));
		Technology.add(new ProductShell("Luvaglio One Million Dollar Laptop",
				"<html><center> UK-based Luvaglio has manufactured the first million dollar laptop <br> incorporated a 17 inch LED lit screen with a anti-reflective glare coating for brighter image, <br> 128GB of disk space, <br> infrequent colored diamond and stone encrusted in it. </center></html>.",
				1000000, new ImageIcon(Main.class.getResource("Product Images/Tech/computer.JPG"))));
		Technology.add(new ProductShell("Acapella Sphaeron Excalibur",
				"<html><center> Unique doesn’t begin to describe these handmade speakers. <br> They feature four distinctive horn speakers, eight subwoofers, <br> and a modern art design that is sure to <br> impress style-focused listeners. </center></html>",
				455000, new ImageIcon(Main.class.getResource("Product Images/Tech/speaker.JPG"))));

		// call the home page
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				HomePage.runGUI();
			}
		});
	}

	public static ArrayList<ProductShell> getData(String dep) {
		switch (dep) {
		case "Cars":
			return Cars;
		case "Health":
			return Health;
		case "Outdoors":
			return Outdoors;
		case "Clothing":
			return Clothing;
		case "Entertainment":
			return Entertainment;
		case "Food":
			return Food;
		case "Furniture":
			return Furniture;
		case "Technology":
			return Technology;
		}

		return null;
	}
}
