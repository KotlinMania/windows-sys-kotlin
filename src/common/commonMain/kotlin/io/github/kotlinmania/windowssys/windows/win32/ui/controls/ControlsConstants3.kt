package io.github.kotlinmania.windowssys.windows.win32.ui.controls

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val TDM_SET_BUTTON_ELEVATION_REQUIRED_STATE: TaskdialogMessages = 1139

public val TDM_SET_ELEMENT_TEXT: TaskdialogMessages = 1132

public val TDM_SET_MARQUEE_PROGRESS_BAR: TaskdialogMessages = 1127

public val TDM_SET_PROGRESS_BAR_MARQUEE: TaskdialogMessages = 1131

public val TDM_SET_PROGRESS_BAR_POS: TaskdialogMessages = 1130

public val TDM_SET_PROGRESS_BAR_RANGE: TaskdialogMessages = 1129

public val TDM_SET_PROGRESS_BAR_STATE: TaskdialogMessages = 1128

public val TDM_UPDATE_ELEMENT_TEXT: TaskdialogMessages = 1138

public val TDM_UPDATE_ICON: TaskdialogMessages = 1140

public val TDN_BUTTON_CLICKED: TaskdialogNotifications = 2

public val TDN_CREATED: TaskdialogNotifications = 0

public val TDN_DESTROYED: TaskdialogNotifications = 5

public val TDN_DIALOG_CONSTRUCTED: TaskdialogNotifications = 7

public val TDN_EXPANDO_BUTTON_CLICKED: TaskdialogNotifications = 10

public val TDN_HELP: TaskdialogNotifications = 9

public val TDN_HYPERLINK_CLICKED: TaskdialogNotifications = 3

public val TDN_NAVIGATED: TaskdialogNotifications = 1

public val TDN_RADIO_BUTTON_CLICKED: TaskdialogNotifications = 6

public val TDN_TIMER: TaskdialogNotifications = 4

public val TDN_VERIFICATION_CLICKED: TaskdialogNotifications = 8

public val TDP_FLASHBUTTON: Taskbandparts = 2

public val TDP_FLASHBUTTONGROUPMENU: Taskbandparts = 3

public val TDP_GROUPCOUNT: Taskbandparts = 1

public val TD_ERROR_ICON: Pcwstr = COpaquePointer((65534u.toUShort()).toLong())

public val TD_INFORMATION_ICON: Pcwstr = COpaquePointer((65533u.toUShort()).toLong())

public val TD_SHIELD_ICON: Pcwstr = COpaquePointer((65532u.toUShort()).toLong())

public val TD_WARNING_ICON: Pcwstr = COpaquePointer((65535u.toUShort()).toLong())

public val TEXT_BODYTEXT: Textstyleparts = 4

public val TEXT_BODYTITLE: Textstyleparts = 3

public val TEXT_CONTROLLABEL: Textstyleparts = 9

public val TEXT_EXPANDED: Textstyleparts = 7

public val TEXT_HYPERLINKTEXT: Textstyleparts = 6

public val TEXT_INSTRUCTION: Textstyleparts = 2

public val TEXT_LABEL: Textstyleparts = 8

public val TEXT_MAININSTRUCTION: Textstyleparts = 1

public val TEXT_SECONDARYTEXT: Textstyleparts = 5

public val TIBES_DISABLED: Tabitembothedgestates = 4

public val TIBES_FOCUSED: Tabitembothedgestates = 5

public val TIBES_HOT: Tabitembothedgestates = 2

public val TIBES_NORMAL: Tabitembothedgestates = 1

public val TIBES_SELECTED: Tabitembothedgestates = 3

public val TILES_DISABLED: Tabitemleftedgestates = 4

public val TILES_FOCUSED: Tabitemleftedgestates = 5

public val TILES_HOT: Tabitemleftedgestates = 2

public val TILES_NORMAL: Tabitemleftedgestates = 1

public val TILES_SELECTED: Tabitemleftedgestates = 3

public val TIRES_DISABLED: Tabitemrightedgestates = 4

public val TIRES_FOCUSED: Tabitemrightedgestates = 5

public val TIRES_HOT: Tabitemrightedgestates = 2

public val TIRES_NORMAL: Tabitemrightedgestates = 1

public val TIRES_SELECTED: Tabitemrightedgestates = 3

public val TIS_DISABLED: Tabitemstates = 4

public val TIS_FOCUSED: Tabitemstates = 5

public val TIS_HOT: Tabitemstates = 2

public val TIS_NORMAL: Tabitemstates = 1

public val TIS_SELECTED: Tabitemstates = 3

public val TKP_THUMB: Trackbarparts = 3

public val TKP_THUMBBOTTOM: Trackbarparts = 4

public val TKP_THUMBLEFT: Trackbarparts = 7

public val TKP_THUMBRIGHT: Trackbarparts = 8

public val TKP_THUMBTOP: Trackbarparts = 5

public val TKP_THUMBVERT: Trackbarparts = 6

public val TKP_TICS: Trackbarparts = 9

public val TKP_TICSVERT: Trackbarparts = 10

public val TKP_TRACK: Trackbarparts = 1

public val TKP_TRACKVERT: Trackbarparts = 2

public val TKS_NORMAL: Trackbarstylestates = 1

public val TMTVS_RESERVEDHIGH: UInt = 19999u

public val TMTVS_RESERVEDLOW: UInt = 100000u

public val TMT_ACCENTCOLORHINT: ThemePropertySymbolId = 3823u

public val TMT_ACTIVEBORDER: ThemePropertySymbolId = 1611u

public val TMT_ACTIVECAPTION: ThemePropertySymbolId = 1603u

public val TMT_ALIAS: ThemePropertySymbolId = 1404u

public val TMT_ALPHALEVEL: ThemePropertySymbolId = 2402u

public val TMT_ALPHATHRESHOLD: ThemePropertySymbolId = 2415u

public val TMT_ALWAYSSHOWSIZINGBAR: ThemePropertySymbolId = 2208u

public val TMT_ANIMATIONBUTTONRECT: ThemePropertySymbolId = 5005u

public val TMT_ANIMATIONDELAY: ThemePropertySymbolId = 2428u

public val TMT_ANIMATIONDURATION: ThemePropertySymbolId = 5006u

public val TMT_APPWORKSPACE: ThemePropertySymbolId = 1613u

public val TMT_ATLASIMAGE: ThemePropertySymbolId = 8000u

public val TMT_ATLASINPUTIMAGE: ThemePropertySymbolId = 8001u

public val TMT_ATLASRECT: ThemePropertySymbolId = 8002u

public val TMT_AUTHOR: ThemePropertySymbolId = 604u

public val TMT_AUTOSIZE: ThemePropertySymbolId = 2202u

public val TMT_BACKGROUND: ThemePropertySymbolId = 1602u

public val TMT_BGFILL: ThemePropertySymbolId = 2205u

public val TMT_BGTYPE: ThemePropertySymbolId = 4001u

public val TMT_BITMAPREF: ThemePropertySymbolId = 215u

public val TMT_BLENDCOLOR: ThemePropertySymbolId = 5003u

public val TMT_BODYFONT: ThemePropertySymbolId = 809u

public val TMT_BODYTEXTCOLOR: ThemePropertySymbolId = 3827u

public val TMT_BOOL: ThemePropertySymbolId = 203u

public val TMT_BORDERCOLOR: ThemePropertySymbolId = 3801u

public val TMT_BORDERCOLORHINT: ThemePropertySymbolId = 3822u

public val TMT_BORDERONLY: ThemePropertySymbolId = 2203u

public val TMT_BORDERSIZE: ThemePropertySymbolId = 2403u

public val TMT_BORDERTYPE: ThemePropertySymbolId = 4002u

public val TMT_BTNFACE: ThemePropertySymbolId = 1616u

public val TMT_BTNHIGHLIGHT: ThemePropertySymbolId = 1621u

public val TMT_BTNSHADOW: ThemePropertySymbolId = 1617u

public val TMT_BTNTEXT: ThemePropertySymbolId = 1619u

public val TMT_BUTTONALTERNATEFACE: ThemePropertySymbolId = 1626u

public val TMT_CAPTIONBARHEIGHT: ThemePropertySymbolId = 1205u

public val TMT_CAPTIONBARWIDTH: ThemePropertySymbolId = 1204u

public val TMT_CAPTIONFONT: ThemePropertySymbolId = 801u

public val TMT_CAPTIONMARGINS: ThemePropertySymbolId = 3603u

public val TMT_CAPTIONTEXT: ThemePropertySymbolId = 1610u

public val TMT_CHARSET: ThemePropertySymbolId = 403u

public val TMT_CLASSICVALUE: ThemePropertySymbolId = 3202u

public val TMT_COLOR: ThemePropertySymbolId = 204u

public val TMT_COLORIZATIONCOLOR: ThemePropertySymbolId = 2431u

public val TMT_COLORIZATIONOPACITY: ThemePropertySymbolId = 2432u

public val TMT_COLORSCHEMES: ThemePropertySymbolId = 401u

public val TMT_COMPANY: ThemePropertySymbolId = 603u

public val TMT_COMPOSITED: ThemePropertySymbolId = 2204u

public val TMT_COMPOSITEDOPAQUE: ThemePropertySymbolId = 2219u

public val TMT_CONTENTALIGNMENT: ThemePropertySymbolId = 4006u

public val TMT_CONTENTMARGINS: ThemePropertySymbolId = 3602u

public val TMT_COPYRIGHT: ThemePropertySymbolId = 605u

public val TMT_CSSNAME: ThemePropertySymbolId = 1401u

public val TMT_CUSTOMSPLITRECT: ThemePropertySymbolId = 5004u

public val TMT_DEFAULTPANESIZE: ThemePropertySymbolId = 5002u

public val TMT_DESCRIPTION: ThemePropertySymbolId = 608u

public val TMT_DIBDATA: ThemePropertySymbolId = 2u

