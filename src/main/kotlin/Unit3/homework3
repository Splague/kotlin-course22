var eventName : String = "Hackathon Survival" // Название мероприятия - строка с возможностью изменения текста
var eventDate : String = "2024-09-15" // Дата мероприятия - строка с возможностью изменения
val eventCity : String = "St.Petersburg, Russia" // локация мероприятия - строка, без возможности изменений
private var eventBudget: List<Pair<String, Double>> = = listOf(
    "Spending1" to 1000.0,
    "Spending2" to 2000.0,
    "Spending3" to 3000.0
) // бюджет мероприятия - изменяемый список нескольких расходов, просмотр ограничен
var participantSum: Int = 100 // количество участников - изменяемое целое число
var eventDuration: Double = 5.5 // длительность - изменяемое дробное число
private val vendorsContacts: Map<String,String> = mapOf(
    "Vendor1" to "contract 1, vendor1@gmail.com",
    "Vendor2" to "contract 2, vendor2@mail.ru",
    "Vendor3" to "contract 3, vendor3@yandex.ru"
) // контакты и условия поставщиков - список данных, просмотр ограничен
var eventStatus : String = "Finish Ready" // статус мероприятия - изменяемая строка
var eventSponsors : List<String> = listOf ("Company1", "Company2", "Company3") // список партнеров - изменяемый список строк
private var totalBudget: Double = eventBudget.sumOf { it.second } // общий бюджет меропрятия - сумма расходов из бюджета, просмотр ограничен
private var currentAccessLevel: String = "None" // текущий уровень доступа к интернету - изменяемая строка, просмотр ограничен
private var eventResourcesLogistic : Map<String,String>// информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки
var eventTeams : Int = 0 // количество команд - изменяемое целое число
var eventTasks : List<String> = listOf("Task1", "Task2", "Task3") // перечень задач - изменяемый список
val evacuationPlan : String = "In case of fire, burn" // план эвакуации - конкретный неизменяемый текст
private var availableEquipment: List<Triple<String, Int, String>> = listOf(
    Triple("Table, 2, "Good),
    Triple("Microphone", 5, "Needs battery replacement"),
    Triple("Projector", 4, "Excellent"),
    Triple("Laptop", 10, "Good"),
    Triple("Camera", 1, "Faulty")
) // список оборудования - изменяемый список с разными характеристиками (наименование, количество, состояние), просмотр ограничен
private var availableEquipment: List<Pair<String, Int>> = listOf(
    "Projector" to 2,
    "Microphone" to 3,
    "Laptop" to 4
) // список свободного оборудования - изменяемый список с разными характеристиками (название, количество), просмотр ограничен.
var mealSchedule: List<String> = listOf(
    "Breakfast: 8:00",
    "Lunch: 12:00 PM",
    "Dinner: 18:00 PM"
) // график питания участников - изменяемый список строк с указанием приема пищи и времени.
private val planB : String = "Smiling and waving" // план мероприятий на случай сбоев - конкретный текст, просмотр ограничен
val experts : List<String> = listOf("Expert1", "Expert2", "Expert3") // cписок экспертов и жюри - редактируемый список значений
val feedbackMethods : String = "Online surveys and interviews"// Методы и процедуры для сбора отзывов от участников и гостей, включая анонимные опросы и интервью.
var privacyPolicy : String = ""// политика конфиденциальности - конкретный текст, неизменяемый
lateint var privateFeedback : String = ""// фидбек зрителей, начинаем сохранять только после мероприятия
var nowTemperature : Double = 21.4 // текущая температура в помещении - дробное число
var networkPerformance : String = "Allright"// мониторинг и анализ производительности сетевого оборудования и интернет-соединения - изменяемая строка
var lightLevel : Int = 270// уровень освещения - целое изменяемое число
lateinit var eventLog : List<String> = listOf(
) // лог событий мероприятия - список значений, изменяется по ходу мероприятия
val healthCare : String = "availible"// доступность медицинской помощи - текстовое значение, может меняться
val emergencyPlans : String = "Evacuations plans and emergency protocols" // планы и процедуры для обеспечения безопасности мероприятия - конкретный текст, общедоступен
var eventRegNumber : String = "ARR-2024-1-11-7"// регистрационный номер мероприятия - конкретная неизменяемая строка
val peakNoise : Int = 90 // максимально допустимый уровень шума в помещении - конкретное число
var noiseLevel : Boolean = false // индикатор превышения уровня шума в помещениях - булевский тип (выше или ниже заданного значения).
var eventFormat : String = "Offline" // формат мероприятия - текстовая строка с возможностью сменить значение
var availableSeats: Int
    get() = _availableSeats
    set(value) {
        if (value < 0) {
            throw IllegalArgumentException("Количество мест не может быть отрицательным")
        }
        _availableSeats = value
    } // количество свободных сидений с проверкой значений
val pressPlan : String = ""// план взаимодействия с прессой - конкретный текст
val teamProjects : Map<String, String> = mapOf(
    "Team1" to "",
    "Team2" to "",
    "Team3" to "",
    "Team4" to "",
    "Team5" to ""
) // информация по проектам каждой команды - карта строк с существующей информацией
var permissionsStatus : Boolean = false // статус получения всех необходимых разрешений - буллев тип, проверяет факт наличия
var exclusiveAccess: Boolean = false // доступ к уникальным экскурсиям (факт открытия) - буллев тип.
val eventPartners : List<String> = listOf("Partner1", "Partner2", "Partner 3") // список партнеров мероприятия - изменяемый список строк
lateinit var eventReport : String = ""// финальный отчет - меняемая строка, активируется уже после ивента
val prizePlan: String = "and no one goes away offended" // план распределения призов - конкретный текст
private val emergencyContacts: Map<String, String> = mapOf(
    "Medical" to "03",
    "Fire Department" to "01"
) // контакты экстренных служб - закрытый список инфы.
val specialConditions: String = "accessible to everyone, convenient for everyone" // особые условия для участников с ограниченными возможностями - конкретный текст
val guestsMood: String by lazy { '' } // общее настроение участников - текст, запрашивается при опросах
lateinit var planA: String = "" // план хакатона, запускается перед началом мероприятия
lsteinit var specialGuest: String = "Special Guest" // имя спецгостя объявляется рядом с началом
val maxCapacity: Int = 10000// максимум людей в зале - конкретное число
val standardHours: Int = 6 // число часов на проект - конкретное число