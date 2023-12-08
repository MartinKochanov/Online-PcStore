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
values (9, 'LGA1700', 'ATX', 4, 64, 'DDR5', 'PCIe4'),
       (10, 'LGA1700', 'ATX', 4, 32, 'DDR5', 'PCIe4'),
       (11, 'AM4', 'MICRO_ATX', 4, 128, 'DDR4', 'PCIe8'),
       (12, 'AM5', 'ATX', 4, 192, 'DDR5', 'PCIe8'),
       (13, 'LGA1200', 'ATX', 9, 128, 'DDR4', 'PCIe16'),
       (14, 'LGA1151', 'ATX', 4, 64, 'DDR4', 'PCIe8'),
       (15, 'AM5', 'ATX', 4, 192, 'DDR5', 'PCIe16'),
       (16, 'LGA1200', 'ATX', 4, 64, 'DDR5', 'PCIe4');

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


insert into specifications()
values ();


