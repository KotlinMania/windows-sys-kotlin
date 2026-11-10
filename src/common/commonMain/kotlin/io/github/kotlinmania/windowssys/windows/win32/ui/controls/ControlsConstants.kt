package io.github.kotlinmania.windowssys.windows.win32.ui.controls

import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val ABS_DOWNDISABLED: Arrowbtnstates = 8

public val ABS_DOWNHOT: Arrowbtnstates = 6

public val ABS_DOWNHOVER: Arrowbtnstates = 18

public val ABS_DOWNNORMAL: Arrowbtnstates = 5

public val ABS_DOWNPRESSED: Arrowbtnstates = 7

public val ABS_LEFTDISABLED: Arrowbtnstates = 12

public val ABS_LEFTHOT: Arrowbtnstates = 10

public val ABS_LEFTHOVER: Arrowbtnstates = 19

public val ABS_LEFTNORMAL: Arrowbtnstates = 9

public val ABS_LEFTPRESSED: Arrowbtnstates = 11

public val ABS_RIGHTDISABLED: Arrowbtnstates = 16

public val ABS_RIGHTHOT: Arrowbtnstates = 14

public val ABS_RIGHTHOVER: Arrowbtnstates = 20

public val ABS_RIGHTNORMAL: Arrowbtnstates = 13

public val ABS_RIGHTPRESSED: Arrowbtnstates = 15

public val ABS_UPDISABLED: Arrowbtnstates = 4

public val ABS_UPHOT: Arrowbtnstates = 2

public val ABS_UPHOVER: Arrowbtnstates = 17

public val ABS_UPNORMAL: Arrowbtnstates = 1

public val ABS_UPPRESSED: Arrowbtnstates = 3

public val ACM_ISPLAYING: UInt = 1128u

public val ACM_OPEN: UInt = 1127u

public val ACM_OPENA: UInt = 1124u

public val ACM_OPENW: UInt = 1127u

public val ACM_PLAY: UInt = 1125u

public val ACM_STOP: UInt = 1126u

public val ACN_START: UInt = 1u

public val ACN_STOP: UInt = 2u

public val ACS_AUTOPLAY: UInt = 4u

public val ACS_CENTER: UInt = 1u

public val ACS_TIMER: UInt = 8u

public val ACS_TRANSPARENT: UInt = 2u

public val ALLOW_CONTROLS: SetThemeAppPropertiesFlags = 2u

public val ALLOW_NONCLIENT: SetThemeAppPropertiesFlags = 1u

public val ALLOW_WEBCONTENT: SetThemeAppPropertiesFlags = 4u

public val ANIMATE_CLASS: Pcwstr = w("SysAnimate32")

public val ANIMATE_CLASSA: Pcstr = s("SysAnimate32")

public val ANIMATE_CLASSW: Pcwstr = w("SysAnimate32")

public val AW_BUTTON: Aerowizardparts = 5

public val AW_COMMANDAREA: Aerowizardparts = 4

public val AW_CONTENTAREA: Aerowizardparts = 3

public val AW_HEADERAREA: Aerowizardparts = 2

public val AW_S_CONTENTAREA_NOMARGIN: Contentareastates = 1

public val AW_S_HEADERAREA_NOMARGIN: Headerareastates = 1

public val AW_S_TITLEBAR_ACTIVE: Titlebarstates = 1

public val AW_S_TITLEBAR_INACTIVE: Titlebarstates = 2

public val AW_TITLEBAR: Aerowizardparts = 1

public val BCM_FIRST: UInt = 5632u

public val BCM_GETIDEALSIZE: UInt = 5633u

public val BCM_GETIMAGELIST: UInt = 5635u

public val BCM_GETNOTE: UInt = 5642u

public val BCM_GETNOTELENGTH: UInt = 5643u

public val BCM_GETSPLITINFO: UInt = 5640u

public val BCM_GETTEXTMARGIN: UInt = 5637u

public val BCM_SETDROPDOWNSTATE: UInt = 5638u

public val BCM_SETIMAGELIST: UInt = 5634u

public val BCM_SETNOTE: UInt = 5641u

public val BCM_SETSHIELD: UInt = 5644u

public val BCM_SETSPLITINFO: UInt = 5639u

public val BCM_SETTEXTMARGIN: UInt = 5636u

public val BCN_DROPDOWN: UInt = 4294966048u

public val BCN_FIRST: UInt = 4294966046u

public val BCN_HOTITEMCHANGE: UInt = 4294966047u

public val BCN_LAST: UInt = 4294965946u

public val BCSIF_GLYPH: UInt = 1u

public val BCSIF_IMAGE: UInt = 2u

public val BCSIF_SIZE: UInt = 8u

public val BCSIF_STYLE: UInt = 4u

public val BCSS_ALIGNLEFT: UInt = 4u

public val BCSS_IMAGE: UInt = 8u

public val BCSS_NOSPLIT: UInt = 1u

public val BCSS_STRETCH: UInt = 2u

public val BPAS_CUBIC: BpAnimationstyle = 2

public val BPAS_LINEAR: BpAnimationstyle = 1

public val BPAS_NONE: BpAnimationstyle = 0

public val BPAS_SINE: BpAnimationstyle = 3

public val BPBF_COMPATIBLEBITMAP: BpBufferformat = 0

public val BPBF_DIB: BpBufferformat = 1

public val BPBF_TOPDOWNDIB: BpBufferformat = 2

public val BPBF_TOPDOWNMONODIB: BpBufferformat = 3

public val BPPF_ERASE: BpPaintparamsFlags = 1u

public val BPPF_NOCLIP: BpPaintparamsFlags = 2u

public val BPPF_NONCLIENT: BpPaintparamsFlags = 4u

public val BP_CHECKBOX: Buttonparts = 3

public val BP_CHECKBOX_HCDISABLED: Buttonparts = 9

public val BP_COMMANDLINK: Buttonparts = 6

public val BP_COMMANDLINKGLYPH: Buttonparts = 7

public val BP_GROUPBOX: Buttonparts = 4

public val BP_GROUPBOX_HCDISABLED: Buttonparts = 10

public val BP_PUSHBUTTON: Buttonparts = 1

public val BP_PUSHBUTTONDROPDOWN: Buttonparts = 11

public val BP_RADIOBUTTON: Buttonparts = 2

public val BP_RADIOBUTTON_HCDISABLED: Buttonparts = 8

public val BP_USERBUTTON: Buttonparts = 5

public val BST_CHECKED: DlgButtonCheckState = 1u

public val BST_DROPDOWNPUSHED: UInt = 1024u

public val BST_HOT: UInt = 512u

public val BST_INDETERMINATE: DlgButtonCheckState = 2u

public val BST_UNCHECKED: DlgButtonCheckState = 0u

public val BS_COMMANDLINK: Int = 14

public val BS_DEFCOMMANDLINK: Int = 15

public val BS_DEFSPLITBUTTON: Int = 13

public val BS_SPLITBUTTON: Int = 12

public val BTNS_AUTOSIZE: UInt = 16u

public val BTNS_BUTTON: UInt = 0u

public val BTNS_CHECK: UInt = 2u

public val BTNS_DROPDOWN: UInt = 8u

public val BTNS_GROUP: UInt = 4u

public val BTNS_NOPREFIX: UInt = 32u

public val BTNS_SEP: UInt = 1u

public val BTNS_SHOWTEXT: UInt = 64u

public val BTNS_WHOLEDROPDOWN: UInt = 128u

public val BT_BORDERFILL: Bgtype = 1

public val BT_ELLIPSE: Bordertype = 2

public val BT_IMAGEFILE: Bgtype = 0

public val BT_NONE: Bgtype = 2

public val BT_RECT: Bordertype = 0

public val BT_ROUNDRECT: Bordertype = 1

public val BUTTON_IMAGELIST_ALIGN_BOTTOM: ButtonImagelistAlign = 3u

public val BUTTON_IMAGELIST_ALIGN_CENTER: ButtonImagelistAlign = 4u

public val BUTTON_IMAGELIST_ALIGN_LEFT: ButtonImagelistAlign = 0u

public val BUTTON_IMAGELIST_ALIGN_RIGHT: ButtonImagelistAlign = 1u

public val BUTTON_IMAGELIST_ALIGN_TOP: ButtonImagelistAlign = 2u

public val CA_CENTER: Contentalignment = 1

public val CA_LEFT: Contentalignment = 0

public val CA_RIGHT: Contentalignment = 2

public val CBB_DISABLED: Borderstates = 4

public val CBB_FOCUSED: Borderstates = 3

public val CBB_HOT: Borderstates = 2

public val CBB_NORMAL: Borderstates = 1

public val CBCB_DISABLED: Cuebannerstates = 4

public val CBCB_HOT: Cuebannerstates = 2

public val CBCB_NORMAL: Cuebannerstates = 1

public val CBCB_PRESSED: Cuebannerstates = 3

public val CBDI_HIGHLIGHTED: Dropdownitemstates = 2

public val CBDI_NORMAL: Dropdownitemstates = 1

public val CBEIF_DI_SETITEM: ComboboxExItemFlags = 268435456u

public val CBEIF_IMAGE: ComboboxExItemFlags = 2u

public val CBEIF_INDENT: ComboboxExItemFlags = 16u

public val CBEIF_LPARAM: ComboboxExItemFlags = 32u

public val CBEIF_OVERLAY: ComboboxExItemFlags = 8u

public val CBEIF_SELECTEDIMAGE: ComboboxExItemFlags = 4u

public val CBEIF_TEXT: ComboboxExItemFlags = 1u

public val CBEMAXSTRLEN: UInt = 260u

public val CBEM_GETCOMBOCONTROL: UInt = 1030u

public val CBEM_GETEDITCONTROL: UInt = 1031u

public val CBEM_GETEXSTYLE: UInt = 1033u

public val CBEM_GETEXTENDEDSTYLE: UInt = 1033u

public val CBEM_GETIMAGELIST: UInt = 1027u

public val CBEM_GETITEM: UInt = 1037u

public val CBEM_GETITEMA: UInt = 1028u

public val CBEM_GETITEMW: UInt = 1037u

public val CBEM_GETUNICODEFORMAT: UInt = 8198u

public val CBEM_HASEDITCHANGED: UInt = 1034u

public val CBEM_INSERTITEM: UInt = 1035u

public val CBEM_INSERTITEMA: UInt = 1025u

public val CBEM_INSERTITEMW: UInt = 1035u

public val CBEM_SETEXSTYLE: UInt = 1032u

public val CBEM_SETEXTENDEDSTYLE: UInt = 1038u

public val CBEM_SETIMAGELIST: UInt = 1026u

public val CBEM_SETITEM: UInt = 1036u

public val CBEM_SETITEMA: UInt = 1029u

public val CBEM_SETITEMW: UInt = 1036u

public val CBEM_SETUNICODEFORMAT: UInt = 8197u

public val CBEM_SETWINDOWTHEME: UInt = 8203u

public val CBENF_DROPDOWN: UInt = 4u

public val CBENF_ESCAPE: UInt = 3u

public val CBENF_KILLFOCUS: UInt = 1u

public val CBENF_RETURN: UInt = 2u

public val CBEN_BEGINEDIT: UInt = 4294966492u

public val CBEN_DELETEITEM: UInt = 4294966494u

public val CBEN_DRAGBEGIN: UInt = 4294966487u

public val CBEN_DRAGBEGINA: UInt = 4294966488u

public val CBEN_DRAGBEGINW: UInt = 4294966487u

public val CBEN_ENDEDIT: UInt = 4294966490u

public val CBEN_ENDEDITA: UInt = 4294966491u

public val CBEN_ENDEDITW: UInt = 4294966490u

public val CBEN_FIRST: UInt = 4294966496u

public val CBEN_GETDISPINFOA: UInt = 4294966496u

public val CBEN_GETDISPINFOW: UInt = 4294966489u

public val CBEN_INSERTITEM: UInt = 4294966495u

public val CBEN_LAST: UInt = 4294966466u

public val CBES_EX_CASESENSITIVE: UInt = 16u

public val CBES_EX_NOEDITIMAGE: UInt = 1u

public val CBES_EX_NOEDITIMAGEINDENT: UInt = 2u

public val CBES_EX_NOSIZELIMIT: UInt = 8u

public val CBES_EX_PATHWORDBREAKPROC: UInt = 4u

public val CBES_EX_TEXTENDELLIPSIS: UInt = 32u

public val CBM_FIRST: UInt = 5888u

