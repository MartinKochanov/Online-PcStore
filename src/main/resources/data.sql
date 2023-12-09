insert into roles(id, role_name)
values (1, 'ADMIN'),
       (2, 'USER');

insert into users()
values (1, false, 'martin_kochanov@gmail.com', 'Martin', 'Kochanov',
        '6dfada09ce17f65a5cdd61c91f6248ad8d9d25eeaf6548d4f4bd5fafe6f1a40d86abfb5a9db2a04cbafe1de5d8d596ab',
        'MartinKochanovAdmin', 1),
       (2, false, 'martin_kochanov@abv.bg', 'Martin', 'Kochanov',
        '6dfada09ce17f65a5cdd61c91f6248ad8d9d25eeaf6548d4f4bd5fafe6f1a40d86abfb5a9db2a04cbafe1de5d8d596ab',
        'MartinKochanovUser', 2);


insert into specifications(id, case_type, fans, format, weight)
values (1, 'MINI_TOWER', 6, 'MINI_ITX', 8),
       (2, 'MID_TOWER', 8, 'ATX', 8),
       (3, 'MID_TOWER', 7, 'ATX', 7),
       (4, 'MID_TOWER', 14, 'ATX', 7),
       (5, 'MINI_TOWER', 18, 'MICRO_ATX', 9.3),
       (6, 'MID_TOWER', 6, 'MINI_ITX', 6),
       (7, 'FULL_TOWER', 13, 'MINI_ITX', 19.2),
       (8, 'MID_TOWER', 10, 'MICRO_ATX', 7.8),
       (9, 'MID_TOWER', 7, 'MINI_ITX', 7);

insert into products(id, description, image, manufacturer, model, price, type_product, uuid, specifications_id)
values (1, 'The black Corsair 4000D AIRFLOW Tempered Glass is a characteristic housing with exceptional cooling. The durable and solid steel front panel,
           equipped with a modern front I/O panel including a USB-C port and the special ventilation channels together offer a great appearance and airflow, which combined with
           ,the two included 120 mm AirGuide fans, the cooling improve. The housing also offers sufficient space for additional cooling, such as additional 120 mm or 140 mm fans or radiators up to 360 mm and four
           storage spaces for storage. In addition, the CORSAIR RapidRoute
           cable management system makes it possible to route important cables effortlessly
           through a single channel, so that the characteristic appearance of the enclosure is always maintained.',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\cases\\4000X.png'),
        'CORSAIR', '4000D AIRFLOW', 79.90, 'CASE', '7bd79a09-6573-48a9-bc67-6ca70e13fca0', 1),


       (2,
        'High-performance mid tower case with a stylish RGB LED design and acrylic in the front panel. Comes with a full tempered glass side panel to showcase the inside of your rig. Air vents on the sides of the front panel provide superior air flow and ventilation.',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\cases\\AerocoolShard.png'),
        'AEROCOOL', 'Shard Tempered Glass', 74.95, 'CASE', 'd3d0827e-092e-492c-ade4-d1c925d2845a', 2),


       (3,
        'The CORSAIR 3000D AIRFLOW presents a mid-tower ATX chassis with an efficient high-airflow design, including two pre-fitted CORSAIR SP120 ELITE fans that provide exceptional airflow.',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\cases\\Corsair3000D.png'),
        'CORSAIR', '3000D AIRFLOW', 79.99, 'CASE', '0ad46d75-1670-4b92-88a6-9a7db59d2dc1', 3),

       (4,
        'The CORSAIR 680X RGB from the Crystal Series is a dual-chamber tempered glass ATX smart case with extraordinary airflow and brilliant RGB lighting to efficiently cool and illuminate the most demanding systems.'
           , LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\cases\\Crystal680X.png'),
        'CORSAIR', 'Crystal 680X Bianco', 258.86, 'CASE', '7c5d3561-ed2b-4d50-bba5-5f779f6e9fa8', 4),

       (5, 'High-performance mid tower case with a stylish RGB LED design and tempered glass in the front panel. Comes with a full tempered glass side panel to showcase the inside of your rig.
Bring your case to life with 13 lighting modes: 6 RGB flow and 7 static color modes. Conveniently located LED control switch allows you to adjust your lighting effects to suit your unique style and mood.'
           , LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\cases\\PLAYA.png'),
        'AEROCOOL', 'Playa', 82.30, 'CASE', '1fe3db1a-1de2-4ff4-ac77-e5f198d78107', 5),
       (6, 'Control your Addressable RGB using compatible ARGB motherboards including ASUS Aura Sync, MSI Mystic Light Sync, and Gigabyte RGB Fusion (with 5V 3-Pin ARGB header).
Addressable RGB can be controlled using any of two ways:
LED control button or ARGB motherboard.'
           , LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\cases\\Skribble.png'),
        'AEROCOOL', 'Skribble-G-BK-v1', 82.30, 'CASE', '41935305-95d6-494c-a376-26c8ec7816e6', 6),
       (7,
        'AORUS C700 GLASS, the flagship full-tower gaming case, impresses gamers with our spirit and image of fearlessness. With the aluminum metal design, the tempered glass panels in black on both sides perfectly embody and intertwine the top-tier quality and aesthetics. The case features an inner ultra-expansion structure, gamers can showcase all of the AORUS components while making it the most eye-catching e-Sports artwork.'
           , LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\cases\\AORUS.png'),
        'GIGABYTE', 'AORUS C700 GLASS', 525.30, 'CASE', 'fc75717d-cae3-42ad-8851-d781ebb10890', 7),
       (8,
        'Optimized Airflow Design RGB Fusion with ARGB Connector Hub Support Motherboards up to E-ATX Up to 360mm Liquid Cooling Compatible
Support Vertical GPU Installation Full-Size Tempered Glass Side Panel With USB 3.0 x2 and USB 3.1 Type-C x1 on I/O panel Pre-installed 4 ARGB fans'
           , LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\cases\\C301.png'),
        'GIGABYTE', 'C301', 300.50, 'CASE', 'dd466c85-3a09-4075-8482-71807d403893', 8),
       (9,
        'Equipped with an upgraded I/O panel, you have access to LED control, audio ports and three USB ports including USB Type-C (Support Motherboard USB 3.1 Type-C Front Panel Connector). Compliance with AORUS VR Link connectivity, the I/O panel has also been optimized by introducing a HDMI port for a convenient VR connection'
           , LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\cases\\AC300W.png'),
        'GIGABYTE', 'AC300W', 200.49, 'CASE', '389c4c83-f73c-415d-a195-ada306e8228f', 9);

