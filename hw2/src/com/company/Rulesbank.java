package com.company;

import java.util.Scanner;

public class Rulesbank {

    public void fightagainstmoneylaundering(){
        int made1,made2,m;
        System.out.println("if you want made1 press0,else(made2) press 9");
        Scanner enter=new Scanner(System.in);
        m=enter.nextInt();
        switch (m){
            case 0:
                System.out.print(" IF YOU WANT crimeoforigin PRESS 1, IF YOU WANT  property PRESS 2");
                System.out.print(",IF YOU WANT  propertyfromcrime PRESS 3,IF YOU WANT  involvedpersons PRESS 4 ");
                System.out.print(",IF YOU WANT  nonfinancialoccupations PRESS 5,IF YOU WANT  basicservices PRESS 6");
                System.out.print(",IF YOU WANT suspicioustransactionsandoperations PRESS 7 ");
                made1=enter.nextInt();

                switch (made1) {
                    case 1 :
                        System.out.print("crime oforigin is Any behavior that is considered a crime according to Article 2)");
                        System.out.print(" of the Islamic Penal Code approved on 31/32/1032, from the perspective of\n");
                        System.out.print("This law is a crime mentioned in the law on combating smuggling of goods and ");
                        System.out.print("currency with subsequent amendments.");
                        break;
                    case 2 :
                        System.out.print(" property is Any kind of property, whether tangible or intangible, movable or");
                        System.out.print(" immovable, legitimate or illegitimate, and any kind of financial gain or privilege");
                        System.out.print("Also, all documents expressing the right, whether paper or electronic");
                        System.out.print(", such as commercial documents, stocks or securities.");
                        break;
                    case 3:
                        System.out.print("property fromcrime is Any money that is directly or indirectly derived from a crime");
                        System.out.print( ", such as money that comes from crime");
                        System.out.print("Economic and the crime of financing terrorism is achieved. Also,");
                        System.out.print(" the property of the subject of the crime or the money allocated ");
                        System.out.print("for the commission of the crime Has been sentenced to property obtained from the offense.");
                        break;
                    case 4 :
                        System.out.print("involved persons is Persons mentioned in Articles 5 and 6 of this law");
                        break;
                    case 5 :
                        System.out.print("nonfinancialoccupations is Jobs where employees do a lot of cash transactions");
                        System.out.print(" and are at risk for money laundering");
                        System.out.print("Such as real estate or car dealers, goldsmiths, money changers, car dealers, carpets,");
                        System.out.print("Sellers of antiques and any kind of expensive products.");
                        break;
                    case 6 :
                        System.out.print("basic services is It is a service that according to the relevant regulations is a prerequisite and requirement for other services to be provided by individuals\n" +
                            "After that, the client refers to the eligible persons in order to receive frequent and continuous services.");
                        break;
                    case 7:
                             System.out.println("suspicious transactionsand operations is Suspicious transactions and operations include any type of transaction, receipt or payment of property, whether physical or\n" +
                            "Electronic or start them that based on the evidence and circumstances such as the following raises the suspicion of a crime:\n" +
                            "1- Transactions and financial operations related to the client that are more than the level of activity expected by him.\n" +
                            "2 - Detection of forgery, false statement or false report by clients before or after the transaction or financial operations\n" +
                            "And also at the time of obtaining basic services.\n" +
                            "0 - Financial transactions or operations that are specified in any way are formal or apparent and are owned by another person.\n" +
                            "4- Transactions or financial operations beyond the ceiling stipulated in the executive regulations of this law. Although clients, before or during the transaction or\n" +
                            "Cancel the said operation or terminate the contract without any logical reason");
                        break;

                }
                break;
            case 9:
                System.out.println("if you want remarks press 1,else press 2");
                made2=enter.nextInt();
                switch (made2) {
                    case 1 : System.out.print("Note 1- Whenever there is a suspicion close to the knowledge of the inaccuracy of transactions and acquisition of property, such as\n" +
                            "Under the circumstances, it is not possible to acquire that amount of assets at a specific time, it is the responsibility of proving their authenticity\n" +
                            "Is occupied. The meaning of science in this note and note (0) is the same as defined in the Islamic Penal Code for the knowledge of the judge\n" +
                            "Is.\n" +
                            "Note 2: Possession of property subject to this law is subject to the submission of positive documents. In addition, if the value of the property\n" +
                            "More than ten billion (13033303330333) Rials for the base year and its increased equivalent based on the inflation rate for subsequent years\n" +
                            "It is necessary to have a history of it in the relevant systems in accordance with the laws and regulations. Failure to submit positive documents that can be verified\n" +
                            "The court will impose a fine of one-fourth of the value of the property, in which case the original property subject to the law until\n" +
                            "Judicial time is suspended. If it is proved after the investigation that the possession of the confiscated property is legal, etc.\n" +
                            "This will be recorded.\n" +
                            "Note 3 - If there is a close suspicion of knowing the acquisition of property through illegitimate means, it is considered as illegitimate property.\n" +
                            "And the perpetrator is sentenced to sixth degree imprisonment if he is not subject to a more severe punishment. In any case, confiscate the property\n" +
                            "Will be unless its legitimate education is proven.");
                        break;
                    case 2 :
                        System.out.print("A- Acquisition, possession, maintenance or use of proceeds of crime with knowledge of its criminal origin.\n" +
                            "(B) The conversion, exchange or transfer of proceeds for the purpose of concealing or concealing its criminal origin with the knowledge that directly or indirectly\n" +
                            "Indirectly obtained from the commission of an offense or assistance to the perpetrator of the offense originating in such a way that he is subject to the legal effects and consequences of the offense\n" +
                            "Do not commit that crime.\n" +
                            "(C) Concealing or concealing the origin, source, location, transfer, transfer or ownership of revenue directly or indirectly\n" +
                            "The result of the crime is educated");
                        break;
                }
                break;
        }



    }
    public  void combatingthefinancingofterrorism(){
        System.out.println("Preparation or collection of funds or property in any way, whether it has a legal origin or not, or the consumption of all or part of\n" +
                "Resources such as currency smuggling, financial and monetary assistance, donations, money transfers, purchase and sale of financial and credit securities,\n" +
                "Direct or indirect opening of an account or financing or carrying out any economic activity of individuals by oneself or another for\n" +
                "To commit the following acts or to present them to terrorist individuals or terrorist organizations is terrorist financing and is considered a crime.\n" +
                "May be. In addition to terrorist groups and individuals, it is the responsibility of the terrorist organization to determine whether the acts listed in the following paragraphs are terrorist acts.\n" +
                "The Supreme National Security Council is:\n" +
                "A- Committing or threatening to commit any violent act such as murder, assassination, violent act leading to harm\n" +
                "Severe physical abuse for more than one-third of the full blood money, illegal detention and hostage-taking, or action\n" +
                "Conscious violence against people or endangering their lives or liberties with the intent to influence policies, decisions and\n" +
                "Actions of the Government of the Islamic Republic of Iran, other countries or international organizations;\n" +
                "B- Committing the following acts with the purposes mentioned in paragraph (a):\n" +
                "1- Sabotage in public and non-governmental public property and facilities\n" +
                "\n" +
                "\n" +
                "The above law, consisting of five articles, was approved by the Islamic Consultative Assembly in a public session on Sunday, July 21, 2013.\n" +
                "It was approved by the Guardian Council on 16/61/1911.\n" +
                " WWW.CBI.IR\n" +
                "2\n" +
                "2- Severe damage to the environment, such as water poisoning and forest fires\n" +
                "9- Production, possession, acquisition, transfer, transportation, storage, development or illegal accumulation, theft, fraudulent education and smuggling of poisons,\n" +
                "Nuclear, chemical, microbial and biological elements and materials (biological)\n" +
                "1- Production, supply, sale and purchase and illegal use and smuggling of explosives, weapons and ammunition\n" +
                "C- Committing the following acts regardless of the perpetrator's motive and the result:\n" +
                "1- Dangerous acts against the safety of aircraft or aviation\n" +
                "2- Seizing a flying aircraft and exercising illegal control over it\n" +
                "9- Committing violence against the passenger or passengers and crew of the aircraft or dangerous acts against the property in the aircraft in flight\n" +
                "1- Production, possession, acquisition, transfer, transportation, maintenance, development or accumulation, enrichment and illegal explosion, theft, education\n" +
                "Fraudulent and unjustifiable smuggling of nuclear elements or materials for medical, scientific and peaceful purposes\n" +
                "1. Production, possession, acquisition, transfer, theft, fraudulent education, smuggling, transportation, maintenance, development or accumulation and use or threatening to\n" +
                "Use of nuclear, chemical, microbial and biological weapons.\n" +
                "0 - Piracy, illegal seizure of the ship or the exercise of illegal control over it or endangering the safety of shipping from\n" +
                "By knowingly providing incorrect or destructive information and causing severe damage to the ship, its cargo and its crew or passengers\n" +
                "1- Illegal seizure or control of platforms or facilities located in maritime areas, committing acts of violence against persons present in\n" +
                "They and any action to destroy or damage these platforms or facilities with the intention of endangering the safety of these areas\n" +
                "2. Bombings in public places, government facilities, public transportation networks or infrastructure facilities\n" +
                "(D) Committing offenses recognized as a terrorist offense under domestic law or international conventions; In case of\n" +
                "Accession of the government of the Islamic Republic of Iran to them.");

    }
    public  void regulationofnoncommonmoneymarket(){
        System.out.println("Engaging in banking operations by natural or legal persons under any title and establishing and registering any organization for\n" +
                "Banking operations are prohibited without obtaining a license from the Central Bank of the Islamic Republic of Iran. Banking operations in this law\n" +
                "Intermediary between suppliers and applicants for funds and credit in the form of receipt of funds, deposits, deposits and the like\n" +
                "Under any title and lending, credit and other facilities and issuance of electronic payment cards and credit cards\n" +
                "it is possible.\n" +
                "Note 1- Banks and funds that have already been established in accordance with special laws based on the provisions of the same laws to continue operating\n" +
                "Will give.\n" +
                "Note 2: Other natural or legal persons who operate without obtaining a license from the Central Bank of the Islamic Republic of Iran.\n" +
                "Banks are obliged to obtain a license from the Central Bank within one month from the date of entry into force of this law.\n" +
                "Islamic Republic of Iran to submit and provide the required documents. Otherwise, at the request of the Central Bank of the Republic\n" +
                "Islamic Republic of Iran The continuation of the activities of such persons will be stopped by the law enforcement forces of the Islamic Republic of Iran. In case of\n" +
                "Objection, the applicant can refer to the competent judicial authorities. The Central Bank of the Islamic Republic of Iran is also responsible\n" +
                "\n" +
                "2\n" +
                "Within three months, review the application and announce the result to the applicant. In case of non-issuance of license, the mentioned bank has objections and\n" +
                "The applicant must inform the applicant of the deficiencies of the case in order to correct it.");

    }
    public  void interestfreebankingoperations(){
        System.out.println("Banks can accept any of the following:\n" +
                "A - Credit deposits:\n" +
                "1. Current.\n" +
                "2. \n" +
                " - Term investment deposits\n" +
                "Note - Term investment deposits in which the bank is a lawyer in employing women, in matters of participation, Mudaraba, conditional rent\n" +
                "Acquisition, installment transactions, farming, masakat, direct investment, futures and forgery transactions are used.\n" +
                "Article 4 - Banks are obliged to repay the principal of the loan deposits (savings and current) and can cancel the deposit.\n" +
                "Pledge or insure long-term investment.\n" +
                "Article 5 - The benefits obtained from the operations mentioned in the commentary of Article \"3\" of this law, on the basis of a concluded contract, commensurate with the limit and limit\n" +
                "Investment deposits and observance of the share of bank resources in proportion to the term and amount of the total amount were used in this operation, division\n" +
                ".\n" +
                "Article 6 - Banks may, in order to pocket and equip deposits, by granting incentive methods from the following privileges to the depositors of Gahbaran be granted\n" +
                "Representatives:\n" +
                "A- Granting non-fixed cash or sexual rewards for loan deposits.\n" +
                " Discount or exemption of Gabaran deposit from your payment or commission payment.\n" +
                "C- Giving priority right to Gabaran deposit for using bank lending facilities in the cases mentioned in Chapter 3");

    }
    public  void budgetfortheyear1399(){
       System.out.println("Pursuant to Article 123 of the Constitution of the Islamic Republic of Iran, it was annexed to the Budget Law of 1399, which was approved by the Joint Commission of the Islamic Consultative Assembly on Saturday, with the approval of the Supreme Leader The Islamic Council arrived");


    }



}