public val TMT_DISKSTREAM: ThemePropertySymbolId = 213u

public val TMT_DISPLAYNAME: ThemePropertySymbolId = 601u

public val TMT_DKSHADOW3D: ThemePropertySymbolId = 1622u

public val TMT_DRAWBORDERS: ThemePropertySymbolId = 2214u

public val TMT_EDGEDKSHADOWCOLOR: ThemePropertySymbolId = 3807u

public val TMT_EDGEFILLCOLOR: ThemePropertySymbolId = 3808u

public val TMT_EDGEHIGHLIGHTCOLOR: ThemePropertySymbolId = 3805u

public val TMT_EDGELIGHTCOLOR: ThemePropertySymbolId = 3804u

public val TMT_EDGESHADOWCOLOR: ThemePropertySymbolId = 3806u

public val TMT_ENUM: ThemePropertySymbolId = 200u

public val TMT_FILENAME: ThemePropertySymbolId = 206u

public val TMT_FILLCOLOR: ThemePropertySymbolId = 3802u

public val TMT_FILLCOLORHINT: ThemePropertySymbolId = 3821u

public val TMT_FILLTYPE: ThemePropertySymbolId = 4003u

public val TMT_FIRSTBOOL: ThemePropertySymbolId = 1001u

public val TMT_FIRSTCOLOR: ThemePropertySymbolId = 1601u

public val TMT_FIRSTFONT: ThemePropertySymbolId = 801u

public val TMT_FIRSTINT: ThemePropertySymbolId = 1301u

public val TMT_FIRSTSIZE: ThemePropertySymbolId = 1201u

public val TMT_FIRSTSTRING: ThemePropertySymbolId = 1401u

public val TMT_FIRST_RCSTRING_NAME: ThemePropertySymbolId = 601u

public val TMT_FLATMENUS: ThemePropertySymbolId = 1001u

public val TMT_FLOAT: ThemePropertySymbolId = 216u

public val TMT_FLOATLIST: ThemePropertySymbolId = 217u

public val TMT_FONT: ThemePropertySymbolId = 210u

public val TMT_FRAMESPERSECOND: ThemePropertySymbolId = 2426u

public val TMT_FROMCOLOR1: ThemePropertySymbolId = 2001u

public val TMT_FROMCOLOR2: ThemePropertySymbolId = 2002u

public val TMT_FROMCOLOR3: ThemePropertySymbolId = 2003u

public val TMT_FROMCOLOR4: ThemePropertySymbolId = 2004u

public val TMT_FROMCOLOR5: ThemePropertySymbolId = 2005u

public val TMT_FROMHUE1: ThemePropertySymbolId = 1801u

public val TMT_FROMHUE2: ThemePropertySymbolId = 1802u

public val TMT_FROMHUE3: ThemePropertySymbolId = 1803u

public val TMT_FROMHUE4: ThemePropertySymbolId = 1804u

public val TMT_FROMHUE5: ThemePropertySymbolId = 1805u

public val TMT_GLOWCOLOR: ThemePropertySymbolId = 3816u

public val TMT_GLOWINTENSITY: ThemePropertySymbolId = 2429u

public val TMT_GLYPHDIBDATA: ThemePropertySymbolId = 8u

public val TMT_GLYPHFONT: ThemePropertySymbolId = 2601u

public val TMT_GLYPHFONTSIZINGTYPE: ThemePropertySymbolId = 4014u

public val TMT_GLYPHIMAGEFILE: ThemePropertySymbolId = 3008u

public val TMT_GLYPHINDEX: ThemePropertySymbolId = 2418u

public val TMT_GLYPHONLY: ThemePropertySymbolId = 2207u

public val TMT_GLYPHTEXTCOLOR: ThemePropertySymbolId = 3819u

public val TMT_GLYPHTRANSPARENT: ThemePropertySymbolId = 2206u

public val TMT_GLYPHTRANSPARENTCOLOR: ThemePropertySymbolId = 3820u

public val TMT_GLYPHTYPE: ThemePropertySymbolId = 4012u

public val TMT_GRADIENTACTIVECAPTION: ThemePropertySymbolId = 1628u

public val TMT_GRADIENTCOLOR1: ThemePropertySymbolId = 3810u

public val TMT_GRADIENTCOLOR2: ThemePropertySymbolId = 3811u

public val TMT_GRADIENTCOLOR3: ThemePropertySymbolId = 3812u

public val TMT_GRADIENTCOLOR4: ThemePropertySymbolId = 3813u

public val TMT_GRADIENTCOLOR5: ThemePropertySymbolId = 3814u

public val TMT_GRADIENTINACTIVECAPTION: ThemePropertySymbolId = 1629u

public val TMT_GRADIENTRATIO1: ThemePropertySymbolId = 2406u

public val TMT_GRADIENTRATIO2: ThemePropertySymbolId = 2407u

public val TMT_GRADIENTRATIO3: ThemePropertySymbolId = 2408u

public val TMT_GRADIENTRATIO4: ThemePropertySymbolId = 2409u

public val TMT_GRADIENTRATIO5: ThemePropertySymbolId = 2410u

public val TMT_GRAYTEXT: ThemePropertySymbolId = 1618u

public val TMT_HALIGN: ThemePropertySymbolId = 4005u

public val TMT_HBITMAP: ThemePropertySymbolId = 212u

public val TMT_HEADING1FONT: ThemePropertySymbolId = 807u

public val TMT_HEADING1TEXTCOLOR: ThemePropertySymbolId = 3825u

public val TMT_HEADING2FONT: ThemePropertySymbolId = 808u

public val TMT_HEADING2TEXTCOLOR: ThemePropertySymbolId = 3826u

public val TMT_HEIGHT: ThemePropertySymbolId = 2417u

public val TMT_HIGHLIGHT: ThemePropertySymbolId = 1614u

public val TMT_HIGHLIGHTTEXT: ThemePropertySymbolId = 1615u

public val TMT_HOTTRACKING: ThemePropertySymbolId = 1627u

public val TMT_ICONEFFECT: ThemePropertySymbolId = 4009u

public val TMT_ICONTITLEFONT: ThemePropertySymbolId = 806u

public val TMT_IMAGECOUNT: ThemePropertySymbolId = 2401u

public val TMT_IMAGEFILE: ThemePropertySymbolId = 3001u

public val TMT_IMAGEFILE1: ThemePropertySymbolId = 3002u

public val TMT_IMAGEFILE2: ThemePropertySymbolId = 3003u

public val TMT_IMAGEFILE3: ThemePropertySymbolId = 3004u

public val TMT_IMAGEFILE4: ThemePropertySymbolId = 3005u

public val TMT_IMAGEFILE5: ThemePropertySymbolId = 3006u

public val TMT_IMAGEFILE6: ThemePropertySymbolId = 3009u

public val TMT_IMAGEFILE7: ThemePropertySymbolId = 3010u

public val TMT_IMAGELAYOUT: ThemePropertySymbolId = 4011u

public val TMT_IMAGESELECTTYPE: ThemePropertySymbolId = 4013u

public val TMT_INACTIVEBORDER: ThemePropertySymbolId = 1612u

public val TMT_INACTIVECAPTION: ThemePropertySymbolId = 1604u

public val TMT_INACTIVECAPTIONTEXT: ThemePropertySymbolId = 1620u

public val TMT_INFOBK: ThemePropertySymbolId = 1625u

public val TMT_INFOTEXT: ThemePropertySymbolId = 1624u

public val TMT_INT: ThemePropertySymbolId = 202u

public val TMT_INTEGRALSIZING: ThemePropertySymbolId = 2211u

public val TMT_INTLIST: ThemePropertySymbolId = 211u

public val TMT_LASTBOOL: ThemePropertySymbolId = 1001u

public val TMT_LASTCOLOR: ThemePropertySymbolId = 1631u

public val TMT_LASTFONT: ThemePropertySymbolId = 809u

public val TMT_LASTINT: ThemePropertySymbolId = 1301u

public val TMT_LASTSIZE: ThemePropertySymbolId = 1210u

public val TMT_LASTSTRING: ThemePropertySymbolId = 1404u

public val TMT_LASTUPDATED: ThemePropertySymbolId = 1403u

public val TMT_LAST_RCSTRING_NAME: ThemePropertySymbolId = 608u

public val TMT_LIGHT3D: ThemePropertySymbolId = 1623u

public val TMT_LOCALIZEDMIRRORIMAGE: ThemePropertySymbolId = 2220u

public val TMT_MARGINS: ThemePropertySymbolId = 205u

public val TMT_MENU: ThemePropertySymbolId = 1605u

public val TMT_MENUBAR: ThemePropertySymbolId = 1631u

public val TMT_MENUBARHEIGHT: ThemePropertySymbolId = 1209u

public val TMT_MENUBARWIDTH: ThemePropertySymbolId = 1208u

public val TMT_MENUFONT: ThemePropertySymbolId = 803u

public val TMT_MENUHILIGHT: ThemePropertySymbolId = 1630u

public val TMT_MENUTEXT: ThemePropertySymbolId = 1608u

public val TMT_MINCOLORDEPTH: ThemePropertySymbolId = 1301u

public val TMT_MINDPI1: ThemePropertySymbolId = 2420u

public val TMT_MINDPI2: ThemePropertySymbolId = 2421u

public val TMT_MINDPI3: ThemePropertySymbolId = 2422u

public val TMT_MINDPI4: ThemePropertySymbolId = 2423u

public val TMT_MINDPI5: ThemePropertySymbolId = 2424u

public val TMT_MINDPI6: ThemePropertySymbolId = 2433u

public val TMT_MINDPI7: ThemePropertySymbolId = 2434u

public val TMT_MINSIZE: ThemePropertySymbolId = 3403u

public val TMT_MINSIZE1: ThemePropertySymbolId = 3404u

public val TMT_MINSIZE2: ThemePropertySymbolId = 3405u

