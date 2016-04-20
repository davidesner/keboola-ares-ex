# ARES extractor

Keboola Connection docker app for retrieving data
about economic entities czech ARES register.

## Funcionality

Simple application to retrieve data from ARES registry. 

### API limits

ARES API contains limitations on number of requests send by
application per day. Currently the limits are following:

- 8AM – 6PM (UTC +1) : 1000 requests 
- 6PM – 8AM (UTC +1) : 5000 requests 

In order to fullfil these limits, simple limit check is
implemented in the app so the user has idea about how many requests
the app used so far.

Currently, there is no way of determining global number of requests send by the extractor therefore, the limits within the application are configuration-specific. That means you should be careful while using more than one extractor configuration – be aware of how many requests you have alredy sent across all configurations.

The in-app limits per configuration are following:

- 8AM – 6PM (UTC +1) : 900 requests 
- 6PM – 8AM (UTC +1) : 4500 requests 
- maximum number of rows in input table according to previous limits 

## Configuration
**NOTE:** Due to the limits applied, in order to run the extractor you need to request access for your project ID.

Configuration is simple. It takes just single required parameter:

- **aresColumns** –
	(REQ) list of ares fields to download. The names must match exactly
	supported fields listed below. To download all supported columns specify just single value `ALL`. 

`aresColumns` supported values are:       

    ALL, obchodniFirma, obec, okres, mestskaCast ,stat, ulice, psc, zahrPsc, pocetPrac, zanikl, platceDPH, datumVzniku, pravniForma, dic, nace, oboryCinnosti

## Input

Input table must contain just single column with ICO numbers, specified as primary key to avoid duplicates.

## Output

Application uploads table called `aresInfo` with all specified fields incrementally into desired bucket. Primary key is set to `ico` column.

If fields oboryCinnosti and nace are specified, app uploads incrementally two additional intersection tables

`oboryXico` and `naceXico`

Tables are uploaded to default bucket (`in.c-esnerda-ex-ares-CONFIGURATION_NAME`)

## Sample configurations / use cases

### Use case 1

Downloads all supported fields.

       {
       "aresColumns": [
              "ALL"
            ]
        }

### Use case 2

Downloads just two fields specified in aresColumns parameter.

    {
           "aresColumns": [
              "obchodniFirma",
              "obec"
            ]
        }