public val CBRO_DISABLED: Readonlystates = 4

public val CBRO_HOT: Readonlystates = 2

public val CBRO_NORMAL: Readonlystates = 1

public val CBRO_PRESSED: Readonlystates = 3

public val CBS_CHECKEDDISABLED: Checkboxstates = 8

public val CBS_CHECKEDHOT: Checkboxstates = 6

public val CBS_CHECKEDNORMAL: Checkboxstates = 5

public val CBS_CHECKEDPRESSED: Checkboxstates = 7

public val CBS_DISABLED: Closebuttonstates = 4

public val CBS_EXCLUDEDDISABLED: Checkboxstates = 20

public val CBS_EXCLUDEDHOT: Checkboxstates = 18

public val CBS_EXCLUDEDNORMAL: Checkboxstates = 17

public val CBS_EXCLUDEDPRESSED: Checkboxstates = 19

public val CBS_HOT: Closebuttonstates = 2

public val CBS_IMPLICITDISABLED: Checkboxstates = 16

public val CBS_IMPLICITHOT: Checkboxstates = 14

public val CBS_IMPLICITNORMAL: Checkboxstates = 13

public val CBS_IMPLICITPRESSED: Checkboxstates = 15

public val CBS_MIXEDDISABLED: Checkboxstates = 12

public val CBS_MIXEDHOT: Checkboxstates = 10

public val CBS_MIXEDNORMAL: Checkboxstates = 9

public val CBS_MIXEDPRESSED: Checkboxstates = 11

public val CBS_NORMAL: Closebuttonstates = 1

public val CBS_PUSHED: Closebuttonstates = 3

public val CBS_UNCHECKEDDISABLED: Checkboxstates = 4

public val CBS_UNCHECKEDHOT: Checkboxstates = 2

public val CBS_UNCHECKEDNORMAL: Checkboxstates = 1

public val CBS_UNCHECKEDPRESSED: Checkboxstates = 3

public val CBTBS_DISABLED: Transparentbackgroundstates = 3

public val CBTBS_FOCUSED: Transparentbackgroundstates = 4

public val CBTBS_HOT: Transparentbackgroundstates = 2

public val CBTBS_NORMAL: Transparentbackgroundstates = 1

public val CBXSL_DISABLED: Dropdownbuttonleftstates = 4

public val CBXSL_HOT: Dropdownbuttonleftstates = 2

public val CBXSL_NORMAL: Dropdownbuttonleftstates = 1

public val CBXSL_PRESSED: Dropdownbuttonleftstates = 3

public val CBXSR_DISABLED: Dropdownbuttonrightstates = 4

public val CBXSR_HOT: Dropdownbuttonrightstates = 2

public val CBXSR_NORMAL: Dropdownbuttonrightstates = 1

public val CBXSR_PRESSED: Dropdownbuttonrightstates = 3

public val CBXS_DISABLED: Comboboxstylestates = 4

public val CBXS_HOT: Comboboxstylestates = 2

public val CBXS_NORMAL: Comboboxstylestates = 1

public val CBXS_PRESSED: Comboboxstylestates = 3

public val CB_GETCUEBANNER: UInt = 5892u

public val CB_GETMINVISIBLE: UInt = 5890u

public val CB_SETCUEBANNER: UInt = 5891u

public val CB_SETMINVISIBLE: UInt = 5889u

public val CCF_NOTEXT: UInt = 1u

public val CCHCCCLASS: UInt = 32u

public val CCHCCDESC: UInt = 32u

public val CCHCCTEXT: UInt = 256u

public val CCM_DPISCALE: UInt = 8204u

public val CCM_FIRST: UInt = 8192u

public val CCM_GETCOLORSCHEME: UInt = 8195u

public val CCM_GETDROPTARGET: UInt = 8196u

public val CCM_GETUNICODEFORMAT: UInt = 8198u

public val CCM_GETVERSION: UInt = 8200u

public val CCM_LAST: UInt = 8704u

public val CCM_SETBKCOLOR: UInt = 8193u

public val CCM_SETCOLORSCHEME: UInt = 8194u

public val CCM_SETNOTIFYWINDOW: UInt = 8201u

public val CCM_SETUNICODEFORMAT: UInt = 8197u

public val CCM_SETVERSION: UInt = 8199u

public val CCM_SETWINDOWTHEME: UInt = 8203u

public val CCS_ADJUSTABLE: Int = 32

public val CCS_BOTTOM: Int = 3

public val CCS_NODIVIDER: Int = 64

public val CCS_NOMOVEY: Int = 2

public val CCS_NOPARENTALIGN: Int = 8

public val CCS_NORESIZE: Int = 4

public val CCS_TOP: Int = 1

public val CCS_VERT: Int = 128

public val CDDS_ITEM: UInt = 65536u

public val CDDS_ITEMPOSTERASE: NmcustomdrawDrawStage = 65540u

public val CDDS_ITEMPOSTPAINT: NmcustomdrawDrawStage = 65538u

public val CDDS_ITEMPREERASE: NmcustomdrawDrawStage = 65539u

public val CDDS_ITEMPREPAINT: NmcustomdrawDrawStage = 65537u

public val CDDS_POSTERASE: UInt = 4u

public val CDDS_POSTPAINT: NmcustomdrawDrawStage = 2u

public val CDDS_PREERASE: NmcustomdrawDrawStage = 3u

public val CDDS_PREPAINT: NmcustomdrawDrawStage = 1u

public val CDDS_SUBITEM: NmcustomdrawDrawStage = 131072u

public val CDIS_CHECKED: NmcustomdrawDrawStateFlags = 8u

public val CDIS_DEFAULT: NmcustomdrawDrawStateFlags = 32u

public val CDIS_DISABLED: NmcustomdrawDrawStateFlags = 4u

public val CDIS_DROPHILITED: NmcustomdrawDrawStateFlags = 4096u

public val CDIS_FOCUS: NmcustomdrawDrawStateFlags = 16u

public val CDIS_GRAYED: NmcustomdrawDrawStateFlags = 2u

public val CDIS_HOT: NmcustomdrawDrawStateFlags = 64u

public val CDIS_INDETERMINATE: NmcustomdrawDrawStateFlags = 256u

public val CDIS_MARKED: NmcustomdrawDrawStateFlags = 128u

public val CDIS_NEARHOT: NmcustomdrawDrawStateFlags = 1024u

public val CDIS_OTHERSIDEHOT: NmcustomdrawDrawStateFlags = 2048u

public val CDIS_SELECTED: NmcustomdrawDrawStateFlags = 1u

public val CDIS_SHOWKEYBOARDCUES: NmcustomdrawDrawStateFlags = 512u

public val CDN_FIRST: UInt = 4294966695u

public val CDN_LAST: UInt = 4294966597u

public val CDRF_DODEFAULT: UInt = 0u

public val CDRF_DOERASE: UInt = 8u

public val CDRF_NEWFONT: UInt = 2u

public val CDRF_NOTIFYITEMDRAW: UInt = 32u

public val CDRF_NOTIFYPOSTERASE: UInt = 64u

public val CDRF_NOTIFYPOSTPAINT: UInt = 16u

public val CDRF_NOTIFYSUBITEMDRAW: UInt = 32u

public val CDRF_SKIPDEFAULT: UInt = 4u

public val CDRF_SKIPPOSTPAINT: UInt = 256u

public val CHEVSV_HOT: Chevronvertstates = 2

public val CHEVSV_NORMAL: Chevronvertstates = 1

public val CHEVSV_PRESSED: Chevronvertstates = 3

public val CHEVS_HOT: Chevronstates = 2

public val CHEVS_NORMAL: Chevronstates = 1

public val CHEVS_PRESSED: Chevronstates = 3

public val CLP_TIME: Clockparts = 1

public val CLR_DEFAULT: Int = -16777216

public val CLR_HILIGHT: Int = -16777216

public val CLR_NONE: Int = -1

public val CLS_HOT: Clockstates = 2

public val CLS_NORMAL: Clockstates = 1

public val CLS_PRESSED: Clockstates = 3

public val CMB_MASKED: UInt = 2u

public val CMDLGS_DEFAULTED: Commandlinkglyphstates = 5

public val CMDLGS_DISABLED: Commandlinkglyphstates = 4

public val CMDLGS_HOT: Commandlinkglyphstates = 2

public val CMDLGS_NORMAL: Commandlinkglyphstates = 1

public val CMDLGS_PRESSED: Commandlinkglyphstates = 3

public val CMDLS_DEFAULTED: Commandlinkstates = 5

public val CMDLS_DEFAULTED_ANIMATING: Commandlinkstates = 6

public val CMDLS_DISABLED: Commandlinkstates = 4

public val CMDLS_HOT: Commandlinkstates = 2

public val CMDLS_NORMAL: Commandlinkstates = 1

public val CMDLS_PRESSED: Commandlinkstates = 3

public val COLORMGMTDLGORD: UInt = 1551u

public val COMCTL32_VERSION: UInt = 6u

public val CPANEL_BANNERAREA: Controlpanelparts = 18

public val CPANEL_BODYTEXT: Controlpanelparts = 6

public val CPANEL_BODYTITLE: Controlpanelparts = 19

public val CPANEL_BUTTON: Controlpanelparts = 14

public val CPANEL_CONTENTLINK: Controlpanelparts = 10

public val CPANEL_CONTENTPANE: Controlpanelparts = 2

public val CPANEL_CONTENTPANELABEL: Controlpanelparts = 4

public val CPANEL_CONTENTPANELINE: Controlpanelparts = 17

public val CPANEL_GROUPTEXT: Controlpanelparts = 9

public val CPANEL_HELPLINK: Controlpanelparts = 7

public val CPANEL_LARGECOMMANDAREA: Controlpanelparts = 12

public val CPANEL_MESSAGETEXT: Controlpanelparts = 15

public val CPANEL_NAVIGATIONPANE: Controlpanelparts = 1

public val CPANEL_NAVIGATIONPANELABEL: Controlpanelparts = 3

public val CPANEL_NAVIGATIONPANELINE: Controlpanelparts = 16

public val CPANEL_SECTIONTITLELINK: Controlpanelparts = 11

public val CPANEL_SMALLCOMMANDAREA: Controlpanelparts = 13

public val CPANEL_TASKLINK: Controlpanelparts = 8

public val CPANEL_TITLE: Controlpanelparts = 5

public val CPCL_DISABLED: Contentlinkstates = 4

public val CPCL_HOT: Contentlinkstates = 2

public val CPCL_NORMAL: Contentlinkstates = 1

public val CPCL_PRESSED: Contentlinkstates = 3

public val CPHL_DISABLED: Helplinkstates = 4

public val CPHL_HOT: Helplinkstates = 2

public val CPHL_NORMAL: Helplinkstates = 1

public val CPHL_PRESSED: Helplinkstates = 3

public val CPSTL_HOT: Sectiontitlelinkstates = 2

public val CPSTL_NORMAL: Sectiontitlelinkstates = 1

public val CPTL_DISABLED: Tasklinkstates = 4

public val CPTL_HOT: Tasklinkstates = 2

public val CPTL_NORMAL: Tasklinkstates = 1

public val CPTL_PAGE: Tasklinkstates = 5

public val CPTL_PRESSED: Tasklinkstates = 3

public val CP_BACKGROUND: Comboboxparts = 2

public val CP_BORDER: Comboboxparts = 4

public val CP_CUEBANNER: Comboboxparts = 8

public val CP_DROPDOWNBUTTON: Comboboxparts = 1

public val CP_DROPDOWNBUTTONLEFT: Comboboxparts = 7

public val CP_DROPDOWNBUTTONRIGHT: Comboboxparts = 6

public val CP_DROPDOWNITEM: Comboboxparts = 9

public val CP_READONLY: Comboboxparts = 5

public val CP_TRANSPARENTBACKGROUND: Comboboxparts = 3

public val CSST_TAB: Communicationsparts = 1

public val CSTB_HOT: Tabstates = 2

public val CSTB_NORMAL: Tabstates = 1

public val CSTB_SELECTED: Tabstates = 3

public val CS_ACTIVE: Captionstates = 1

public val CS_DISABLED: Captionstates = 3

public val CS_INACTIVE: Captionstates = 2

public val DATETIMEPICK_CLASS: Pcwstr = w("SysDateTimePick32")

public val DATETIMEPICK_CLASSA: Pcstr = s("SysDateTimePick32")

public val DATETIMEPICK_CLASSW: Pcwstr = w("SysDateTimePick32")

