package Data.Stored;

public class Element
{
    
    public String[] elements;
    public String[] Block;
    public String[] Symbol;
    public String[] State;
    public int[] Specific_Heat_Capacity; // J/kgK
    public int[] Atomic_Mass; // Atomic Mass Unit
    public int[][] Subshell_Config;
    public int[][] Position; // 0=Group 1=Period
    public Double[] Density; // kg/m^3
    public Double[] Melting_Point; // K
    public Double[] Boiling_Point; // K
    public Double[] Heat_of_Fusion; // kJ/mol
    public Double[] Heat_of_Vaporization; // kJ/mol

    public Element()
    {
        Sinit();
        Einit();
        Minit();
        Dinit();
        Binit();
        Ainit();
        Finit();
        Vinit();
        Pinit();
        SEinit();
        BlInit();
        SyInit();
        StInit();
    }

    private void Ainit()
    {
        Atomic_Mass = new int[]
        {
            1,
            4,
            6,
            9,
            10,
            12,
            14,
            15,
            18,
            20,
            22,
            24,
            26,
            28,
            30,
            32,
            35,
            39,
            39,
            40,
            44,
            47,
            50,
            51,
            54,
            55,
            58,
            58,
            63,
            65,
            69,
            72,
            74,
            78,
            79,
            83,
            85,
            87,
            88,
            91,
            92,
            95,
            97,
            101,
            102,
            106,
            107,
            112,
            114,
            118,
            121,
            127,
            126,
            131,
            132,
            137,
            138,
            140,
            140,
            144,
            145,
            150,
            151,
            157,
            158,
            162,
            164,
            167,
            168,
            173,
            174,
            178,
            180,
            183,
            186,
            190,
            192,
            195,
            196,
            200,
            204,
            207,
            208,
            209,
            210,
            222,
            223,
            226,
            227,
            232,
            231,
            238,
            237,
            244,
            243,
            247,
            247,
            251,
            252,
            257,
            258,
            259,
            262,
            267,
            270,
            269,
            270,
            270,
            278,
            281,
            281,
            285,
            286,
            289,
            289,
            293,
            293,
            294,
        };
    }

    private void Binit()
    {
        Boiling_Point = new Double[]
        {
            -252.87 + 273,
            -268.93 + 273,
            1342.000 + 273,
            2470.000 + 273,
            4000.000 + 273,
            4027.000 + 273,
            -195.79 + 273,
            -182.9 + 273,
            -188.12 + 273,
            -246.08 + 273,
            883.000 + 273,
            1090.000 + 273,
            2519.000 + 273,
            2900.000 + 273,
            280.5 + 273,
            444.72 + 273,
            -34.04 + 273,
            -185.8 + 273,
            759.000 + 273,
            1484.000 + 273,
            2830.000 + 273,
            3287.000 + 273,
            3407.000 + 273,
            2671.000 + 273,
            2061.000 + 273,
            2861.000 + 273,
            2927.000 + 273,
            2913.000 + 273,
            2562.000 + 273,
            907.000 + 273,
            2204.000 + 273,
            2820.000 + 273,
            614.000 + 273,
            685.000 + 273,
            59.000 + 273,
            -153.22 + 273,
            688.000 + 273,
            1382.000 + 273,
            3345.000 + 273,
            4409.000 + 273,
            4744.000 + 273,
            4639.000 + 273,
            4265.000 + 273,
            4150.000 + 273,
            3695.000 + 273,
            2963.000 + 273,
            2162.000 + 273,
            767.000 + 273,
            2072.000 + 273,
            2602.000 + 273,
            1587.000 + 273,
            988.000 + 273,
            184.3 + 273,
            -108.000 + 273,
            671.000 + 273,
            1870.000 + 273,
            3464.000 + 273,
            3360.000 + 273,
            3290.000 + 273,
            3100.000 + 273,
            3000.000 + 273,
            1803.000 + 273,
            1527.000 + 273,
            3250.000 + 273,
            3230.000 + 273,
            2567.000 + 273,
            2700.000 + 273,
            2868.000 + 273,
            1950.000 + 273,
            1196.000 + 273,
            3402.000 + 273,
            4603.000 + 273,
            5458.000 + 273,
            5555.000 + 273,
            5596.000 + 273,
            5012.000 + 273,
            4428.000 + 273,
            3825.000 + 273,
            2856.000 + 273,
            356.73 + 273,
            1473.000 + 273,
            1749.000 + 273,
            1564.000 + 273,
            962.000 + 273,
            0.000 + 273,
            -61.7 + 273,
            0.000 + 273,
            1737.000 + 273,
            3200.000 + 273,
            4820.000 + 273,
            4000.000 + 273,
            3927.000 + 273,
            4000.000 + 273,
            3230.000 + 273,
            2011.000 + 273,
            3110.000 + 273,
            0.000 + 273,
            0.000 + 273,
            0.000 + 273,
            0.000 + 273,
            0.000 + 273,
            0.000 + 273,
            0.000 + 273,
            0.000 + 273,
            0.000 + 273,
            0.000 + 273,
            0.000 + 273,
            0.000 + 273,
            0.000 + 273,
            0.000 + 273,
            0.000 + 273,
            0.000 + 273,
            0.000 + 273,
            0.000 + 273,
            0.000 + 273,
            0.000 + 273,
            0.000 + 273,
            0.000 + 273,
        };
    }