insert into specifications(id, cpu_socket, format, memory_slots, max_memory, memory_type, graphic_card_slot)
values (10, 'LGA1700', 'ATX', 4, 64, 'DDR5', 'PCIe4'),
       (11, 'LGA1700', 'ATX', 4, 32, 'DDR5', 'PCIe4'),
       (12, 'AM4', 'MICRO_ATX', 4, 128, 'DDR4', 'PCIe8'),
       (13, 'AM5', 'ATX', 4, 192, 'DDR5', 'PCIe8'),
       (14, 'LGA1200', 'ATX', 9, 128, 'DDR4', 'PCIe16'),
       (15, 'LGA1151', 'ATX', 4, 64, 'DDR4', 'PCIe8'),
       (16, 'AM5', 'ATX', 4, 192, 'DDR5', 'PCIe16'),
       (17, 'LGA1200', 'ATX', 4, 64, 'DDR5', 'PCIe4');

insert into products(id, description, image, manufacturer, model, price, type_product, uuid, specifications_id)
values (10,
        'Style and substance come together like never before in the feature-packed ROG Strix Z790-E II. From its vibrant multi-layered I/O shroud to its stacks of VRM cooling, it is a conversation piece that also delivers enhanced DDR5 performance, ample PCIe 5.0 slots and the DIY-friendly Q-Design feature set that makes building and upgrading a breeze.',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\motherboards\\ROG STRIX Z790-E.png'),
        'ASUS', 'ROG STRIX Z790-E', 200.90, 'MOTHERBOARD', 'f42d26d5-ba20-47eb-b948-622525ac6e74', 10),
       (11,
        'TUF GAMING Z790-PRO WIFI combines the latest Intel® processors with game-ready features and military-grade durability. With its premium power solution and comprehensive cooling system, this motherboard delivers rock-solid performance for marathon gaming. And it undergoes rigorous endurance testing to ensure reliability in challenging conditions. Meanwhile, a distinctive gray rubberized emblem adorns the VRM heatsink, celebrating the core essence of TUF GAMING vigor.',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\motherboards\\TUFGAMINGZ790.png'),
        'ASUS', 'TUF GAMING Z790-PRO', 168.90, 'MOTHERBOARD', '60d35b80-6802-408d-97ff-5d946e7af4d1', 11),
       (12, 'Comprehensive cooling: VRM heatsink, PCH heatsink, and Fan Xpert 2+ Ultrafast connectivity: M.2 support, 1 Gb Ethernet, and USB 3.2 Gen 2 Type-A 5X Protection III: Multiple hardware safeguards for all-around system protection
Aura Sync RGB Lighting: Onboard connector for RGB LED strips, easily synced with an ever-growing portfolio of Aura Sync-capable hardware',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\motherboards\\PRIMEB450M-A.png'),
        'ASUS', 'PRIME B450M-A II', 190.50, 'MOTHERBOARD', '244a77b6-8912-4166-8750-bca40c044fe2', 12),
       (13,
        'The MEG X670E GODLIKE is designed with a black and heavy heatsink which comes with dark mirror and time carving design in pale gold illuminating that symbolizes the timeless form and function as well as representing perfection in its purest form. Featuring the latest technology, high-speed transmission, ultra-performance, and Industry''s first M-Vision Dashboard, the MEG X670E GODLIKE is developed to unleash the extreme gaming potential of the AMD X670 chipset and is ready to rule the tournament once again.',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\motherboards\\GODLIKE.png'),
        'MSI', 'MEG X670E GODLIKE', 300.00, 'MOTHERBOARD', 'b25b5b16-3159-4af3-8d07-0449924996d0', 13),
       (14,
        'The MPG series brings out the best in gamers by allowing full expression in color with advanced RGB lighting control and synchronization. Experiment on another level of personalization with a front LED strip that provides convenient in-game and real time notifications. With the MPG series, transform your equipment into the center of attention and top leaderboards in style.',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\motherboards\\MEGX670E.png'),
        'MSI', 'MEG X670E GODLIKE', 350.00, 'MOTHERBOARD', '9987e99c-1adb-4261-8256-3b49ed58c91e', 14),
       (15, 'Supports DDR4 Memory, up to 2666 MHz Intel Gaming LAN: Premium network solution from Intel® for professional and multimedia use. Delivers a secure, stable and fast network connection. Pre-installed I/O Shielding: Better EMI protection and more convenience for installation. Set Core Power Free: Extended Heatsink Design, Core Boost, DDR4 Boost
Turbo M.2: Running at PCI-E Gen3 x4 maximizes performance for NVMe based SSDs. Mystic Light Extension: Control both RGB and RAINBOW strips with independent LEDs added to your system with Mystic Light APP and mobile device',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\motherboards\\MAGB365M.png'),
        'MSI', 'MAG B365M', 220.40, 'MOTHERBOARD', '3e4f8593-52a0-45a7-83aa-958adec4e30d', 15),
       (16, 'Supports DDR4 Memory, up to 2666 MHz Intel Gaming LAN: Premium network solution from Intel® for professional and multimedia use. Delivers a secure, stable and fast network connection. Pre-installed I/O Shielding: Better EMI protection and more convenience for installation. Set Core Power Free: Extended Heatsink Design, Core Boost, DDR4 Boost
Turbo M.2: Running at PCI-E Gen3 x4 maximizes performance for NVMe based SSDs. Mystic Light Extension: Control both RGB and RAINBOW strips with independent LEDs added to your system with Mystic Light APP and mobile device',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\motherboards\\B650 Gaming X.png'),
        'GIGABYTE', 'B650 GAMING X', 180.40, 'MOTHERBOARD', '1ca84351-fd24-418c-bbb2-c4263eb4912c', 16),
       (17, 'Supports 11th/10th Gen Intel® Core™ Processors. Dual Channel Non-ECC Unbuffered DDR4, 2 DIMMs 8-Channel HD Audio with High Quality Audio Capacitors NVMe PCIe Gen3 x4 2280 M.2 Connector. GbE LAN with Bandwidth Management
Smart Fan 5 features Multiple Temperature Sensors and Hybrid Fan Headers with FAN STOP. GIGABYTE APP Center, Simple and Easy Use. Anti-Sulfur Resistors Design',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\motherboards\\H510M S2.png'),
        'GIGABYTE', 'H510M S2 V2', 180.40, 'MOTHERBOARD', 'a4298094-b704-484e-b9be-ff2676eaf349', 17);


