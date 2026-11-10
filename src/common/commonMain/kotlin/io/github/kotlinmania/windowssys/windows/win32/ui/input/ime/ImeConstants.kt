package io.github.kotlinmania.windowssys.windows.win32.ui.input.ime

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.w

public val ATTR_CONVERTED: UInt = 2u

public val ATTR_FIXEDCONVERTED: UInt = 5u

public val ATTR_INPUT: UInt = 0u

public val ATTR_INPUT_ERROR: UInt = 4u

public val ATTR_TARGET_CONVERTED: UInt = 1u

public val ATTR_TARGET_NOTCONVERTED: UInt = 3u

public val CATID_MSIME_I_IME_PAD_APPLET: Guid = Guid.fromU128(U128(0x7566cad14ec94478uL, 0x9fe98ed766619edfuL))

public val CATID_MSIME_I_IME_PAD_APPLET1000: Guid = Guid.fromU128(U128(0xe081e1d6238943cbuL, 0xb66f609f823d9f9cuL))

public val CATID_MSIME_I_IME_PAD_APPLET1200: Guid = Guid.fromU128(U128(0xa47fb5fc7d154223uL, 0xa789b781bf9ae667uL))

public val CATID_MSIME_I_IME_PAD_APPLET900: Guid = Guid.fromU128(U128(0xfaae51bf5e5b4a1duL, 0x8de117c1d9e1728duL))

public val CATID_MSIME_I_IME_PAD_APPLET_VER7: Guid = Guid.fromU128(U128(0x4a0f8e31c3ee11d1uL, 0xafef00805f0c8b6duL))

public val CATID_MSIME_I_IME_PAD_APPLET_VER80: Guid = Guid.fromU128(U128(0x56f7a792fef111d3uL, 0x846300c04f7a06e5uL))

public val CATID_MSIME_I_IME_PAD_APPLET_VER81: Guid = Guid.fromU128(U128(0x656520b0bb8811d4uL, 0x84c000c04f7a06e5uL))

public val C_ACTIVE_IMM: Guid = Guid.fromU128(U128(0x4955dd33b15911d0uL, 0x8fcf00aa006bcc59uL))

public val CFS_CANDIDATEPOS: UInt = 64u

public val CFS_DEFAULT: UInt = 0u

public val CFS_EXCLUDE: UInt = 128u

public val CFS_FORCE_POSITION: UInt = 32u

public val CFS_POINT: UInt = 2u

public val CFS_RECT: UInt = 1u

public val CHARINFO_APPLETID_MASK: UInt = 4278190080u

public val CHARINFO_CHARID_MASK: UInt = 65535u

public val CHARINFO_FEID_MASK: UInt = 15728640u

public val CLSID_IME_PLUG_IN_DICT_DICTIONARY_LIST_CHS: Guid = Guid.fromU128(U128(0x7bf0129b5bef4de4uL, 0x9b0b5edb66ac2fa6uL))

public val CLSID_IME_PLUG_IN_DICT_DICTIONARY_LIST_JPN: Guid = Guid.fromU128(U128(0x4fe2776bb0f94396uL, 0xb5fce9d4cf1ec195uL))

public val CLSID_VERSION_DEPENDENT_MSIME_JAPANESE: Guid = Guid.fromU128(U128(0x6a91029eaa49471buL, 0xaee77d332785660duL))

public val CPS_CANCEL: NotifyImeIndex = 4u

public val CPS_COMPLETE: NotifyImeIndex = 1u

public val CPS_CONVERT: NotifyImeIndex = 2u

public val CPS_REVERT: NotifyImeIndex = 3u

public val CS_INSERTCHAR: UInt = 8192u

public val CS_NOMOVECARET: UInt = 16384u

public val E_LARGEINPUT: UInt = 51u

public val E_NOCAND: UInt = 48u

public val E_NOTENOUGH_BUFFER: UInt = 49u

public val E_NOTENOUGH_WDD: UInt = 50u

public val FEID_CHINESE_HONGKONG: UInt = 3u

public val FEID_CHINESE_SIMPLIFIED: UInt = 2u

public val FEID_CHINESE_SINGAPORE: UInt = 4u

public val FEID_CHINESE_TRADITIONAL: UInt = 1u

public val FEID_JAPANESE: UInt = 5u

public val FEID_KOREAN: UInt = 6u

public val FEID_KOREAN_JOHAB: UInt = 7u

public val FEID_NONE: UInt = 0u

public val FELANG_CLMN_FIXD: UInt = 32u

public val FELANG_CLMN_FIXR: UInt = 16u

public val FELANG_CLMN_NOPBREAK: UInt = 8u

public val FELANG_CLMN_NOWBREAK: UInt = 2u

public val FELANG_CLMN_PBREAK: UInt = 4u

public val FELANG_CLMN_WBREAK: UInt = 1u

public val FELANG_CMODE_AUTOMATIC: UInt = 134217728u

public val FELANG_CMODE_BESTFIRST: UInt = 16384u

public val FELANG_CMODE_BOPOMOFO: UInt = 64u

public val FELANG_CMODE_CONVERSATION: UInt = 536870912u

public val FELANG_CMODE_FULLWIDTHOUT: UInt = 32u

public val FELANG_CMODE_HALFWIDTHOUT: UInt = 16u

public val FELANG_CMODE_HANGUL: UInt = 128u

public val FELANG_CMODE_HIRAGANAOUT: UInt = 0u

public val FELANG_CMODE_KATAKANAOUT: UInt = 8u

public val FELANG_CMODE_MERGECAND: UInt = 4096u

public val FELANG_CMODE_MONORUBY: UInt = 2u

public val FELANG_CMODE_NAME: UInt = 268435456u

public val FELANG_CMODE_NOINVISIBLECHAR: UInt = 1073741824u

public val FELANG_CMODE_NONE: UInt = 16777216u

public val FELANG_CMODE_NOPRUNING: UInt = 4u

public val FELANG_CMODE_PHRASEPREDICT: UInt = 268435456u

public val FELANG_CMODE_PINYIN: UInt = 256u

public val FELANG_CMODE_PLAURALCLAUSE: UInt = 33554432u

public val FELANG_CMODE_PRECONV: UInt = 512u

public val FELANG_CMODE_RADICAL: UInt = 1024u

public val FELANG_CMODE_ROMAN: UInt = 8192u

public val FELANG_CMODE_SINGLECONVERT: UInt = 67108864u

public val FELANG_CMODE_UNKNOWNREADING: UInt = 2048u

public val FELANG_CMODE_USENOREVWORDS: UInt = 32768u

public val FELANG_INVALD_PO: UInt = 65535u

public val FELANG_REQ_CONV: UInt = 65536u

public val FELANG_REQ_RECONV: UInt = 131072u

public val FELANG_REQ_REV: UInt = 196608u

public val FID_MSIME_KMS_DEL_KEYLIST: UInt = 4u

