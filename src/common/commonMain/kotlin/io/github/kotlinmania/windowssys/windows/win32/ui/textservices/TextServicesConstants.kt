package io.github.kotlinmania.windowssys.windows.win32.ui.textservices

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val ACC_CLIENT_DOC_MGR: Guid = Guid.fromU128(U128(0xfc48cc304f3e4fa1uL, 0x803bad0e196a83b1uL))

public val ACC_DICTIONARY: Guid = Guid.fromU128(U128(0x6572ee165fe54331uL, 0xbb6d76a49c56e423uL))

public val ACC_SERVER_DOC_MGR: Guid = Guid.fromU128(U128(0x6089a37eeb8a482duL, 0xbd6ff9f46904d16duL))

public val ACC_STORE: Guid = Guid.fromU128(U128(0x5440837f4bff4ae5uL, 0xa1b17722ecc6332auL))

public val CAND_CANCELED: TfCandidateResult = 2

public val CAND_FINALIZED: TfCandidateResult = 0

public val CAND_SELECTED: TfCandidateResult = 1

public val CLSID_TF_CATEGORY_MGR: Guid = Guid.fromU128(U128(0xa4b544a1438d4b41uL, 0x9325869523e2d6c7uL))

public val CLSID_TF_CLASSIC_LANG_BAR: Guid = Guid.fromU128(U128(0x3318360c1afc4d09uL, 0xa86b9f9cb6dceb9cuL))

public val CLSID_TF_DISPLAY_ATTRIBUTE_MGR: Guid = Guid.fromU128(U128(0x3ce74de453d34d74uL, 0x8b83431b3828ba53uL))

public val CLSID_TF_INPUT_PROCESSOR_PROFILES: Guid = Guid.fromU128(U128(0x33c53a50f4564884uL, 0xb04985fd643ecfeduL))

public val CLSID_TF_LANG_BAR_ITEM_MGR: Guid = Guid.fromU128(U128(0xb9931692a2b34fabuL, 0xbf339ec6f9fb96acuL))

public val CLSID_TF_LANG_BAR_MGR: Guid = Guid.fromU128(U128(0xebb08c456c4a4fdcuL, 0xae534eb8c4c7db8euL))

public val CLSID_TF_THREAD_MGR: Guid = Guid.fromU128(U128(0x529a9e6b65874f23uL, 0xab9e9c7d683e3c50uL))

public val CLSID_TF_TRANSITORY_EXTENSION_UI_ENTRY: Guid = Guid.fromU128(U128(0xae6be00807fb400duL, 0x8beb337a64f7051fuL))

public val CLSID_TSF_SERVICES: Guid = Guid.fromU128(U128(0x39aedc006b6046dbuL, 0x8d313642be0e4373uL))

public val DCM_FLAGS_CTFMON: UInt = 2u

public val DCM_FLAGS_LOCALTHREADTSF: UInt = 4u

public val DCM_FLAGS_TASKENG: UInt = 1u

public val DOC_WRAP: Guid = Guid.fromU128(U128(0xbf426f7e7a5e44d6uL, 0x830ca390ea9462a3uL))

public val GETIF_DICTGRAM: TfSapiObject = 4

public val GETIF_RECOCONTEXT: TfSapiObject = 1

public val GETIF_RECOGNIZER: TfSapiObject = 2

public val GETIF_RECOGNIZERNOINIT: TfSapiObject = 5

public val GETIF_RESMGR: TfSapiObject = 0

public val GETIF_VOICE: TfSapiObject = 3

public val GUID_APP_FUNCTIONPROVIDER: Guid = Guid.fromU128(U128(0x4caef01e12af4b0euL, 0x9db1a6ec5b881208uL))

public val GUID_COMPARTMENT_CONVERSIONMODEBIAS: Guid = Guid.fromU128(U128(0x5497f516ee91436euL, 0xb946aa2c05f1ac5buL))

public val GUID_COMPARTMENT_EMPTYCONTEXT: Guid = Guid.fromU128(U128(0xd7487dbf804e41c5uL, 0x894dad96fd4eea13uL))

public val GUID_COMPARTMENT_ENABLED_PROFILES_UPDATED: Guid = Guid.fromU128(U128(0x92c1fd48a9ae4a7cuL, 0xbe084329e4723817uL))

public val GUID_COMPARTMENT_HANDWRITING_OPENCLOSE: Guid = Guid.fromU128(U128(0xf9ae2c6b18664361uL, 0xaf727aa30948890euL))

public val GUID_COMPARTMENT_KEYBOARD_DISABLED: Guid = Guid.fromU128(U128(0x71a5b2531951466buL, 0x9fbc9c8808fa84f2uL))

public val GUID_COMPARTMENT_KEYBOARD_INPUTMODE: Guid = Guid.fromU128(U128(0xb6592511bcee4122uL, 0xa7c409f4b3fa4396uL))

public val GUID_COMPARTMENT_KEYBOARD_INPUTMODE_CONVERSION: Guid = Guid.fromU128(U128(0xccf05dd84a8711d7uL, 0xa6e200065b84435cuL))

public val GUID_COMPARTMENT_KEYBOARD_INPUTMODE_SENTENCE: Guid = Guid.fromU128(U128(0xccf05dd94a8711d7uL, 0xa6e200065b84435cuL))

public val GUID_COMPARTMENT_KEYBOARD_OPENCLOSE: Guid = Guid.fromU128(U128(0x58273aad01bb4164uL, 0x95c6755ba0b5162duL))

public val GUID_COMPARTMENT_SAPI_AUDIO: Guid = Guid.fromU128(U128(0x51af2086cc6b457duL, 0xb5aa8b19dc290ab4uL))

public val GUID_COMPARTMENT_SPEECH_CFGMENU: Guid = Guid.fromU128(U128(0xfb6c5c2d4e834bb6uL, 0x91a2e019bff6762duL))

public val GUID_COMPARTMENT_SPEECH_DISABLED: Guid = Guid.fromU128(U128(0x56c5c60707034e59uL, 0x8e52cbc84e8bbe35uL))

public val GUID_COMPARTMENT_SPEECH_GLOBALSTATE: Guid = Guid.fromU128(U128(0x2a54fe8e0d08460cuL, 0xa75d87035ff436c5uL))

public val GUID_COMPARTMENT_SPEECH_OPENCLOSE: Guid = Guid.fromU128(U128(0x544d6a63e2e84752uL, 0xbbd1000960bca083uL))

public val GUID_COMPARTMENT_SPEECH_UI_STATUS: Guid = Guid.fromU128(U128(0xd92016f093674fe7uL, 0x9abfbc59dacbe0e3uL))

public val GUID_COMPARTMENT_TIPUISTATUS: Guid = Guid.fromU128(U128(0x148ca3ec0366401cuL, 0x8d75ed978d85fbc9uL))

public val GUID_COMPARTMENT_TRANSITORYEXTENSION: Guid = Guid.fromU128(U128(0x8be347f5c7a011d7uL, 0xb40800065b84435cuL))

public val GUID_COMPARTMENT_TRANSITORYEXTENSION_DOCUMENTMANAGER: Guid = Guid.fromU128(U128(0x8be347f7c7a011d7uL, 0xb40800065b84435cuL))

public val GUID_COMPARTMENT_TRANSITORYEXTENSION_PARENT: Guid = Guid.fromU128(U128(0x8be347f8c7a011d7uL, 0xb40800065b84435cuL))

public val GUID_INTEGRATIONSTYLE_SEARCHBOX: Guid = Guid.fromU128(U128(0xe6d1bd1182f74903uL, 0xae211a6397cde2ebuL))

public val GUID_LBI_INPUTMODE: Guid = Guid.fromU128(U128(0x2c77a81e41cc4178uL, 0xa3a75f8a987568e6uL))

public val GUID_LBI_SAPILAYR_CFGMENUBUTTON: Guid = Guid.fromU128(U128(0xd02f24a1942d422euL, 0x8d99b4f2addee999uL))