public val TMT_MINSIZE3: ThemePropertySymbolId = 3406u

public val TMT_MINSIZE4: ThemePropertySymbolId = 3407u

public val TMT_MINSIZE5: ThemePropertySymbolId = 3408u

public val TMT_MINSIZE6: ThemePropertySymbolId = 3410u

public val TMT_MINSIZE7: ThemePropertySymbolId = 3411u

public val TMT_MIRRORIMAGE: ThemePropertySymbolId = 2209u

public val TMT_MSGBOXFONT: ThemePropertySymbolId = 805u

public val TMT_NAME: ThemePropertySymbolId = 600u

public val TMT_NOETCHEDEFFECT: ThemePropertySymbolId = 2215u

public val TMT_NORMALSIZE: ThemePropertySymbolId = 3409u

public val TMT_OFFSET: ThemePropertySymbolId = 3401u

public val TMT_OFFSETTYPE: ThemePropertySymbolId = 4008u

public val TMT_OPACITY: ThemePropertySymbolId = 2430u

public val TMT_PADDEDBORDERWIDTH: ThemePropertySymbolId = 1210u

public val TMT_PIXELSPERFRAME: ThemePropertySymbolId = 2427u

public val TMT_POSITION: ThemePropertySymbolId = 208u

public val TMT_PROGRESSCHUNKSIZE: ThemePropertySymbolId = 2411u

public val TMT_PROGRESSSPACESIZE: ThemePropertySymbolId = 2412u

public val TMT_RECT: ThemePropertySymbolId = 209u

public val TMT_RESERVEDHIGH: ThemePropertySymbolId = 7999u

public val TMT_RESERVEDLOW: ThemePropertySymbolId = 0u

public val TMT_ROUNDCORNERHEIGHT: ThemePropertySymbolId = 2405u

public val TMT_ROUNDCORNERWIDTH: ThemePropertySymbolId = 2404u

public val TMT_SATURATION: ThemePropertySymbolId = 2413u

public val TMT_SCALEDBACKGROUND: ThemePropertySymbolId = 7001u

public val TMT_SCROLLBAR: ThemePropertySymbolId = 1601u

public val TMT_SCROLLBARHEIGHT: ThemePropertySymbolId = 1203u

public val TMT_SCROLLBARWIDTH: ThemePropertySymbolId = 1202u

public val TMT_SHADOWCOLOR: ThemePropertySymbolId = 3815u

public val TMT_SIZE: ThemePropertySymbolId = 207u

public val TMT_SIZES: ThemePropertySymbolId = 402u

public val TMT_SIZINGBORDERWIDTH: ThemePropertySymbolId = 1201u

public val TMT_SIZINGMARGINS: ThemePropertySymbolId = 3601u

public val TMT_SIZINGTYPE: ThemePropertySymbolId = 4004u

public val TMT_SMALLCAPTIONFONT: ThemePropertySymbolId = 802u

public val TMT_SMCAPTIONBARHEIGHT: ThemePropertySymbolId = 1207u

public val TMT_SMCAPTIONBARWIDTH: ThemePropertySymbolId = 1206u

public val TMT_SOURCEGROW: ThemePropertySymbolId = 2212u

public val TMT_SOURCESHRINK: ThemePropertySymbolId = 2213u

public val TMT_STATUSFONT: ThemePropertySymbolId = 804u

public val TMT_STREAM: ThemePropertySymbolId = 214u

public val TMT_STRING: ThemePropertySymbolId = 201u

public val TMT_TEXT: ThemePropertySymbolId = 3201u

public val TMT_TEXTAPPLYOVERLAY: ThemePropertySymbolId = 2216u

public val TMT_TEXTBORDERCOLOR: ThemePropertySymbolId = 3817u

public val TMT_TEXTBORDERSIZE: ThemePropertySymbolId = 2414u

public val TMT_TEXTCOLOR: ThemePropertySymbolId = 3803u

public val TMT_TEXTCOLORHINT: ThemePropertySymbolId = 3824u

public val TMT_TEXTGLOW: ThemePropertySymbolId = 2217u

public val TMT_TEXTGLOWSIZE: ThemePropertySymbolId = 2425u

public val TMT_TEXTITALIC: ThemePropertySymbolId = 2218u

public val TMT_TEXTSHADOWCOLOR: ThemePropertySymbolId = 3818u

public val TMT_TEXTSHADOWOFFSET: ThemePropertySymbolId = 3402u

public val TMT_TEXTSHADOWTYPE: ThemePropertySymbolId = 4010u

public val TMT_TOCOLOR1: ThemePropertySymbolId = 2006u

public val TMT_TOCOLOR2: ThemePropertySymbolId = 2007u

public val TMT_TOCOLOR3: ThemePropertySymbolId = 2008u

public val TMT_TOCOLOR4: ThemePropertySymbolId = 2009u

public val TMT_TOCOLOR5: ThemePropertySymbolId = 2010u

public val TMT_TOHUE1: ThemePropertySymbolId = 1806u

public val TMT_TOHUE2: ThemePropertySymbolId = 1807u

public val TMT_TOHUE3: ThemePropertySymbolId = 1808u

public val TMT_TOHUE4: ThemePropertySymbolId = 1809u

public val TMT_TOHUE5: ThemePropertySymbolId = 1810u

public val TMT_TOOLTIP: ThemePropertySymbolId = 602u

public val TMT_TRANSITIONDURATIONS: ThemePropertySymbolId = 6000u

public val TMT_TRANSPARENT: ThemePropertySymbolId = 2201u

public val TMT_TRANSPARENTCOLOR: ThemePropertySymbolId = 3809u

public val TMT_TRUESIZESCALINGTYPE: ThemePropertySymbolId = 4015u

public val TMT_TRUESIZESTRETCHMARK: ThemePropertySymbolId = 2419u

public val TMT_UNIFORMSIZING: ThemePropertySymbolId = 2210u

public val TMT_URL: ThemePropertySymbolId = 606u

public val TMT_USERPICTURE: ThemePropertySymbolId = 5001u

public val TMT_VALIGN: ThemePropertySymbolId = 4007u

public val TMT_VERSION: ThemePropertySymbolId = 607u

public val TMT_WIDTH: ThemePropertySymbolId = 2416u

public val TMT_WINDOW: ThemePropertySymbolId = 1606u

public val TMT_WINDOWFRAME: ThemePropertySymbolId = 1607u

public val TMT_WINDOWTEXT: ThemePropertySymbolId = 1609u

public val TMT_XMLNAME: ThemePropertySymbolId = 1402u

public val TNP_ANIMBACKGROUND: Traynotifyparts = 2

public val TNP_BACKGROUND: Traynotifyparts = 1

public val TOOLBARCLASSNAME: Pcwstr = w("ToolbarWindow32")

public val TOOLBARCLASSNAMEA: Pcstr = s("ToolbarWindow32")

public val TOOLBARCLASSNAMEW: Pcwstr = w("ToolbarWindow32")

public val TOOLTIPS_CLASS: Pcwstr = w("tooltips_class32")

public val TOOLTIPS_CLASSA: Pcstr = s("tooltips_class32")

public val TOOLTIPS_CLASSW: Pcwstr = w("tooltips_class32")

public val TP_BUTTON: Toolbarparts = 1

public val TP_DROPDOWNBUTTON: Toolbarparts = 2

public val TP_DROPDOWNBUTTONGLYPH: Toolbarparts = 7

public val TP_SEPARATOR: Toolbarparts = 5

public val TP_SEPARATORVERT: Toolbarparts = 6

public val TP_SPLITBUTTON: Toolbarparts = 3

public val TP_SPLITBUTTONDROPDOWN: Toolbarparts = 4

public val TRACKBAR_CLASS: Pcwstr = w("msctls_trackbar32")

public val TRACKBAR_CLASSA: Pcstr = s("msctls_trackbar32")

public val TRACKBAR_CLASSW: Pcwstr = w("msctls_trackbar32")

public val TRBN_FIRST: UInt = 4294965795u

public val TRBN_LAST: UInt = 4294965777u

public val TRBN_THUMBPOSCHANGING: UInt = 4294965794u

public val TREIS_DISABLED: Treeitemstates = 4

public val TREIS_HOT: Treeitemstates = 2

public val TREIS_HOTSELECTED: Treeitemstates = 6

public val TREIS_NORMAL: Treeitemstates = 1

public val TREIS_SELECTED: Treeitemstates = 3

public val TREIS_SELECTEDNOTFOCUS: Treeitemstates = 5

public val TRS_NORMAL: Trackstates = 1

public val TRVS_NORMAL: Trackvertstates = 1

public val TSGP_GRIPPER: Textselectiongripperparts = 1

public val TSGS_CENTERED: Gripperstates = 2

public val TSGS_NORMAL: Gripperstates = 1

public val TSST_DPI: Truesizescalingtype = 2

public val TSST_NONE: Truesizescalingtype = 0

public val TSST_SIZE: Truesizescalingtype = 1

public val TSS_NORMAL: Ticsstates = 1

public val TST_CONTINUOUS: Textshadowtype = 2

public val TST_NONE: Textshadowtype = 0

public val TST_SINGLE: Textshadowtype = 1

public val TSVS_NORMAL: Ticsvertstates = 1

public val TS_CHECKED: Toolbarstylestates = 5

public val TS_CONTROLLABEL_DISABLED: Controllabelstates = 2

public val TS_CONTROLLABEL_NORMAL: Controllabelstates = 1

public val TS_DISABLED: Toolbarstylestates = 4

public val TS_DRAW: Themesize = 2

public val TS_HOT: Toolbarstylestates = 2

public val TS_HOTCHECKED: Toolbarstylestates = 6

public val TS_HYPERLINK_DISABLED: Hyperlinktextstates = 4

public val TS_HYPERLINK_HOT: Hyperlinktextstates = 2