public val FID_MSIME_KMS_FUNCDESC: UInt = 9u

public val FID_MSIME_KMS_GETMAP: UInt = 6u

public val FID_MSIME_KMS_GETMAPFAST: UInt = 11u

public val FID_MSIME_KMS_GETMAPSEAMLESS: UInt = 10u

public val FID_MSIME_KMS_INIT: UInt = 2u

public val FID_MSIME_KMS_INVOKE: UInt = 7u

public val FID_MSIME_KMS_NOTIFY: UInt = 5u

public val FID_MSIME_KMS_SETMAP: UInt = 8u

public val FID_MSIME_KMS_TERM: UInt = 3u

public val FID_MSIME_KMS_VERSION: UInt = 1u

public val FID_MSIME_VERSION: UInt = 0u

public val FID_RECONVERT_VERSION: UInt = 268435456u

public val GCL_CONVERSION: GetConversionListFlag = 1u

public val GCL_REVERSECONVERSION: GetConversionListFlag = 2u

public val GCL_REVERSE_LENGTH: GetConversionListFlag = 3u

public val GCSEX_CANCELRECONVERT: UInt = 268435456u

public val GCS_COMPATTR: ImeCompositionString = 16u

public val GCS_COMPCLAUSE: ImeCompositionString = 32u

public val GCS_COMPREADATTR: ImeCompositionString = 2u

public val GCS_COMPREADCLAUSE: ImeCompositionString = 4u

public val GCS_COMPREADSTR: ImeCompositionString = 1u

public val GCS_COMPSTR: ImeCompositionString = 8u

public val GCS_CURSORPOS: ImeCompositionString = 128u

public val GCS_DELTASTART: ImeCompositionString = 256u

public val GCS_RESULTCLAUSE: ImeCompositionString = 4096u

public val GCS_RESULTREADCLAUSE: ImeCompositionString = 1024u

public val GCS_RESULTREADSTR: ImeCompositionString = 512u

public val GCS_RESULTSTR: ImeCompositionString = 2048u

public val GGL_INDEX: GetGuideLineType = 2u

public val GGL_LEVEL: GetGuideLineType = 1u

public val GGL_PRIVATE: GetGuideLineType = 4u

public val GGL_STRING: GetGuideLineType = 3u

public val GL_ID_CANNOTSAVE: UInt = 17u

public val GL_ID_CHOOSECANDIDATE: UInt = 40u

public val GL_ID_INPUTCODE: UInt = 38u

public val GL_ID_INPUTRADICAL: UInt = 37u

public val GL_ID_INPUTREADING: UInt = 36u

public val GL_ID_INPUTSYMBOL: UInt = 39u

public val GL_ID_NOCONVERT: UInt = 32u

public val GL_ID_NODICTIONARY: UInt = 16u

public val GL_ID_NOMODULE: UInt = 1u

public val GL_ID_PRIVATE_FIRST: UInt = 32768u

public val GL_ID_PRIVATE_LAST: UInt = 65535u

public val GL_ID_READINGCONFLICT: UInt = 35u

public val GL_ID_REVERSECONVERSION: UInt = 41u

public val GL_ID_TOOMANYSTROKE: UInt = 34u

public val GL_ID_TYPINGERROR: UInt = 33u

public val GL_ID_UNKNOWN: UInt = 0u

public val GL_LEVEL_ERROR: UInt = 2u

public val GL_LEVEL_FATAL: UInt = 1u

public val GL_LEVEL_INFORMATION: UInt = 4u

public val GL_LEVEL_NOGUIDELINE: UInt = 0u

public val GL_LEVEL_WARNING: UInt = 3u

public val IACE_CHILDREN: UInt = 1u

public val IACE_DEFAULT: UInt = 16u

public val IACE_IGNORENOCONTEXT: UInt = 32u

public val IFEC_S_ALREADY_DEFAULT: Hresult = 0x47400u.toInt()

public val IFED_ACTIVE_DICT: Imefmt = 13

public val IFED_ATOK10: Imefmt = 15

public val IFED_ATOK9: Imefmt = 14

public val IFED_E_INVALID_FORMAT: Hresult = 0x80047301u.toInt()

public val IFED_E_NOT_FOUND: Hresult = 0x80047300u.toInt()

public val IFED_E_NOT_SUPPORTED: Hresult = 0x80047307u.toInt()

public val IFED_E_NOT_USER_DIC: Hresult = 0x80047306u.toInt()

public val IFED_E_NO_ENTRY: Hresult = 0x80047304u.toInt()

public val IFED_E_OPEN_FAILED: Hresult = 0x80047302u.toInt()

public val IFED_E_REGISTER_DISCONNECTED: Hresult = 0x8004730Bu.toInt()

public val IFED_E_REGISTER_FAILED: Hresult = 0x80047305u.toInt()

public val IFED_E_REGISTER_ILLEGAL_POS: Hresult = 0x80047309u.toInt()

public val IFED_E_REGISTER_IMPROPER_WORD: Hresult = 0x8004730Au.toInt()

public val IFED_E_USER_COMMENT: Hresult = 0x80047308u.toInt()

public val IFED_E_WRITE_FAILED: Hresult = 0x80047303u.toInt()

public val IFED_MSIME2_BIN_SYSTEM: Imefmt = 1

public val IFED_MSIME2_BIN_USER: Imefmt = 2

public val IFED_MSIME2_TEXT_USER: Imefmt = 3

public val IFED_MSIME95_BIN_SYSTEM: Imefmt = 4

public val IFED_MSIME95_BIN_USER: Imefmt = 5

public val IFED_MSIME95_TEXT_USER: Imefmt = 6

public val IFED_MSIME97_BIN_SYSTEM: Imefmt = 7

public val IFED_MSIME97_BIN_USER: Imefmt = 8

public val IFED_MSIME97_TEXT_USER: Imefmt = 9

public val IFED_MSIME98_BIN_SYSTEM: Imefmt = 10

public val IFED_MSIME98_BIN_USER: Imefmt = 11

public val IFED_MSIME98_SYSTEM_CE: Imefmt = 20

public val IFED_MSIME98_TEXT_USER: Imefmt = 12

public val IFED_MSIME_BIN_SYSTEM: Imefmt = 21

public val IFED_MSIME_BIN_USER: Imefmt = 22

public val IFED_MSIME_TEXT_USER: Imefmt = 23

public val IFED_NEC_AI: Imefmt = 16

public val IFED_PIME2_BIN_STANDARD_SYSTEM: Imefmt = 26

public val IFED_PIME2_BIN_SYSTEM: Imefmt = 25

public val IFED_PIME2_BIN_USER: Imefmt = 24

public val IFED_POS_ADJECTIVE: UInt = 4u

public val IFED_POS_ADJECTIVE_VERB: UInt = 8u

public val IFED_POS_ADNOUN: UInt = 32u