    private void BlInit()
    {
        Block=new String[]
        {
            "s","s","s","s","p","p","p","p","p","p","s","s","p","p","p","p","p","p","s","s","d","d","d","d","d","d","d","d","d","d","p","p","p","p","p","p","s","s","d","d","d","d","d","d","d","d","d","d","p","p","p","p","p","p","s","s","f","f","f","f","f","f","f","f","f","f","f","f","f","f","d","d","d","d","d","d","d","d","d","d","p","p","p","p","p","p","s","s","f","f","f","f","f","f","f","f","f","f","f","f","f","f","d","d","d","d","d","d","d","d","d","d","p","p","p","p","p","p"          
        };
    }

    private void Dinit()
    {
        Density = new Double[]
        {
            0.0899,
            0.1785,
            0.535 * 1000,
            1.848 * 1000,
            2.46 * 1000,
            2.26 * 1000,
            1.251,
            1.429,
            1.696,
            0.9,
            0.968 * 1000,
            1.738 * 1000,
            2.7 * 1000,
            2.33 * 1000,
            1.823 * 1000,
            1.96 * 1000,
            3.214,
            1.784,
            0.856 * 1000,
            1.55 * 1000,
            2.985 * 1000,
            4.507 * 1000,
            6.11 * 1000,
            7.19 * 1000,
            7.47 * 1000,
            7.874 * 1000,
            8.9 * 1000,
            8.908 * 1000,
            8.96 * 1000,
            7.14 * 1000,
            5.904 * 1000,
            5.323 * 1000,
            5.727 * 1000,
            4.819 * 1000,
            3.12 * 1000,
            3.75,
            1.532 * 1000,
            2.63 * 1000,
            4.472 * 1000,
            6.511 * 1000,
            8.57 * 1000,
            10.28 * 1000,
            11.5 * 1000,
            12.37 * 1000,
            12.45 * 1000,
            12.023 * 1000,
            10.49 * 1000,
            8.65 * 1000,
            7.31 * 1000,
            7.31 * 1000,
            6.697 * 1000,
            6.24 * 1000,
            4.94 * 1000,
            5.9,
            1.879 * 1000,
            3.51 * 1000,
            6.146 * 1000,
            6.689 * 1000,
            6.64 * 1000,
            7.01 * 1000,
            7.264 * 1000,
            7.353 * 1000,
            5.244 * 1000,
            7.901 * 1000,
            8.219 * 1000,
            8.551 * 1000,
            8.795 * 1000,
            9.066 * 1000,
            9.32 * 1000,
            6.57 * 1000,
            9.841 * 1000,
            13.31 * 1000,
            16.65 * 1000,
            19.25 * 1000,
            21.02 * 1000,
            22.59 * 1000,
            22.56 * 1000,
            21.45 * 1000,
            19.3 * 1000,
            13.534 * 1000,
            11.85 * 1000,
            11.34 * 1000,
            9.78 * 1000,
            9.196 * 1000,
            .000,
            9.73,
            .000,
            5 * 1000.000,
            10.07 * 1000,
            11.724 * 1000,
            15.37 * 1000,
            19.05 * 1000,
            20.45 * 1000,
            19.816 * 1000,
            13.67 * 1000,
            13.51 * 1000,
            14.78 * 1000,
            15.1 * 1000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            00.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
        };
    }