public val TS_HYPERLINK_NORMAL: Hyperlinktextstates = 1

public val TS_HYPERLINK_PRESSED: Hyperlinktextstates = 3

public val TS_MIN: Themesize = 0

public val TS_NEARHOT: Toolbarstylestates = 7

public val TS_NORMAL: Toolbarstylestates = 1

public val TS_OTHERSIDEHOT: Toolbarstylestates = 8

public val TS_PRESSED: Toolbarstylestates = 3

public val TS_TRUE: Themesize = 1

public val TTBSS_POINTINGDOWNCENTERED: Balloonstemstates = 5

public val TTBSS_POINTINGDOWNLEFTWALL: Balloonstemstates = 6

public val TTBSS_POINTINGDOWNRIGHTWALL: Balloonstemstates = 4

public val TTBSS_POINTINGUPCENTERED: Balloonstemstates = 2

public val TTBSS_POINTINGUPLEFTWALL: Balloonstemstates = 1

public val TTBSS_POINTINGUPRIGHTWALL: Balloonstemstates = 3

public val TTBS_LINK: Balloonstates = 2

public val TTBS_NORMAL: Balloonstates = 1

public val TTCS_HOT: Closestates = 2

public val TTCS_NORMAL: Closestates = 1

public val TTCS_PRESSED: Closestates = 3

public val TTDT_AUTOMATIC: UInt = 0u

public val TTDT_AUTOPOP: UInt = 2u

public val TTDT_INITIAL: UInt = 3u

public val TTDT_RESHOW: UInt = 1u

public val TTFT_CUBIC_BEZIER: TaTimingfunctionType = 1

public val TTFT_UNDEFINED: TaTimingfunctionType = 0

public val TTF_ABSOLUTE: TooltipFlags = 128u

public val TTF_CENTERTIP: TooltipFlags = 2u

public val TTF_DI_SETITEM: TooltipFlags = 32768u

public val TTF_IDISHWND: TooltipFlags = 1u

public val TTF_PARSELINKS: TooltipFlags = 4096u

public val TTF_RTLREADING: TooltipFlags = 4u

public val TTF_SUBCLASS: TooltipFlags = 16u

public val TTF_TRACK: TooltipFlags = 32u

public val TTF_TRANSPARENT: TooltipFlags = 256u

public val TTIBES_DISABLED: Toptabitembothedgestates = 4

public val TTIBES_FOCUSED: Toptabitembothedgestates = 5

public val TTIBES_HOT: Toptabitembothedgestates = 2

public val TTIBES_NORMAL: Toptabitembothedgestates = 1

public val TTIBES_SELECTED: Toptabitembothedgestates = 3

public val TTILES_DISABLED: Toptabitemleftedgestates = 4

public val TTILES_FOCUSED: Toptabitemleftedgestates = 5

public val TTILES_HOT: Toptabitemleftedgestates = 2

public val TTILES_NORMAL: Toptabitemleftedgestates = 1

public val TTILES_SELECTED: Toptabitemleftedgestates = 3

public val TTIRES_DISABLED: Toptabitemrightedgestates = 4

public val TTIRES_FOCUSED: Toptabitemrightedgestates = 5

public val TTIRES_HOT: Toptabitemrightedgestates = 2

public val TTIRES_NORMAL: Toptabitemrightedgestates = 1

public val TTIRES_SELECTED: Toptabitemrightedgestates = 3

public val TTIS_DISABLED: Toptabitemstates = 4

public val TTIS_FOCUSED: Toptabitemstates = 5

public val TTIS_HOT: Toptabitemstates = 2

public val TTIS_NORMAL: Toptabitemstates = 1

public val TTIS_SELECTED: Toptabitemstates = 3

public val TTI_ERROR: EditballoontipIcon = 3

public val TTI_ERROR_LARGE: EditballoontipIcon = 6

public val TTI_INFO: EditballoontipIcon = 1

public val TTI_INFO_LARGE: EditballoontipIcon = 4

public val TTI_NONE: EditballoontipIcon = 0

public val TTI_WARNING: EditballoontipIcon = 2

public val TTI_WARNING_LARGE: EditballoontipIcon = 5

public val TTM_ACTIVATE: UInt = 1025u

public val TTM_ADDTOOL: UInt = 1074u

public val TTM_ADDTOOLA: UInt = 1028u

public val TTM_ADDTOOLW: UInt = 1074u

public val TTM_ADJUSTRECT: UInt = 1055u

public val TTM_DELTOOL: UInt = 1075u

public val TTM_DELTOOLA: UInt = 1029u

public val TTM_DELTOOLW: UInt = 1075u

public val TTM_ENUMTOOLS: UInt = 1082u

public val TTM_ENUMTOOLSA: UInt = 1038u

public val TTM_ENUMTOOLSW: UInt = 1082u

public val TTM_GETBUBBLESIZE: UInt = 1054u

public val TTM_GETCURRENTTOOL: UInt = 1083u

public val TTM_GETCURRENTTOOLA: UInt = 1039u

public val TTM_GETCURRENTTOOLW: UInt = 1083u

public val TTM_GETDELAYTIME: UInt = 1045u

public val TTM_GETMARGIN: UInt = 1051u

public val TTM_GETMAXTIPWIDTH: UInt = 1049u

public val TTM_GETTEXT: UInt = 1080u

public val TTM_GETTEXTA: UInt = 1035u

public val TTM_GETTEXTW: UInt = 1080u

public val TTM_GETTIPBKCOLOR: UInt = 1046u

public val TTM_GETTIPTEXTCOLOR: UInt = 1047u

public val TTM_GETTITLE: UInt = 1059u

public val TTM_GETTOOLCOUNT: UInt = 1037u

public val TTM_GETTOOLINFO: UInt = 1077u

public val TTM_GETTOOLINFOA: UInt = 1032u

public val TTM_GETTOOLINFOW: UInt = 1077u

public val TTM_HITTEST: UInt = 1079u

public val TTM_HITTESTA: UInt = 1034u

public val TTM_HITTESTW: UInt = 1079u

public val TTM_NEWTOOLRECT: UInt = 1076u

public val TTM_NEWTOOLRECTA: UInt = 1030u

public val TTM_NEWTOOLRECTW: UInt = 1076u

public val TTM_POP: UInt = 1052u

public val TTM_POPUP: UInt = 1058u

public val TTM_RELAYEVENT: UInt = 1031u

public val TTM_SETDELAYTIME: UInt = 1027u

public val TTM_SETMARGIN: UInt = 1050u

public val TTM_SETMAXTIPWIDTH: UInt = 1048u

public val TTM_SETTIPBKCOLOR: UInt = 1043u

public val TTM_SETTIPTEXTCOLOR: UInt = 1044u

public val TTM_SETTITLE: UInt = 1057u

public val TTM_SETTITLEA: UInt = 1056u

public val TTM_SETTITLEW: UInt = 1057u

public val TTM_SETTOOLINFO: UInt = 1078u

public val TTM_SETTOOLINFOA: UInt = 1033u

public val TTM_SETTOOLINFOW: UInt = 1078u

public val TTM_SETWINDOWTHEME: UInt = 8203u

public val TTM_TRACKACTIVATE: UInt = 1041u

public val TTM_TRACKPOSITION: UInt = 1042u

public val TTM_UPDATE: UInt = 1053u

public val TTM_UPDATETIPTEXT: UInt = 1081u

public val TTM_UPDATETIPTEXTA: UInt = 1036u

public val TTM_UPDATETIPTEXTW: UInt = 1081u

public val TTM_WINDOWFROMPOINT: UInt = 1040u

public val TTN_FIRST: UInt = 4294966776u

public val TTN_GETDISPINFO: UInt = 4294966766u

public val TTN_GETDISPINFOA: UInt = 4294966776u

public val TTN_GETDISPINFOW: UInt = 4294966766u

public val TTN_LAST: UInt = 4294966747u

public val TTN_LINKCLICK: UInt = 4294966773u

public val TTN_NEEDTEXT: UInt = 4294966766u

public val TTN_NEEDTEXTA: UInt = 4294966776u

public val TTN_NEEDTEXTW: UInt = 4294966766u

public val TTN_POP: UInt = 4294966774u

public val TTN_SHOW: UInt = 4294966775u

public val TTP_BALLOON: Tooltipparts = 3

public val TTP_BALLOONSTEM: Tooltipparts = 6

public val TTP_BALLOONTITLE: Tooltipparts = 4

public val TTP_CLOSE: Tooltipparts = 5

public val TTP_STANDARD: Tooltipparts = 1

public val TTP_STANDARDTITLE: Tooltipparts = 2

public val TTP_WRENCH: Tooltipparts = 7

public val TTSS_LINK: Standardstates = 2

public val TTSS_NORMAL: Standardstates = 1

public val TTS_ALWAYSTIP: UInt = 1u

public val TTS_BALLOON: UInt = 64u

public val TTS_CLOSE: UInt = 128u

public val TTS_NOANIMATE: UInt = 16u

public val TTS_NOFADE: UInt = 32u

public val TTS_NOPREFIX: UInt = 2u

public val TTS_USEVISUALSTYLE: UInt = 256u

public val TTWS_HOT: Wrenchstates = 2

public val TTWS_NORMAL: Wrenchstates = 1

public val TTWS_PRESSED: Wrenchstates = 3

public val TUBS_DISABLED: Thumbbottomstates = 5

public val TUBS_FOCUSED: Thumbbottomstates = 4

public val TUBS_HOT: Thumbbottomstates = 2

public val TUBS_NORMAL: Thumbbottomstates = 1

public val TUBS_PRESSED: Thumbbottomstates = 3

public val TUS_DISABLED: Thumbstates = 5

public val TUS_FOCUSED: Thumbstates = 4

public val TUS_HOT: Thumbstates = 2

public val TUS_NORMAL: Thumbstates = 1

public val TUS_PRESSED: Thumbstates = 3