public val IFED_POS_ADVERB: UInt = 16u

public val IFED_POS_AFFIX: UInt = 1536u

public val IFED_POS_ALL: UInt = 131071u

public val IFED_POS_AUXILIARY_VERB: UInt = 32768u

public val IFED_POS_CONJUNCTION: UInt = 64u

public val IFED_POS_DEPENDENT: UInt = 114688u

public val IFED_POS_IDIOMS: UInt = 4096u

public val IFED_POS_INDEPENDENT: UInt = 255u

public val IFED_POS_INFLECTIONALSUFFIX: UInt = 256u

public val IFED_POS_INTERJECTION: UInt = 128u

public val IFED_POS_NONE: UInt = 0u

public val IFED_POS_NOUN: UInt = 1u

public val IFED_POS_PARTICLE: UInt = 16384u

public val IFED_POS_PREFIX: UInt = 512u

public val IFED_POS_SUB_VERB: UInt = 65536u

public val IFED_POS_SUFFIX: UInt = 1024u

public val IFED_POS_SYMBOLS: UInt = 8192u

public val IFED_POS_TANKANJI: UInt = 2048u

public val IFED_POS_VERB: UInt = 2u

public val IFED_REG_ALL: UInt = 7u

public val IFED_REG_AUTO: UInt = 2u

public val IFED_REG_DEL: Imereg = 2

public val IFED_REG_GRAMMAR: UInt = 4u

public val IFED_REG_HEAD: Imereg = 0

public val IFED_REG_NONE: UInt = 0u

public val IFED_REG_TAIL: Imereg = 1

public val IFED_REG_USER: UInt = 1u

public val IFED_REL_ALL: Imerel = 24

public val IFED_REL_DE: Imerel = 5

public val IFED_REL_FUKU_YOUGEN: Imerel = 12

public val IFED_REL_GA: Imerel = 2

public val IFED_REL_HE: Imerel = 9

public val IFED_REL_IDEOM: Imerel = 11

public val IFED_REL_KARA: Imerel = 7

public val IFED_REL_KEIDOU1_YOUGEN: Imerel = 14

public val IFED_REL_KEIDOU2_YOUGEN: Imerel = 15

public val IFED_REL_KEIYOU_TARU_YOUGEN: Imerel = 21

public val IFED_REL_KEIYOU_TO_YOUGEN: Imerel = 20

public val IFED_REL_KEIYOU_YOUGEN: Imerel = 13

public val IFED_REL_MADE: Imerel = 8

public val IFED_REL_NI: Imerel = 4

public val IFED_REL_NO: Imerel = 1

public val IFED_REL_NONE: Imerel = 0

public val IFED_REL_RENSOU: Imerel = 19

public val IFED_REL_RENTAI_MEI: Imerel = 18

public val IFED_REL_TAIGEN: Imerel = 16

public val IFED_REL_TO: Imerel = 10

public val IFED_REL_UNKNOWN1: Imerel = 22

public val IFED_REL_UNKNOWN2: Imerel = 23

public val IFED_REL_WO: Imerel = 3

public val IFED_REL_YORI: Imerel = 6

public val IFED_REL_YOUGEN: Imerel = 17

public val IFED_SELECT_ALL: UInt = 15u

public val IFED_SELECT_COMMENT: UInt = 8u

public val IFED_SELECT_DISPLAY: UInt = 2u

public val IFED_SELECT_NONE: UInt = 0u

public val IFED_SELECT_POS: UInt = 4u

public val IFED_SELECT_READING: UInt = 1u

public val IFED_S_COMMENT_CHANGED: Hresult = 0x47203u.toInt()

public val IFED_S_EMPTY_DICTIONARY: Hresult = 0x47201u.toInt()

public val IFED_S_MORE_ENTRIES: Hresult = 0x47200u.toInt()

public val IFED_S_WORD_EXISTS: Hresult = 0x47202u.toInt()

public val IFED_TYPE_ALL: UInt = 31u

public val IFED_TYPE_ENGLISH: UInt = 16u

public val IFED_TYPE_GENERAL: UInt = 1u

public val IFED_TYPE_NAMEPLACE: UInt = 2u

public val IFED_TYPE_NONE: UInt = 0u

public val IFED_TYPE_REVERSE: UInt = 8u

public val IFED_TYPE_SPEECH: UInt = 4u

public val IFED_UCT_MAX: Imeuct = 4

public val IFED_UCT_NONE: Imeuct = 0

public val IFED_UCT_STRING_SJIS: Imeuct = 1

public val IFED_UCT_STRING_UNICODE: Imeuct = 2

public val IFED_UCT_USER_DEFINED: Imeuct = 3

public val IFED_UNKNOWN: Imefmt = 0

public val IFED_VJE_20: Imefmt = 19

public val IFED_WX_II: Imefmt = 17

public val IFED_WX_III: Imefmt = 18

public val IGIMIF_RIGHTMENU: UInt = 1u

public val IGIMII_CMODE: UInt = 1u

public val IGIMII_CONFIGURE: UInt = 4u

public val IGIMII_HELP: UInt = 16u

public val IGIMII_INPUTTOOLS: UInt = 64u

public val IGIMII_OTHER: UInt = 32u

public val IGIMII_SMODE: UInt = 2u

public val IGIMII_TOOLS: UInt = 8u

public val IMC_CLOSESTATUSWINDOW: UInt = 33u

public val IMC_GETCANDIDATEPOS: UInt = 7u

public val IMC_GETCOMPOSITIONFONT: UInt = 9u

public val IMC_GETCOMPOSITIONWINDOW: UInt = 11u

public val IMC_GETSOFTKBDFONT: UInt = 17u

public val IMC_GETSOFTKBDPOS: UInt = 19u

public val IMC_GETSOFTKBDSUBTYPE: UInt = 21u

public val IMC_GETSTATUSWINDOWPOS: UInt = 15u

public val IMC_OPENSTATUSWINDOW: UInt = 34u

public val IMC_SETCANDIDATEPOS: UInt = 8u

public val IMC_SETCOMPOSITIONFONT: UInt = 10u

public val IMC_SETCOMPOSITIONWINDOW: UInt = 12u

public val IMC_SETCONVERSIONMODE: UInt = 2u

public val IMC_SETOPENSTATUS: UInt = 6u

public val IMC_SETSENTENCEMODE: UInt = 4u

public val IMC_SETSOFTKBDDATA: UInt = 24u

public val IMC_SETSOFTKBDFONT: UInt = 18u

public val IMC_SETSOFTKBDPOS: UInt = 20u

public val IMC_SETSOFTKBDSUBTYPE: UInt = 22u

public val IMC_SETSTATUSWINDOWPOS: UInt = 16u

public val IMEFAREASTINFO_TYPE_COMMENT: UInt = 2u

public val IMEFAREASTINFO_TYPE_COSTTIME: UInt = 3u