    private void Einit()
    {
        elements = new String[]
        {
            "Hydrogen", "Helium", "Lithium", "Beryllium", "Boron", "Carbon", "Nitrogen", "Oxygen", "Fluorine", "Neon", "Sodium", "Magnesium", "Aluminum", "Silicon", "Phosphorus", "Sulfur", "Chlorine", "Argon", "Potassium", "Calcium", "Scandium", "Titanium", "Vanadium", "Chromium", "Manganese", "Iron", "Cobalt", "Nickel", "Copper", "Zinc", "Gallium", "Germanium", "Arsenic", "Selenium", "Bromine", "Krypton", "Rubidium", "Strontium", "Yttrium", "Zirconium", "Niobium", "Molybdenum", "Technetium", "Ruthenium", "Rhodium", "Palladium", "Silver", "Cadmium", "Indium", "Tin", "Antimony", "Tellurium", "Iodine", "Xenon", "Cesium", "Barium", "Lanthanum", "Cerium", "Praseodymium", "Neodymium", "Promethium", "Samarium", "Europium", "Gadolinium", "Terbium", "Dysprosium", "Holmium", "Erbium", "Thulium", "Ytterbium", "Lutetium", "Hafnium", "Tantalum", "Tungsten", "Rhenium", "Osmium", "Iridium", "Platinum", "Gold", "Mercury", "Thallium", "Lead", "Bismuth", "Polonium", "Astatine", "Radon", "Francium", "Radium", "Actinium", "Thorium", "Protactinium", "Uranium", "Neptunium", "Plutonium", "Americium", "Curium", "Berkelium", "Californium", "Einsteinium", "Fermium", "Mendelevium", "Nobelium", "Lawrencium", "Rutherfordium", "Dubnium", "Seaborgium", "Bohrium", "Hassium", "Meitnerium", "Darmstadtium", "Roentgenium", "Copernicium", "Nihonium", "Flerovium", "Moscovium", "Livermorium", "Tennessine", "Oganesson"
        };
    }

    private void Finit()
    {
        Heat_of_Fusion = new Double[]
        {
            0.558,
            0.02,
            3.000,
            7.95,
            50.000,
            105.000,
            0.36,
            0.222,
            0.26,
            0.34,
            2.6,
            8.7,
            10.7,
            50.2,
            0.64,
            1.73,
            3.2,
            1.18,
            2.33,
            8.54,
            16.000,
            18.7,
            22.8,
            20.5,
            13.2,
            13.8,
            16.2,
            17.2,
            13.1,
            7.35,
            5.59,
            31.8,
            27.7,
            5.4,
            5.8,
            1.64,
            2.19,
            8.000,
            11.4,
            21.000,
            26.8,
            36.000,
            23.000,
            25.7,
            21.7,
            16.7,
            11.3,
            6.3,
            3.26,
            7.000,
            19.7,
            17.5,
            7.76,
            2.3,
            2.09,
            8.000,
            6.3,
            5.5,
            6.9,
            7.1,
            7.7,
            8.5,
            9.3,
            10.000,
            10.8,
            11.1,
            17.000,
            19.9,
            16.8,
            7.7,
            22.000,
            25.5,
            36.000,
            35.000,
            33.000,
            31.000,
            26.000,
            20.000,
            12.5,
            2.29,
            4.2,
            4.77,
            10.9,
            13.000,
            6.000,
            3.000,
            2.000,
            8.000,
            14.000,
            16.000,
            15.000,
            14.000,
            10.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
        };
    }