public val TUTS_DISABLED: Thumbtopstates = 5

public val TUTS_FOCUSED: Thumbtopstates = 4

public val TUTS_HOT: Thumbtopstates = 2

public val TUTS_NORMAL: Thumbtopstates = 1

public val TUTS_PRESSED: Thumbtopstates = 3

public val TUVLS_DISABLED: Thumbleftstates = 5

public val TUVLS_FOCUSED: Thumbleftstates = 4

public val TUVLS_HOT: Thumbleftstates = 2

public val TUVLS_NORMAL: Thumbleftstates = 1

public val TUVLS_PRESSED: Thumbleftstates = 3

public val TUVRS_DISABLED: Thumbrightstates = 5

public val TUVRS_FOCUSED: Thumbrightstates = 4

public val TUVRS_HOT: Thumbrightstates = 2

public val TUVRS_NORMAL: Thumbrightstates = 1

public val TUVRS_PRESSED: Thumbrightstates = 3

public val TUVS_DISABLED: Thumbvertstates = 5

public val TUVS_FOCUSED: Thumbvertstates = 4

public val TUVS_HOT: Thumbvertstates = 2

public val TUVS_NORMAL: Thumbvertstates = 1

public val TUVS_PRESSED: Thumbvertstates = 3

public val TVCDRF_NOIMAGES: UInt = 65536u

public val TVC_BYKEYBOARD: NmTreeviewAction = 2u

public val TVC_BYMOUSE: NmTreeviewAction = 1u

public val TVC_UNKNOWN: NmTreeviewAction = 0u

public val TVE_COLLAPSE: NmTreeviewAction = 1u

public val TVE_COLLAPSERESET: NmTreeviewAction = 32768u

public val TVE_EXPAND: NmTreeviewAction = 2u

public val TVE_EXPANDPARTIAL: NmTreeviewAction = 16384u

public val TVE_TOGGLE: NmTreeviewAction = 3u

public val TVGIPR_BUTTON: Tvitempart = 1

public val TVGN_CARET: UInt = 9u

public val TVGN_CHILD: UInt = 4u

public val TVGN_DROPHILITE: UInt = 8u

public val TVGN_FIRSTVISIBLE: UInt = 5u

public val TVGN_LASTVISIBLE: UInt = 10u

public val TVGN_NEXT: UInt = 1u

public val TVGN_NEXTSELECTED: UInt = 11u

public val TVGN_NEXTVISIBLE: UInt = 6u

public val TVGN_PARENT: UInt = 3u

public val TVGN_PREVIOUS: UInt = 2u

public val TVGN_PREVIOUSVISIBLE: UInt = 7u

public val TVGN_ROOT: UInt = 0u

public val TVHT_ABOVE: TvhittestinfoFlags = 256u

public val TVHT_BELOW: TvhittestinfoFlags = 512u

public val TVHT_NOWHERE: TvhittestinfoFlags = 1u

public val TVHT_ONITEM: TvhittestinfoFlags = 70u

public val TVHT_ONITEMBUTTON: TvhittestinfoFlags = 16u

public val TVHT_ONITEMICON: TvhittestinfoFlags = 2u

public val TVHT_ONITEMINDENT: TvhittestinfoFlags = 8u

public val TVHT_ONITEMLABEL: TvhittestinfoFlags = 4u

public val TVHT_ONITEMRIGHT: TvhittestinfoFlags = 32u

public val TVHT_ONITEMSTATEICON: TvhittestinfoFlags = 64u

public val TVHT_TOLEFT: TvhittestinfoFlags = 2048u

public val TVHT_TORIGHT: TvhittestinfoFlags = 1024u

public val TVIF_CHILDREN: TvitemMask = 64u

public val TVIF_DI_SETITEM: TvitemMask = 4096u

public val TVIF_EXPANDEDIMAGE: TvitemMask = 512u

public val TVIF_HANDLE: TvitemMask = 16u

public val TVIF_IMAGE: TvitemMask = 2u

public val TVIF_INTEGRAL: TvitemMask = 128u

public val TVIF_PARAM: TvitemMask = 4u

public val TVIF_SELECTEDIMAGE: TvitemMask = 32u

public val TVIF_STATE: TvitemMask = 8u

public val TVIF_STATEEX: TvitemMask = 256u

public val TVIF_TEXT: TvitemMask = 1u

public val TVIS_BOLD: TreeViewItemStateFlags = 16u

public val TVIS_CUT: TreeViewItemStateFlags = 4u

public val TVIS_DROPHILITED: TreeViewItemStateFlags = 8u

public val TVIS_EXPANDED: TreeViewItemStateFlags = 32u

public val TVIS_EXPANDEDONCE: TreeViewItemStateFlags = 64u

public val TVIS_EXPANDPARTIAL: TreeViewItemStateFlags = 128u

public val TVIS_EX_ALL: TreeViewItemStateFlags = 2u

public val TVIS_EX_DISABLED: TreeViewItemStateFlags = 2u

public val TVIS_EX_FLAT: TreeViewItemStateFlags = 1u

public val TVIS_OVERLAYMASK: TreeViewItemStateFlags = 3840u

public val TVIS_SELECTED: TreeViewItemStateFlags = 2u

public val TVIS_STATEIMAGEMASK: TreeViewItemStateFlags = 61440u

public val TVIS_USERMASK: TreeViewItemStateFlags = 61440u

public val TVI_FIRST: Htreeitem = (-65535).toLong()

public val TVI_LAST: Htreeitem = (-65534).toLong()

public val TVI_ROOT: Htreeitem = (-65536).toLong()

public val TVI_SORT: Htreeitem = (-65533).toLong()

public val TVM_CREATEDRAGIMAGE: UInt = 4370u

public val TVM_DELETEITEM: UInt = 4353u

public val TVM_EDITLABEL: UInt = 4417u

public val TVM_EDITLABELA: UInt = 4366u

public val TVM_EDITLABELW: UInt = 4417u

public val TVM_ENDEDITLABELNOW: UInt = 4374u

public val TVM_ENSUREVISIBLE: UInt = 4372u

public val TVM_EXPAND: UInt = 4354u

public val TVM_GETBKCOLOR: UInt = 4383u

public val TVM_GETCOUNT: UInt = 4357u

public val TVM_GETEDITCONTROL: UInt = 4367u

public val TVM_GETEXTENDEDSTYLE: UInt = 4397u

public val TVM_GETIMAGELIST: UInt = 4360u

public val TVM_GETINDENT: UInt = 4358u

public val TVM_GETINSERTMARKCOLOR: UInt = 4390u

public val TVM_GETISEARCHSTRING: UInt = 4416u

public val TVM_GETISEARCHSTRINGA: UInt = 4375u

public val TVM_GETISEARCHSTRINGW: UInt = 4416u

public val TVM_GETITEM: UInt = 4414u

public val TVM_GETITEMA: UInt = 4364u

public val TVM_GETITEMHEIGHT: UInt = 4380u

public val TVM_GETITEMPARTRECT: UInt = 4424u

public val TVM_GETITEMRECT: UInt = 4356u

public val TVM_GETITEMSTATE: UInt = 4391u

public val TVM_GETITEMW: UInt = 4414u

public val TVM_GETLINECOLOR: UInt = 4393u

public val TVM_GETNEXTITEM: UInt = 4362u

public val TVM_GETSCROLLTIME: UInt = 4386u

public val TVM_GETSELECTEDCOUNT: UInt = 4422u

public val TVM_GETTEXTCOLOR: UInt = 4384u

public val TVM_GETTOOLTIPS: UInt = 4377u

public val TVM_GETUNICODEFORMAT: UInt = 8198u

public val TVM_GETVISIBLECOUNT: UInt = 4368u

public val TVM_HITTEST: UInt = 4369u

public val TVM_INSERTITEM: UInt = 4402u

public val TVM_INSERTITEMA: UInt = 4352u

public val TVM_INSERTITEMW: UInt = 4402u

public val TVM_MAPACCIDTOHTREEITEM: UInt = 4394u

public val TVM_MAPHTREEITEMTOACCID: UInt = 4395u

public val TVM_SELECTITEM: UInt = 4363u

public val TVM_SETAUTOSCROLLINFO: UInt = 4411u

public val TVM_SETBKCOLOR: UInt = 4381u

public val TVM_SETBORDER: UInt = 4387u

public val TVM_SETEXTENDEDSTYLE: UInt = 4396u

public val TVM_SETHOT: UInt = 4410u

public val TVM_SETIMAGELIST: UInt = 4361u

public val TVM_SETINDENT: UInt = 4359u

public val TVM_SETINSERTMARK: UInt = 4378u

public val TVM_SETINSERTMARKCOLOR: UInt = 4389u

public val TVM_SETITEM: UInt = 4415u

public val TVM_SETITEMA: UInt = 4365u

public val TVM_SETITEMHEIGHT: UInt = 4379u

public val TVM_SETITEMW: UInt = 4415u

public val TVM_SETLINECOLOR: UInt = 4392u

public val TVM_SETSCROLLTIME: UInt = 4385u

public val TVM_SETTEXTCOLOR: UInt = 4382u

public val TVM_SETTOOLTIPS: UInt = 4376u

public val TVM_SETUNICODEFORMAT: UInt = 8197u

public val TVM_SHOWINFOTIP: UInt = 4423u

public val TVM_SORTCHILDREN: UInt = 4371u

public val TVM_SORTCHILDRENCB: UInt = 4373u

public val TVNRET_DEFAULT: UInt = 0u

public val TVNRET_SKIPNEW: UInt = 2u

public val TVNRET_SKIPOLD: UInt = 1u

public val TVN_ASYNCDRAW: UInt = 4294966876u

public val TVN_BEGINDRAG: UInt = 4294966840u

public val TVN_BEGINDRAGA: UInt = 4294966889u

public val TVN_BEGINDRAGW: UInt = 4294966840u