public val IMEFAREASTINFO_TYPE_DEFAULT: UInt = 0u

public val IMEFAREASTINFO_TYPE_READING: UInt = 1u

public val IMEKEYCTRLMASK_ALT: UInt = 1u

public val IMEKEYCTRLMASK_CTRL: UInt = 2u

public val IMEKEYCTRLMASK_SHIFT: UInt = 4u

public val IMEKEYCTRL_DOWN: UInt = 0u

public val IMEKEYCTRL_UP: UInt = 1u

public val IMEKMS_2NDLEVEL: UInt = 4u

public val IMEKMS_CANDIDATE: UInt = 6u

public val IMEKMS_COMPOSITION: UInt = 1u

public val IMEKMS_IMEOFF: UInt = 3u

public val IMEKMS_INPTGL: UInt = 5u

public val IMEKMS_NOCOMPOSITION: UInt = 0u

public val IMEKMS_SELECTION: UInt = 2u

public val IMEKMS_TYPECAND: UInt = 7u

public val IMEMENUITEM_STRING_SIZE: UInt = 80u

public val IMEMOUSERET_NOTHANDLED: Int = -1

public val IMEMOUSE_LDOWN: UInt = 1u

public val IMEMOUSE_MDOWN: UInt = 4u

public val IMEMOUSE_NONE: UInt = 0u

public val IMEMOUSE_RDOWN: UInt = 2u

public val IMEMOUSE_VERSION: UInt = 255u

public val IMEMOUSE_WDOWN: UInt = 32u

public val IMEMOUSE_WUP: UInt = 16u

public val IMEPADCTRL_CARETBACKSPACE: UInt = 10u

public val IMEPADCTRL_CARETBOTTOM: UInt = 9u

public val IMEPADCTRL_CARETDELETE: UInt = 11u

public val IMEPADCTRL_CARETLEFT: UInt = 6u

public val IMEPADCTRL_CARETRIGHT: UInt = 7u

public val IMEPADCTRL_CARETSET: UInt = 5u

public val IMEPADCTRL_CARETTOP: UInt = 8u

public val IMEPADCTRL_CLEARALL: UInt = 4u

public val IMEPADCTRL_CONVERTALL: UInt = 1u

public val IMEPADCTRL_DETERMINALL: UInt = 2u

public val IMEPADCTRL_DETERMINCHAR: UInt = 3u

public val IMEPADCTRL_INSERTFULLSPACE: UInt = 14u

public val IMEPADCTRL_INSERTHALFSPACE: UInt = 15u

public val IMEPADCTRL_INSERTSPACE: UInt = 13u

public val IMEPADCTRL_OFFIME: UInt = 17u

public val IMEPADCTRL_OFFPRECONVERSION: UInt = 19u

public val IMEPADCTRL_ONIME: UInt = 16u

public val IMEPADCTRL_ONPRECONVERSION: UInt = 18u

public val IMEPADCTRL_PHONETICCANDIDATE: UInt = 20u

public val IMEPADCTRL_PHRASEDELETE: UInt = 12u

public val IMEPADREQ_CHANGESTRING: ImePadRequestFlags = 4113u

public val IMEPADREQ_CHANGESTRINGCANDIDATEINFO: UInt = 4111u

public val IMEPADREQ_CHANGESTRINGINFO: UInt = 4115u

public val IMEPADREQ_DELETESTRING: ImePadRequestFlags = 4112u

public val IMEPADREQ_FIRST: UInt = 4096u

public val IMEPADREQ_FORCEIMEPADWINDOWSHOW: ImePadRequestFlags = 4117u

public val IMEPADREQ_GETAPPLETDATA: UInt = 4106u

public val IMEPADREQ_GETAPPLETUISTYLE: ImePadRequestFlags = 4121u

public val IMEPADREQ_GETAPPLHWND: ImePadRequestFlags = 4116u

public val IMEPADREQ_GETCOMPOSITIONSTRING: ImePadRequestFlags = 4102u

public val IMEPADREQ_GETCOMPOSITIONSTRINGID: UInt = 4109u

public val IMEPADREQ_GETCOMPOSITIONSTRINGINFO: ImePadRequestFlags = 4108u

public val IMEPADREQ_GETCONVERSIONSTATUS: ImePadRequestFlags = 4126u

public val IMEPADREQ_GETCURRENTIMEINFO: ImePadRequestFlags = 4128u

public val IMEPADREQ_GETCURRENTUILANGID: UInt = 4120u

public val IMEPADREQ_GETDEFAULTUILANGID: ImePadRequestFlags = 4119u

public val IMEPADREQ_GETSELECTEDSTRING: UInt = 4103u

public val IMEPADREQ_GETVERSION: ImePadRequestFlags = 4127u

public val IMEPADREQ_INSERTITEMCANDIDATE: UInt = 4099u

public val IMEPADREQ_INSERTSTRING: ImePadRequestFlags = 4097u

public val IMEPADREQ_INSERTSTRINGCANDIDATE: UInt = 4098u

public val IMEPADREQ_INSERTSTRINGCANDIDATEINFO: UInt = 4110u

public val IMEPADREQ_INSERTSTRINGINFO: UInt = 4114u

public val IMEPADREQ_ISAPPLETACTIVE: ImePadRequestFlags = 4123u

public val IMEPADREQ_ISIMEPADWINDOWVISIBLE: ImePadRequestFlags = 4124u

public val IMEPADREQ_POSTMODALNOTIFY: ImePadRequestFlags = 4118u

public val IMEPADREQ_SENDCONTROL: ImePadRequestFlags = 4100u

public val IMEPADREQ_SENDKEYCONTROL: UInt = 4101u

public val IMEPADREQ_SETAPPLETDATA: UInt = 4105u

public val IMEPADREQ_SETAPPLETMINMAXSIZE: ImePadRequestFlags = 4125u

public val IMEPADREQ_SETAPPLETSIZE: ImePadRequestFlags = 4104u

public val IMEPADREQ_SETAPPLETUISTYLE: ImePadRequestFlags = 4122u

public val IMEPADREQ_SETTITLEFONT: UInt = 4107u

public val IMEPN_ACTIVATE: UInt = 257u

public val IMEPN_APPLYCAND: UInt = 267u

public val IMEPN_APPLYCANDEX: UInt = 268u

public val IMEPN_CONFIG: UInt = 264u

public val IMEPN_FIRST: UInt = 256u

public val IMEPN_HELP: UInt = 265u

public val IMEPN_HIDE: UInt = 261u

public val IMEPN_INACTIVATE: UInt = 258u

public val IMEPN_QUERYCAND: UInt = 266u

public val IMEPN_SETTINGCHANGED: UInt = 269u

public val IMEPN_SHOW: UInt = 260u

public val IMEPN_SIZECHANGED: UInt = 263u