public val GUID_MODEBIAS_CHINESE: Guid = Guid.fromU128(U128(0x7add26de4328489buL, 0x83ae6493750cad5cuL))

public val GUID_MODEBIAS_CONVERSATION: Guid = Guid.fromU128(U128(0xf4ec1041790443buL, 0x95f1e10f939d6546uL))

public val GUID_MODEBIAS_DATETIME: Guid = Guid.fromU128(U128(0xf2bdb3727f614039uL, 0x92ef1c35599f0222uL))

public val GUID_MODEBIAS_FILENAME: Guid = Guid.fromU128(U128(0xd7f707fe44c64fcauL, 0x8e7686ab50c7931buL))

public val GUID_MODEBIAS_FULLWIDTHALPHANUMERIC: Guid = Guid.fromU128(U128(0x81489fb8b36a473duL, 0x8146e4a2258b24aeuL))

public val GUID_MODEBIAS_FULLWIDTHHANGUL: Guid = Guid.fromU128(U128(0xc01ae6c945b54fd0uL, 0x9cb19f4cebc39feauL))

public val GUID_MODEBIAS_HALFWIDTHKATAKANA: Guid = Guid.fromU128(U128(0x5f6b6378d441ccuL, 0x8859485ca821a795uL))

public val GUID_MODEBIAS_HANGUL: Guid = Guid.fromU128(U128(0x76ef054123b34d77uL, 0xa074691801ccea17uL))

public val GUID_MODEBIAS_HIRAGANA: Guid = Guid.fromU128(U128(0xd73d316e9b9146f1uL, 0xa28031597f52c694uL))

public val GUID_MODEBIAS_KATAKANA: Guid = Guid.fromU128(U128(0x2e0eeddd3a1a499euL, 0x85433c7ee7949811uL))

public val GUID_MODEBIAS_NAME: Guid = Guid.fromU128(U128(0xfddc10f0d23949bfuL, 0xb8fc5410caaa427euL))

public val GUID_MODEBIAS_NONE: Guid = Guid.fromU128(U128(0x0uL, 0x0uL))

public val GUID_MODEBIAS_NUMERIC: Guid = Guid.fromU128(U128(0x4021766ce87248fduL, 0x9cee4ec5c75e16c3uL))

public val GUID_MODEBIAS_READING: Guid = Guid.fromU128(U128(0xe31643a364664cbfuL, 0x8d8b0bd4d8545461uL))

public val GUID_MODEBIAS_URLHISTORY: Guid = Guid.fromU128(U128(0x8b0e54d963f24c68uL, 0x84d479aee7a59f09uL))

public val GUID_PROP_ATTRIBUTE: Guid = Guid.fromU128(U128(0x34b45670752611d2uL, 0xa14700105a2799b5uL))

public val GUID_PROP_COMPOSING: Guid = Guid.fromU128(U128(0xe12ac060af1511d2uL, 0xafc500105a2799b5uL))

public val GUID_PROP_INPUTSCOPE: Guid = Guid.fromU128(U128(0x1713dd5a68e74a5buL, 0x9af6592a595c778duL))

public val GUID_PROP_LANGID: Guid = Guid.fromU128(U128(0x3280ce20803211d2uL, 0xb60300105a2799b5uL))

public val GUID_PROP_MODEBIAS: Guid = Guid.fromU128(U128(0x372e0716974f40acuL, 0xa08808cdc92ebfbcuL))

public val GUID_PROP_READING: Guid = Guid.fromU128(U128(0x5463f7c08e3111d2uL, 0xbf4600105a2799b5uL))

public val GUID_PROP_TEXTOWNER: Guid = Guid.fromU128(U128(0xf1e2d520096911d3uL, 0x8df000105a2799b5uL))

public val GUID_PROP_TKB_ALTERNATES: Guid = Guid.fromU128(U128(0x70b2a803968d462euL, 0xb93b2164c91517f7uL))

public val GUID_SYSTEM_FUNCTIONPROVIDER: Guid = Guid.fromU128(U128(0x9a698bb00f2111d3uL, 0x8df100105a2799b5uL))

public val GUID_TFCAT_CATEGORY_OF_TIP: Guid = Guid.fromU128(U128(0x534c48c106074098uL, 0xa5214fc899c73e90uL))

public val GUID_TFCAT_DISPLAYATTRIBUTEPROPERTY: Guid = Guid.fromU128(U128(0xb95f181bea4c4af1uL, 0x80567c321abbb091uL))

public val GUID_TFCAT_DISPLAYATTRIBUTEPROVIDER: Guid = Guid.fromU128(U128(0x46b8c80164740f7uL, 0x9b21b93b81aabc1buL))

public val GUID_TFCAT_PROPSTYLE_STATIC: Guid = Guid.fromU128(U128(0x565fb8d86bd44ca1uL, 0xb2230f2ccb8f4f96uL))

public val GUID_TFCAT_PROP_AUDIODATA: Guid = Guid.fromU128(U128(0x9b7be3a9e8ab4d47uL, 0xa8fe254fa423436duL))

public val GUID_TFCAT_PROP_INKDATA: Guid = Guid.fromU128(U128(0x7c6a82aeb0d74f14uL, 0xa74514f28b009d61uL))

public val GUID_TFCAT_TIPCAP_COMLESS: Guid = Guid.fromU128(U128(0x364215d975bc11d7uL, 0xa6ef00065b84435cuL))

public val GUID_TFCAT_TIPCAP_DUALMODE: Guid = Guid.fromU128(U128(0x3af314a2d79f4b1buL, 0x999215086d339b05uL))

public val GUID_TFCAT_TIPCAP_IMMERSIVEONLY: Guid = Guid.fromU128(U128(0x3a4259ac640d4ad4uL, 0x89f71eb67e7c4ee8uL))

public val GUID_TFCAT_TIPCAP_IMMERSIVESUPPORT: Guid = Guid.fromU128(U128(0x13a016df560b46cduL, 0x947a4c3af1e0e35duL))

public val GUID_TFCAT_TIPCAP_INPUTMODECOMPARTMENT: Guid = Guid.fromU128(U128(0xccf05dd74a8711d7uL, 0xa6e200065b84435cuL))

public val GUID_TFCAT_TIPCAP_LOCALSERVER: Guid = Guid.fromU128(U128(0x74769ee94a664f9duL, 0x90d6bf8b7c3eb461uL))

public val GUID_TFCAT_TIPCAP_SECUREMODE: Guid = Guid.fromU128(U128(0x49d2f9ce1f5e11d7uL, 0xa6d300065b84435cuL))

public val GUID_TFCAT_TIPCAP_SYSTRAYSUPPORT: Guid = Guid.fromU128(U128(0x25504fb47bab4bc1uL, 0x9c69cf81890f0ef5uL))

public val GUID_TFCAT_TIPCAP_TSF3: Guid = Guid.fromU128(U128(0x7dcb4af98de4548uL, 0xbef725bd45979a1fuL))

public val GUID_TFCAT_TIPCAP_UIELEMENTENABLED: Guid = Guid.fromU128(U128(0x49d2f9cf1f5e11d7uL, 0xa6d300065b84435cuL))

public val GUID_TFCAT_TIPCAP_WOW16: Guid = Guid.fromU128(U128(0x364215da75bc11d7uL, 0xa6ef00065b84435cuL))

public val GUID_TFCAT_TIP_HANDWRITING: Guid = Guid.fromU128(U128(0x246ecb87c2f24abeuL, 0x905bc8b38add2c43uL))

public val GUID_TFCAT_TIP_KEYBOARD: Guid = Guid.fromU128(U128(0x34745c63b2f04784uL, 0x8b675e12c8701a31uL))

public val GUID_TFCAT_TIP_SPEECH: Guid = Guid.fromU128(U128(0xb5a73cd18355426buL, 0xa161259808f26b14uL))

public val GUID_TFCAT_TRANSITORYEXTENSIONUI: Guid = Guid.fromU128(U128(0x6302de22a5cf4b02uL, 0xbfe84d72b2bed3c6uL))