insert into specifications(id, cpu_socket, cash_memory, frequency, boost, cores, threads)
values (18, 'LGA1700', 36, 3.0, 5.8, 24, 32),
       (19, 'LGA1200', 16, 3.5, 5.3, 8, 16),
       (20, 'LGA1200', 16, 2.5, 4.9, 8, 16),
       (21, 'AM5', 16, 4.2, 5.7, 16, 32),
       (22, 'AM5', 104, 4.2, 5.0, 8, 16);


insert into products(id, description, image, manufacturer, model, price, type_product, uuid, specifications_id)
values (18,
        'The 13900K has 24 cores, of which 16 E-cores and 8 P-cores. In addition, the 13900K has 32 threads, a maximum clock speed of 5.4GHz and a turbo speed of 5.8GHz. It has 68MB cache memory in total, spread over 32MB L2 cache and 36MB L3 cache.',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\cpu\\COREI9.png'),
        'INTEL', 'CORE I9 13900K', 629.00, 'CPU', '51c4d7c3-42f7-456b-98fc-ff4ffc0c98d5', 18),
       (19,
        'Part of the Core i9 lineup, using the Rocket Lake-S architecture with Socket 1200. Thanks to Intel Hyper-Threading the core-count is effectively doubled, to 16 threads. Core i9-11900KF has 16 MB of L3 cache and operates at 3.5 GHz by default, but can boost up to 5.3 GHz, depending on the workload.',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\cpu\\I911900KF.jpeg'),
        'INTEL', 'Core i9 11900KF', 284.00, 'CPU', 'b7bf109d-8d17-4a78-ac5f-e9fa3433d690', 19),
       (20,
        'Built using a 14nm process, this 11th generation desktop processor features a base clock frequency of 2.5 GHz and a 4.9 GHz Turbo Boost Max 3.0 frequency with 16MB of cache, eight cores, and sixteen threads for fast and reliable performance.',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\cpu\\1_Intel-Core-i7-11700F-processor.jpg'),
        'INTEL', 'Core i7 11700F', 239.00, 'CPU', '2be9a09a-6a82-49b5-9825-64cc8223bfc9', 20),
       (21,
        'The Ultimate Processor for Gaming, with AMD 3D V-Cache™ Technology for Even More Game Performance1
The 16-core processor that can do it all with incredible performance from AMD for the most demanding gamers and creators. Plus, enjoy the benefits of next-gen AMD 3D V-Cache™ technology for low latency and even more game performance.',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\cpu\\51jNS8epPeL-removebg-preview.png'),
        'AMD', 'Ryzen 9 7950X3D', 639.00, 'CPU', '4007adfc-8625-4a1f-9d84-ab9e9f9d046a', 21),
       (22,
        'ZEN 4 ARCHITECTURE the gold standard for gamers and designers Experience performance and energy efficiency with AMD Zen 4 architecture based on a 5nm thin film
CORE AND 16 THREADS the Ryzen 7 7800X3D offers excellent frequencies (Base 4.2 GHz / Boost 5.0 GHz) overclocking is of course possible since all cores are unblocked',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\cpu\\51HqC0rU9HL._AC_SL1500_-removebg-preview.png'),
        'AMD', 'Ryzen 9 7950X3D', 364.00, 'CPU', '564abf07-c963-4ea2-af70-426a795552f2', 22);