    private void Minit()
    {
        Melting_Point = new Double[]
        {
            -259.14 + 273,
            -273.000 + 273,
            180.54 + 273,
            1287.000 + 273,
            2075.000 + 273,
            3550.000 + 273,
            -210.1 + 273,
            -218.3 + 273,
            -219.6 + 273,
            -248.59 + 273,
            97.72 + 273,
            650.000 + 273,
            660.32 + 273,
            1414.000 + 273,
            44.2 + 273,
            115.21 + 273,
            -101.5 + 273,
            -189.3 + 273,
            63.38 + 273,
            842.000 + 273,
            1541.000 + 273,
            1668.000 + 273,
            1910.000 + 273,
            1907.000 + 273,
            1246.000 + 273,
            1538.000 + 273,
            1495.000 + 273,
            1455.000 + 273,
            1084.62 + 273,
            419.53 + 273,
            29.76 + 273,
            938.3 + 273,
            817.000 + 273,
            221.000 + 273,
            -7.3 + 273,
            -157.36 + 273,
            39.31 + 273,
            777.000 + 273,
            1526.000 + 273,
            1855.000 + 273,
            2477.000 + 273,
            2623.000 + 273,
            2157.000 + 273,
            2334.000 + 273,
            1964.000 + 273,
            1554.9 + 273,
            961.78 + 273,
            321.07 + 273,
            156.6 + 273,
            231.93 + 273,
            630.63 + 273,
            449.51 + 273,
            113.7 + 273,
            -111.8 + 273,
            28.44 + 273,
            727.000 + 273,
            919.000 + 273,
            798.000 + 273,
            931.000 + 273,
            1021.000 + 273,
            1100.000 + 273,
            1072.000 + 273,
            822.000 + 273,
            1313.000 + 273,
            1356.000 + 273,
            1412.000 + 273,
            1474.000 + 273,
            1497.000 + 273,
            1545.000 + 273,
            819.000 + 273,
            1663.000 + 273,
            2233.000 + 273,
            3017.000 + 273,
            3422.000 + 273,
            3186.000 + 273,
            3033.000 + 273,
            2466.000 + 273,
            1768.3 + 273,
            1064.18 + 273,
            -38.83 + 273,
            304.000 + 273,
            327.46 + 273,
            271.3 + 273,
            254.000 + 273,
            302.000 + 273,
            -71.000 + 273,
            -273.000 + 273,
            700.000 + 273,
            1050.000 + 273,
            1750.000 + 273,
            1572.000 + 273,
            1135.000 + 273,
            644.000 + 273,
            640.000 + 273,
            1176.000 + 273,
            1345.000 + 273,
            1050.000 + 273,
            900.000 + 273,
            860.000 + 273,
            1527.000 + 273,
            828.000 + 273,
            828.000 + 273,
            1627.000 + 273,
            -273.000 + 273,
            -273.000 + 273,
            -273.000 + 273,
            -273.000 + 273,
            -273.000 + 273,
            -273.000 + 273,
            -273.000 + 273,
            -273.000 + 273,
            -273.000 + 273,
            -273.000 + 273,
            -273.000 + 273,
            -273.000 + 273,
            -273.000 + 273,
            -273.000 + 273,
            -273.000 + 273,
        };
    }

    private void Pinit()
    {
        Position=new int[][]
        {
            {1,1},
            {1,18},
            {2,1},
            {2,2},
            {2,13},
            {2,14},
            {2,15},
            {2,16},
            {2,17},
            {2,18},
            {3,1},
            {3,2},
            {3,13},
            {3,14},
            {3,15},
            {3,16},
            {3,17},
            {3,18},
            {4,1},
            {4,2},
            {4,3},
            {4,4},
            {4,5},
            {4,6},
            {4,7},
            {4,8},
            {4,9},
            {4,10},
            {4,11},
            {4,12},
            {4,13},
            {4,14},
            {4,15},
            {4,16},
            {4,17},
            {4,18},
            {5,1},
            {5,2},
            {5,3},
            {5,4},
            {5,5},
            {5,6},
            {5,7},
            {5,8},
            {5,9},
            {5,10},
            {5,11},
            {5,12},
            {5,13},
            {5,14},
            {5,15},
            {5,16},
            {5,17},
            {5,18},
            {6,1},
            {6,2},
            {6,3},
            {6,3},
            {6,3},
            {6,3},
            {6,3},
            {6,3},
            {6,3},
            {6,3},
            {6,3},
            {6,3},
            {6,3},
            {6,3},
            {6,3},
            {6,3},
            {6,3},
            {6,4},
            {6,5},
            {6,6},
            {6,7},
            {6,8},
            {6,9},
            {6,10},
            {6,11},
            {6,12},
            {6,13},
            {6,14},
            {6,15},
            {6,16},
            {6,17},
            {6,18},
            {7,1},
            {7,2},
            {7,4},
            {7,4},
            {7,4},
            {7,4},
            {7,4},
            {7,4},
            {7,4},
            {7,4},
            {7,4},
            {7,4},
            {7,4},
            {7,4},
            {7,4},
            {7,4},
            {7,4},
            {7,4},
            {7,5},
            {7,6},
            {7,7},
            {7,8},
            {7,9},
            {7,10},
            {7,11},
            {7,12},
            {7,13},
            {7,14},
            {7,15},
            {7,16},
            {7,17},
            {7,18}
        };
    }

