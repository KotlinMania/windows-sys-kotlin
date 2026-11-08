package io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.GUID

public val ATTRIB_MATTE: UInt = 2u

public val ATTRIB_TRANSPARENCY: UInt = 1u

public val BEST_MODE: UInt = 3u

public val BM_10b_G3CH: BMFORMAT = 1028

public val BM_10b_Lab: BMFORMAT = 1027

public val BM_10b_RGB: BMFORMAT = 9

public val BM_10b_XYZ: BMFORMAT = 1025

public val BM_10b_Yxy: BMFORMAT = 1026

public val BM_16b_G3CH: BMFORMAT = 1284

public val BM_16b_GRAY: BMFORMAT = 1285

public val BM_16b_Lab: BMFORMAT = 1283

public val BM_16b_RGB: BMFORMAT = 10

public val BM_16b_XYZ: BMFORMAT = 1281

public val BM_16b_Yxy: BMFORMAT = 1282

public val BM_32b_scARGB: BMFORMAT = 1538

public val BM_32b_scRGB: BMFORMAT = 1537

public val BM_565RGB: BMFORMAT = 1

public val BM_5CHANNEL: BMFORMAT = 517

public val BM_6CHANNEL: BMFORMAT = 518

public val BM_7CHANNEL: BMFORMAT = 519

public val BM_8CHANNEL: BMFORMAT = 520

public val BM_BGRTRIPLETS: BMFORMAT = 4

public val BM_CMYKQUADS: BMFORMAT = 32

public val BM_G3CHTRIPLETS: BMFORMAT = 516

public val BM_GRAY: BMFORMAT = 521

public val BM_KYMCQUADS: BMFORMAT = 773

public val BM_LabTRIPLETS: BMFORMAT = 515

public val BM_NAMED_INDEX: BMFORMAT = 1029

public val BM_R10G10B10A2: BMFORMAT = 1793

public val BM_R10G10B10A2_XR: BMFORMAT = 1794

public val BM_R16G16B16A16_FLOAT: BMFORMAT = 1795

public val BM_RGBTRIPLETS: BMFORMAT = 2

public val BM_S2DOT13FIXED_scARGB: BMFORMAT = 1540

public val BM_S2DOT13FIXED_scRGB: BMFORMAT = 1539

public val BM_XYZTRIPLETS: BMFORMAT = 513

public val BM_YxyTRIPLETS: BMFORMAT = 514

public val BM_x555G3CH: BMFORMAT = 260

public val BM_x555Lab: BMFORMAT = 259

public val BM_x555RGB: BMFORMAT = 0

public val BM_x555XYZ: BMFORMAT = 257

public val BM_x555Yxy: BMFORMAT = 258

public val BM_xBGRQUADS: BMFORMAT = 16

public val BM_xG3CHQUADS: BMFORMAT = 772

public val BM_xRGBQUADS: BMFORMAT = 8

public val CATID_WcsPlugin: GUID = GUID.from_u128(U128(0xa0b402e08240405fuL, 0x8a168a5b4df2f0dduL))

public val CMM_DESCRIPTION: UInt = 5u

public val CMM_DLL_VERSION: UInt = 3u

public val CMM_DRIVER_VERSION: UInt = 2u

public val CMM_FROM_PROFILE: UInt = 0u

public val CMM_IDENT: UInt = 1u

public val CMM_LOGOICON: UInt = 6u

public val CMM_VERSION: UInt = 4u

public val CMM_WIN_VERSION: UInt = 0u

public val CMS_BACKWARD: UInt = 1u

public val CMS_DISABLEICM: UInt = 1u

public val CMS_DISABLEINTENT: UInt = 1024u

public val CMS_DISABLERENDERINTENT: UInt = 2048u

public val CMS_ENABLEPROOFING: UInt = 2u

public val CMS_FORWARD: UInt = 0u

public val CMS_MONITOROVERFLOW: Int = -2147483648

public val CMS_PRINTEROVERFLOW: Int = 1073741824