insert into specifications(id, cpu_socket, cooling_type)
values (23, 'LGA1700', 'AIR_COOLING'),
       (24, 'LGA1200', 'AIR_COOLING'),
       (25, 'AM5', 'AIR_COOLING');

insert into products(id, description, image, manufacturer, model, price, type_product, uuid, specifications_id)
values (23,
        'The CORSAIR iCUE H115i RGB ELITE Series CPU Coolers offer high-performance CPU cooling, integrated RGB lighting and a refined look, with CORSAIR AF ELITE Series PWM fans delivering powerful airflow and specialized cooling modes for quiet operation. With 16 separately controllable RGB LEDs on a modern pump head, the H115i RGB ELITE Series offers good cooling with the corresponding appearance. Powerful CORSAIR iCUE software lets you create vibrant lighting effects, monitor CPU and cooling temperatures, and adjust fan speeds. Zero RPM fan mode and variable pump speed modes provide precise noise level adjustment for quiet operation. With a thermally optimized copper heatsink and easy installation on the latest CPU brackets, the H115i RGB ELITE provides premium CPU cooling.',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\coolers\\cors.png'),
        'CORSAIR', ' iCUE H115i', 169.00, 'COOLER', 'f2b8e951-b547-4a61-b5ad-fc465343edce', 23),
       (24,
        'The CORSAIR H100x RGB ELITE CPU Water Cooler combines fantastic cooling with a refined look. It is equipped with two CORSAIR SP120 RGB ELITE Series PWM fans, which deliver powerful airflow with AirGuide technology. With a modern pump head design and beautiful RGB lighting effects, the H100x RGB ELITE offers great cooling performance and mesmerizing lighting. Control the lighting via a 5V ARGB connector, which is compatible with a wide range of motherboards, or use CORSAIR iCUE software (requires separately sold CORSAIR iCUE controller). With a thermally optimized copper heatsink and easy installation on the latest Intel and AMD processors, the H100x RGB ELITE turns on the lights while cooling your CPU',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\coolers\\Corsair_H100x_RGB_ELITE_waterkoeling__1909250_30-removebg-preview.png'),
        'CORSAIR', 'H100x RGB ELITE', 124.90, 'COOLER', 'ade1674e-7247-462c-a9b3-9ceb3b1ffc42', 24),
       (25,
        'Support 5V RGB sync enabled motherboards: - Sync with 5V RGB enabled motherboards from as US, ASROCK Gigabyte and MSI to customize lighting effect
Build-in ARGB LED: - 15 High lumen addressable LEDs with 16 8 million colors
High volume airflow Design: - 9 High air-flow Blade generate a large volume of air passing through the aluminum heatsink for steady air flow and cooling quality
Reliable hydraulic Bearing: - self-lubricated Bearing and friction-reduced substance lowers operation noise and enhance thermal efficiency',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\coolers\\71mgwKUMBIL._SL1500_-removebg-preview.png'),
        'THERMALTAKE', 'UX100', 20.90, 'COOLER', '4865b978-3fdb-4203-9f2f-175baa6fd169', 25);