    private void SEinit()
    {
        Subshell_Config = new int[][]
        {
            {
                1
            },
            {
                2
            },
            {
                2, 1
            },
            {
                2, 2
            },
            {
                2, 2, 1
            },
            {
                2, 2, 2
            },
            {
                2, 2, 3
            },
            {
                2, 2, 4
            },
            {
                2, 2, 5
            },
            {
                2, 2, 6
            },
            {
                2, 2, 6, 1
            },
            {
                2, 2, 6, 2
            },
            {
                2, 2, 6, 2, 1
            },
            {
                2, 2, 6, 2, 2
            },
            {
                2, 2, 6, 2, 3
            },
            {
                2, 2, 6, 2, 4
            },
            {
                2, 2, 6, 2, 5
            },
            {
                2, 2, 6, 2, 6
            },
            {
                2, 2, 6, 2, 6, 1
            },
            {
                2, 2, 6, 2, 6, 2
            },
            {
                2, 2, 6, 2, 6, 2, 1
            },
            {
                2, 2, 6, 2, 6, 2, 2
            },
            {
                2, 2, 6, 2, 6, 2, 3
            },
            {
                2, 2, 6, 2, 6, 1, 5
            },
            {
                2, 2, 6, 2, 6, 2, 5
            },
            {
                2, 2, 6, 2, 6, 2, 6
            },
            {
                2, 2, 6, 2, 6, 2, 7
            },
            {
                2, 2, 6, 2, 6, 2, 8
            },
            {
                2, 2, 6, 2, 6, 1, 10
            },
            {
                2, 2, 6, 2, 6, 2, 10
            },
            {
                2, 2, 6, 2, 6, 2, 10, 1
            },
            {
                2, 2, 6, 2, 6, 2, 10, 2
            },
            {
                2, 2, 6, 2, 6, 2, 10, 3
            },
            {
                2, 2, 6, 2, 6, 2, 10, 4
            },
            {
                2, 2, 6, 2, 6, 2, 10, 5
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 1
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 1
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 2
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 1, 4
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 1, 5
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 5
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 1, 7
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 1, 8
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 0, 10
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 1, 10
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 1
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 2
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 3
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 4
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 5
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 1
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 1
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 1, 1
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 3
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 4
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 5
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 6
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 7
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 7, 1
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 9
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 10
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 11
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 12
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 13
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 1
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 2
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 3
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 4
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 5
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 6
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 7
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 1, 14, 9
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 1, 14, 10
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 1
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 2
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 3
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 4
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 5
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 6
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 6, 1
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 6, 2
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 6, 2, 1
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 6, 2, 2
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 6, 2, 2, 1
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 6, 2, 3, 1
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 6, 2, 4, 1
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 6, 2, 6
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 6, 2, 7
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 6, 2, 7, 1
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 6, 2, 9
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 6, 2, 10
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 6, 2, 11
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 6, 2, 12
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 6, 2, 13
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 6, 2, 14
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 6, 2, 14, 1
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 6, 2, 14, 2
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 6, 2, 14, 3
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 6, 2, 14, 4
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 6, 2, 14, 5
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 6, 2, 14, 6
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 6, 2, 14, 7
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 6, 1, 14, 9
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 6, 1, 14, 10
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 6, 2, 14, 10
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 6, 2, 14, 10, 1
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 6, 2, 14, 10, 2
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 6, 2, 14, 10, 3
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 6, 2, 14, 10, 4
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 6, 2, 14, 10, 5
            },
            {
                2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 6, 2, 14, 10, 6
            }
        };
    }