public val TVN_BEGINLABELEDIT: UInt = 4294966837u

public val TVN_BEGINLABELEDITA: UInt = 4294966886u

public val TVN_BEGINLABELEDITW: UInt = 4294966837u

public val TVN_BEGINRDRAG: UInt = 4294966839u

public val TVN_BEGINRDRAGA: UInt = 4294966888u

public val TVN_BEGINRDRAGW: UInt = 4294966839u

public val TVN_DELETEITEM: UInt = 4294966838u

public val TVN_DELETEITEMA: UInt = 4294966887u

public val TVN_DELETEITEMW: UInt = 4294966838u

public val TVN_ENDLABELEDIT: UInt = 4294966836u

public val TVN_ENDLABELEDITA: UInt = 4294966885u

public val TVN_ENDLABELEDITW: UInt = 4294966836u

public val TVN_FIRST: UInt = 4294966896u

public val TVN_GETDISPINFO: UInt = 4294966844u

public val TVN_GETDISPINFOA: UInt = 4294966893u

public val TVN_GETDISPINFOW: UInt = 4294966844u

public val TVN_GETINFOTIP: UInt = 4294966882u

public val TVN_GETINFOTIPA: UInt = 4294966883u

public val TVN_GETINFOTIPW: UInt = 4294966882u

public val TVN_ITEMCHANGED: UInt = 4294966877u

public val TVN_ITEMCHANGEDA: UInt = 4294966878u

public val TVN_ITEMCHANGEDW: UInt = 4294966877u

public val TVN_ITEMCHANGING: UInt = 4294966879u

public val TVN_ITEMCHANGINGA: UInt = 4294966880u

public val TVN_ITEMCHANGINGW: UInt = 4294966879u

public val TVN_ITEMEXPANDED: UInt = 4294966841u

public val TVN_ITEMEXPANDEDA: UInt = 4294966890u

public val TVN_ITEMEXPANDEDW: UInt = 4294966841u

public val TVN_ITEMEXPANDING: UInt = 4294966842u

public val TVN_ITEMEXPANDINGA: UInt = 4294966891u

public val TVN_ITEMEXPANDINGW: UInt = 4294966842u

public val TVN_KEYDOWN: UInt = 4294966884u

public val TVN_LAST: UInt = 4294966797u

public val TVN_SELCHANGED: UInt = 4294966845u

public val TVN_SELCHANGEDA: UInt = 4294966894u

public val TVN_SELCHANGEDW: UInt = 4294966845u

public val TVN_SELCHANGING: UInt = 4294966846u

public val TVN_SELCHANGINGA: UInt = 4294966895u

public val TVN_SELCHANGINGW: UInt = 4294966846u

public val TVN_SETDISPINFO: UInt = 4294966843u

public val TVN_SETDISPINFOA: UInt = 4294966892u

public val TVN_SETDISPINFOW: UInt = 4294966843u

public val TVN_SINGLEEXPAND: UInt = 4294966881u

public val TVP_BRANCH: Treeviewparts = 3

public val TVP_GLYPH: Treeviewparts = 2

public val TVP_HOTGLYPH: Treeviewparts = 4

public val TVP_TREEITEM: Treeviewparts = 1

public val TVSBF_XBORDER: UInt = 1u

public val TVSBF_YBORDER: UInt = 2u

public val TVSIL_NORMAL: UInt = 0u

public val TVSIL_STATE: UInt = 2u

public val TVSI_NOSINGLEEXPAND: UInt = 32768u

public val TVS_CHECKBOXES: UInt = 256u

public val TVS_DISABLEDRAGDROP: UInt = 16u

public val TVS_EDITLABELS: UInt = 8u

public val TVS_EX_AUTOHSCROLL: UInt = 32u

public val TVS_EX_DIMMEDCHECKBOXES: UInt = 512u

public val TVS_EX_DOUBLEBUFFER: UInt = 4u

public val TVS_EX_DRAWIMAGEASYNC: UInt = 1024u

public val TVS_EX_EXCLUSIONCHECKBOXES: UInt = 256u

public val TVS_EX_FADEINOUTEXPANDOS: UInt = 64u

public val TVS_EX_MULTISELECT: UInt = 2u

public val TVS_EX_NOINDENTSTATE: UInt = 8u

public val TVS_EX_NOSINGLECOLLAPSE: UInt = 1u

public val TVS_EX_PARTIALCHECKBOXES: UInt = 128u

public val TVS_EX_RICHTOOLTIP: UInt = 16u

public val TVS_FULLROWSELECT: UInt = 4096u

public val TVS_HASBUTTONS: UInt = 1u

public val TVS_HASLINES: UInt = 2u

public val TVS_INFOTIP: UInt = 2048u

public val TVS_LINESATROOT: UInt = 4u

public val TVS_NOHSCROLL: UInt = 32768u

public val TVS_NONEVENHEIGHT: UInt = 16384u

public val TVS_NOSCROLL: UInt = 8192u

public val TVS_NOTOOLTIPS: UInt = 128u

public val TVS_RTLREADING: UInt = 64u

public val TVS_SHOWSELALWAYS: UInt = 32u

public val TVS_SINGLEEXPAND: UInt = 1024u

public val TVS_TRACKSELECT: UInt = 512u

public val TV_FIRST: UInt = 4352u

public val UDM_GETACCEL: UInt = 1132u

public val UDM_GETBASE: UInt = 1134u

public val UDM_GETBUDDY: UInt = 1130u

public val UDM_GETPOS: UInt = 1128u

public val UDM_GETPOS32: UInt = 1138u

public val UDM_GETRANGE: UInt = 1126u

public val UDM_GETRANGE32: UInt = 1136u

public val UDM_GETUNICODEFORMAT: UInt = 8198u

public val UDM_SETACCEL: UInt = 1131u

public val UDM_SETBASE: UInt = 1133u

public val UDM_SETBUDDY: UInt = 1129u

public val UDM_SETPOS: UInt = 1127u

public val UDM_SETPOS32: UInt = 1137u

public val UDM_SETRANGE: UInt = 1125u

public val UDM_SETRANGE32: UInt = 1135u

public val UDM_SETUNICODEFORMAT: UInt = 8197u

public val UDN_DELTAPOS: UInt = 4294966574u

public val UDN_FIRST: UInt = 4294966575u

public val UDN_LAST: UInt = 4294966567u

public val UDS_ALIGNLEFT: UInt = 8u

public val UDS_ALIGNRIGHT: UInt = 4u

public val UDS_ARROWKEYS: UInt = 32u

public val UDS_AUTOBUDDY: UInt = 16u

public val UDS_HORZ: UInt = 64u

public val UDS_HOTTRACK: UInt = 256u

public val UDS_NOTHOUSANDS: UInt = 128u

public val UDS_SETBUDDYINT: UInt = 2u

public val UDS_WRAP: UInt = 1u

public val UD_MAXVAL: UInt = 32767u

public val UPDOWN_CLASS: Pcwstr = w("msctls_updown32")

public val UPDOWN_CLASSA: Pcstr = s("msctls_updown32")

public val UPDOWN_CLASSW: Pcwstr = w("msctls_updown32")

public val UPHZS_DISABLED: Uphorzstates = 4

public val UPHZS_HOT: Uphorzstates = 2

public val UPHZS_NORMAL: Uphorzstates = 1

public val UPHZS_PRESSED: Uphorzstates = 3

public val UPS_DISABLED: Upstates = 4

public val UPS_HOT: Upstates = 2

public val UPS_NORMAL: Upstates = 1

public val UPS_PRESSED: Upstates = 3

public val UTP_HOVERBACKGROUND: Usertileparts = 2

public val UTP_STROKEBACKGROUND: Usertileparts = 1

public val UTS_HOT: Hoverbackgroundstates = 2

public val UTS_NORMAL: Hoverbackgroundstates = 1

public val UTS_PRESSED: Hoverbackgroundstates = 3

public val VALIDBITS: SetThemeAppPropertiesFlags = 7u

public val VA_BOTTOM: Valign = 2

public val VA_CENTER: Valign = 1

public val VA_TOP: Valign = 0

public val VIEW_DETAILS: UInt = 3u

public val VIEW_LARGEICONS: UInt = 0u

public val VIEW_LIST: UInt = 2u

public val VIEW_NETCONNECT: UInt = 9u

public val VIEW_NETDISCONNECT: UInt = 10u

public val VIEW_NEWFOLDER: UInt = 11u

public val VIEW_PARENTFOLDER: UInt = 8u

public val VIEW_SMALLICONS: UInt = 1u

public val VIEW_SORTDATE: UInt = 6u

public val VIEW_SORTNAME: UInt = 4u

public val VIEW_SORTSIZE: UInt = 5u

public val VIEW_SORTTYPE: UInt = 7u

public val VIEW_VIEWMENU: UInt = 12u

public val VSCLASS_AEROWIZARD: Pcwstr = w("AEROWIZARD")

public val VSCLASS_AEROWIZARDSTYLE: Pcwstr = w("AEROWIZARDSTYLE")

public val VSCLASS_BUTTON: Pcwstr = w("BUTTON")

public val VSCLASS_BUTTONSTYLE: Pcwstr = w("BUTTONSTYLE")

public val VSCLASS_CLOCK: Pcwstr = w("CLOCK")

public val VSCLASS_COMBOBOX: Pcwstr = w("COMBOBOX")

public val VSCLASS_COMBOBOXSTYLE: Pcwstr = w("COMBOBOXSTYLE")

public val VSCLASS_COMMUNICATIONS: Pcwstr = w("COMMUNICATIONS")

public val VSCLASS_COMMUNICATIONSSTYLE: Pcwstr = w("COMMUNICATIONSSTYLE")

public val VSCLASS_CONTROLPANEL: Pcwstr = w("CONTROLPANEL")

public val VSCLASS_CONTROLPANELSTYLE: Pcwstr = w("CONTROLPANELSTYLE")

