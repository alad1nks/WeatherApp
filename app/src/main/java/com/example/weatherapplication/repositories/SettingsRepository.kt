package com.example.weatherapplication.repositories

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SettingsRepository @Inject constructor(

): UserSettingsRepository {
    val cities = "Abidjan, Ivory Coast\n" +
        "Abu Dhabi, United Arab Emirates\n" +
        "Abuja, Nigeria\n" +
        "Accra, Ghana\n" +
        "Addis Ababa, Ethiopia\n" +
        "Ahmedabad, India\n" +
        "Aleppo, Syria\n" +
        "Alexandria, Egypt\n" +
        "Algiers, Algeria\n" +
        "Almaty, Kazakhstan\n" +
        "Amman, Jordan\n" +
        "Amsterdam, Netherlands\n" +
        "Anchorage, United States\n" +
        "Andorra la Vella, Andorra\n" +
        "Ankara, Turkey\n" +
        "Antananarivo, Madagascar\n" +
        "Apia, Samoa\n" +
        "Arnold, United States\n" +
        "Ashgabat, Turkmenistan\n" +
        "Asmara, Eritrea\n" +
        "Asuncion, Paraguay\n" +
        "Athens, Greece\n" +
        "Auckland, New Zealand\n" +
        "Avarua, Cook Islands\n" +
        "Baghdad, Iraq\n" +
        "Baku, Azerbaijan\n" +
        "Bamako, Mali\n" +
        "Banda Aceh, Indonesia\n" +
        "Bandar Seri Begawan, Brunei\n" +
        "Bandung, Indonesia\n" +
        "Bangkok, Thailand\n" +
        "Bangui, Central African Republic\n" +
        "Banjul, Gambia\n" +
        "Barcelona, Spain\n" +
        "Barranquilla, Colombia\n" +
        "Basrah, Iraq\n" +
        "Basse-Terre, Guadeloupe\n" +
        "Basseterre, Saint Kitts and Nevis\n" +
        "Beijing, China\n" +
        "Beirut, Lebanon\n" +
        "Bekasi, Indonesia\n" +
        "Belem, Brazil\n" +
        "Belgrade, Serbia\n" +
        "Belmopan, Belize\n" +
        "Belo Horizonte, Brazil\n" +
        "Bengaluru, India\n" +
        "Berlin, Germany\n" +
        "Bern, Switzerland\n" +
        "Bishkek, Kyrgyzstan\n" +
        "Bissau, Guinea-Bissau\n" +
        "Bogota, Colombia\n" +
        "Brasilia, Brazil\n" +
        "Bratislava, Slovakia\n" +
        "Brazzaville, Republic of the Congo\n" +
        "Bridgetown, Barbados\n" +
        "Brisbane, Australia\n" +
        "Brussels, Belgium\n" +
        "Bucharest, Romania\n" +
        "Budapest, Hungary\n" +
        "Buenos Aires, Argentina\n" +
        "Bujumbura, Burundi\n" +
        "Bursa, Turkey\n" +
        "Busan, South Korea\n" +
        "Cairo, Egypt\n" +
        "Cali, Colombia\n" +
        "Caloocan, Philippines\n" +
        "Camayenne, Guinea\n" +
        "Canberra, Australia\n" +
        "Cape Town, South Africa\n" +
        "Caracas, Venezuela\n" +
        "Casablanca, Morocco\n" +
        "Castries, Saint Lucia\n" +
        "Cayenne, French Guiana\n" +
        "Charlotte Amalie, U.S. Virgin Islands\n" +
        "Chengdu, China\n" +
        "Chennai, India\n" +
        "Chicago, United States\n" +
        "Chisinau, Moldova\n" +
        "Chittagong, Bangladesh\n" +
        "Chongqing, China\n" +
        "Colombo, Sri Lanka\n" +
        "Conakry, Guinea\n" +
        "Copenhagen, Denmark\n" +
        "Cordoba, Argentina\n" +
        "Curitiba, Brazil\n" +
        "Daegu, South Korea\n" +
        "Daejeon, South Korea\n" +
        "Dakar, Senegal\n" +
        "Dallas, United States\n" +
        "Damascus, Syria\n" +
        "Dar es Salaam, Tanzania\n" +
        "Delhi, India\n" +
        "Denver, United States\n" +
        "Dhaka, Bangladesh\n" +
        "Dili, Timor Leste\n" +
        "Djibouti, Djibouti\n" +
        "Dodoma, Tanzania\n" +
        "Doha, Qatar\n" +
        "Dongguan, China\n" +
        "Douala, Cameroon\n" +
        "Douglas, Isle of Man\n" +
        "Dubai, United Arab Emirates\n" +
        "Dublin, Ireland\n" +
        "Durban, South Africa\n" +
        "Dushanbe, Tajikistan\n" +
        "Faisalabad, Pakistan\n" +
        "Fort-de-France, Martinique\n" +
        "Fortaleza, Brazil\n" +
        "Freetown, Sierra Leone\n" +
        "Fukuoka, Japan\n" +
        "Funafuti, Tuvalu\n" +
        "Gaborone, Botswana\n" +
        "George Town, Malaysia\n" +
        "Georgetown, Guyana\n" +
        "Gibraltar, Gibraltar\n" +
        "Gitega, Burundi\n" +
        "Giza, Egypt\n" +
        "Guadalajara, Mexico\n" +
        "Guangzhou, China\n" +
        "Guatemala City, Guatemala\n" +
        "Guayaquil, Ecuador\n" +
        "Gujranwala, Pakistan\n" +
        "Gustavia, Saint Barthelemy\n" +
        "Gwangju, South Korea\n" +
        "Hamburg, Germany\n" +
        "Hanoi, Vietnam\n" +
        "Harare, Zimbabwe\n" +
        "Havana, Cuba\n" +
        "Helsinki, Finland\n" +
        "Ho Chi Minh City, Vietnam\n" +
        "Hong Kong, Hong Kong\n" +
        "Honiara, Solomon Islands\n" +
        "Honolulu, United States\n" +
        "Houston, United States\n" +
        "Hyderabad, India\n" +
        "Hyderabad, Pakistan\n" +
        "Ibadan, Nigeria\n" +
        "Incheon, South Korea\n" +
        "Isfahan, Iran\n" +
        "Islamabad, Pakistan\n" +
        "Istanbul, Turkey\n" +
        "Izmir, Turkey\n" +
        "Jaipur, India\n" +
        "Jakarta, Indonesia\n" +
        "Jeddah, Saudi Arabia\n" +
        "Jerusalem, Israel\n" +
        "Johannesburg, South Africa\n" +
        "Juarez, Mexico\n" +
        "Juba, South Sudan\n" +
        "Kabul, Afghanistan\n" +
        "Kaduna, Nigeria\n" +
        "Kampala, Uganda\n" +
        "Kano, Nigeria\n" +
        "Kanpur, India\n" +
        "Kaohsiung, Taiwan\n" +
        "Karachi, Pakistan\n" +
        "Karaj, Iran\n" +
        "Kathmandu, Nepal\n" +
        "Kawasaki, Japan\n" +
        "Kharkiv, Ukraine\n" +
        "Khartoum, Sudan\n" +
        "Khulna, Bangladesh\n" +
        "Kigali, Rwanda\n" +
        "Kingsburg, United States\n" +
        "Kingston, Jamaica\n" +
        "Kingstown, Saint Vincent and the Grenadines\n" +
        "Kinshasa, Democratic Republic of the Congo\n" +
        "Kobe, Japan\n" +
        "Kolkata, India\n" +
        "Kota Bharu, Malaysia\n" +
        "Kowloon, Hong Kong\n" +
        "Kuala Lumpur, Malaysia\n" +
        "Kumasi, Ghana\n" +
        "Kuwait, Kuwait\n" +
        "Kyiv, Ukraine\n" +
        "Kyoto, Japan\n" +
        "La Paz, Bolivia\n" +
        "Lagos, Nigeria\n" +
        "Lahore, Pakistan\n" +
        "Libreville, Gabon\n" +
        "Lilongwe, Malawi\n" +
        "Lima, Peru\n" +
        "Lisbon, Portugal\n" +
        "Ljubljana, Slovenia\n" +
        "Lome, Togo\n" +
        "London, United Kingdom\n" +
        "Los Angeles, United States\n" +
        "Luanda, Angola\n" +
        "Lubumbashi, Democratic Republic of the Congo\n" +
        "Lusaka, Zambia\n" +
        "Luxembourg, Luxembourg\n" +
        "Macau, Macao\n" +
        "Madrid, Spain\n" +
        "Majuro, Marshall Islands\n" +
        "Makassar, Indonesia\n" +
        "Malabo, Equatorial Guinea\n" +
        "Male, Maldives\n" +
        "Mamoudzou, Mayotte\n" +
        "Managua, Nicaragua\n" +
        "Manama, Bahrain\n" +
        "Manaus, Brazil\n" +
        "Manila, Philippines\n" +
        "Maputo, Mozambique\n" +
        "Maracaibo, Venezuela\n" +
        "Maracay, Venezuela\n" +
        "Mariehamn, Aland Islands\n" +
        "Marigot, Saint Martin\n" +
        "Maseru, Lesotho\n" +
        "Mashhad, Iran\n" +
        "Mbabane, Eswatini\n" +
        "Mecca, Saudi Arabia\n" +
        "Medan, Indonesia\n" +
        "Medellin, Colombia\n" +
        "Medina, Saudi Arabia\n" +
        "Melbourne, Australia\n" +
        "Mexico City, Mexico\n" +
        "Miami, United States\n" +
        "Minsk, Belarus\n" +
        "Mogadishu, Somalia\n" +
        "Monaco, Monaco\n" +
        "Monrovia, Liberia\n" +
        "Montevideo, Uruguay\n" +
        "Montreal, Canada\n" +
        "Moroni, Comoros\n" +
        "Moscow, Russia\n" +
        "Mosul, Iraq\n" +
        "Multan, Pakistan\n" +
        "Mumbai, India\n" +
        "Muscat, Oman\n" +
        "N'Djamena, Chad\n" +
        "Nagoya, Japan\n" +
        "Nairobi, Kenya\n" +
        "Nanchong, China\n" +
        "Nanjing, China\n" +
        "Nassau, Bahamas\n" +
        "Nay Pyi Taw, Myanmar\n" +
        "New York, United States\n" +
        "Niamey, Niger\n" +
        "Nicosia, Cyprus\n" +
        "Nouakchott, Mauritania\n" +
        "Noumea, New Caledonia\n" +
        "Novosibirsk, Russia\n" +
        "Nuku'alofa, Tonga\n" +
        "Nur-Sultan, Kazakhstan\n" +
        "Nuuk, Greenland\n" +
        "Oranjestad, Aruba\n" +
        "Osaka, Japan\n" +
        "Oslo, Norway\n" +
        "Ottawa, Canada\n" +
        "Ouagadougou, Burkina Faso\n" +
        "Pago Pago, American Samoa\n" +
        "Palembang, Indonesia\n" +
        "Palo Alto, United States\n" +
        "Panama, Panama\n" +
        "Papeete, French Polynesia\n" +
        "Paramaribo, Suriname\n" +
        "Paris, France\n" +
        "Perth, Australia\n" +
        "Philadelphia, United States\n" +
        "Phnom Penh, Cambodia\n" +
        "Phoenix, United States\n" +
        "Podgorica, Montenegro\n" +
        "Port Louis, Mauritius\n" +
        "Port Moresby, Papua New Guinea\n" +
        "Port of Spain, Trinidad and Tobago\n" +
        "Port-Vila, Vanuatu\n" +
        "Port-au-Prince, Haiti\n" +
        "Porto Alegre, Brazil\n" +
        "Porto-Novo, Benin\n" +
        "Prague, Czechia\n" +
        "Praia, Cabo Verde\n" +
        "Pretoria, South Africa\n" +
        "Pristina, Kosovo\n" +
        "Puebla, Mexico\n" +
        "Pune, India\n" +
        "Pyongyang, North Korea\n" +
        "Quezon City, Philippines\n" +
        "Quito, Ecuador\n" +
        "Rabat, Morocco\n" +
        "Rawalpindi, Pakistan\n" +
        "Recife, Brazil\n" +
        "Reykjavik, Iceland\n" +
        "Riga, Latvia\n" +
        "Rio de Janeiro, Brazil\n" +
        "Riyadh, Saudi Arabia\n" +
        "Road Town, British Virgin Islands\n" +
        "Rome, Italy\n" +
        "Roseau, Dominica\n" +
        "Saint George's, Grenada\n" +
        "Saint Helier, Jersey\n" +
        "Saint John's, Antigua and Barbuda\n" +
        "Saint Peter Port, Guernsey\n" +
        "Saint Petersburg, Russia\n" +
        "Saint-Denis, Reunion\n" +
        "Saint-Pierre, Reunion\n" +
        "Saipan, Northern Mariana Islands\n" +
        "Salvador, Brazil\n" +
        "San Antonio, United States\n" +
        "San Diego, United States\n" +
        "San Francisco, United States\n" +
        "San Jose, United States\n" +
        "San Juan, Argentina\n" +
        "San Marino, United States\n" +
        "San Salvador, El Salvador\n" +
        "Sanaa, Yemen\n" +
        "Santa Cruz de la Sierra, Bolivia\n" +
        "Santiago, Chile\n" +
        "Santo Domingo, Dominican Republic\n" +
        "Sao Paulo, Brazil\n" +
        "Sao Tome, Sao Tome and Principe\n" +
        "Sapporo, Japan\n" +
        "Sarajevo, Bosnia and Herzegovina\n" +
        "Seattle, United States\n" +
        "Semarang, Indonesia\n" +
        "Seoul, South Korea\n" +
        "Shanghai, China\n" +
        "Sharjah, United Arab Emirates\n" +
        "Shenzhen, China\n" +
        "Singapore, Singapore\n" +
        "Skopje, North Macedonia\n" +
        "Sofia, Bulgaria\n" +
        "South Tangerang, Indonesia\n" +
        "Soweto, South Africa\n" +
        "Stockholm, Sweden\n" +
        "Sucre, Bolivia\n" +
        "Surabaya, Indonesia\n" +
        "Surat, India\n" +
        "Suva, Fiji\n" +
        "Sydney, Australia\n" +
        "Tabriz, Iran\n" +
        "Taipei, Taiwan\n" +
        "Tallinn, Estonia\n" +
        "Tangerang, Indonesia\n" +
        "Tarawa, Kiribati\n" +
        "Tashkent, Uzbekistan\n" +
        "Tbilisi, Georgia\n" +
        "Tegucigalpa, Honduras\n" +
        "Tehran, Iran\n" +
        "Tel Aviv, Israel\n" +
        "Thimphu, Bhutan\n" +
        "Tianjin, China\n" +
        "Tijuana, Mexico\n" +
        "Tirana, Albania\n" +
        "Tokyo, Japan\n" +
        "Toronto, Canada\n" +
        "Torshavn, Faroe Islands\n" +
        "Tripoli, Libya\n" +
        "Tunis, Tunisia\n" +
        "Ulan Bator, Mongolia\n" +
        "Vaduz, Liechtenstein\n" +
        "Valencia, Venezuela\n" +
        "Valletta, Malta\n" +
        "Vancouver, Canada\n" +
        "Victoria, Canada\n" +
        "Vienna, Austria\n" +
        "Vientiane, Laos\n" +
        "Vilnius, Lithuania\n" +
        "Warsaw, Poland\n" +
        "Washington, United States\n" +
        "Wellington, New Zealand\n" +
        "Willemstad, Curacao\n" +
        "Windhoek, Namibia\n" +
        "Wuhan, China\n" +
        "Xi'an, China\n" +
        "Yamoussoukro, Ivory Coast\n" +
        "Yangon, Myanmar\n" +
        "Yaounde, Cameroon\n" +
        "Yekaterinburg, Russia\n" +
        "Yerevan, Armenia\n" +
        "Yokohama, Japan\n" +
        "Zagreb, Croatia"

    override suspend fun getCities(): List<String> {
        return cities.split('\n')
    }
}