import '../styles/page1.css'
import  Header  from './header'
import HouseImg from '../assets/home.jpg'
import Facebook from '../assets/facebook.png'
import Youtube from '../assets/youtube1.png'
import Pinterest from '../assets/download.png'
import WebFlow from '../assets/webflow1.png'
import Google from '../assets/google1.png'
import { ArrowRight } from 'react-bootstrap-icons';
import House1 from '../assets/buliding1.jpg'
import House2 from '../assets/buliding 2.jpg'
import House3 from '../assets/building 3.jpg'
import House4 from '../assets/building 4.jpg'
import HomeImg from '../assets/house.jpg'
import Profile from '../assets/tony.jpg'
import FlexImg1 from '../assets/simone-hutsch-_wpce-AsLxk-unsplash.jpg'
import FlexImg2 from '../assets/harry-shelton-pPxhM0CRzl4-unsplash.jpg'
import FlexImg3 from '../assets/inside.jpg'
import Inside1 from '../assets/in2.jpg'










function Page1() {

    return (
        <>
        <Header/>
        <div className='container1'>
            <div className="main1">
                <div className="main12 " style={{width: '800px'}} >
                    <h1>The Best Place To Find Your <span>Best House</span> </h1>
                </div>
                <div className="main12" id="main" style={{ width: '500px' }} >
                    <p id="p1">
                        WE Are Real Estate Agency That Will help You Designing you a Modern And Minimaist Dream House.Let's Discuss.
                    </p>
                    <input type="button" value="Get in Touch" />
                    <div className="products">
                        <p id="product">1200<span style={{color:'orangered'}}>+</span><br />Premium Product</p>
                        <p id="product">4500<span style={{color:'orangered'}}>+</span><br /> Happy Customer</p>
                        <p id="product">240<span style={{color:'orangered'}}>+</span><br />Award Winning</p>

                    </div>
                </div>
            </div>
        
        <div class="img">
            <img src={HouseImg}/>
        <div class="search">
            <form action="#">
                <input  type="search"  placeholder="Search by location" id="search"/>
                <input type="button" value="Search Now" id="submit"/>
                </form>
        </div>

        </div>
        </div>
        <div class="main2">
        <p>Trusted by</p>
        <ul>
            <li ><a href="www.facebook.com"><img src={Facebook} alt="symbol"/></a></li>
            <li ><a href="www.youtube.com"><img src={Youtube}/></a></li>
            <li ><a href="www.pinterest.com"><img src={Pinterest} /></a></li>
            <li ><a href="www.webflow.com"><img src={WebFlow} alt="symbol"/></a></li>
            <li ><a href="www.google.com"><img src={Google} alt="symbol"/></a></li>
        </ul>
    </div>
    <hr/>


    <div class="container2">
        <div class="head2">
            <h2> Popular Resident</h2>
            <p><a href="#">Exports All &nbsp;<ArrowRight className='arrow'/></a>   </p>
        </div>
        <div class="flexing">
            <div class="divide">
                <div class="gallery">
                    <img src={House1} />
                    <p><span>&#x24;59,345</span> <br/>Home in Downtown,Los Angeles</p><hr/>
                    <button><i class="fa fa-crop" aria-hidden="true"></i>
                        &nbsp;2500 sqft </button>
                    <button><i class="fa fa-bed" aria-hidden="true"></i>
                        &nbsp;3 </button>
                    <button><i class="fa fa-bath" aria-hidden="true"></i>&nbsp;2 </button>

                </div>
                <div class="gallery">
                    <img src={House2} />
                    <p><span>&#x24;53,542</span><br/> Home in Downtown,Los Angeles</p><hr/>
                    <button><i class="fa fa-bath" aria-hidden="true"></i>&nbsp;2500 sqft </button>
                    <button><i class="fa fa-bath" aria-hidden="true"></i>&nbsp;3 </button>
                    <button><i class="fa fa-bath" aria-hidden="true"></i>&nbsp; 2</button>

                </div>
            </div>

            <div class="divide1">
                <div class="gallery">
                    <img src={House3} />
                    <p><span>&#x24;79,345</span><br/> Home in Downtown,Los Angeles</p><hr/>
                    <button><i class="fa fa-crop" aria-hidden="true"></i>&nbsp;3000 sqft </button>
                    <button><i class="fa fa-bed" aria-hidden="true"></i> &nbsp;4</button>
                    <button><i class="fa fa-bath" aria-hidden="true"></i>&nbsp; 3</button>
                    
                </div>
                <div class="gallery">
                    <img src={House4} />
                    <p><span>&#x24;99,643</span> <br/>Home in Downtown,Los Angeles</p><hr/>
                    <button><i class="fa fa-crop"></i>&nbsp; 5550 sqft </button>
                    <button><i class="fa fa-bed" aria-hidden="true"></i> &nbsp;6</button>
                    <button><i class="fa fa-bath" aria-hidden="true"></i>&nbsp; 5</button>

                </div>
            </div>
        </div>
    </div>
    <div class="container3">
        <h1>What our clients say</h1>
        <div class="imaging">
            <img src={HomeImg} alt="image" id="image1"/>
            <div class="article">
                <h3>"They did on amazing job for our house"</h3>
                <p>Lorem ipsum dolar sit amet,consectetur adipiscing elit pretium leo pellentesque ultrices eat various ametrhoncus sed euismod sit id purus elementum nulla tincidunt massa vel  </p>
                <p id="span"><img src={Profile}/>---Tony Stark</p>
            </div>
        </div>
        <button id="button2">Get in Touch &nbsp;<ArrowRight className='arrow'/></button>

    </div>
    <div class="container4">
        <div class="zzzz">
            <div class="">
                <img src={FlexImg2} id="id1" />
                <img src={FlexImg1} id="id2"/>
            </div>
            <img src={FlexImg3} id="id3"/>

        </div>
        <div  id="zzzz">

            <h2>With Us Help You Find Your Dream Home</h2>
            <p>
                Lorem Ipsum Dolor Sit Amet.Consectetur Adipiscing Elit Ut Aliquam ,Porus Sit Amet Lustus venenatis,Lectus Magna.
            </p>
            <div class="p">
                <p><span>127</span> <br/>Properties Build</p>
                <p><span>300+</span> <br/>Happy Customers</p>
                <p><span>10</span><br/>Years Of Experience</p>
            </div>
        </div>
    </div>
    <div class="container5">
        <h2>Articles &Resources</h2>
        <div class="one">
            <img src={Inside1}/>
            <div class="article1">
                <h2>Why a luxury home in a gated community is a better investment</h2>
                <p>Lorem ipsum dolor sit amet,consectetur adipiscing elit cilicis pretium leo pellenyesque ultrices est various amet rhoncus sed euismod sit id purus elementum nulla tincidunt massa vel.</p><hr/>
                <div class="paras">
                    <p><i class="fa fa-calender" aria-hidden="true"></i>&nbsp;June 12,2022</p>
                    <p><i class="fa fa-clock" aria-hidden="true"></i>&nbsp;10 min read </p>
                </div>
            </div>
        </div>
        
    </div>
        </>
        
    )
}

export default Page1;