public val VSCLASS_DATEPICKER: Pcwstr = w("DATEPICKER")

public val VSCLASS_DATEPICKERSTYLE: Pcwstr = w("DATEPICKERSTYLE")

public val VSCLASS_DRAGDROP: Pcwstr = w("DRAGDROP")

public val VSCLASS_DRAGDROPSTYLE: Pcwstr = w("DRAGDROPSTYLE")

public val VSCLASS_EDIT: Pcwstr = w("EDIT")

public val VSCLASS_EDITSTYLE: Pcwstr = w("EDITSTYLE")

public val VSCLASS_EMPTYMARKUP: Pcwstr = w("EMPTYMARKUP")

public val VSCLASS_EXPLORERBAR: Pcwstr = w("EXPLORERBAR")

public val VSCLASS_EXPLORERBARSTYLE: Pcwstr = w("EXPLORERBARSTYLE")

public val VSCLASS_FLYOUT: Pcwstr = w("FLYOUT")

public val VSCLASS_FLYOUTSTYLE: Pcwstr = w("FLYOUTSTYLE")

public val VSCLASS_HEADER: Pcwstr = w("HEADER")

public val VSCLASS_HEADERSTYLE: Pcwstr = w("HEADERSTYLE")

public val VSCLASS_LINK: Pcwstr = w("LINK")

public val VSCLASS_LISTBOX: Pcwstr = w("LISTBOX")

public val VSCLASS_LISTBOXSTYLE: Pcwstr = w("LISTBOXSTYLE")

public val VSCLASS_LISTVIEW: Pcwstr = w("LISTVIEW")

public val VSCLASS_LISTVIEWSTYLE: Pcwstr = w("LISTVIEWSTYLE")

public val VSCLASS_MENU: Pcwstr = w("MENU")

public val VSCLASS_MENUBAND: Pcwstr = w("MENUBAND")

public val VSCLASS_MENUSTYLE: Pcwstr = w("MENUSTYLE")

public val VSCLASS_MONTHCAL: Pcwstr = w("MONTHCAL")

public val VSCLASS_NAVIGATION: Pcwstr = w("NAVIGATION")

public val VSCLASS_PAGE: Pcwstr = w("PAGE")

public val VSCLASS_PROGRESS: Pcwstr = w("PROGRESS")

public val VSCLASS_PROGRESSSTYLE: Pcwstr = w("PROGRESSSTYLE")

public val VSCLASS_REBAR: Pcwstr = w("REBAR")

public val VSCLASS_REBARSTYLE: Pcwstr = w("REBARSTYLE")

public val VSCLASS_SCROLLBAR: Pcwstr = w("SCROLLBAR")

public val VSCLASS_SCROLLBARSTYLE: Pcwstr = w("SCROLLBARSTYLE")

public val VSCLASS_SPIN: Pcwstr = w("SPIN")

public val VSCLASS_SPINSTYLE: Pcwstr = w("SPINSTYLE")

public val VSCLASS_STARTPANEL: Pcwstr = w("STARTPANEL")

public val VSCLASS_STATIC: Pcwstr = w("STATIC")

public val VSCLASS_STATUS: Pcwstr = w("STATUS")

public val VSCLASS_STATUSSTYLE: Pcwstr = w("STATUSSTYLE")

public val VSCLASS_TAB: Pcwstr = w("TAB")

public val VSCLASS_TABSTYLE: Pcwstr = w("TABSTYLE")

public val VSCLASS_TASKBAND: Pcwstr = w("TASKBAND")

public val VSCLASS_TASKBAR: Pcwstr = w("TASKBAR")

public val VSCLASS_TASKDIALOG: Pcwstr = w("TASKDIALOG")

public val VSCLASS_TASKDIALOGSTYLE: Pcwstr = w("TASKDIALOGSTYLE")

public val VSCLASS_TEXTSELECTIONGRIPPER: Pcwstr = w("TEXTSELECTIONGRIPPER")

public val VSCLASS_TEXTSTYLE: Pcwstr = w("TEXTSTYLE")

public val VSCLASS_TOOLBAR: Pcwstr = w("TOOLBAR")

public val VSCLASS_TOOLBARSTYLE: Pcwstr = w("TOOLBARSTYLE")

public val VSCLASS_TOOLTIP: Pcwstr = w("TOOLTIP")

public val VSCLASS_TOOLTIPSTYLE: Pcwstr = w("TOOLTIPSTYLE")

public val VSCLASS_TRACKBAR: Pcwstr = w("TRACKBAR")

public val VSCLASS_TRACKBARSTYLE: Pcwstr = w("TRACKBARSTYLE")

public val VSCLASS_TRAYNOTIFY: Pcwstr = w("TRAYNOTIFY")

public val VSCLASS_TREEVIEW: Pcwstr = w("TREEVIEW")

public val VSCLASS_TREEVIEWSTYLE: Pcwstr = w("TREEVIEWSTYLE")

public val VSCLASS_USERTILE: Pcwstr = w("USERTILE")

public val VSCLASS_WINDOW: Pcwstr = w("WINDOW")

public val VSCLASS_WINDOWSTYLE: Pcwstr = w("WINDOWSTYLE")

public val VSS_DISABLED: Vertscrollstates = 4

public val VSS_HOT: Vertscrollstates = 2

public val VSS_NORMAL: Vertscrollstates = 1

public val VSS_PUSHED: Vertscrollstates = 3

public val VTS_DISABLED: Vertthumbstates = 4

public val VTS_HOT: Vertthumbstates = 2

public val VTS_NORMAL: Vertthumbstates = 1

public val VTS_PUSHED: Vertthumbstates = 3

public val WB_CLASSIFY: WordBreakAction = 3

public val WB_ISDELIMITER: WordBreakAction = 2

public val WB_LEFT: WordBreakAction = 0

public val WB_LEFTBREAK: WordBreakAction = 6

public val WB_MOVEWORDLEFT: WordBreakAction = 4

public val WB_MOVEWORDRIGHT: WordBreakAction = 5

public val WB_RIGHT: WordBreakAction = 1

public val WB_RIGHTBREAK: WordBreakAction = 7

public val WC_BUTTON: Pcwstr = w("Button")

public val WC_BUTTONA: Pcstr = s("Button")

public val WC_BUTTONW: Pcwstr = w("Button")

public val WC_COMBOBOX: Pcwstr = w("ComboBox")

public val WC_COMBOBOXA: Pcstr = s("ComboBox")

public val WC_COMBOBOXEX: Pcwstr = w("ComboBoxEx32")

public val WC_COMBOBOXEXA: Pcstr = s("ComboBoxEx32")

public val WC_COMBOBOXEXW: Pcwstr = w("ComboBoxEx32")

public val WC_COMBOBOXW: Pcwstr = w("ComboBox")

public val WC_EDIT: Pcwstr = w("Edit")

public val WC_EDITA: Pcstr = s("Edit")

public val WC_EDITW: Pcwstr = w("Edit")

public val WC_HEADER: Pcwstr = w("SysHeader32")

public val WC_HEADERA: Pcstr = s("SysHeader32")

public val WC_HEADERW: Pcwstr = w("SysHeader32")

public val WC_IPADDRESS: Pcwstr = w("SysIPAddress32")

public val WC_IPADDRESSA: Pcstr = s("SysIPAddress32")

public val WC_IPADDRESSW: Pcwstr = w("SysIPAddress32")

public val WC_LINK: Pcwstr = w("SysLink")

public val WC_LISTBOX: Pcwstr = w("ListBox")

public val WC_LISTBOXA: Pcstr = s("ListBox")

public val WC_LISTBOXW: Pcwstr = w("ListBox")

public val WC_LISTVIEW: Pcwstr = w("SysListView32")

public val WC_LISTVIEWA: Pcstr = s("SysListView32")

public val WC_LISTVIEWW: Pcwstr = w("SysListView32")

public val WC_NATIVEFONTCTL: Pcwstr = w("NativeFontCtl")

public val WC_NATIVEFONTCTLA: Pcstr = s("NativeFontCtl")

public val WC_NATIVEFONTCTLW: Pcwstr = w("NativeFontCtl")

public val WC_PAGESCROLLER: Pcwstr = w("SysPager")

public val WC_PAGESCROLLERA: Pcstr = s("SysPager")

public val WC_PAGESCROLLERW: Pcwstr = w("SysPager")

public val WC_SCROLLBAR: Pcwstr = w("ScrollBar")

public val WC_SCROLLBARA: Pcstr = s("ScrollBar")

public val WC_SCROLLBARW: Pcwstr = w("ScrollBar")

public val WC_STATIC: Pcwstr = w("Static")

public val WC_STATICA: Pcstr = s("Static")

public val WC_STATICW: Pcwstr = w("Static")

public val WC_TABCONTROL: Pcwstr = w("SysTabControl32")

public val WC_TABCONTROLA: Pcstr = s("SysTabControl32")

public val WC_TABCONTROLW: Pcwstr = w("SysTabControl32")

public val WC_TREEVIEW: Pcwstr = w("SysTreeView32")

public val WC_TREEVIEWA: Pcstr = s("SysTreeView32")

public val WC_TREEVIEWW: Pcwstr = w("SysTreeView32")

public val WIZ_BODYCX: UInt = 184u

public val WIZ_BODYX: UInt = 92u

public val WIZ_CXBMP: UInt = 80u

public val WIZ_CXDLG: UInt = 276u

public val WIZ_CYDLG: UInt = 140u

public val WMN_FIRST: UInt = 4294966296u

public val WMN_LAST: UInt = 4294966096u

public val WM_CTLCOLOR: UInt = 25u

public val WM_MOUSEHOVER: UInt = 673u

public val WM_MOUSELEAVE: UInt = 675u

public val WP_BORDER: Windowparts = 39

public val WP_CAPTION: Windowparts = 1

public val WP_CAPTIONSIZINGTEMPLATE: Windowparts = 30