public val DA_ERR: Int = -1

public val DA_LAST: UInt = 2147483647u

public val DDCOPY_HIGHLIGHT: Copystates = 1

public val DDCOPY_NOHIGHLIGHT: Copystates = 2

public val DDCREATELINK_HIGHLIGHT: Createlinkstates = 1

public val DDCREATELINK_NOHIGHLIGHT: Createlinkstates = 2

public val DDL_ARCHIVE: DlgDirListFileType = 32u

public val DDL_DIRECTORY: DlgDirListFileType = 16u

public val DDL_DRIVES: DlgDirListFileType = 16384u

public val DDL_EXCLUSIVE: DlgDirListFileType = 32768u

public val DDL_HIDDEN: DlgDirListFileType = 2u

public val DDL_POSTMSGS: DlgDirListFileType = 8192u

public val DDL_READONLY: DlgDirListFileType = 1u

public val DDL_READWRITE: DlgDirListFileType = 0u

public val DDL_SYSTEM: DlgDirListFileType = 4u

public val DDMOVE_HIGHLIGHT: Movestates = 1

public val DDMOVE_NOHIGHLIGHT: Movestates = 2

public val DDNONE_HIGHLIGHT: Nonestates = 1

public val DDNONE_NOHIGHLIGHT: Nonestates = 2

public val DDUPDATEMETADATA_HIGHLIGHT: Updatemetadatastates = 1

public val DDUPDATEMETADATA_NOHIGHLIGHT: Updatemetadatastates = 2

public val DDWARNING_HIGHLIGHT: Warningstates = 1

public val DDWARNING_NOHIGHLIGHT: Warningstates = 2

public val DD_COPY: Dragdropparts = 1

public val DD_CREATELINK: Dragdropparts = 4

public val DD_IMAGEBG: Dragdropparts = 7

public val DD_MOVE: Dragdropparts = 2

public val DD_NONE: Dragdropparts = 6

public val DD_TEXTBG: Dragdropparts = 8

public val DD_UPDATEMETADATA: Dragdropparts = 3

public val DD_WARNING: Dragdropparts = 5

public val DL_BEGINDRAG: DraglistinfoNotificationFlags = 1157u

public val DL_CANCELDRAG: DraglistinfoNotificationFlags = 1160u

public val DL_COPYCURSOR: UInt = 2u

public val DL_CURSORSET: UInt = 0u

public val DL_DRAGGING: DraglistinfoNotificationFlags = 1158u

public val DL_DROPPED: DraglistinfoNotificationFlags = 1159u

public val DL_MOVECURSOR: UInt = 3u

public val DL_STOPCURSOR: UInt = 1u

public val DNHZS_DISABLED: Downhorzstates = 4

public val DNHZS_HOT: Downhorzstates = 2

public val DNHZS_NORMAL: Downhorzstates = 1

public val DNHZS_PRESSED: Downhorzstates = 3

public val DNS_DISABLED: Downstates = 4

public val DNS_HOT: Downstates = 2

public val DNS_NORMAL: Downstates = 1

public val DNS_PRESSED: Downstates = 3

public val DPAMM_DELETE: DpammMessage = 2u

public val DPAMM_INSERT: DpammMessage = 3u

public val DPAMM_MERGE: DpammMessage = 1u

public val DPAM_INTERSECT: UInt = 8u

public val DPAM_NORMAL: UInt = 2u

public val DPAM_SORTED: UInt = 1u

public val DPAM_UNION: UInt = 4u

public val DPAS_INSERTAFTER: UInt = 4u

public val DPAS_INSERTBEFORE: UInt = 2u

public val DPAS_SORTED: UInt = 1u

public val DPA_APPEND: UInt = 2147483647u

public val DPA_ERR: Int = -1

public val DPDB_DISABLED: Dateborderstates = 4

public val DPDB_FOCUSED: Dateborderstates = 3

public val DPDB_HOT: Dateborderstates = 2

public val DPDB_NORMAL: Dateborderstates = 1

public val DPDT_DISABLED: Datetextstates = 2

public val DPDT_NORMAL: Datetextstates = 1

public val DPDT_SELECTED: Datetextstates = 3

public val DPSCBR_DISABLED: Showcalendarbuttonrightstates = 4

public val DPSCBR_HOT: Showcalendarbuttonrightstates = 2

public val DPSCBR_NORMAL: Showcalendarbuttonrightstates = 1

public val DPSCBR_PRESSED: Showcalendarbuttonrightstates = 3

public val DP_DATEBORDER: Datepickerparts = 2

public val DP_DATETEXT: Datepickerparts = 1

public val DP_SHOWCALENDARBUTTONRIGHT: Datepickerparts = 3

public val DRAGLISTMSGSTRING: Pcwstr = w("commctrl_DragListMsg")

public val DSA_APPEND: UInt = 2147483647u

public val DSA_ERR: Int = -1

public val DTBG_CLIPRECT: UInt = 1u

public val DTBG_COMPUTINGREGION: UInt = 16u

public val DTBG_DRAWSOLID: UInt = 2u

public val DTBG_MIRRORDC: UInt = 32u

public val DTBG_NOMIRROR: UInt = 64u

public val DTBG_OMITBORDER: UInt = 4u

public val DTBG_OMITCONTENT: UInt = 8u

public val DTM_CLOSEMONTHCAL: UInt = 4109u

public val DTM_FIRST: UInt = 4096u

public val DTM_GETDATETIMEPICKERINFO: UInt = 4110u

public val DTM_GETIDEALSIZE: UInt = 4111u

public val DTM_GETMCCOLOR: UInt = 4103u

public val DTM_GETMCFONT: UInt = 4106u

public val DTM_GETMCSTYLE: UInt = 4108u

public val DTM_GETMONTHCAL: UInt = 4104u

public val DTM_GETRANGE: UInt = 4099u

public val DTM_GETSYSTEMTIME: UInt = 4097u

public val DTM_SETFORMAT: UInt = 4146u

public val DTM_SETFORMATA: UInt = 4101u

public val DTM_SETFORMATW: UInt = 4146u

public val DTM_SETMCCOLOR: UInt = 4102u

public val DTM_SETMCFONT: UInt = 4105u

public val DTM_SETMCSTYLE: UInt = 4107u

public val DTM_SETRANGE: UInt = 4100u

public val DTM_SETSYSTEMTIME: UInt = 4098u

public val DTN_CLOSEUP: UInt = 4294966543u

public val DTN_DATETIMECHANGE: UInt = 4294966537u

public val DTN_DROPDOWN: UInt = 4294966542u

public val DTN_FIRST: UInt = 4294966556u

public val DTN_FIRST2: UInt = 4294966543u

public val DTN_FORMAT: UInt = 4294966553u

public val DTN_FORMATA: UInt = 4294966540u

public val DTN_FORMATQUERY: UInt = 4294966554u

public val DTN_FORMATQUERYA: UInt = 4294966541u

public val DTN_FORMATQUERYW: UInt = 4294966554u

public val DTN_FORMATW: UInt = 4294966553u

public val DTN_LAST: UInt = 4294966551u

public val DTN_LAST2: UInt = 4294966497u

public val DTN_USERSTRING: UInt = 4294966551u

public val DTN_USERSTRINGA: UInt = 4294966538u

public val DTN_USERSTRINGW: UInt = 4294966551u

public val DTN_WMKEYDOWN: UInt = 4294966552u

public val DTN_WMKEYDOWNA: UInt = 4294966539u

public val DTN_WMKEYDOWNW: UInt = 4294966552u

public val DTPB_USECTLCOLORSTATIC: DrawThemeParentBackgroundFlags = 2u

public val DTPB_USEERASEBKGND: DrawThemeParentBackgroundFlags = 4u

public val DTPB_WINDOWDC: DrawThemeParentBackgroundFlags = 1u

public val DTS_APPCANPARSE: UInt = 16u

public val DTS_LONGDATEFORMAT: UInt = 4u

public val DTS_RIGHTALIGN: UInt = 32u

public val DTS_SHORTDATECENTURYFORMAT: UInt = 12u

public val DTS_SHORTDATEFORMAT: UInt = 0u

public val DTS_SHOWNONE: UInt = 2u

public val DTS_TIMEFORMAT: UInt = 9u

public val DTS_UPDOWN: UInt = 1u

public val DTT_APPLYOVERLAY: DttoptsFlags = 1024u

public val DTT_BORDERCOLOR: DttoptsFlags = 2u

public val DTT_BORDERSIZE: DttoptsFlags = 32u

public val DTT_CALCRECT: DttoptsFlags = 512u

public val DTT_CALLBACK: DttoptsFlags = 4096u

public val DTT_COLORPROP: DttoptsFlags = 128u

public val DTT_COMPOSITED: DttoptsFlags = 8192u

public val DTT_FLAGS2VALIDBITS: UInt = 1u

public val DTT_FONTPROP: DttoptsFlags = 64u

public val DTT_GLOWSIZE: DttoptsFlags = 2048u

public val DTT_GRAYED: UInt = 1u

public val DTT_SHADOWCOLOR: DttoptsFlags = 4u

public val DTT_SHADOWOFFSET: DttoptsFlags = 16u

public val DTT_SHADOWTYPE: DttoptsFlags = 8u

public val DTT_STATEID: DttoptsFlags = 256u

public val DTT_TEXTCOLOR: DttoptsFlags = 1u

public val DTT_VALIDBITS: DttoptsFlags = 12287u

public val EBHC_HOT: Headerclosestates = 2

public val EBHC_NORMAL: Headerclosestates = 1

public val EBHC_PRESSED: Headerclosestates = 3

public val EBHP_HOT: Headerpinstates = 2

public val EBHP_NORMAL: Headerpinstates = 1

public val EBHP_PRESSED: Headerpinstates = 3

public val EBHP_SELECTEDHOT: Headerpinstates = 5

public val EBHP_SELECTEDNORMAL: Headerpinstates = 4

public val EBHP_SELECTEDPRESSED: Headerpinstates = 6

public val EBM_HOT: Iebarmenustates = 2

public val EBM_NORMAL: Iebarmenustates = 1

public val EBM_PRESSED: Iebarmenustates = 3

public val EBNGC_HOT: Normalgroupcollapsestates = 2

public val EBNGC_NORMAL: Normalgroupcollapsestates = 1

public val EBNGC_PRESSED: Normalgroupcollapsestates = 3

public val EBNGE_HOT: Normalgroupexpandstates = 2

public val EBNGE_NORMAL: Normalgroupexpandstates = 1

public val EBNGE_PRESSED: Normalgroupexpandstates = 3

public val EBP_HEADERBACKGROUND: Explorerbarparts = 1

public val EBP_HEADERCLOSE: Explorerbarparts = 2

public val EBP_HEADERPIN: Explorerbarparts = 3

public val EBP_IEBARMENU: Explorerbarparts = 4

public val EBP_NORMALGROUPBACKGROUND: Explorerbarparts = 5

public val EBP_NORMALGROUPCOLLAPSE: Explorerbarparts = 6

public val EBP_NORMALGROUPEXPAND: Explorerbarparts = 7

public val EBP_NORMALGROUPHEAD: Explorerbarparts = 8

public val EBP_SPECIALGROUPBACKGROUND: Explorerbarparts = 9

public val EBP_SPECIALGROUPCOLLAPSE: Explorerbarparts = 10

public val EBP_SPECIALGROUPEXPAND: Explorerbarparts = 11

public val EBP_SPECIALGROUPHEAD: Explorerbarparts = 12

public val EBSGC_HOT: Specialgroupcollapsestates = 2

public val EBSGC_NORMAL: Specialgroupcollapsestates = 1

public val EBSGC_PRESSED: Specialgroupcollapsestates = 3

public val EBSGE_HOT: Specialgroupexpandstates = 2

public val EBSGE_NORMAL: Specialgroupexpandstates = 1

public val EBSGE_PRESSED: Specialgroupexpandstates = 3

public val EBS_ASSIST: Backgroundstates = 6

public val EBS_DISABLED: Backgroundstates = 3

public val EBS_FOCUSED: Backgroundstates = 4

public val EBS_HOT: Backgroundstates = 2

public val EBS_NORMAL: Backgroundstates = 1

public val EBS_READONLY: Backgroundstates = 5

public val EBWBS_DISABLED: Backgroundwithborderstates = 3

public val EBWBS_FOCUSED: Backgroundwithborderstates = 4

