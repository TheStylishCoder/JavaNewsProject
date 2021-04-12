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


        Article entertainment1 = new Article("Kim Kardashian becomes a billionaire after her net worth surges by $220m in just six months",
                "The 40-year-old's stake in her beauty brand is worth $500m (£361m), while her shapewear line is valued at $225m (£162m).",
                "Kim Kardashian has officially become a billionaire, according toForbes.The reality TV star, 40, saw her net worth soar from $780m (£564m) in October to $1bn (£723m) this month, the magazine reports.Her fortune comes mainly from her two businesses: the shapewear brand Skims, and the cosmetics company KKW Beauty.She has also earned millions from her TV career - namely Keeping Up With The Kardashians - and endorsement deals.The rest of her estate is made up of her personal finances, properties and investments.Kardashian, who is still using the surname Kardashian West, is joiningthe billionaire club two months after filing for divorce from her husbandKanye.Shefiled the divorce papersin Los Angeles in February, citing irreconcilable differences.The star previously made a public plea for \"compassion and empathy\" towards West, 43, amid his struggles with bipolar disorder.The couple are seeking joint custody of their four children North, Chicago, Psalm and Saint.\n" +
                        "Rapper West is said to have become a billionaire last year following the success of his Yeezy shoe brand.His net worth is now $6.6bn (£4.7bn), according to Bloomberg, making him therichest black man in US history.Kardashian started her own beauty line in 2017 following the success of her sisterKylie Jenner's company - Kylie Cosmetics.Claiming to be \"inspired\" by her younger sibling, she sold 20% of KKW Beauty to cosmetics giant Coty last year, which valued the brand at $1bn.Her 72% stake is said to be worth $500m (£361m), while Skims is valued at $225m (£162m).The successes of the sisters' companies rely heavily on their huge social media followings.Kardashian has 213 million followers on Instagram, while Jenner boasts224 million.Shares in Snapchat fell by $1.3bn (£904m) after Jenner decided to delete her account in 2018.The younger sister was reported to have become a billionaire by Forbes last year but was later accused of inflating her business value and was stripped of her title.Kardashian joins the likes of Amazon owner Jeff Bezos and Tesla entrepreneur Elon Musk in the US billionaire's club",
                robertson, entertainment, usa, "2021-04-07", 0,
                "https://e3.365dm.com/21/04/1600x900/skynews-kim-kardashian-the-kardashians_5332744.jpg?bypass-service-worker&20210406233804");
        articleRepository.save(entertainment1);



        Article entertainment2 = new Article("Kim Kardashian has filed for divorce from her rapper husband Kanye West after nearly seven years of marriage.",
                "A Los Angeles Superior Court spokeswoman confirmed to Reuters that Kardashian filed the divorce papers on Friday.",
                "A representative for the 40-year-old reality TV star also confirmed that she had filed papers.The grounds for the divorce were not immediately known. TMZ said sources called the divorce \"amicable,\" saying Kardashian is asking for joint legal and physical custody of the couple's four children,whichWestis \"fine\" with.The US entertainment news site also reports that the pair had a prenuptial arrangement in place, with discussions on property settlements said to be in the advanced stages.It follows months of speculation that the couple's marriage was in trouble, with multiple sources telling US media that their \"divorce is imminent\" and Kardashian has hired renowned divorce lawyer Laura Wasser.Kardashian, who shot to fame in the reality TV show Keeping Up With The Kardashians, married Gold Digger hitmaker West in 2014 - making them one of the biggest celebrity couples in Hollywood.Their marriage is believed to have become strained last year when West, 43, who suffers from bipolar disorder, ran anunsuccessful US presidential campaignmarked by erratic statements under his self-styled Birthday Party.In July, Kardashian, who isstudying to become a lawyer, defended West's behaviour in a statement urging compassion for his mental health struggles.However, the couple appeared to continue to grow apart with the 21-time Grammy winner spending most of his time at his ranch in Wyoming, while Kardashian resided in their Calabasas mansion outsideLos Angeles.Entertainment websites E! News, TMZ and Variety first reported on the split and it was later confirmed by the Associated Press.\n" +
                        "The couple married in a ceremony at a Renaissance fortress in Florence, Italy, in May 2014 and have four young children: North, Saint, Chicago and Psalm. It was the first marriage for the 43-year-old West, and the third for Kardashian.The couple were previously friends before they began dating in 2012, and had their first child, North, in 2013.West proposed later that year using the giant screen at the empty waterfront ballpark of the San Francisco Giants in front of her family, and the engagement was featured in an episode of Keeping Up With The Kardashians.The beginning of the end of the marriage comes after the September announcement that her family's reality show was coming to an end thisyear after 14 years.Kardashian was previously married to NBA player Kris Humphries, whom she divorced after 72 days of marriage in October 2011.In 2000, 19-year-old Kardashian married music producer Damon Thomas, but Thomas filed for divorce in 2003.",
                binding, entertainment, usa, "2021-02-20", 0,
                "https://www.the-sun.com/wp-content/uploads/sites/6/2021/02/NINTCHDBPICT000638735614.jpg?w=620");
        articleRepository.save(entertainment2);



        Article entertainment3 = new Article("Ever wanted some words of support from your football hero? How about help with a marriage proposal from a famous musician?",
                "The coronavirus pandemic has hit the entertainment industry hard - and it's seen a growing number of celebrities selling personalised video messages online.",
                "Websites such as Cameo and Memmo give members of the public the  chance to ask stars to record a shout-out for their friends or relatives, with prices ranging from around £15 to several hundred pounds.\n" +
                        "\n" +
                        "Nigel Farage is one of the latest names to sign up to Cameo - a site  which has attracted big stars in the US - with a video from the former Brexit Party leader setting you back £75.\n" +
                        "\n" +
                        "Simon Webbe, who found fame with the boyband Blue, says he charges around £50 for a personalised video on Memmo and he received about 100 requests in the run-up to Mother's Day.\n" +
                        "\n" +
                        "He told Sky News: \"I think a lot of people will be sitting there going:  'Well, why do celebrities need to be doing this when they make their money?'\n" +
                        "\n" +
                        "\"People like myself who's in the entertainment business, my income relies on people getting together - as you know over the last year we've been locked down. The whole world has been like that.\n" +
                        "\n" +
                        "\"A lot of my work is international so I've not been able to make a living for over a year at all.\"\n" +
                        "\n" +
                        "He added: \"This is just that little way to earn those extra little pennies if I can put to the side for the mortgage, I've got a baby on the way as well, so I don't think I can afford to be too proud.\"\n" +
                        "\n" +
                        "Gustav Lundberg Toresson, one of the co-founders of Memmo, said the number of celebrities is \"growing exponentially\" and more than 3,000 \n" +
                        "people are now in their \"talent base\" offering video messages.\n" +
                        "\n" +
                        "He started the company in Sweden in 2019 with his business partner Tobias Bengtsdahl and hopes to recruit Premier League footballers to \n" +
                        "the site in the near future.\n" +
                        "\n" +
                        "Ex-England football manager Sven Goran Eriksson and former Geordie Shore star Charlotte Crosby were among the first famous names to sign up, along with a host of retired footballers, Mr Toresson said.\n" +
                        "\n" +
                        "He told Sky News: \"There's a lot of interest in the footballers - a lot of former ones like Glenn Hoddle and Sven Goran Eriksson, but also some interesting characters from TV like Clinton Baptiste (a character from Peter Kay's Phoenix Nights) and Paddy Doherty (from My Big Fat Gypsy\n" +
                        "Wedding and Celebrity Big Brother).\"\n" +
                        "\n" +
                        "Sir Rod Stewart ordered a video message from an impersonator of the singer on Memmo for his son earlier this year, Mr Toresson said.\n" +
                        "\n" +
                        "The coronavirus lockdowns prompted an increase in celebrities signing up to Memmo because people working in entertainment had \"a lot more time on their hands\", he added.\n" +
                        "\n" +
                        "However there has been a similar rise in demand in Sweden, where COVID restrictions have not been as strict as other countries, according to Mr Toresson.\n" +
                        "\n" +
                        "\"I think it's just that talent realise they can actually make a lot of money in their living room - and it's actually really easy,\" he said.\n" +
                        "\n" +
                        "Celebrities decide how much they charge for their videos and use an app to set their price, view their requests and record their messages.\n" +
                        "\n" +
                        "\"They're generally priced between £5 up to £500-£1,000,\" Mr Toresson said.\n" +
                        "\n" +
                        "\"It's varying a lot depending on how much you want to adjust the demand.\n" +
                        "\n" +
                        "\"We always want this to be up to the talent themselves.\"\n" +
                        "The celebrities receive 75% of the amount they charge, with Memmo taking the remaining 25%, while some stars are recording 15 to 20 videos a day, according to Mr Toresson.\n" +
                        "\n" +
                        "Birthday messages are the most common requests, and there have been more than 50 marriage proposals where a celebrity pops the question on behalf of the person requesting the video, he added.\n" +
                        "\n" +
                        "One unnamed celebrity in the UK who helped out with a proposal is now planning to attend the wedding after he was invited to the ceremony this summer, Mr Toresson said.\n" +
                        "\n" +
                        "Some of the more bizarre requests have included people asking celebrities to help them break up with their partner.\n" +
                        "\n" +
                        "\"The acceptance rates for those ones are lower,\" Mr Toresson added.\n" +
                        "\n" +
                        "Memmo says very few inappropriate message requests are received, which Mr Toresson believes is because people have to pay to make a request and they cannot be anonymous.\n" +
                        "\n" +
                        "\"In the end it's always up to the talent to accept or reject the request for any reason,\" he said.\n" +
                        "\n" +
                        "\"We don't really regulate who is on and who is not, but we have certain rules about what kind of content you can create on the platforms.\n" +
                        "\n" +
                        "\"We don't allow any nudity, we don't allow any hate speech and so on. We keep a close track of that.\"Mr Toresson says he isn't worried about competition from rival site \n" +
                        "Cameo, which launched in 2016 and offers video messages from stars  including boxing great Floyd Mayweather Jr, actress Lindsay Lohan and Baywatch actor David Hasselhoff.\n" +
                        "\n" +
                        "\"Healthy competition is always good,\" he said.\n" +
                        "\"It's a huge opportunity to help creators, help celebrities to connect with their fans in a lot of different ways.\n" +
                        "\n" +
                        "\"We think the number of creators and the number of celebrities is growing exponentially. We're trying to keep up with ourselves.\n" +
                        "\n" +
                        "\"It's a big opportunity out there.\"\n",
                mercer, entertainment, uk, "2021-04-05", 0,
                "https://e3.365dm.com/21/03/1600x900/skynews-celebrity-videos-memmo_5324779.jpg?bypass-service-worker&20210331153851");
        articleRepository.save(entertainment3);



        Article entertainment4 = new Article("Foo Fighters frontman Dave Grohl to publish memoir of 'a life lived loud'\n",
                "He will give fans an insight into what it's like playing drums for Tom Petty on Saturday Night Live and swing dancing with AC/DC",
                "Foo Fighters frontman Dave Grohl is releasing a book, packed full of memories and anecdotes from his life.\n" +
                        "\n" +
                        "Titled The Storyteller, the 52-year-old says it will be \"a collection of memories of a life lived loud\" and is set to feature stories of his encounters with his former Nirvana bandmate, the late Kurt Cobain, David Bowie and Iggy Pop.\n" +
                        "\n" +
                        "The book will also see the Foo Fighters guitarist talk about his upbringing in Washington DC and his hopes of seeing the world when he left home at 18.\n" +
                        "\n" +
                        "He will give fans an insight into what it's like playing drums for Tom Petty on Saturday Night Live, swing dancing with AC/DC and performing at the White House.\n" +
                        "\n" +
                        "Over lockdown, the former Nirvana drummer started an Instagram account, @davestruestories, to share anecdotes with his fans as the music industry went on hold.\n" +
                        "\n" +
                        "\n" +
                        "Grohl said: \"There is a common thread that runs throughout everything that I do: storytelling.\n" +
                        "\n" +
                        "\"Whether in song, documentary film or on the page, I have always felt compelled to share moments from my life.\n" +
                        "\n" +
                        "\"In March 2020, realising that my day job with the Foo Fighters was going to go on hold, I started an Instagram account and decided to focus all of my creative energy on writing some of my stories down, something I love doing but I've never really had the time for.\n" +
                        "\n" +
                        "\"I soon found that the reward I felt every time I posted a story was the same as the feeling I get when playing a song to an audience, so I kept on writing.\n" +
                        "\n" +
                        "\"The response from readers was as soul-filling as any applause in an arena.\n" +
                        "\n" +
                        "\"So, I took stock of all the experiences I've had in my life - incredible, difficult, funny and emotional - and decided it was time to finally put them into words.\n" +
                        "\n" +
                        "\"Now with the amazing people at Simon & Schuster I'm excited and honoured to announce The Storyteller, a collection of memories of a life lived loud.\n" +
                        "\n" +
                        "\"From my early days growing up in the suburbs of Washington, DC, to hitting the road at the age of 18, and all the music that followed, I can now share these adventures with the world, as seen and heard from behind the microphone. Turn it up!\"\n" +
                        "\n" +
                        "Ian Marshall, deputy publishing director of non-fiction for Simon & Schuster UK, said: \"I don't think I have ever seen such universal excitement in a company, with so many of my colleagues sharing their very personal memories of Dave and his music.\n" +
                        "\n" +
                        "\"But, in the end, what really sets this book apart is the sheer brilliance of the writing: this is a rock memoir that will set the standard for a generation to come, as he truly is THE storyteller.\"\n" +
                        "\n",
                connelly, entertainment, usa, "2021-04-07", 0,
                "https://e3.365dm.com/21/04/1600x900/skynews-dave-grohl-foo-fighters_5332937.jpg?bypass-service-worker&20210407084244");
        articleRepository.save(entertainment4);



        Article entertainment5 = new Article("Obi-Wan Kenobi TV series on Disney Plus: Cast, release date and everything you need to know",
                "It’s set to follow the hugely popular Mandalorian in landing on the streaming service, there are some big names already signed up for thenew drama.",
                "There are some familiar faces from the Star Wars prequels\n" +
                        "along for the ride, plus some serious Hollywood talent ready to mix things up. The show is being described by Lucasfilm as a ‘special event series’, which suggests the story will be self-contained, rather than an expanding series like The Mandalorian. Deborah Chow is the main \n" +
                        "creative force behind the project, having previously directed two episodes of the The Mandalorian’s first series. Here’s everything you need to know. \n" +
                        "\n" +
                        "Who is in the cast of the  Obi-Wan Kenobi TV series?\n" +
                        "\n" +
                        "Star Wars fans were overjoyed when the first cast list of the Obi-Wan Kenobi project was announced – with Ewan McGregor’s Obi-Wan and Hayden Christensen’s Anakin Skywalker reuniting from the film prequels. Elsewhere, Bonnie Piesse, who played Beru in Star Wars: \n" +
                        "Attack of the Clones and Revenge of the Sith, and Joel Edgerton, who played her husband Owen, have been confirmed to return for the series too. \n" +
                        "\n" +
                        "Marvel’s The Eternals star Kumail Nanjiani is also along for \n" +
                        "the ride, along with Indira Varma (Game Of Thrones, This Way Up). Rupert Friend (Homeland), O’Shea Jackson (Straight Outta Compton), Sung Kang (Fast and Furious 6), Simone Kessell (Reckoning, The Crossing) and Benny Safdie (Pieces of a Woman, Good Time) are also in the cast. \n" +
                        "\n" +
                        "What is the Obi-Wan Kenobi TV series plot?\n" +
                        "\n" +
                        "The new series will take place in the gap between the Star Wars prequel trilogy and A New Hope, with the drama set nine years after the events of Revenge of the Sith. Revenge of the Sith ended with Obi-Wan defeating Anakin Skywalker in battle, only for his body to be retrieved by Emperor Palpatine and transformed into Darth Vader.\n" +
                        "\n" +
                        "The official synopsis from Disney reads: ‘The story begins 10 years after the dramatic events of Star Wars: Revenge of the Sith where Kenobi faced his greatest defeat, the downfall and corruption of his best friendand Jedi apprentice, Anakin Skywalker turned evil Sith Lord Darth \n" +
                        "Vader.’\n" +
                        "\n" +
                        "When will the Obi-Wan Kenobi TV series be released?\n" +
                        "\n" +
                        "Production will begin on the series this April, and the series has yet to be given an official release e date. The drama is expected to arrive in 2022.\n",
                fletcher, entertainment, uk, "2021-04-07", 0,
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/ewan-mcgregor-1567119325.jpg?crop=0.776xw:0.776xh;0.0918xw,0.0816xh&resize=768:*");
        articleRepository.save(entertainment5);



        Article entertainment6 = new Article("Game of Thrones: All the show’s biggest feuds from behind-the-scenes",
                "Game of Thrones brought us some of the most memorable TV moments of the 21st century over the course of its eight season run, but it turns out some of the biggest drama actually took place off screen.",
                "For all of the friendships that blossomed on set (Sophie Turner and Maisie Williams are the real winners of the Game of Thrones, in our eyes), there were conflicts that dogged production on the HBO show from the very start. Whether it was guest stars showering people in food, or actors holding grudges with one another for years at a time, \n" +
                        "there was almost as much conflict behind the camera as there was in front of it. These are the biggest rows and feuds that went on behind the scenes in Westeros. \n" +
                        "\n" +
                        "Ian McShane and the Burger\n" +
                        "\n" +
                        "Ian McShane’s guest appearance on Game of Thrones wasn’t exactly plane sailing for show bosses. The actor spoke about the drama in a damning way in interviews, dismissing it as just ‘tits and dragons’, before hitting out at fans by telling them they needed to get a ‘get a \n" +
                        "f***ing life’. His time on set wasn’t much better. While filming his role as spiritual leader Brother Ray in season six, there was an incident that involved a burger and an argument with Sandor ‘The Hound’ Clegane actor Rory McCann. As Game of Thrones director Mark Mylod revealed in James Hibberd’s book Fire Cannot Kill A Dragon, the actor took issue with the burger he’d been served for lunch on set. Instead of merely throwing it away, he decided to kick it as hard as he could, saying what he thought of the dish in no uncertain terms. Not only did it fly high into the air, but it landed Rory, who was eating his lunch nearby. Ian’s \n" +
                        "burger flip-out went down in folklore on the show, and his dislike for the dish led to the show changing caterers – something director James admitted to being thankful for. \n" +
                        "\n" +
                        "Nathalie Emmanuel’s comments from a sexist co-star\n" +
                        "\n" +
                        "Emilia Clarke was forced to step in during one unpleasant incident on the set of Game of Thrones, after a supporting actor made a sexist comment towards Nathalie Emmanuel. The actress joined the cast of the HBO as Missandei during season three of the show, and became friends with Daenerys Targaryen star Emilia. Nathalie said the pair are \n" +
                        "close and ‘always looked out for each other’ as ‘the only girls on a male-dominated set’. Emily had her back after Nathalie suffered an uncomfortable incident during one shoot, when a male actor made an inappropriate comment about the ‘revealing’ clothes she was wearing \n" +
                        "during a scene – something which didn’t go down well at all. Speaking to Vogue, Nathalie said: ‘In my first season, my costume was pretty revealing, and there was an incident with a supporting actor who made a comment about it on set – I mean, typical – and Emilia straightaway \n" +
                        "had my back. It got handled.’ \n" +
                        "\n" +
                        "Disagreements over the un-released pilot\n" +
                        "\n" +
                        "While not strictly a feud, the unaired Game of Thrones pilot was a moment of disagreement that proves drama was at the heart of Game of Thrones from the very beginning. The HBO epic might be one of the most successful shows in the history of television, but things were nearly so different. The original episode featured different cast members, and a negative reaction to initial screenings brought about \n" +
                        "many changes. In fact, the show might never have been made if screenwriter friends of showrunners D.B. Weiss and David Benioff hadn’t voiced their displeasure and pleaded with them to tear up the original script and start from scratch. ‘Watching them watch that original pilot was one of the most painful experiences of my life,’ Weiss\n" +
                        "said about his friends on John August and Craig Mazin’s podcast Scriptnotes. ‘As soon as it finished, [one friend] said, ‘You guys have a massive problem.’’ Had the friends of Weiss and Benioff not taken issue with them, then the show would have been very different. \n" +
                        "Conflict is the essence of great drama, after all. \n" +
                        "\n" +
                        "Lena Headey and Jerome Flynn\n" +
                        "\n" +
                        "One of the most speculated-over conflicts on the show is the alleged feud between Jerome Flynn and Lena Headey. While the pair’s characters Ser Bronn of the Blackwater and Cersei Lannister were directly involved in a plot to kill the Lannister brothers, they were only ever seen together in one short sequence from the season three premiere episode Valar Dohaeris, which got fans a little suspicious. The\n" +
                        "pair first starred opposite each other in 90s ITV drama Soldier, Soldier, and rumours of a romantic connection between them first surfaced way back in 2002. They were never officially confirmed, but it was also \n" +
                        "later reported that the pair had dated and broken up in 2014 when season four of Game Of Thrones was on air. It was alleged that the pair had gone through a difficult break-up, and had been kept apart on screen as a result of an acrimonious split.\n" +
                        "However, speaking to Con of Thrones audiences in Nashville in 2019, Jerome went some way to setting the record straight. ‘The last time I saw Lena we were speaking, so I wouldn’t believe everything you read,’ he said. ‘[The media] can get pretty desperate for stories... \n" +
                        "Lena’s a wonderful person and a wonderful actress.’\n",
                fletcher, entertainment, uk, "2020-11-05", 0,
                "https://metro.co.uk/wp-content/uploads/2020/11/PRC_171485944.jpg?quality=90&strip=all&zoom=1&resize=644%2C338");
        articleRepository.save(entertainment6);



        Article entertainment7 = new Article("Obi Wan TV show air date, cast, plot, trailer and everything you need to know",
                "This *is* the show you're looking for.",
                "Obi-Wan will stream exclusively on Disney+ and we can't wait to say 'Hello there!'\n" +
                        "A new Kenobi project had been rumoured for a while (first in the form of a movie, then as a series), but it was officially announced at Disney's D23 event in August 2019, and no-one was happier to hear the news than the show's star Ewan McGregor, who found keeping the secret quite a struggle.\u2028\n" +
                        "\"It got difficult,\" McGregor said (via Flickering Myth). \"I was brought up to tell the truth, and I was in a situation where I wasn't really allowed to. The studios and the big franchises want to keep everything very secret and as closed as it can be, and rightly so.\n" +
                        "\n" +
                        "\"But at the same time there's this overwhelming amount of speculation online and on social media and what have you, and wherever I went for the last 10 years people would ask me, 'Would you do it again?' Once they started doing spin-offs of course everyone was like, 'Are you gonna do an Obi-Wan Kenobi spin-off?' and I was talking to Lucasfilm and Disney about that, but of course I couldn't say that I was.\u2028\n" +
                        "\"So I'd have to go, 'Well, you know, if they wanted to do one I'd be quite interested in doing it,' and it started to look a bit like I was just trying to get the part – which for a man of my standing was quite humiliating.\"\n" +
                        "The show will be directed by Deborah Chow, who has Star Wars pedigree in the form of her excellent work on The Mandalorian.\n" +
                        "\n" +
                        "\"We really wanted to select a director who is able to explore both the quiet determination and rich mystique of Obi-Wan in a way that folds seamlessly into the Star Wars saga,\" Lucasfilm President Kathleen Kennedy said in a release.\n" +
                        "\n" +
                        "\"Based on her phenomenal work developing our characters in The Mandalorian, I'm absolutely confident Deborah is the right director to tell this story.\"\n" +
                        "The series has been written by Hossein Amini, who also wrote Drive and Snow White and the Huntsman.\n" +
                        "Here's everything you need to know.\n" +
                        "\n" +
                        "Obi Wan cast: Who will be in Obi Wan?\n" +
                        "\n" +
                        "Unsurprisingly, Obi-Wan himself was the first to be confirmed.\n" +
                        "\"I'm more excited about doing this one than I was doing the second and third one that we did before,\" McGregor told Empire. \"I'm just excited about working with Deborah Chow, and the storylines are going to be really good I think. I'm just excited to play him again. It's been long enough since I played him before.\"\n" +
                        "\n" +
                        "And it's fair to say quite a lot has changed since his last Star Wars dalliance.\n" +
                        "\n" +
                        "\"The first three [Star Wars films] I did were really at the very beginning of digital photography,\" he said. \"We had a camera with an umbilical cord to a tent. It was like back to the beginning of movies where the camera didn't move very much because there was so much hardware attached to it.\n" +
                        "\n" +
                        "\"Now we're going to be able to really create stuff without swathes of green-screen and blue-screen, which becomes very tedious for the actor.\"\n" +
                        "\n" +
                        "McGregor will be returning to the role he took on in The Phantom Menace, Attack of the Clones and Revenge of the Sith.\n" +
                        "\"I want to get closer and closer to how Obi-Wan felt while Alec Guinness was playing him,\" he said. \"I feel like I'm greyer and nearer him in age, so it'll be easier to do that.\"\n" +
                        "\n" +
                        "On The One Show, McGregor echoed that, discussing how it'll be nice to \"bridge that gap\" between the two performances, adding: \"It's really exciting.\"\n" +
                        "\n" +
                        "Star Wars head honcho has also announced that none other than Hayden Christensen will also appear, reprising the role of Darth Vader in the new series. This came as a huge shock to many given the mixed response his part received following the prequel trilogy, but it's also a welcome addition to the show which helps provide us with a better understanding of what it's about.\n" +
                        "\n" +
                        "During the initial announcement, Hayden alluded to the troubled relationship between Anakin and Obi-Wan which was complicated further following their fight on Mustafar.\n" +
                        "\n" +
                        "\"It was such an incredible journey playing Anakin Skywalker,\" Christensen recalls. \"Of course, Anakin and Obi-Wan weren’t on the greatest of terms when we last saw them… It will be interesting to see what an amazing director like Deborah Chow has in store for us all. I’m excited to work with Ewan again. It feels good to be back.\"\n" +
                        "\n" +
                        "There's a chance the show will also feature Jimmy Smits' \n" +
                        "Senator Bail Organa of Alderaan – he's another actor from the prequel trilogy who's appeared in Disney's Star Wars movies, thanks to his Rogue One cameo. But that's pure guesswork on our part.\n" +
                        "\n" +
                        "Don't expect any Mandalorian crossover episodes, however – even if they will take place at some of the same locations. Why? Patience, Padawan, we're about to get to that…\n" +
                        "\n" +
                        "But at least Ewan's been binging everyone's favourite live action Star Wars show.\n" +
                        "Discussing his preparation to return to the character, McGregor did mention that The Mandalorian was part of his prep (via Newsweek).\n" +
                        "\n" +
                        "\"It'll just be there, I think. Also, I'm reminding myself by watching their new films and The Mandalorian and stuff, I really enjoyed. I keep myself as current as I can with the Lucasfilm world. I don't think it will take two minutes; I'll put the cloak back on and I'll be there, I think,\" he said.\n" +
                        "\n" +
                        "Obi Wan plot: What will Obi Wan be about?\n" +
                        "\n" +
                        "Despite the fact McGregor has demonstrated the ability to keep a secret for several years, he's been the best source of information about the Disney+ series.\n" +
                        "\n" +
                        "\"The storyline sits between Episode III and Episode IV,\" McGregor told Men's Health.\n" +
                        "That's why it can't cross over with The Mandalorian – that show's set after Episode VI.\n" +
                        "The last time we saw him in the role, \"the Jedi Order was falling apart. It will be interesting to take a character we know in a way and show him – well, his arc will be quite interesting, I think, dealing with the fact that all the Jedi were slaughtered with the end of Episode III. It's quite something to get over\".\n" +
                        "\n" +
                        "McGregor also confirmed that the narrative would unfold over six episodes, which will each be roughly an hour long.\n" +
                        "When Kathleen Kennedy announced that Anakin will appear on the show, she hinted at \"a rematch\" between Vader and his former master. For better or worse, get ready to relive the prequel era of Star Wars in its fullest.\n" +
                        "\n" +
                        "And does this mean that Vader's former apprentice, Ahsoka Tano, will appear too? Rumours suggest that this could be a possibility now that Anakin is back in the picture.\n" +
                        "\n" +
                        "Obi Wan trailer: When will we see the Obi Wan trailer?\n" +
                        "\n" +
                        "Not for a while – but for now, click here to see how Darth Vader and Baby Yoda share more in common than you might realise!\n" +
                        "Expect to see the first proper trailer in the month leading up to the premiere. \n" +
                        "\n" +
                        "As soon as it lands, we'll update this feature, along with the latest news, scoops and exclusives, so do keep us bookmarked.",
                ashurt, entertainment, uk, "2020-12-11", 0,
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/ewan-mcgregor-1567119325.jpg?crop=0.776xw:0.776xh;0.0918xw,0.0816xh&resize=768:*");
        articleRepository.save(entertainment7);



        Article entertainment8 = new Article("The Witcher: Henry Cavill confirms season 2 filming plans have changed due to second lockdown ",
                "Henry Cavill has confirmed that The Witcher is returning to the studio over lockdown for filming on season two. ",
                "The star has been keeping fans informed of his training plans over recent times, running in the hills of the Lake District in a recent Instagram post. Now, however, the star has announced that he is relocating south, with filming on the Netflix show due to take place in the studio during lockdown. ‘England returns to Lockdown on Thursday so it is time for me to depart Yorkshire and the extraordinary North, and head back down South to continue shooting in the studio,’ he wrote on Facebook. ‘Thank you for hosting all of us on season 2 of The Witcher. Hopefully I shall return to your hills, dales and fells soon. Stay strong and stay safe, my friends.’\n" +
                        "\n" +
                        "Anticipation for the new season is high, especially after Henry was seen battling new monsters in the first season two teaser. The star is returning to the role of Geralt of Rivia, teaming up with Princess Ciri (Freya Allen) and Yennefer of Vengerberg (Anya Chalotra) for a new set of adventures.\n" +
                        "\n" +
                        "Filming for season two was originally shut down in March as a result of the coronavirus outbreak. The cast and crew previously returned to set in August, with changes written into the script to allow for social distancing measures. The Witcher is likely to air on Netflix in 2021 given the delay, but a release date has yet to be confirmed.\n",
                fletcher, entertainment, uk, "2020-11-3", 0,
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/the-witcher-season-2-henry-cavill-1601904499.jpg?crop=0.837xw:0.669xh;0.0291xw,0.0458xh&resize=768:*");
        articleRepository.save(entertainment8);



        Article entertainment9 = new Article("Great British Bake Off: Paul Hollywood’s ex Summer Monteys-Fullam claims he ‘doesn’t actually bake’ and prefers cheap sliced bread ",
                "The fallout from Paul Hollywood and ex Summer Monteys-Fullam’s breakup keeps rumbling on, and now Summer has done the unthinkable and dished the dirt on Paul’s bread preferences. ",
                ". Summer took to Instagram for a fan Q&A recently, claiming that Great British Bake Off star Paul didn’t make fresh bread at home during their time together, and saying that he actually prefers the cheap sliced stuff. A fan asked her the question [via the Sun]: ‘Could you bake before you met Mr Bake Off himself?’ ‘He didn’t bake – he liked his cheap sliced bread!’ she replied. During the same fan Q&A, Summer was also asked: ‘Did you ever get nervous cooking for Paul as he’s a chef.’ She replied: ‘Lol. Firstly, he isn’t a chef. And secondly no not really, he’d just eat Rice Krispies most evenings so I’d cook for myself.’\n" +
                        "\n" +
                        "Model and barmaid Summer and Paul first got together following the presenter’s split from his wife Alexandra Hollywood. Summer previously revealed that she was ‘besotted at the beginning’ of their relationship. Summer split from Paul last year after two years together. She recently claimed that Paul has sent her more than 25 legal letters. While there were initially very close, Paul and Summer called time on their relationship after things turned bitter.\n" +
                        "\n" +
                        "Paul accusing his ex of ‘playing games’, but the 25-year-old barmaid denied his accusations. She went on to claim the Bake Off star tried to pressure her into signing a gagging order.\n",
                fletcher, entertainment, uk, "2020-11-13", 0,
                "https://metro.co.uk/wp-content/uploads/2020/09/PRC_166746343.jpg?quality=90&strip=all&zoom=1&resize=644%2C338");
        articleRepository.save(entertainment9);



        Article entertainment10 = new Article("Saved By The Bell apologises to Selena Gomez for kidney transplant joke",
                "The makers of Saved By The Bell have apologised to Selena Gomez for a joke made in a recent episode about her kidney transplant.",
                "A spokesperson for NBC said it was \"never our intention\" to joke about her surgery.\n" +
                        "\n" +
                        "The rebooted series features an episode where two characters argue over who donated a kidney to the singer in 2017.\n" +
                        "\n" +
                        "NBC also said they had been in touch with Gomez about making a donation to her charity.\n" +
                        "\n" +
                        "Selena, 28, received a kidney transplant three years ago after being diagnosed with the autoimmune disease Lupus.\n" +
                        "\n" +
                        "'The joke is offensive to donor families'\n" +
                        "\n" +
                        "The characters in Saved By The Bell speculated in a scene about who donated the kidney - with one claiming it was Demi Lovato and another saying it was Justin Bieber's mum.\n" +
                        "\n" +
                        "Later in the episode, graffiti appears on the wall saying, \"does Selena Gomez even have kidneys?\"\n" +
                        "\n" +
                        "She does, and one of them was donated by best friend Francia Raisa.\n" +
                        "\n" +
                        "Francia has since tweeted about the episode, praising other donors for performing a \"selfless act\".\n" +
                        "\n" +
                        "Cecilia Adamou is 21 and has just graduated from university.\n" +
                        "\n" +
                        "At the age of 12 she received a kidney transplant from her mum and says she found the way Saved By The Bell dealt with organ donation \"tasteless\".\n" +
                        "\n" +
                        "\"What many people don't realise is that although Selena Gomez knew her kidney donor, most people who receive kidney transplants receive them from dead donors and never find out who they are,\" she tells Radio 1 Newsbeat.\n" +
                        "\n" +
                        "\"So I think the joke the show made about not knowing who gave Selena her kidney is offensive to donor families.\"\n" +
                        "\n" +
                        "Cecilia also says she believes it's wrong for any show in 2020 to make jokes about illnesses and disabilities.\n" +
                        "\n" +
                        "\"There's already lots of wrong information online about organ donation,\" she says.\n" +
                        "\n" +
                        "\"I think the show could give people the wrong idea about organ donation and put them off.\"\n" +
                        "\n" +
                        "\"The joke is offensive to donor families\"\n" +
                        "Fiona Loud is the head of policy at charity Kidney Care UK and has received a kidney herself.\n" +
                        "\n" +
                        "She says donating a kidney is \"one of the most selfless things a person can do\" for a friend, family member or a stranger.\n" +
                        "\"This extraordinary generosity transforms lives and is something to be respected, rather than be made fun of.\n" +
                        "\n" +
                        "\"Every day in the UK around 20 people will develop kidney failure and sadly at least one person will die every day in need of a kidney transplant.\n" +
                        "\n" +
                        "\"We would like to give our utmost thanks and appreciation to amazing kidney donors like Francia Raisa.\"\n" +
                        "\n" +
                        "What is Lupus?\n" +
                        "\n" +
                        "According to the NHS, it's a long-term health condition that causes joint pain, skin rashes and tiredness.\n" +
                        "\n" +
                        "It has no cure and can also cause headaches, mouth sores, a high temperature and hair loss.\n" +
                        "\n" +
                        "It is not easy to diagnose because it has similar symptoms to other conditions but a blood test will usually reveal the condition if high levels of a type of antibody are found.",
                rackham, entertainment, usa, "2020-11-30", 0,
                "https://ichef.bbci.co.uk/news/976/cpsprodpb/23E5/production/_115698190_gettyimages-1204549367.jpg");
        articleRepository.save(entertainment10);


        Article lifestyle1 = new Article("Beware sugar highs: seven healthy ways to get more energy – from stretching to sourdough",
                "It’s tempting to use coffee and sweet treats as pick-me-ups, but they are only temporary solutions. Here’s how to keep yourself going for longer",
                "The twin gods of conquering the post-lunch slump are caffeine and sugar. But such pick-me-ups are temporary: while a syrupy latte will help you power through until dinner time, you may well end up lying awake at 3am, staring at the ceiling. What if there were a way to have more energy that wasn’t unhealthy, addictive or expensive? (Those takeaway coffees add up.) Here, some experts weigh in.\n" +
                        "Get moving\n" +
                        "“Use exercise to nourish you, not punish you,” says Sarah Russell, a clinical exercise specialist who works with people with cancer. “Find a way to move that will give you energy, rather than using exercise to tire yourself out.”\n" +
                        "To find motivation to get moving, even when you are feeling worn out or low, Russell encourages her clients to focus on achievable goals. “Even 10 minutes of movement will energise you,” she says. “Push away those images the fitness industry is always trying to sell you, of people in Lycra with weights or out running. Do some stretching, if you feel up to it. Because something is always better than nothing – and it will always lead to more.”\n" +
                        "Carbohydrates are your friend\n" +
                        "“The main reason people struggle with low energy is because they’re either not eating enough throughout the day or they’re not eating enough carbohydrates,” says Priya Tew, a registered dietitian. Contrary to what diet culture teaches us, carbohydrates are not the enemy. “Carbohydrates provide us with glucose, which is the body’s preferred energy source,” says Tew. “You want to balance the energy coming from carbohydrates by eating protein and healthy fats, too, as this helps stabilise your energy levels, giving you more lasting energy over the day.” This is all to say: pass the lockdown sourdough.\n" +
                        "Check your iron levels\n" +
                        "Iron deficiency, also known as anaemia, can cause symptoms including tiredness, lack of energy and shortness of breath. It is more common in women, often due to heavy periods or pregnancy, and can be treated by changes to your diet. Include more dark-green leafy vegetables, iron-fortified cereals and pulses, as well as iron supplements, if necessary. “It’s always a good idea to have your iron levels checked by a doctor if you’re feeling fatigued,” Tew says.\n" +
                        "Same goes for vitamin D\n" +
                        "“The first sign of vitamin D deficiency can be fatigue,” says Tew. “So do take a vitamin D tablet in winter if you feel you may be deficient.” In April 2020, Public Health England recommended that Britons take a daily dose of vitamin D, as a result of the public’s reduced exposure to the sun during lockdown.\n" +
                        "Be wary of sugar highs\n" +
                        "Look, sugary snacks work: you do feel more awake afterwards. But a doughnut a day will certainly not keep the doctor away. “High-sugar foods will give you an initial surge in energy, but then your energy levels will plummet down,” says Tew. “I call it the blue Smartie effect.”\n" +
                        "Instead, “focus on eating balanced meals and snacks with fibre-rich wholegrains, carbohydrates, proteins, fruit and vegetables, plus healthy fats,” says Tew. “The B vitamins found in wholegrains will help you release energy from foods.” Also, avoid alcohol. “It will make you feel tired the next day as your body processes it,” says Tew.\n" +
                        "Go outside\n" +
                        "Research from the University of Rochester, published in the Journal of Environmental Psychology, has found that spending time outside in nature can have a powerfully invigorating effect. “When people walk out in nature, they get a boost in vitality or energy,” says Prof Richard M Ryan from the university. “This brighter mood lasts for longer and has a more powerful effect than things like drinking coffee or eating chocolate.”\n" +
                        "Crucially, you need to be engaged with nature when out walking in it. “You can’t be on your mobile phone,” says Ryan. “You need to allow yourself to be immersed in the world around you.” But the walk doesn’t have to be long – just 10 minutes will have a rejuvenating effect for several hours. “A lot of us feel draggy in the day and reach for that cup of coffee,” says Ryan. “But the evidence shows that we would be better served by taking a break and walking outside.”\n" +
                        "Don’t slam yourself in the gym\n" +
                        "“People often beat themselves up if they feel like they’re not doing hard enough workouts,” says Russell. “And then they end up not doing anything at all.” The best exercise routine is a consistent one. “If people are struggling to find energy to exercise, it becomes a vicious circle,” says Russell. “They lose more muscle and become less active – and even more lethargic.”\n" +
                        "Russell recommends home-based strength work, such as chair squats or bicep curls using small hand weights (or tins). Pilates is also a great way to strengthen your core without having to pay for expensive equipment; there are plenty of free YouTube videos online. Above all, Russell says, “find the exercise that works for you”.\n" +
                        "\n",
                kale, lifestyle, uk, "2021-04-05", 0,
                "https://i.guim.co.uk/img/media/fd9f7d3e6ce09d0342880c4d54551e3628d2a3ea/0_384_5760_3456/master/5760.jpg?width=645&quality=85&auto=format&fit=max&s=613ec444e24d22c5321f262db41f4f2a");
        articleRepository.save(lifestyle1);


        Article lifestyle2 = new Article("'I wear my grandad’s old boxers': meet the people who haven't bought clothes for a decade",
                "\n" +
                        "More and more of us are giving up fast fashion. But could you go for 10 years without shopping? Guardian readers tell us how – and why – they have",
                "When the former Blue Peter presenter Konnie Huq told the hosts of Loose Women that she had not bought any clothes in a decade, she was met with consternation and shock from the show’s famously forthright panellists. “You’re not still wearing Blue Peter clothes!” exclaimed Janet Street-Porter. Huq acknowledged, sheepishly, that the lilac cardigan she was wearing did in fact date from her days on children’s TV.\n" +
                        "Huq’s decision to step away from consumerism and wear the clothes she already has is to be commended, given that the UK sends around £140m-worth of clothing to landfill every year. And, as the public becomes increasingly aware of the social and environmental impact of the fashion industry, it is likely that more will do the same. Already consumers are turning away from fast fashion. New research from the Fashion Retail Academy finds that 51% of Brits are opting to purchase expensive but longer-lasting clothes, rather than cheaper throwaway items, up from 33% a year ago. Many attribute this move towards more sustainable consumer behaviour to the so-called “Greta” effect. (Famously, the 17-year-old Swedish climate activist, Greta Thunberg, doesn’t buy new clothes, telling Democracy Now that she shops secondhand, or wears other people’s hand-me-downs.)\n" +
                        "\n" +
                        "Huq’s no-clothes purchasing policy made headlines across the UK. But away from media scrutiny and bemused TV hosts, many ordinary people have been quietly wearing the same clothes day-in, day-out, for the past decade, too. We spoke with Guardian readers who never buy clothes, to ask them how they stay presentable, stop things from wearing out and where they would be if their loved ones didn’t buy them socks come Christmas.\n" +
                        "\n" +
                        "Alfy Fowler, 29, chef from Cambridge\n" +
                        "I used to care about clothes when I was younger. But then I went to university to study product design and I realised that consumer culture really didn’t sit well with me. We were being trained to design want and need in people. It didn’t feel right.\n" +
                        "The majority of my clothes are well over a decade old. Some of them do look a bit tatty, I’m not going to lie. I do understand that your first appearance counts for something in society, and that people might look at my clothes and think about me in a certain way. But for me personally, it is more important to be true to what I believe in than care about what other people might think.\n" +
                        "I last bought a Paul Smith jumper about nine or 10 years ago. It was £140, which is a lot of money, but I still wear it today, and it looks the same as the day I bought it. The most loved item in my wardrobe is a pair of David Beckham-endorsed Adidas shorts I bought when I was 14. I still wear them all the time. The elastic is gone, so I do have to be careful to make sure the drawstring is tied up! They have started to peel a bit.\n" +
                        "My mum and dad are always trying to buy me new clothes. They are Thatcher’s children: materialism was drilled into that generation; buying stuff empowers them. My mum recently insisted on buying me a coat, but only because she was so fed up with the old Barbour jacket I had been wearing.\n" +
                        "It was my grandad’s Barbour: he has sadly passed away, so I took it from his house after he died. That’s not the only thing I took, actually; I wear my grandad’s old Slazenger boxers. My girlfriend thinks it is really weird.\n" +
                        "I loved that Barbour jacket. It was ancient; I kept sending it to the Barbour shop to get it repaired, but they repaired it so many times it was basically a new coat.\n" +
                        "I never get bored of my clothes. I think that people are told that they need to buy new clothes to fit in and seem trendy, but it is only you who inherently cares what you look like. People are too immersed in their own lives to notice you only have four T-shirts. That stuff doesn’t matter. We have become so selfish as human beings. We are bred to consume. Nothing has any value any more.\n" +
                        "Abi Jenkins, 49, dressmaking teacher from Stockport\n" +
                        "I am of Asian heritage: my family is from India and Pakistan. I think that’s why I am really reluctant to buy clothes. It is horrible for me to know that people of my heritage are being abused by the garment industry to produce clothes for people in the west who don’t care about their wellbeing.\n" +
                        "I remember watching the footage of the 2012 Dhaka garment factory fire. It was horrific, watching people try to escape. I don’t like to stand on a soapbox and say: “You should do this, and you should do that.” But for me personally, buying clothes isn’t something I want to do. It’s how I am.\n" +
                        "Apart from tights and the odd bit of underwear, I haven’t bought any clothes for a decade. I make all of my clothes, myself, by hand. I learned to sew from my mum. She was always immaculate; she never had a hair out of place. Just the sweetest, most caring person. She died recently. When I am sewing, I feel close to her. She really knew how to sew.\n" +
                        "Virtually all the fabric I use is vintage. Buying new fabric is really the same as buying fast fashion, in my book. Why do we need new fabric? There’s already so much beautiful fabric in the world. I work with a charity called Tools for Self Reliance, and they get donated lots of old material. If I see something I like the look of, I pop a donation in the collection box. I also have reams and reams of fabric that I purchased in the 1980s from a dressmaking shop: it was closing down, and the owner let me have it cheap.\n" +
                        "Most of the time, I am a bit of a scruff. But when I am teaching dressmaking, I make an effort. You want to look nice, because you’re an advert for the clothes you are teaching people to make. I follow trends on social media, and then teach people how to make the clothes at my workshops. You get all sorts: doctors, solicitors, care workers. They all say it is therapeutic.\n" +
                        "I don’t get bored of my wardrobe, because if I want something new I can just nip upstairs to my sewing room and make it. I can make a shift dress in half an hour; I call them my half-hour dresses. I just made a ball gown from old fabric over a few days.\n" +
                        "I never want to buy things. I look at things in shops and think the quality is abysmal. My daughter makes her own clothes now. I am so glad she is not spending her pennies in those dreadful shops. But I really don’t want to sound like I’m on my high horse. I just want to educate people.\n" +
                        "Jon Watkins, 70, retiree from Llangollen\n" +
                        "Everything in my wardrobe is certainly not from this century. I have had the same ties since the 1980s. I think the last time I bought clothes was in 1984: I was on a business trip and they lost my suitcase, so I went to a shop in Rome and bought new suits, shirts, trousers and underwear.\n" +
                        "Technically, I could buy clothes. I know where Marks & Spencer is! I just prefer not to go shopping. Ever since Woolworths closed, I can’t think of a decent shop. Shopping is so tedious. I can do a supermarket shop, because I have to, otherwise I would starve. But that’s it.\n" +
                        "I do occasionally get marched to TK Maxx by some lady friends who buy things for me. Whatever they choose is fine. Everything else in my wardrobe seems to arrive! My brother-in-law gives me shirts and pullovers. It’s usually when people think I am looking mucky that stuff tends to turn up. I never ask for anything new. Hand-me-downs look new to me! I can’t tell the difference.\n" +
                        "I look like a mess, but I don’t really care. It is the same with haircuts: I only get them if I have got to meet the bank manager or something like that. The only thing I buy for myself is socks and pants.\n" +
                        "I have a woman who comes to clean my house for me and she’s not averse to throwing clothes and shoes away that she deems unwearable. I don’t mind as long as she tells me what she’s chucking out, otherwise I spend ages looking for it and can’t find it. She thinks shirts should have all the buttons on them and rubbish like that. They don’t really. As long as there are some buttons, it will work.\n" +
                        "Athena Drakou, 59, semi-retired accountant living in West Sussex, but originally from Greece\n" +
                        "Thirty-four years ago, I was pregnant with my daughter back home in Greece. The Chernobyl nuclear disaster happened and pregnant women were advised not to eat any fresh food. That experience really changed my thinking about the environment.\n" +
                        "I became an accountant, then moved to the UK and studied environmental science. But my interest in the environment and how we consume clothes never went away. Back in Greece when I was growing up, everything was about consumerism. Being a Greek woman who never went shopping, people thought I was crazy!\n" +
                        "I think I have bought one pair of jeans in the past 10 years. That’s it. My wardrobe is basically empty. It is easy to find everything in there. When I need clothes for a special occasion, like a wedding, I either borrow something from a friend, or there are platforms now where you can rent clothes.\n" +
                        "It helps that I am the same dress size I was when I was 20. I try to keep fit and not gain weight. Everything in my wardrobe still fits. All my clothes are very good quality: I have a coat that I have worn for 24 years. I take excellent care of it and it’s still in good condition. If you looked at it, you wouldn’t believe I’d had it for so long.\n" +
                        "Part of the reason my clothes last is because I don’t over-wash them. I have a rule that I wear everything at least twice – underwear excluded, obviously – before washing it. I can wear jeans five or six times before putting them in the machine. I mend all my clothes. If I need a new sweater, I knit something. My friends will often give me wool or yarn. Knitting helps me relax.\n" +
                        "Never buying clothes feels liberating. I love not having to think about clothes all the time. I have a few things in my wardrobe. Everything goes together. I never worry about what I am going to wear. For me, it has always been simple.\n" +
                        "Andrew Ledwidge, 52, public-sector worker from south London\n" +
                        "I have a bit of a phobia about new clothes. It is about comfort; I’m very particular about things. I hate clothes that are too clingy or tight. Animal fibres make me really itchy. I think maybe I am a bit allergic to wool.\n" +
                        "I like to wear old clothes, because I know they will be comfortable. I don’t like the texture of new clothes at all. It is a bit of a paradox, because in order for things to get old you have got to wear them a lot. If I had the choice between wearing an old item or something new, I’d always go for the old thing.\n" +
                        "My wife likes to sneak a few new things in my wardrobe from time to time, so I am better presented. She is into fashion and is always beautifully dressed. But the new things tend to stay in my wardrobe. I don’t wear them. Probably three-quarters of the things she buys me, I never wear.\n" +
                        "We’re at a bit of an impasse, my wife and I. She hasn’t stopped trying to smarten me up a bit and get me into some newer things, but I don’t find those things comfortable. It is a long-running battle, but we have a laugh about it. Sometimes she will drag me into a clothing store, and within 30 seconds I want to walk out.\n" +
                        "I am not bothered about my appearance or anything like that. Clothes for me are about comfort. Occasionally I will look at other men and think: “That jumper looks nice. I wish I had something like it.” But then I think that, even if I did have it, I would never wear it.\n" +
                        "Additional reporting by Laura Kay\n" +
                        " This article was amended on 12 March 2020 because Athena Drakou became an accountant before she moved to the UK, not after she moved as an earlier version said.\n",
                kale, lifestyle, uk, "2020-03-12", 0,
                "https://i.guim.co.uk/img/media/4bf2fe58e18fecf1940af2607e101baf23f1dfc2/0_0_6056_3633/master/6056.jpg?width=605&quality=85&auto=format&fit=max&s=3e31025971f9e483e61ebb15eaa6c304");
        articleRepository.save(lifestyle2);


        Article lifestyle3 = new Article("Emma Barnett on the joy of cross-generational friendships",
                "There is something very special about having older female friends.",
                "For the last three months I have been calling my oldest friend unaware she had died.\n" +
                        "Let me explain. Mrs K, her name in my phone and how I always referred to her, was in her nineties and started out as my drama teacher when I was eight. But what began as your classic teacher-pupil relationship - blossomed into a nourishing adult friendship.\n" +
                        "When I left school we exchanged numbers and promised to keep in touch. And I knew we meant it. As a leaving gift I bought her tickets to a play at our local theatre and our post-school friendship began from there – as she rang to thank me and discuss the production. The switch from teacher and pupil to pals was almost seamless – as I had grown up with her and always felt she treated me as someone she didn’t mind listening to, as well as educating.\n" +
                        "\n" +
                        "\n" +
                        "We spoke every few months and when we did - it was like we were immediately transported back to her cosy attic-style classroom at the top of my school in Manchester - where she opened my eyes to the great playwrights, poets and regaled me with stories of her exotic travels with her beloved husband.\n" +
                        "She was always Mrs K - even over lunch in her local pub years later - as I navigated my twenties and she, her eighties - and she insisted I used her first name. I simply couldn’t. But beyond that - nothing was off the table. We weren’t women who did formalities.\n" +
                        "I called her just before Christmas and left a message but didn’t hear back. I thought nothing of it as it is always a busy time.\n" +
                        "\n" +
                        "\n" +
                        "But then I phoned again in January. Still nothing. I didn’t wish to intrude. And then again in February - around both of our birthdays - and still nothing. I left voicemails. And rang a twice more on each occasion in case she couldn’t reach the phone in time. I started to worry as I heard nothing back.\n" +
                        "You see we had that sort of friendship where it was just us. I didn’t know her family and they didn’t know me. I knew a lot about them of course - but she lived alone, having been widowed for a long while - and our friendship was that classic and pure woman-to-woman relationship - with no one else involved. I had wondered when this day came how would I find out that she was no longer of this earth - but never wanting to dwell on the negative (Mrs K definitely wouldn’t approve of that) I had pushed it to the back of my mind. I certainly hadn’t thought about what would happen if the worse took place during a global pandemic.\n" +
                        "Eventually I wrote to my old school who managed to find out for me what had happened - and wrote to me this week to confirm the worst: she died at the beginning of January.\n" +
                        "The news hit me like a sucker punch on Monday and tears sprang to my eyes sitting in my studio at Woman’s Hour as I read the email after the end of the programme.\n" +
                        "\n" +
                        "\n" +
                        "Just as the world was opening back up a little and friends could reunite under some much needed sunshine in parks and gardens - my mate of 28 years was no more. That pub lunch when I was able to go back to Manchester wasn’t going to happen.\n" +
                        "It felt unmooring and unnerving. I guess I am still processing my grief and will do for some time.\n" +
                        "But this unexpected moment also made me take stock of what a gift our friendship was; and how valuable I find having friends of different ages.\n" +
                        "While many of us have older women in our lives through our families - and those grandmas, aunts, godmothers and cousins can also be great pals - there is something very special about having older female friends whom you have chosen; women you can learn from; laugh with and always rely on for a juicy story - because so often they have been there or done it in a different way before you.\n" +
                        "I always felt like I could breathe when I spoke to Mrs K. She made me slow right down and tell her what was really going on. And I like to think that she perhaps got something out of having a younger friend too at the end of the phone. She confided in me about her health difficulties but also how much she missed her work, her travels and certain friends – as age started to impede what she could do. But her spark and positivity always won out even in these tougher exchanges. In turn I pulled no punches when describing raucous nights out or odd moments from behind the scenes in my work - making her wail with laughter.\n" +
                        "And on that she gave great advice about my career – namely never to take myself too seriously and with her elocution hat on – she sternly reminded me to pronounce my t’s at the end of words and to watch my intonation. Teacher’s habits die hard.\n" +
                        "And when going through tougher times - she also brought me back down to earth with a gentle bump. For instance I remember telling her that I simply couldn’t get pregnant. She was one of the rare people I confided in while going through our fertility challenge. I loathed talking about this monthly grind I found myself in. And she was the only person who said: “Well maybe you won’t. And that will be that. You will still have a wonderful life but just a different one.”\n" +
                        "Only an older woman can both tell it to you straight and do so in a way that gives you hope and without managing to offend. I needed that candour instead of the many platitudes others felt obliged to trot out - such as: “It will happen for you.” Because it might not. That is the brutal reality. In my case pregnancy did happen. Two and half years on. However our friendship was never altered by my son coming along. Yes she asked after him - but it was one of the only relationships during the storm of learning a new identity as a mother that stayed exactly the same. A safe familiar port.\n" +
                        "And that’s why I wrote that I feel unmoored - not just because I didn’t get to say goodbye - but because these sorts of deep-rooted friendships are rare and take years to cultivate. They support us like the roots of trees.\n" +
                        "I am lucky to have a few other older female friends and also now some younger pals of my own. I think the benefits we can gain from cross-generational friendships aren’t shouted about enough. If you don’t have any older women in your life as pals - cross the bridge. Make the connection. You won’t regret it; I promise. You don’t have to stick to your year group anymore. We ain’t at school bound by such arbitrary barriers.\n" +
                        "\n" +
                        "Indeed it was at school I made one of my greatest pals; she just happened to be far older than me. Mrs K - thank you. From the bottom of my heart.\n" +
                        "Emma Barnett presents BBC Radio 4’s Woman’s Hour and BBC Two’s Newsnight. On Twitter/Instagram she’s @emmabarnett. Her book is called It’s About Bloody Time. Period.\n" +
                        "Come back to GLAMOUR next fortnight to read her next instalment.\n",
                barnett, lifestyle, uk, "2011-04-02", 0,
                "https://gl-images.condecdn.net/image/W7w3qLOoZA9/crop/600/square/f/emma-barnett_sf.jpg");
        articleRepository.save(lifestyle3);


        Article lifestyle4 = new Article("These are the major life changes you'll go through in 2021, according to your horoscope\n" +
                "What does the year hold for you?\n",
                "We all entered 2021 with renewed energy after a total sh**how of a 2020 but things aren't exactly looking much more promising, are they? With the vaccine being rolled out and whispers of roadmaps out of lockdown on their way, we can only hope that life will get back to normal from Spring. So what's in store for us? If you're curious to know what this year holds for you according to your horoscope, we've got answers. Our astrology writer Emma Howarth has delved into the major life changes you could be experiencing in 2021 according to your horoscope this year.",
                "Aries\u202820 March–18 April\n" +
                        "How it started\u2028\n" +
                        "January–March\u2028Lockdown or no lockdown it’s all system go for Aries in January. You could find yourself embracing new tech, networking online or making connections that can change your future. Expect a shake-up where your finances and self-worth is concerned in mid February – now is not the time to play small and you know it, Aries. Hang in there till 26 March and you might just get a dream come true in your career or love life.\n" +
                        "How it’s going\u2028\n" +
                        "April–June\u2028If you’re desperate for a fresh start you’ll get what you need on 12 April new moon in your sign. It’s time to level up, Aries! Make a plan, set a goal and be ready to make it happen. By mid May you’ll be ready for respite and that’s exactly what Jupiter in your healing twelfth house has in mind. If you’re looking for closure, it could soon come knocking. If you’re ready to change the way you express yourself at work or stand up for something you believe in, the new moon eclipse on 10 June has your back. Tell it like it is, Aries.\n" +
                        "More where that came from\u2028\n" +
                        "July–September\u2028You might feel reborn by the end of July. And if there’s someone you need to forgive – or you’re hoping to be forgiven – it could all come out in the wash by the end of the month. About time, too, because August is all about love, fun and creative endeavours for you. Make the most of the good times because you’ll be hitting the ground running by September with an exciting work project.\n" +
                        "The finish line\u2028\n" +
                        "October–December\u2028Remember the forgiveness you found in July? Don’t be surprised if a blast-from-the-past comes knocking in October. And if you’re in the market for a red-hot affair you could get more than you bargained for in November. You’ll be thinking ahead to your 2022 goals before December even begins. Travel, learning and a serious romantic commitment could all going to be part of your future.\n" +
                        "Taurus\u202819 April–19 May\n" +
                        "How it started\u2028\n" +
                        "January–March\u2028This is a big year for your career and you’ll be powering up to make some big changes as January progresses. Just don’t be surprised if a shake-up or breakthrough has you changing direction in mid February. By the end of March you could be ready to wave goodbye to something you know deep down wasn’t right for you in your work or personal life.\n" +
                        "\n" +
                        "\n" +
                        "How it’s going\u2028\n" +
                        "April–June\u2028A summer of love and fun awaits you, Taurus, and there could even be some romance on the cards when your ruler Venus takes a spin in your sign towards the end of April. You’ll also be saying ‘Yes’ to friends, fun and party invitations (hopefully not all on Zoom) from mid May onwards. A new moon eclipse in your wealth zone on 10 June could spell good news for your finances.\n" +
                        "More where that came from\u2028\n" +
                        "July–September\u2028Let the good times roll in July as lucky Jupiter continues its spin in your social eleventh house. Don’t neglect the home front, though. August could bring you back down to earth with a tricky family or living situation that needs to be dealt with now. Life will be back on the up by September, though, when a creative project could get a major green light.\n" +
                        "The finish line\u2028\n" +
                        "October–December\u2028Give a lapsed health kick another go in October and you might just stick with it this time. And brace yourself for a dream come true revelation on 19 November’s full moon in your sign. Is it time you followed your heart on this one? The cash injection you need to make it happen could arrive at the start of December, possibly as a result of someone else’s success.\n" +
                        "\n" +
                        "Gemini\u202820 May–20 June\n" +
                        "How it started\u2028\n" +
                        "January–March\u2028Long haul travel might be a non-starter as January begins but write your bucket list regardless, Gemini. Your card is marked for adventure in 2021 whether Covid likes it or not. Brace yourself for a breakthrough relating to a past hurt or relationship in mid February. It’s high time you set yourself free. By late March you’ll be ready to mingle – even if you’re stuck on Zoom.\n" +
                        "How it’s going\u2028\n" +
                        "April–June\u2028Get the socialising out of your system in April because you’ll have work to do by mid-May. And not just any old hard slog, either. Think lucky breaks, dreams come true and serious career success through June and beyond. A future plan you make on the 10 June new moon eclipse in your sign could send you soaring. Just take things slow with a business partnership or tricky work situation until after 22 June.\n" +
                        "More where that came from\u2028\n" +
                        "July–September\u2028Your career luck sees you right through to 28 July when Jupiter heads back to your ninth house to reignite those travel vibes. Ever thought about moving abroad? This could be the year you take steps towards making it happen. Tell someone how you really feel in August and you might get ‘Yes’ you’ve been waiting for. A shiny new romance could give you the best kind of back-to-school vibes in September – just look before you leap during Mercury retrograde (from 27 September).\n" +
                        "The finish line\u2028\n" +
                        "October–December\u2028A late October health kick could be just what you need to end the year on a high. And don’t be afraid to reinvent yourself in November, Gemini. The 19 November full moon eclipse falls in your healing twelfth house. Is it time to shake something off that’s long held you back? The start of December could spell new romance or a fresh start in an existing relationship. Enjoy the love in, Gemini.\n" +
                        "Cancer\u202821 June–21 July\n" +
                        "How it started\u2028\n" +
                        "January–March\u2028Your relationships are stronger than ever as 2021 begins and your goal in January is to keep them that way. Expanding your social circle (even if it’s just online) in mid February could bring about a major breakthrough, too. Do you need a leg up on a goal or dream? The missing link you need is waiting in the wings, Cancer. By late March your career looks so lit you’ll need shades.\n" +
                        "How it’s going\u2028\n" +
                        "April–June\u2028Make a dream come true career wish on 12 April new moon and you’ll set something magical into motion, Cancer. Just try not to drag past problems into any shiny new set ups. You might want to ditch a lingering bad habit while you’re at it, too. The 26 May full moon eclipse in your health zone invites you to wave goodbye to your old ways for good. And a fresh start on 10 June new moon eclipse could be the push you need to fly in all areas of your life.\n" +
                        "More where that came from\u2028\n" +
                        "July–September\u2028If the universe doesn’t deliver you the promise of a once-in-a-lifetime adventure (think glitz, glamour and long haul vibes – even if it’s not this year) by late May or June, it should come up with the goods by July. Try manifesting the money you need to make a wish come true on the 8 August new moon and you might even get more than you need. Just don’t spend it all at once. September may ask you to put your money where your mouth is on something that matters a great deal to you.\n" +
                        "The finish line\u2028\n" +
                        "October–December\u2028Expect good vibes in love, romance and creative endeavours towards the end of October. Hot dates, fun times and magical ‘Yes’s’ abound. The 19 November full moon eclipse in your social eleventh house could shine a revealing light on a friendship. If it feels off, it probably is off, Cancer. Make work your priority as December begins and you’ll be right where you need to be by 2022.\n" +
                        "Leo\u202822 July–21 August\u2028\n" +
                        "How it started\n" +
                        "January–March\u2028The full moon in your sign on 28 January kicks of an empowering cycle for you, Leo. This year is all about making your relationships (be they romantic, platonic or work related) happier and stronger – and you’re off to a strong start. That doesn’t mean there are no shake-ups on the cards, though. A work or business partnership could come to an end in mid February for all the right reasons. Hang tight and see it for the very valuable lesson it is as March plays out.\n" +
                        "How it’s going\u2028\n" +
                        "April–June\u2028Your career could take the kind of upswing you’ve long been hanging out for in April. And sharing the spotlight on a creative project around the end of May could see both your stars rise. Expect another career breakthrough in June, too. Are you ready to make that dream come true, Leo?\n" +
                        "More where that came from\u2028\n" +
                        "July–September\u2028Make some space in your schedule for romance in July and things could get seriously hot. And by the time birthday season rolls around you’ll be feeling like the queen of the jungle once more. Make a fresh start plan on the 8 August new moon and expect one hell of a pay off in September. You’re in the money, Leo.\n" +
                        "The finish line\u2028\n" +
                        "October–December\u2028You could find yourself spending more time at home in October (fingers crossed it’s because you bag a new sofa not a new lockdown). And you might want to brace yourself for the 19 November full moon eclipse. It falls in your career zone shining a revealingly bright light on what you want and where you’re headed. Spoiler: it’s looking good! Decide who you want to come along for the ride with you and expect to have a party to plan in December.\n" +
                        "\n" +
                        "Virgo\u202822 August–21 September\u2028\n" +
                        "\n" +
                        "How it started\u2028\n" +
                        "January–March\u2028You’re on it from the off in 2021, Virgo. Hard work and health kicks are your raison d’etre and you’ll be bossing it at both before January ends. There’s more where that came from in February, too. The full moon in your sign on 27 February beams attention on Brand You. It’s time to put yourself first, Virgo! And maybe even entertain a little romance as March begins.\n" +
                        "How it’s going\u2028\n" +
                        "April–June\u2028Late April could see you taking up a new hobby, learning something new or plotting an escape to sunnier climes. And as a tricky family or living set-up falls into focus on the 26 May full moon eclipse you might find yourself desperate to put that plan into action. Follow your heart and dive in to the summer of love that awaits you as June plays out.\n" +
                        "More where that came from\u2028\n" +
                        "July–September\u2028Start something special with someone special in June and there’ll be more where that came from right through July. Just don’t expect to spend the whole summer in a love-in. An introspective August sees you ramping up the self-care like never before. Make a fresh start plan on the 7 September new moon in your sign and you’ll see out the year in style.\n" +
                        "The finish line\u2028\n" +
                        "October–December\u2028The first signs that something you’ve worked hard on is going to pay off big-time should trickle through in October. And the 19 November full moon eclipse in your travel zone urges you to think global with your next steps. Just don’t rush into a new romance (or ramp up an old one) without thinking about what you really want at the end of December. Something is not quite what it seems.\n" +
                        "Libra\u202822 September–22 October\n" +
                        "How it started\u2028\n" +
                        "January–March\u2028The first signs that this is going to be a show-stopper of a year for you (especially where creative projects and love affairs are concerned) start to show in January. By February, they’re off the scale. Your luck is in, Libra. It’s time to write the book, launch the project or create something you’ve always wished existed. If you’re ready for a relationship up-level you could well get one in March.\n" +
                        "How it’s going\u2028\n" +
                        "April–June\u2028A romance you start earlier in the year could get seriously intense by the end of April. If it’s not what you want, speak up! And if you want even more of it, do the same! A stroke of luck in end of May could see the best kind of secret revealed. By June you’ll be certain that the universe is on your side when an investment or unexpected inheritance comes good.\n" +
                        "More where that came from\u2028\n" +
                        "July–September\u2028Good vibes abound in July when you commit to a wellness programme or health regime. And in August you’ll be expanding your network wider than ever before. Think friends in high places or social media fame headed your way. You might want to take some time out to regroup in September, especially when Mercury retrograde begins in your sign on 27 September.\n" +
                        "The finish line\u2028\n" +
                        "October–December\u2028Birthday season hits its stride with a new moon in your sign on 6 October. This is your opportunity to dream even bigger, Libra – get manifesting! November’s full moon in your intense eighth house could spell drama in your finances or a love affair, but hang in there. There’s change on the cards in your home life come December, too. It might not seem like it at first but it could be exactly what you need most.\n" +
                        "Scorpio\u202823 October–21 November\n" +
                        "How it started\u2028\n" +
                        "January–March\u2028Your priority in 2021 is building a strong foundation from which you can truly shine. Family life, renovations and relocations all look lit this January and if you love working from home you’ll be in Zoom meeting heaven. Just brace yourself for a shake up in February. A relationship that’s on unequal footing may need to rebalance if you want it to survive. Hold out till March and when the good times should start to roll in love, luck and romance.\n" +
                        "How it’s going\u2028\n" +
                        "April–June\u2028If a start of the year health fell by the wayside, April could provide the fresh start you need to succeed. Expect a confidence boost in mid May and hard cash landing in your bank account come 26 May full moon eclipse. By June you’ll be ready to blow caution to the wind with a big idea or exciting romance. Just watch the flirtation factor if you’re attached and want to stay that way.\n" +
                        "More where that came from\u2028\n" +
                        "July–September\u2028A trip abroad could be on the cards in July, with the potential from some next-level holiday romance while you’re at it. Enjoy it while you can because your career is set to take priority in August. Think new roles, pay rises and pats on the back. If you want to take things up a level at work or otherwise start networking like you mean it in September.\n" +
                        "The finish line\u2028\n" +
                        "October–December\u2028As birthday season rolls around towards the end of October you’ll be feeling more sure of yourself than ever. Set yourself an exciting new goal on 4 November new moon in your sign and brace yourself for a relationship revelation on 19 November. Could you be about to get your dream come true? Tension towards the end of December may have more to do with loose tongues than real feelings. Try not to overreact.\n" +
                        "Sagittarius\u202822 November–20 December\n" +
                        "How it started\n" +
                        "January–March\u2028Tell it like it is as January draws to a close and you’ll gather a crowd ready to hang off your every word, Sag. This isn’t a year to do things the same way you’ve always done, either. Shake up your daily routine in February and you’ll change your life for the better in more ways than one. And do share a creative idea or project in March – this is the big one, archer.\n" +
                        "How it’s going\u2028\n" +
                        "April–June\u2028A late April health kick is a positive move for your overall wellbeing. Just don’t quit this time, Sag. And be ready to shine bright when the full moon eclipse falls in your sign on 26 May. You turn in the spotlight has come and May is just the beginning. Invite love into your life on the 10 June new moon and you could get what you want before the year is out, too.\n" +
                        "More where that came from\u2028\n" +
                        "July–September\u2028If you want to move house or start (or add to) a family, July is looking like your lucky month. Likewise, travel plans look lit in August. Make the plan, take the trip and do what makes you happy, Sag, because September sees you back to work and on one hell of a mission.\n" +
                        "The finish line\u2028\n" +
                        "October–December\u2028Don’t backtrack on a plan to share your voice or story as the year draws to a close. A well-connected friend or new business connection could help you reach a very large audience (think global) come October. Take some time out to contemplate what you really want to do next as the 19 November full moon eclipse beams into your hard-working sixth house. By the start of December you’ll be ready to start afresh and, with a trail of recognition behind you, it’ll be easier than ever. Your time to shine has come.\n" +
                        "Capricorn\u202821 December–18 January\u2028\n" +
                        "How it started\u2028\n" +
                        "January–March\u2028This is the year your hard work pays off, Capricorn and it all starts in January. Practice saying those polite ‘thank you’ as success comes knocking and you bask in its glory. And be ready to stand up for what you believe in February. This is your success and yours alone, Capricorn. You don’t have to share the spotlight if you don’t want to. By late March you’ll be ready for some respite – hunker down at home, finish Netflix and gather your strength.\n" +
                        "How it’s going\u2028\n" +
                        "April–June\u2028You’ll be glad you took some time out in March if the cosmos gets its way in April. Think adoring suitors, big ideas and fun times all round towards the end of the month. If one of those ideas is something you want to share your luck is in from mid-May onwards. You’re intuition is spot on, Capricorn! This one has star quality. The 10 June new moon eclipse sees you making a health resolution that matters more than you realise.\u2028\n" +
                        "More where that came from\u2028\n" +
                        "July–September\u2028Vibes are high throughout July as long as you’re honest about what you want. And a relationship could become seriously intense as August begins. Great news if you’re ready to dive into something deep and meaningful, not so great if you wanted to keep things light. Adventure calls regardless as September begins: expand your mind or book a trip and you could change your future forever.\n" +
                        "The finish line\u2028\n" +
                        "October–December\u2028Your career is never far from your mind but it’ll be taking up a lot of headspace come October. It’s time to level up, Capricorn. And even if you think all your dreams have already come true, there’s time to squeeze in another. The 19 November full moon puts you at the centre of something creatively successful. Think fame, fortune and shiny awards, sea goat. By December you’ll be ready to take a break, ready to do it all again in 2022.\n" +
                        "\u2028Aquarius\u202819 January–17 February\n" +
                        "How it started\u2028\n" +
                        "January–March\u2028By the time the sun joins the planetary pile-up in your sign on 19 January you’ll know this is going to be your year. The world is coming round to your way of thinking, Aquarius – free-spirited activism for the win! Just make sure those closest to you are on board, too. Expect a shake up on the home front in February while someone adjusts to your new-found confidence. By March you could be ready to share your story or stand up for a cause you really care about.\n" +
                        "How it’s going\u2028\n" +
                        "April–June\u2028Peace reigns in your home life once more as April draws to a close. And by May you’ll be in your element. A full moon eclipse in your social eleventh house sees you making connections, winning people over and making a difference to the world around you. The kind of difference that could find you in an unexpected spotlight come June. If you’re ready to shine, this is your time, Aquarius.\n" +
                        "More where that came from\u2028\n" +
                        "July–September\u2028Pay rises, pay offs and magic money trees could all feature in your life towards the end of May. Your luck is in Aquarius and it’s starting to show in your bank account. By August you could take a relationship to the next level if you’re ready to say ‘Yes’. There’s more money luck on the cards in September, too.\u2028\n" +
                        "The finish line\u2028\n" +
                        "October–December\u2028Be ready to knuckle down at the end of October when your career falls into focus once more. You can be anything you want to be in 2021, Aquarius – as long as you believe in yourself. If your family life or living situation is feeling rocky things could come to a head around the 19 November full moon. Be ready to let something go if it feels right. The new moon on 4 December invites you think hard about who you really want to spend your time with.\n" +
                        "Pisces\u202818 February–19 March\n" +
                        "How it started\u2028\n" +
                        "January–March\u2028Think of the start of 2021 as the calm before the storm, Pisces. And we’re talking success storm not rain storm, here. Connections you make in January have the potential to change your life for the better, especially where your career is concerned. And as February begins you’ll feel more sure than ever that the path you’ve chosen is the right one. Use the new moon in your sign on 13 March to set wheels in motion on a next-level dream.\n" +
                        "\n" +
                        "How it’s going\u2028\n" +
                        "April–June\u2028Your star is on the rise but you’ll need to get braver if you really want to shine. Start putting yourself out there on a small scale in April and the spotlight will feel a lot less glaring later in the year. By the time Jupiter takes a spin in your sign mid-May you’ll know that your luck is in. Decide who you want to come along for the ride and make a family commitment you know you can keep on 10 June new moon.\n" +
                        "More where that came from\u2028\n" +
                        "July–September\u2028There’s plenty of fun to be had as July begins and the sun shines upon your good times fifth house. Don’t get too carried away, though. A final push on an important project could see August disappear in a flurry of emails and work calls. It’s all part of a very shiny bigger picture, Pisces. September could see you striking the kind of career deal you never would have thought possible a year ago.\n" +
                        "The finish line\u2028\n" +
                        "October–December\u2028Travel plans made towards the end of October could make a big difference to the next stage of your life. Combine a trip with sharing your voice or your story towards the end of November (especially around the 19 November full moon eclipse) and you might just blow your own mind. Your career takes off as the year comes to a close but don’t let that stop you from setting an even bigger goal on the 4 December new moon.\n" +
                        "\n",
                howarth, lifestyle, uk, "2021-02-02", 0,
                "https://gl-images.condecdn.net/image/8gGd0JdN7KB/crop/600/square/f/gettyimages-1227296423_sf.jpg");
        articleRepository.save(lifestyle4);


        Article lifestyle5 = new Article("What your star sign reveals about your style (and it's so accurate)\\n\" +\n" +
                "                        \"And who to look to for style inspo...\\n",
                "Whether it's dictating our life choices, spending habits, hairstyle or even our skincare regime, our star sign can be super influential in how we live our life. And GLAMOUR's resident astrologist, Emma Howarth, says that you can use your star sign to influence your sartorial choices, too. Obviously it's all just a bit of a fun but if you're looking for a post-pandemic wardrobe refresh and lacking inspo, here's what your star sign says about your fashion choices...\u2028",
                "Aries\u202820 March–18 April\n" +
                        "Already rocking midriff floss and daytime sequins? Of course you are, Aries. You’ve always been an early-adopter! You’re everyone’s favourite influencer, too (even if you’ve never set foot on Instagram). Friends often look to you for style inspo which can prove tricky as twinning is rarely winning in your book. In fact, the moment your latest look hits the mainstream you move on to something new. You love a trend but you love getting in there first more. If there’s a wait list, your name is always on it and the words limited edition make your heart beat faster. Bagging a must-have item by a small independent just before they hit the big time is your ultimate fashion high. If it’s brave, bold or fashion forward it’s you, Aries. You can add head-turning to that list, too – Aries is associated with the head so hats, hair accessories and mega-watt blow outs all look fabulous on you. You feel your best when your look is tough, directional and super on trend.\n" +
                        "Aries icons: Lady Gaga, Kristen Stewart, Victoria Beckham\u2028Statement style: Next big thing labels and super-star shades\u2028Most likely to: Have already moved on to autumn/winter 2021/22\n" +
                        "\n" +
                        "\n" +
                        "Taurus\u202819 April–19 May\n" +
                        "Even the swankiest designer gown won’t pass the Taurus test if it doesn’t feel right. It’s all about the stroke-able luxe fabrics – silk, super-soft linen – for you. And you’d choose made-to-last luxury over fast-fix fashion any day. You’d probably be happiest swathed in silk robes at a spa forever more but because life doesn’t always deliver, you do a good line in fancy activewear, slinky slip dresses and seriously soft knitwear. You’d rather own one truly beautiful thing than a pile of one-minute wonders but sometimes swerve the more practical pieces to your own detriment. Invest in future heirloom classics you’ll love forever – butter-soft leather, silk blouses, the perfect pea coat – and your wardrobe will thank you, Taurus. Your sign is associated with the neck and throat so bold necklines, statement scarves and big-time bling can all elevate your look to perfection.\n" +
                        "Taurus icons: Lizzo, Gigi Hadid, Adele\u2028Statement style: Luxe loungewearand taxi heels\u2028Most likely to: Blow the rent money on Chanel\n" +
                        "\n" +
                        "Gemini\u202820 May–20 June\n" +
                        "If anyone likes to make a style statement, it’s you expressive Gemini. And what that statement is depends entirely on who you’ve decided to be that day. Yep, Gemini wardrobes have to multitask as efficiently as their chameleon-like owners. Think tell-it-like-it-is slogan tees, switch-it up accessories and eye-catching pieces that can be dressed up or down on a whim. Costume parties get you hot under the collar (in a good way) and you’re never afraid to mix it up – no one works a colour/pattern/style clash quite like you, Gemini! You love a label with a good behind-the-scenes story and you’re always free and easy with your style secrets. Accessorises that draw attention to the hands (which are associated with your sign) look great on you, too – think arm candy bracelet stacks and bold cocktail rings to set off that super-slick mani.\n" +
                        "\n" +
                        "\n" +
                        "Gemini icons: Awkwafina, Naomi Campbell, Mary Kate & Ashley Olsen\u2028Statement style: Culture clash patterns and slogan tees\u2028Most likely to: Rock up to brunch in head-to-toe sequins\n" +
                        "Cancer\u202821 June–21 July\n" +
                        "There’s loungewear and then there’s loungewear, right Cancer? You take your home comforts seriously and that extends to your look as much as the excessive pile of cushions on your bed. Give you a pair of souped-up slippers, some swanky sweats or a head-to-toe look c/o Lululemon and you’re good to go! That doesn’t mean you don’t like to dress up, though. And when you do, you do it well. Feminine chic with a side of nostalgia (you love a vintage piece) looks like a dream on sensitive Cancer – think #cottagecore midis, embroidered blouses and super-soft knits. If that all sounds a bit too Little House on the Prairie, let it be known that you can also bring out the big guns. Event dressing elegance, mega-watt accessories and a flash of décolletage (your sign is associated with the chest) and you’re in business. You’ve got this and you know it, Cancer.\n" +
                        "Cancer icons: Priyanka Chopra, Busy Phillips, Selena Gomez\u2028Statement style: Fancy yoga pants and romantic frocks\u2028Most likely to: Slip into something more comfortable the second you get home\n" +
                        "\n" +
                        "Leo\u202822 July–21 August\n" +
                        "Did someone say spotlight? You don’t need us to tell you that it’s got your name on it, Leo! Whether you’re walking the red carpet or the ready meal aisle, Leo always stands out from the crowd. Yep, lovely lion, you’ve got the kind of natural flair for fashion that can carry off just about anything. Never knowingly under-coiffed, your hair really is your crowning glory, set off to perfection by sunshine colours, statement pieces and the biggest pair of shades you can lay your hands on. Trends don’t tend to bother you but making an impact in something strapless, backless (Leo is associated with the back) or covered in glitter definitely does. You’re bold, brave and always willing to dress up for an occasion. In fact, your look could probably be summed up as ‘never the bridesmaid, always the bride’ – just watch your step when it’s not your wedding!\n" +
                        "Leo icons: Meghan Markle, Dua Lipa, Madonna\u2028Statement style: Sparkle, sunglasses and serious glamour\u2028Most likely to: Get asked for a selfie by random strangers\n" +
                        "\n" +
                        "Virgo\u202822 August–21 September\n" +
                        "Push the perfectionist clichés to one side for the moment because you are so much more than a neatly pressed blouse, lovely Virgo. You might not go overboard where trends are concerned but that doesn’t mean you don’t have style. In fact you have bags of the stuff. Natural fabrics, eco labels and elevated activewear all appeal to your fresh-faced, clean-living vibe – think organic cotton, independent labels and eco dresses made from deadstock fabric. You’re also a sucker for a beautiful detail – colourful stitching, unusual buttons and luxe linings can all persuade you to take a closer look. Athleisure looks enviable on you and if anyone can rock this season’s crop tops (Virgo is associated with the stomach) it’s probably you. Frock up for an occasion and your innate sense of understated cool turns all the right heads. Less is more, Virgo and you’ve got the look.\n" +
                        "Virgo icons: Zendaya, Beyoncé, Stella McCartney\u2028Statement style: Elevated athleisure and high-tech coats\u2028Most likely to: Wear flats with a ball gown\n" +
                        "\n" +
                        "Libra\u202822 September–22 October\n" +
                        "Your desire to be good to go for every occasion means you’ve turned shopping into a sport, Libra. Chic tailoring? Fancy frocks? Snow boots and salopettes? You can pull together any look at a moment’s notice. You don’t go in for crazy colours or major statements but you do like to look put together. Muted palettes, touchable fabrics and luxury accessories can all elevate a Libra look to perfection. And anything that cuts down on decisions is a bonus, too – jumpsuits and dresses are your wardrobe mainstays. Whether you’re slouching in sweats or putting on the Ritz there are two things that matter a great deal to you. One: that what you’re wearing is beautiful (yes even those sweats) and Two: that everyone around you thinks so too. Libra is associated with the lower back (or even the bum) so body-con dresses and low-rise jeans look next-level amazing on you.\n" +
                        "Libra icons: Addison Rae, Kim Kardashian, Marion Cotillard\u2028Statement style: One-piece looks and luxe accessories\u2028Most likely to: Buy multiple versions of the same thing\n" +
                        "Scorpio\u202823 October–21 November\n" +
                        "Forget garish brights and statement sleeves – the zodiac’s most mysterious sign prefers to fly under the fashion radar. That doesn’t mean style is an afterthought for you, though – anything but! Scorpio souls have natural sex appeal (there’s a reason this sign is associated with the reproductive system!) and a knack for pulling a look together. Minimalist lines, subtle shades and quality basics all do it for you whether you’re power dressing for work or vamping it up for the night. Fussy frills might turn you off but that doesn’t mean you don’t like a bit of luxury – silk pyjamas, swanky smalls and last-forever pieces with edge (think black leather, chunky accessories and killer boots) all look great on you. Your signature style doesn’t set out to grab attention but all eyes are on you nonetheless.\n" +
                        "Scorpio icons: Chloe Sevigny, Alexa Chung, Kendall Jenner\u2028Statement style Clean lines and dark glamour\u2028Most likely to: Stop wearing black when they invent a darker colour\n" +
                        "\n" +
                        "Sagittarius\u202822 November–20 December\n" +
                        "The ultimate fashion magpie, Sag’s favourite way to seek style inspo always involves an adventure. Your lust for travel (and stylish souvenirs) gives your wardrobe a naturally boho vibe which works well with your throw-it-together-and-hope-for-the-best approach to style. We’re not going to lie, Sag – it works! Think sequins, kaftans, loads of leopard print and wrists stacked with friendship bracelets gathered on far-flung shores. Your love of dressing up means you give good festival, too. You’re at your happiest clad in muddy wellies and something short (Sagittarius is associated with the hips and thighs!) in a field somewhere. You’re happy to invest in clothes as long as they make you feel special but sometimes miss a beat when it comes to the practicals. Weddings, funerals and meetings with the bank can all throw you in a spin when your wardrobe is 90 per cent sequins.\n" +
                        "Sagittarius icons: Taylor Swift, Zoe Kravitz, Janelle Monae\u2028Statement style: Beach bound bohemian meets disco queen\u2028Most likely to: Have a bikini on underneath just in case\n" +
                        "\n" +
                        "Capricorn\u202821 December–18 January\n" +
                        "While other signs fantasise about crafting the perfect capsule wardrobe, Capricorn gets to work, makes it happen and pulls it off like a pro thanks to their perfect cheekbones (this sign is associated with bone structure). Order reigns in your closet which is why your look is always on point for every occasion. You’re known for having a signature style and most likely have multiple versions of your favourite pieces displayed neatly on matching hangers. Your eye for a look means everything you wear looks expensive even if you found it in a bargain bin, too. You do a fashion staple with aplomb – neat knits, box fresh kicks, trench coats and tailoring all look just right on you – but heritage labels are your style kryptonite. Want to know the way to Capricorn’s heart? Two words: vintage Chanel. Ready for anything, you could pack for a week in The Alps, New York or Bali at a moment’s notice and never miss a fashion beat.\u2028\u2028Capricorn icons: Kate Moss, Florence Pugh, Michelle Obama\u2028Statement style: Keepsake classics and a signature uniform\u2028Most likely to: Actually look good in a trench coat\n" +
                        "Aquarius\u202819 January–17 February\n" +
                        "Forget following fashion, fashion follows you, Aquarius! And for good reason! Your forward-thinking, free-spirited vibe breeds originality and it shows in your (often customised) look. In fact, you’ve only got one rule when it comes to style and that’s that there are no rules. You can pull off bold patterns, statement accessories and intricate embellishments to perfection but you’re just as likely to keep things simple with clean lines and a fuss-free palette. Whatever you’re wearing one thing is always the same – your look is undisputably yours and yours alone. Fashion-forward fabrics, shiny metallics and vintage or hand-made one-offs get your blood pumping and you love bigging up independent labels to your friends. You show your spiritual side with crystals pendants and care more about meaning than value when it comes to jewellery. Anything that draws attention to your ankles (Aquarius is associated with the ankles) looks really good on you – boho beach anklets and tie-up gladiator sandals for the win.\n" +
                        "Aquarius icons: Chloe Grace Moretz, Shakira, Kerry Washington\u2028Statement style: Vintage one-offs and indie labels\u2028Most likely to: Take the scissors to a designer dress in the name of customisation\n" +
                        "\n" +
                        "Pisces\u202818 February–19 March\n" +
                        "Ah, Pisces – the zodiac’s mystical mermaid, forever happiest by the sea. Your dream look might be barefoot (Pisces is associated with the feet), bikini clad and fancy free but sometimes life gets in the way. And when it does there’s only one thing for it – floaty maxi dresses, slouchy knits and shiny stuff on everything. Dressing for the life you want instead of the life you have might make your heart sing but it doesn’t quite cut it when things get real. Open a Piscean wardrobe and you’ll find dreamy dresses, summer sandals and plenty of vintage finds but come rain, snow or a big job interviews it’s tumbleweed all the way. You don’t need us to tell you that adding a few more basics to the mix would make life less stressful – but where’s the fun in that? You do you, Pisces – one beaded bolero at a time.\n" +
                        "Pisces icons: Rhianna, Sophie Turner, Drew Barrymore\u2028Statement style: Summer of love surf girl meets vintage queen\u2028Most likely to: Rock up in totally impractical shoes\n" +
                        "\n",
                howarth, lifestyle, uk, "2021-03-17", 0,
                "https://gl-images.condecdn.net/image/bakWPkj1vdY/crop/600/square/f/shutterstock_editorial_11718792bn_sf.png");
        articleRepository.save(lifestyle5);


        Article lifestyle6 = new Article("Anna Jones: ‘Eating vegetables is the most impactful thing you can do for the planet’",
                "The food writer talks pandemic cooking with Ella Walker, and why it makes sense to factor in climate change when planning dinner",
                "Food has always punctuated our days – three meals, a snack here, a packet of crisps there, a slice of cake (and then another)… The need to eat is central to being human, but the need to cook? For many of us, that’s felt absolutely relentless over the last year.\n" +
                        "Anna Jones puts pandemic cooking more charmingly. She calls it the “rhythm we have been building our days around”, suggesting it’s been less punctuation, more necessary anchor.\n" +
                        "\n" +
                        "\n" +
                        "“I know people have become jaded with it at a times. Even I, as a cook and a writer, have become slightly jaded with cooking for a family three times a day,” she admits. “But it’s something that’s definitely giving people life, and something they can control and be excited about.”\n" +
                        "The practicalities of lockdowns – especially the great flour rush of March 2020 – have arguably shifted perspectives a little too.\n" +
                        "“We’d become so used to convenience and being able to just put our hands on anything we want at any time, and I think [not being able to get hold of everything] was a bit of a wake-up call for people,” considers Jones, who says circumstances have forced us to improvise a lot more in the kitchen. They’ve even made her, recipe-tester that she is, “pare back” to the everyday essentials. “I used to have every flour, every lentil, every pulse, every spice in the house, and I’ve stripped back my cupboards.”\n" +
                        "\n" +
                        "Jones reckons as a result, many of us will now cook more instinctively too – “with slightly more intuition than just following a recipe”. Recipes are Jones’ game though (via her books and Guardian column), and hers have long been designed as launchpads for home cooks, not definitive end points.\n" +
                        "Her new cookbook One, reflects that. It features easily tweakable noodles and pasta dishes galore (like her lime and double ginger soba noodles), as well as simple traybakes (leek and potato with romesco sauce), salads (roast carrot and grain) and grown-up desserts (chocolate, olive oil and rosemary cake), while the ‘10 simple ideas’ section (e.g. for ways with peas, broccoli, peppers) rattles off swift dinner ideas.\n" +
                        "It’s also packed with recipes inspired by other cultures and food traditions, from white miso ramen, to congee and lemongrass and tofu larb. “In each shop near me, there’s Turkish ingredients, Vietnamese ingredients, African ingredients, and I feel like the tapestry of how I cook has developed with those cultures around me, but I also realise absolutely, that those are not my culture,” Jones says, addressing issues around appropriation and cultural sensitivity in food media. “Those are not my recipes. They are not things that are a part of my heritage. And so when I use those ingredients or echo any of those recipes, I try and do it with the greatest reverence and respect.\n" +
                        "“I get it’s a very fine line to tread, and I feel like the food industry is just working that out at the moment,” she adds. “There’s a lot of work to be done.”\n" +
                        "\n" +
                        "The core of One though is “to knit two things together”. First, “the cooking I find myself doing now” – by which Jones means the kind of cooking you do with a small child around (her son is five), as opposed to the cooking you do pre-parenthood. “I’m a cook and a chef, I can chop things and cook things a bit quicker – so I’d make more complicated recipes and people would be like, ‘But that would take me an hour-and-a-half!’”\n" +
                        "Now, quick and simple notches higher on the priority list.\n" +
                        "“That’s the cooking I do for my family… It’s those weeknight dinners, the things we eat on a Monday, Tuesday, Wednesday, Thursday, that actually are the most important to make delicious and be interesting, and make sure they’re full of vegetables and things that are going to make our bodies feel good,” Jones adds.\n" +
                        "The second factor she was keen to weave in was sustainability and climate change. “We all know that eating vegetables is really the most impactful thing you can do for the planet. The second most impactful thing is making sure that the food you buy and cook, you don’t waste,” Jones – who’s been vegetarian for around 12 years – explains matter-of-factly.\n" +
                        "Her intention is not to overwhelm with stark facts and figures (“I’m not gonna lie, they are pretty gloomy”), but to provide some “life-friendly, achievable sustainability information” shared via a format that feeds into how we choose and buy ingredients.\n" +
                        "“Cookbooks are where I go before I go shopping, [they’re] where lots of people go before they plan their meals,” Jones points out. So surely it’s no bad thing “flicking through a few recipes, and being reminded to take your tote bag [shopping], or to have a look at where your blueberries are from”.\n" +
                        "\n" +
                        "It’s thought we each make around 35,000 decisions a day. “Some of those will be whether to open or close the door, turn the light on or off, but a good portion of those will be around food and shopping,” says Jones. “And those things we can control.”\n" +
                        "She sees each day as an opportunity to make positive food decisions – using up leftover veg you’d normally bin, learning where your veg was grown, finding out what’s seasonal – that are achievable for your life and budget. It’s definitely a more positive prospect than sinking into a pit of indecision and guilt over every bit of single-use plastic you encounter.\n" +
                        "\n" +
                        "“This year, more than anything, has proven our capacity as human beings to make rapid and radical behavioural change. Who would have thought we’d all have basically stayed in our houses for a year? If you said that to me last January, I’d have said, ‘Impossible. No way. Can’t do it’,” says Jones. “[It’s] a lesson in how adaptable we are and how much we can change. And if we can tackle climate change in that same powerful way, then all of our individual changes will add up and make massive change.”\n" +
                        "There’s power in choosing what to have for dinner, and with that comes great responsibility.\n" +
                        "‘One: Pot, Pan, Planet’ by Anna Jones, photography by Issy Croker, is published by Fourth Estate, priced £26. Available now.\n" +
                        "\n",
                jones, lifestyle, uk, "2020-03-11", 0,
                "https://static.independent.co.uk/2021/03/11/10/anna-jones-main-110321.jpg?width=640&auto=webp&quality=75");
        articleRepository.save(lifestyle6);


        Article lifestyle7 = new Article("\n" +
                "THE EMOTIONAL STAGES OF DEALING WITH COVID RESTRICTIONS CHANGING AND LIFTING\n",
                "Everything understandably feels a bit up and down at the moment.",
                "Strangely enough, the relaxation of pandemic restrictions can send you into more of a spin than the initial enforcement of them ever did.\n" +
                        "As humans, we’re pretty adept at adapting to different scenarios and environments, but everything has changed a lot over the last year. It’s pretty standard to feel a little overwhelmed by it all, especially as we draw closer to the anniversary of the first lockdown, the roadmap out of this one ramps up, and different areas of the UK and Ireland relax at different rates (hairdressers are now back at work in Wales ).\n" +
                        "\n" +
                        "\n" +
                        "As a result, we’re racing through a whole lot of emotions right now…\n" +
                        "Giddiness\n" +
                        "Just the thought of being able to hug people again, to smush your face right up to theirs, to be able to dance in a crowd and stay over at your mum’s house, book a flight, order a pint and have your hair rescued by an professional, are enough to make you scream with happiness. The euphoria is real.\n" +
                        "Terror\n" +
                        "Euphoria can switch to an uneasy kind of terror pretty swiftly, though. How will you actually feel about being in the crush of a crowd after all these months socially distanced? How safe will it really be to hug your mum come summer? Could you actually overcome the anxiety of sitting on a cramped aeroplane, even if everyone was wearing a mask? It all seems so surreal, that life as we knew it could restart somehow.\n" +
                        "\n" +
                        "Reclusiveness\n" +
                        "Rather than looking forward to restrictions lifting, it can feel much easier to just focus on the here and now – and that means staying at home, keeping your hopes small, and sticking with a daily walk. Why deviate from this isolated, anti-social life, when we’ve already been thrown back into it so many times before?\n" +
                        "Scepticism\n" +
                        "And that’s the crux – there’s no guarantee we won’t be in lockdown land again come summer. You have no desire to book festivals and make family and holiday plans only to have them all whipped away once more. Why risk it?!\n" +
                        "\n" +
                        "Anxiety\n" +
                        "The thing is though, the work holiday diary is filling up, reorganised wedding invites are starting to arrive, your dad’s 60th is seemingly back on the cards and Booking.com is bombarding you with emails. The FOMO might just break down your cynical carapace after all..\n" +
                        "\n" +
                        "Tentativeness\n" +
                        "Hesitatingly, you block off the odd summer weekend for those previously postponed nuptials. You agree – in theory – to a festival with your mates. You tell your mum you *will* see her soon. You try and guard against the feeling of hope trying to suffuse its way through your body and brain…\n" +
                        "\n" +
                        "Hope\n" +
                        "And then you give in to it. You say yes to every plan and every post-lockdown idea. You dedicate yourself to trawling holiday sites and buying swimwear. You stop adding caveats every time you call your siblings about meeting up (the word ‘eventually’ is scrapped from your vocab). You allow yourself to dream. You know it may be short-lived, but oh does it feel good.\n",
                walker, lifestyle, uk, "2021-03-15", 0,
                "https://static.independent.co.uk/2021/03/15/13/15105454-e9513e02-0b3c-4450-a0c2-7b72d326dc6a.jpg?width=640&auto=webp&quality=75");
        articleRepository.save(lifestyle7);


        Article lifestyle8 = new Article("\n" +
                "James Morton: ‘The pandemic gave sourdough the recognition it deserves’\n",
                "The brewer and baker talks to Katie Wright and Ella Walker about lockdown, Bake Off and the rules of caring for your precious sourdough starter",
                "They’re both microbiological wonders,” James Morton says of two of his great loves: sourdough and beer brewing. “They’re both very scientific, very measured. And they’re both ways of achieving taste nirvana.”\n" +
                        "And they’re the subject of his two new cookery guides, From Scratch: Sourdough and From Scratch: Brew.\n" +
                        "\n" +
                        "\n" +
                        "The former Great British Bake Off contestant, who lives in Glasgow has been making sourdough since his late-teens, and has been pleased to see the lockdown-friendly bread in particular get “the recognition it deserves”. His other bread books actually sold out as a result of the pandemic rush – but as a doctor, there have been lows during this past year, as well as the bread-based highs.\n" +
                        "“We’ve all had a few crises, a few wobbles,” says Morton, who also become a father during the pandemic, to daughter Lily. But, he adds, “I’ve got a feeling we’re getting there. I’m feeling really, really positive.”\n" +
                        "\n" +
                        "So why do you think sourdough became so popular during lockdown?\n" +
                        "“It’s a labour of love, there’s this story of creating something from literally just flour and water, bringing it to life, sharing it with other people, sharing it online – which has become a really important part of it. And the fact it’s just awesome. You can make bread as good as the best bread in the world, in the comfort of your own home.”\n" +
                        "Is there a secret to producing perfect sourdough?\n" +
                        "“Sourdough is just a mixture of flour, water and salt, but there’s all this biochemical madness going on in order for you to get this loaf of bread, and the most important part of that is the starter. It’s just flour and water that you leave to go off, it starts to bubble, it’s full of yeast and bacteria, and if you neglect it, let it just fizzle out and fade over time without feeding it, or taking proper care of it, it will just not produce good bread.”\n" +
                        "\n" +
                        "What mistakes do people always make?\n" +
                        "“People say, ‘My loaf has just fallen apart into this wet pancake’. But almost always, even if you think your problem is completely unrelated, it’s down to the starter; your starter isn’t active enough. You just need to feed it more and feed it better.”\n" +
                        "Do you name your starter?\n" +
                        "“Absolutely not. If the starter’s not going well, or it’s really, really faded, you should just get rid of it; you shouldn’t have any sentimental attachment. There are people who have starters that are hundreds of years old and like to boast about this. But that doesn’t actually make any better bread.\n" +
                        "“Starter hotels even exist. People will drop off their starters to other people to look after when they’re on holiday. You don’t need to do that. Just stick it in the fridge, it’ll be pretty resilient, and then give it a couple of feeds when you get back.”\n" +
                        "Feeding it sounds quite complicated…\n" +
                        "“If you try and feed it every day, you’re just going to forget; you’re setting yourself up for failure. The key is actually to keep it dormant in the fridge and only when you need it, take it out. Feed it with far more flour and water than is in the starter, and you’re gonna have a good loaf. Your starter should always at least double in size before you use it. And if you stick to that, you will not go far wrong.”\n" +
                        "How often do you bake bread?\n" +
                        "“I make bread two to three times a week, two to three loaves at a time. So we get through a lot of bread. I’ve been making the focaccia and my staple, the country loaf [in the book]. It’s mostly white, with a bit of rye or oatmeal in there to give it some earthy crunch.”\n" +
                        "\n" +
                        "What’s your go-to toast topping?\n" +
                        "“Peanut butter and banana on toast – I think it’s my number one at the minute. Peanut butter and jam – mostly involving peanut butter, to be honest, or scrambled eggs on toast. Anything that involves breads, I am pretty much for.”\n" +
                        "When did you initially find yourself drawn to brewing beer?\n" +
                        "“I did get into it as a student. One of my friends happens to be a UK champion homebrewer, and so he introduced me to this idea that homebrew wasn’t just something that tasted dodgy, brewed in these big plastic buckets with little airlocks, that bubbled on top and was always sour, or the bottles were exploding.”\n" +
                        "\n" +
                        "\n" +
                        "Why is it worth the effort of brewing your own?\n" +
                        "“My first homebrew pint, I opened up, it fizzed everywhere and tasted sour, infected with the wrong sort of bugs – probably that had got there from my sourdough starter, actually. But the first taste of my first proper homebrew – which was an oatmeal stout in a 500ml Samuel Smiths bottle, with the remnants of gold foil around the top – I popped the cap and there’s this amazing hiss, and that hiss and that first bottle, there is no feeling like that in the entire world, it is awesome. Then you pour it and it’s black with a head that almost looks like a pint of very nice Guinness. And you taste it, and it’s just so much better than any Guinness you have ever had.”\n" +
                        "\n" +
                        "How straightforward is brewing?\n" +
                        "“Like a sourdough, you’ve got to follow these scientific steps to get really, really good results, but once you’ve got the hang of it, it is possible.”\n" +
                        "\n" +
                        "What should every budding brewer keep in mind?\n" +
                        "“Everything needs to be super, super clean, and not just clean but sanitary. What I mean by that is, it’s covered in some food-safe disinfectant of some kind to stop the beer getting infected, which is what happened to my first ever batch. If it becomes infected, it could become sour, smelly, sulphurous or over carbonated and the bottles could explode. So it’s very, very important not to let it become infected. The only thing you want in your beer is your yeast, which causes the fermentation which creates your alcohol and your carbon-dioxide that makes it fizzy.”\n" +
                        "Has the pandemic affected your eating habits?\n" +
                        "“Not really, to be honest. We get our veg box and try to try to keep everything as local and as seasonal as possible, which in Scotland means lots and lots of potatoes, carrots and swedes at this time of year! We’re getting into some spring greens and some cabbage, I hope.”\n" +
                        "What about trying out meal kits?\n" +
                        "“We’ve done absolutely tons of them, which has been great, having a baby. Having a load of really good restaurants very nearby means there’s loads of dine-at-home options and we’ve not had to get a babysitter, so we’re just able to have date nights and the baby’s been upstairs asleep.”\n" +
                        "\n" +
                        "Do you still watch Bake Off?\n" +
                        "“I watch it most years. I watched this year. It was a really nice light relief from [the pandemic]. They’ll be filming the new season soon.”\n" +
                        "Does it bring back memories?\n" +
                        "“Yes, it’s not always good! It makes me feel stressed, like I’m going to be judged again!”\n" +
                        "‘From Scratch: Sourdough’ and ‘From Scratch: Brew’ by James Morton are published by Quadrille, priced £12 each. \n" +
                        "\n",
                walker, lifestyle, uk, "2020-04-08", 0,
                "https://static.independent.co.uk/2021/04/07/08/31100730-f266e489-f1b4-4467-b712-3075daae6efc.jpg?width=990&auto=webp&quality=75");
        articleRepository.save(lifestyle8);


    }
}