public val IMEPN_SIZECHANGING: UInt = 262u

public val IMEPN_USER: UInt = 356u

public val IMEVER_0310: UInt = 196618u

public val IMEVER_0400: UInt = 262144u

public val IME_CAND_CODE: UInt = 2u

public val IME_CAND_MEANING: UInt = 3u

public val IME_CAND_RADICAL: UInt = 4u

public val IME_CAND_READ: UInt = 1u

public val IME_CAND_STROKE: UInt = 5u

public val IME_CAND_UNKNOWN: UInt = 0u

public val IME_CHOTKEY_IME_NONIME_TOGGLE: ImeHotkeyIdentifier = 16u

public val IME_CHOTKEY_SHAPE_TOGGLE: ImeHotkeyIdentifier = 17u

public val IME_CHOTKEY_SYMBOL_TOGGLE: ImeHotkeyIdentifier = 18u

public val IME_CMODE_ALPHANUMERIC: ImeConversionMode = 0u

public val IME_CMODE_CHARCODE: ImeConversionMode = 32u

public val IME_CMODE_CHINESE: ImeConversionMode = 1u

public val IME_CMODE_EUDC: ImeConversionMode = 512u

public val IME_CMODE_FIXED: ImeConversionMode = 2048u

public val IME_CMODE_FULLSHAPE: ImeConversionMode = 8u

public val IME_CMODE_HANGEUL: ImeConversionMode = 1u

public val IME_CMODE_HANGUL: ImeConversionMode = 1u

public val IME_CMODE_HANJACONVERT: ImeConversionMode = 64u

public val IME_CMODE_JAPANESE: ImeConversionMode = 1u

public val IME_CMODE_KATAKANA: ImeConversionMode = 2u

public val IME_CMODE_LANGUAGE: ImeConversionMode = 3u

public val IME_CMODE_NATIVE: ImeConversionMode = 1u

public val IME_CMODE_NATIVESYMBOL: ImeConversionMode = 128u

public val IME_CMODE_NOCONVERSION: ImeConversionMode = 256u

public val IME_CMODE_RESERVED: ImeConversionMode = 4026531840u

public val IME_CMODE_ROMAN: ImeConversionMode = 16u

public val IME_CMODE_SOFTKBD: ImeConversionMode = 128u

public val IME_CMODE_SYMBOL: ImeConversionMode = 1024u

public val IME_CONFIG_GENERAL: UInt = 1u

public val IME_CONFIG_REGISTERWORD: UInt = 2u

public val IME_CONFIG_SELECTDICTIONARY: UInt = 3u

public val IME_ESC_AUTOMATA: ImeEscape = 4105u

public val IME_ESC_GETHELPFILENAME: ImeEscape = 4107u

public val IME_ESC_GET_EUDC_DICTIONARY: ImeEscape = 4099u

public val IME_ESC_HANJA_MODE: ImeEscape = 4104u

public val IME_ESC_IME_NAME: ImeEscape = 4102u

public val IME_ESC_MAX_KEY: ImeEscape = 4101u

public val IME_ESC_PRIVATE_FIRST: ImeEscape = 2048u

public val IME_ESC_PRIVATE_HOTKEY: ImeEscape = 4106u

public val IME_ESC_PRIVATE_LAST: ImeEscape = 4095u

public val IME_ESC_QUERY_SUPPORT: ImeEscape = 3u

public val IME_ESC_RESERVED_FIRST: ImeEscape = 4u

public val IME_ESC_RESERVED_LAST: ImeEscape = 2047u

public val IME_ESC_SEQUENCE_TO_INTERNAL: ImeEscape = 4097u

public val IME_ESC_SET_EUDC_DICTIONARY: ImeEscape = 4100u

public val IME_ESC_STRING_BUFFER_SIZE: UInt = 80u

public val IME_ESC_SYNC_HOTKEY: ImeEscape = 4103u

public val IME_HOTKEY_DSWITCH_FIRST: UInt = 256u

public val IME_HOTKEY_DSWITCH_LAST: UInt = 287u

public val IME_HOTKEY_PRIVATE_FIRST: UInt = 512u

public val IME_HOTKEY_PRIVATE_LAST: UInt = 543u

public val IME_ITHOTKEY_PREVIOUS_COMPOSITION: ImeHotkeyIdentifier = 513u

public val IME_ITHOTKEY_RECONVERTSTRING: ImeHotkeyIdentifier = 515u

public val IME_ITHOTKEY_RESEND_RESULTSTR: ImeHotkeyIdentifier = 512u

public val IME_ITHOTKEY_UISTYLE_TOGGLE: ImeHotkeyIdentifier = 514u

public val IME_JHOTKEY_CLOSE_OPEN: ImeHotkeyIdentifier = 48u

public val IME_KHOTKEY_ENGLISH: ImeHotkeyIdentifier = 82u

public val IME_KHOTKEY_HANJACONVERT: ImeHotkeyIdentifier = 81u

public val IME_KHOTKEY_SHAPE_TOGGLE: ImeHotkeyIdentifier = 80u

public val IME_PROP_ACCEPT_WIDE_VKEY: UInt = 32u

public val IME_PROP_AT_CARET: UInt = 65536u

public val IME_PROP_CANDLIST_START_FROM_1: UInt = 262144u

public val IME_PROP_COMPLETE_ON_UNSELECT: UInt = 1048576u

public val IME_PROP_END_UNLOAD: UInt = 1u

public val IME_PROP_IGNORE_UPKEYS: UInt = 4u

public val IME_PROP_KBD_CHAR_FIRST: UInt = 2u

public val IME_PROP_NEED_ALTKEY: UInt = 8u

public val IME_PROP_NO_KEYS_ON_CLOSE: UInt = 16u

public val IME_PROP_SPECIAL_UI: UInt = 131072u

public val IME_PROP_UNICODE: UInt = 524288u

public val IME_REGWORD_STYLE_EUDC: UInt = 1u

public val IME_REGWORD_STYLE_USER_FIRST: UInt = 2147483648u

public val IME_REGWORD_STYLE_USER_LAST: UInt = 4294967295u

public val IME_SMODE_AUTOMATIC: ImeSentenceMode = 4u

public val IME_SMODE_CONVERSATION: ImeSentenceMode = 16u

public val IME_SMODE_NONE: ImeSentenceMode = 0u

public val IME_SMODE_PHRASEPREDICT: ImeSentenceMode = 8u

public val IME_SMODE_PLAURALCLAUSE: ImeSentenceMode = 1u

public val IME_SMODE_RESERVED: ImeSentenceMode = 61440u

public val IME_SMODE_SINGLECONVERT: ImeSentenceMode = 2u

public val IME_SYSINFO_WINLOGON: UInt = 1u

public val IME_THOTKEY_IME_NONIME_TOGGLE: ImeHotkeyIdentifier = 112u