public val WP_CLOSEBUTTON: Windowparts = 18

public val WP_DIALOG: Windowparts = 29

public val WP_FRAME: Windowparts = 38

public val WP_FRAMEBOTTOM: Windowparts = 9

public val WP_FRAMEBOTTOMSIZINGTEMPLATE: Windowparts = 36

public val WP_FRAMELEFT: Windowparts = 7

public val WP_FRAMELEFTSIZINGTEMPLATE: Windowparts = 32

public val WP_FRAMERIGHT: Windowparts = 8

public val WP_FRAMERIGHTSIZINGTEMPLATE: Windowparts = 34

public val WP_HELPBUTTON: Windowparts = 23

public val WP_HORZSCROLL: Windowparts = 25

public val WP_HORZTHUMB: Windowparts = 26

public val WP_MAXBUTTON: Windowparts = 17

public val WP_MAXCAPTION: Windowparts = 5

public val WP_MDICLOSEBUTTON: Windowparts = 20

public val WP_MDIHELPBUTTON: Windowparts = 24

public val WP_MDIMINBUTTON: Windowparts = 16

public val WP_MDIRESTOREBUTTON: Windowparts = 22

public val WP_MDISYSBUTTON: Windowparts = 14

public val WP_MINBUTTON: Windowparts = 15

public val WP_MINCAPTION: Windowparts = 3

public val WP_RESTOREBUTTON: Windowparts = 21

public val WP_SMALLCAPTION: Windowparts = 2

public val WP_SMALLCAPTIONSIZINGTEMPLATE: Windowparts = 31

public val WP_SMALLCLOSEBUTTON: Windowparts = 19

public val WP_SMALLFRAMEBOTTOM: Windowparts = 12

public val WP_SMALLFRAMEBOTTOMSIZINGTEMPLATE: Windowparts = 37

public val WP_SMALLFRAMELEFT: Windowparts = 10

public val WP_SMALLFRAMELEFTSIZINGTEMPLATE: Windowparts = 33

public val WP_SMALLFRAMERIGHT: Windowparts = 11

public val WP_SMALLFRAMERIGHTSIZINGTEMPLATE: Windowparts = 35

public val WP_SMALLMAXCAPTION: Windowparts = 6

public val WP_SMALLMINCAPTION: Windowparts = 4

public val WP_SYSBUTTON: Windowparts = 13

public val WP_VERTSCROLL: Windowparts = 27

public val WP_VERTTHUMB: Windowparts = 28

public val WSB_PROP_CXHSCROLL: WsbProp = 2

public val WSB_PROP_CXHTHUMB: WsbProp = 16

public val WSB_PROP_CXVSCROLL: WsbProp = 8

public val WSB_PROP_CYHSCROLL: WsbProp = 4

public val WSB_PROP_CYVSCROLL: WsbProp = 1

public val WSB_PROP_CYVTHUMB: WsbProp = 32

public val WSB_PROP_HBKGCOLOR: WsbProp = 128

public val WSB_PROP_HSTYLE: WsbProp = 512

public val WSB_PROP_MASK: Int = 4095

public val WSB_PROP_PALETTE: WsbProp = 2048

public val WSB_PROP_VBKGCOLOR: WsbProp = 64

public val WSB_PROP_VSTYLE: WsbProp = 256

public val WSB_PROP_WINSTYLE: WsbProp = 1024

public val WTA_NONCLIENT: Windowthemeattributetype = 1

public val WTNCA_NODRAWCAPTION: UInt = 1u

public val WTNCA_NODRAWICON: UInt = 2u

public val WTNCA_NOMIRRORHELP: UInt = 8u

public val WTNCA_NOSYSMENU: UInt = 4u

public val CHX1: UInt = 1040u

public val CHX10: UInt = 1049u

public val CHX11: UInt = 1050u

public val CHX12: UInt = 1051u

public val CHX13: UInt = 1052u

public val CHX14: UInt = 1053u

public val CHX15: UInt = 1054u

public val CHX16: UInt = 1055u

public val CHX2: UInt = 1041u

public val CHX3: UInt = 1042u

public val CHX4: UInt = 1043u

public val CHX5: UInt = 1044u

public val CHX6: UInt = 1045u

public val CHX7: UInt = 1046u

public val CHX8: UInt = 1047u

public val CHX9: UInt = 1048u

public val CMB1: UInt = 1136u

public val CMB10: UInt = 1145u

public val CMB11: UInt = 1146u

public val CMB12: UInt = 1147u

public val CMB13: UInt = 1148u

public val CMB14: UInt = 1149u

public val CMB15: UInt = 1150u

public val CMB16: UInt = 1151u

public val CMB2: UInt = 1137u

public val CMB3: UInt = 1138u

public val CMB4: UInt = 1139u

public val CMB5: UInt = 1140u

public val CMB6: UInt = 1141u

public val CMB7: UInt = 1142u

public val CMB8: UInt = 1143u

public val CMB9: UInt = 1144u

public val CTL1: UInt = 1184u

public val CTL_FIRST: UInt = 1024u

public val CTL_LAST: UInt = 1279u

public val EDT1: UInt = 1152u

public val EDT10: UInt = 1161u

public val EDT11: UInt = 1162u

public val EDT12: UInt = 1163u

public val EDT13: UInt = 1164u

public val EDT14: UInt = 1165u

public val EDT15: UInt = 1166u

public val EDT16: UInt = 1167u

public val EDT2: UInt = 1153u

public val EDT3: UInt = 1154u

public val EDT4: UInt = 1155u

public val EDT5: UInt = 1156u

public val EDT6: UInt = 1157u

public val EDT7: UInt = 1158u

public val EDT8: UInt = 1159u

public val EDT9: UInt = 1160u

public val FRM1: UInt = 1076u

public val FRM2: UInt = 1077u

public val FRM3: UInt = 1078u

public val FRM4: UInt = 1079u

public val GRP1: UInt = 1072u

public val GRP2: UInt = 1073u

public val GRP3: UInt = 1074u

public val GRP4: UInt = 1075u

public val ICO1: UInt = 1084u

public val ICO2: UInt = 1085u

public val ICO3: UInt = 1086u

public val ICO4: UInt = 1087u

public val LST1: UInt = 1120u

public val LST10: UInt = 1129u

public val LST11: UInt = 1130u

public val LST12: UInt = 1131u

public val LST13: UInt = 1132u

public val LST14: UInt = 1133u

public val LST15: UInt = 1134u

public val LST16: UInt = 1135u

public val LST2: UInt = 1121u

public val LST3: UInt = 1122u

public val LST4: UInt = 1123u

public val LST5: UInt = 1124u

public val LST6: UInt = 1125u

public val LST7: UInt = 1126u

public val LST8: UInt = 1127u

public val LST9: UInt = 1128u

public val PSH1: UInt = 1024u

public val PSH10: UInt = 1033u

public val PSH11: UInt = 1034u

public val PSH12: UInt = 1035u

public val PSH13: UInt = 1036u

public val PSH14: UInt = 1037u

public val PSH15: UInt = 1038u

public val PSH16: UInt = 1039u

public val PSH2: UInt = 1025u

public val PSH3: UInt = 1026u

public val PSH4: UInt = 1027u

public val PSH5: UInt = 1028u

public val PSH6: UInt = 1029u

public val PSH7: UInt = 1030u

public val PSH8: UInt = 1031u

public val PSH9: UInt = 1032u

public val PSH_HELP: UInt = 1038u

public val RAD1: UInt = 1056u

public val RAD10: UInt = 1065u

public val RAD11: UInt = 1066u

public val RAD12: UInt = 1067u

public val RAD13: UInt = 1068u

public val RAD14: UInt = 1069u

public val RAD15: UInt = 1070u

public val RAD16: UInt = 1071u

public val RAD2: UInt = 1057u

public val RAD3: UInt = 1058u

public val RAD4: UInt = 1059u

public val RAD5: UInt = 1060u

public val RAD6: UInt = 1061u

public val RAD7: UInt = 1062u

public val RAD8: UInt = 1063u

public val RAD9: UInt = 1064u

public val RCT1: UInt = 1080u

public val RCT2: UInt = 1081u

public val RCT3: UInt = 1082u

public val RCT4: UInt = 1083u

public val SCR1: UInt = 1168u

public val SCR2: UInt = 1169u

public val SCR3: UInt = 1170u

public val SCR4: UInt = 1171u

public val SCR5: UInt = 1172u

public val SCR6: UInt = 1173u

public val SCR7: UInt = 1174u

public val SCR8: UInt = 1175u

public val STC1: UInt = 1088u

public val STC10: UInt = 1097u

public val STC11: UInt = 1098u

public val STC12: UInt = 1099u

public val STC13: UInt = 1100u

public val STC14: UInt = 1101u

public val STC15: UInt = 1102u

public val STC16: UInt = 1103u

public val STC17: UInt = 1104u

public val STC18: UInt = 1105u

public val STC19: UInt = 1106u

public val STC2: UInt = 1089u

public val STC20: UInt = 1107u

public val STC21: UInt = 1108u

public val STC22: UInt = 1109u

public val STC23: UInt = 1110u

public val STC24: UInt = 1111u

public val STC25: UInt = 1112u

public val STC26: UInt = 1113u

public val STC27: UInt = 1114u

public val STC28: UInt = 1115u

public val STC29: UInt = 1116u

public val STC3: UInt = 1090u

public val STC30: UInt = 1117u

public val STC31: UInt = 1118u

public val STC32: UInt = 1119u

public val STC4: UInt = 1091u

public val STC5: UInt = 1092u

public val STC6: UInt = 1093u

public val STC7: UInt = 1094u

public val STC8: UInt = 1095u

public val STC9: UInt = 1096u

public val IMAGE_LIST: Guid = Guid.fromU128(U128(0x7c476ba202b148f4uL, 0x8048b24619ddc058uL))
