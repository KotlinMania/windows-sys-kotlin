package io.github.kotlinmania.windowssys.windows.win32.ui.controls.dialogs

import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val BOLD_FONTTYPE: ChoosefontFontType = 256u.toUShort()

public val CCERR_CHOOSECOLORCODES: CommonDlgErrors = 20480u

public val CC_ANYCOLOR: ChoosecolorFlags = 256u

public val CC_ENABLEHOOK: ChoosecolorFlags = 16u

public val CC_ENABLETEMPLATE: ChoosecolorFlags = 32u

public val CC_ENABLETEMPLATEHANDLE: ChoosecolorFlags = 64u

public val CC_FULLOPEN: ChoosecolorFlags = 2u

public val CC_PREVENTFULLOPEN: ChoosecolorFlags = 4u

public val CC_RGBINIT: ChoosecolorFlags = 1u

public val CC_SHOWHELP: ChoosecolorFlags = 8u

public val CC_SOLIDCOLOR: ChoosecolorFlags = 128u

public val CDERR_DIALOGFAILURE: CommonDlgErrors = 65535u

public val CDERR_FINDRESFAILURE: CommonDlgErrors = 6u

public val CDERR_GENERALCODES: CommonDlgErrors = 0u

public val CDERR_INITIALIZATION: CommonDlgErrors = 2u

public val CDERR_LOADRESFAILURE: CommonDlgErrors = 7u

public val CDERR_LOADSTRFAILURE: CommonDlgErrors = 5u

public val CDERR_LOCKRESFAILURE: CommonDlgErrors = 8u

public val CDERR_MEMALLOCFAILURE: CommonDlgErrors = 9u

public val CDERR_MEMLOCKFAILURE: CommonDlgErrors = 10u

public val CDERR_NOHINSTANCE: CommonDlgErrors = 4u

public val CDERR_NOHOOK: CommonDlgErrors = 11u

public val CDERR_NOTEMPLATE: CommonDlgErrors = 3u

public val CDERR_REGISTERMSGFAIL: CommonDlgErrors = 12u

public val CDERR_STRUCTSIZE: CommonDlgErrors = 1u

public val CDM_FIRST: UInt = 1124u

public val CDM_GETFILEPATH: UInt = 1125u

public val CDM_GETFOLDERIDLIST: UInt = 1127u

public val CDM_GETFOLDERPATH: UInt = 1126u

public val CDM_GETSPEC: UInt = 1124u

public val CDM_HIDECONTROL: UInt = 1129u

public val CDM_LAST: UInt = 1224u

public val CDM_SETCONTROLTEXT: UInt = 1128u

public val CDM_SETDEFEXT: UInt = 1130u

public val CDN_FILEOK: UInt = 4294966690u

public val CDN_FOLDERCHANGE: UInt = 4294966693u

public val CDN_HELP: UInt = 4294966691u

public val CDN_INCLUDEITEM: UInt = 4294966688u

public val CDN_INITDONE: UInt = 4294966695u

public val CDN_SELCHANGE: UInt = 4294966694u

public val CDN_SHAREVIOLATION: UInt = 4294966692u

public val CDN_TYPECHANGE: UInt = 4294966689u

public val CD_LBSELADD: UInt = 2u

public val CD_LBSELCHANGE: UInt = 0u

public val CD_LBSELNOITEMS: Int = -1

public val CD_LBSELSUB: UInt = 1u

public val CFERR_CHOOSEFONTCODES: CommonDlgErrors = 8192u

public val CFERR_MAXLESSTHANMIN: CommonDlgErrors = 8194u

public val CFERR_NOFONTS: CommonDlgErrors = 8193u

public val CF_ANSIONLY: ChoosefontFlags = 1024u

public val CF_APPLY: ChoosefontFlags = 512u

public val CF_BOTH: ChoosefontFlags = 3u

public val CF_EFFECTS: ChoosefontFlags = 256u

public val CF_ENABLEHOOK: ChoosefontFlags = 8u

public val CF_ENABLETEMPLATE: ChoosefontFlags = 16u

public val CF_ENABLETEMPLATEHANDLE: ChoosefontFlags = 32u

public val CF_FIXEDPITCHONLY: ChoosefontFlags = 16384u

public val CF_FORCEFONTEXIST: ChoosefontFlags = 65536u