public val EBWBS_HOT: Backgroundwithborderstates = 2

public val EBWBS_NORMAL: Backgroundwithborderstates = 1

public val ECM_FIRST: UInt = 5376u

public val EC_ENDOFLINE_CR: EcEndofline = 2

public val EC_ENDOFLINE_CRLF: EcEndofline = 1

public val EC_ENDOFLINE_DETECTFROMCONTENT: EcEndofline = 0

public val EC_ENDOFLINE_LF: EcEndofline = 3

public val EC_SEARCHWEB_ENTRYPOINT_CONTEXTMENU: EcSearchwebEntrypoint = 1

public val EC_SEARCHWEB_ENTRYPOINT_EXTERNAL: EcSearchwebEntrypoint = 0

public val EMF_CENTERED: NmlvemptymarkupFlags = 1u

public val EMP_MARKUPTEXT: Emptymarkupparts = 1

public val EMT_LINKTEXT: Markuptextstates = 2

public val EMT_NORMALTEXT: Markuptextstates = 1

public val EM_CANUNDO: UInt = 198u

public val EM_CHARFROMPOS: UInt = 215u

public val EM_EMPTYUNDOBUFFER: UInt = 205u

public val EM_ENABLEFEATURE: UInt = 218u

public val EM_ENABLESEARCHWEB: UInt = 5390u

public val EM_FILELINEFROMCHAR: UInt = 5395u

public val EM_FILELINEINDEX: UInt = 5396u

public val EM_FILELINELENGTH: UInt = 5397u

public val EM_FMTLINES: UInt = 200u

public val EM_GETCARETINDEX: UInt = 5394u

public val EM_GETCUEBANNER: UInt = 5378u

public val EM_GETENDOFLINE: UInt = 5389u

public val EM_GETEXTENDEDSTYLE: UInt = 5387u

public val EM_GETFILELINE: UInt = 5398u

public val EM_GETFILELINECOUNT: UInt = 5399u

public val EM_GETFIRSTVISIBLELINE: UInt = 206u

public val EM_GETHANDLE: UInt = 189u

public val EM_GETHILITE: UInt = 5382u

public val EM_GETIMESTATUS: UInt = 217u

public val EM_GETLIMITTEXT: UInt = 213u

public val EM_GETLINE: UInt = 196u

public val EM_GETLINECOUNT: UInt = 186u

public val EM_GETMARGINS: UInt = 212u

public val EM_GETMODIFY: UInt = 184u

public val EM_GETPASSWORDCHAR: UInt = 210u

public val EM_GETRECT: UInt = 178u

public val EM_GETSEL: UInt = 176u

public val EM_GETTHUMB: UInt = 190u

public val EM_GETWORDBREAKPROC: UInt = 209u

public val EM_HIDEBALLOONTIP: UInt = 5380u

public val EM_LIMITTEXT: UInt = 197u

public val EM_LINEFROMCHAR: UInt = 201u

public val EM_LINEINDEX: UInt = 187u

public val EM_LINELENGTH: UInt = 193u

public val EM_LINESCROLL: UInt = 182u

public val EM_NOSETFOCUS: UInt = 5383u

public val EM_POSFROMCHAR: UInt = 214u

public val EM_REPLACESEL: UInt = 194u

public val EM_SCROLL: UInt = 181u

public val EM_SCROLLCARET: UInt = 183u

public val EM_SEARCHWEB: UInt = 5391u

public val EM_SETCARETINDEX: UInt = 5393u

public val EM_SETCUEBANNER: UInt = 5377u

public val EM_SETENDOFLINE: UInt = 5388u

public val EM_SETEXTENDEDSTYLE: UInt = 5386u

public val EM_SETHANDLE: UInt = 188u

public val EM_SETHILITE: UInt = 5381u

public val EM_SETIMESTATUS: UInt = 216u

public val EM_SETLIMITTEXT: UInt = 197u

public val EM_SETMARGINS: UInt = 211u

public val EM_SETMODIFY: UInt = 185u

public val EM_SETPASSWORDCHAR: UInt = 204u

public val EM_SETREADONLY: UInt = 207u

public val EM_SETRECT: UInt = 179u

public val EM_SETRECTNP: UInt = 180u

public val EM_SETSEL: UInt = 177u

public val EM_SETTABSTOPS: UInt = 203u

public val EM_SETWORDBREAKPROC: UInt = 208u

public val EM_SHOWBALLOONTIP: UInt = 5379u

public val EM_TAKEFOCUS: UInt = 5384u

public val EM_UNDO: UInt = 199u

public val EN_FIRST: UInt = 4294965776u

public val EN_LAST: UInt = 4294965756u

public val EN_SEARCHWEB: UInt = 4294965776u

public val EPSHV_DISABLED: EditborderHvscrollstates = 4

public val EPSHV_FOCUSED: EditborderHvscrollstates = 3

public val EPSHV_HOT: EditborderHvscrollstates = 2

public val EPSHV_NORMAL: EditborderHvscrollstates = 1

public val EPSH_DISABLED: EditborderHscrollstates = 4

public val EPSH_FOCUSED: EditborderHscrollstates = 3

public val EPSH_HOT: EditborderHscrollstates = 2

public val EPSH_NORMAL: EditborderHscrollstates = 1

public val EPSN_DISABLED: EditborderNoscrollstates = 4

public val EPSN_FOCUSED: EditborderNoscrollstates = 3

public val EPSN_HOT: EditborderNoscrollstates = 2

public val EPSN_NORMAL: EditborderNoscrollstates = 1

public val EPSV_DISABLED: EditborderVscrollstates = 4

public val EPSV_FOCUSED: EditborderVscrollstates = 3

public val EPSV_HOT: EditborderVscrollstates = 2

public val EPSV_NORMAL: EditborderVscrollstates = 1

public val EP_BACKGROUND: Editparts = 3

public val EP_BACKGROUNDWITHBORDER: Editparts = 5

public val EP_CARET: Editparts = 2

public val EP_EDITBORDER_HSCROLL: Editparts = 7

public val EP_EDITBORDER_HVSCROLL: Editparts = 9

public val EP_EDITBORDER_NOSCROLL: Editparts = 6

public val EP_EDITBORDER_VSCROLL: Editparts = 8

public val EP_EDITTEXT: Editparts = 1

public val EP_PASSWORD: Editparts = 4

public val ESB_DISABLE_BOTH: EnableScrollBarArrows = 3u

public val ESB_DISABLE_DOWN: EnableScrollBarArrows = 2u

public val ESB_DISABLE_LEFT: EnableScrollBarArrows = 1u

public val ESB_DISABLE_LTUP: EnableScrollBarArrows = 1u

public val ESB_DISABLE_RIGHT: EnableScrollBarArrows = 2u

public val ESB_DISABLE_RTDN: EnableScrollBarArrows = 2u

public val ESB_DISABLE_UP: EnableScrollBarArrows = 1u

public val ESB_ENABLE_BOTH: EnableScrollBarArrows = 0u

public val ES_EX_ALLOWEOL_CR: Int = 1

public val ES_EX_ALLOWEOL_LF: Int = 2

public val ES_EX_CONVERT_EOL_ON_PASTE: Int = 4

public val ES_EX_ZOOMABLE: Int = 16

public val ETDT_DISABLE: UInt = 1u

public val ETDT_ENABLE: UInt = 2u

public val ETDT_USEAEROWIZARDTABTEXTURE: UInt = 8u

public val ETDT_USETABTEXTURE: UInt = 4u

public val ETS_ASSIST: Edittextstates = 7

public val ETS_CUEBANNER: Edittextstates = 8

public val ETS_DISABLED: Edittextstates = 4

public val ETS_FOCUSED: Edittextstates = 5

public val ETS_HOT: Edittextstates = 2

public val ETS_NORMAL: Edittextstates = 1

public val ETS_READONLY: Edittextstates = 6

public val ETS_SELECTED: Edittextstates = 3

public val FBS_EMPHASIZED: Bodystates = 2

public val FBS_NORMAL: Bodystates = 1

public val FEEDBACK_GESTURE_PRESSANDTAP: FeedbackType = 11

public val FEEDBACK_MAX: FeedbackType = -1

public val FEEDBACK_PEN_BARRELVISUALIZATION: FeedbackType = 2

public val FEEDBACK_PEN_DOUBLETAP: FeedbackType = 4

public val FEEDBACK_PEN_PRESSANDHOLD: FeedbackType = 5

public val FEEDBACK_PEN_RIGHTTAP: FeedbackType = 6

public val FEEDBACK_PEN_TAP: FeedbackType = 3

public val FEEDBACK_TOUCH_CONTACTVISUALIZATION: FeedbackType = 1

public val FEEDBACK_TOUCH_DOUBLETAP: FeedbackType = 8

public val FEEDBACK_TOUCH_PRESSANDHOLD: FeedbackType = 9

public val FEEDBACK_TOUCH_RIGHTTAP: FeedbackType = 10

public val FEEDBACK_TOUCH_TAP: FeedbackType = 7

public val FILEOPENORD: UInt = 1536u

public val FINDDLGORD: UInt = 1540u

public val FLH_HOVER: Linkheaderstates = 2

public val FLH_NORMAL: Linkheaderstates = 1

public val FLS_DISABLED: Labelstates = 4

public val FLS_EMPHASIZED: Labelstates = 3

public val FLS_NORMAL: Labelstates = 1

public val FLS_SELECTED: Labelstates = 2

public val FLYOUTLINK_HOVER: Linkstates = 2

public val FLYOUTLINK_NORMAL: Linkstates = 1

public val FLYOUT_BODY: Flyoutparts = 2

public val FLYOUT_DIVIDER: Flyoutparts = 5

public val FLYOUT_HEADER: Flyoutparts = 1

public val FLYOUT_LABEL: Flyoutparts = 3

public val FLYOUT_LINK: Flyoutparts = 4

public val FLYOUT_LINKAREA: Flyoutparts = 7

public val FLYOUT_LINKHEADER: Flyoutparts = 8

public val FLYOUT_WINDOW: Flyoutparts = 6

public val FONTDLGORD: UInt = 1542u

public val FORMATDLGORD30: UInt = 1544u

public val FORMATDLGORD31: UInt = 1543u

public val FRB_ACTIVE: Framebottomstates = 1

public val FRB_INACTIVE: Framebottomstates = 2

public val FRL_ACTIVE: Frameleftstates = 1

public val FRL_INACTIVE: Frameleftstates = 2

public val FRR_ACTIVE: Framerightstates = 1

public val FRR_INACTIVE: Framerightstates = 2

public val FSB_ENCARTA_MODE: UInt = 1u

public val FSB_FLAT_MODE: UInt = 2u

public val FSB_REGULAR_MODE: UInt = 0u

public val FS_ACTIVE: Framestates = 1

public val FS_INACTIVE: Framestates = 2

public val FT_HORZGRADIENT: Filltype = 2

public val FT_RADIALGRADIENT: Filltype = 3

public val FT_SOLID: Filltype = 0

public val FT_TILEIMAGE: Filltype = 4

public val FT_VERTGRADIENT: Filltype = 1

public val GBF_COPY: GetThemeBitmapFlags = 2u

public val GBF_DIRECT: GetThemeBitmapFlags = 1u

public val GBF_VALIDBITS: GetThemeBitmapFlags = 3u

public val GBS_DISABLED: Groupboxstates = 2

public val GBS_NORMAL: Groupboxstates = 1

public val GDTR_MAX: UInt = 2u

public val GDTR_MIN: UInt = 1u

public val GDT_ERROR: Int = -1

public val GDT_NONE: NmdatetimechangeFlags = 1u

public val GDT_VALID: NmdatetimechangeFlags = 0u

public val GFST_DPI: Glyphfontsizingtype = 2

public val GFST_NONE: Glyphfontsizingtype = 0

public val GFST_SIZE: Glyphfontsizingtype = 1

public val GLPS_CLOSED: Glyphstates = 1

public val GLPS_OPENED: Glyphstates = 2

public val GMR_DAYSTATE: UInt = 1u

public val GMR_VISIBLE: UInt = 0u

public val GT_FONTGLYPH: Glyphtype = 2

public val GT_IMAGEGLYPH: Glyphtype = 1

public val GT_NONE: Glyphtype = 0

public val HA_CENTER: Halign = 1

public val HA_LEFT: Halign = 0

public val HA_RIGHT: Halign = 2

public val HBG_DETAILS: Headerstylestates = 1

public val HBG_ICON: Headerstylestates = 2