public val GUID_TS_SERVICE_ACCESSIBLE: Guid = Guid.fromU128(U128(0xf9786200a5bf4a0fuL, 0x8c24fb16f5d1aabbuL))

public val GUID_TS_SERVICE_ACTIVEX: Guid = Guid.fromU128(U128(0xea937a50c9a64b7duL, 0x894a49d99b784834uL))

public val GUID_TS_SERVICE_DATAOBJECT: Guid = Guid.fromU128(U128(0x6086fbb5e22546ceuL, 0xa770c1bbd3e05d7buL))

public val GXFPF_NEAREST: UInt = 2u

public val GXFPF_ROUND_NEAREST: UInt = 1u

public val ILMCM_CHECKLAYOUTANDTIPENABLED: UInt = 1u

public val ILMCM_LANGUAGEBAROFF: UInt = 2u

public val IS_ADDRESS_CITY: InputScope = 17

public val IS_ADDRESS_COUNTRYNAME: InputScope = 18

public val IS_ADDRESS_COUNTRYSHORTNAME: InputScope = 19

public val IS_ADDRESS_FULLPOSTALADDRESS: InputScope = 13

public val IS_ADDRESS_POSTALCODE: InputScope = 14

public val IS_ADDRESS_STATEORPROVINCE: InputScope = 16

public val IS_ADDRESS_STREET: InputScope = 15

public val IS_ALPHANUMERIC_FULLWIDTH: InputScope = 41

public val IS_ALPHANUMERIC_HALFWIDTH: InputScope = 40

public val IS_ALPHANUMERIC_PIN: InputScope = 65

public val IS_ALPHANUMERIC_PIN_SET: InputScope = 66

public val IS_BOPOMOFO: InputScope = 43

public val IS_CHAT: InputScope = 58

public val IS_CHAT_WITHOUT_EMOJI: InputScope = 68

public val IS_CHINESE_FULLWIDTH: InputScope = 54

public val IS_CHINESE_HALFWIDTH: InputScope = 53

public val IS_CURRENCY_AMOUNT: InputScope = 21

public val IS_CURRENCY_AMOUNTANDSYMBOL: InputScope = 20

public val IS_CURRENCY_CHINESE: InputScope = 42

public val IS_DATE_DAY: InputScope = 24

public val IS_DATE_DAYNAME: InputScope = 27

public val IS_DATE_FULLDATE: InputScope = 22

public val IS_DATE_MONTH: InputScope = 23

public val IS_DATE_MONTHNAME: InputScope = 26

public val IS_DATE_YEAR: InputScope = 25

public val IS_DEFAULT: InputScope = 0

public val IS_DIGITS: InputScope = 28

public val IS_EMAILNAME_OR_ADDRESS: InputScope = 60

public val IS_EMAIL_SMTPEMAILADDRESS: InputScope = 5

public val IS_EMAIL_USERNAME: InputScope = 4

public val IS_ENUMSTRING: InputScope = -5

public val IS_FILE_FILENAME: InputScope = 3

public val IS_FILE_FULLFILEPATH: InputScope = 2

public val IS_FORMULA: InputScope = 51

public val IS_FORMULA_NUMBER: InputScope = 67

public val IS_HANGUL_FULLWIDTH: InputScope = 49

public val IS_HANGUL_HALFWIDTH: InputScope = 48

public val IS_HANJA: InputScope = 47

public val IS_HIRAGANA: InputScope = 44

public val IS_KATAKANA_FULLWIDTH: InputScope = 46

public val IS_KATAKANA_HALFWIDTH: InputScope = 45

public val IS_LOGINNAME: InputScope = 6

public val IS_MAPS: InputScope = 62

public val IS_NAME_OR_PHONENUMBER: InputScope = 59

public val IS_NATIVE_SCRIPT: InputScope = 55

public val IS_NUMBER: InputScope = 29

public val IS_NUMBER_FULLWIDTH: InputScope = 39

public val IS_NUMERIC_PASSWORD: InputScope = 63

public val IS_NUMERIC_PIN: InputScope = 64

public val IS_ONECHAR: InputScope = 30

public val IS_PASSWORD: InputScope = 31

public val IS_PERSONALNAME_FULLNAME: InputScope = 7

public val IS_PERSONALNAME_GIVENNAME: InputScope = 9

public val IS_PERSONALNAME_MIDDLENAME: InputScope = 10

public val IS_PERSONALNAME_PREFIX: InputScope = 8

public val IS_PERSONALNAME_SUFFIX: InputScope = 12

public val IS_PERSONALNAME_SURNAME: InputScope = 11

public val IS_PHRASELIST: InputScope = -1

public val IS_PRIVATE: InputScope = 61

public val IS_REGULAREXPRESSION: InputScope = -2

public val IS_SEARCH: InputScope = 50

public val IS_SEARCH_INCREMENTAL: InputScope = 52

public val IS_SRGS: InputScope = -3

public val IS_TELEPHONE_AREACODE: InputScope = 34

public val IS_TELEPHONE_COUNTRYCODE: InputScope = 33

public val IS_TELEPHONE_FULLTELEPHONENUMBER: InputScope = 32

public val IS_TELEPHONE_LOCALNUMBER: InputScope = 35

public val IS_TEXT: InputScope = 57

public val IS_TIME_FULLTIME: InputScope = 36

public val IS_TIME_HOUR: InputScope = 37

public val IS_TIME_MINORSEC: InputScope = 38

public val IS_URL: InputScope = 1

public val IS_XML: InputScope = -4

public val IS_YOMI: InputScope = 56

public val LIBID_MSAATEXT_LIB: Guid = Guid.fromU128(U128(0x150e2d7adac14582uL, 0x947d2a8fd78b82cduL))

public val MSAA_CONTROL: Guid = Guid.fromU128(U128(0x8cd963f7a3e4f5cuL, 0x9bd8d692bb043c5buL))

public val STYLE_ACTIVE_SELECTION: TfIntegratableCandidateListSelectionStyle = 0

public val STYLE_IMPLIED_SELECTION: TfIntegratableCandidateListSelectionStyle = 1

public val TF_AE_END: TfActiveSelEnd = 2

public val TF_AE_NONE: TfActiveSelEnd = 0

public val TF_AE_START: TfActiveSelEnd = 1

public val TF_ANCHOR_END: TfAnchor = 1

public val TF_ANCHOR_START: TfAnchor = 0

public val TF_ATTR_CONVERTED: TfDaAttrInfo = 2

public val TF_ATTR_FIXEDCONVERTED: TfDaAttrInfo = 5

public val TF_ATTR_INPUT: TfDaAttrInfo = 0

public val TF_ATTR_INPUT_ERROR: TfDaAttrInfo = 4

public val TF_ATTR_OTHER: TfDaAttrInfo = -1

public val TF_ATTR_TARGET_CONVERTED: TfDaAttrInfo = 1

public val TF_ATTR_TARGET_NOTCONVERTED: TfDaAttrInfo = 3

public val TF_CHAR_EMBEDDED: UInt = 65532u

public val TF_CLUIE_COUNT: UInt = 2u

public val TF_CLUIE_CURRENTPAGE: UInt = 32u

public val TF_CLUIE_DOCUMENTMGR: UInt = 1u

public val TF_CLUIE_PAGEINDEX: UInt = 16u

public val TF_CLUIE_SELECTION: UInt = 4u

public val TF_CLUIE_STRING: UInt = 8u

public val TF_COMMANDING_ENABLED: UInt = 4u

public val TF_COMMANDING_ON: UInt = 8u

public val TF_CONVERSIONMODE_ALPHANUMERIC: UInt = 0u

public val TF_CONVERSIONMODE_CHARCODE: UInt = 32u

public val TF_CONVERSIONMODE_EUDC: UInt = 512u

public val TF_CONVERSIONMODE_FIXED: UInt = 2048u

public val TF_CONVERSIONMODE_FULLSHAPE: UInt = 8u

public val TF_CONVERSIONMODE_KATAKANA: UInt = 2u