public val CF_INACTIVEFONTS: ChoosefontFlags = 33554432u

public val CF_INITTOLOGFONTSTRUCT: ChoosefontFlags = 64u

public val CF_LIMITSIZE: ChoosefontFlags = 8192u

public val CF_NOFACESEL: ChoosefontFlags = 524288u

public val CF_NOOEMFONTS: ChoosefontFlags = 2048u

public val CF_NOSCRIPTSEL: ChoosefontFlags = 8388608u

public val CF_NOSIMULATIONS: ChoosefontFlags = 4096u

public val CF_NOSIZESEL: ChoosefontFlags = 2097152u

public val CF_NOSTYLESEL: ChoosefontFlags = 1048576u

public val CF_NOVECTORFONTS: ChoosefontFlags = 2048u

public val CF_NOVERTFONTS: ChoosefontFlags = 16777216u

public val CF_PRINTERFONTS: ChoosefontFlags = 2u

public val CF_SCALABLEONLY: ChoosefontFlags = 131072u

public val CF_SCREENFONTS: ChoosefontFlags = 1u

public val CF_SCRIPTSONLY: ChoosefontFlags = 1024u

public val CF_SELECTSCRIPT: ChoosefontFlags = 4194304u

public val CF_SHOWHELP: ChoosefontFlags = 4u

public val CF_TTONLY: ChoosefontFlags = 262144u

public val CF_USESTYLE: ChoosefontFlags = 128u

public val CF_WYSIWYG: ChoosefontFlags = 32768u

public val COLOROKSTRING: Pcwstr = w("commdlg_ColorOK")

public val COLOROKSTRINGA: Pcstr = s("commdlg_ColorOK")

public val COLOROKSTRINGW: Pcwstr = w("commdlg_ColorOK")

public val COLOR_ADD: UInt = 712u

public val COLOR_BLUE: UInt = 708u

public val COLOR_BLUEACCEL: UInt = 728u

public val COLOR_BOX1: UInt = 720u

public val COLOR_CURRENT: UInt = 709u

public val COLOR_CUSTOM1: UInt = 721u

public val COLOR_ELEMENT: UInt = 716u

public val COLOR_GREEN: UInt = 707u

public val COLOR_GREENACCEL: UInt = 727u

public val COLOR_HUE: UInt = 703u

public val COLOR_HUEACCEL: UInt = 723u

public val COLOR_HUESCROLL: UInt = 700u

public val COLOR_LUM: UInt = 705u

public val COLOR_LUMACCEL: UInt = 725u

public val COLOR_LUMSCROLL: UInt = 702u

public val COLOR_MIX: UInt = 719u

public val COLOR_PALETTE: UInt = 718u

public val COLOR_RAINBOW: UInt = 710u

public val COLOR_RED: UInt = 706u

public val COLOR_REDACCEL: UInt = 726u

public val COLOR_SAMPLES: UInt = 717u

public val COLOR_SAT: UInt = 704u

public val COLOR_SATACCEL: UInt = 724u

public val COLOR_SATSCROLL: UInt = 701u

public val COLOR_SAVE: UInt = 711u

public val COLOR_SCHEMES: UInt = 715u

public val COLOR_SOLID: UInt = 713u

public val COLOR_SOLID_LEFT: UInt = 730u

public val COLOR_SOLID_RIGHT: UInt = 731u

public val COLOR_TUNE: UInt = 714u

public val DLG_COLOR: UInt = 10u

public val DN_DEFAULTPRN: UInt = 1u

public val FILEOKSTRING: Pcwstr = w("commdlg_FileNameOK")

public val FILEOKSTRINGA: Pcstr = s("commdlg_FileNameOK")

public val FILEOKSTRINGW: Pcwstr = w("commdlg_FileNameOK")

public val FINDMSGSTRING: Pcwstr = w("commdlg_FindReplace")

public val FINDMSGSTRINGA: Pcstr = s("commdlg_FindReplace")

public val FINDMSGSTRINGW: Pcwstr = w("commdlg_FindReplace")

public val FNERR_BUFFERTOOSMALL: CommonDlgErrors = 12291u

public val FNERR_FILENAMECODES: CommonDlgErrors = 12288u

public val FNERR_INVALIDFILENAME: CommonDlgErrors = 12290u

