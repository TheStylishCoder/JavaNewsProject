package com.example.codeclan.java_news_server.components;


import com.example.codeclan.java_news_server.models.*;
import com.example.codeclan.java_news_server.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    JournalistRepository journalistRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    ArticleRepository articleRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    LocationRepository locationRepository;

    @Autowired
    RoleRepository roleRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) {

        Category entertainment = new Category("Entertainment");
        categoryRepository.save(entertainment);
        Category business = new Category("Business");
        categoryRepository.save(business);
        Category politics = new Category("Politics");
        categoryRepository.save(politics);
        Category sports = new Category("Sports");
        categoryRepository.save(sports);
        Category uplifting = new Category("Uplifting");
        categoryRepository.save(uplifting);
        Category technology = new Category("Technology");
        categoryRepository.save(technology);
        Category arts = new Category("Arts");
        categoryRepository.save(arts);
        Category lifestyle = new Category("Lifestyle");
        categoryRepository.save(lifestyle);



        Location scotland = new Location("Scotland");
        locationRepository.save(scotland);
        Location uk = new Location("UK");
        locationRepository.save(uk);
        Location europe = new Location("Europe");
        locationRepository.save(europe);
        Location usa = new Location("USA");
        locationRepository.save(usa);
        Location restOfWorld = new Location("Rest of World");
        locationRepository.save(restOfWorld);


        Role user = new Role("User");
        roleRepository.save(user);
        Role admin = new Role("Admin");
        roleRepository.save(admin);



        User jennifer = new User("jw123", "newsislife", admin, scotland);
        userRepository.save(jennifer);

        User dominic = new User("coolguy24", "handsome", user, scotland);
        userRepository.save(dominic);

        User anna = new User("thestylishreader", "1234", admin, scotland);
        userRepository.save(anna);

        Journalist read = new Journalist("Simon Read");
        journalistRepository.save(read);

        Journalist russon = new Journalist("Mary-Ann Russon");
        journalistRepository.save(russon);

        Journalist bloom = new Journalist("Jonty Bloom");
        journalistRepository.save(bloom);

        Journalist bearne = new Journalist("Suzanne Bearne");
        journalistRepository.save(bearne);

        Journalist harper = new Journalist("Justin Harper");
        journalistRepository.save(harper);

        Journalist jock = new Journalist("Scotch Jock");
        journalistRepository.save(jock);

        Journalist english = new Journalist("Tom English");
        journalistRepository.save(english);

        Journalist mcgregor = new Journalist("Paul McGregor");
        journalistRepository.save(mcgregor);

        Journalist watson = new Journalist("Chris Watson");
        journalistRepository.save(watson);

        Journalist macrae = new Journalist("Craig Macrae");
        journalistRepository.save(macrae);

        Journalist waddell = new Journalist("David Waddell");
        journalistRepository.save(waddell);

        Journalist rudden = new Journalist("Gary Rudden");
        journalistRepository.save(rudden);

        Journalist courtney = new Journalist("Andrew Courtney");
        journalistRepository.save(courtney);

        Journalist tully = new Journalist("Daniel Tully");
        journalistRepository.save(tully);

        Journalist mckenna = new Journalist("Sean McKenna");
        journalistRepository.save(mckenna);

        Journalist martin = new Journalist("Jonathan Martin");
        journalistRepository.save(martin);

        Journalist robertson = new Journalist("Chris Robertson");
        journalistRepository.save(robertson);

        Journalist binding = new Journalist("Lucia Binding");
        journalistRepository.save(binding);

        Journalist mercer = new Journalist("David Mercer");
        journalistRepository.save(mercer);

        Journalist connelly = new Journalist("John Connolly");
        journalistRepository.save(connelly);

        Journalist fletcher = new Journalist("Harry Fletcher");
        journalistRepository.save(fletcher);

        Journalist ashurt = new Journalist("Sam Ashurt");
        journalistRepository.save(ashurt);

        Journalist rackham = new Journalist("Annabel Rackham");
        journalistRepository.save(rackham);

        Journalist kale = new Journalist("Sirin Kale");
        journalistRepository.save(kale);

        Journalist barnett = new Journalist("Emma Barnett");
        journalistRepository.save(barnett);

        Journalist howarth = new Journalist("Emma Howrth");
        journalistRepository.save(howarth);

        Journalist jones = new Journalist("Anna Jones");
        journalistRepository.save(jones);

        Journalist walker = new Journalist("Ella Walker");
        journalistRepository.save(walker);

        Journalist wakefield = new Journalist("Jane Wakefield");
        journalistRepository.save(wakefield);

        Journalist morris = new Journalist("Ben Morris");
        journalistRepository.save(morris);

        Journalist kleinman = new Journalist("Zoe Kleinman");
        journalistRepository.save(kleinman);

        Journalist tsoni = new Journalist("Paula Tsoni");
        journalistRepository.save(tsoni);

        Journalist white = new Journalist("Jordan White");
        journalistRepository.save(white);

        Journalist clayton = new Journalist("Max Clayton");
        journalistRepository.save(clayton);

        Journalist hendrix = new Journalist("Grady Hendrix");
        journalistRepository.save(hendrix);

        Journalist easdale = new Journalist("Sarah Easdale");
        journalistRepository.save(easdale);

        Journalist king = new Journalist("Nathaniel King");
        journalistRepository.save(king);

        Journalist tristram = new Journalist("Sophie Tristram");
        journalistRepository.save(tristram);

        Journalist hughes = new Journalist("Emma Hughes");
        journalistRepository.save(hughes);

        Journalist bryant = new Journalist("Nicola Bryant");
        journalistRepository.save(bryant);

        Journalist zhuravlyova = new Journalist("Sonia Zhuravlyova");
        journalistRepository.save(zhuravlyova);

        Journalist haines = new Journalist("Gavin Haines");
        journalistRepository.save(haines);

        Journalist douglas = new Journalist("Lucy Douglas");
        journalistRepository.save(douglas);

        Journalist easedale = new Journalist("Sarah Easedale");
        journalistRepository.save(easedale);

        Journalist reynolds = new Journalist("Darryl Reynolds");
        journalistRepository.save(reynolds);

        Journalist boyle = new Journalist("Charles Boyle");
        journalistRepository.save(boyle);

        Journalist diaz = new Journalist("Victor Diaz");
        journalistRepository.save (diaz);

        Journalist harkness = new Journalist("Frank Harkness");
        journalistRepository.save(harkness);

        Journalist gordon = new Journalist("James Gordon");
        journalistRepository.save(gordon);

        Journalist santiago = new Journalist("Emilio Santiago");
        journalistRepository.save(santiago);

        Journalist holt = new Journalist("Elliot Holt");
        journalistRepository.save(holt);

        Journalist williams = new Journalist("Rhys Williams");
        journalistRepository.save(williams);

        Journalist jeffords = new Journalist("Samuel Jeffords");
        journalistRepository.save(jeffords);

        Journalist cooper = new Journalist("Jacob Cooper");
        journalistRepository.save(cooper);




        Article business1 = new Article("Royal Mail offers free parcel pick-up as delivery war looms", "Royal Mail is" +
                " offering free parcel pick-ups from home for the next few weeks as it tries to boost its delivery " +
                "business.", "The company faced fierce criticism over Christmas for serious delivery delays. Now it " +
                "has cleared the backlog, it is hoping to pick up more business by picking up more parcels. The move " +
                "is Royal Mail's latest attempt to muscle in on a bigger portion of the UK delivery business, which " +
                "sees three billion parcels sent a year. The company normally charges 72p to pick up a parcel, which is on top of the postage fee. It will waive the pick-up charge until the end of May to try to persuade people to use the service. Rivals say that Royal Mail is simply playing catch up with its Parcels Collect service which was launched last October. Delivery firm Hermes UK pointed out it has been offering a courier collection service for a similar price for more than 10 years and it's grown in popularity during lockdown, which may have prompted Royal Mail launching its own version." +
                "'The service has always been popular but has been invaluable during the pandemic when people have been encouraged to stay at home,' a Hermes spokesperson said. 'Last year we saw 10 million parcels delivered through our Hermes Send service in December 2020 alone as people saw their Christmas plans changed at short notice and were keen to ensure loved ones received their gifts, while following government guidelines.'" +
                "Royal Mail's doorstep service has picked up just a million parcels since being launched six months ago, compared to the 10 million Hermes picked up in December." +
                "That has prompted the free offer in an attempt to try to encourage more people to use it." +
                "'The promotion is an opportunity for all consumers across the UK to try out this service free,' said Nick Landon, chief commercial officer at Royal Mail." +
                "'Parcel Collect is part of our commitment to continuously make our services more convenient as we re-invent the way we deliver to and from our customers.'" +
                "As part of the offer, Royal Mail's postmen and postwomen will collect up to five parcels free from customers' doors or nominated safe place, as long as they've already paid the postage." +
                "Customers need to pay the postage online and print out proof for the parcels." +
                "The home pick-up service is also available free for the next few weeks for pre-paid return items. The company normally charges 60p per item on top of postage for them." +
                "Royal Mail came under fire over the Christmas period after there were severe delays to deliveries in many areas." +
                "The company blamed exceptionally high volumes of seasonal post and anti-Covid measures for the problems." +
                "Last week, there were fresh warnings about a postal scam which tries to trick people into handing over personal details by pretending they owe postage for a non-existent package." +
                "The con involves a text message being sent that claims a parcel is awaiting delivery by Royal Mail." +
                "Trading standards officers warned people not to click on a link which connects to a copycat website run by fraudsters, where crooks could steal people's personal information." +
                "Royal Mail said it would never send a text message of that kind." +
                "A similar scam that used DPD branding did the rounds in January, Trading Standards warned.",
                read, business, uk, "2021-03-29", 0, "https://ichef.bbci.co" +
                ".uk/news/976/cpsprodpb/67FC/production/_116902662_royalmail_pa.jpg");
        articleRepository.save(business1);


        Article business2 = new Article("Retailers call for 'Shop Out to Help Out' scheme when stores reopen", "A group of big names in fashion and retail are campaigning for the government to provide more support for small independent shops."
                , "They want the chancellor to offer a ‘Shop Out to Help Out’ scheme to get consumers spending again when non-essential shops reopen on 12 April. It would cover 50% of a shopper's costs, up to £10, on Monday to Wednesdays for a month. And it would only apply at physical stores with fewer than 10 staff." +
                "The ‘Save The Street’ campaign says independent retailers won't survive without it. The Treasury did not comment on whether it would pursue the idea, but said it had protected ‘millions' of retail jobs during the pandemic. The proposed scheme - which would work like the Eat Out to Help Out restaurant discounts last year - is backed by the likes of beauty entrepreneur Charlotte Tilbury, fashion designer Henry Holland and retail consultant Mary Portas." +
                "‘We would be kidding ourselves to think that everything will be fine for independent retailers once they reopen on 12 April,' says Ross Bailey, the entrepreneur leading the campaign. 'Now it is the government's responsibility to support these businesses and ensure they are given a fighting chance to bounce back - the government needs to show that all businesses matter, not just big businesses.’ The British Retail Consortium estimates that non-essential retail stores lost around £22bn in sales in 2020 due to lockdown measures, as footfall declined by 40%. Independent shops - many of which lack a strong online presence - were hit particularly hard as they faced prolonged closures and restrictions. Yet this hasn't stopped people from trying to start businesses. Latest data from Cornerstone Tax, which gives advice on property stamp duty, shows 13% of consumers have started, or intend to start, their own business in 2021. The firm's research also shows more than half of consumers want to support smaller firms over retail giants. Retail analysts are also seriously concerned about the situation facing Britain's independent shops. ‘Independent retailers have had a tumultuous year and immediate action is needed to avoid a high street apocalypse,' says Natalie Berg, retail analyst at NBK Retail." +
                "A Shop Out to Help Out Scheme would encourage consumers to ‘ditch their screens’ and support their local shops, she says. ‘This is a unique opportunity to redefine our high streets, but without government support we'll be bracing for a retail bloodbath.’ Retail expert Kate Hardcastle agrees, pointing out that independent retailers were the ones who ‘really demonstrated their worth’ in the early days of the pandemic in coming to their communities' aid when other retailers didn't have their online shopping offerings ready. She is concerned that everyone will forget about them now. 'Just telling people to shop small as has been previous campaigns might serve as a reminder, not an action,’ she tells the BBC. ‘Just as the case was with Eat Out to Help Out, we need to see our government support small businesses longer term. I'd love to see initiatives to make it easier for small businesses to open up on the High Street and rejuvenate.’ A Treasury spokesman said: ‘We've supported retailers across the UK though out the outbreak, protecting millions of jobs - and will continue to do so in the months ahead. Shops won't pay any business rates until July, can continue to furlough staff until September, and are receiving Restart Grants of up to £6,000.’",
                russon, business, uk, "2021-03-30", 0, "https://ichef.bbci.co" +
                ".uk/news/976/cpsprodpb/11BE4/production/_117767627_1fe55671-9b32-4f69-a483-71d580ebf354.jpg");
        articleRepository.save(business2);

        Article business3 = new Article("Can a VR headset or pot plant boost productivity?", "Working from home " +
                "through the pandemic has been a challenge, but some UK firms have tried to lessen the pain by " +
                "sending out free perks.", "From Apple products to food hampers, gifts are being showered on some lucky staff as rewards for hard work. But do corporate goodies actually help to boost productivity and job satisfaction? It's long been known that if you get a job with a global tech giant like Google or Facebook, you're likely to enjoy workplace benefits like free food, pool tables, video games and social events. Job seekers will even compare companies based on the perks they offer when choosing where to apply. \n" +
                "\n" +
                "The idea, which originated in the US, is that if staff spend more time in the workplace, even if they're having fun, they will be more likely to do more work. That Silicon Valley-style thinking spread to tech firms across the pond, but during the pandemic, other industries have started to look offering at non-monetary benefits too. To thank them for their hard work under difficult circumstances, employees at investment bank Jefferies were recently told they could choose from a reward of a Peloton exercise bike, or an ‘Apple package’ consisting of an Apple Watch, and iPad Air and AirPods Plus.\n" +
                "Others have offered everything from tea bags, biscuits and Easter eggs, to virtual reality headsets, takeaway app gift vouchers and subscriptions to meditation apps. \n" +
                "\n" +
                "John Bevan is a consultant at BrightCarbon, a Manchester-based design agency that specialises in creating e-learning content. Through the pandemic, the firm has sent out surveys every fortnight asking staff how they feel. One question asked was whether staff had an interest in virtual reality (VR) - a technology the agency was thinking about implementing in its work. All the staff who expressed an interest were sent Oculus Quest 2 headsets to play with, and today, almost all 80 employees at the company have one. BrightCarbon's staff have been holding virtual social events to help each other cope mentally through lockdowns, from VR rock climbing and archery to dancing games, fitness and fishing trips. ‘It's absolutely boosted my morale and my family's and all of my team's as well,’ Mr Bevan tells the BBC. ‘It really has connected people with others in the business they don't talk to.’ And as a bonus, the agency has been able to use what it has learned from employees' interactions to help design new offerings for its clients.\n" +
                "\n" +
                "Jordan Roe is a client manager at Cheshire-based financial planners Equilibrium, which has just under 100 staff. Since the pandemic began, the company has been sending him potted plants, seeds for growing herbs, handwritten cards containing motivational messages, positivity pin badges and a variety of food, as well as putting on after work activities like pub quizzes and bingo on Zoom.\n" +
                "\n" +
                "Equilibrium even has an annual tradition of treating its staff to fish and chips on Blue Monday - a day in January reputed to be the most depressing of the year (although there is no scientific basis to this). Because staff were working from home this year, the firm sent over custom-made fish and chip boxes, with the meal wrapped in \"The Equilibrium Times\", a made-up company newspaper detailing staff achievements and jokes. ‘It made a difference - it reinforced the fact that the company really does care for you and you still feel connected to your team, even though you're by yourself,’ says Mr Roe, who has worked for Equilibrium for three years. ‘It was a main driver for me in coming to work here - it was the company's culture, and its reputation with both staff and clients.’\n" +
                "\n" +
                "But regardless of gifts big or small, new research shows that staff are often quite happy to motivate themselves. The Chartered Institute of Personnel and Development (CIPD) says productivity increases, not decreases when working from home. The body, which represents HR professionals, surveyed 2,000 employers and found that two thirds believe remote working has either improved productivity, or hasn't negatively impacted it. ‘The evidence between productivity and gifts is patchy,’ Charles Cotton, the CIPD's senior reward and performance adviser tells the BBC.\n" +
                "‘Whilst there can be some short term boost to commitment and loyalty, over the medium to longer term, that feeling can dissipate, unless the gift is particularly memorable.’\n" +
                "He points out that some of the perks are a ‘one size fits all’ - food hampers might not be suitable for someone with a food intolerance, so employers need to make sure they cater to employees' needs when considering such gifts.\n" +
                "But most of all, the CIPD says the research highlights the fact that there is no longer such a taboo" +
                " around flexible working. The survey showed 63% of employers are planning to expand their use of " +
                "flexible working arrangements going forward. Mr Cotton thinks that after the pandemic, a ‘win-win " +
                "scenario' could emerge for both employers and employees. ‘It is unlikely that employers will be " +
                "looking to flog off their buildings because they will still need them for some days of the week, but" +
                " it's also unlikely that everyone will be working Monday to Friday in the office. There's a balance " +
                "to be struck between the two extremes - it's a case of allowing employees the flexibility and " +
                "responsibility of managing themselves.’", russon, business, uk, "2021-04-01", 0, "https://ichef.bbci" +
                ".co.uk/news/976/cpsprodpb/1297/production/_117795740_vr-john.jpg");
        articleRepository.save(business3);

        Article business4 = new Article("We're at a moment of real change in the world of work", "Royal Bank of " +
                "Scotland's decision to allow 50,000 staff to work from home for the rest of 2020 underlines radical " +
                "changes in the workplace, experts say.", "RBS said it was taking a ‘cautious approach’ to keeping staff safe, a move echoed by similar decisions at the likes of Facebook, Google and Fujitsu.\n" +
                "The pandemic has forced a change in attitude among employers, said personnel expert Peter Cheese. He called it 'a moment of real change in the world of work’. And it is a change, added Mr Cheese, head of the Chartered Institute of Personnel and Development (CIPD), that puts staff more at the centre of operations. \n" +
                "\n" +
                "Originally, RBS had intended for its employees to work from home until the end of September, but it has now extended the period to early 2021. On 17 July, UK Prime Minister Boris Johnson said companies would have more discretion to bring staff back to workplaces if it is safe to do so, from 1 August onwards. A spokeswoman for RBS said: ‘Like we've done throughout the pandemic the decision has been made carefully, including considering the latest guidance from the UK government on Friday and our own health and safety standards and procedures. It's a cautious approach but we feel the right one to take currently. We're in a fortunate position that so many of our colleagues can work from home and we feel it's the right decision to continue doing so into 2021.’\n" +
                "\n" +
                "Since the coronavirus lockdown began, about 10,000 RBS employees have continued to work in branches and some offices to support customers, while another 450 employees whose jobs cannot be done at home returned to offices and call centres in June.\n" +
                "\n" +
                "RBS says that it has been reconsidering how the bank works ‘in the longer term’ and intends to tell staff about ‘future ways of working' later this year.\n" +
                "According to Mr Cheese, the pandemic is ‘forcing different thinking’ from employers about the viability of allowing employees to work flexibly.\n" +
                "'We're at a moment of real change in the world of work, driven by big existential crises. It's a big paradigm shift, putting people much more at the centre of thinking,’ he said.\n" +
                "\n" +
                "The CIPD, which represents HR professionals, says the UK has long lagged behind other nations in part-time work, due to a prevailing ‘culture of presenteeism’, where bosses judge staff performance based on how many hours they spend in the office. There is also a long-standing stigma around working from home, but the CIPD says the coronavirus lockdown has been an eye-opener for businesses.\n" +
                "\n" +
                "A recent survey of 1,046 employers by the CIPD found that 28% believe the increase in homeworking during lockdown has increased productivity or efficiency. More than half of workforces have been working from home continuously since March, and employers expect the proportion of staff who work from home all the time to rise to 22% post-pandemic, compared with 9% previously.\n" +
                "‘\n" +
                "There's a longstanding belief that if you're working from home, you're shirking from home - you're doing other things that are not work,' said Mr Cheese. 'Bosses are starting to shift towards judging output, rather than the number of hours spent in front of the computer.’ He said the pandemic had forced bosses to care more about the physical and mental wellbeing of their staff. 'It's the biggest experiment we've ever had in homeworking. A lot of individuals quite like this - they have better work-life balance and they don't feel they're being scrutinised, and they don't have to commute,' said Mr Cheese.\n" +
                "\n" +
                "Not everyone wants to work from home, whether it's because they live alone, or they have challenging personal circumstances, such as caring for young children or relatives. But the pandemic is making employers see staff as people, as opposed to 'tools' of the business, he added. 'Understanding those aspects of their wider lives and their mental wellbeing - it's created a mindset shift of understanding how we can manage people better.’\n" +
                "\n" +
                "Entrepreneurs, business strategists and HR experts have been discussing the anthropology of work and its social and economic impacts for at least a decade, and the notion of flexible working has kept coming up. Although the pandemic has accelerated thinking about how business processes could be changed to accommodate flexible working, the CIPD thinks it is unlikely that many firms will give up having physical office premises. Instead, the industry body thinks that office spaces will become places where some staff work, or they work in the office at different times and on different days, and that the office space will be used more for face-to-face meetings.\n" +
                "\n" +
                "'In the end, businesses need to make money, but not at any cost,' said Mr Cheese. 'What's driven a " +
                "lot of this thinking is the concept that the only person who matters is the financial stakeholder, " +
                "but now we're looking at multidisciplinary stakeholders - the business is responsible to their " +
                "people, society and the environment.'", russon, business, uk, "2020-07-21", 0, "https://ichef.bbci" +
                ".co.uk/news/976/cpsprodpb/13364/production/_112029687_gettyimages" +
                "-1005194764.jpg");
        articleRepository.save(business4);

        Article business5 = new Article("How to get promoted when working from home", "With a great many of us still " +
                "working from home, how can you hope to get promoted if you aren't in the office? What's the best way" +
                " to make your boss notice you, and to stand out from your colleagues?", "Salesman John says that you have to regard the emails you send to your manager as an art form that needs to be perfected. 'If you are working from home, then when you email your boss you cannot be just to the point, instead you have to express your wider knowledge,' says the 45-year-old, who preferred not to share his surname. 'But you don't want him or her to know that you are showing off, you have to be subtle. 'And then when you get an email from them, you have to really study the tone, and it is the same for Zoom calls. If you work from home, and want to get promoted, you have a fight on your hands. And much more so if some of your colleagues are still going into the office.’\n" +
                "\n" +
                "For anyone who remembers the advice columns in teenage magazines on how to get a boyfriend or girlfriend, then some of the tips on offer (in books, newspapers, and internet forums) on how to persuade your boss to promote you are strangely familiar - smile, be polite and flatter. And then ask for what you want, because if you don't ask you won't get. Be it a new love interest, or a promotion.\n" +
                "\n" +
                "But if you want to rise through the ranks at work, being based at home as a result of the continuing coronavirus pandemic undoubtedly makes it more of a challenge. After all, if you are working from your kitchen table or study, you are not going to bump into your boss, see them in person every day in meetings, or have a chance to bend their ear in the corridor. And from your boss's perspective, while he or she can easily tell how hard someone is working in the office, it is sometimes hard for them to resist the nagging fear that home workers are playing with their kids, walking the dog, or baking a sourdough loaf.\n" +
                "\n" +
                "Melanie Wilkes, a senior policy adviser at the Work Foundation think tank, says it is important that employees working hard from home keep in close contact with their boss.\n" +
                "'We are seeing many workers taking on multiple responsibilities that they didn't do before the " +
                "crisis,' she says. 'So make sure that is noticed and noted, even if it is just an email.' \n" +
                "Top tips to help secure that promotion:\n" +
                "Keep in regular contact with your boss by email, phone, or video call\n" +
                "Let him or her know how much work you are doing\n" +
                "Ask for more responsibility\n" +
                "Put forward ideas\n" +
                "Ensure you have your annual assessment\n" +
                "Make sure your firm follows existing HR policy\n" +
                "\n" +
                "All this also works in the other direction - bosses must make sure they know which employees are working particularly hard and well from home.\n" +
                "'As a manager, how am I going to tell if people are doing well at home?' says Anne Sammon, a partner at law firm Pinsent Masons. 'Bosses have to be mindful of getting more data, so they know what is going on.'\n" +
                "After all, if employees suddenly discover that everyone who went into the office is getting promoted and all those who worked from home are not, there could be very good grounds for a discrimination case.\n" +
                "Anne Davies, professor of law and public policy at Oxford University, agrees that bosses need to closely study how well stay-at-home staff are performing.\n" +
                "'If you have people working from home, you should agree on how you are going to monitor their work, and have objective criteria for assessing how they are doing,' she says. 'When you promote someone, it is always open to challenge on discrimination grounds, and you have to be able to show that you are being fair.'\n" +
                "\n" +
                "Prof Clarke says that bosses have to remember that it is in their interest to find the best employees to promote.\n" +
                "'Managers are going to have to work harder to spot the workers who are making a real effort [at home],' she says. 'If you [as a manager] are really hoping to make a difference in your business, you have to be able to spot the talented ones who are making a bigger contribution.'\n" +
                "But back at his home study in the West Midlands, salesman John is still worried that his colleagues who have continued to go into the office are at an unfair advantage.\n" +
                "'If my work is of the same quality as someone who can successfully befriend and banter with the boss in the same room, then he or she is going to be promoted over me,' he says.\n" +
                "'And it is not just about being recognised for doing a good job, it is also about being able to " +
                "blame someone else if something goes wrong. Often things, good or bad, at work are a team effort. " +
                "And if you are actually in the office with the boss, then if something does go wrong, you can " +
                "sneakily say, 'It was John's fault.’'", bloom, business, uk, "2020-10-12", 0, "https://ichef.bbci.co" +
                ".uk/news/976/cpsprodpb/CF95/production/_114814135_gettyimages" +
                "-653859322.jpg");
        articleRepository.save(business5);

        Article business6 = new Article("A wristband that tells your boss if you are unhappy", "At first glance the " +
                "silicone wristband could be mistaken for one that tracks your heart rate when you are doing exercise" +
                ".", "However, the wearable technology, called a Moodbeam, isn't here to monitor your physical health. Instead it allows your employer to track your emotional state.\n" +
                "The gadget, which links to a mobile phone app and web interface, has two buttons, one yellow and one blue. The idea is that you press the yellow one if you are feeling happy, and the blue one if you are sad.\n" +
                "Aimed at companies who wish to monitor the wellbeing of staff who are working from home, the idea is that employees are encouraged to wear the wristband (they can say no), and press the relevant button as they see fit throughout the working week.\n" +
                "Managers can then view an online dashboard to see how workers are feeling and coping. With bosses no longer able to check in physically with their team, Moodbeam hopes to bridge the gap.\n" +
                "'Businesses are trying to get on top of staying connected with staff working from home. Here they can ask 500 members: 'You ok?' without picking up the phone,' says Moodbeam co-founder Christina Colmer McHugh.\n" +
                "\n" +
                "She originally came up with the idea for the product after she discovered that her daughter was struggling at school, and she wanted a way for her child to let her know how she was feeling. The wristband was launched commercially in 2016.\n" +
                "With many children, especially teenagers, likely to balk at the idea of having to press a button on a wristband to let their parents know how they are doing, how probable is it that employees would be willing to do the same for their boss?\n" +
                "Ms Colmer McHugh, whose firm is based in Hull, says that many are indeed happy to do so. 'We moved away from anonymous to identifiable data after trials found that people do want to be identified,' she says.\n" +
                "One organisation now using Moodbeam is UK charity Brave Mind.\n" +
                "'One member of the team was in an uncomfortable place, struggling with a huge workload, and disillusioned with what was going on,' says trustee Paddy Burtt. 'It's not something he would have flagged up, and we wouldn't have known about it unless we had seen the data.'\n" +
                "With depression and anxiety estimated to have cost the global economy $1 trillion (£730bn) per year in lost productivity before the pandemic, according to the World Health Organization, mental health in the workplace has long been a concern. However, Covid-19 lockdowns and home working appear to have worsened the issue.\n" +
                "UK mental health charity Mind said last year that 60% of adults thought their mental health had got worse during the first lockdown. And a survey by human resources software firm Employment Hero suggested that a quarter of people employed by small and medium-sized UK firms wanted more mental health support during the pandemic.\n" +
                "\n" +
                "With most of us not due to return to the office any time soon, a number of other technology firms are also exploring ways to help companies better look after their employees' emotional wellbeing.\n" +
                "In San Francisco, mental wellness app Modern Health aims to help employers more easily connect their workers with a variety of mental health resources, such as sessions with therapists.\n" +
                "The journey starts with staff answering a short online questionnaire about their mental health, leading to a personalised mental healthcare plan. This could involve video call sessions with an expert on dealing with anxiety, or being directed to a digital meditation plan.\n" +
                "'The idea is to give employees the tools to build resilience,' says Alyson Watson, chief executive of Modern Health, which has 190 companies around the world signed up. 'People are working from home and struggling. Leaders can no longer expect employees to compartmentalise what is going on at work and in their personal life.'\n" +
                "\n" +
                "This blurring of our work life and downtime is one key aspect of working from home that many of us struggle with. To help better separate the two, Microsoft is set to implement a 'virtual commute' across its Teams file-sharing and video-conferencing app.\n" +
                "Billed as a mental bookend for the workday, as the end of the day approaches, users will receive a notification. This will prompt them to go through a series of activities such as adding pending tasks to a to-do list for the next day, reflect on how they felt about the day, and a guided meditation session via the Headspace meditation and sleep app.\n" +
                "\n" +
                "'Nobody enjoys commuting, but in our research we found that people appreciated the cognitive separation to mindfully transition between work and life,' says Kamal Janardhan, Microsoft's general manager for workplace intelligence. 'There is a need to empower people to create structure and wellbeing in long workdays.'\n" +
                "Mental health charity Mind says that as people continue to work from home 'it is really important [that employers] commit to prioritising staff mental health'.\n" +
                "'Those who prioritise staff wellbeing are more likely to report more productive staff, who are less likely to need time off sick or leave... altogether,' says Emma Mamo, Mind's head of workplace wellbeing.\n" +
                "However, some human resources experts warn that increased use of technology should not be used as a quick plaster to help staff working from home. Chris Rowley, professor emeritus of human resource management at Cass Business School, University of London, says it has to be backed up with proper support for employees.\n" +
                "'These are very worthy intentions around mood and mental health,' he says. 'However... employers looking after staff working from home need to reduce staff feelings of isolation by building a sense of belonging and community.'\n" +
                "UK tech firm Yonderdesk aims to help firms do just this by enabling businesses to bring employees back together in the office - virtually.\n" +
                "Yonderdesk builds interactive, web-based digital offices for firms, with employees designated a specific virtual desk. The office can be designed to replicate exactly a company's real one, or have a completely different design or layout.\n" +
                "Want a video call with a colleague? Simply click on their icon. Or if someone from outside the business is getting in touch, they 'appear' in the virtual reception area.\n" +
                "Sheffield-based food company Delicious Alchemy has been trialling Yonderdesk's tool in recent weeks. 'It has been beneficial in creating a sense of being part of a team, despite not being able to be together in one place,' says Nigel Glendinning, Delicious Alchemy's chief executive.\n" +
                "\n", bearne, business, uk, "2021-01-18", 0, "https://ichef.bbci.co" +
                ".uk/news/976/cpsprodpb/05C9/production/_116518410_higher2.jpg");

        articleRepository.save(business6);

        Article business7 = new Article("Google rejigs remote working as it reopens offices", "Google is changing its" +
                " work-from-home policy as it looks to get more people back into its US offices.", "The tech firm said employees can work from home overseas for more than 14 days a year if they apply for it.\n" +
                "Google will continue its current work-from-home arrangements until 1 September but will allow people to return voluntarily from next month.\n" +
                "The tech giant was one of the first companies to offer working from home when the pandemic struck last year.\n" +
                "'It's now been a year since many of us have been working from home, and the thought of returning to the office might inspire different emotions,' Fiona Cicconi, Google's head of people operations, wrote in a company email on Wednesday.\n" +
                "Google is currently preparing for a broad reopening in September, when employees will be expected to be in the office for at least three days a week.\n" +
                "Until then, the initial return period will be voluntary as offices slowly reopen with limited capacity, based on vaccine availability and a downward trend in Covid-19 cases.\n" +
                "When staff are required to officially return to Google's offices in September, they 'won't look exactly the way you remember them' but 'will include meals, snacks and amenities where possible,' Ms Cicconi said.\n" +
                "'We will even be welcoming our Dooglers back,' she added, referring to Google's bring-your-dog-to-work group. There is now a dog park at its Mountain View campus called The Doogleplex.\n" +
                "The company is advising workers to get vaccinated against Covid-19, but is not making it mandatory for returning to the workplace.\n" +
                "\n" +
                "Google is taking a different approach from its tech rivals who have allowed most staff can continue remote work indefinitely. Twitter has said it will allow most of its employees to work from home permanently.\n" +
                "A number of big companies have plan to test so-called hybrid work arrangements, where employees split their time between home and office.\n" +
                "'None of us have this all figured out,' said Carolyn Everson, vice president of Facebook's global business group, when talking about current work-from-home arrangements.\n" +
                "'We are making this up on the fly. The reality is we are all trying to figure it out together,' the senior Facebook executive told a panel hosted by Bloomberg.\n" +
                "Facebook will start to reopen its Silicon Valley offices at the beginning in May, after more than a year of working from home during the global pandemic.\n" +
                "Its largest offices won't reach 50% capacity until early September, it said.\n", harper,
                business, usa, "2021-04-01", 0, "https://ichef.bbci.co" +
                ".uk/news/976/cpsprodpb/4B45/production/_117796291_gettyimages-962098266.jpg");
        articleRepository.save(business7);

        Article business8 = new Article("Computer says go: Taking orders from an AI boss", "Will your future boss be " +
                "a computer?", "If your first thought upon reading that sentence was 'well it would be an improvement on my current human one,' you wouldn't be alone.\n" +
                "After all, an artificial intelligence (AI) software system might be better able to organise the staff rota without messing up your holidays.\n" +
                "And getting some unbiased feedback from a line manager who can't be accused of having it in for you or of favouring other staff could make a pleasant change.\n" +
                "However, for those of us who have seen the Terminator movies rather too often, the thought of a computer, or robot, bossing you around is also bound to raise fears that the machines are in danger of taking over.\n" +
                "Yet this ignores the fact that we already spend a lot of time obeying machines, and we don't even think about it, let alone worry.\n" +
                "Jeff Schwartz, a senior partner at business consulting and audit firm Deloitte, and a global adviser on the future of work, points to a simple everyday machine that we all obey unthinkingly.\n" +
                "‘A traffic light used to be a job, there used to be a person who would stand there directing the cars,' he says. 'But very clearly that is now a machine, and it is getting smarter - they are now putting AI into traffic lights [so they can best respond to traffic levels].'\n" +
                "So it seems we are perfectly willing to take orders from a machine in some clearly defined situations.\n" +
                "What has increasingly happened in recent years, however, is that more of us are already being ordered around by computers at work. And experts say that this is only set to increase.\n" +
                "Take taxi firm Uber. There isn't a man or woman in the office giving out the jobs to the drivers. It is done automatically by the company's AI software system.\n" +
                "\n" +
                "Prof Tomas Chamorro-Premuzic, a business psychologist at University College London, says that while Uber does this to make its service as efficient as possible, there are wider benefits.\n" +
                "'Uber the app isn't biased in favour of someone [a customer or a driver] because they are good looking, or went to the right school, or they have the right accent, or they dress well,' he says.\n" +
                "'It is all about performance. You can see how technology could make the world of work more meritocratic by focusing more on substance and less on style.\n" +
                "'Companies that can do that will outperform their rivals and be better places to work.'\n" +
                "\n" +
                "So having a computer boss you about is nothing to be worried about? Shivvy Jervis, founder of business consultancy FutureScape 248, and a forecaster of future working trends, is far from convinced.\n" +
                "'The big caveat here is we need ethical oversight of this,' she says. 'If you have AI being the boss, a piece of software with decision-making ability, that for me is extremely worrying, and I think it could lead to quite a dystopian future.\n" +
                "'A system that doesn't have adequate ethical oversight, an actual human using their sense of judgement to be able to oversee what the system is deeming to be the supposed right conclusion, is extremely damaging, and that is the true threat.'\n" +
                "In the retail sector, Amazon increasingly uses AI systems to direct and monitor staff in its warehouses. This has led to several reports of employees being overworked, accusations that Amazon has repeatedly denied. Amazon says that if the AI notices a worker underperforming, he or she gets additional support and training, which comes from a human.\n" +
                "AI software that both gives work to, and checks on, call centre staff has also been criticised for being too demanding, and unfair.\n" +
                "However, one provider, CallMiner, tells the BBC that because its call centre monitoring system can 'analyse 100% of interactions', human supervisors can use that information 'to be better managers'. And staff can be guided 'to perform better over time, and deliver more effective outcomes for customers'.\n" +
                "\n" +
                "As AI is increasingly used to monitor staff, a big problem could be whether it gets the final say on which of a firm's workers get let go in a downturn, says Ms Jervis.\n" +
                "'A human might actually favour the person who is a single parent with two children depending on his or her monthly income,' she says. 'Or think this other person is well-connected, and will land on their feet.\n" +
                "'Software, even if it is asked these questions, cannot hope to understand the answers in that way.'\n" +
                "\n" +
                "Prof Sandra Wachter, a senior research fellow in AI at Oxford University, says that when many people think of having a computer as a boss 'they wrongly picture a robot standing over them'.\n" +
                "\n" +
                "'Instead, it is all about certain leadership tasks relating to you already being carried out by computer algorithms,' she says.\n" +
                "'So, for example, there could be software systems running in the background monitoring your performance - the number of calls you carry out, tracking your language on calls, the emails you send, the websites you visit, how often you take breaks.\n" +
                "'These can then be used to determine what salary you get or if you get promoted. My main worry is if these algorithms are being used to predict things that it is impossible for them to do so. For example, what a good worker looks like, and who merits promotion, is very subjective.'\n" +
                "In the future this could be an area for governments to legislate on, but it is a bit of a minefield given the blurring between AI and human boss decision making.\n" +
                "\n" +
                "Prof Chamorro-Premuzic says that despite the concerns about AI bosses, it is important to remember that many humans are dreadful line managers.\n" +
                "'It is very hard for a machine to outperform the best of bosses... but it is not very hard for AI to be a good alternative to a really bad boss.'\n" +
                "Prof Wachter adds that human bosses 'should certainly not be seen as the gold standard'.\n" +
                "Mr Schwartz says his hope is that AI bosses may help their human counterparts to improve their performance. He says this is because the computer ones will do more of the boring stuff - compile the rotas, set the simple tasks, carry out the initial performance monitoring etc.\n" +
                "This will enable the sentient homo sapiens bosses to concentrate on being better team leaders.",
                bloom, business, uk, "2021-02-15", 0, "https://ichef.bbci.co" +
                ".uk/news/976/cpsprodpb/986F/production/_116932093_gettyimages-909209638.jpg");

        articleRepository.save(business8);

        Article business9 = new Article("Runway dining at $540 a meal proving hit in Japan", "Japan's biggest airline" +
                " is offering first-class dining on a parked plane at $540 (£392) a meal.", "All Nippon Airways (ANA) started offering the service on Wednesday and has added more slots for April after they sold out quickly.\n" +
                "A number of airlines have been thinking creatively about what to do with grounded planes during the pandemic.\n" +
                "But Australia is trying to get its planes in the air with a $1.2bn (£660m) package to encourage domestic travel.\n" +
                "\n" +
                "The global airline industry is facing its toughest ever challenge to survive amid tough quarantine and travel restrictions, that have already crippled some carriers.\n" +
                "Many have thought of creative ways to boost their revenues, with 'flights to nowhere' proving popular, along with onboard dining on grounded planes.\n" +
                "In October, Singapore Airlines offered diners the opportunity to have lunch on a stationary Airbus A380 parked at the city's main airport. Despite a price tag of up to £380 the first two seating dates sold out within half an hour.\n" +
                "Japan's ANA dining experience takes place on a Boeing 777 parked at Haneda Airport in Tokyo.\n" +
                "While a first-class seat costs 59,800 yen, diners can opt for a cheaper business-class experience for 29,800 yen. The 'restaurant with wings' idea was conceived by employees who wanted to make better use of its parked aircraft.\n" +
                "Last week, British Airways also made its first class menu available through its catering partner DO & Co, although these meals are for home delivery. There's a choice of four different cook-at-home meal kits, each serving two and starting from £80.\n" +
                "\n" +
                "On Thursday, the Australian government launched its $1.2bn package aimed at getting people to spend on domestic travel. The scheme will halve the price of nearly 800,000 airline tickets and runs until the end of July.\n" +
                "Qantas, Virgin Atlantic and Jetstar have released half-price fares to more than 20 destinations. Qantas is also trialling a digital travel app.\n" +
                "On Wednesday, the global airline industry body IATA said a digital travel pass for Covid-19 test results and vaccine certificates will be launched on the Apple platform in mid-April.\n" +
                "'The application will only achieve its success once airlines, different countries, airports adopt " +
                "it,' a spokesman for IATA said, explaining that its travel pass will help speed up check-ins.\n",
                harper, business, restOfWorld, "2021-01-04", 0, "https://ichef.bbci" +
                ".co.uk/news/976/cpsprodpb/16615/production/_117796619_a74ed5e0-1365-416e-9559-e3565c1fba7e.jpg");
        articleRepository.save(business9);

        Article business10 = new Article("Chinese £3,200 budget electric car takes on Tesla", "A budget electric " +
                "vehicle (EV) selling in China for $4,500 (£3,200) is now outselling Tesla's more upmarket cars.", "The compact car is proving a big hit for state-owned SAIC Motor, China's top automaker.\n" +
                "The Hong Guang Mini EV is being built as part of a joint venture with US car giant General Motors (GM).\n" +
                "Last month sales of the budget electric car in China were around double those of Tesla, which was questioned this month over safety issues there.\n" +
                "While the $4,500 Hong Guang Mini is the most popular model, there is an upgraded one with air conditioning for just over $5,000. The cars are being marketed as 'the people's commuting tool'.\n" +
                "The joint venture partnership, SAIC-GM-Wuling, is known as Wuling locally.\n" +
                "\n" +
                "Car experts have said that while it clearly lags well behind Tesla when it comes to its battery, range and performance, its convenience and low price have made it one of China's bestselling 'new-energy' vehicles.\n" +
                "Having launched last year, the basic model has a top speed of 100km/h (62mph) and can accommodate four people at a squeeze.\n" +
                "'China's government is serious about pollution reduction and becoming the global lead in adopting and promoting innovation of electric vehicles,' Shaun Rein, managing director of the China Market Research Group, told the BBC.\n" +
                "'We remain very bullish on the adoption of budget EVs like the Hong Guang Mini to higher end ones like NIO and Tesla.'\n" +
                "To promote EVs, the Chinese government offers license plates for free and they are guaranteed. In many cities, it can take months, if not years, to get a license plate for a petrol engine through various auction systems.\n" +
                "\n" +
                "The Hong Guang Mini EV saw sales of 112,000 for the second half of 2020, ranking second behind Tesla's Model 3 which are made in its Shanghai factory.\n" +
                "Earlier this month five Chinese regulators summoned Tesla over quality and safety issues at its plant. China is Tesla's largest market after the US.\n" +
                "For January, Hong Guang Mini sales outstripped Tesla almost two-to-one. It is now believed to be the second-best-selling electric model worldwide behind the Model 3.\n" +
                "\n" +
                "The tiny, all-electric EV sold 25,778 models in China in January according to the China Passenger Car Association (CPCA). This compares to 13,843 for the Tesla Model 3.\n" +
                "But high-end electric vehicles have still been performing well with Tesla more than doubling its sales volume in China last year.\n" +
                "The Model 3 sells for about $39,000 (£27,000) in China factoring in price cuts due to its local production.\n" +
                "The Hong Guang Mini EV could make an appearance outside China, as Wuling has said it plans to export the EV overseas.\n" +
                "'China has so many makers of small and cheap electric vehicles, however most of them are low-quality and low-speed products that do not appeal to a wide market, said Sam Fiorani, at Auto Forecast Solutions.\n" +
                "'The Hong Guang Mini is the first time a major company has stepped up with a simple EV that targets buyers looking for a real car.'\n" +
                "Reports have linked Wuling to a Latvian automaker who could sell a version of the car in Europe. " +
                "However, the price is likely to be twice as high due to European environmental requirements.\n",
                harper, business, restOfWorld, "2021-02-25", 0, "https://ichef.bbci" +
                ".co.uk/news/976/cpsprodpb/DD5C/production/_117286665_saic.jpg");

        articleRepository.save(business10);

        Article politics1 = new Article("Biden Wins Presidency, Ending Four Tumultuous Years Under Trump",
                "Joseph R. Biden Jr. achieved victory offering a message of healing and unity. He will return to Washington facing a daunting set of crises.",
                "Joseph Robinette Biden Jr. was elected the 46th president of the United States on Saturday, promising to restore political normalcy and a spirit of national unity to confront raging health and economic crises, and making Donald J. Trump a one-term president after four years of tumult in the White House.\n" +
                        "Mr. Biden’s victory amounted to a repudiation of Mr. Trump by millions of voters exhausted with his divisive conduct and chaotic administration, and was delivered by an unlikely alliance of women, people of color, old and young voters and a sliver of disaffected Republicans. Mr. Trump is only the third elected president since World War II to lose re-election, and the first in more than a quarter-century.\n" +
                        "\n" +
                        "The result also provided a history-making moment for Mr. Biden’s running mate, Senator Kamala Harris of California, who will become the first woman to serve as vice president.\n" +
                        "\n" +
                        "With his triumph, Mr. Biden, who turns 78 later this month, fulfilled his decades-long ambition in his third bid for the White House, becoming the oldest person elected president. A pillar of Washington who was first elected amid the Watergate scandal, and who prefers political consensus over combat, \n" +
                        "\n" +
                        "Mr. Biden will lead a nation and a Democratic Party that have become far more ideological since his arrival in the capital in 1973.\n" +
                        "\n" +
                        "This election represented the culmination of nearly four years of activism organized around opposing Mr. Trump, a movement that began with the Women’s March the day after his inauguration. Indeed, Mr. Biden’s election appeared less the unique achievement of a political standard-bearer than the apex of a political wave touched off by the 2016 election — one that Mr. Biden rode more than he directed it.\n" +
                        "But Mr. Trump’s job approval rating never hit 50 percent and, when the coronavirus spread nationwide and Mr. Biden effectively claimed the Democratic nomination in March, the president’s hopes of running with a booming economy and against a far-left opponent evaporated at \n" +
                        "once.\n" +
                        "\n" +
                        "Still, many Democrats were nervous and some Republicans were defiantly optimistic going into the election, both still gripped by Mr. Trump’s shocker four years ago. And well into the night Tuesday, it seemed as if the president might be able to do it again. But four days later, after a year of trial in America and four turbulent years of the Trump administration, victory was in hand for Mr. Biden.",
                gordon, politics, usa, "2020-11-07", 0,
                "https://www.ft.com/__origami/service/image/v2/images/raw/https%3A%2F%2Fd1e00ek4ebabms.cloudfront.net%2Fproduction%2F95882b48-552e-4d04-be0a-4aee37940671.jpg?fit=scale-down&source=next&width=700");
        articleRepository.save(politics1);

        Article politics2 = new Article("Twitter says Trump ban is permanent – even if he runs for office again",
                "Chief financial officer says ‘when you’re removed, you’re removed … our policies don’t allow people to come back’",
                "Donald Trump’s ban from the social media platform Twitter is going to stick even if he runs for the White House again – and even if he won again, a senior executive said on Wednesday.\n" +
                        "\n" +
                        "The former president’s permanent block from Twitter is permanent, Twitter’s chief financial officer, Ned Segal, said during an interview on CNBC when he was asked whether Trump’s tweeting privileges could be restored if he ever returns to power.\n" +
                        "\n" +
                        "Only if Trump is convicted at his impeachment can he be barred from holding federal office again, in a subsequent vote. He is free to run for the presidency again if he is, as is likely, acquitted.\n" +
                        "\n" +
                        "Twitter made the unprecedented move to ban Trump from the platform after the Capitol insurrection, with the company saying it was permanently suspending Trump “due to the risk of further incitement of violence”.\n" +
                        "\n" +
                        "Shortly before that, Twitter had already temporarily locked Trump’s account over several tweets that it said contributed to an elevated risk of violence.",
                williams, politics, usa, "2021-02-10", 0,
                "https://i.guim.co.uk/img/media/1bd30d4de3a6e57cbaa925b964641b72942eff1a/0_110_4090_2454/master/4090.jpg?width=605&quality=85&auto=format&fit=max&s=f5a609ce122ea71536755e7ddfefd58a");
        articleRepository.save(politics2);

        Article politics3 = new Article("Myanmar coup: What is happening and why?",
                "Mass protests have been taking place across Myanmar since the military seized control on 1 February.",
                "Elected leader Aung San Suu Kyi and members of her National League for Democracy (NLD) party are among those detained.\n" +
                        "\n" +
                        "Hundreds of people, including children, have been killed.\n" +
                        "\n" +
                        "Where is Myanmar?\n" +
                        "Myanmar, also known as Burma, is in South East Asia. It neighbours Thailand, Laos, Bangladesh, China and India.\n" +
                        "\n" +
                        "It has a population of about 54 million, most of whom are Burmese speakers, although other languages are also spoken. The biggest city is Yangon (Rangoon), but the capital is Nay Pyi Taw.\n" +
                        "\n" +
                        "The main religion is Buddhism. There are many ethnic groups in the country, including Rohingya Muslims.\n" +
                        "\n" +
                        "The country gained independence from Britain in 1948. It was ruled by the armed forces from 1962 until 2011, when a new government began ushering in a return to civilian rule.\n" +
                        "\n" +
                        "Why is Myanmar also known as Burma?\n" +
                        "The ruling military changed the country's name from Burma to Myanmar in 1989. The two words mean the same thing but Myanmar is the more formal version.\n" +
                        "\n" +
                        "Some countries, including the UK, initially refused to use the name as a way of denying the regime's legitimacy.\n" +
                        "\n" +
                        "But use of \"Myanmar\" has become increasingly common, and in 2016 Ms Suu Kyi said it did not matter which name was used.\n" +
                        "\n" +
                        "What has happened now, and why?\n" +
                        "\n" +
                        "The military is now back in charge and has declared a year-long state of emergency.\n" +
                        "\n" +
                        "It seized control on 1 February following a general election which Ms Suu Kyi's NLD party won by a landslide.\n" +
                        "\n" +
                        "The armed forces had backed the opposition, who were demanding a rerun of the vote, claiming widespread fraud.\n" +
                        "The election commission said there was no evidence to support these claims.\n" +
                        "\n" +
                        "The coup took place as a new session of parliament was set to open.\n" +
                        "\n" +
                        "Ms Suu Kyi has been held at an unknown location since the coup. She is facing various charges, including violating the country's official secrets act, possessing illegal walkie-talkies and publishing information that may \"cause fear or alarm\".\n" +
                        "\n" +
                        "NLD MPs who managed to escape arrest formed a new group in hiding. Their leader has urged protesters to defend themselves against the crackdown.\n" +
                        "\n" +
                        "Who is in charge now?\n" +
                        "\n" +
                        "Military commander-in-chief Min Aung Hlaing has taken power.\n" +
                        "\n" +
                        "He has long wielded significant political influence, successfully maintaining the power of the Tatmadaw - Myanmar's military - even as the country moved towards democracy.\n" +
                        "\n" +
                        "He has received international condemnation and sanctions for his alleged role in the military's attacks on ethnic minorities.\n" +
                        "\n" +
                        "In his first public comments after the coup, Gen Hlaing sought to justify the takeover. He said the military was on the side of the people and would form a \"true and disciplined democracy\".\n" +
                        "\n" +
                        "The military says it will hold a \"free and fair\" election once the state of emergency is over.\n" +
                        "\n" +
                        "How have people reacted?\n" +
                        "\n" +
                        "The protests over the coup have been the largest since the so-called Saffron Revolution in 2007, when thousands of monks rose up against the military regime.\n" +
                        "\n" +
                        "Protesters include teachers, lawyers, students, bank officers and government workers.\n" +
                        "\n" +
                        "The military has imposed restrictions, including curfews and limits to gatherings.\n" +
                        "\n" +
                        "Security forces have used water cannon, rubber bullets and live ammunition to try to disperse protesters.\n" +
                        "\n" +
                        "On 27 March, in the deadliest day since the coup, more than 100 people were killed.\n" +
                        "\n" +
                        "Who is Aung San Suu Kyi?\n" +
                        "\n" +
                        "Aung San Suu Kyi became world-famous in the 1990s for campaigning to restore democracy.\n" +
                        "\n" +
                        "She spent nearly 15 years in detention between 1989 and 2010, after organising rallies calling for democratic reform and free elections.\n" +
                        "\n" +
                        "She was awarded the Nobel Peace Prize in 1991 while under house arrest.\n" +
                        "\n" +
                        "In 2015, she led the NLD to victory in Myanmar's first openly contested election in 25 years\n" +
                        "\n" +
                        "What about the crackdown on Rohingya?\n" +
                        "\n" +
                        "Ms Suu Kyi's international reputation has suffered greatly as a result of Myanmar's treatment of the Rohingya minority.\n" +
                        "\n" +
                        "Myanmar considers them illegal immigrants and denies them citizenship. Over decades, many have fled the country to escape persecution.\n" +
                        "\n" +
                        "Thousands of Rohingya were killed and more than 700,000 fled to Bangladesh following an army crackdown in 2017.\n" +
                        "Ms Suu Kyi appeared before the International Court of Justice in 2019, where she denied allegations that the military had committed genocide.\n" +
                        "\n" +
                        "What has the international reaction been to the coup?\n" +
                        "\n" +
                        "Numerous countries have condemned the military takeover and subsequent crackdown. US Secretary of State Antony Blinken has accused the security forces of a \"reign of terror\".\n" +
                        "\n" +
                        "The US, UK and European Union have all responded with sanctions on military officials.\n" +
                        "\n" +
                        "China blocked a UN Security Council statement condemning the coup, but has backed calls for the release of Ms Suu Kyi and a return to democratic norms. The country has previously opposed international intervention in Myanmar.\n" +
                        "\n" +
                        "South East Asian countries have been pursuing diplomatic efforts to end the crisis.",
                harkness, politics, restOfWorld, "2021-04-01", 0,
                "https://ichef.bbci.co.uk/news/976/cpsprodpb/77D1/production/_117337603_hi065797857.jpg");
        articleRepository.save(politics3);


        Article politics4 = new Article("Russia passes bill that would allow Putin to stay in power past 2024",
                "A nationwide vote on the proposed constitutional amendments is set for April 22.",
                "MOSCOW — The Russian parliament approved a sweeping constitutional reform in the third and final reading Wednesday, a move that will allow President Vladimir Putin to stay in power for another 12 years after his current term ends in 2024.\n" +
                        "\n" +
                        "The Kremlin-controlled lower house, the State Duma, endorsed a set of amendments to the constitution and a provision resetting the term count for Putin after the revised constitution goes into force by a 383-0 vote with 43 abstentions.\n" +
                        "\n" +
                        "A nationwide vote on the proposed amendments is set for April 22" +
                        "Kremlin critics condemned the move as a cynical manipulation and called for protests.\n" +
                        "\n" +
                        "Putin, a 67-year-old former KGB officer, has ruled Russia for more than 20 years. After serving for two consecutive four-year terms — a limit outlined in the current version of the constitution — Putin shifted to prime minister's seat in 2008, with his close ally Dmitry Medvedev becoming a placeholder president.\n" +
                        "\n" +
                        "The length of the presidency was extended to six years under Medvedev, and in 2012 Putin returned to the Kremlin as president. In 2018, he was re-elected for another six years." +
                        "The constitutional reform passed by the Duma on Wednesday would allow Putin to run for presidency two more times after 2024. Ahead of the national vote, it will be reviewed by Russia's Constitutional Court.\n" +
                        "\n" +
                        "The changes redistribute the executive powers of the Russian government in Moscow and further strengthen the power of the presidency, while also banning same-sex marriage and listing “a belief in God” as one of Russia's traditional values.\n" +
                        "\n" +
                        "The proposal to restart the term clock for the current president was put forward by 83-year-old former Soviet cosmonaut Valentina Tereshkova, now a Duma deputy, during the second reading of the amendments on Tuesday.\n" +
                        "\n" +
                        "Following Tereshkova's speech, Putin quickly arrived at parliament to address the lawmakers and supported the idea.",
                cooper, politics, restOfWorld, "2021-03-11", 0,
                "https://media1.s-nbcnews.com/j/newscms/2020_11/3264976/200311-vladimir-putin-mc-943_8ed9d167ef804215521bdb037b15062c.fit-2000w.JPG");
        articleRepository.save(politics4);



        Article politics5 = new Article("What does Alex Salmond's new party mean for the election?",
                "The return of Alex Salmond to the political fray has sent a shockwave through the Holyrood election campaign.\n" +
                        "\n",
                "Few would have imagined in the years that followed his defeat as an MP in the 2017 general election that his comeback would be at the helm of a new party.\n" +
                        "\n" +
                        "He insists that Alba is not a threat to the SNP. But given he has also announced a series of high-profile defections, the idea of a split seems inescapable.\n" +
                        "\n" +
                        "Mr Salmond believes that adding a bloc of Alba Party MSPs would create an independence \"supermajority\" at Holyrood.\n" +
                        "The former first minister has no designs on going back into government, in a coalition or other formal agreement with the SNP.\n" +
                        "\n" +
                        "He may hope his group could act a bit like a pressure group that has enough votes to bend the rest of parliament to its will, and hold First Minister Nicola Sturgeon's feet to the fire on a second independence referendum.\n" +
                        "\n" +
                        "It remains to be seen if there is a public appetite for Mr Salmond's new vehicle.\n" +
                        "\n" +
                        "But by running candidates across Scotland, it has the potential to change the nature of the race in more or less every seat - partly because of the way Scotland's voting system works.\n" +
                        "\n" +
                        "Under that system, MSPs can be elected either as a representative of a constituency, or from one of eight regions of Scotland using a \"top up\" system of proportional representation.\n" +
                        "\n" +
                        "The more constituency seats you win in any area, the harder it is to win list seats. In 2016, the SNP won the vast majority of constituency seats - and as a direct result returned just four regional list MSPs.\n" +
                        "\n" +
                        "Mr Salmond believes this means most SNP list votes are \"wasted\", and could instead be given to his new list-only party - which would have zero constituency MSPs, and thus a better chance of winning regional seats.\n" +
                        "\n" +
                        "However, the SNP cannot afford to just ignore the lists. When they won a majority in 2011, it was with the help of no fewer than 16 list seats.\n" +
                        "\n" +
                        "They are unlikely to win every single constituency, and thus must try to balance out any local defeats with list seats - from a pragmatic standpoint, their campaign has to be \"both votes SNP\".\n" +
                        "\n" +
                        "There is an impact on other parties beyond the SNP, too. Two start-up groups, Action for Independence and the Independence for Scotland Party, have already withdrawn all of their candidates in support of Mr Salmond's goals.\n" +
                        "\n" +
                        "The Scottish Greens stand primarily on the regional lists, and usually aim to sweep up the \"second votes\" of pro-independence types who vote SNP in their constituencies.\n" +
                        "\n" +
                        "The party has put independence at the heart of its campaign for 2021, pledging that all of its MSPs in the next term will back a push for indyref2.\n" +
                        "\n" +
                        "The likes of the Conservatives, Labour and Liberal Democrats will no doubt have watched Mr Salmond's announcement with popcorn in hand, hoping it will put a dent in the SNP's electoral juggernaut.\n" +
                        "\n" +
                        "However, there are only 56 list seats to go around, so even the Unionist parties might be casting a nervous eye over the margins in some regions.\n" +
                        "\n" +
                        "They might not be chasing the same voters, but they could still face being edged out if Alba wins some of those seats.\n" +
                        "\n" +
                        "There may be two different ways of winning seats at Holyrood, and two different ballot papers - but there is only one campaign.\n" +
                        "\n" +
                        "The emergence of a new party could have a huge impact on the debate as a whole, and on the questions posed each day - potentially recasting the whole campaign.\n" +
                        "\n" +
                        "Nicola Sturgeon had hoped to spend this campaign talking about her pandemic leadership, and about her vision for independence - not Alex Salmond's.\n" +
                        "\n" +
                        "Now, she may be doomed to the \"Sturgeon vs Salmond\" psychodrama of recent months dragging on for another six weeks.\n" +
                        "\n" +
                        "One immediate example of how Mr Salmond may change the debate was when he was asked about an independence referendum at the Alba launch event, and mused about what other routes there may be to securing self-determination.\n" +
                        "\n" +
                        "So already there are questions for Ms Sturgeon about her strategy. She could now be continually asked to react to Mr Salmond's position on independence, rather than dictating the debate on a topic which should really be home turf for her.\n" +
                        "\n" +
                        "Mr Salmond also wants to move on from the questions of recent years about the government's mishandling of complaints against him and about the \"malicious plot\" he claims there was against him.\n" +
                        "\n" +
                        "In every interview, he has been asked about his own conduct. Each time he responds that there have been several court cases and judges, a jury - which acquitted him of charges of sexual assault in March 2020 - and a number of inquiries. And that should be the end of the matter.\n" +
                        "\n" +
                        "However, the problem for politicians is that they cannot control the questions they are asked on the campaign trail.\n" +
                        "\n" +
                        "Mr Salmond will not be able to make questions about his past behaviour and the events of the last three years simply go away. If he is to make a success of his new party, he needs to maintain convincing answers to them.\n",
                boyle, politics, scotland, "2021-03-29", 0,
                "https://ichef.bbci.co.uk/news/976/cpsprodpb/13460/production/_117744987_salmodn_three_pamedai.jpg");
        articleRepository.save(politics5);



        Article politics6 = new Article("Kill the Bill protests: Defend right to protest, Corbyn tells marchers",
                "Former Labour leader Jeremy Corbyn urged marchers to \"stand up for the right to protest\" as protests against the Police and Crime Bill were held around the UK.\n" +
                        "\n",
                "Kill the Bill demonstrations took place in London, Birmingham, Liverpool, and Bristol among other places.\n" +
                        "Mr Corbyn said the bill would prevent protest without police approval.\n" +
                        "\n" +
                        "Police said 26 people were arrested after a minority refused to leave after the London protest.\n" +
                        "\n" +
                        "Speaking in Parliament Square in central London, Mr Corbyn invoked figures such as the suffragettes and Nelson Mandela as he urged the crowd to oppose the bill.\n" +
                        "\n" +
                        "\"Stand up for the right to protest, stand up for the right to have your voice heard,\" he said.\n" +
                        "\n" +
                        "He said the protests against the bill were sparked after police dispersed the crowd at the \"perfectly correct and proper vigil\" for Sarah Everard, who was killed as she walked home in south London.\n" +
                        "\n" +
                        "\"I want a society where it is safe to walk the streets, where you can speak out, you can demonstrate and you don't have to seek the permission from the police or the home secretary to do so,\" he said.\n" +
                        "\n" +
                        "Several women addressed the crowd and shared personal experiences of abuse and being drugged.\n" +
                        "\n" +
                        "Protesters carried anti-sexism placards and chanted \"women scared everywhere, police and Government do not care\" as they marched past Downing Street.\n" +
                        "\n" +
                        "The protests were prompted by the Police, Crime, Sentencing and Courts Bill, which propose to give police in England and Wales more power to impose conditions on non-violent protests, including those which are deemed too noisy or a nuisance.\n" +
                        "\n" +
                        "Anyone refusing to follow police directions about a protest could be fined up to £2,500.\n" +
                        "\n" +
                        "Ministers and police have defended the proposals, saying they were needed to tackle demonstrations such the ones by Extinction Rebellion in 2019, where mass occupations of roads and bridges in London and elsewhere stretched police resources to the limit.\n" +
                        "\n" +
                        "Most of the crowd of several hundred people in London dispersed peacefully after the rally, but police said they made arrests after a \"small minority\" refused to leave.\n" +
                        "\n" +
                        "In Bristol, more than 1,000 people gathered for a peaceful protest, after demonstrations on 23 March and 26 March ended in clashes with police.\n" +
                        "\n" +
                        "Earlier Kill the Bill protests had taken place under lockdown, but the latest demonstrations are the first since coronavirus rules on outdoor gatherings were eased on Monday in the latest stage of the government's roadmap out of lockdown.\n" +
                        "\n" +
                        "Under the current rules, people can meet outdoors in groups of six or two households. But there is an extra provision to allow outdoor protests with more than six people - as long as organisers carry out a risk assessment and take all reasonable steps to limit the spread of the virus.\n" +
                        "\n" +
                        "At the Bristol protest, about 100 demonstrators began marching again later in the evening, Avon and Somerset Police said. They forced police to briefly close part of the M32 motorway by sitting in the road.\n" +
                        "\n" +
                        "Hundreds of people also marched through Newcastle city centre, and other places that saw protests of varying scales included Birmingham, Liverpool, Newcastle, Bournemouth, Brighton, Weymouth and Luton.\n" +
                        "\n" +
                        "\n",
                santiago, politics, uk,"2021-04-04", 0,
                "https://ichef.bbci.co.uk/news/976/cpsprodpb/49FF/production/_117834981_hi066571553.jpg");
        articleRepository.save(politics6);



        Article politics7 = new Article("US police used British anti-riot gear at Black Lives Matter protests",
                "Revelation contradicts official assurance that no UK-made equipment was used to repress peaceful demonstrations",
                "US law enforcement officers used British anti-riot gear to strike protesters during their controversial policing of Black Lives Matter demonstrations, despite assurances from the Conservative government that no UK-made equipment was used to repress peaceful protest.\n" +
                        "\n" +
                        "Officers deployed at demonstrations in Washington DC hit protesters and in one case a journalist using shields made by the British-based firm DMS Plastics. Video and photographs suggest, and a lawsuit alleges, that officers charged at protesters, rather than acting in self-defence. US forces deny the allegations.\n" +
                        "\n" +
                        "Images from late May and June show a number of incidents of law enforcement units holding Scorpion-brand shields made by DMS, including the US park police, the Secret Service and Arlington county police. Footage shows officers using the shields to repel crowds, with instances of people being struck with the shields without any apparent justification.\n" +
                        "\n" +
                        "The findings come as part of a joint investigation tracking British-made weaponry and personal protective equipment around the world by the Guardian, Sky News and the investigative outlet Bellingcat, organised by the media nonprofit organisation Lighthouse Reports.\n" +
                        "\n" +
                        "A group of protesters represented by the American Civil Liberties Union is suing US President Donald Trump, attorney general William Barr, defense secretary Mark Esper and the heads of US police and security forces over alleged use of force at a peaceful demonstration near the White House on 1 June.\n" +
                        "\n" +
                        "Officials had “no legitimate basis to destroy the peaceable gathering”, they allege, describing the action as a “manifestation of the very despotism against which the first amendment was intended to protect”. The lawsuit mentions instances of officers using anti-riot shields as part of an escalation in tactics. “The officers hit, punched, shoved, and otherwise assaulted the demonstrators with their fists, feet, batons, and shields,” they added.\n" +
                        "\n" +
                        "Concerns over the aggressive response to BLM demonstrations led parliamentarians in Edinburgh and Westminster to question British sales of riot-control equipment to the US, including tear gas. \n" +
                        "\n" +
                        "The British government agreed to review licences for sales of anti-riot gear but later rejected any suggestion that sales should be halted, and dismissed questions from the legal representative of a black British citizen who challenged the government over crowd control equipment sales.\n" +
                        "\n" +
                        "Treasury lawyers told the law firm Deighton Pierce Glynn on 24 July that officials carried out a temporary suspension and reassessment of licences for anti-riot gear in the wake of the US demonstrations, with explicit mention of anti-riot shields. They stated that there was “no evidence that equipment licensed by the UK was used during the protests”.\n" +
                        "\n" +
                        "They added that “given the broad list of end users covered by the licences”, it was possible that equipment could have been used against protesters. In images from cities across America, British-made shields were visible, and apparently misused in confrontations with protesters.\n" +
                        "\n" +
                        "The US protests, and the controversy over their policing, began after the 25 May killing of George Floyd, an African American man who died in Minneapolis while a white police office knelt on his neck. One of a catalogue of deaths of black men and women at the hands of white US police officers, it was a catalyst for the the largest civil rights uprising of the modern era.\n" +
                        "Advertisement\n" +
                        "\n" +
                        "On 1 June in Washington DC, officers fired tear gas on crowds of peaceful protesters before using force to clear the protest to let President Trump walk to a nearby church for a photo opportunity. The ACLU’s lawsuit challenging the clearing of the demonstration cites the case of US Navy veteran Kishon McDonald, who, it says, was “repeatedly struck by the shields of multiple officers which left bruises on his body. Officers continued to physically strike Mr McDonald even after he began to leave the site.”\n" +
                        "\n" +
                        "The brand of the shield involved in this case is not stated in the allegations.\n" +
                        "\n" +
                        "Questions remain over whether using anti-riot shields to strike protesters constitutes fair use. Some law enforcement manuals say only that the shields are intended as protection from projectiles. The Washington DC Metropolitan Department tells officers that permitted force involves “hands-on touching or pushing maneuvers, but with no deployment of tools or weapons”, and “physical force may include line and wedge formations (with or without protective riot shields) that move a crowd”.\n" +
                        "\n" +
                        "A lawyer acting for DMS Plastics emphasised that DMS manufactured the riot shields but could not “be responsible for any misuse of the PPE” that it made.\n" +
                        "\n" +
                        "He said that DMS Protective Equipment, a sister company, was only responsible for distributing Scorpion-brand shields in the UK. All exports were via independent distributors in the relevant countries and any misuse of the Scorpion shields was “by a minute fraction of the US officers”.\n" +
                        "\n" +
                        "Photographs from late May and 1 June show officers in Washington DC knocking different lone protestors to the ground using British-made Scorpion shields. Others show unarmed protesters with their hands up as officers appear to strike with shields and batons.\n" +
                        "\n" +
                        "Footage broadcast live on Australia’s 7News channel on 1 June showed the correspondent Amelia Brace and cameraman Tim Myers charged by police brandishing Scorpion shields, before one officer hit Myers with a shield.\n" +
                        "Brace testified before a US congressional committee in late June. “I’ve been shocked to see how many journalists have been attacked, beaten and detained, just for doing their jobs,” she said. Two US park police officers were “assigned administrative duties”, while an investigation into the attack on the journalists is carried out. \n" +
                        "\n" +
                        "US park police said in a statement at the time that the Australians “may have fallen”, and that because of the loud noise and the “lack of readily identifiable journalist markings”, the crew were not “readily indistinguishable from violent protesters”.\n" +
                        "\n" +
                        "Video footage also shows a Utah police officer holding a Scorpion shield as he appears to shoot a protester in Salt Lake City with a smoke grenade at close range.\n" +
                        "Advertisement\n" +
                        "\n" +
                        "Roxeanne Vainuku of the West Valley City police department, said the protester was holding a bat not visible in the video. She confirmed that the department’s officers used Scorpion shields, among others, “for protection during protests”, adding that they were “used to protect officers against projectiles and to create distance between advancing persons and officers”.\u2028\n" +
                        "The US park police told the Guardian that it “followed established procedures and regulations during the civil unrest that occurred near the White House in May and June. All use of force complaints are being investigated by our internal affairs unit.”\n" +
                        "\n" +
                        "It also cited a statement issued by the acting US park police chief Gregory T Monahan defending the force’s actions and accusing protesters of being “combative”.\n" +
                        "Arlington county police department’s spokeswoman Ashley Savage said it was “committed to supporting the peaceful expression of first amendment rights ... our civil disturbance unit (CDU) is used only to maintain peace and order with crowds experiencing unrest. These officers are highly trained and skilled in peaceful crowd control and dispersal.”\n" +
                        "\n" +
                        "Arlington county withdrew its officers from Washington DC on 1 June after officers were “asked to take action that is inconsistent with our values”.\n" +
                        "\n" +
                        "Asked about its involvement in policing Washington demonstrations, a Secret Service spokesperson said it had no comment.\n" +
                        "\n" +
                        "British MPs have questioned the sale of anti-riot equipment to the US. In June, 166 MPs and the Scottish government demanded an end to such sales owing to the violent crackdown on peaceful protests, stating that UK-made equipment “could be misused”.\n" +
                        "\n" +
                        "A database maintained by the UK-based Campaign Against Arms Trade records seven licences for British anti-riot equipment and arms exports to the US still in effect. In 2019, the UK issued licences for the sale of anti-riot shields worth at least £758,000 to the US. A parliamentary statement on 10 June detailed current licences for sales of anti-riot gear to the US, including two for “anti riot/ballistic shields”, to a total value of £850,000.\n" +
                        "\n" +
                        "A Department for International Trade spokesperson said all export licences were under “careful and continual review”.\n" +
                        "“The UK takes its export control responsibilities very seriously and operates one of the most robust and transparent export control regimes in the world,” the spokesperson said. “We rigorously examine each export licence application on a case-by-case basis against the consolidated EU and national arms export licensing criteria.”\n",
                diaz, politics, usa, "2020-10-05", 0,
                "https://i.guim.co.uk/img/media/b0fc6b928b84408eb28112533aaad764889e7222/0_0_4912_3726/master/4912.jpg?width=605&quality=85&auto=format&fit=max&s=dbb54b93ec2108f5d0c42a0fcc232594");
        articleRepository.save(politics7);


        Article politics8 = new Article("America shaken after pro-Trump mob storms US Capitol building",
                "One person was shot dead at the Capitol and three others died in medical emergencies amid Washington unrest\n" +
                        "\n",
                "America woke up stunned on Thursday after a mob of Donald Trump supporters staged an insurrection at the US Capitol building in Washington DC the day before, storming the debating chambers and clashing with armed police.\n" +
                        "\n" +
                        "Four people died in the unrest that rocked the capital on Wednesday, Washington DC police said, including a woman who was shot dead by the US Capitol police. Three others died in “medical emergencies”, the DC police chief, Robert Contee, said.\n" +
                        "\n" +
                        "The siege was among the worst security breaches in American history and came after Trump had earlier urged a crowd of protesters to march on the Capitol and undo his November election defeat.\n" +
                        "\n" +
                        "The violence halted the tallying of electoral college votes to affirm Joe Biden’s victory, with Mike Pence, the vice-president, and members of Congress evacuated to undisclosed locations for their safety.\n" +
                        "\n" +
                        "A defiant Congress later resumed its business after the Capitol was cleared and secured and, shortly before 4am on Thursday, members duly certified Joe Biden’s victory over Donald Trump in November’s presidential election.\n" +
                        "DC police said the woman who was killed at the Capitol on Wednesday afternoon was shot as the mob tried to break through a barricaded door where police were armed on the other side. She was hospitalized with a gunshot wound and later died.\n" +
                        "\n" +
                        "In a sombre televised address while the mob was still massed on the Capitol steps, Biden, the president-elect, condemned the mayhem. “This is not dissent,” he said. “It’s disorder, it’s chaos, it borders on sedition and it must end now.”\n" +
                        "\n" +
                        "The Capitol dome is known worldwide as a political symbol and the House of Representatives and Senate chambers are revered as almost sacred. But Wednesday’s carnage struck the latest and perhaps most savage blow to the America’s reputation as a paragon of liberal democracy.\n" +
                        "\n" +
                        "Thousands of rioters gathered on the Capitol steps wielding flags including “Make America great again”, “Liberty or death: don’t tread on me” and the pro-south confederacy. Some broke down barriers and barged through police lines to enter the building, chanting “USA! USA!”, smashing windows, wandering halls and corridors and occupying offices with impunity.\n" +
                        "\n" +
                        "One reached the Senate dais and yelled, “Trump won that election!” Protesters stormed the offices of the House speaker, Nancy Pelosi, knocking over tables and ripping photos off the walls. A photograph appeared to show one of them sitting contemptuously with his foot on Pelosi’s desk.\n" +
                        "\n" +
                        "One stunning picture showed security forces inside the House chamber pointing guns at protesters through a broken window as if under siege. Another captured protesters lying face down on the floor as police pointed weapons at them.\n" +
                        "\n" +
                        "DC police said pipe bombs had been recovered outside the offices of the Democratic National Committee and the Republican National Committee. Police also found a cooler containing a long gun and Molotov cocktail in a vehicle on the Capitol grounds. Police made 52 arrests.\n" +
                        "\n" +
                        "Having lit the political fire, Trump made a belated plea for calm but repeated the lie that the election was rigged. “I know your pain, I know you’re hurt,” he said. “We had an election that was stolen from us.\n" +
                        "\n" +
                        "“But you have to go home now. We have to have peace. We have to have law and order, we have to respect our great people in law and order. We don’t want anybody hurt. We love you.”\n" +
                        "\n" +
                        "Trump’s repeated claims of election fraud forced unprecedented enforcement actions by social media companies. Twitter and Facebook locked Trump out of his accounts, and both platforms removed several posts from the president that cast doubt on the election results and praised his supporters.\n" +
                        "\n" +
                        "Biden struck a very different tone in his remarks. “At this hour, our democracy’s under unprecedented assault, unlike anything we’ve seen in modern times... The scenes of chaos at the Capitol do not represent the true America, do not represent who we are. What we’re seeing are a small number of extremists dedicated to lawlessness.”\n" +
                        "\n" +
                        "He added: “I call on President Trump to go on national television now to fulfill his oath and defend the constitution and demand an end to this siege. It’s not protest. It’s insurrection.”\n" +
                        "\n" +
                        "Reinforcements were called in. The Washington DC mayor, Muriel Bowser, activated the national guard and issued a citywide curfew in from 6pm on Wednesday until 6am Thursday. Ralph Northam, the governor of neighbouring Virginia, announced that he would send members of the Virginia national guard and 200 state troopers.\n" +
                        "\n" +
                        "I call on President Trump to go on television now to demand an end to this siege. It’s not protest. It’s insurrection\n" +
                        "Joe Biden\n" +
                        "\n" +
                        "It was not until early evening, almost four hours after violent pro-Trump occupiers disrupted the electoral count, that officials declared the Capitol “secure”. The certification of electoral college votes resumed later Wednesday night.\n" +
                        "\n" +
                        "“Today, a shameful assault was made on our democracy,” said the House speaker, Nancy Pelosi. “It was anointed at the highest level of government. It cannot, however, deter us from our responsibility to validate the election of Joe Biden.”\n" +
                        "\n" +
                        "The Senate minority leader, Chuck Schumer, called for the “goons” and “thugs” and “domestic terrorists” who stormed the Capitol to be “prosecuted to the full extent of the law”.\n" +
                        "“This mob was in good part President Trump’s doing, incited by his words and his lies,” Schumer said.\n" +
                        "\n" +
                        "Pence called on his colleagues to “get back to work”.\n" +
                        "“To those who wreaked havoc in our Capitol today: you did not win,” he said as the proceedings restarted. “Violence never wins. Freedom wins. And this is still the people’s house.”\n" +
                        "\n" +
                        "Wednesday’s chaos provoked alarm and revulsion around the world. Jens Stoltenberg, the secretary general of Nato, tweeted: “Shocking scenes in Washington DC. The outcome of this democratic election must be respected.”\n" +
                        "\n" +
                        "Boris Johnson, the British prime minister, called the scenes “disgraceful”, adding: “The United States stands for democracy around the world and it is now vital that there should be a peaceful and orderly transfer of power.”\n" +
                        "\n" +
                        "The carnage unfolded after Trump, due to leave office on 20 January, earlier in the day addressed thousands of protesters on a grassy expanse near the White House called the Ellipse, repeating false claims that the election was stolen from him due to widespread election fraud and irregularities.\n" +
                        "\n" +
                        "“We will never give up,” said Trump, who has spent years inciting anger and conspiracy theories. “We will never concede. It doesn’t happen. You don’t concede when there’s theft involved.”\n" +
                        "\n" +
                        "Members of the House and Senate were then debating objections to the results by Trump’s allies. The president had pressures Pence to throw out election results in states he narrowly lost, but Pence publicly acknowledged that he has no such power.\n" +
                        "\n" +
                        "Mitch McConnell, the Republican majority leader in the Senate, denounced the effort, warning: “If this election were overturned by mere allegations from the losing side, our democracy would enter a death spiral.”\n" +
                        "\n" +
                        "But the mob forced an abrupt halt to proceedings. As rioters shouted while marching through the halls, people inside the chambers were directed to duck under their seats for cover and put on gas masks after tear gas was used in the Capitol rotunda. Fortunately a Senate aide remembered to take the electoral college documents with him as he evacuated the chamber.\n" +
                        "\n" +
                        "The building was locked down as law enforcement battled to regain control. Questions swirled over how the rioters were able to get so far with such little resistance in contrast to the heavy handed crackdown on peaceful Black Lives Matter marchers last summer.\n" +
                        "\n" +
                        "Former president George W Bush condemned what he called “insurrection”, saying in a statement: “This is how election results are disputed in a banana republic – not our democratic republic. I am appalled by the reckless behavior of some political leaders since the election and by the lack of respect shown today for our institutions, our traditions, and our law enforcement.”\n",
                holt, politics, usa, "2021-01-07", 0,
                "https://i.guim.co.uk/img/media/96c330e2c46a0d730a6e2a12c33552d632531905/0_0_4500_3001/master/4500.jpg?width=605&quality=85&auto=format&fit=max&s=582964614c8778c215368c7a176368f8");
        articleRepository.save(politics8);



        Article politics9 = new Article("Nicola Sturgeon cleared of breaching ministerial code over Alex Salmond saga",
                "Nicola Sturgeon has been cleared of breaching the ministerial code over her involvement in the Alex Salmond saga.",
                "An independent inquiry by senior Irish lawyer James Hamilton had been examining whether the first minister misled the Scottish Parliament over what she knew and when.\n" +
                        "\n" +
                        "His report said Ms Sturgeon had given an \"incomplete narrative of events\" to MSPs.\n" +
                        "But he said this was a \"genuine failure of recollection\" and not deliberate.\n" +
                        "\n" +
                        "Mr Hamilton said he was therefore of the opinion that Ms Sturgeon had not breached any of the provisions of the code.\n" +
                        "\n" +
                        "The code sets out the standards expected of Scottish government ministers, and states that anyone who deliberately misleads Holyrood would be expected to resign.\n" +
                        "\n" +
                        "Mr Hamilton concluded in his report, some parts of which were heavily redacted, that Ms Sturgeon did not breach the ministerial code in respect of any of the four issues he considered.\n" +
                        "\n" +
                        "These included allegations that Ms Sturgeon had failed to record a series of meetings and telephone discussions with Mr Salmond and others in 2018.\n" +
                        "\n" +
                        "Mr Hamilton concluded that the meetings were government business - contrary to Ms Sturgeon's claims that they were a party matter - but accepted her reasoning that \"it would have been impossible to record such meetings or discussions without a risk of prejudicing the proceedings or interfering with their confidentiality\".\n" +
                        "\n" +
                        "He also looked at whether the first minister \"may have attempted to influence the conduct of the investigation\" into the harassment complaints made against Mr Salmond, her predecessor as first minister and SNP leader.\n" +
                        "\n" +
                        "The lawyer said the key point was that Ms Sturgeon had not intervened, and said that had Mr Salmond really believed she had agreed to it during a meeting on 2 April 2018 then, \"one might have expected him to follow it up and to press home his advantage\" - but that no further contact was made for three weeks.\n" +
                        "\n" +
                        "The third issue centred on whether Ms Sturgeon misled the Scottish Parliament in relation to the meetings in 2018.\n" +
                        "The first minister insisted she had first learned of the complaints from Mr Salmond at her home on 2 April, but later said she had had \"forgotten\" about a meeting with his former chief of staff four days earlier, on 29 March.\n" +
                        "\n" +
                        "Mr Hamilton said it was \"regrettable\" that Ms Sturgeon had not told MSPs about this meeting, but that he found it \"difficult to think of any convincing reason\" for her to deliberately conceal it.\n" +
                        "\n" +
                        "He said she had given parliament \"an incomplete narrative of events\", but added: \"I accept that this omission was the result of a genuine failure of recollection and was not deliberate.\"\n" +
                        "\n" +
                        "The fourth ground of investigation alleged that Ms Sturgeon was in breach of her duty to comply with the law in relation to Mr Salmond's successful legal challenge against the Scottish government.\n" +
                        "\n" +
                        "Mr Salmond has pointed to external legal advice warning that the government may be at risk of losing the case as early as October 2018, but ministers decided to fight on until January 2019 - and ultimately had to pay Mr Salmond more than £500,000 in legal costs.\n" +
                        "\n" +
                        "Mr Salmond was later cleared of 13 charges of sexual assault against nine women after a separate High Court trial in March of last year.\n" +
                        "\n" +
                        "Mr Hamilton said Ms Sturgeon had relied on advice from the law officers, as she was \"fully entitled\" to do, and said Mr Salmond \"appears to be under the misapprehension that the government is under a duty to withdraw a case if advised that there is less than an evens chance of winning\".\n" +
                        "\n" +
                        "The lawyer's 61-page report concluded: \"I am of the opinion that the first minister did not breach the provisions of the ministerial code in respect of any of these matters.\"\n" +
                        "\n" +
                        "Ms Sturgeon welcomed the findings, and said she had \"sought at every stage in this issue to act with integrity and in the public interest\".\n" +
                        "\n" +
                        "She added: \"As I have previously made clear, I did not consider that I had broken the code, but these findings are official, definitive and independent adjudication of that.\"\n" +
                        "Ms Sturgeon again apologised to the women who made the complaints, saying they had been let down by the government.\n" +
                        "\n" +
                        "But she said: \"I was determined at the time these complaints emerged that they should not be swept under the carpet, and that I would not intervene in the process.\"\n" +
                        "\n" +
                        "The first minister also called on opposition parties to respect the outcome of Mr Hamilton's inquiry, and said she would continue to devote \"all of my time and energy to leading Scotland and to helping the country through the pandemic\".",
                jeffords, politics, scotland, "2021-03-22", 0,
                "https://ichef.bbci.co.uk/news/976/cpsprodpb/295A/production/_117668501_065115199.jpg");
        articleRepository.save(politics9);



        Article politics10 = new Article("White House expresses concern over Northern Ireland violence",
                "Joe Biden joins Boris Johnson and Irish prime minister in a call for calm after worst violence in Belfast in years\n" +
                        "\n",
                "The White House has expressed concern over a week of riots in Northern Ireland, with Joe Biden joining Boris Johnson and the Irish prime minister in calling for calm after what police described as the worst violence in Belfast for years.\n" +
                        "\n" +
                        "It came as police used water cannon against nationalist youths in west Belfast, as unrest stirred again on the streets on Thursday evening, with reports that officers later warned they could use “impact rounds” – also known as plastic bullets.\n" +
                        "\n" +
                        "In a statement, the US president’s press secretary, Jen Psaki, said: “We are concerned by the violence in Northern Ireland” and that Biden remained “steadfast” in his support for a “secure and prosperous Northern Ireland in which all communities have a voice and enjoy the gains of the hard-won peace”.\n" +
                        "\n" +
                        "She spoke as the Northern Ireland secretary, Brandon Lewis, called on political leaders across the spectrum to tone down their language to ease tensions.\n" +
                        "Biden, who has Irish roots, has repeatedly expressed support for the peace process and last year waded into a row over UK plans to override parts of the Brexit deal, warning Boris Johnson that any trade deal was “contingent upon respect for the [peace] agreement and preventing the return of a hard border”.\n" +
                        "\n" +
                        "Police said as many as 600 people had been involved in disturbances in Belfast on Wednesday, when a bus was petrol-bombed, plastic bullets were fired and missiles were hurled over a “peace wall”.\n" +
                        "\n" +
                        "With parts of Belfast scarred and a political crisis brewing, the Northern Ireland assembly united in its condemnation of the rioting and agreed a motion calling for an end to the “deplorable” violence and support for the rule of law.\n" +
                        "\n" +
                        "Boris Johnson and the Irish prime minister, Micheál Martin, spoke by phone on Thursday, called for calm, and agreed that “the way forward is through dialogue and working the institutions of the Good Friday agreement”.\n" +
                        "\n" +
                        "Northern Ireland was plunged into crisis after violence escalated at the intersection between loyalist and nationalist communities in the Shankill and Springfield areas.\n" +
                        "\n" +
                        "Police said rioters had thrown petrol bombs, bottles, masonry and fireworks, and a Belfast Telegraph photographer was attacked. Police fired six plastic bullets known as attenuating energy projectiles (AEPs) on Wednesday night. Eight officers were injured in the unrest and two men aged 28 and 18 were arrested on suspicion of riotous behaviour.\n" +
                        "\n" +
                        "The Police Service of Northern Ireland assistant chief constable Jonathan Roberts said Wednesday’s mayhem “was at a scale we have not seen in recent years” and it was lucky that no one had been seriously hurt or killed.\n" +
                        "\n" +
                        "Stones and fireworks were thrown at police by gangs of youths gathered on the nationalist Springfield Road on Thursday evening, close to where Wednesday night’s riots took place. Police deployed water cannon after protesters failed to disperse. Later in the evening, there were reports that police warned crowds “impact rounds will be fired”.\n" +
                        "\n" +
                        "The plastic bullets are not used as a means of crowd control in any part of the UK apart from Northern Ireland, and their use has been condemned by human rights groups.\n" +
                        "\n" +
                        "Lewis was due to hold virtual meetings with leaders of all five parties in the Northern Ireland executive, including the Democratic Unionist party, Sinn Féin and the Alliance party, on Friday morning.\n" +
                        "\n" +
                        "After touching down in Belfast, he said he had encouraged politicians to “think very carefully” about the language they used. He added: “Not just unionists, but if you look at the tweets and messages from politicians from all parties, they have put out messages that can be interpreted in a particular way as having a bit of spite to them.\n" +
                        "\n" +
                        "“I don’t think there is any place for that. I have spoken to people across parties about that.”\n" +
                        "\n" +
                        "He named no names, but public positions have become polarised over both the Brexit protocols for Northern Ireland and recent decision not to prosecute Sinn Féin leaders who attended a funeral in contravention of health restrictions. “I think we all have to be very clear about the fact that what politicians here say matters,” Lewis said.\n" +
                        "\n" +
                        "There had been hopes that tensions could ease on Thursday as the Ulster Political Research Group, which is linked to the paramilitary Ulster Defence Association, called for an end to the violence, saying “street disturbances will not solve our issues”. \n" +
                        "\n" +
                        "The Loyalist Communities Council, which represents loyalist paramilitary groups, reportedly met on Thursday afternoon, but failed to reach agreement on a statement condemning the violence.",
                reynolds, politics, uk, "2021-04-08", 0,
                "https://i.guim.co.uk/img/media/bbe08a95f9cfb44f0fd444d14bcec280704f0eda/0_276_5568_3341/master/5568.jpg?width=605&quality=85&auto=format&fit=max&s=4d7ca8db530481182d69e91853043deb");
        articleRepository.save(politics10);






    }
}