public val HBS_DISABLED: Helpbuttonstates = 4

public val HBS_HOT: Helpbuttonstates = 2

public val HBS_NORMAL: Helpbuttonstates = 1

public val HBS_PUSHED: Helpbuttonstates = 3

public val HDDFS_HOT: Headerdropdownfilterstates = 3

public val HDDFS_NORMAL: Headerdropdownfilterstates = 1

public val HDDFS_SOFTHOT: Headerdropdownfilterstates = 2

public val HDDS_HOT: Headerdropdownstates = 3

public val HDDS_NORMAL: Headerdropdownstates = 1

public val HDDS_SOFTHOT: Headerdropdownstates = 2

public val HDFT_HASNOVALUE: HeaderControlFormatType = 32768u

public val HDFT_ISDATE: HeaderControlFormatType = 2u

public val HDFT_ISNUMBER: HeaderControlFormatType = 1u

public val HDFT_ISSTRING: HeaderControlFormatType = 0u

public val HDF_BITMAP: HeaderControlFormatFlags = 8192

public val HDF_BITMAP_ON_RIGHT: HeaderControlFormatFlags = 4096

public val HDF_CENTER: HeaderControlFormatFlags = 2

public val HDF_CHECKBOX: HeaderControlFormatFlags = 64

public val HDF_CHECKED: HeaderControlFormatFlags = 128

public val HDF_FIXEDWIDTH: HeaderControlFormatFlags = 256

public val HDF_IMAGE: HeaderControlFormatFlags = 2048

public val HDF_JUSTIFYMASK: HeaderControlFormatFlags = 3

public val HDF_LEFT: HeaderControlFormatFlags = 0

public val HDF_OWNERDRAW: HeaderControlFormatFlags = 32768

public val HDF_RIGHT: HeaderControlFormatFlags = 1

public val HDF_RTLREADING: HeaderControlFormatFlags = 4

public val HDF_SORTDOWN: HeaderControlFormatFlags = 512

public val HDF_SORTUP: HeaderControlFormatFlags = 1024

public val HDF_SPLITBUTTON: HeaderControlFormatFlags = 16777216

public val HDF_STRING: HeaderControlFormatFlags = 16384

public val HDIS_FOCUSED: HeaderControlFormatState = 1u

public val HDI_BITMAP: HdiMask = 16u

public val HDI_DI_SETITEM: HdiMask = 64u

public val HDI_FILTER: HdiMask = 256u

public val HDI_FORMAT: HdiMask = 4u

public val HDI_HEIGHT: HdiMask = 1u

public val HDI_IMAGE: HdiMask = 32u

public val HDI_LPARAM: HdiMask = 8u

public val HDI_ORDER: HdiMask = 128u

public val HDI_STATE: HdiMask = 512u

public val HDI_TEXT: HdiMask = 2u

public val HDI_WIDTH: HdiMask = 1u

public val HDM_CLEARFILTER: UInt = 4632u

public val HDM_CREATEDRAGIMAGE: UInt = 4624u

public val HDM_DELETEITEM: UInt = 4610u

public val HDM_EDITFILTER: UInt = 4631u

public val HDM_FIRST: UInt = 4608u

public val HDM_GETBITMAPMARGIN: UInt = 4629u

public val HDM_GETFOCUSEDITEM: UInt = 4635u

public val HDM_GETIMAGELIST: UInt = 4617u

public val HDM_GETITEM: UInt = 4619u

public val HDM_GETITEMA: UInt = 4611u

public val HDM_GETITEMCOUNT: UInt = 4608u

public val HDM_GETITEMDROPDOWNRECT: UInt = 4633u

public val HDM_GETITEMRECT: UInt = 4615u

public val HDM_GETITEMW: UInt = 4619u

public val HDM_GETORDERARRAY: UInt = 4625u

public val HDM_GETOVERFLOWRECT: UInt = 4634u

public val HDM_GETUNICODEFORMAT: UInt = 8198u

public val HDM_HITTEST: UInt = 4614u

public val HDM_INSERTITEM: UInt = 4618u

public val HDM_INSERTITEMA: UInt = 4609u

public val HDM_INSERTITEMW: UInt = 4618u

public val HDM_LAYOUT: UInt = 4613u

public val HDM_ORDERTOINDEX: UInt = 4623u

public val HDM_SETBITMAPMARGIN: UInt = 4628u

public val HDM_SETFILTERCHANGETIMEOUT: UInt = 4630u

public val HDM_SETFOCUSEDITEM: UInt = 4636u

public val HDM_SETHOTDIVIDER: UInt = 4627u

public val HDM_SETIMAGELIST: UInt = 4616u

public val HDM_SETITEM: UInt = 4620u

public val HDM_SETITEMA: UInt = 4612u

public val HDM_SETITEMW: UInt = 4620u

public val HDM_SETORDERARRAY: UInt = 4626u

public val HDM_SETUNICODEFORMAT: UInt = 8197u

public val HDN_BEGINDRAG: UInt = 4294966986u

public val HDN_BEGINFILTEREDIT: UInt = 4294966982u

public val HDN_BEGINTRACK: UInt = 4294966970u

public val HDN_BEGINTRACKA: UInt = 4294966990u

public val HDN_BEGINTRACKW: UInt = 4294966970u

public val HDN_DIVIDERDBLCLICK: UInt = 4294966971u

public val HDN_DIVIDERDBLCLICKA: UInt = 4294966991u

public val HDN_DIVIDERDBLCLICKW: UInt = 4294966971u

public val HDN_DROPDOWN: UInt = 4294966978u

public val HDN_ENDDRAG: UInt = 4294966985u

public val HDN_ENDFILTEREDIT: UInt = 4294966981u

public val HDN_ENDTRACK: UInt = 4294966969u

public val HDN_ENDTRACKA: UInt = 4294966989u

public val HDN_ENDTRACKW: UInt = 4294966969u

public val HDN_FILTERBTNCLICK: UInt = 4294966983u

public val HDN_FILTERCHANGE: UInt = 4294966984u

public val HDN_FIRST: UInt = 4294966996u

public val HDN_GETDISPINFO: UInt = 4294966967u

public val HDN_GETDISPINFOA: UInt = 4294966987u

public val HDN_GETDISPINFOW: UInt = 4294966967u

public val HDN_ITEMCHANGED: UInt = 4294966975u

public val HDN_ITEMCHANGEDA: UInt = 4294966995u

public val HDN_ITEMCHANGEDW: UInt = 4294966975u

public val HDN_ITEMCHANGING: UInt = 4294966976u

public val HDN_ITEMCHANGINGA: UInt = 4294966996u

public val HDN_ITEMCHANGINGW: UInt = 4294966976u

public val HDN_ITEMCLICK: UInt = 4294966974u

public val HDN_ITEMCLICKA: UInt = 4294966994u

public val HDN_ITEMCLICKW: UInt = 4294966974u

public val HDN_ITEMDBLCLICK: UInt = 4294966973u

public val HDN_ITEMDBLCLICKA: UInt = 4294966993u

public val HDN_ITEMDBLCLICKW: UInt = 4294966973u

public val HDN_ITEMKEYDOWN: UInt = 4294966979u

public val HDN_ITEMSTATEICONCLICK: UInt = 4294966980u

public val HDN_LAST: UInt = 4294966897u

public val HDN_OVERFLOWCLICK: UInt = 4294966977u

public val HDN_TRACK: UInt = 4294966968u

public val HDN_TRACKA: UInt = 4294966988u

public val HDN_TRACKW: UInt = 4294966968u

public val HDSIL_NORMAL: UInt = 0u

public val HDSIL_STATE: UInt = 1u

public val HDS_BUTTONS: UInt = 2u

public val HDS_CHECKBOXES: UInt = 1024u

public val HDS_DRAGDROP: UInt = 64u

public val HDS_FILTERBAR: UInt = 256u

public val HDS_FLAT: UInt = 512u

public val HDS_FULLDRAG: UInt = 128u

public val HDS_HIDDEN: UInt = 8u

public val HDS_HORZ: UInt = 0u

public val HDS_HOTTRACK: UInt = 4u

public val HDS_NOSIZING: UInt = 2048u

public val HDS_OVERFLOW: UInt = 4096u

public val HEADER_CONTROL_NOTIFICATION_BUTTON_LEFT: HeaderControlNotificationButton = 0

public val HEADER_CONTROL_NOTIFICATION_BUTTON_MIDDLE: HeaderControlNotificationButton = 2

public val HEADER_CONTROL_NOTIFICATION_BUTTON_RIGHT: HeaderControlNotificationButton = 1

public val HGLPS_CLOSED: Hotglyphstates = 1

public val HGLPS_OPENED: Hotglyphstates = 2

public val HHT_ABOVE: HeaderHittestInfoFlags = 256u

public val HHT_BELOW: HeaderHittestInfoFlags = 512u

public val HHT_NOWHERE: HeaderHittestInfoFlags = 1u

public val HHT_ONDIVIDER: HeaderHittestInfoFlags = 4u

public val HHT_ONDIVOPEN: HeaderHittestInfoFlags = 8u

public val HHT_ONDROPDOWN: HeaderHittestInfoFlags = 8192u

public val HHT_ONFILTER: HeaderHittestInfoFlags = 16u

public val HHT_ONFILTERBUTTON: HeaderHittestInfoFlags = 32u

public val HHT_ONHEADER: HeaderHittestInfoFlags = 2u

public val HHT_ONITEMSTATEICON: HeaderHittestInfoFlags = 4096u

public val HHT_ONOVERFLOW: HeaderHittestInfoFlags = 16384u

public val HHT_TOLEFT: HeaderHittestInfoFlags = 2048u

public val HHT_TORIGHT: HeaderHittestInfoFlags = 1024u

public val HICF_ACCELERATOR: NmtbhotitemFlags = 4u

public val HICF_ARROWKEYS: NmtbhotitemFlags = 2u

public val HICF_DUPACCEL: NmtbhotitemFlags = 8u

public val HICF_ENTERING: NmtbhotitemFlags = 16u

public val HICF_LEAVING: NmtbhotitemFlags = 32u

public val HICF_LMOUSE: NmtbhotitemFlags = 128u

public val HICF_MOUSE: NmtbhotitemFlags = 1u

public val HICF_OTHER: NmtbhotitemFlags = 0u

public val HICF_RESELECT: NmtbhotitemFlags = 64u

public val HICF_TOGGLEDROPDOWN: NmtbhotitemFlags = 256u

public val HILS_HOT: Headeritemleftstates = 2

public val HILS_NORMAL: Headeritemleftstates = 1

public val HILS_PRESSED: Headeritemleftstates = 3

public val HIRS_HOT: Headeritemrightstates = 2

public val HIRS_NORMAL: Headeritemrightstates = 1

public val HIRS_PRESSED: Headeritemrightstates = 3

public val HIST_ADDTOFAVORITES: UInt = 3u

public val HIST_BACK: UInt = 0u

public val HIST_FAVORITES: UInt = 2u

public val HIST_FORWARD: UInt = 1u

public val HIST_VIEWTREE: UInt = 4u

public val HIS_HOT: Headeritemstates = 2

public val HIS_ICONHOT: Headeritemstates = 8

public val HIS_ICONNORMAL: Headeritemstates = 7

public val HIS_ICONPRESSED: Headeritemstates = 9

public val HIS_ICONSORTEDHOT: Headeritemstates = 11

public val HIS_ICONSORTEDNORMAL: Headeritemstates = 10

public val HIS_ICONSORTEDPRESSED: Headeritemstates = 12

public val HIS_NORMAL: Headeritemstates = 1

public val HIS_PRESSED: Headeritemstates = 3

public val HIS_SORTEDHOT: Headeritemstates = 5

public val HIS_SORTEDNORMAL: Headeritemstates = 4

public val HIS_SORTEDPRESSED: Headeritemstates = 6

public val HKCOMB_A: UInt = 8u

public val HKCOMB_C: UInt = 4u

public val HKCOMB_CA: UInt = 64u

public val HKCOMB_NONE: UInt = 1u

public val HKCOMB_S: UInt = 2u

public val HKCOMB_SA: UInt = 32u

public val HKCOMB_SC: UInt = 16u

public val HKCOMB_SCA: UInt = 128u

public val HKM_GETHOTKEY: UInt = 1026u

public val HKM_SETHOTKEY: UInt = 1025u

public val HKM_SETRULES: UInt = 1027u

public val HLS_LINKTEXT: Hyperlinkstates = 2