insert into specifications(id, video_memory_type, graphic_card_slot, capacity, resolution)
values (26, 'GDDR4', 'PCIe8', 24, 'THANOS'),
       (27, 'GDDR6', 'PCIe16', 32, 'THANOS'),
       (28, 'GDDR6', 'PCIe4', 16, 'THANOS');


insert into products(id, description, image, manufacturer, model, price, type_product, uuid, specifications_id)
values (26,
        'TheGIGABYTEGeForce RTX 4090 Gaming OC 24G is equipped with a powerful graphics processor and ultra-fast GDDR6X graphics memory. The gaming graphics card is suitable for players with the highest demands on graphic quality and performance. Experience lifelike virtual worlds with ray tracing and ultra-high FPS gaming with the lowest latency.',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\gcards\\MSI_GeForce_RTX_4090_GAMING_X_TRIO_24G_grafische_kaart__1871121-removebg-preview.png'),
        'GIGABYTE', 'Ge Force RTX 4090', 2199.00, 'GRAPHIC_CARD', 'f2b8e951-b547-4a61-b5ad-fc465343edce', 26),
       (27,
        'Using high-performing GDDR6 memory, this GPU brings the potential to take on legendary scale projects, and build models that you never thought were possible on a single GPU. With the ability to load multiple, huge textures into the gigantic 32GB memory space, this GPU will politely laugh at projects that before made your previous GPU nervously sweat and shake. Leap into those projects knowing that this GPU is here to support, not let you down.',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\gcards\\51hj8BIPBJL._AC_UF1000_1000_QL80_-removebg-preview.png'),
        'AMD', 'Radeon Pro W6800', 2450.90, 'GRAPHIC_CARD', '4353ff8d-4cf4-43e1-9a40-05daeb46e802', 27),
       (28,
        'Operating on NVIDIA''s Lovelace architecture, the RTX 4060 supports up to 3072 CUDA cores, 96 texture mapping units, 48 ROPs, and 24 ray tracing acceleration cores. The RTX 4060 falls just short of the RTX 4070 in most respects because it is only an entry-level 1440p card and has fewer tensor cores, CUDA cores, and RAM.',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\gcards\\Graphics-card-406x320px-removebg-preview.png'),
        'NVIDIA', 'GeForce RTX 4060 Ti', 3000, 'GRAPHIC_CARD', '3727d19a-7e45-4cb7-948d-2f18fa8e0d9b', 28);

insert into specifications(id, memory_type, capacity)
values (29, 'DDR5', 32),
       (30, 'DDR5', 64),
       (31, 'DDR5', 16);