    private void Sinit()
    {
        Specific_Heat_Capacity = new int[]
        {
            14300,
            5193,
            3570,
            1820,
            1030,
            710,
            1040,
            919,
            824,
            1030,
            1230,
            1020,
            904,
            710,
            770,
            705,
            478,
            520,
            757,
            631,
            567,
            520,
            489,
            448,
            479,
            449,
            421,
            445,
            384,
            388,
            371,
            321,
            328,
            321,
            947,
            248,
            364,
            300,
            298,
            278,
            265,
            251,
            63,
            238,
            240,
            240,
            235,
            230,
            233,
            217,
            207,
            201,
            429,
            158,
            242,
            205,
            195,
            192,
            193,
            190,
            0,
            196,
            182,
            240,
            182,
            167,
            165,
            168,
            160,
            154,
            154,
            144,
            140,
            132,
            137,
            130,
            131,
            133,
            129,
            139,
            129,
            127,
            122,
            0,
            0,
            94,
            0,
            92,
            120,
            118,
            99,
            116,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
        };
    }

    private void StInit()
    {
        State=new String[]
        {
            "Gas","Gas","Solid","Solid","Solid","Solid","Gas","Gas","Gas","Gas","Solid","Solid","Solid","Solid","Solid","Solid","Gas","Gas","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Liquid","Gas","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Gas","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Liquid","Solid","Solid","Solid","Solid","Solid","Gas","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","Solid","N/A","N/A","N/A","N/A","N/A","N/A","N/A","N/A","N/A","N/A","N/A","N/A","N/A","N/A","N/A","N/A","N/A","N/A","N/A"            
        };
    }

    private void SyInit()
    {
        Symbol=new String[]
        {
            "H","He","Li","Be","B","C","N","O","F","Ne","Na","Mg","Al","Si","P","S","Cl","Ar","K","Ca","Sc","Ti","V","Cr","Mn","Fe","Co","Ni","Cu","Zn","Ga","Ge","As","Se","Br","Kr","Rb","Sr","Y","Zr","Nb","Mo","Tc","Ru","Rh","Pd","Ag","Cd","In","Sn","Sb","Te","I","Xe","Cs","Ba","La","Ce","Pr","Nd","Pm","Sm","Eu","Gd","Tb","Dy","Ho","Er","Tm","Yb","Lu","Hf","Ta","W","Re","Os","Ir","Pt","Au","Hg","Tl","Pb","Bi","Po","At","Rn","Fr","Ra","Ac","Th","Pa","U","Np","Pu","Am","Cm","Bk","Cf","Es","Fm","Md","No","Lr","Rf","Db","Sg","Bh","Hs","Mt","Ds","Rg","Cn","Nh","Fl","Mc","Lv","Ts","Og"
        };
    }

    private void Vinit()
    {
        Heat_of_Vaporization = new Double[]
        {
            0.452,
            0.083,
            147.000,
            297.000,
            507.000,
            715.000,
            2.79,
            3.41,
            3.27,
            1.75,
            97.7,
            128.000,
            293.000,
            359.000,
            12.4,
            9.8,
            10.2,
            6.5,
            76.9,
            155.000,
            318.000,
            425.000,
            453.000,
            339.000,
            220.000,
            347.000,
            375.000,
            378.000,
            300.000,
            119.000,
            256.000,
            334.000,
            32.4,
            26.000,
            14.8,
            9.02,
            71.000,
            137.000,
            380.000,
            580.000,
            690.000,
            600.000,
            550.000,
            580.000,
            495.000,
            380.000,
            255.000,
            100.000,
            230.000,
            290.000,
            67.000,
            48.000,
            20.9,
            12.64,
            64.000,
            140.000,
            400.000,
            350.000,
            330.000,
            285.000,
            290.000,
            175.000,
            175.000,
            305.000,
            295.000,
            280.000,
            265.000,
            285.000,
            250.000,
            160.000,
            415.000,
            630.000,
            736.000,
            800.000,
            705.000,
            630.000,
            560.000,
            490.000,
            330.000,
            59.2,
            165.000,
            178.000,
            160.000,
            100.000,
            40.000,
            17.000,
            64.000,
            125.000,
            400.000,
            530.000,
            470.000,
            420.000,
            335.000,
            325.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
            0.000,
        };
    }
}