public val FNERR_SUBCLASSFAILURE: CommonDlgErrors = 12289u

public val FRERR_BUFFERLENGTHZERO: CommonDlgErrors = 16385u

public val FRERR_FINDREPLACECODES: CommonDlgErrors = 16384u

public val FRM_FIRST: UInt = 1124u

public val FRM_LAST: UInt = 1224u

public val FRM_SETOPERATIONRESULT: UInt = 1124u

public val FRM_SETOPERATIONRESULTTEXT: UInt = 1125u

public val FR_DIALOGTERM: FindreplaceFlags = 64u

public val FR_DOWN: FindreplaceFlags = 1u

public val FR_ENABLEHOOK: FindreplaceFlags = 256u

public val FR_ENABLETEMPLATE: FindreplaceFlags = 512u

public val FR_ENABLETEMPLATEHANDLE: FindreplaceFlags = 8192u

public val FR_FINDNEXT: FindreplaceFlags = 8u

public val FR_HIDEMATCHCASE: FindreplaceFlags = 32768u

public val FR_HIDEUPDOWN: FindreplaceFlags = 16384u

public val FR_HIDEWHOLEWORD: FindreplaceFlags = 65536u

public val FR_MATCHALEFHAMZA: FindreplaceFlags = 2147483648u

public val FR_MATCHCASE: FindreplaceFlags = 4u

public val FR_MATCHDIAC: FindreplaceFlags = 536870912u

public val FR_MATCHKASHIDA: FindreplaceFlags = 1073741824u

public val FR_NOMATCHCASE: FindreplaceFlags = 2048u

public val FR_NOUPDOWN: FindreplaceFlags = 1024u

public val FR_NOWHOLEWORD: FindreplaceFlags = 4096u

public val FR_NOWRAPAROUND: FindreplaceFlags = 524288u

public val FR_RAW: FindreplaceFlags = 131072u

public val FR_REPLACE: FindreplaceFlags = 16u

public val FR_REPLACEALL: FindreplaceFlags = 32u

public val FR_SHOWHELP: FindreplaceFlags = 128u

public val FR_SHOWWRAPAROUND: FindreplaceFlags = 262144u

public val FR_WHOLEWORD: FindreplaceFlags = 2u

public val FR_WRAPAROUND: FindreplaceFlags = 1048576u

public val HELPMSGSTRING: Pcwstr = w("commdlg_help")

public val HELPMSGSTRINGA: Pcstr = s("commdlg_help")

public val HELPMSGSTRINGW: Pcwstr = w("commdlg_help")

public val ITALIC_FONTTYPE: ChoosefontFontType = 512u.toUShort()

public val LBSELCHSTRING: Pcwstr = w("commdlg_LBSelChangedNotify")

public val LBSELCHSTRINGA: Pcstr = s("commdlg_LBSelChangedNotify")

public val LBSELCHSTRINGW: Pcwstr = w("commdlg_LBSelChangedNotify")

public val NUM_BASIC_COLORS: UInt = 48u

public val NUM_CUSTOM_COLORS: UInt = 16u

public val OFN_ALLOWMULTISELECT: OpenFilenameFlags = 512u

public val OFN_CREATEPROMPT: OpenFilenameFlags = 8192u

public val OFN_DONTADDTORECENT: OpenFilenameFlags = 33554432u

public val OFN_ENABLEHOOK: OpenFilenameFlags = 32u

public val OFN_ENABLEINCLUDENOTIFY: OpenFilenameFlags = 4194304u

public val OFN_ENABLESIZING: OpenFilenameFlags = 8388608u

public val OFN_ENABLETEMPLATE: OpenFilenameFlags = 64u

public val OFN_ENABLETEMPLATEHANDLE: OpenFilenameFlags = 128u

public val OFN_EXPLORER: OpenFilenameFlags = 524288u

public val OFN_EXTENSIONDIFFERENT: OpenFilenameFlags = 1024u

public val OFN_EX_NONE: OpenFilenameFlagsEx = 0u

public val OFN_EX_NOPLACESBAR: OpenFilenameFlagsEx = 1u

public val OFN_FILEMUSTEXIST: OpenFilenameFlags = 4096u

public val OFN_FORCESHOWHIDDEN: OpenFilenameFlags = 268435456u

