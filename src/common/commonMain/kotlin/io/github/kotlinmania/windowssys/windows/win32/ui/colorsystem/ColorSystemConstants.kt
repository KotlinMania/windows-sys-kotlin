package io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid

public val ATTRIB_MATTE: UInt = 2u

public val ATTRIB_TRANSPARENCY: UInt = 1u

public val BEST_MODE: UInt = 3u

public val BM_10B_G3CH: Bmformat = 1028

public val BM_10B_LAB: Bmformat = 1027

public val BM_10B_RGB: Bmformat = 9

public val BM_10B_XYZ: Bmformat = 1025

public val BM_10B_YXY: Bmformat = 1026

public val BM_16B_G3CH: Bmformat = 1284

public val BM_16B_GRAY: Bmformat = 1285

public val BM_16B_LAB: Bmformat = 1283

public val BM_16B_RGB: Bmformat = 10

public val BM_16B_XYZ: Bmformat = 1281

public val BM_16B_YXY: Bmformat = 1282

public val BM_32B_SC_ARGB: Bmformat = 1538

public val BM_32B_SC_RGB: Bmformat = 1537

public val BM_565RGB: Bmformat = 1

public val BM_5CHANNEL: Bmformat = 517

public val BM_6CHANNEL: Bmformat = 518

public val BM_7CHANNEL: Bmformat = 519

public val BM_8CHANNEL: Bmformat = 520

public val BM_BGRTRIPLETS: Bmformat = 4

public val BM_CMYKQUADS: Bmformat = 32

public val BM_G3CHTRIPLETS: Bmformat = 516

public val BM_GRAY: Bmformat = 521

public val BM_KYMCQUADS: Bmformat = 773

public val BM_LAB_TRIPLETS: Bmformat = 515

public val BM_NAMED_INDEX: Bmformat = 1029

public val BM_R10G10B10A2: Bmformat = 1793

public val BM_R10G10B10A2_XR: Bmformat = 1794

public val BM_R16G16B16A16_FLOAT: Bmformat = 1795

public val BM_RGBTRIPLETS: Bmformat = 2

public val BM_S2DOT13FIXED_SC_ARGB: Bmformat = 1540

public val BM_S2DOT13FIXED_SC_RGB: Bmformat = 1539

public val BM_XYZTRIPLETS: Bmformat = 513

public val BM_YXY_TRIPLETS: Bmformat = 514

public val BM_X555G3CH: Bmformat = 260

public val BM_X555LAB: Bmformat = 259

public val BM_X555RGB: Bmformat = 0

public val BM_X555XYZ: Bmformat = 257

public val BM_X555YXY: Bmformat = 258

public val BM_X_BGRQUADS: Bmformat = 16

public val BM_X_G3CHQUADS: Bmformat = 772

public val BM_X_RGBQUADS: Bmformat = 8

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

public val CMS_MONITOROVERFLOW: Int = -2147483648.toInt()

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

public val COLOR_10B_R10G10B10A2: Colordatatype = 5

public val COLOR_10B_R10G10B10A2_XR: Colordatatype = 6

public val COLOR_3_CHANNEL: Colortype = 6

public val COLOR_5_CHANNEL: Colortype = 8

public val COLOR_6_CHANNEL: Colortype = 9

public val COLOR_7_CHANNEL: Colortype = 10

public val COLOR_8_CHANNEL: Colortype = 11

public val COLOR_BYTE: Colordatatype = 1

public val COLOR_CMYK: Colortype = 7

public val COLOR_FLOAT: Colordatatype = 3

public val COLOR_FLOAT16: Colordatatype = 7

public val COLOR_GRAY: Colortype = 1

public val COLOR_LAB: Colortype = 5

public val COLOR_MATCH_VERSION: UInt = 512u

public val COLOR_NAMED: Colortype = 12

public val COLOR_RGB: Colortype = 2

public val COLOR_S2DOT13FIXED: Colordatatype = 4