public val CMS_SETMONITORPROFILE: UInt = 16u

public val CMS_SETPRINTERPROFILE: UInt = 32u

public val CMS_SETPROOFINTENT: UInt = 8u

public val CMS_SETRENDERINTENT: UInt = 4u

public val CMS_SETTARGETPROFILE: UInt = 64u

public val CMS_TARGETOVERFLOW: Int = 536870912

public val CMS_USEAPPLYCALLBACK: UInt = 256u

public val CMS_USEDESCRIPTION: UInt = 512u

public val CMS_USEHOOK: UInt = 128u

public val COLOR_10b_R10G10B10A2: COLORDATATYPE = 5

public val COLOR_10b_R10G10B10A2_XR: COLORDATATYPE = 6

public val COLOR_3_CHANNEL: COLORTYPE = 6

public val COLOR_5_CHANNEL: COLORTYPE = 8

public val COLOR_6_CHANNEL: COLORTYPE = 9

public val COLOR_7_CHANNEL: COLORTYPE = 10

public val COLOR_8_CHANNEL: COLORTYPE = 11

public val COLOR_BYTE: COLORDATATYPE = 1

public val COLOR_CMYK: COLORTYPE = 7

public val COLOR_FLOAT: COLORDATATYPE = 3

public val COLOR_FLOAT16: COLORDATATYPE = 7

public val COLOR_GRAY: COLORTYPE = 1

public val COLOR_Lab: COLORTYPE = 5

public val COLOR_MATCH_VERSION: UInt = 512u

public val COLOR_NAMED: COLORTYPE = 12

public val COLOR_RGB: COLORTYPE = 2

public val COLOR_S2DOT13FIXED: COLORDATATYPE = 4

public val COLOR_WORD: COLORDATATYPE = 2

public val COLOR_XYZ: COLORTYPE = 3

public val COLOR_Yxy: COLORTYPE = 4

public val CPST_ABSOLUTE_COLORIMETRIC: COLORPROFILESUBTYPE = 3

public val CPST_CUSTOM_WORKING_SPACE: COLORPROFILESUBTYPE = 6

public val CPST_EXTENDED_DISPLAY_COLOR_MODE: COLORPROFILESUBTYPE = 8

public val CPST_NONE: COLORPROFILESUBTYPE = 4

public val CPST_PERCEPTUAL: COLORPROFILESUBTYPE = 0

public val CPST_RELATIVE_COLORIMETRIC: COLORPROFILESUBTYPE = 1

public val CPST_RGB_WORKING_SPACE: COLORPROFILESUBTYPE = 5

public val CPST_SATURATION: COLORPROFILESUBTYPE = 2

public val CPST_STANDARD_DISPLAY_COLOR_MODE: COLORPROFILESUBTYPE = 7

public val CPT_CAMP: COLORPROFILETYPE = 2

public val CPT_DMP: COLORPROFILETYPE = 1

public val CPT_GMMP: COLORPROFILETYPE = 3

public val CPT_ICC: COLORPROFILETYPE = 0

public val CSA_A: UInt = 1u

public val CSA_ABC: UInt = 2u

public val CSA_CMYK: UInt = 7u

public val CSA_DEF: UInt = 3u

public val CSA_DEFG: UInt = 4u

public val CSA_GRAY: UInt = 5u

public val CSA_Lab: UInt = 8u

public val CSA_RGB: UInt = 6u

public val CS_DELETE_TRANSFORM: COLOR_MATCH_TO_TARGET_ACTION = 3u

public val CS_DISABLE: COLOR_MATCH_TO_TARGET_ACTION = 2u

public val CS_ENABLE: COLOR_MATCH_TO_TARGET_ACTION = 1u

public val DONT_USE_EMBEDDED_WCS_PROFILES: Int = 1

public val ENABLE_GAMUT_CHECKING: UInt = 65536u

public val ENUM_TYPE_VERSION: UInt = 768u

public val ET_ATTRIBUTES: UInt = 8192u

public val ET_CLASS: UInt = 32u

