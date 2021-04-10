package com.example.codeclan.java_news_server.components;


import com.example.codeclan.java_news_server.models.*;
import com.example.codeclan.java_news_server.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import java.util.GregorianCalendar;

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

        User dominic = new User("coolguy24", "handsome", admin, scotland);
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
                read, business, uk, new GregorianCalendar(2021, 03, 29), 0, "https://ichef.bbci.co" +
                ".uk/news/976/cpsprodpb/67FC/production/_116902662_royalmail_pa.jpg");
        articleRepository.save(business1);


        Article business2 = new Article("Retailers call for 'Shop Out to Help Out' scheme when stores reopen", "A group of big names in fashion and retail are campaigning for the government to provide more support for small independent shops."
                , "They want the chancellor to offer a ‘Shop Out to Help Out’ scheme to get consumers spending again when non-essential shops reopen on 12 April. It would cover 50% of a shopper's costs, up to £10, on Monday to Wednesdays for a month. And it would only apply at physical stores with fewer than 10 staff." +
                "The ‘Save The Street’ campaign says independent retailers won't survive without it. The Treasury did not comment on whether it would pursue the idea, but said it had protected ‘millions' of retail jobs during the pandemic. The proposed scheme - which would work like the Eat Out to Help Out restaurant discounts last year - is backed by the likes of beauty entrepreneur Charlotte Tilbury, fashion designer Henry Holland and retail consultant Mary Portas." +
                "‘We would be kidding ourselves to think that everything will be fine for independent retailers once they reopen on 12 April,' says Ross Bailey, the entrepreneur leading the campaign. 'Now it is the government's responsibility to support these businesses and ensure they are given a fighting chance to bounce back - the government needs to show that all businesses matter, not just big businesses.’ The British Retail Consortium estimates that non-essential retail stores lost around £22bn in sales in 2020 due to lockdown measures, as footfall declined by 40%. Independent shops - many of which lack a strong online presence - were hit particularly hard as they faced prolonged closures and restrictions. Yet this hasn't stopped people from trying to start businesses. Latest data from Cornerstone Tax, which gives advice on property stamp duty, shows 13% of consumers have started, or intend to start, their own business in 2021. The firm's research also shows more than half of consumers want to support smaller firms over retail giants. Retail analysts are also seriously concerned about the situation facing Britain's independent shops. ‘Independent retailers have had a tumultuous year and immediate action is needed to avoid a high street apocalypse,' says Natalie Berg, retail analyst at NBK Retail." +
                "A Shop Out to Help Out Scheme would encourage consumers to ‘ditch their screens’ and support their local shops, she says. ‘This is a unique opportunity to redefine our high streets, but without government support we'll be bracing for a retail bloodbath.’ Retail expert Kate Hardcastle agrees, pointing out that independent retailers were the ones who ‘really demonstrated their worth’ in the early days of the pandemic in coming to their communities' aid when other retailers didn't have their online shopping offerings ready. She is concerned that everyone will forget about them now. 'Just telling people to shop small as has been previous campaigns might serve as a reminder, not an action,’ she tells the BBC. ‘Just as the case was with Eat Out to Help Out, we need to see our government support small businesses longer term. I'd love to see initiatives to make it easier for small businesses to open up on the High Street and rejuvenate.’ A Treasury spokesman said: ‘We've supported retailers across the UK though out the outbreak, protecting millions of jobs - and will continue to do so in the months ahead. Shops won't pay any business rates until July, can continue to furlough staff until September, and are receiving Restart Grants of up to £6,000.’",
                russon, business, uk, new GregorianCalendar(2021, 03, 30), 0, "https://ichef.bbci.co" +
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
                "responsibility of managing themselves.’", russon, business, uk, new GregorianCalendar(2021,
                04, 1), 0, "https://ichef.bbci.co.uk/news/976/cpsprodpb/1297/production/_117795740_vr-john.jpg");
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
                "people, society and the environment.'", russon, business, uk, new GregorianCalendar(2020,
                07, 21), 0, "https://ichef.bbci.co.uk/news/976/cpsprodpb/13364/production/_112029687_gettyimages" +
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
                "sneakily say, 'It was John's fault.’'", bloom, business, uk, new GregorianCalendar(2020, 10
                , 12), 0, "https://ichef.bbci.co.uk/news/976/cpsprodpb/CF95/production/_114814135_gettyimages" +
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
                "\n", bearne, business, uk, new GregorianCalendar(2021, 01, 18), 0, "https://ichef.bbci.co" +
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
                business, usa, new GregorianCalendar(2021, 04, 1), 0, "https://ichef.bbci.co" +
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
                bloom, business, uk, new GregorianCalendar(2021, 02, 15), 0, "https://ichef.bbci.co" +
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
                harper, business, restOfWorld, new GregorianCalendar(2021, 04, 01), 0, "https://ichef.bbci" +
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
                harper, business, restOfWorld, new GregorianCalendar(2021, 02, 25), 0, "https://ichef.bbci" +
                ".co.uk/news/976/cpsprodpb/DD5C/production/_117286665_saic.jpg");

        articleRepository.save(business10);








    }
}