public val IME_THOTKEY_SHAPE_TOGGLE: ImeHotkeyIdentifier = 113u

public val IME_THOTKEY_SYMBOL_TOGGLE: ImeHotkeyIdentifier = 114u

public val IME_UI_CLASS_NAME_SIZE: UInt = 16u

public val IMFT_RADIOCHECK: UInt = 1u

public val IMFT_SEPARATOR: UInt = 2u

public val IMFT_SUBMENU: UInt = 4u

public val IMMGWLP_IMC: UInt = 0u

public val IMMGWL_IMC: UInt = 0u

public val IMM_ERROR_GENERAL: Int = -2

public val IMM_ERROR_NODATA: Int = -1

public val IMN_CHANGECANDIDATE: UInt = 3u

public val IMN_CLOSECANDIDATE: UInt = 4u

public val IMN_CLOSESTATUSWINDOW: UInt = 1u

public val IMN_GUIDELINE: UInt = 13u

public val IMN_OPENCANDIDATE: UInt = 5u

public val IMN_OPENSTATUSWINDOW: UInt = 2u

public val IMN_PRIVATE: UInt = 14u

public val IMN_SETCANDIDATEPOS: UInt = 9u

public val IMN_SETCOMPOSITIONFONT: UInt = 10u

public val IMN_SETCOMPOSITIONWINDOW: UInt = 11u

public val IMN_SETCONVERSIONMODE: UInt = 6u

public val IMN_SETOPENSTATUS: UInt = 8u

public val IMN_SETSENTENCEMODE: UInt = 7u

public val IMN_SETSTATUSWINDOWPOS: UInt = 12u

public val IMN_SOFTKBDDESTROYED: UInt = 17u

public val IMR_CANDIDATEWINDOW: UInt = 2u

public val IMR_COMPOSITIONFONT: UInt = 3u

public val IMR_COMPOSITIONWINDOW: UInt = 1u

public val IMR_CONFIRMRECONVERTSTRING: UInt = 5u

public val IMR_DOCUMENTFEED: UInt = 7u

public val IMR_QUERYCHARPOSITION: UInt = 6u

public val IMR_RECONVERTSTRING: UInt = 4u

public val INFOMASK_APPLY_CAND: UInt = 2u

public val INFOMASK_APPLY_CAND_EX: UInt = 4u

public val INFOMASK_BLOCK_CAND: UInt = 262144u

public val INFOMASK_HIDE_CAND: UInt = 131072u

public val INFOMASK_NONE: UInt = 0u

public val INFOMASK_QUERY_CAND: UInt = 1u

public val INFOMASK_STRING_FIX: UInt = 65536u

public val INIT_COMPFORM: UInt = 16u

public val INIT_CONVERSION: UInt = 2u

public val INIT_LOGFONT: UInt = 8u

public val INIT_SENTENCE: UInt = 4u

public val INIT_SOFTKBDPOS: UInt = 32u

public val INIT_STATUSWNDPOS: UInt = 1u

public val IPACFG_CATEGORY: Int = 262144

public val IPACFG_HELP: Int = 2

public val IPACFG_LANG: Int = 16

public val IPACFG_NONE: Int = 0

public val IPACFG_PROPERTY: Int = 1

public val IPACFG_TITLE: Int = 65536

public val IPACFG_TITLEFONTFACE: Int = 131072

public val IPACID_CHARLIST: UInt = 9u

public val IPACID_EPWING: UInt = 7u

public val IPACID_HANDWRITING: UInt = 2u

public val IPACID_NONE: UInt = 0u

public val IPACID_OCR: UInt = 8u

public val IPACID_RADICALSEARCH: UInt = 4u

public val IPACID_SOFTKEY: UInt = 1u

public val IPACID_STROKESEARCH: UInt = 3u

public val IPACID_SYMBOLSEARCH: UInt = 5u

public val IPACID_USER: UInt = 256u

public val IPACID_VOICE: UInt = 6u

public val IPAWS_ENABLED: Int = 1

public val IPAWS_HORIZONTALFIXED: Int = 512

public val IPAWS_MAXHEIGHTFIXED: Int = 8192

public val IPAWS_MAXSIZEFIXED: Int = 12288

public val IPAWS_MAXWIDTHFIXED: Int = 4096

public val IPAWS_MINHEIGHTFIXED: Int = 131072

public val IPAWS_MINSIZEFIXED: Int = 196608

public val IPAWS_MINWIDTHFIXED: Int = 65536

public val IPAWS_SIZEFIXED: Int = 768

public val IPAWS_SIZINGNOTIFY: Int = 4

public val IPAWS_VERTICALFIXED: Int = 256

public val ISC_SHOWUIALL: UInt = 3221225487u

public val ISC_SHOWUIALLCANDIDATEWINDOW: UInt = 15u

public val ISC_SHOWUICANDIDATEWINDOW: UInt = 1u

public val ISC_SHOWUICOMPOSITIONWINDOW: UInt = 2147483648u

public val ISC_SHOWUIGUIDELINE: UInt = 1073741824u

public val JPOS_1DAN: UInt = 213u

public val JPOS_4DAN_HA: UInt = 212u

public val JPOS_5DAN_AWA: UInt = 200u

public val JPOS_5DAN_AWAUON: UInt = 209u

public val JPOS_5DAN_BA: UInt = 206u

public val JPOS_5DAN_GA: UInt = 202u

public val JPOS_5DAN_KA: UInt = 201u

public val JPOS_5DAN_KASOKUON: UInt = 210u

public val JPOS_5DAN_MA: UInt = 207u

public val JPOS_5DAN_NA: UInt = 205u

public val JPOS_5DAN_RA: UInt = 208u

public val JPOS_5DAN_RAHEN: UInt = 211u

public val JPOS_5DAN_SA: UInt = 203u

public val JPOS_5DAN_TA: UInt = 204u

public val JPOS_BUPPIN: UInt = 122u

public val JPOS_CHIMEI: UInt = 109u

public val JPOS_CHIMEI_EKI: UInt = 117u

public val JPOS_CHIMEI_GUN: UInt = 112u

public val JPOS_CHIMEI_KEN: UInt = 111u

public val JPOS_CHIMEI_KU: UInt = 113u

public val JPOS_CHIMEI_KUNI: UInt = 110u

public val JPOS_CHIMEI_MACHI: UInt = 115u

public val JPOS_CHIMEI_MURA: UInt = 116u

public val JPOS_CHIMEI_SHI: UInt = 114u

public val JPOS_CLOSEBRACE: UInt = 911u

public val JPOS_DAIMEISHI: UInt = 123u

public val JPOS_DAIMEISHI_NINSHOU: UInt = 124u

public val JPOS_DAIMEISHI_SHIJI: UInt = 125u

public val JPOS_DOKURITSUGO: UInt = 903u

public val JPOS_EIJI: UInt = 906u

public val JPOS_FUKUSHI: UInt = 500u

