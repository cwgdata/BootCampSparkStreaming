/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
  * Created by carybourgeois on 4/22/16.
  */

package com.datastax.demo.fraudprevention

import scala.collection.immutable.TreeMap
import scala.util.Random

class Location {

  val r = Random

  var locationList = TreeMap[Double, Tuple2[String, String]](
    0.192095009210127 -> ("CN", ""),
    0.367853521373369 -> ("IN", ""),
    0.402899790433211 -> ("ID", ""),
    0.430812110213843 -> ("BR", ""),
    0.456598266320469 -> ("PK", ""),
    0.481751143162997 -> ("NG", ""),
    0.503736370587543 -> ("BD", ""),
    0.523211687723751 -> ("RU", ""),
    0.540592781672127 -> ("JP", ""),
    0.557756994774423 -> ("MX", ""),
    0.571709605067011 -> ("PH", ""),
    0.585270154142547 -> ("ET", ""),
    0.598069295797269 -> ("VN", ""),
    0.609678666539941 -> ("EG", ""),
    0.62099423478021 -> ("DE", ""),
    0.631886891729993 -> ("IR", ""),
    0.642397739891703 -> ("TR", ""),
    0.652162437365288 -> ("CD", ""),
    0.661400073370441 -> ("TH", ""),
    0.670306329709703 -> ("FR", ""),
    0.679056474743609 -> ("GB", ""),
    0.687436346119879 -> ("IT", ""),
    0.694859850554738 -> ("MM", ""),
    0.702191126438308 -> ("ZA", ""),
    0.709357862246659 -> ("TZ", ""),
    0.716176400321344 -> ("KR", ""),
    0.722964645589839 -> ("CO", ""),
    0.729433532732485 -> ("ES", ""),
    0.735840682997414 -> ("KE", ""),
    0.741959676208801 -> ("UA", ""),
    0.747737234685091 -> ("AR", ""),
    0.753306270227524 -> ("DZ", ""),
    0.758807846829413 -> ("UG", ""),
    0.764237052014162 -> ("SD", ""),
    0.769602060587984 -> ("US", "CA"),
    0.774840534959357 -> ("PL", ""),
    0.779756887893965 -> ("CA", ""),
    0.784658907438093 -> ("IQ", ""),
    0.789312644962954 -> ("MA", ""),
    0.793699348000901 -> ("AF", ""),
    0.797988181698584 -> ("VE", ""),
    0.802258987814614 -> ("PE", ""),
    0.806459896911642 -> ("MY", ""),
    0.810557543675587 -> ("SA", ""),
    0.814629450202465 -> ("UZ", ""),
    0.818527391902689 -> ("NP", ""),
    0.822292182228839 -> ("US", "TX"),
    0.82600937499731 -> ("MZ", ""),
    0.82970772278574 -> ("GH", ""),
    0.833207444136425 -> ("YE", ""),
    0.836655117329523 -> ("KP", ""),
    0.839976708328871 -> ("MG", ""),
    0.843255498435326 -> ("AU", ""),
    0.846461653018891 -> ("CM", ""),
    0.849589247037696 -> ("AO", ""),
    0.852640784905009 -> ("SY", ""),
    0.855602804491512 -> ("LK", ""),
    0.858560350452799 -> ("RO", ""),
    0.861478984056919 -> ("CI", ""),
    0.864257271289786 -> ("US", "FL"),
    0.866970391285402 -> ("US", "NY"),
    0.869611226757001 -> ("NE", ""),
    0.872067816191334 -> ("CL", ""),
    0.874523112233886 -> ("BF", ""),
    0.876895360929143 -> ("MW", ""),
    0.87920394876302 -> ("NL", ""),
    0.881502429035474 -> ("KZ", ""),
    0.88373075613239 -> ("ML", ""),
    0.885958604494804 -> ("GT", ""),
    0.888182423017377 -> ("EC", ""),
    0.890331048563352 -> ("KH", ""),
    0.892458094051782 -> ("ZM", ""),
    0.894520243535593 -> ("ZW", ""),
    0.896571612790094 -> ("SN", ""),
    0.898436337126715 -> ("TD", ""),
    0.900198868847626 -> ("US", "IL"),
    0.90195352097965 -> ("US", "PA"),
    0.903656846139585 -> ("RW", ""),
    0.905349174111516 -> ("GN", ""),
    0.907014715291369 -> ("SS", ""),
    0.908606397591857 -> ("US", "OH"),
    0.910148104012361 -> ("CU", ""),
    0.911687955388066 -> ("TN", ""),
    0.913220702223153 -> ("BE", ""),
    0.914745557682588 -> ("GR", ""),
    0.916269985255074 -> ("SO", ""),
    0.917780955495178 -> ("BO", ""),
    0.91927209464166 -> ("BJ", ""),
    0.920754022431961 -> ("BI", ""),
    0.922231076669398 -> ("CZ", ""),
    0.923691009261357 -> ("DO", ""),
    0.925145168942936 -> ("PT", ""),
    0.926598467505456 -> ("HT", ""),
    0.927998469198666 -> ("US", "GA"),
    0.929374889414369 -> ("US", "NC"),
    0.930734832007904 -> ("US", "MI"),
    0.932093242322101 -> ("HU", ""),
    0.933421841305716 -> ("SE", ""),
    0.934739297274385 -> ("AZ", ""),
    0.936051894355117 -> ("AE", ""),
    0.93734350852867 -> ("RS", ""),
    0.938612595728941 -> ("BY", ""),
    0.939840339757522 -> ("US", "NJ"),
    0.941020439355479 -> ("TJ", ""),
    0.942193326687277 -> ("AT", ""),
    0.94334786997651 -> ("HN", ""),
    0.944496804410674 -> ("US", "VA"),
    0.945625950375445 -> ("CH", ""),
    0.94671136443001 -> ("IL", ""),
    0.947765287540105 -> ("JO", ""),
    0.948811269523438 -> ("PG", ""),
    0.949813631981992 -> ("HK", ""),
    0.950796428412062 -> ("TG", ""),
    0.951779163715425 -> ("US", "WA"),
    0.952753989551823 -> ("BG", ""),
    0.953717892210131 -> ("PY", ""),
    0.954679973402213 -> ("LA", ""),
    0.955615796561938 -> ("US", "AZ"),
    0.956547008766939 -> ("US", "MA"),
    0.957470437870052 -> ("ER", ""),
    0.958377700740861 -> ("US", "IN"),
    0.959282307341019 -> ("US", "TN"),
    0.960163025596636 -> ("SV", ""),
    0.961029020402112 -> ("SL", ""),
    0.961894810309771 -> ("LY", ""),
    0.962752298772029 -> ("NI", ""),
    0.96358609885357 -> ("US", "MO"),
    0.964409308527525 -> ("US", "MD"),
    0.965200301411626 -> ("US", "WI"),
    0.965982549064951 -> ("KG", ""),
    0.966758518758758 -> ("DK", ""),
    0.967528614669414 -> ("SG", ""),
    0.968280993154781 -> ("US", "MN"),
    0.969029396759522 -> ("FI", ""),
    0.969777429903525 -> ("SK", ""),
    0.970525282819681 -> ("US", "CO"),
    0.971261748214062 -> ("TM", ""),
    0.971966602466387 -> ("NO", ""),
    0.972659228910298 -> ("LB", ""),
    0.973344732996389 -> ("CR", ""),
    0.974015776230482 -> ("US", "SC"),
    0.974681725526632 -> ("US", "AL"),
    0.975340013837253 -> ("CF", ""),
    0.975987854963177 -> ("IE", ""),
    0.976628060184709 -> ("CG", ""),
    0.977268208117086 -> ("US", "LA"),
    0.97789816899591 -> ("NZ", ""),
    0.978521608641886 -> ("PS", ""),
    0.979138829262165 -> ("LR", ""),
    0.979745312003251 -> ("US", "KY"),
    0.980335272442111 -> ("GE", ""),
    0.980918494415319 -> ("HR", ""),
    0.981488341015272 -> ("OM", ""),
    0.982047557735685 -> ("MR", ""),
    0.982599750778164 -> ("US", "OR"),
    0.983146309336215 -> ("PA", ""),
    0.98368237931884 -> ("US", "OK"),
    0.984205887626103 -> ("BA", ""),
    0.984710259436496 -> ("PR", ""),
    0.985202409743022 -> ("US", "CT"),
    0.985693533915791 -> ("KW", ""),
    0.986164569741957 -> ("MD", ""),
    0.986634669342706 -> ("UY", ""),
    0.987072832843053 -> ("AL", ""),
    0.987500980060873 -> ("US", "IA"),
    0.987912004947938 -> ("LT", ""),
    0.988322611816042 -> ("US", "UT"),
    0.988732727203491 -> ("US", "MS"),
    0.989142449790174 -> ("AM", ""),
    0.989550628721918 -> ("US", "AR"),
    0.989951248500294 -> ("MN", ""),
    0.990350304613644 -> ("US", "KS"),
    0.990746510522958 -> ("US", "NV"),
    0.991132085182176 -> ("JM", ""),
    0.99145997240244 -> ("NA", ""),
    0.991782127828943 -> ("QA", ""),
    0.992072701169136 -> ("LS", ""),
    0.99236178540244 -> ("MK", ""),
    0.992647560844348 -> ("US", "NM"),
    0.992932510664544 -> ("SI", ""),
    0.993214347271396 -> ("BW", ""),
    0.993492756259822 -> ("LV", ""),
    0.993762766493517 -> ("GM", ""),
    0.994022649566868 -> ("US", "NE"),
    0.994275397262137 -> ("US", "WV"),
    0.994520423941613 -> ("GW", ""),
    0.994760435215888 -> ("GA", ""),
    0.994987252304144 -> ("US", "ID"),
    0.995183461221741 -> ("US", "HI"),
    0.995369819008564 -> ("BH", ""),
    0.995554391100618 -> ("TT", ""),
    0.995736758108389 -> ("US", "NH"),
    0.995918949685252 -> ("US", "ME"),
    0.996095137002224 -> ("SZ", ""),
    0.996270599022036 -> ("EE", ""),
    0.996442409063738 -> ("MU", ""),
    0.996603129542097 -> ("TL", ""),
    0.996762757277775 -> ("CY", ""),
    0.996907528619579 -> ("US", "RI"),
    0.997049099854916 -> ("US", "MT"),
    0.997178745214878 -> ("US", "DE"),
    0.997302048199286 -> ("DJ", ""),
    0.997424726348139 -> ("RE", ""),
    0.99754707940159 -> ("FJ", ""),
    0.997664737211249 -> ("US", "SD"),
    0.997775424657524 -> ("GY", ""),
    0.997884982904382 -> ("CQ", ""),
    0.997991401075038 -> ("BT", ""),
    0.998096941679987 -> ("KM", ""),
    0.998200682610518 -> ("US", "ND"),
    0.998301888701479 -> ("US", "AK"),
    0.998394021176934 -> ("US", "DC"),
    0.99847982361182 -> ("US", "VT"),
    0.998565011216195 -> ("ME", ""),
    0.998647833518527 -> ("EH", ""),
    0.998728162646132 -> ("US", "WY"),
    0.998808269058716 -> ("SB", ""),
    0.998888366973866 -> ("MO", ""),
    0.998963535828716 -> ("SR", ""),
    0.999037992680778 -> ("LU", ""),
    0.999107659994934 -> ("CV", ""),
    0.999172099056859 -> ("GP", ""),
    0.999231202689231 -> ("MT", ""),
    0.999289936272032 -> ("BN", ""),
    0.999345538001954 -> ("MQ", ""),
    0.99939865368403 -> ("BS", ""),
    0.999447716912124 -> ("MV", ""),
    0.999495357094032 -> ("BZ", ""),
    0.999541507483773 -> ("IS", ""),
    0.99958090844343 -> ("BB", ""),
    0.999619662775724 -> ("PF", ""),
    0.999655830050344 -> ("VU", ""),
    0.999691895766914 -> ("NC", ""),
    0.999727767138931 -> ("GF", ""),
    0.999759837142455 -> ("YT", ""),
    0.999787629372926 -> ("ST", ""),
    0.999814112313189 -> ("WS", ""),
    0.999839458927155 -> ("LC", ""),
    0.999862742583285 -> ("GU", ""),
    0.999885283125052 -> ("CW", ""),
    0.99990027342205 -> ("VC", ""),
    0.999914925466328 -> ("VI", ""),
    0.999929548454862 -> ("GD", ""),
    0.999944128270945 -> ("TO", ""),
    0.999958595153382 -> ("KI", ""),
    0.999972911960159 -> ("FM", ""),
    0.999987150508304 -> ("AW", ""),
    1.0 -> ("SC", "")
  )

  def nextLocation() : (String, String) = {
    val testVal : Double = r.nextDouble()

    for ((key, value) <- locationList) { if (key >= testVal) { return value } }

    return ("All Other", "")
  }
}