public val HLS_NORMALTEXT: Hyperlinkstates = 1

public val HOFS_HOT: Headeroverflowstates = 2

public val HOFS_NORMAL: Headeroverflowstates = 1

public val HOTKEYF_ALT: UInt = 4u

public val HOTKEYF_CONTROL: UInt = 2u

public val HOTKEYF_EXT: UInt = 8u

public val HOTKEYF_SHIFT: UInt = 1u

public val HOTKEY_CLASS: Pcwstr = w("msctls_hotkey32")

public val HOTKEY_CLASSA: Pcstr = s("msctls_hotkey32")

public val HOTKEY_CLASSW: Pcwstr = w("msctls_hotkey32")

public val HOVER_DEFAULT: UInt = 4294967295u

public val HP_HEADERDROPDOWN: Headerparts = 5

public val HP_HEADERDROPDOWNFILTER: Headerparts = 6

public val HP_HEADERITEM: Headerparts = 1

public val HP_HEADERITEMLEFT: Headerparts = 2

public val HP_HEADERITEMRIGHT: Headerparts = 3

public val HP_HEADEROVERFLOW: Headerparts = 7

public val HP_HEADERSORTARROW: Headerparts = 4

public val HSAS_SORTEDDOWN: Headersortarrowstates = 2

public val HSAS_SORTEDUP: Headersortarrowstates = 1

public val HSS_DISABLED: Horzscrollstates = 4

public val HSS_HOT: Horzscrollstates = 2

public val HSS_NORMAL: Horzscrollstates = 1

public val HSS_PUSHED: Horzscrollstates = 3

public val HTS_DISABLED: Horzthumbstates = 4

public val HTS_HOT: Horzthumbstates = 2

public val HTS_NORMAL: Horzthumbstates = 1

public val HTS_PUSHED: Horzthumbstates = 3

public val HTTB_BACKGROUNDSEG: HitTestBackgroundOptions = 0u

public val HTTB_CAPTION: HitTestBackgroundOptions = 4u

public val HTTB_FIXEDBORDER: HitTestBackgroundOptions = 2u

public val HTTB_RESIZINGBORDER: HitTestBackgroundOptions = 240u

public val HTTB_RESIZINGBORDER_BOTTOM: HitTestBackgroundOptions = 128u

public val HTTB_RESIZINGBORDER_LEFT: HitTestBackgroundOptions = 16u

public val HTTB_RESIZINGBORDER_RIGHT: HitTestBackgroundOptions = 64u

public val HTTB_RESIZINGBORDER_TOP: HitTestBackgroundOptions = 32u

public val HTTB_SIZINGTEMPLATE: HitTestBackgroundOptions = 256u

public val HTTB_SYSTEMSIZINGMARGINS: HitTestBackgroundOptions = 512u

public val ICC_ANIMATE_CLASS: InitcommoncontrolsexIcc = 128u

public val ICC_BAR_CLASSES: InitcommoncontrolsexIcc = 4u

public val ICC_COOL_CLASSES: InitcommoncontrolsexIcc = 1024u

public val ICC_DATE_CLASSES: InitcommoncontrolsexIcc = 256u

public val ICC_HOTKEY_CLASS: InitcommoncontrolsexIcc = 64u

public val ICC_INTERNET_CLASSES: InitcommoncontrolsexIcc = 2048u

public val ICC_LINK_CLASS: InitcommoncontrolsexIcc = 32768u

public val ICC_LISTVIEW_CLASSES: InitcommoncontrolsexIcc = 1u

public val ICC_NATIVEFNTCTL_CLASS: InitcommoncontrolsexIcc = 8192u

public val ICC_PAGESCROLLER_CLASS: InitcommoncontrolsexIcc = 4096u

public val ICC_PROGRESS_CLASS: InitcommoncontrolsexIcc = 32u

public val ICC_STANDARD_CLASSES: InitcommoncontrolsexIcc = 16384u

public val ICC_TAB_CLASSES: InitcommoncontrolsexIcc = 8u

public val ICC_TREEVIEW_CLASSES: InitcommoncontrolsexIcc = 2u

public val ICC_UPDOWN_CLASS: InitcommoncontrolsexIcc = 16u

public val ICC_USEREX_CLASSES: InitcommoncontrolsexIcc = 512u

public val ICC_WIN95_CLASSES: InitcommoncontrolsexIcc = 255u

public val ICE_ALPHA: Iconeffect = 4

public val ICE_GLOW: Iconeffect = 1

public val ICE_NONE: Iconeffect = 0

public val ICE_PULSE: Iconeffect = 3

public val ICE_SHADOW: Iconeffect = 2

public val IDB_HIST_DISABLED: UInt = 14u

public val IDB_HIST_HOT: UInt = 13u

public val IDB_HIST_LARGE_COLOR: UInt = 9u

public val IDB_HIST_NORMAL: UInt = 12u

public val IDB_HIST_PRESSED: UInt = 15u

public val IDB_HIST_SMALL_COLOR: UInt = 8u

public val IDB_STD_LARGE_COLOR: UInt = 1u

public val IDB_STD_SMALL_COLOR: UInt = 0u

public val IDB_VIEW_LARGE_COLOR: UInt = 5u

public val IDB_VIEW_SMALL_COLOR: UInt = 4u

public val IDC_MANAGE_LINK: UInt = 1592u

public val ID_PSRESTARTWINDOWS: UInt = 2u

public val ILCF_MOVE: ImageListCopyFlags = 0u

public val ILCF_SWAP: ImageListCopyFlags = 1u

public val ILC_COLOR: ImagelistCreationFlags = 0u

public val ILC_COLOR16: ImagelistCreationFlags = 16u

public val ILC_COLOR24: ImagelistCreationFlags = 24u

public val ILC_COLOR32: ImagelistCreationFlags = 32u

public val ILC_COLOR4: ImagelistCreationFlags = 4u

public val ILC_COLOR8: ImagelistCreationFlags = 8u

public val ILC_COLORDDB: ImagelistCreationFlags = 254u

public val ILC_HIGHQUALITYSCALE: ImagelistCreationFlags = 131072u

public val ILC_MASK: ImagelistCreationFlags = 1u

public val ILC_MIRROR: ImagelistCreationFlags = 8192u

public val ILC_ORIGINALSIZE: ImagelistCreationFlags = 65536u

public val ILC_PALETTE: ImagelistCreationFlags = 2048u

public val ILC_PERITEMMIRROR: ImagelistCreationFlags = 32768u

public val ILDI_PURGE: UInt = 1u

public val ILDI_QUERYACCESS: UInt = 8u

public val ILDI_RESETACCESS: UInt = 4u

public val ILDI_STANDBY: UInt = 2u

public val ILDRF_IMAGELOWQUALITY: UInt = 1u

public val ILDRF_OVERLAYLOWQUALITY: UInt = 16u

public val ILD_ASYNC: ImageListDrawStyle = 32768u

public val ILD_BLEND: ImageListDrawStyle = 4u

public val ILD_BLEND25: ImageListDrawStyle = 2u

public val ILD_BLEND50: ImageListDrawStyle = 4u

public val ILD_DPISCALE: ImageListDrawStyle = 16384u

public val ILD_FOCUS: ImageListDrawStyle = 2u

public val ILD_IMAGE: ImageListDrawStyle = 32u

public val ILD_MASK: ImageListDrawStyle = 16u

public val ILD_NORMAL: ImageListDrawStyle = 0u

public val ILD_OVERLAYMASK: ImageListDrawStyle = 3840u

public val ILD_PRESERVEALPHA: ImageListDrawStyle = 4096u

public val ILD_ROP: ImageListDrawStyle = 64u

public val ILD_SCALE: ImageListDrawStyle = 8192u

public val ILD_SELECTED: ImageListDrawStyle = 4u

public val ILD_TRANSPARENT: ImageListDrawStyle = 1u

public val ILFIP_ALWAYS: UInt = 0u

public val ILFIP_FROMSTANDBY: UInt = 1u

public val ILGOS_ALWAYS: UInt = 0u

public val ILGOS_FROMSTANDBY: UInt = 1u

public val ILGT_ASYNC: UInt = 1u

public val ILGT_NORMAL: UInt = 0u

public val ILIF_ALPHA: ImageListItemFlags = 1u

public val ILIF_LOWQUALITY: ImageListItemFlags = 2u

public val ILP_DOWNLEVEL: ImageListWriteStreamFlags = 1u

public val ILP_NORMAL: ImageListWriteStreamFlags = 0u

public val ILR_DEFAULT: UInt = 0u

public val ILR_HORIZONTAL_CENTER: UInt = 1u

public val ILR_HORIZONTAL_LEFT: UInt = 0u

public val ILR_HORIZONTAL_RIGHT: UInt = 2u

public val ILR_SCALE_ASPECTRATIO: UInt = 256u

public val ILR_SCALE_CLIP: UInt = 0u

public val ILR_VERTICAL_BOTTOM: UInt = 32u

public val ILR_VERTICAL_CENTER: UInt = 16u

public val ILR_VERTICAL_TOP: UInt = 0u

public val ILS_ALPHA: UInt = 8u

public val ILS_GLOW: UInt = 1u

public val ILS_NORMAL: UInt = 0u

public val ILS_SATURATE: UInt = 4u

public val ILS_SHADOW: UInt = 2u

public val IL_HORIZONTAL: Imagelayout = 1

public val IL_VERTICAL: Imagelayout = 0

public val INFOTIPSIZE: UInt = 1024u

public val INVALID_LINK_INDEX: Int = -1

public val IPM_CLEARADDRESS: UInt = 1124u

public val IPM_GETADDRESS: UInt = 1126u

public val IPM_ISBLANK: UInt = 1129u

public val IPM_SETADDRESS: UInt = 1125u

public val IPM_SETFOCUS: UInt = 1128u

public val IPM_SETRANGE: UInt = 1127u

public val IPN_FIELDCHANGED: UInt = 4294966436u

public val IPN_FIRST: UInt = 4294966436u

public val IPN_LAST: UInt = 4294966417u

public val IST_DPI: Imageselecttype = 2

public val IST_NONE: Imageselecttype = 0

public val IST_SIZE: Imageselecttype = 1

public val I_CHILDRENAUTO: TvitemexwChildren = -2

public val I_CHILDRENCALLBACK: TvitemexwChildren = -1

public val I_GROUPIDCALLBACK: LvitemaGroupId = -1

public val I_GROUPIDNONE: LvitemaGroupId = -2

public val I_IMAGECALLBACK: Int = -1

public val I_IMAGENONE: Int = -2

public val I_INDENTCALLBACK: Int = -1

public val I_ONE_OR_MORE: TvitemexwChildren = 1

public val I_ZERO: TvitemexwChildren = 0

public val LBCP_BORDER_HSCROLL: Listboxparts = 1

public val LBCP_BORDER_HVSCROLL: Listboxparts = 2

public val LBCP_BORDER_NOSCROLL: Listboxparts = 3

public val LBCP_BORDER_VSCROLL: Listboxparts = 4

public val LBCP_ITEM: Listboxparts = 5

public val LBPSHV_DISABLED: BorderHvscrollstates = 4

public val LBPSHV_FOCUSED: BorderHvscrollstates = 2

public val LBPSHV_HOT: BorderHvscrollstates = 3

public val LBPSHV_NORMAL: BorderHvscrollstates = 1

public val LBPSH_DISABLED: BorderHscrollstates = 4

public val LBPSH_FOCUSED: BorderHscrollstates = 2

public val LBPSH_HOT: BorderHscrollstates = 3

public val LBPSH_NORMAL: BorderHscrollstates = 1

public val LBPSI_HOT: Itemstates = 1

public val LBPSI_HOTSELECTED: Itemstates = 2

public val LBPSI_SELECTED: Itemstates = 3

public val LBPSI_SELECTEDNOTFOCUS: Itemstates = 4

public val LBPSN_DISABLED: BorderNoscrollstates = 4

public val LBPSN_FOCUSED: BorderNoscrollstates = 2

public val LBPSN_HOT: BorderNoscrollstates = 3

public val LBPSN_NORMAL: BorderNoscrollstates = 1

public val LBPSV_DISABLED: BorderVscrollstates = 4

public val LBPSV_FOCUSED: BorderVscrollstates = 2

public val LBPSV_HOT: BorderVscrollstates = 3

public val LBPSV_NORMAL: BorderVscrollstates = 1

public val LIF_ITEMID: ListItemFlags = 4u

