package com.taller2pd.moisscnti_00054123.data

val Restaurantes = listOf(
    Restaurant(
        id = 1,
        name = "Pizzería Napoli",
        description = "Auténtica pizza al estilo napolitano.",
        image = "https://images.pexels.com/photos/4109120/pexels-photo-4109120.jpeg",
        categories = listOf("Pizza", "Italiana"),
        menu = listOf(
            Dish("Pizza Margherita", 8.5, "Con albahaca fresca y mozzarella.", "https://images.pexels.com/photos/1435907/pexels-photo-1435907.jpeg"),
            Dish("Pizza Pepperoni", 9.0, "Clásica con pepperoni crujiente.", "https://images.pexels.com/photos/1653877/pexels-photo-1653877.jpeg"),
            Dish("Lasaña", 11.5, "Con carne y bechamel.", "https://images.pexels.com/photos/2233729/pexels-photo-2233729.jpeg"),
            Dish("Tiramisú", 4.5, "Postre tradicional italiano.", "https://images.pexels.com/photos/704569/pexels-photo-704569.jpeg")
        )
    ),
    Restaurant(
        id = 2,
        name = "Tokyo Ramen",
        description = "Sabores auténticos de Japón.",
        image = "https://images.pexels.com/photos/376464/pexels-photo-376464.jpeg",
        categories = listOf("Asiatica", "Bebida"),
        menu = listOf(
            Dish("Ramen Tonkotsu", 12.0, "Con caldo de cerdo.", "https://images.pexels.com/photos/376464/pexels-photo-376464.jpeg"),
            Dish("Sushi variado", 14.0, "6 piezas variadas.", "https://images.pexels.com/photos/3577561/pexels-photo-3577561.jpeg"),
            Dish("Tempura", 9.0, "Verduras y camarones fritos.", "https://images.pexels.com/photos/70497/pexels-photo-70497.jpeg"),
            Dish("Té verde frío", 3.0, "Refrescante y saludable.", "https://images.pexels.com/photos/5946627/pexels-photo-5946627.jpeg")
        )
    ),
    Restaurant(
        id = 3,
        name = "Burgers & Co",
        description = "Las mejores hamburguesas artesanales.",
        image = "https://images.pexels.com/photos/2983101/pexels-photo-2983101.jpeg",
        categories = listOf("Hamburgesa", "Bebida"),
        menu = listOf(
            Dish("Cheeseburger", 8.0, "Con doble queso y carne jugosa.", "https://images.pexels.com/photos/2983101/pexels-photo-2983101.jpeg"),
            Dish("Burger BBQ", 9.5, "Con salsa barbacoa y aros de cebolla.", "https://images.pexels.com/photos/1615195/pexels-photo-1615195.jpeg"),
            Dish("Fries con cheddar", 3.5, "Papas fritas con queso derretido.", "https://images.pexels.com/photos/1583884/pexels-photo-1583884.jpeg"),
            Dish("Limonada casera", 2.5, "Refrescante y natural.", "https://images.pexels.com/photos/5946627/pexels-photo-5946627.jpeg")
        )
    ),
    Restaurant(
        id = 4,
        name = "Dolce Tentazione",
        description = "Postres que enamoran.",
        image = "https://images.pexels.com/photos/302680/pexels-photo-302680.jpeg",
        categories = listOf("Postre"),
        menu = listOf(
            Dish("Cheesecake frutos rojos", 4.75, "Con mermelada casera.", "https://images.pexels.com/photos/302680/pexels-photo-302680.jpeg"),
            Dish("Brownie con helado", 5.0, "Caliente con bola de vainilla.", "https://images.pexels.com/photos/461198/pexels-photo-461198.jpeg"),
            Dish("Torta de chocolate", 4.5, "Extra esponjosa y húmeda.", "https://images.pexels.com/photos/1410235/pexels-photo-1410235.jpeg"),
            Dish("Malteada Oreo", 3.5, "Cremosa y deliciosa.", "https://images.pexels.com/photos/374885/pexels-photo-374885.jpeg")
        )
    ),
    Restaurant(
        id = 5,
        name = "Trattoria Roma",
        description = "Tradición italiana en cada plato.",
        image = "https://images.pexels.com/photos/1307698/pexels-photo-1307698.jpeg",
        categories = listOf("Italiana"),
        menu = listOf(
            Dish("Fettuccine Alfredo", 10.0, "Salsa cremosa con parmesano.", "https://images.pexels.com/photos/1437267/pexels-photo-1437267.jpeg"),
            Dish("Pasta carbonara", 10.5, "Con huevo, queso y panceta.", "https://images.pexels.com/photos/1437267/pexels-photo-1437267.jpeg"),
            Dish("Bruschettas", 5.0, "Pan tostado con tomate.", "https://images.pexels.com/photos/1211887/pexels-photo-1211887.jpeg"),
            Dish("Espresso italiano", 2.0, "Fuerte y corto.", "https://images.pexels.com/photos/302901/pexels-photo-302901.jpeg")
        )
    ),
    Restaurant(
        id = 6,
        name = "Asia Fusion",
        description = "Sabores de Tailandia, China y Corea.",
        image = "https://images.pexels.com/photos/1640777/pexels-photo-1640777.jpeg",
        categories = listOf("Asiatica", "Postre"),
        menu = listOf(
            Dish("Pad Thai", 9.5, "Fideos de arroz con camarones.", "https://images.pexels.com/photos/1640777/pexels-photo-1640777.jpeg"),
            Dish("Gyozas", 6.0, "Empanadillas japonesas.", "https://images.pexels.com/photos/3575733/pexels-photo-3575733.jpeg"),
            Dish("Pollo agridulce", 8.5, "Crujiente y sabroso.", "https://images.pexels.com/photos/3577561/pexels-photo-3577561.jpeg"),
            Dish("Helado de té matcha", 4.0, "Fresco y cremoso.", "https://images.pexels.com/photos/302680/pexels-photo-302680.jpeg")
        )
    ),
    Restaurant(
        id = 7,
        name = "Pizza GO!",
        description = "Pizzas listas para llevar en minutos.",
        image = "https://images.pexels.com/photos/4109120/pexels-photo-4109120.jpeg",
        categories = listOf("Pizza", "Bebida"),
        menu = listOf(
            Dish("Pizza BBQ", 10.99, "Pollo, salsa barbacoa y cebolla morada.", "https://images.pexels.com/photos/4109120/pexels-photo-4109120.jpeg"),
            Dish("Pizza de champiñones", 9.5, "Mozzarella, champiñones y albahaca.", "https://images.pexels.com/photos/4109134/pexels-photo-4109134.jpeg"),
            Dish("Pizza extra queso", 11.25, "Para los amantes del queso.", "https://images.pexels.com/photos/1435907/pexels-photo-1435907.jpeg"),
            Dish("Soda Italiana", 2.5, "Refresco artesanal con frutas.", "https://images.pexels.com/photos/5946627/pexels-photo-5946627.jpeg")
        )
    ),
    Restaurant(
        id = 8,
        name = "La Hamburguesía",
        description = "Sabores clásicos con un giro moderno.",
        image = "https://images.pexels.com/photos/2983101/pexels-photo-2983101.jpeg",
        categories = listOf("Hamburgesa", "Bebida"),
        menu = listOf(
            Dish("Hamburguesa Americana", 9.5, "Con tocino, queso cheddar y salsa secreta.", "https://images.pexels.com/photos/2983101/pexels-photo-2983101.jpeg"),
            Dish("Hamburguesa Mexicana", 10.0, "Guacamole, jalapeños y carne jugosa.", "https://images.pexels.com/photos/3756523/pexels-photo-3756523.jpeg"),
            Dish("Papas con cheddar", 4.0, "Papas fritas con queso fundido.", "https://images.pexels.com/photos/1583884/pexels-photo-1583884.jpeg"),
            Dish("Refresco artesanal", 2.5, "Sabor natural de frutas cítricas.", "https://images.pexels.com/photos/5946627/pexels-photo-5946627.jpeg")
        )
    ),
    Restaurant(
        id = 9,
        name = "Gelato & Dolce",
        description = "El paraíso para los amantes del postre.",
        image = "https://images.pexels.com/photos/302680/pexels-photo-302680.jpeg",
        categories = listOf("Postre", "Italiana"),
        menu = listOf(
            Dish("Gelato de pistacho", 4.75, "Helado cremoso al estilo italiano.", "https://images.pexels.com/photos/302680/pexels-photo-302680.jpeg"),
            Dish("Cannoli", 3.99, "Rellenos de ricotta dulce y chips de chocolate.", "https://images.pexels.com/photos/302680/pexels-photo-302680.jpeg"),
            Dish("Panacotta", 5.25, "Con frutos del bosque y vainilla.", "https://images.pexels.com/photos/302680/pexels-photo-302680.jpeg"),
            Dish("Capuccino italiano", 3.0, "Perfectamente espumoso y equilibrado.", "https://images.pexels.com/photos/302680/pexels-photo-302680.jpeg")
        )
    )
    // Puedes continuar desde aquí para completar hasta el id 20
)