public val JPOS_FUKUSHI_DA: UInt = 504u

public val JPOS_FUKUSHI_NANO: UInt = 503u

public val JPOS_FUKUSHI_NI: UInt = 502u

public val JPOS_FUKUSHI_SAHEN: UInt = 501u

public val JPOS_FUKUSHI_TO: UInt = 505u

public val JPOS_FUKUSHI_TOSURU: UInt = 506u

public val JPOS_FUTEIGO: UInt = 904u

public val JPOS_HUKUSIMEISHI: UInt = 104u

public val JPOS_JINMEI: UInt = 106u

public val JPOS_JINMEI_MEI: UInt = 108u

public val JPOS_JINMEI_SEI: UInt = 107u

public val JPOS_KANDOUSHI: UInt = 670u

public val JPOS_KANJI: UInt = 909u

public val JPOS_KANYOUKU: UInt = 902u

public val JPOS_KAZU: UInt = 126u

public val JPOS_KAZU_SURYOU: UInt = 127u

public val JPOS_KAZU_SUSHI: UInt = 128u

public val JPOS_KEIDOU: UInt = 400u

public val JPOS_KEIDOU_GARU: UInt = 403u

public val JPOS_KEIDOU_NO: UInt = 401u

public val JPOS_KEIDOU_TARU: UInt = 402u

public val JPOS_KEIYOU: UInt = 300u

public val JPOS_KEIYOU_GARU: UInt = 301u

public val JPOS_KEIYOU_GE: UInt = 302u

public val JPOS_KEIYOU_ME: UInt = 303u

public val JPOS_KEIYOU_U: UInt = 305u

public val JPOS_KEIYOU_YUU: UInt = 304u

public val JPOS_KENCHIKU: UInt = 121u

public val JPOS_KIGOU: UInt = 905u

public val JPOS_KURU_KI: UInt = 219u

public val JPOS_KURU_KITA: UInt = 220u

public val JPOS_KURU_KITARA: UInt = 221u

public val JPOS_KURU_KITARI: UInt = 222u

public val JPOS_KURU_KITAROU: UInt = 223u

public val JPOS_KURU_KITE: UInt = 224u

public val JPOS_KURU_KO: UInt = 226u

public val JPOS_KURU_KOI: UInt = 227u

public val JPOS_KURU_KOYOU: UInt = 228u

public val JPOS_KURU_KUREBA: UInt = 225u

public val JPOS_KUTEN: UInt = 907u

public val JPOS_MEISA_KEIDOU: UInt = 105u

public val JPOS_MEISHI_FUTSU: UInt = 100u

public val JPOS_MEISHI_KEIYOUDOUSHI: UInt = 103u

public val JPOS_MEISHI_SAHEN: UInt = 101u

public val JPOS_MEISHI_ZAHEN: UInt = 102u

public val JPOS_OPENBRACE: UInt = 910u

public val JPOS_RENTAISHI: UInt = 600u

public val JPOS_RENTAISHI_SHIJI: UInt = 601u

public val JPOS_RENYOU_SETSUBI: UInt = 826u

public val JPOS_SETSUBI: UInt = 800u

public val JPOS_SETSUBI_CHIMEI: UInt = 811u

public val JPOS_SETSUBI_CHOU: UInt = 818u

public val JPOS_SETSUBI_CHU: UInt = 804u

public val JPOS_SETSUBI_DONO: UInt = 835u

public val JPOS_SETSUBI_EKI: UInt = 821u

public val JPOS_SETSUBI_FU: UInt = 805u

public val JPOS_SETSUBI_FUKUSU: UInt = 836u

public val JPOS_SETSUBI_GUN: UInt = 814u

public val JPOS_SETSUBI_JIKAN: UInt = 829u

public val JPOS_SETSUBI_JIKANPLUS: UInt = 830u

public val JPOS_SETSUBI_JINMEI: UInt = 810u

public val JPOS_SETSUBI_JOSUSHI: UInt = 827u

public val JPOS_SETSUBI_JOSUSHIPLUS: UInt = 828u

public val JPOS_SETSUBI_KA: UInt = 803u

public val JPOS_SETSUBI_KATA: UInt = 808u

public val JPOS_SETSUBI_KEN: UInt = 813u

public val JPOS_SETSUBI_KENCHIKU: UInt = 825u

public val JPOS_SETSUBI_KU: UInt = 815u

public val JPOS_SETSUBI_KUN: UInt = 833u

public val JPOS_SETSUBI_KUNI: UInt = 812u

public val JPOS_SETSUBI_MACHI: UInt = 817u

public val JPOS_SETSUBI_MEISHIRENDAKU: UInt = 809u

public val JPOS_SETSUBI_MURA: UInt = 819u

public val JPOS_SETSUBI_RA: UInt = 838u

public val JPOS_SETSUBI_RYU: UInt = 806u

public val JPOS_SETSUBI_SAMA: UInt = 834u

public val JPOS_SETSUBI_SAN: UInt = 832u

public val JPOS_SETSUBI_SEI: UInt = 802u

public val JPOS_SETSUBI_SHAMEI: UInt = 823u

public val JPOS_SETSUBI_SHI: UInt = 816u

public val JPOS_SETSUBI_SON: UInt = 820u

public val JPOS_SETSUBI_SONOTA: UInt = 822u

public val JPOS_SETSUBI_SOSHIKI: UInt = 824u

public val JPOS_SETSUBI_TACHI: UInt = 837u

public val JPOS_SETSUBI_TEINEI: UInt = 831u

public val JPOS_SETSUBI_TEKI: UInt = 801u

public val JPOS_SETSUBI_YOU: UInt = 807u

public val JPOS_SETSUZOKUSHI: UInt = 650u

public val JPOS_SETTOU: UInt = 700u

public val JPOS_SETTOU_CHIMEI: UInt = 710u

public val JPOS_SETTOU_CHOUTAN: UInt = 707u

public val JPOS_SETTOU_DAISHOU: UInt = 705u

public val JPOS_SETTOU_FUKU: UInt = 703u

public val JPOS_SETTOU_JINMEI: UInt = 709u

public val JPOS_SETTOU_JOSUSHI: UInt = 712u

public val JPOS_SETTOU_KAKU: UInt = 701u

public val JPOS_SETTOU_KOUTEI: UInt = 706u

public val JPOS_SETTOU_MI: UInt = 704u

public val JPOS_SETTOU_SAI: UInt = 702u

public val JPOS_SETTOU_SHINKYU: UInt = 708u

public val JPOS_SETTOU_SONOTA: UInt = 711u

public val JPOS_SETTOU_TEINEI_GO: UInt = 714u

public val JPOS_SETTOU_TEINEI_O: UInt = 713u

public val JPOS_SETTOU_TEINEI_ON: UInt = 715u

public val JPOS_SHAMEI: UInt = 119u