public val TF_CONVERSIONMODE_NATIVE: UInt = 1u

public val TF_CONVERSIONMODE_NOCONVERSION: UInt = 256u

public val TF_CONVERSIONMODE_ROMAN: UInt = 16u

public val TF_CONVERSIONMODE_SOFTKEYBOARD: UInt = 128u

public val TF_CONVERSIONMODE_SYMBOL: UInt = 1024u

public val TF_CT_COLORREF: TfDaColortype = 2

public val TF_CT_NONE: TfDaColortype = 0

public val TF_CT_SYSCOLOR: TfDaColortype = 1

public val TF_DEFAULT_SELECTION: UInt = 4294967295u

public val TF_DICTATION_ENABLED: UInt = 2u

public val TF_DICTATION_ON: UInt = 1u

public val TF_DISABLE_BALLOON: UInt = 2u

public val TF_DISABLE_COMMANDING: UInt = 4u

public val TF_DISABLE_DICTATION: UInt = 2u

public val TF_DISABLE_SPEECH: UInt = 1u

public val TF_DTLBI_NONE: LangBarItemIconModeFlags = 0u

public val TF_DTLBI_USEPROFILEICON: LangBarItemIconModeFlags = 1u

public val TF_ENABLE_PROCESS_ATOM: Pcwstr = w("_CTF_ENABLE_PROCESS_ATOM_")

public val TF_ES_ASYNC: TfContextEditContextFlags = 8u

public val TF_ES_ASYNCDONTCARE: TfContextEditContextFlags = 0u

public val TF_ES_READ: TfContextEditContextFlags = 2u

public val TF_ES_READWRITE: TfContextEditContextFlags = 6u

public val TF_ES_SYNC: TfContextEditContextFlags = 1u

public val TF_E_ALREADY_EXISTS: Hresult = 0x80040506u.toInt()

public val TF_E_COMPOSITION_REJECTED: Hresult = 0x80040508u.toInt()

public val TF_E_DISCONNECTED: Hresult = 0x80040504u.toInt()

public val TF_E_EMPTYCONTEXT: Hresult = 0x80040509u.toInt()

public val TF_E_FORMAT: Hresult = 0x8004020Au.toInt()

public val TF_E_INVALIDPOINT: Hresult = 0x80040207u.toInt()

public val TF_E_INVALIDPOS: Hresult = 0x80040200u.toInt()

public val TF_E_INVALIDVIEW: Hresult = 0x80040505u.toInt()

public val TF_E_LOCKED: Hresult = 0x80040500u.toInt()

public val TF_E_NOCONVERSION: Hresult = 0x80040600u.toInt()

public val TF_E_NOINTERFACE: Hresult = 0x80040204u.toInt()

public val TF_E_NOLAYOUT: Hresult = 0x80040206u.toInt()

public val TF_E_NOLOCK: Hresult = 0x80040201u.toInt()

public val TF_E_NOOBJECT: Hresult = 0x80040202u.toInt()

public val TF_E_NOPROVIDER: Hresult = 0x80040503u.toInt()

public val TF_E_NOSELECTION: Hresult = 0x80040205u.toInt()

public val TF_E_NOSERVICE: Hresult = 0x80040203u.toInt()

public val TF_E_NOTOWNEDRANGE: Hresult = 0x80040502u.toInt()

public val TF_E_RANGE_NOT_COVERED: Hresult = 0x80040507u.toInt()

public val TF_E_READONLY: Hresult = 0x80040209u.toInt()

public val TF_E_STACKFULL: Hresult = 0x80040501u.toInt()

public val TF_E_SYNCHRONOUS: Hresult = 0x80040208u.toInt()

public val TF_FLOATINGLANGBAR_WNDTITLE: Pcwstr = w("TF_FloatingLangBar_WndTitle")

public val TF_FLOATINGLANGBAR_WNDTITLEA: Pcstr = s("TF_FloatingLangBar_WndTitle")

public val TF_FLOATINGLANGBAR_WNDTITLEW: Pcwstr = w("TF_FloatingLangBar_WndTitle")

public val TF_GRAVITY_BACKWARD: TfGravity = 0

public val TF_GRAVITY_FORWARD: TfGravity = 1

public val TF_GTP_INCL_TEXT: GetTextAndPropertyUpdatesFlags = 1u

public val TF_GTP_NONE: GetTextAndPropertyUpdatesFlags = 0u

public val TF_HF_OBJECT: UInt = 1u

public val TF_IAS_NOQUERY: InsertTextAtSelectionFlags = 1u

public val TF_IAS_NO_DEFAULT_COMPOSITION: InsertTextAtSelectionFlags = 2147483648u

public val TF_IAS_QUERYONLY: InsertTextAtSelectionFlags = 2u

public val TF_IE_CORRECTION: UInt = 1u

public val TF_INVALID_COOKIE: UInt = 4294967295u

public val TF_INVALID_EDIT_COOKIE: UInt = 0u

public val TF_IPPMF_DISABLEPROFILE: UInt = 2u

public val TF_IPPMF_DONTCARECURRENTINPUTLANGUAGE: UInt = 4u

public val TF_IPPMF_ENABLEPROFILE: UInt = 1u

public val TF_IPPMF_FORPROCESS: UInt = 268435456u

public val TF_IPPMF_FORSESSION: UInt = 536870912u

public val TF_IPPMF_FORSYSTEMALL: UInt = 1073741824u

public val TF_IPP_CAPS_COMLESSSUPPORT: UInt = 8u

public val TF_IPP_CAPS_DISABLEONTRANSITORY: UInt = 1u

public val TF_IPP_CAPS_IMMERSIVESUPPORT: UInt = 65536u

public val TF_IPP_CAPS_SECUREMODESUPPORT: UInt = 2u

public val TF_IPP_CAPS_SYSTRAYSUPPORT: UInt = 131072u

public val TF_IPP_CAPS_UIELEMENTENABLED: UInt = 4u

public val TF_IPP_CAPS_WOW16SUPPORT: UInt = 16u

public val TF_IPP_FLAG_ACTIVE: UInt = 1u

public val TF_IPP_FLAG_ENABLED: UInt = 2u

public val TF_IPP_FLAG_SUBSTITUTEDBYINPUTPROCESSOR: UInt = 4u

public val TF_IPSINK_FLAG_ACTIVE: UInt = 1u

public val TF_LBI_BALLOON: UInt = 16u

public val TF_LBI_BITMAP: UInt = 8u

public val TF_LBI_BMPF_VERTICAL: UInt = 1u

public val TF_LBI_CLK_LEFT: TfLBIClick = 2

public val TF_LBI_CLK_RIGHT: TfLBIClick = 1

public val TF_LBI_CUSTOMUI: UInt = 32u

public val TF_LBI_DESC_MAXLEN: UInt = 32u

public val TF_LBI_ICON: UInt = 1u

public val TF_LBI_STATUS: UInt = 65536u

public val TF_LBI_STATUS_BTN_TOGGLED: UInt = 65536u

public val TF_LBI_STATUS_DISABLED: UInt = 2u

public val TF_LBI_STATUS_HIDDEN: UInt = 1u

public val TF_LBI_STYLE_BTN_BUTTON: UInt = 65536u

public val TF_LBI_STYLE_BTN_MENU: UInt = 131072u

public val TF_LBI_STYLE_BTN_TOGGLE: UInt = 262144u

public val TF_LBI_STYLE_HIDDENBYDEFAULT: UInt = 16u

public val TF_LBI_STYLE_HIDDENSTATUSCONTROL: UInt = 1u

public val TF_LBI_STYLE_HIDEONNOOTHERITEMS: UInt = 4u

public val TF_LBI_STYLE_SHOWNINTRAY: UInt = 2u

public val TF_LBI_STYLE_SHOWNINTRAYONLY: UInt = 8u

public val TF_LBI_STYLE_TEXTCOLORICON: UInt = 32u

public val TF_LBI_TEXT: UInt = 2u

public val TF_LBI_TOOLTIP: UInt = 4u