public val ET_CMMTYPE: UInt = 16u

public val ET_CONNECTIONSPACE: UInt = 128u

public val ET_CREATOR: UInt = 32768u

public val ET_DATACOLORSPACE: UInt = 64u

public val ET_DEVICECLASS: UInt = 65536u

public val ET_DEVICENAME: UInt = 1u

public val ET_DITHERMODE: UInt = 4u

public val ET_EXTENDEDDISPLAYCOLOR: UInt = 262144u

public val ET_MANUFACTURER: UInt = 2048u

public val ET_MEDIATYPE: UInt = 2u

public val ET_MODEL: UInt = 4096u

public val ET_PLATFORM: UInt = 512u

public val ET_PROFILEFLAGS: UInt = 1024u

public val ET_RENDERINGINTENT: UInt = 16384u

public val ET_RESOLUTION: UInt = 8u

public val ET_SIGNATURE: UInt = 256u

public val ET_STANDARDDISPLAYCOLOR: UInt = 131072u

public val FAST_TRANSLATE: UInt = 262144u

public val FLAG_DEPENDENTONDATA: UInt = 2u

public val FLAG_EMBEDDEDPROFILE: UInt = 1u

public val FLAG_ENABLE_CHROMATIC_ADAPTATION: UInt = 33554432u

public val ICM_ADDPROFILE: ICM_COMMAND = 1u

public val ICM_DELETEPROFILE: ICM_COMMAND = 2u

public val ICM_DONE_OUTSIDEDC: ICM_MODE = 4

public val ICM_OFF: ICM_MODE = 1

public val ICM_ON: ICM_MODE = 2

public val ICM_QUERY: ICM_MODE = 3

public val ICM_QUERYMATCH: ICM_COMMAND = 7u

public val ICM_QUERYPROFILE: ICM_COMMAND = 3u

public val ICM_REGISTERICMATCHER: ICM_COMMAND = 5u

public val ICM_SETDEFAULTPROFILE: ICM_COMMAND = 4u

public val ICM_UNREGISTERICMATCHER: ICM_COMMAND = 6u

public val INDEX_DONT_CARE: UInt = 0u

public val INTENT_ABSOLUTE_COLORIMETRIC: UInt = 3u

public val INTENT_PERCEPTUAL: UInt = 0u

public val INTENT_RELATIVE_COLORIMETRIC: UInt = 1u

public val INTENT_SATURATION: UInt = 2u

public val LCS_CALIBRATED_RGB: LCSCSTYPE = 0

public val LCS_WINDOWS_COLOR_SPACE: LCSCSTYPE = 1466527264

public val LCS_sRGB: LCSCSTYPE = 1934772034

public val MAX_COLOR_CHANNELS: UInt = 8u

public val MicrosoftHardwareColorV2: WCS_DEVICE_CAPABILITIES_TYPE = 2

public val NORMAL_MODE: UInt = 2u

public val PRESERVEBLACK: UInt = 1048576u

public val PROFILE_FILENAME: UInt = 1u

public val PROFILE_MEMBUFFER: UInt = 2u

public val PROFILE_READ: UInt = 1u

public val PROFILE_READWRITE: UInt = 2u

public val PROOF_MODE: UInt = 1u

public val RESERVED: UInt = 2147483648u

public val SEQUENTIAL_TRANSFORM: UInt = 2155872256u

public val USE_RELATIVE_COLORIMETRIC: UInt = 131072u

public val VideoCardGammaTable: WCS_DEVICE_CAPABILITIES_TYPE = 1

public val WCS_ALWAYS: UInt = 2097152u

public val WCS_DEFAULT: Int = 0

public val WCS_ICCONLY: Int = 65536

public val WCS_PROFILE_MANAGEMENT_SCOPE_CURRENT_USER: WCS_PROFILE_MANAGEMENT_SCOPE = 1

public val WCS_PROFILE_MANAGEMENT_SCOPE_SYSTEM_WIDE: WCS_PROFILE_MANAGEMENT_SCOPE = 0