insert into products(id, description, image, manufacturer, model, price, type_product, uuid, specifications_id)
values (29,
        'The Kingston FURY KF556C40BBK4-128 is a kit consisting of four 32 GB DDR5-5600 memory modules (PC5-44800) from the Fury Beast series. The total capacity is 128 GB. The 288-pin modules support a latency of 40 at 5600 MHz and require a voltage of 1.25 volts. Intel''s XMP version 3.0 is supported.',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\ram\\Kingston_FURY_128_GB_DDR5_5600_Quad_Kit_werkgeheugen__1913966-removebg-preview.png'),
        'KINGSTON', 'FURY', 128, 'RAM', '143b73a2-326c-4eba-8dcf-9dfd78c04caf', 29),
       (30,
        'The Kingston FURY Beast RGB 64 GB DDR5-6000 RAM Kit consists of two 32 GB modules, for a total of 64 GB. The memory has a 288-pin connection with a voltage of 1.35V and a timing of 40-40-40. The Kingston FURY Beast RGB DDR5 series improves the performance of your system for gaming, video editing and rendering at high speeds. The FURY Beast RGB DDR5 series stays cool thanks to the stylish, flat heat conductor that is equipped with RGB lighting. The module also supports overclocking with Intel XMP 3.0 profiles.',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\ram\\Kingston_FURY_64_GB_DDR5_6000_Kit_werkgeheugen__1893214-removebg-preview (1).png'),
        'KINGSTON', 'FURY Beast', 145.90, 'RAM', '3d1c602f-7955-4222-8a3c-5ebb31dc3401', 30),
       (31,
        'The Kingston KF580C38RSAK2-32 is a kit consisting of 2x 16 GB DDR5-8000 (PC5-64000) memory modules from the Renegade RGB XMP series. The total capacity is 32 GB. The 288-pin module supports a latency of 38-48-48 at 8000 MHz and requires 1.45 volts. Intel''s XMP version 3.0 is supported.',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\ram\\Kingston_FURY_32_GB_DDR5_8000_RGB_Kit_werkgeheugen__100023654-removebg-preview.png'),
        'KINGSTON', 'KF580C38RSAK2-32', 190.50, 'RAM', '3f140bf8-a3df-4010-83d8-9ecefbf4b123', 31);

insert into specifications(id, rotation_speed)
values (32, 200),
       (33, 170),
       (34, 300);


insert into products(id, description, image, manufacturer, model, price, type_product, uuid, specifications_id)
values (32,
        'The Corsair LL120 RGB PWM fan combines excellent airflow with low noise levels and 16 radiant, independent RGB LEDs, divided between two separate lighting circuits surrounding the fan and hub. Pair this fan with an existing LL120 RGB kit or Corsair Lighting Node PRO to customize lighting in a wide range of vibrant effects and patterns. Using optimized 120mm fan blades and PWM control, you can adjust the fan speed from 600 RPM to 1500 RPM for precise sound and airflow adjustments. Made for anyone looking for excellent airflow, quiet operation and powerful lighting, the Corsair LL120 RGB fan will make your PC shine!',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\fans\\Corsair_LL120_RGB_LED_PWM_fan___Single_Pack_case_fan__tl9v6001-removebg-preview.png'),
        'CORSAIR', 'LL120 RGB', 20, 'FAN', '74d0e4b3-e523-4876-8eae-4630515c5eaf', 32),
       (33,
        'ThermaltakePure Plus RGB 14 TT Premium Edition The Pure Plus 14 RGB fan has pressure-resistant fan blades, a hydraulic bearing and a 16.8 million color LED ring with nine individually controllable LEDs. With the support of the patented TT RGB PLUS software fromThermaltakeand KI''s interactive voice control, Pure Plus 14 RGB lights up your system without sacrificing performance!',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\fans\\1_Thermaltake-Pure-Plus-14-RGB-TT-Premium-Edition-Processor-Ventilator-removebg-preview.png'),
        'THERMALTAKE', 'Pure Plus', 30, 'FAN', 'cd0eab4e-f44a-4c85-9d34-13a1b1b23a01', 33),
       (34,
        'With the iCUE QL120 RGB PWM Triple Fan Kit from Corsair you can make your PC system give a spectacular light show from every angle. The four light zones and 34 LEDs can reflect the most beautiful colors and effects throughout your entire housing.
The iCUE QL120 RGB is a 120mm case fan with high airflow up to 41.8 CFM and a speed of up to 1,500 rpm. The fan blades are transparent so that all attention can be focused on the spectacular lighting effects of the eight individually addressable RGB LEDs that the fan has. Pair the iCUE QL120 RGB Triple Fan Kit with the CORSAIR Lighting Node CORE to customize and sync your lighting with beautiful patterns and effects using CORSAIR iCUE software.',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\fans\\Corsair_iCUE_QL120_RGB_case_fan__tl9v6v59-removebg-preview.png'),
        'CORSAIR', 'iCUE QL120', 25, 'FAN', '1726a0ee-efd2-49c7-b422-a6d2fa6c03eb', 34);


insert into specifications(id, power, efficiency)
values (35, 1200, 80),
       (36, 1300, 90);