public val TF_LBMENUF_CHECKED: UInt = 1u

public val TF_LBMENUF_GRAYED: UInt = 16u

public val TF_LBMENUF_RADIOCHECKED: UInt = 8u

public val TF_LBMENUF_SEPARATOR: UInt = 4u

public val TF_LBMENUF_SUBMENU: UInt = 2u

public val TF_LB_BALLOON_MISS: TfLBBalloonStyle = 2

public val TF_LB_BALLOON_RECO: TfLBBalloonStyle = 0

public val TF_LB_BALLOON_SHOW: TfLBBalloonStyle = 1

public val TF_LC_CHANGE: TfLayoutCode = 1

public val TF_LC_CREATE: TfLayoutCode = 0

public val TF_LC_DESTROY: TfLayoutCode = 2

public val TF_LS_DASH: TfDaLinestyle = 3

public val TF_LS_DOT: TfDaLinestyle = 2

public val TF_LS_NONE: TfDaLinestyle = 0

public val TF_LS_SOLID: TfDaLinestyle = 1

public val TF_LS_SQUIGGLE: TfDaLinestyle = 4

public val TF_MENUREADY: UInt = 1u

public val TF_MOD_ALT: UInt = 1u

public val TF_MOD_CONTROL: UInt = 2u

public val TF_MOD_IGNORE_ALL_MODIFIER: UInt = 1024u

public val TF_MOD_LALT: UInt = 64u

public val TF_MOD_LCONTROL: UInt = 128u

public val TF_MOD_LSHIFT: UInt = 256u

public val TF_MOD_ON_KEYUP: UInt = 512u

public val TF_MOD_RALT: UInt = 8u

public val TF_MOD_RCONTROL: UInt = 16u

public val TF_MOD_RSHIFT: UInt = 32u

public val TF_MOD_SHIFT: UInt = 4u

public val TF_POPF_ALL: UInt = 1u

public val TF_PROCESS_ATOM: Pcwstr = w("_CTF_PROCESS_ATOM_")

public val TF_PROFILETYPE_INPUTPROCESSOR: UInt = 1u

public val TF_PROFILETYPE_KEYBOARDLAYOUT: UInt = 2u

public val TF_PROFILE_ARRAY: Guid = Guid.fromU128(U128(0xd38eff65aa464fd5uL, 0x91a767845fb02f5buL))

public val TF_PROFILE_CANTONESE: Guid = Guid.fromU128(U128(0xaec109c7e9611d4uL, 0xb2ef0080c882687euL))

public val TF_PROFILE_CHANGJIE: Guid = Guid.fromU128(U128(0x4bdf9f03c7d311d4uL, 0xb2ab0080c882687euL))

public val TF_PROFILE_DAYI: Guid = Guid.fromU128(U128(0x37b2c25480c4d7fuL, 0xb027d6ca6b69788auL))

public val TF_PROFILE_NEWCHANGJIE: Guid = Guid.fromU128(U128(0xf3ba907a6c7e11d4uL, 0x97fa0080c882687euL))

public val TF_PROFILE_NEWPHONETIC: Guid = Guid.fromU128(U128(0xb2f9c502174211d4uL, 0x97900080c882687euL))

public val TF_PROFILE_NEWQUICK: Guid = Guid.fromU128(U128(0xb883ba0c1c711d4uL, 0x87f90080c882687euL))

public val TF_PROFILE_PHONETIC: Guid = Guid.fromU128(U128(0x761309de317a11d4uL, 0x9b5d0080c882687euL))

public val TF_PROFILE_PINYIN: Guid = Guid.fromU128(U128(0xf3ba90776c7e11d4uL, 0x97fa0080c882687euL))

public val TF_PROFILE_QUICK: Guid = Guid.fromU128(U128(0x6024b45f5c5411d4uL, 0xb9210080c882687euL))

public val TF_PROFILE_SIMPLEFAST: Guid = Guid.fromU128(U128(0xfa550b045ad7411fuL, 0xa5acca038ec515d7uL))

public val TF_PROFILE_TIGRINYA: Guid = Guid.fromU128(U128(0x3cab88b7cc3e46a6uL, 0x9765b772ad7761ffuL))

public val TF_PROFILE_WUBI: Guid = Guid.fromU128(U128(0x82590c13f4dd44f4uL, 0xba1d8667246fdf8euL))

public val TF_PROFILE_YI: Guid = Guid.fromU128(U128(0x409c8376007b4357uL, 0xae8e26316ee3fb0duL))

public val TF_PROPUI_STATUS_SAVETOFILE: UInt = 1u

public val TF_RCM_COMLESS: UInt = 1u

public val TF_RCM_HINT_COLLISION: UInt = 8u

public val TF_RCM_HINT_READING_LENGTH: UInt = 4u

public val TF_RCM_VKEY: UInt = 2u

public val TF_RIP_FLAG_FREEUNUSEDLIBRARIES: UInt = 1u

public val TF_RIUIE_CONTEXT: UInt = 1u

public val TF_RIUIE_ERRORINDEX: UInt = 8u

public val TF_RIUIE_MAXREADINGSTRINGLENGTH: UInt = 4u

public val TF_RIUIE_STRING: UInt = 2u

public val TF_RIUIE_VERTICALORDER: UInt = 16u

public val TF_RP_HIDDENINSETTINGUI: UInt = 2u

public val TF_RP_LOCALPROCESS: UInt = 4u

public val TF_RP_LOCALTHREAD: UInt = 8u

public val TF_RP_SUBITEMINSETTINGUI: UInt = 16u

public val TF_SD_BACKWARD: TfShiftDir = 0

public val TF_SD_FORWARD: TfShiftDir = 1

public val TF_SD_LOADING: UInt = 2u

public val TF_SD_READONLY: UInt = 1u

public val TF_SENTENCEMODE_AUTOMATIC: UInt = 4u

public val TF_SENTENCEMODE_CONVERSATION: UInt = 16u

public val TF_SENTENCEMODE_NONE: UInt = 0u

public val TF_SENTENCEMODE_PHRASEPREDICT: UInt = 8u

public val TF_SENTENCEMODE_PLAURALCLAUSE: UInt = 1u

public val TF_SENTENCEMODE_SINGLECONVERT: UInt = 2u

public val TF_SFT_DESKBAND: UInt = 2048u

public val TF_SFT_DOCK: UInt = 2u

public val TF_SFT_EXTRAICONSONMINIMIZED: UInt = 512u

public val TF_SFT_HIDDEN: UInt = 8u

public val TF_SFT_HIGHTRANSPARENCY: UInt = 64u

public val TF_SFT_LABELS: UInt = 128u

public val TF_SFT_LOWTRANSPARENCY: UInt = 32u

public val TF_SFT_MINIMIZED: UInt = 4u

public val TF_SFT_NOEXTRAICONSONMINIMIZED: UInt = 1024u

public val TF_SFT_NOLABELS: UInt = 256u

public val TF_SFT_NOTRANSPARENCY: UInt = 16u

public val TF_SFT_SHOWNORMAL: UInt = 1u

public val TF_SHOW_BALLOON: UInt = 1u

public val TF_SPEECHUI_SHOWN: UInt = 16u

public val TF_SS_DISJOINTSEL: UInt = 1u

public val TF_SS_REGIONS: UInt = 2u

public val TF_SS_TKBAUTOCORRECTENABLE: UInt = 16u

public val TF_SS_TKBPREDICTIONENABLE: UInt = 32u

public val TF_SS_TRANSITORY: UInt = 4u

public val TF_ST_CORRECTION: UInt = 1u

public val TF_S_ASYNC: Hresult = 0x40300u.toInt()

public val TF_TF_IGNOREEND: UInt = 2u

public val TF_TF_MOVESTART: UInt = 1u

public val TF_TMAE_COMLESS: UInt = 8u

public val TF_TMAE_CONSOLE: UInt = 64u

public val TF_TMAE_NOACTIVATEKEYBOARDLAYOUT: UInt = 32u

public val TF_TMAE_NOACTIVATETIP: UInt = 1u