public val LIF_ITEMINDEX: ListItemFlags = 1u

public val LIF_STATE: ListItemFlags = 2u

public val LIF_URL: ListItemFlags = 8u

public val LIM_LARGE: LiMetric = 1

public val LIM_SMALL: LiMetric = 0

public val LISS_DISABLED: Listitemstates = 4

public val LISS_HOT: Listitemstates = 2

public val LISS_HOTSELECTED: Listitemstates = 6

public val LISS_NORMAL: Listitemstates = 1

public val LISS_SELECTED: Listitemstates = 3

public val LISS_SELECTEDNOTFOCUS: Listitemstates = 5

public val LIS_DEFAULTCOLORS: ListItemStateFlags = 16u

public val LIS_ENABLED: ListItemStateFlags = 2u

public val LIS_FOCUSED: ListItemStateFlags = 1u

public val LIS_HOTTRACK: ListItemStateFlags = 8u

public val LIS_VISITED: ListItemStateFlags = 4u

public val LM_GETIDEALHEIGHT: UInt = 1793u

public val LM_GETIDEALSIZE: UInt = 1793u

public val LM_GETITEM: UInt = 1795u

public val LM_HITTEST: UInt = 1792u

public val LM_SETITEM: UInt = 1794u

public val LP_HYPERLINK: Linkparts = 1

public val LVA_ALIGNLEFT: UInt = 1u

public val LVA_ALIGNTOP: UInt = 2u

public val LVA_DEFAULT: UInt = 0u

public val LVA_SNAPTOGRID: UInt = 5u

public val LVBKIF_FLAG_ALPHABLEND: ListViewBackgroundImageFlags = 536870912u

public val LVBKIF_FLAG_TILEOFFSET: ListViewBackgroundImageFlags = 256u

public val LVBKIF_SOURCE_HBITMAP: ListViewBackgroundImageFlags = 1u

public val LVBKIF_SOURCE_MASK: ListViewBackgroundImageFlags = 3u

public val LVBKIF_SOURCE_NONE: ListViewBackgroundImageFlags = 0u

public val LVBKIF_SOURCE_URL: ListViewBackgroundImageFlags = 2u

public val LVBKIF_STYLE_MASK: ListViewBackgroundImageFlags = 16u

public val LVBKIF_STYLE_NORMAL: ListViewBackgroundImageFlags = 0u

public val LVBKIF_STYLE_TILE: ListViewBackgroundImageFlags = 16u

public val LVBKIF_TYPE_WATERMARK: ListViewBackgroundImageFlags = 268435456u

public val LVCB_HOVER: Collapsebuttonstates = 2

public val LVCB_NORMAL: Collapsebuttonstates = 1

public val LVCB_PUSHED: Collapsebuttonstates = 3

public val LVCDI_GROUP: NmlvcustomdrawItemType = 1u

public val LVCDI_ITEM: NmlvcustomdrawItemType = 0u

public val LVCDI_ITEMSLIST: NmlvcustomdrawItemType = 2u

public val LVCDRF_NOGROUPFRAME: UInt = 131072u

public val LVCDRF_NOSELECT: UInt = 65536u

public val LVCFMT_BITMAP_ON_RIGHT: LvcolumnwFormat = 4096

public val LVCFMT_CENTER: LvcolumnwFormat = 2

public val LVCFMT_COL_HAS_IMAGES: LvcolumnwFormat = 32768

public val LVCFMT_FILL: ListViewItemColumnFormatFlags = 2097152

public val LVCFMT_FIXED_RATIO: LvcolumnwFormat = 524288

public val LVCFMT_FIXED_WIDTH: LvcolumnwFormat = 256

public val LVCFMT_IMAGE: LvcolumnwFormat = 2048

public val LVCFMT_JUSTIFYMASK: LvcolumnwFormat = 3

public val LVCFMT_LEFT: LvcolumnwFormat = 0

public val LVCFMT_LINE_BREAK: ListViewItemColumnFormatFlags = 1048576

public val LVCFMT_NO_DPI_SCALE: LvcolumnwFormat = 262144

public val LVCFMT_NO_TITLE: ListViewItemColumnFormatFlags = 8388608

public val LVCFMT_RIGHT: LvcolumnwFormat = 1

public val LVCFMT_SPLITBUTTON: LvcolumnwFormat = 16777216

public val LVCFMT_TILE_PLACEMENTMASK: ListViewItemColumnFormatFlags = 3145728

public val LVCFMT_WRAP: ListViewItemColumnFormatFlags = 4194304

public val LVCF_DEFAULTWIDTH: LvcolumnwMask = 128u

public val LVCF_FMT: LvcolumnwMask = 1u

public val LVCF_IDEALWIDTH: LvcolumnwMask = 256u

public val LVCF_IMAGE: LvcolumnwMask = 16u

public val LVCF_MINWIDTH: LvcolumnwMask = 64u

public val LVCF_ORDER: LvcolumnwMask = 32u

public val LVCF_SUBITEM: LvcolumnwMask = 8u

public val LVCF_TEXT: LvcolumnwMask = 4u

public val LVCF_WIDTH: LvcolumnwMask = 2u

public val LVEB_HOVER: Expandbuttonstates = 2

public val LVEB_NORMAL: Expandbuttonstates = 1

public val LVEB_PUSHED: Expandbuttonstates = 3

public val LVFF_ITEMCOUNT: UInt = 1u

public val LVFIF_STATE: LvfooteritemMask = 2u

public val LVFIF_TEXT: LvfooteritemMask = 1u

public val LVFIS_FOCUSED: UInt = 1u

public val LVFI_NEARESTXY: LvfindinfowFlags = 64u

public val LVFI_PARAM: LvfindinfowFlags = 1u

public val LVFI_PARTIAL: LvfindinfowFlags = 8u

public val LVFI_STRING: LvfindinfowFlags = 2u

public val LVFI_SUBSTRING: LvfindinfowFlags = 4u

public val LVFI_WRAP: LvfindinfowFlags = 32u

public val LVGA_FOOTER_CENTER: ListViewGroupAlignFlags = 16u

public val LVGA_FOOTER_LEFT: ListViewGroupAlignFlags = 8u

public val LVGA_FOOTER_RIGHT: ListViewGroupAlignFlags = 32u

public val LVGA_HEADER_CENTER: ListViewGroupAlignFlags = 2u

public val LVGA_HEADER_LEFT: ListViewGroupAlignFlags = 1u

public val LVGA_HEADER_RIGHT: ListViewGroupAlignFlags = 4u

public val LVGF_ALIGN: LvgroupMask = 8u

public val LVGF_DESCRIPTIONBOTTOM: LvgroupMask = 2048u

public val LVGF_DESCRIPTIONTOP: LvgroupMask = 1024u

public val LVGF_EXTENDEDIMAGE: LvgroupMask = 8192u

public val LVGF_FOOTER: LvgroupMask = 2u

public val LVGF_GROUPID: LvgroupMask = 16u

public val LVGF_HEADER: LvgroupMask = 1u

public val LVGF_ITEMS: LvgroupMask = 16384u

public val LVGF_NONE: LvgroupMask = 0u

public val LVGF_STATE: LvgroupMask = 4u

public val LVGF_SUBSET: LvgroupMask = 32768u

public val LVGF_SUBSETITEMS: LvgroupMask = 65536u

public val LVGF_SUBTITLE: LvgroupMask = 256u

public val LVGF_TASK: LvgroupMask = 512u

public val LVGF_TITLEIMAGE: LvgroupMask = 4096u

public val LVGGR_GROUP: UInt = 0u

public val LVGGR_HEADER: UInt = 1u

public val LVGGR_LABEL: UInt = 2u

public val LVGGR_SUBSETLINK: UInt = 3u

public val LVGHL_CLOSE: Groupheaderlinestates = 9

public val LVGHL_CLOSEHOT: Groupheaderlinestates = 10

public val LVGHL_CLOSEMIXEDSELECTION: Groupheaderlinestates = 15

public val LVGHL_CLOSEMIXEDSELECTIONHOT: Groupheaderlinestates = 16

public val LVGHL_CLOSESELECTED: Groupheaderlinestates = 11

public val LVGHL_CLOSESELECTEDHOT: Groupheaderlinestates = 12

public val LVGHL_CLOSESELECTEDNOTFOCUSED: Groupheaderlinestates = 13

public val LVGHL_CLOSESELECTEDNOTFOCUSEDHOT: Groupheaderlinestates = 14

public val LVGHL_OPEN: Groupheaderlinestates = 1

public val LVGHL_OPENHOT: Groupheaderlinestates = 2

public val LVGHL_OPENMIXEDSELECTION: Groupheaderlinestates = 7

public val LVGHL_OPENMIXEDSELECTIONHOT: Groupheaderlinestates = 8

public val LVGHL_OPENSELECTED: Groupheaderlinestates = 3

public val LVGHL_OPENSELECTEDHOT: Groupheaderlinestates = 4

public val LVGHL_OPENSELECTEDNOTFOCUSED: Groupheaderlinestates = 5

public val LVGHL_OPENSELECTEDNOTFOCUSEDHOT: Groupheaderlinestates = 6

public val LVGH_CLOSE: Groupheaderstates = 9

public val LVGH_CLOSEHOT: Groupheaderstates = 10

public val LVGH_CLOSEMIXEDSELECTION: Groupheaderstates = 15

public val LVGH_CLOSEMIXEDSELECTIONHOT: Groupheaderstates = 16

public val LVGH_CLOSESELECTED: Groupheaderstates = 11

public val LVGH_CLOSESELECTEDHOT: Groupheaderstates = 12

public val LVGH_CLOSESELECTEDNOTFOCUSED: Groupheaderstates = 13

public val LVGH_CLOSESELECTEDNOTFOCUSEDHOT: Groupheaderstates = 14

public val LVGH_OPEN: Groupheaderstates = 1

public val LVGH_OPENHOT: Groupheaderstates = 2

public val LVGH_OPENMIXEDSELECTION: Groupheaderstates = 7

public val LVGH_OPENMIXEDSELECTIONHOT: Groupheaderstates = 8

public val LVGH_OPENSELECTED: Groupheaderstates = 3

public val LVGH_OPENSELECTEDHOT: Groupheaderstates = 4

public val LVGH_OPENSELECTEDNOTFOCUSED: Groupheaderstates = 5

public val LVGH_OPENSELECTEDNOTFOCUSEDHOT: Groupheaderstates = 6

public val LVGIT_UNFOLDED: NmlvgetinfotipFlags = 1u

public val LVGIT_ZERO: NmlvgetinfotipFlags = 0u

public val LVGMF_BORDERCOLOR: UInt = 2u

public val LVGMF_BORDERSIZE: UInt = 1u

public val LVGMF_NONE: UInt = 0u

public val LVGMF_TEXTCOLOR: UInt = 4u

public val LVGS_COLLAPSED: ListViewGroupStateFlags = 1u

public val LVGS_COLLAPSIBLE: ListViewGroupStateFlags = 8u

public val LVGS_FOCUSED: ListViewGroupStateFlags = 16u

public val LVGS_HIDDEN: ListViewGroupStateFlags = 2u

public val LVGS_NOHEADER: ListViewGroupStateFlags = 4u

public val LVGS_NORMAL: ListViewGroupStateFlags = 0u

public val LVGS_SELECTED: ListViewGroupStateFlags = 32u

public val LVGS_SUBSETED: ListViewGroupStateFlags = 64u

public val LVGS_SUBSETLINKFOCUSED: ListViewGroupStateFlags = 128u

public val LVHT_ABOVE: LvhittestinfoFlags = 8u

public val LVHT_BELOW: LvhittestinfoFlags = 16u

public val LVHT_EX_FOOTER: LvhittestinfoFlags = 134217728u

public val LVHT_EX_GROUP: LvhittestinfoFlags = 4076863488u

public val LVHT_EX_GROUP_BACKGROUND: LvhittestinfoFlags = 2147483648u

public val LVHT_EX_GROUP_COLLAPSE: LvhittestinfoFlags = 1073741824u

public val LVHT_EX_GROUP_FOOTER: LvhittestinfoFlags = 536870912u

public val LVHT_EX_GROUP_HEADER: LvhittestinfoFlags = 268435456u

public val LVHT_EX_GROUP_STATEICON: LvhittestinfoFlags = 16777216u

public val LVHT_EX_GROUP_SUBSETLINK: LvhittestinfoFlags = 33554432u