insert into products(id, description, image, manufacturer, model, price, type_product, uuid, specifications_id)
values (35,
        'The ROG STRIX 1200W Gold Aura Edition from ASUS combines premium components, superior cooling and fascinating ARGB lighting in a sturdy aluminum case. The enormous ROG heatsinks with Axial-tech fan design make this power supply a real powerhouse for your next gaming setup. The increased efficiency results in less heat, noise and better reliability. ROG STRIX 1200W Gold Aura Edition is also compatible with ATX 3.0, which complies with voltage and current regulations, and PCIe Gen 5.0 graphics cards, for next-gen hardware. The ARGB lighting is integrated into the Aura Sync ecosystem and adds an aesthetic style to your assets.',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\supp\\ASUS_ROG_STRIX_1200W_Gold_Aura_Edition__1200_Watt_voeding___1921868_30-removebg-preview.png'),
        'ASUS', 'ROG STRIX', 329, 'POWER_SUPPLY', '5e2a9fa1-3345-4baa-a7e4-3630a7c881ca', 35),
       (36,
        'The MSI MEG series is a legend that represents the ultimate in gaming elegance. The MEG Ai1300P PCIE5 1300W PC power supply has a PCIe 5.0 and Intel PSDG (Power Supply Design Guide) ATX 3.0 output connector. With a native 16-pin PCIe connection, this power supply is ready for NVIDIA GeForce RTX 40 series graphics cards. It can freely pass up to 600W of power to the PCIe 5.0 graphics cards. Power supply efficiency has a direct impact on system performance and power consumption. The 80 PLUS Platinum certification promises lower energy consumption and higher efficiency.',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\supp\\MSI_MEG_Ai1300P_PCIE5__1300_Watt_voeding___1899545-removebg-preview.png'),
        'MSI', 'MEG Ai1300P', 357, 'POWER_SUPPLY', '4b85efa0-9e59-4ef2-bdec-8219e8f82760', 36);

insert into specifications(id, drive_interface, capacity, rotation_speed)
values (37, 'SATA', 500, 5400),
       (38, 'SATA', 4096, 7200);

insert into products(id, description, image, manufacturer, model, price, type_product, uuid, specifications_id)
values (37,
        'Seagate SkyHawk ST8000VX004 Internal Hard Drive 3.5" 8000GB SATA',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\hdd\\07_03_2023_10_30_43_ST8000VX004_Seagate-removebg-preview.png'),
        'SEAGATE', 'SkyHawk ST8000VX004', 195, 'HDD', '6abb6202-09c9-4905-b432-53756c0ea258', 37),
       (38,
        'The Western Digital Red Pro 4TB (7200rpm) 256MB/s is specially designed for use in medium and large companies and is suitable for use in NAS systems. WD Red Pro hard drives feature a multi-axis shock sensor that automatically detects subtle shocks and dynamic flight height technology that adjusts each read-write function to compensate and protect the data. ',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\hdd\\1666274736_080-removebg-preview.png'),
        'WD', 'Red Pro', 169, 'HDD', 'd72328e8-a259-478d-8b8a-21bebb5fba24', 38);

insert into specifications(id, drive_interface, ssd_type, capacity, read_speed, write_speed)
values (39, 'NVMe', 'M2', 2048, 5400, 4800),
       (40, 'NVMe', 'M2', 4096, 7450, 6900);

insert into products(id, description, image, manufacturer, model, price, type_product, uuid, specifications_id)
values (39,
        'The 980 PRO SSD from Samsung has a storage capacity of 2 TB. This M.2 SSD has a read speed of 7000 MB/sec and a write speed of 5100 MB/sec. The SSD also has an M.2 (2280) design with a PCIe Gen 4.0 x4, NVMe 1.3 interface.
The V-NAND SSD 980 PRO series M.2 SSD from Samsung combines Samsung V-NAND 3-bit MLC with the Samsung Elpis controller for stunning read/write speeds to create a new standard for high-end gaming and 4K & 3D video editing.',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\ssd\\SAMSUNG_980_PRO__2_TB_SSD__1706158_30-removebg-preview.png'),
        'SAMSUNG', '980 PRO', 179.80, 'SSD', 'c9f9b006-80b9-4014-855a-f06ad7f04a0b', 39),
       (40,
        'The slim heatsink of the 990 PRO Heatsink dissipates heat and thus prevents performance loss due to overheating. With 4 TB of storage and sequential read/write speeds of up to 7,450/6,900 MB/s, it delivers nearly the maximum performance of PCIe 4.0. The thin casing is compatible with PlayStation 5, desktops and laptops. The 990 PRO Heatsink consumes less power and offers up to 50% more performance per watt than previous models. This energy-saving design enables maximum PCIe 4.0 performance with optimal energy efficiency. Over 55% improvement in random performance enables faster loading times for ultimate gaming realism in PS5 and DirectStorage PC games. The futuristic design of the heatsink ensures stylish thermal regulation and the RGB lighting provides the right atmosphere.',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\ssd\\SAMSUNG_990_PRO_Heatsink_4_TB_SSD__100011356_30-removebg-preview.png'),
        'SAMSUNG', '990 PRO Heatsink', 381, 'SSD', 'c4f915ca-1604-4d4f-9cc2-ebe224e65781', 40);


