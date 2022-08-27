# WaterMonitor

## Inspiration
Remote water monitoring systems have not been used effectively in emerging countries. We got motivated to recycle and use old phones and tablets, used devices like computers on providing remote water monitoring facility to prevent havoc in case of hurricanes, excessive rainfall. Chennai floods in 2015 has made it all the more urgent to design, develop and deploy such systems cost effectively.

## What it does
Our vision is to carry out research on new models that incorporate technology and which aims at revolutionizing the water management practices around the world . The technology solution is designed specifically to address the needs of the water, health and environment eco-system comprising of civic bodies, water management units, hospitals, environment and health ministry, laboratories, citizens, R&D organizations and improve the operational efficiencies.

Just in Time service Availability of city’s water records suffering from environmental issues across different stakeholder through secure blockchain network.

Record Management Quality documentation reduces the issues regarding implementation of water management policies.

Research Research laboratories can use the data for diagnosis of water borne diseases, suggesting personalized action to water treatment plants.

4.Web Application Cloud-based web application with a chat-based interface for quick water wastage attention. It can also be used for environment protection and steps to reduce the issues.

Transparency Insurance agencies can utilize the data to provide customized house insurance plans to the customer. Ground water levels are at an all time low.

Better Management Practices Journal of water usage records covering complete city history improve the policy implementation and help define stringent rules towards saving water.

Pitch Deck: https://drive.google.com/drive/folders/14mpks87mtZPvF78cJoqCcvs9Uhuk6gnE?usp=sharing

## How we built it

Our solution offers an Artificial Intelligence-based object detection system that utilizes blockchain solutions for sorting information obtained from a variety of water management bodies, cameras deployed at monitoring spots.

Our app will provide the requisites features to share weather conditions like humidity, temperature and conditions and remotely monitor the water management policies in a place using used and broken phones and tablets, alarm clocks, internet connection, sync service, integration with IP cameras, raise safety alarms. The cost of deployment and added technology is limited which could help the families living in a variety of geographical regions.

We also plan to utilize SocialCalc, one of our open source spreadsheet projects and customize it for developing water monitoring and sewage management application. Features include Tabulation that enables the user to enter and edit data in a tabular format; Organization that enables the user to organize the tabular matter in several forms, Facilitates sorting of numeric data, comments to increase ease of understanding of data, names to access data in different modalities, clipboard function; Collaboration and the ability to support sharing of data over the network and multi-user editing and Interoperability between SocialCalc and Excel (.xls format), csv format.

Quality Assurance and Water Recyclability : Our serverless solution equips with two general purpose object detection engines detect 20 object types in real-time and 80 object types & better accuracy a bit slower. Our software will turns any IP camera to an AI beast within the snap of a finger. IPFS & Ethereum, Hedera Hashgraph is a seamless solution to keep data encrypted and place the immutable fingerprints into blockchain transactions. With just a cell phone, users are offered a serverless solution that can detect objects in water in real time and more object types for better accuracy.

Technologies Used: JavaScript, CSS, Tornado Python Web Framework, Swift, Yolo Machine Learning Library, Ionic Framework, Hedera Hashgraph

How it works:

Camera Management: Add/edit/delete cameras with integration with Livepeer, NFT.Storage for snapshots of road incident, ethpass for toll ticketing, neume for data retrieval.
Object Detection using Livepeer and Pytorch/Tensorflow deep learning library using CNN neural networks.
Video analytics configuration using NFT.Storage, Litprotocol for security and neume for data retrieval.
Live streaming with Object Detection Video Analytics using Livepeer for streaming, Litprotocol for security and NFT.Storage for snapshots.
Alarm storage using Ethereum. Save/delete alarm metadata and image to/from IPFS using NFT.Storage. Store the hash returned from IPFS to Ethereum test network using NFT.Storage, Litprotocol for security and neume for data retrieval.. Provide links to alarms and blockchain transaction details.
Alarm Viewer: Add alarms with a single touch. Open the Alarm Settings menu from the home page. Add an alarm, set the wallpaper or choose an alarm tone. You can also delete an existing alarm. 


## Challenges we ran into
AWS deployment: We were using PV (paravirtual) based classic instance. Before August 15th, we were required to convert PV (paravirtual) instance to an HVM (Hardware Virtual Machine) and convert it from a classic instance to a VPC instance. We faced a number of challenges in converting our PV instance to an HVM instance as our instance was not reachable via ssh. We arrived at a good conclusion on the issue by doing the following:
Created an ami of current classic instance.
Launch a new instance from this ami after shifting to vpc as the base with new VPC security groups and updated volume.
The newly launched instance is working and we are able to ssh and has the code base. We purchased the developer support plan using AWS credits and have being shared key pointers on converting our VPC based PV instance to a VPC based HVM instance. This challenge would not have been solved without the support of AWS team.

The insurance providers have to manually upload the incident data to create the insurance based NFT. It is not a problem for a small set where we can use csv to json conversion using open source libraries like phpexcel in ethercalc but problematic for larger number of data points. At this juncture, the insurance providers have to manually connect their wallet and create the insurance claim NFT.

## Accomplishments that we're proud of
A greater and more seamless flow of information within a water infrastructure, created by electronic incident record management service (E.I.R.M.S), encompasses and leverages digital progress and can transform the way clean drinking water can be delivered and efforts sustained.

E.I.R.M.S helps in improved coordination. E.I.R.M.S helps in making water management ecosystem proactive and authentic. E.I.R.M.S with the help of computer aided detection will help in early prediction and prevention of water borne diseases.

## What we learned
We can utilize SocialCalc, Machine Learning Models coupled with Hedera Hashgraph, decentralized Polygon, NFT.Storage, network tools, ethereum based infrastructure tools for analysis and prediction of incidents to provide early stage detection and prevention of water borne diseases. We also witnessed the great eco-system available to developers to learn and contribute in the Ethereum eco-system.

## What's next for Water Monitor
The platform is currently running on Heder Hashgraph, Polygon testnet and SAP Hana platform. We still need focus on key performance indicators like throughput and measure the performance of our smart contracts before moving to mainnet. We plan to utilize tools like blocktest for measuring and benchmarking our smart contracts and unit tests on a variety of key parameters like throughput, latency. We also wish to test our solution using AWS templates on compliance and security.