public val TF_TMAE_SECUREMODE: UInt = 2u

public val TF_TMAE_UIELEMENTENABLEDONLY: UInt = 4u

public val TF_TMAE_WOW16: UInt = 16u

public val TF_TMF_ACTIVATED: UInt = 2147483648u

public val TF_TMF_COMLESS: UInt = 8u

public val TF_TMF_CONSOLE: UInt = 64u

public val TF_TMF_IMMERSIVEMODE: UInt = 1073741824u

public val TF_TMF_NOACTIVATETIP: UInt = 1u

public val TF_TMF_SECUREMODE: UInt = 2u

public val TF_TMF_UIELEMENTENABLEDONLY: UInt = 4u

public val TF_TMF_WOW16: UInt = 16u

public val TF_TRANSITORYEXTENSION_ATSELECTION: UInt = 2u

public val TF_TRANSITORYEXTENSION_FLOATING: UInt = 1u

public val TF_TRANSITORYEXTENSION_NONE: UInt = 0u

public val TF_TU_CORRECTION: UInt = 1u

public val TF_URP_ALLPROFILES: UInt = 2u

public val TF_URP_LOCALPROCESS: UInt = 4u

public val TF_URP_LOCALTHREAD: UInt = 8u

public val TF_US_HIDETIPUI: UInt = 1u

public val TKBLT_CLASSIC: TKBLayoutType = 1

public val TKBLT_OPTIMIZED: TKBLayoutType = 2

public val TKBLT_UNDEFINED: TKBLayoutType = 0

public val TKBL_CLASSIC_TRADITIONAL_CHINESE_CHANGJIE: UInt = 61506u

public val TKBL_CLASSIC_TRADITIONAL_CHINESE_DAYI: UInt = 61507u

public val TKBL_CLASSIC_TRADITIONAL_CHINESE_PHONETIC: UInt = 1028u

public val TKBL_OPT_JAPANESE_ABC: UInt = 1041u

public val TKBL_OPT_KOREAN_HANGUL_2_BULSIK: UInt = 1042u

public val TKBL_OPT_SIMPLIFIED_CHINESE_PINYIN: UInt = 2052u

public val TKBL_OPT_TRADITIONAL_CHINESE_PHONETIC: UInt = 1028u

public val TKBL_UNDEFINED: UInt = 0u

public val TKB_ALTERNATES_AUTOCORRECTION_APPLIED: UInt = 4u

public val TKB_ALTERNATES_FOR_AUTOCORRECTION: UInt = 2u

public val TKB_ALTERNATES_FOR_PREDICTION: UInt = 3u

public val TKB_ALTERNATES_STANDARD: UInt = 1u

public val TSATTRID_APP: Guid = Guid.fromU128(U128(0xa80f77df423740e5uL, 0x849cb5fa51c13ac7uL))

public val TSATTRID_APP_INCORRECT_GRAMMAR: Guid = Guid.fromU128(U128(0xbd54e398ad034b74uL, 0xb6b35edb19996388uL))

public val TSATTRID_APP_INCORRECT_SPELLING: Guid = Guid.fromU128(U128(0xf42de43cef12430duL, 0x944c9a08970a25d2uL))

public val TSATTRID_FONT: Guid = Guid.fromU128(U128(0x573ea825749b4f8auL, 0x9cfd21c3605ca828uL))

public val TSATTRID_FONT_FACE_NAME: Guid = Guid.fromU128(U128(0xb536aeb6053b4eb8uL, 0xb65a50da1e81e72euL))

public val TSATTRID_FONT_SIZE_PTS: Guid = Guid.fromU128(U128(0xc8493302a5e9456duL, 0xaf048005e4130f03uL))

public val TSATTRID_FONT_STYLE: Guid = Guid.fromU128(U128(0x68b2a77f6b0e4f28uL, 0x8177571c2f3a42b1uL))

public val TSATTRID_FONT_STYLE_ANIMATION: Guid = Guid.fromU128(U128(0xdcf73d22e02947b7uL, 0xbb36f263a3d004ccuL))

public val TSATTRID_FONT_STYLE_ANIMATION_BLINKING_BACKGROUND: Guid = Guid.fromU128(U128(0x86e5b10401044b10uL, 0xb58500f2527522b5uL))

public val TSATTRID_FONT_STYLE_ANIMATION_LAS_VEGAS_LIGHTS: Guid = Guid.fromU128(U128(0xf40423d50f874f8fuL, 0xbadae6d60c25e152uL))

public val TSATTRID_FONT_STYLE_ANIMATION_MARCHING_BLACK_ANTS: Guid = Guid.fromU128(U128(0x7644e067f1864902uL, 0xbfc6ec815aa20e9duL))

public val TSATTRID_FONT_STYLE_ANIMATION_MARCHING_RED_ANTS: Guid = Guid.fromU128(U128(0x78368dad50fb4c6fuL, 0x840bd486bb6cf781uL))

public val TSATTRID_FONT_STYLE_ANIMATION_SHIMMER: Guid = Guid.fromU128(U128(0x2ce31b5852934c36uL, 0x8809bf8bb51a27b3uL))

public val TSATTRID_FONT_STYLE_ANIMATION_SPARKLE_TEXT: Guid = Guid.fromU128(U128(0x533aad20962c4e9fuL, 0x8c09b42ea4749711uL))

public val TSATTRID_FONT_STYLE_ANIMATION_WIPE_DOWN: Guid = Guid.fromU128(U128(0x5872e874367b4803uL, 0xb160c90ff62569d0uL))

public val TSATTRID_FONT_STYLE_ANIMATION_WIPE_RIGHT: Guid = Guid.fromU128(U128(0xb855cbe33d2c4600uL, 0xb1e9e1c9ce02f842uL))

public val TSATTRID_FONT_STYLE_BACKGROUND_COLOR: Guid = Guid.fromU128(U128(0xb50eaa4e30914468uL, 0x81dbd79ea190c7c7uL))

public val TSATTRID_FONT_STYLE_BLINK: Guid = Guid.fromU128(U128(0xbfb2c0367acf4532uL, 0xb720b416dd7765a8uL))

public val TSATTRID_FONT_STYLE_BOLD: Guid = Guid.fromU128(U128(0x48813a438a204940uL, 0x8e5897823f7b268auL))

public val TSATTRID_FONT_STYLE_CAPITALIZE: Guid = Guid.fromU128(U128(0x7d85a3bab4fd43b3uL, 0xbefc6b985c843141uL))

public val TSATTRID_FONT_STYLE_COLOR: Guid = Guid.fromU128(U128(0x857a7a37b8af4e9auL, 0x81b4acf700c8411buL))

public val TSATTRID_FONT_STYLE_EMBOSS: Guid = Guid.fromU128(U128(0xbd8ed742349e4e37uL, 0x82fb437979cb53a7uL))

public val TSATTRID_FONT_STYLE_ENGRAVE: Guid = Guid.fromU128(U128(0x9c3371de83324897uL, 0xbe5d89233223179auL))

public val TSATTRID_FONT_STYLE_HEIGHT: Guid = Guid.fromU128(U128(0x7e93747712e6458buL, 0x926a1fa44ee8f391uL))

public val TSATTRID_FONT_STYLE_HIDDEN: Guid = Guid.fromU128(U128(0xb1e28770881c475fuL, 0x863f887a647b1090uL))

public val TSATTRID_FONT_STYLE_ITALIC: Guid = Guid.fromU128(U128(0x8740682aa76548e1uL, 0xacfcd22222b2f810uL))

public val TSATTRID_FONT_STYLE_KERNING: Guid = Guid.fromU128(U128(0xcc26e1b42f9a47c8uL, 0x8bffbf1eb7cce0dduL))

public val TSATTRID_FONT_STYLE_LOWERCASE: Guid = Guid.fromU128(U128(0x76d8ccb5ca7b4498uL, 0x8ee9d5c4f6f74c60uL))