public val JPOS_SONOTA: UInt = 118u

public val JPOS_SOSHIKI: UInt = 120u

public val JPOS_SURU_SA: UInt = 229u

public val JPOS_SURU_SE: UInt = 238u

public val JPOS_SURU_SEYO: UInt = 239u

public val JPOS_SURU_SI: UInt = 230u

public val JPOS_SURU_SIATRI: UInt = 233u

public val JPOS_SURU_SITA: UInt = 231u

public val JPOS_SURU_SITARA: UInt = 232u

public val JPOS_SURU_SITAROU: UInt = 234u

public val JPOS_SURU_SITE: UInt = 235u

public val JPOS_SURU_SIYOU: UInt = 236u

public val JPOS_SURU_SUREBA: UInt = 237u

public val JPOS_TANKANJI: UInt = 900u

public val JPOS_TANKANJI_KAO: UInt = 901u

public val JPOS_TANSHUKU: UInt = 913u

public val JPOS_TOKUSHU_KAHEN: UInt = 214u

public val JPOS_TOKUSHU_NAHEN: UInt = 218u

public val JPOS_TOKUSHU_SAHEN: UInt = 216u

public val JPOS_TOKUSHU_SAHENSURU: UInt = 215u

public val JPOS_TOKUSHU_ZAHEN: UInt = 217u

public val JPOS_TOUTEN: UInt = 908u

public val JPOS_UNDEFINED: UInt = 0u

public val JPOS_YOKUSEI: UInt = 912u

public val MAX_APPLETTITLE: UInt = 64u

public val MAX_FONTFACE: UInt = 32u

public val MODEBIASMODE_DEFAULT: UInt = 0u

public val MODEBIASMODE_DIGIT: UInt = 4u

public val MODEBIASMODE_FILENAME: UInt = 1u

public val MODEBIASMODE_READING: UInt = 2u

public val MODEBIAS_GETVALUE: UInt = 2u

public val MODEBIAS_GETVERSION: UInt = 0u

public val MODEBIAS_SETVALUE: UInt = 1u

public val MOD_IGNORE_ALL_MODIFIER: UInt = 1024u

public val MOD_LEFT: UInt = 32768u

public val MOD_ON_KEYUP: UInt = 2048u

public val MOD_RIGHT: UInt = 16384u

public val NI_CHANGECANDIDATELIST: NotifyImeAction = 19u

public val NI_CLOSECANDIDATE: NotifyImeAction = 17u

public val NI_COMPOSITIONSTR: NotifyImeAction = 21u

public val NI_CONTEXTUPDATED: UInt = 3u

public val NI_FINALIZECONVERSIONRESULT: UInt = 20u

public val NI_IMEMENUSELECTED: NotifyImeAction = 24u

public val NI_OPENCANDIDATE: NotifyImeAction = 16u

public val NI_SELECTCANDIDATESTR: NotifyImeAction = 18u

public val NI_SETCANDIDATE_PAGESIZE: NotifyImeAction = 23u

public val NI_SETCANDIDATE_PAGESTART: NotifyImeAction = 22u

public val POS_UNDEFINED: UInt = 0u

public val RECONVOPT_NONE: UInt = 0u

public val RECONVOPT_USECANCELNOTIFY: UInt = 1u

public val RWM_CHGKEYMAP: Pcwstr = w("MSIMEChangeKeyMap")

public val RWM_DOCUMENTFEED: Pcwstr = w("MSIMEDocumentFeed")

public val RWM_KEYMAP: Pcwstr = w("MSIMEKeyMap")

public val RWM_MODEBIAS: Pcwstr = w("MSIMEModeBias")

public val RWM_MOUSE: Pcwstr = w("MSIMEMouseOperation")

public val RWM_NTFYKEYMAP: Pcwstr = w("MSIMENotifyKeyMap")

public val RWM_QUERYPOSITION: Pcwstr = w("MSIMEQueryPosition")

public val RWM_RECONVERT: Pcwstr = w("MSIMEReconvert")

public val RWM_RECONVERTOPTIONS: Pcwstr = w("MSIMEReconvertOptions")

public val RWM_RECONVERTREQUEST: Pcwstr = w("MSIMEReconvertRequest")

public val RWM_SERVICE: Pcwstr = w("MSIMEService")

public val RWM_SHOWIMEPAD: Pcwstr = w("MSIMEShowImePad")

public val RWM_UIREADY: Pcwstr = w("MSIMEUIReady")

public val SCS_CAP_COMPSTR: UInt = 1u

public val SCS_CAP_MAKEREAD: UInt = 2u

public val SCS_CAP_SETRECONVERTSTRING: UInt = 4u

public val SCS_CHANGEATTR: SetCompositionStringType = 18u

public val SCS_CHANGECLAUSE: SetCompositionStringType = 36u

public val SCS_QUERYRECONVERTSTRING: SetCompositionStringType = 131072u

public val SCS_SETRECONVERTSTRING: SetCompositionStringType = 65536u

public val SCS_SETSTR: SetCompositionStringType = 9u

public val SELECT_CAP_CONVERSION: UInt = 1u

public val SELECT_CAP_SENTENCE: UInt = 2u

public val SHOWIMEPAD_CATEGORY: UInt = 1u

public val SHOWIMEPAD_DEFAULT: UInt = 0u

public val SHOWIMEPAD_GUID: UInt = 2u

public val SOFTKEYBOARD_TYPE_C1: UInt = 2u

public val SOFTKEYBOARD_TYPE_T1: UInt = 1u

public val STYLE_DESCRIPTION_SIZE: UInt = 32u

public val UI_CAP_2700: UInt = 1u

public val UI_CAP_ROT90: UInt = 2u

public val UI_CAP_ROTANY: UInt = 4u

public val UI_CAP_SOFTKBD: UInt = 65536u

public val VERSION_DOCUMENTFEED: UInt = 1u

public val VERSION_ID_CHINESE_SIMPLIFIED: UInt = 134217728u

public val VERSION_ID_CHINESE_TRADITIONAL: UInt = 67108864u

public val VERSION_ID_JAPANESE: UInt = 16777216u

public val VERSION_ID_KOREAN: UInt = 33554432u

public val VERSION_MODEBIAS: UInt = 1u

public val VERSION_MOUSE_OPERATION: UInt = 1u

public val VERSION_QUERYPOSITION: UInt = 1u

public val VERSION_RECONVERSION: UInt = 1u

public val CB_COMMENT_MAX: UInt = 256u

public val SZ_IME_CHINA: Pcwstr = w("MSIME.China")

public val SZ_IME_JAPAN: Pcwstr = w("MSIME.Japan")

public val SZ_IME_KOREA: Pcwstr = w("MSIME.Korea")

public val SZ_IME_TAIWAN: Pcwstr = w("MSIME.Taiwan")

public val WCH_PRIVATE1: UInt = 57344u
