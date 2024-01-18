/**
* Runtime Common Library
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: 1.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.piecesapp.client.models


import com.squareup.moshi.Json

/**
* **** TODO add more ENUMS
* Values: bATCHFILE,c,cOFFEESCRIPT,cPP,cSHARP,cSS,dART,eRLANG,gO,hASKELL,hTML,jAVA,jAVASCRIPT,lUA,mARKDOWN,mATLAB,oBJECTIVEC,pERL,pHP,pOWERSHELL,pYTHON,r,rUBY,rUST,sCALA,sHELLSCRIPT,sQL,sWIFT,tEX,tYPESCRIPT,tOML,yAML,jSON,xML,gROOVY,kOTLIN,eMACSLISP,cLOJURE,eLIXIR
*/

enum class TLPLanguageFamilyEnum(val value: kotlin.String){


    @Json(name = "BATCHFILE")
    bATCHFILE("BATCHFILE"),


    @Json(name = "C")
    c("C"),


    @Json(name = "COFFEESCRIPT")
    cOFFEESCRIPT("COFFEESCRIPT"),


    @Json(name = "CPP")
    cPP("CPP"),


    @Json(name = "CSHARP")
    cSHARP("CSHARP"),


    @Json(name = "CSS")
    cSS("CSS"),


    @Json(name = "DART")
    dART("DART"),


    @Json(name = "ERLANG")
    eRLANG("ERLANG"),


    @Json(name = "GO")
    gO("GO"),


    @Json(name = "HASKELL")
    hASKELL("HASKELL"),


    @Json(name = "HTML")
    hTML("HTML"),


    @Json(name = "JAVA")
    jAVA("JAVA"),


    @Json(name = "JAVASCRIPT")
    jAVASCRIPT("JAVASCRIPT"),


    @Json(name = "LUA")
    lUA("LUA"),


    @Json(name = "MARKDOWN")
    mARKDOWN("MARKDOWN"),


    @Json(name = "MATLAB")
    mATLAB("MATLAB"),


    @Json(name = "OBJECTIVEC")
    oBJECTIVEC("OBJECTIVEC"),


    @Json(name = "PERL")
    pERL("PERL"),


    @Json(name = "PHP")
    pHP("PHP"),


    @Json(name = "POWERSHELL")
    pOWERSHELL("POWERSHELL"),


    @Json(name = "PYTHON")
    pYTHON("PYTHON"),


    @Json(name = "R")
    r("R"),


    @Json(name = "RUBY")
    rUBY("RUBY"),


    @Json(name = "RUST")
    rUST("RUST"),


    @Json(name = "SCALA")
    sCALA("SCALA"),


    @Json(name = "SHELLSCRIPT")
    sHELLSCRIPT("SHELLSCRIPT"),


    @Json(name = "SQL")
    sQL("SQL"),


    @Json(name = "SWIFT")
    sWIFT("SWIFT"),


    @Json(name = "TEX")
    tEX("TEX"),


    @Json(name = "TYPESCRIPT")
    tYPESCRIPT("TYPESCRIPT"),


    @Json(name = "TOML")
    tOML("TOML"),


    @Json(name = "YAML")
    yAML("YAML"),


    @Json(name = "JSON")
    jSON("JSON"),


    @Json(name = "XML")
    xML("XML"),


    @Json(name = "GROOVY")
    gROOVY("GROOVY"),


    @Json(name = "KOTLIN")
    kOTLIN("KOTLIN"),


    @Json(name = "EMACSLISP")
    eMACSLISP("EMACSLISP"),


    @Json(name = "CLOJURE")
    cLOJURE("CLOJURE"),


    @Json(name = "ELIXIR")
    eLIXIR("ELIXIR");



    /**
    This override toString avoids using the enum var name and uses the actual api value instead.
    In cases the var name and value are different, the client would send incorrect enums to the server.
    **/
    override fun toString(): String {
        return value
    }

}