public val TSATTRID_FONT_STYLE_OUTLINED: Guid = Guid.fromU128(U128(0x10e6db31db0d4ac6uL, 0xa7f59c9cff6f2ab4uL))

public val TSATTRID_FONT_STYLE_OVERLINE: Guid = Guid.fromU128(U128(0xe3989f4a992b4301uL, 0x8ce1a5b7c6d1f3c8uL))

public val TSATTRID_FONT_STYLE_OVERLINE_DOUBLE: Guid = Guid.fromU128(U128(0xdc46063ae11546e3uL, 0xbcd8ca6772aa95b4uL))

public val TSATTRID_FONT_STYLE_OVERLINE_SINGLE: Guid = Guid.fromU128(U128(0x8440d94c51ce47b2uL, 0x8d4c15751e5f721buL))

public val TSATTRID_FONT_STYLE_POSITION: Guid = Guid.fromU128(U128(0x15cd26abf2fb4062uL, 0xb5a69a49e1a5cc0buL))

public val TSATTRID_FONT_STYLE_PROTECTED: Guid = Guid.fromU128(U128(0x1c557cb214cf4554uL, 0xa574ecb2f7e7efd4uL))

public val TSATTRID_FONT_STYLE_SHADOW: Guid = Guid.fromU128(U128(0x5f686d2fc6cd4c56uL, 0x8a1a994a4b9766beuL))

public val TSATTRID_FONT_STYLE_SMALL_CAPS: Guid = Guid.fromU128(U128(0xfacb6bc691004cc6uL, 0xb96911eea45a86b4uL))

public val TSATTRID_FONT_STYLE_SPACING: Guid = Guid.fromU128(U128(0x98c1200d8f06409auL, 0x8e496a554bf7c153uL))

public val TSATTRID_FONT_STYLE_STRIKETHROUGH: Guid = Guid.fromU128(U128(0xc5621932d084668uL, 0x9601ced41309d7afuL))

public val TSATTRID_FONT_STYLE_STRIKETHROUGH_DOUBLE: Guid = Guid.fromU128(U128(0x62489b31a3e74f94uL, 0xac43ebaf8fcc7a9fuL))

public val TSATTRID_FONT_STYLE_STRIKETHROUGH_SINGLE: Guid = Guid.fromU128(U128(0x75d736b63c8f4b97uL, 0xab781877cb990d31uL))

public val TSATTRID_FONT_STYLE_SUBSCRIPT: Guid = Guid.fromU128(U128(0x5774fb84389b43bcuL, 0xa74b1568347cf0f4uL))

public val TSATTRID_FONT_STYLE_SUPERSCRIPT: Guid = Guid.fromU128(U128(0x2ea4993c563c49aauL, 0x93720bef09a9255buL))

public val TSATTRID_FONT_STYLE_UNDERLINE: Guid = Guid.fromU128(U128(0xc3c9c9f37902444buL, 0x9a7b48e70f4b50f7uL))

public val TSATTRID_FONT_STYLE_UNDERLINE_DOUBLE: Guid = Guid.fromU128(U128(0x74d24aa61db34c69uL, 0xa17631120e7586d5uL))

public val TSATTRID_FONT_STYLE_UNDERLINE_SINGLE: Guid = Guid.fromU128(U128(0x1b6720e50f734951uL, 0xa6b36f19e43c9461uL))

public val TSATTRID_FONT_STYLE_UPPERCASE: Guid = Guid.fromU128(U128(0x33a300e8e3404937uL, 0xb6978f234045cd9auL))

public val TSATTRID_FONT_STYLE_WEIGHT: Guid = Guid.fromU128(U128(0x12f3189c8bb0461buL, 0xb1faeaf907047fe0uL))

public val TSATTRID_LIST: Guid = Guid.fromU128(U128(0x436d673b26f14aeeuL, 0x9e658f83a4ed4884uL))

public val TSATTRID_LIST_LEVEL_INDEL: Guid = Guid.fromU128(U128(0x7f7cc899311f487buL, 0xad5de2a459e12d42uL))

public val TSATTRID_LIST_TYPE: Guid = Guid.fromU128(U128(0xae3e665e4bce49e3uL, 0xa0fe2db47d3a17aeuL))

public val TSATTRID_LIST_TYPE_ARABIC: Guid = Guid.fromU128(U128(0x1338c5d698a34fa3uL, 0x9bd17a60eef8e9e0uL))

public val TSATTRID_LIST_TYPE_BULLET: Guid = Guid.fromU128(U128(0xbccd77c54c4d4ce2uL, 0xb102559f3b2bfceauL))

public val TSATTRID_LIST_TYPE_LOWER_LETTER: Guid = Guid.fromU128(U128(0x96372285f3cf491euL, 0xa9253832347fd237uL))

public val TSATTRID_LIST_TYPE_LOWER_ROMAN: Guid = Guid.fromU128(U128(0x9046626239804b8euL, 0x9368918bd1218a41uL))

public val TSATTRID_LIST_TYPE_UPPER_LETTER: Guid = Guid.fromU128(U128(0x7987b7cdce52428buL, 0x9b95a357f6f10c45uL))

public val TSATTRID_LIST_TYPE_UPPER_ROMAN: Guid = Guid.fromU128(U128(0xf6ab5524a80467fuL, 0xb2f1127e2aa3ba9euL))

public val TSATTRID_OTHERS: Guid = Guid.fromU128(U128(0xb3c32af957d046a9uL, 0xbca8dac238a13057uL))

public val TSATTRID_TEXT: Guid = Guid.fromU128(U128(0x7edb8e6881f9449duL, 0xa15a87a8388faac0uL))

public val TSATTRID_TEXT_ALIGNMENT: Guid = Guid.fromU128(U128(0x139941e61767456duL, 0x938e35ba568b5cd4uL))

public val TSATTRID_TEXT_ALIGNMENT_CENTER: Guid = Guid.fromU128(U128(0xa4a95c1653bf4d55uL, 0x8b874bdd8d4275fcuL))

public val TSATTRID_TEXT_ALIGNMENT_JUSTIFY: Guid = Guid.fromU128(U128(0xed350740a0f742d3uL, 0x8ea8f81b6488faf0uL))

public val TSATTRID_TEXT_ALIGNMENT_LEFT: Guid = Guid.fromU128(U128(0x16ae95d3636143a2uL, 0x8495d00f397f1693uL))

public val TSATTRID_TEXT_ALIGNMENT_RIGHT: Guid = Guid.fromU128(U128(0xb36f0f981b9e4360uL, 0x861603fb08a78456uL))

public val TSATTRID_TEXT_EMBEDDED_OBJECT: Guid = Guid.fromU128(U128(0x7edb8e6881f9449duL, 0xa15a87a8388faac0uL))

public val TSATTRID_TEXT_HYPHENATION: Guid = Guid.fromU128(U128(0xdadf4525618e49ebuL, 0xb1a83b68bd7648e3uL))

public val TSATTRID_TEXT_LANGUAGE: Guid = Guid.fromU128(U128(0xd8c04ef157534c25uL, 0x888785443fe5f819uL))

public val TSATTRID_TEXT_LINK: Guid = Guid.fromU128(U128(0x47cd905137224cd8uL, 0xb7c84e17ca1759f5uL))

public val TSATTRID_TEXT_ORIENTATION: Guid = Guid.fromU128(U128(0x6bab707f87854c39uL, 0x8b5296f878303ffbuL))

public val TSATTRID_TEXT_PARA: Guid = Guid.fromU128(U128(0x5edc582299dc4dd6uL, 0xaec3b62baa5b2e7cuL))

public val TSATTRID_TEXT_PARA_FIRST_LINE_INDENT: Guid = Guid.fromU128(U128(0x7c97a1374724dd8uL, 0x90a991e3d7e4f29cuL))

public val TSATTRID_TEXT_PARA_LEFT_INDENT: Guid = Guid.fromU128(U128(0xfb2848e9747141c9uL, 0xb6b38a1450e01897uL))

public val TSATTRID_TEXT_PARA_LINE_SPACING: Guid = Guid.fromU128(U128(0x699b380d7f8c46d6uL, 0xa73bdfe3d1538df3uL))