public val LVHT_EX_ONCONTENTS: LvhittestinfoFlags = 67108864u

public val LVHT_NOWHERE: LvhittestinfoFlags = 1u

public val LVHT_ONITEMICON: LvhittestinfoFlags = 2u

public val LVHT_ONITEMLABEL: LvhittestinfoFlags = 4u

public val LVHT_ONITEMSTATEICON: LvhittestinfoFlags = 8u

public val LVHT_TOLEFT: LvhittestinfoFlags = 64u

public val LVHT_TORIGHT: LvhittestinfoFlags = 32u

public val LVIF_COLFMT: ListViewItemFlags = 65536u

public val LVIF_COLUMNS: ListViewItemFlags = 512u

public val LVIF_DI_SETITEM: ListViewItemFlags = 4096u

public val LVIF_GROUPID: ListViewItemFlags = 256u

public val LVIF_IMAGE: ListViewItemFlags = 2u

public val LVIF_INDENT: ListViewItemFlags = 16u

public val LVIF_NORECOMPUTE: ListViewItemFlags = 2048u

public val LVIF_PARAM: ListViewItemFlags = 4u

public val LVIF_STATE: ListViewItemFlags = 8u

public val LVIF_TEXT: ListViewItemFlags = 1u

public val LVIM_AFTER: UInt = 1u

public val LVIR_BOUNDS: UInt = 0u

public val LVIR_ICON: UInt = 1u

public val LVIR_LABEL: UInt = 2u

public val LVIR_SELECTBOUNDS: UInt = 3u

public val LVIS_ACTIVATING: ListViewItemStateFlags = 32u

public val LVIS_CUT: ListViewItemStateFlags = 4u

public val LVIS_DROPHILITED: ListViewItemStateFlags = 8u

public val LVIS_FOCUSED: ListViewItemStateFlags = 1u

public val LVIS_GLOW: ListViewItemStateFlags = 16u

public val LVIS_OVERLAYMASK: ListViewItemStateFlags = 3840u

public val LVIS_SELECTED: ListViewItemStateFlags = 2u

public val LVIS_STATEIMAGEMASK: ListViewItemStateFlags = 61440u

public val LVKF_ALT: UInt = 1u

public val LVKF_CONTROL: UInt = 2u

public val LVKF_SHIFT: UInt = 4u

public val LVM_APPROXIMATEVIEWRECT: UInt = 4160u

public val LVM_ARRANGE: UInt = 4118u

public val LVM_CANCELEDITLABEL: UInt = 4275u

public val LVM_CREATEDRAGIMAGE: UInt = 4129u

public val LVM_DELETEALLITEMS: UInt = 4105u

public val LVM_DELETECOLUMN: UInt = 4124u

public val LVM_DELETEITEM: UInt = 4104u

public val LVM_EDITLABEL: UInt = 4214u

public val LVM_EDITLABELA: UInt = 4119u

public val LVM_EDITLABELW: UInt = 4214u

public val LVM_ENABLEGROUPVIEW: UInt = 4253u

public val LVM_ENSUREVISIBLE: UInt = 4115u

public val LVM_FINDITEM: UInt = 4179u

public val LVM_FINDITEMA: UInt = 4109u

public val LVM_FINDITEMW: UInt = 4179u

public val LVM_FIRST: UInt = 4096u

public val LVM_GETBKCOLOR: UInt = 4096u

public val LVM_GETBKIMAGE: UInt = 4235u

public val LVM_GETBKIMAGEA: UInt = 4165u

public val LVM_GETBKIMAGEW: UInt = 4235u

public val LVM_GETCALLBACKMASK: UInt = 4106u

public val LVM_GETCOLUMN: UInt = 4191u

public val LVM_GETCOLUMNA: UInt = 4121u

public val LVM_GETCOLUMNORDERARRAY: UInt = 4155u

public val LVM_GETCOLUMNW: UInt = 4191u

public val LVM_GETCOLUMNWIDTH: UInt = 4125u

public val LVM_GETCOUNTPERPAGE: UInt = 4136u

public val LVM_GETEDITCONTROL: UInt = 4120u

public val LVM_GETEMPTYTEXT: UInt = 4300u

public val LVM_GETEXTENDEDLISTVIEWSTYLE: UInt = 4151u

public val LVM_GETFOCUSEDGROUP: UInt = 4189u

public val LVM_GETFOOTERINFO: UInt = 4302u

public val LVM_GETFOOTERITEM: UInt = 4304u

public val LVM_GETFOOTERITEMRECT: UInt = 4303u

public val LVM_GETFOOTERRECT: UInt = 4301u

public val LVM_GETGROUPCOUNT: UInt = 4248u

public val LVM_GETGROUPINFO: UInt = 4245u

public val LVM_GETGROUPINFOBYINDEX: UInt = 4249u

public val LVM_GETGROUPMETRICS: UInt = 4252u

public val LVM_GETGROUPRECT: UInt = 4194u

public val LVM_GETGROUPSTATE: UInt = 4188u

public val LVM_GETHEADER: UInt = 4127u

public val LVM_GETHOTCURSOR: UInt = 4159u

public val LVM_GETHOTITEM: UInt = 4157u

public val LVM_GETHOVERTIME: UInt = 4168u

public val LVM_GETIMAGELIST: UInt = 4098u

public val LVM_GETINSERTMARK: UInt = 4263u

public val LVM_GETINSERTMARKCOLOR: UInt = 4267u

public val LVM_GETINSERTMARKRECT: UInt = 4265u

public val LVM_GETISEARCHSTRING: UInt = 4213u

public val LVM_GETISEARCHSTRINGA: UInt = 4148u

public val LVM_GETISEARCHSTRINGW: UInt = 4213u

public val LVM_GETITEM: UInt = 4171u

public val LVM_GETITEMA: UInt = 4101u

public val LVM_GETITEMCOUNT: UInt = 4100u

public val LVM_GETITEMINDEXRECT: UInt = 4305u

public val LVM_GETITEMPOSITION: UInt = 4112u

public val LVM_GETITEMRECT: UInt = 4110u

public val LVM_GETITEMSPACING: UInt = 4147u

public val LVM_GETITEMSTATE: UInt = 4140u

public val LVM_GETITEMTEXT: UInt = 4211u

public val LVM_GETITEMTEXTA: UInt = 4141u

public val LVM_GETITEMTEXTW: UInt = 4211u

public val LVM_GETITEMW: UInt = 4171u

public val LVM_GETNEXTITEM: UInt = 4108u

public val LVM_GETNEXTITEMINDEX: UInt = 4307u

public val LVM_GETNUMBEROFWORKAREAS: UInt = 4169u

public val LVM_GETORIGIN: UInt = 4137u

public val LVM_GETOUTLINECOLOR: UInt = 4272u

public val LVM_GETSELECTEDCOLUMN: UInt = 4270u

public val LVM_GETSELECTEDCOUNT: UInt = 4146u

public val LVM_GETSELECTIONMARK: UInt = 4162u

public val LVM_GETSTRINGWIDTH: UInt = 4183u

public val LVM_GETSTRINGWIDTHA: UInt = 4113u

public val LVM_GETSTRINGWIDTHW: UInt = 4183u

public val LVM_GETSUBITEMRECT: UInt = 4152u

public val LVM_GETTEXTBKCOLOR: UInt = 4133u

public val LVM_GETTEXTCOLOR: UInt = 4131u

public val LVM_GETTILEINFO: UInt = 4261u

public val LVM_GETTILEVIEWINFO: UInt = 4259u

public val LVM_GETTOOLTIPS: UInt = 4174u

public val LVM_GETTOPINDEX: UInt = 4135u

public val LVM_GETUNICODEFORMAT: UInt = 8198u

public val LVM_GETVIEW: UInt = 4239u

public val LVM_GETVIEWRECT: UInt = 4130u

public val LVM_GETWORKAREAS: UInt = 4166u

public val LVM_HASGROUP: UInt = 4257u

public val LVM_HITTEST: UInt = 4114u

public val LVM_INSERTCOLUMN: UInt = 4193u

public val LVM_INSERTCOLUMNA: UInt = 4123u

public val LVM_INSERTCOLUMNW: UInt = 4193u

public val LVM_INSERTGROUP: UInt = 4241u

public val LVM_INSERTGROUPSORTED: UInt = 4255u

public val LVM_INSERTITEM: UInt = 4173u

public val LVM_INSERTITEMA: UInt = 4103u

public val LVM_INSERTITEMW: UInt = 4173u

public val LVM_INSERTMARKHITTEST: UInt = 4264u

public val LVM_ISGROUPVIEWENABLED: UInt = 4271u

public val LVM_ISITEMVISIBLE: UInt = 4278u

public val LVM_MAPIDTOINDEX: UInt = 4277u

public val LVM_MAPINDEXTOID: UInt = 4276u

public val LVM_MOVEGROUP: UInt = 4247u

public val LVM_MOVEITEMTOGROUP: UInt = 4250u

public val LVM_REDRAWITEMS: UInt = 4117u

public val LVM_REMOVEALLGROUPS: UInt = 4256u

public val LVM_REMOVEGROUP: UInt = 4246u

public val LVM_SCROLL: UInt = 4116u

public val LVM_SETBKCOLOR: UInt = 4097u

public val LVM_SETBKIMAGE: UInt = 4234u

public val LVM_SETBKIMAGEA: UInt = 4164u

public val LVM_SETBKIMAGEW: UInt = 4234u

public val LVM_SETCALLBACKMASK: UInt = 4107u

public val LVM_SETCOLUMN: UInt = 4192u

public val LVM_SETCOLUMNA: UInt = 4122u

public val LVM_SETCOLUMNORDERARRAY: UInt = 4154u

public val LVM_SETCOLUMNW: UInt = 4192u

public val LVM_SETCOLUMNWIDTH: UInt = 4126u

public val LVM_SETEXTENDEDLISTVIEWSTYLE: UInt = 4150u

public val LVM_SETGROUPINFO: UInt = 4243u

public val LVM_SETGROUPMETRICS: UInt = 4251u

public val LVM_SETHOTCURSOR: UInt = 4158u

public val LVM_SETHOTITEM: UInt = 4156u

public val LVM_SETHOVERTIME: UInt = 4167u

public val LVM_SETICONSPACING: UInt = 4149u

public val LVM_SETIMAGELIST: UInt = 4099u

public val LVM_SETINFOTIP: UInt = 4269u

public val LVM_SETINSERTMARK: UInt = 4262u

public val LVM_SETINSERTMARKCOLOR: UInt = 4266u

public val LVM_SETITEM: UInt = 4172u

public val LVM_SETITEMA: UInt = 4102u

public val LVM_SETITEMCOUNT: UInt = 4143u

public val LVM_SETITEMINDEXSTATE: UInt = 4306u

public val LVM_SETITEMPOSITION: UInt = 4111u

public val LVM_SETITEMPOSITION32: UInt = 4145u

public val LVM_SETITEMSTATE: UInt = 4139u

public val LVM_SETITEMTEXT: UInt = 4212u

public val LVM_SETITEMTEXTA: UInt = 4142u

public val LVM_SETITEMTEXTW: UInt = 4212u

public val LVM_SETITEMW: UInt = 4172u

public val LVM_SETOUTLINECOLOR: UInt = 4273u

public val LVM_SETSELECTEDCOLUMN: UInt = 4236u

public val LVM_SETSELECTIONMARK: UInt = 4163u

public val LVM_SETTEXTBKCOLOR: UInt = 4134u

public val LVM_SETTEXTCOLOR: UInt = 4132u

public val LVM_SETTILEINFO: UInt = 4260u

public val LVM_SETTILEVIEWINFO: UInt = 4258u

public val LVM_SETTOOLTIPS: UInt = 4170u

public val LVM_SETUNICODEFORMAT: UInt = 8197u

public val LVM_SETVIEW: UInt = 4238u

public val LVM_SETWORKAREAS: UInt = 4161u

public val LVM_SORTGROUPS: UInt = 4254u

public val LVM_SORTITEMS: UInt = 4144u

public val LVM_SORTITEMSEX: UInt = 4177u

public val LVM_SUBITEMHITTEST: UInt = 4153u

public val LVM_UPDATE: UInt = 4138u

public val LVNI_ABOVE: UInt = 256u

public val LVNI_ALL: UInt = 0u

public val LVNI_BELOW: UInt = 512u

public val LVNI_CUT: UInt = 4u

public val LVNI_DROPHILITED: UInt = 8u