insert into specifications(id, color, connectivity, dpi, buttons)
values (41, 'BLACK', 'WIRELESS', 1800, 9),
       (42, 'BLACK', 'WIRELESS', 600, 9);

insert into products(id, description, image, manufacturer, model, price, type_product, uuid, specifications_id)
values (41,
        'The Aerox 5 Wireless from SteelSeries is the result of excellent technology: an ultra-light weight of 74 grams, maximum flexibility and versatility make it the ultimate gaming mouse. With its nine programmable buttons, including five side buttons and a custom up/down switch, all macros are always at your fingertips to perform instant game-winning actions in seconds. Quantum 2.0 Wireless'' built-in wireless technology enables lag-free 2.4 GHz transmission, as well as an alternative Bluetooth 5.0 connection. High energy efficiency enables up to 180 hours of playtime with short charging times. The IP54-certified AquaBarrier technology protects the internal circuitry of the Aerox 5 Wireless against all environmental influences. The TrueMove Air Sensor offers unparalleled precision and absolute control, thanks to 1-to-1 tracking, 100 - 18,000 in 100 CPI increments, 400 ips, 40 G acceleration and tilt tracking. The Aerox 5 Wireless also features 100% PTFE glides for smooth and precise mouse movement. All adjustments can be made easily via the SteelSeries Engine and the 3-zone RGB lighting can be adapted to in-game events or matched with other SteelSeries products.',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\mice\\SteelSeries_Aerox_5_Wireless_gaming_muis__1826041-removebg-preview.png'),
        'STEELSERIES', 'Aerox 5 Wireless', 109.80, 'MOUSE', 'd4c1d79c-9540-4e66-a8bf-3bbf3979f7f1', 41),
       (42,
        'The G502s iconic design is complemented by professional LIGHTSPEED wireless technology for super-fast and reliable connectivity. The HERO 25K sensor provides sub-micron level tracking. Compatible with POWERPLAY for continuous charging even while playing.',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\mice\\pixelboxx-mss-81135169-removebg-preview.png'),
        'LOGITECH', 'G502', 99.99, 'MOUSE', 'cc3fe9c3-d652-444c-ad18-ebe9b5224579', 42);

insert into specifications(id, color, connectivity)
values (43, 'BLACK', 'USBC'),
       (44, 'BLACK', 'WIRELESS');

insert into products(id, description, image, manufacturer, model, price, type_product, uuid, specifications_id)
values (43,
        'The Apex Pro Mini is built to create more space on your desk for game-winning mouse swipes. The smaller footprint lets you tap into optimal ergonomic positions to suit your lifestyle. Retain all the capabilities of full-size keyboards with side-printed secondary functions. All options remain at your fingertips.',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\keyboards\\81fEE4i9pvL._AC_SL1500_-removebg-preview.png'),
        'STEELSERIES', 'Apex Pro Mini', 129, 'KEYBOARD', '944b2faa-ca9f-48d8-b529-1d472e1dcab8', 43),
       (44,
        'G915 is a revolutionary wireless mechanical gaming keyboard with GL Tactile switches and professional wireless LIGHTSPEED technology (1 ms). You can play non-stop for 30 hours on a full charge.* The LIGHTSYNC RGB technology is fully customizable per key and also responds to actions, audio and screen color the way you want it. With a sleek, incredibly thin yet durable and sturdy design, G915 takes gamers to new gaming dimensions. Programmable G-keys let you create and perform complex actions easily and intuitively, while the volume wheel and media buttons give you quick, easy control over video, audio and streaming.
*Battery life may vary depending on usage and computing conditions.',
        LOAD_FILE('C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\keyboards\\uk-g915-wireless-gallery-topdown.png'),
        'LOGITECH', 'G915', 209.99, 'KEYBOARD', 'd6604ee4-67eb-42b1-b5b0-38bb0a88a230', 44);