public val COLOR_WORD: Colordatatype = 2

public val COLOR_XYZ: Colortype = 3

public val COLOR_YXY: Colortype = 4

public val CPST_ABSOLUTE_COLORIMETRIC: Colorprofilesubtype = 3

public val CPST_CUSTOM_WORKING_SPACE: Colorprofilesubtype = 6

public val CPST_EXTENDED_DISPLAY_COLOR_MODE: Colorprofilesubtype = 8

public val CPST_NONE: Colorprofilesubtype = 4

public val CPST_PERCEPTUAL: Colorprofilesubtype = 0

public val CPST_RELATIVE_COLORIMETRIC: Colorprofilesubtype = 1

public val CPST_RGB_WORKING_SPACE: Colorprofilesubtype = 5

public val CPST_SATURATION: Colorprofilesubtype = 2

public val CPST_STANDARD_DISPLAY_COLOR_MODE: Colorprofilesubtype = 7

public val CPT_CAMP: Colorprofiletype = 2

public val CPT_DMP: Colorprofiletype = 1

public val CPT_GMMP: Colorprofiletype = 3

public val CPT_ICC: Colorprofiletype = 0

public val CSA_A: UInt = 1u

public val CSA_ABC: UInt = 2u

public val CSA_CMYK: UInt = 7u

public val CSA_DEF: UInt = 3u

public val CSA_DEFG: UInt = 4u

public val CSA_GRAY: UInt = 5u

public val CSA_LAB: UInt = 8u

public val CSA_RGB: UInt = 6u

public val CS_DELETE_TRANSFORM: ColorMatchToTargetAction = 3u

public val CS_DISABLE: ColorMatchToTargetAction = 2u

public val CS_ENABLE: ColorMatchToTargetAction = 1u

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

public val ICM_ADDPROFILE: IcmCommand = 1u

public val ICM_DELETEPROFILE: IcmCommand = 2u

public val ICM_DONE_OUTSIDEDC: IcmMode = 4

public val ICM_OFF: IcmMode = 1

public val ICM_ON: IcmMode = 2

public val ICM_QUERY: IcmMode = 3

public val ICM_QUERYMATCH: IcmCommand = 7u

public val ICM_QUERYPROFILE: IcmCommand = 3u

public val ICM_REGISTERICMATCHER: IcmCommand = 5u

public val ICM_SETDEFAULTPROFILE: IcmCommand = 4u

public val ICM_UNREGISTERICMATCHER: IcmCommand = 6u

public val INDEX_DONT_CARE: UInt = 0u

public val INTENT_ABSOLUTE_COLORIMETRIC: UInt = 3u

public val INTENT_PERCEPTUAL: UInt = 0u

public val INTENT_RELATIVE_COLORIMETRIC: UInt = 1u

public val INTENT_SATURATION: UInt = 2u

public val LCS_CALIBRATED_RGB: Lcscstype = 0

public val LCS_WINDOWS_COLOR_SPACE: Lcscstype = 1466527264

public val LCS_S_RGB: Lcscstype = 1934772034

public val MAX_COLOR_CHANNELS: UInt = 8u

public val MICROSOFT_HARDWARE_COLOR_V2: WcsDeviceCapabilitiesType = 2

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

public val VIDEO_CARD_GAMMA_TABLE: WcsDeviceCapabilitiesType = 1

public val WCS_ALWAYS: UInt = 2097152u

public val WCS_DEFAULT: Int = 0

public val WCS_ICCONLY: Int = 65536

public val WCS_PROFILE_MANAGEMENT_SCOPE_CURRENT_USER: WcsProfileManagementScope = 1

public val WCS_PROFILE_MANAGEMENT_SCOPE_SYSTEM_WIDE: WcsProfileManagementScope = 0

public val CATID_WCS_PLUGIN: Guid = Guid.fromU128(U128(0xa0b402e08240405fuL, 0x8a168a5b4df2f0dduL))