public val OFN_HIDEREADONLY: OpenFilenameFlags = 4u

public val OFN_LONGNAMES: OpenFilenameFlags = 2097152u

public val OFN_NOCHANGEDIR: OpenFilenameFlags = 8u

public val OFN_NODEREFERENCELINKS: OpenFilenameFlags = 1048576u

public val OFN_NOLONGNAMES: OpenFilenameFlags = 262144u

public val OFN_NONETWORKBUTTON: OpenFilenameFlags = 131072u

public val OFN_NOREADONLYRETURN: OpenFilenameFlags = 32768u

public val OFN_NOTESTFILECREATE: OpenFilenameFlags = 65536u

public val OFN_NOVALIDATE: OpenFilenameFlags = 256u

public val OFN_OVERWRITEPROMPT: OpenFilenameFlags = 2u

public val OFN_PATHMUSTEXIST: OpenFilenameFlags = 2048u

public val OFN_READONLY: OpenFilenameFlags = 1u

public val OFN_SHAREAWARE: OpenFilenameFlags = 16384u

public val OFN_SHAREFALLTHROUGH: UInt = 2u

public val OFN_SHARENOWARN: UInt = 1u

public val OFN_SHAREWARN: UInt = 0u

public val OFN_SHOWHELP: OpenFilenameFlags = 16u

public val PDERR_CREATEICFAILURE: CommonDlgErrors = 4106u

public val PDERR_DEFAULTDIFFERENT: CommonDlgErrors = 4108u

public val PDERR_DNDMMISMATCH: CommonDlgErrors = 4105u

public val PDERR_GETDEVMODEFAIL: CommonDlgErrors = 4101u

public val PDERR_INITFAILURE: CommonDlgErrors = 4102u

public val PDERR_LOADDRVFAILURE: CommonDlgErrors = 4100u

public val PDERR_NODEFAULTPRN: CommonDlgErrors = 4104u

public val PDERR_NODEVICES: CommonDlgErrors = 4103u

public val PDERR_PARSEFAILURE: CommonDlgErrors = 4098u

public val PDERR_PRINTERCODES: CommonDlgErrors = 4096u

public val PDERR_PRINTERNOTFOUND: CommonDlgErrors = 4107u

public val PDERR_RETDEFFAILURE: CommonDlgErrors = 4099u

public val PDERR_SETUPFAILURE: CommonDlgErrors = 4097u

public val PD_ALLPAGES: PrintdlgexFlags = 0u

public val PD_COLLATE: PrintdlgexFlags = 16u

public val PD_CURRENTPAGE: PrintdlgexFlags = 4194304u

public val PD_DISABLEPRINTTOFILE: PrintdlgexFlags = 524288u

public val PD_ENABLEPRINTHOOK: PrintdlgexFlags = 4096u

public val PD_ENABLEPRINTTEMPLATE: PrintdlgexFlags = 16384u

public val PD_ENABLEPRINTTEMPLATEHANDLE: PrintdlgexFlags = 65536u

public val PD_ENABLESETUPHOOK: PrintdlgexFlags = 8192u

public val PD_ENABLESETUPTEMPLATE: PrintdlgexFlags = 32768u

public val PD_ENABLESETUPTEMPLATEHANDLE: PrintdlgexFlags = 131072u

public val PD_EXCLUSIONFLAGS: PrintdlgexFlags = 16777216u

public val PD_HIDEPRINTTOFILE: PrintdlgexFlags = 1048576u

public val PD_NOCURRENTPAGE: PrintdlgexFlags = 8388608u

public val PD_NONETWORKBUTTON: PrintdlgexFlags = 2097152u

public val PD_NOPAGENUMS: PrintdlgexFlags = 8u

public val PD_NOSELECTION: PrintdlgexFlags = 4u

public val PD_NOWARNING: PrintdlgexFlags = 128u

public val PD_PAGENUMS: PrintdlgexFlags = 2u

public val PD_PRINTSETUP: PrintdlgexFlags = 64u

public val PD_PRINTTOFILE: PrintdlgexFlags = 32u

public val PD_RESULT_APPLY: UInt = 2u

public val PD_RESULT_CANCEL: UInt = 0u

public val PD_RESULT_PRINT: UInt = 1u