public val TSATTRID_TEXT_PARA_LINE_SPACING_AT_LEAST: Guid = Guid.fromU128(U128(0xadfedf312d444434uL, 0xa5ff7f4c4990a905uL))

public val TSATTRID_TEXT_PARA_LINE_SPACING_DOUBLE: Guid = Guid.fromU128(U128(0x82fb1805a6c44231uL, 0xac126260af2aba28uL))

public val TSATTRID_TEXT_PARA_LINE_SPACING_EXACTLY: Guid = Guid.fromU128(U128(0x3d45ad4023de48d7uL, 0xa6b3765420c620ccuL))

public val TSATTRID_TEXT_PARA_LINE_SPACING_MULTIPLE: Guid = Guid.fromU128(U128(0x910f1e3cd6d04f65uL, 0x8a3c42b4b31868c5uL))

public val TSATTRID_TEXT_PARA_LINE_SPACING_ONE_PT_FIVE: Guid = Guid.fromU128(U128(0x428a02103974b57uL, 0x9a170795994cd3c5uL))

public val TSATTRID_TEXT_PARA_LINE_SPACING_SINGLE: Guid = Guid.fromU128(U128(0xed350740a0f742d3uL, 0x8ea8f81b6488faf0uL))

public val TSATTRID_TEXT_PARA_RIGHT_INDENT: Guid = Guid.fromU128(U128(0x2c7f26f9a5e248dauL, 0xb98a520cb16513bfuL))

public val TSATTRID_TEXT_PARA_SPACE_AFTER: Guid = Guid.fromU128(U128(0x7b0a3f5522dc425fuL, 0xa41193da1d8f9baauL))

public val TSATTRID_TEXT_PARA_SPACE_BEFORE: Guid = Guid.fromU128(U128(0x8df98589194a4601uL, 0xb2519865a3e906dduL))

public val TSATTRID_TEXT_READ_ONLY: Guid = Guid.fromU128(U128(0x85836617de324afduL, 0xa50fa2db110e6e4duL))

public val TSATTRID_TEXT_RIGHT_TO_LEFT: Guid = Guid.fromU128(U128(0xca666e711b08453duL, 0xbfdd28e08c8aaf7auL))

public val TSATTRID_TEXT_VERTICAL_WRITING: Guid = Guid.fromU128(U128(0x6bba8195046f4ea9uL, 0xb31197fd66c4274buL))

public val TS_AE_END: TsActiveSelEnd = 2

public val TS_AE_NONE: TsActiveSelEnd = 0

public val TS_AE_START: TsActiveSelEnd = 1

public val TS_AS_ATTR_CHANGE: UInt = 8u

public val TS_AS_LAYOUT_CHANGE: UInt = 4u

public val TS_AS_SEL_CHANGE: UInt = 2u

public val TS_AS_STATUS_CHANGE: UInt = 16u

public val TS_AS_TEXT_CHANGE: UInt = 1u

public val TS_ATTR_FIND_BACKWARDS: UInt = 1u

public val TS_ATTR_FIND_HIDDEN: UInt = 32u

public val TS_ATTR_FIND_UPDATESTART: UInt = 4u

public val TS_ATTR_FIND_WANT_END: UInt = 16u

public val TS_ATTR_FIND_WANT_OFFSET: UInt = 2u

public val TS_ATTR_FIND_WANT_VALUE: UInt = 8u

public val TS_CHAR_EMBEDDED: UInt = 65532u

public val TS_CHAR_REGION: UInt = 0u

public val TS_CHAR_REPLACEMENT: UInt = 65533u

public val TS_CH_FOLLOWING_DEL: AnchorChangeHistoryFlags = 2u

public val TS_CH_PRECEDING_DEL: AnchorChangeHistoryFlags = 1u

public val TS_DEFAULT_SELECTION: UInt = 4294967295u

public val TS_E_FORMAT: Hresult = 0x8004020Au.toInt()

public val TS_E_INVALIDPOINT: Hresult = 0x80040207u.toInt()

public val TS_E_INVALIDPOS: Hresult = 0x80040200u.toInt()

public val TS_E_NOINTERFACE: Hresult = 0x80040204u.toInt()

public val TS_E_NOLAYOUT: Hresult = 0x80040206u.toInt()

public val TS_E_NOLOCK: Hresult = 0x80040201u.toInt()

public val TS_E_NOOBJECT: Hresult = 0x80040202u.toInt()

public val TS_E_NOSELECTION: Hresult = 0x80040205u.toInt()

public val TS_E_NOSERVICE: Hresult = 0x80040203u.toInt()

public val TS_E_READONLY: Hresult = 0x80040209u.toInt()

public val TS_E_SYNCHRONOUS: Hresult = 0x80040208u.toInt()

public val TS_GEA_HIDDEN: UInt = 1u

public val TS_GR_BACKWARD: TsGravity = 0

public val TS_GR_FORWARD: TsGravity = 1

public val TS_GTA_HIDDEN: UInt = 1u

public val TS_IAS_NOQUERY: UInt = 1u

public val TS_IAS_QUERYONLY: UInt = 2u

public val TS_IE_COMPOSITION: UInt = 2u

public val TS_IE_CORRECTION: UInt = 1u

public val TS_LC_CHANGE: TsLayoutCode = 1

public val TS_LC_CREATE: TsLayoutCode = 0

public val TS_LC_DESTROY: TsLayoutCode = 2

public val TS_LF_READ: TextStoreLockFlags = 2u

public val TS_LF_READWRITE: TextStoreLockFlags = 6u

public val TS_LF_SYNC: UInt = 1u

public val TS_RT_HIDDEN: TsRunType = 1

public val TS_RT_OPAQUE: TsRunType = 2

public val TS_RT_PLAIN: TsRunType = 0

public val TS_SD_BACKWARD: TsShiftDir = 0

public val TS_SD_EMBEDDEDHANDWRITINGVIEW_ENABLED: UInt = 128u

public val TS_SD_EMBEDDEDHANDWRITINGVIEW_VISIBLE: UInt = 256u

public val TS_SD_FORWARD: TsShiftDir = 1

public val TS_SD_INPUTPANEMANUALDISPLAYENABLE: UInt = 64u

public val TS_SD_LOADING: UInt = 2u

public val TS_SD_READONLY: UInt = 1u

public val TS_SD_RESERVED: UInt = 4u

public val TS_SD_TKBAUTOCORRECTENABLE: UInt = 8u

public val TS_SD_TKBPREDICTIONENABLE: UInt = 16u

public val TS_SD_UIINTEGRATIONENABLE: UInt = 32u

public val TS_SHIFT_COUNT_HIDDEN: UInt = 1u

public val TS_SHIFT_COUNT_ONLY: UInt = 8u

public val TS_SHIFT_HALT_HIDDEN: UInt = 2u

public val TS_SHIFT_HALT_VISIBLE: UInt = 4u

public val TS_SS_DISJOINTSEL: UInt = 1u

public val TS_SS_NOHIDDENTEXT: UInt = 8u

public val TS_SS_REGIONS: UInt = 2u

public val TS_SS_TKBAUTOCORRECTENABLE: UInt = 16u

public val TS_SS_TKBPREDICTIONENABLE: UInt = 32u

public val TS_SS_TRANSITORY: UInt = 4u

public val TS_SS_UWPCONTROL: UInt = 64u

public val TS_STRF_END: UInt = 2u

public val TS_STRF_MID: UInt = 1u

public val TS_STRF_START: UInt = 0u

public val TS_ST_CORRECTION: TextStoreTextChangeFlags = 1u

public val TS_ST_NONE: TextStoreTextChangeFlags = 0u

public val TS_S_ASYNC: Hresult = 0x40300u.toInt()

public val TS_TC_CORRECTION: TextStoreChangeFlags = 1u

public val TS_TC_NONE: TextStoreChangeFlags = 0u

public val TS_VCOOKIE_NUL: UInt = 4294967295u