public val PD_RETURNDC: PrintdlgexFlags = 256u

public val PD_RETURNDEFAULT: PrintdlgexFlags = 1024u

public val PD_RETURNIC: PrintdlgexFlags = 512u

public val PD_SELECTION: PrintdlgexFlags = 1u

public val PD_SHOWHELP: PrintdlgexFlags = 2048u

public val PD_USEDEVMODECOPIES: PrintdlgexFlags = 262144u

public val PD_USEDEVMODECOPIESANDCOLLATE: PrintdlgexFlags = 262144u

public val PD_USELARGETEMPLATE: PrintdlgexFlags = 268435456u

public val PRINTER_FONTTYPE: ChoosefontFontType = 16384u.toUShort()

public val PSD_DEFAULTMINMARGINS: PagesetupdlgFlags = 0u

public val PSD_DISABLEMARGINS: PagesetupdlgFlags = 16u

public val PSD_DISABLEORIENTATION: PagesetupdlgFlags = 256u

public val PSD_DISABLEPAGEPAINTING: PagesetupdlgFlags = 524288u

public val PSD_DISABLEPAPER: PagesetupdlgFlags = 512u

public val PSD_DISABLEPRINTER: PagesetupdlgFlags = 32u

public val PSD_ENABLEPAGEPAINTHOOK: PagesetupdlgFlags = 262144u

public val PSD_ENABLEPAGESETUPHOOK: PagesetupdlgFlags = 8192u

public val PSD_ENABLEPAGESETUPTEMPLATE: PagesetupdlgFlags = 32768u

public val PSD_ENABLEPAGESETUPTEMPLATEHANDLE: PagesetupdlgFlags = 131072u

public val PSD_INHUNDREDTHSOFMILLIMETERS: PagesetupdlgFlags = 8u

public val PSD_INTHOUSANDTHSOFINCHES: PagesetupdlgFlags = 4u

public val PSD_INWININIINTLMEASURE: PagesetupdlgFlags = 0u

public val PSD_MARGINS: PagesetupdlgFlags = 2u

public val PSD_MINMARGINS: PagesetupdlgFlags = 1u

public val PSD_NONETWORKBUTTON: PagesetupdlgFlags = 2097152u

public val PSD_NOWARNING: PagesetupdlgFlags = 128u

public val PSD_RETURNDEFAULT: PagesetupdlgFlags = 1024u

public val PSD_SHOWHELP: PagesetupdlgFlags = 2048u

public val PS_OPENTYPE_FONTTYPE: UInt = 65536u

public val REGULAR_FONTTYPE: ChoosefontFontType = 1024u.toUShort()

public val SCREEN_FONTTYPE: ChoosefontFontType = 8192u.toUShort()

public val SETRGBSTRING: Pcwstr = w("commdlg_SetRGBColor")

public val SETRGBSTRINGA: Pcstr = s("commdlg_SetRGBColor")

public val SETRGBSTRINGW: Pcwstr = w("commdlg_SetRGBColor")

public val SHAREVISTRING: Pcwstr = w("commdlg_ShareViolation")

public val SHAREVISTRINGA: Pcstr = s("commdlg_ShareViolation")

public val SHAREVISTRINGW: Pcwstr = w("commdlg_ShareViolation")

public val SIMULATED_FONTTYPE: ChoosefontFontType = 32768u.toUShort()

public val START_PAGE_GENERAL: UInt = 4294967295u

public val SYMBOL_FONTTYPE: UInt = 524288u

public val TT_OPENTYPE_FONTTYPE: UInt = 131072u

public val TYPE1_FONTTYPE: UInt = 262144u

public val WM_CHOOSEFONT_GETLOGFONT: UInt = 1025u

public val WM_CHOOSEFONT_SETFLAGS: UInt = 1126u

public val WM_CHOOSEFONT_SETLOGFONT: UInt = 1125u

public val WM_PSD_ENVSTAMPRECT: UInt = 1029u

public val WM_PSD_FULLPAGERECT: UInt = 1025u

public val WM_PSD_GREEKTEXTRECT: UInt = 1028u

public val WM_PSD_MARGINRECT: UInt = 1027u

public val WM_PSD_MINMARGINRECT: UInt = 1026u

public val WM_PSD_YAFULLPAGERECT: UInt = 1030u
