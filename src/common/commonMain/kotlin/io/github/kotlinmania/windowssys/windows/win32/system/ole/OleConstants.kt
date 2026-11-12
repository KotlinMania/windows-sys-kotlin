package io.github.kotlinmania.windowssys.windows.win32.system.ole

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w

public val ACTIVATE_WINDOWLESS: Activateflags = 1

public val ACTIVEOBJECT_STRONG: ActiveobjectFlags = 0u

public val ACTIVEOBJECT_WEAK: ActiveobjectFlags = 1u

public val BINDSPEED_IMMEDIATE: Bindspeed = 3

public val BINDSPEED_INDEFINITE: Bindspeed = 1

public val BINDSPEED_MODERATE: Bindspeed = 2

public val BZ_DISABLECANCELBUTTON: BusyDialogFlags = 1u

public val BZ_DISABLERETRYBUTTON: BusyDialogFlags = 4u

public val BZ_DISABLESWITCHTOBUTTON: BusyDialogFlags = 2u

public val BZ_NOTRESPONDINGDIALOG: BusyDialogFlags = 8u

public val CF_BITMAP: ClipboardFormat = 2u.toUShort()

public val CF_CONVERTONLY: UiConvertFlags = 256u

public val CF_DIB: ClipboardFormat = 8u.toUShort()

public val CF_DIBV5: ClipboardFormat = 17u.toUShort()

public val CF_DIF: ClipboardFormat = 5u.toUShort()

public val CF_DISABLEACTIVATEAS: UiConvertFlags = 64u

public val CF_DISABLEDISPLAYASICON: UiConvertFlags = 32u

public val CF_DSPBITMAP: ClipboardFormat = 130u.toUShort()

public val CF_DSPENHMETAFILE: ClipboardFormat = 142u.toUShort()

public val CF_DSPMETAFILEPICT: ClipboardFormat = 131u.toUShort()

public val CF_DSPTEXT: ClipboardFormat = 129u.toUShort()

public val CF_ENHMETAFILE: ClipboardFormat = 14u.toUShort()

public val CF_GDIOBJFIRST: ClipboardFormat = 768u.toUShort()

public val CF_GDIOBJLAST: ClipboardFormat = 1023u.toUShort()

public val CF_HDROP: ClipboardFormat = 15u.toUShort()

public val CF_HIDECHANGEICON: UiConvertFlags = 128u

public val CF_LOCALE: ClipboardFormat = 16u.toUShort()

public val CF_MAX: ClipboardFormat = 18u.toUShort()

public val CF_METAFILEPICT: ClipboardFormat = 3u.toUShort()

public val CF_OEMTEXT: ClipboardFormat = 7u.toUShort()

public val CF_OWNERDISPLAY: ClipboardFormat = 128u.toUShort()

public val CF_PALETTE: ClipboardFormat = 9u.toUShort()

public val CF_PENDATA: ClipboardFormat = 10u.toUShort()

public val CF_PRIVATEFIRST: ClipboardFormat = 512u.toUShort()

public val CF_PRIVATELAST: ClipboardFormat = 767u.toUShort()

public val CF_RIFF: ClipboardFormat = 11u.toUShort()

public val CF_SELECTACTIVATEAS: UiConvertFlags = 16u

public val CF_SELECTCONVERTTO: UiConvertFlags = 8u

public val CF_SETACTIVATEDEFAULT: UiConvertFlags = 4u

public val CF_SETCONVERTDEFAULT: UiConvertFlags = 2u

public val CF_SHOWHELPBUTTON: UiConvertFlags = 1u

public val CF_SYLK: ClipboardFormat = 4u.toUShort()

public val CF_TEXT: ClipboardFormat = 1u.toUShort()

public val CF_TIFF: ClipboardFormat = 6u.toUShort()

public val CF_UNICODETEXT: ClipboardFormat = 13u.toUShort()

public val CF_WAVE: ClipboardFormat = 12u.toUShort()

public val CHANGEKIND_ADDMEMBER: Changekind = 0

public val CHANGEKIND_CHANGEFAILED: Changekind = 6

public val CHANGEKIND_DELETEMEMBER: Changekind = 1

public val CHANGEKIND_GENERAL: Changekind = 4

public val CHANGEKIND_INVALIDATE: Changekind = 5

public val CHANGEKIND_MAX: Changekind = 7

public val CHANGEKIND_SETDOCUMENTATION: Changekind = 3

public val CHANGEKIND_SETNAMES: Changekind = 2

public val CIF_SELECTCURRENT: ChangeIconFlags = 2u

public val CIF_SELECTDEFAULT: ChangeIconFlags = 4u

public val CIF_SELECTFROMFILE: ChangeIconFlags = 8u

public val CIF_SHOWHELP: ChangeIconFlags = 1u

public val CIF_USEICONEXE: ChangeIconFlags = 16u

public val CONNECT_E_ADVISELIMIT: Hresult = 0x80040201u.toInt()

public val CONNECT_E_CANNOTCONNECT: Hresult = 0x80040202u.toInt()

public val CONNECT_E_FIRST: Int = -2147220992

public val CONNECT_E_LAST: Hresult = 0x8004020Fu.toInt()

public val CONNECT_E_NOCONNECTION: Hresult = 0x80040200u.toInt()

public val CONNECT_E_OVERRIDDEN: Hresult = 0x80040203u.toInt()

public val CONNECT_S_FIRST: Hresult = 0x40200u.toInt()

public val CONNECT_S_LAST: Hresult = 0x4020Fu.toInt()

public val CSF_EXPLORER: ChangeSourceFlags = 8u

public val CSF_ONLYGETSOURCE: ChangeSourceFlags = 4u

public val CSF_SHOWHELP: ChangeSourceFlags = 1u

public val CSF_VALIDSOURCE: ChangeSourceFlags = 2u

public val CTL_E_ILLEGALFUNCTIONCALL: Int = -2146828283

public val CTRLINFO_EATS_ESCAPE: Ctrlinfo = 2

public val CTRLINFO_EATS_RETURN: Ctrlinfo = 1

public val DD_DEFDRAGDELAY: UInt = 200u

public val DD_DEFDRAGMINDIST: UInt = 2u

public val DD_DEFSCROLLDELAY: UInt = 50u

public val DD_DEFSCROLLINSET: UInt = 11u

public val DD_DEFSCROLLINTERVAL: UInt = 50u

public val DISCARDCACHE_NOSAVE: Discardcache = 1

public val DISCARDCACHE_SAVEIFDIRTY: Discardcache = 0

public val DISPATCH_CONSTRUCT: UInt = 16384u

public val DISPID_ABOUTBOX: Int = -552

public val DISPID_ACCELERATOR: Int = -543

public val DISPID_ADDITEM: Int = -553

public val DISPID_AMBIENT_APPEARANCE: Int = -716

public val DISPID_AMBIENT_AUTOCLIP: Int = -715

public val DISPID_AMBIENT_BACKCOLOR: Int = -701

public val DISPID_AMBIENT_CHARSET: Int = -727

public val DISPID_AMBIENT_CODEPAGE: Int = -725

public val DISPID_AMBIENT_DISPLAYASDEFAULT: Int = -713

public val DISPID_AMBIENT_DISPLAYNAME: Int = -702

public val DISPID_AMBIENT_FONT: Int = -703

public val DISPID_AMBIENT_FORECOLOR: Int = -704

public val DISPID_AMBIENT_LOCALEID: Int = -705

public val DISPID_AMBIENT_MESSAGEREFLECT: Int = -706

public val DISPID_AMBIENT_PALETTE: Int = -726

public val DISPID_AMBIENT_RIGHTTOLEFT: Int = -732

public val DISPID_AMBIENT_SCALEUNITS: Int = -707

public val DISPID_AMBIENT_SHOWGRABHANDLES: Int = -711

public val DISPID_AMBIENT_SHOWHATCHING: Int = -712

public val DISPID_AMBIENT_SUPPORTSMNEMONICS: Int = -714

public val DISPID_AMBIENT_TEXTALIGN: Int = -708

public val DISPID_AMBIENT_TOPTOBOTTOM: Int = -733

public val DISPID_AMBIENT_TRANSFERPRIORITY: Int = -728

public val DISPID_AMBIENT_UIDEAD: Int = -710

public val DISPID_AMBIENT_USERMODE: Int = -709

public val DISPID_APPEARANCE: Int = -520

public val DISPID_AUTOSIZE: Int = -500

public val DISPID_BACKCOLOR: Int = -501

public val DISPID_BACKSTYLE: Int = -502

public val DISPID_BORDERCOLOR: Int = -503

public val DISPID_BORDERSTYLE: Int = -504

public val DISPID_BORDERVISIBLE: Int = -519

public val DISPID_BORDERWIDTH: Int = -505

public val DISPID_CAPTION: Int = -518

public val DISPID_CLEAR: Int = -554

public val DISPID_CLICK: Int = -600

public val DISPID_CLICK_VALUE: Int = -610

public val DISPID_COLLECT: Int = -8

public val DISPID_COLUMN: Int = -529

public val DISPID_CONSTRUCTOR: Int = -6

public val DISPID_DBLCLICK: Int = -601

public val DISPID_DESTRUCTOR: Int = -7

public val DISPID_DISPLAYSTYLE: Int = -540

public val DISPID_DOCLICK: Int = -551

public val DISPID_DRAWMODE: Int = -507

public val DISPID_DRAWSTYLE: Int = -508

public val DISPID_DRAWWIDTH: Int = -509

public val DISPID_DELETE: Int = -801

public val DISPID_ENABLED: Int = -514

public val DISPID_ENTERKEYBEHAVIOR: Int = -544

public val DISPID_ERROREVENT: Int = -608

public val DISPID_EVALUATE: Int = -5

public val DISPID_FILLCOLOR: Int = -510

public val DISPID_FILLSTYLE: Int = -511

public val DISPID_FONT: Int = -512

public val DISPID_FONT_BOLD: UInt = 3u

public val DISPID_FONT_CHANGED: UInt = 9u

public val DISPID_FONT_CHARSET: UInt = 8u

public val DISPID_FONT_ITALIC: UInt = 4u

public val DISPID_FONT_NAME: UInt = 0u

public val DISPID_FONT_SIZE: UInt = 2u

public val DISPID_FONT_STRIKE: UInt = 6u

public val DISPID_FONT_UNDER: UInt = 5u

public val DISPID_FONT_WEIGHT: UInt = 7u

public val DISPID_FORECOLOR: Int = -513

public val DISPID_GROUPNAME: Int = -541

public val DISPID_HWND: Int = -515

public val DISPID_IMEMODE: Int = -542

public val DISPID_KEYDOWN: Int = -602

public val DISPID_KEYPRESS: Int = -603

public val DISPID_KEYUP: Int = -604

public val DISPID_LIST: Int = -528

public val DISPID_LISTCOUNT: Int = -531

public val DISPID_LISTINDEX: Int = -526

public val DISPID_MAXLENGTH: Int = -533

public val DISPID_MOUSEDOWN: Int = -605

public val DISPID_MOUSEICON: Int = -522

public val DISPID_MOUSEMOVE: Int = -606

public val DISPID_MOUSEPOINTER: Int = -521

public val DISPID_MOUSEUP: Int = -607

public val DISPID_MULTILINE: Int = -537

public val DISPID_MULTISELECT: Int = -532

public val DISPID_NEWENUM: Int = -4

public val DISPID_NUMBEROFCOLUMNS: Int = -539

public val DISPID_NUMBEROFROWS: Int = -538

public val DISPID_NAME: Int = -800

public val DISPID_OBJECT: Int = -802

public val DISPID_PASSWORDCHAR: Int = -534

public val DISPID_PICTURE: Int = -523

public val DISPID_PICT_HANDLE: UInt = 0u

public val DISPID_PICT_HEIGHT: UInt = 5u

public val DISPID_PICT_HPAL: UInt = 2u

public val DISPID_PICT_RENDER: UInt = 6u

public val DISPID_PICT_TYPE: UInt = 3u

public val DISPID_PICT_WIDTH: UInt = 4u

public val DISPID_PROPERTYPUT: Int = -3

public val DISPID_PARENT: Int = -803

public val DISPID_READYSTATE: Int = -525

public val DISPID_READYSTATECHANGE: Int = -609

public val DISPID_REFRESH: Int = -550

public val DISPID_REMOVEITEM: Int = -555

public val DISPID_RIGHTTOLEFT: Int = -611

public val DISPID_SCROLLBARS: Int = -535

public val DISPID_SELECTED: Int = -527

public val DISPID_SELLENGTH: Int = -548

public val DISPID_SELSTART: Int = -547

public val DISPID_SELTEXT: Int = -546

public val DISPID_STARTENUM: Int = -1

public val DISPID_TABKEYBEHAVIOR: Int = -545

public val DISPID_TABSTOP: Int = -516

public val DISPID_TEXT: Int = -517

public val DISPID_THIS: Int = -613

public val DISPID_TOPTOBOTTOM: Int = -612

public val DISPID_UNKNOWN: Int = -1

public val DISPID_VALID: Int = -524

public val DISPID_VALUE: UInt = 0u

public val DISPID_WORDWRAP: Int = -536

public val DOCMISC_CANCREATEMULTIPLEVIEWS: Docmisc = 1

public val DOCMISC_CANTOPENEDIT: Docmisc = 4

public val DOCMISC_NOFILESUPPORT: Docmisc = 8

public val DOCMISC_SUPPORTCOMPLEXRECTANGLES: Docmisc = 2

public val DROPEFFECT_COPY: Dropeffect = 1u

public val DROPEFFECT_LINK: Dropeffect = 4u

public val DROPEFFECT_MOVE: Dropeffect = 2u

public val DROPEFFECT_NONE: Dropeffect = 0u

public val DROPEFFECT_SCROLL: Dropeffect = 2147483648u

public val DVASPECTINFOFLAG_CANOPTIMIZE: Dvaspectinfoflag = 1

public val DVEXTENT_CONTENT: Dvextentmode = 0

public val DVEXTENT_INTEGRAL: Dvextentmode = 1

public val ELF_DISABLECANCELLINK: EditLinksFlags = 16u

public val ELF_DISABLECHANGESOURCE: EditLinksFlags = 8u

public val ELF_DISABLEOPENSOURCE: EditLinksFlags = 4u

public val ELF_DISABLEUPDATENOW: EditLinksFlags = 2u

public val ELF_SHOWHELP: EditLinksFlags = 1u

public val EMBDHLP_CREATENOW: EmbdhlpFlags = 0u

public val EMBDHLP_DELAYCREATE: EmbdhlpFlags = 65536u

public val EMBDHLP_INPROC_HANDLER: EmbdhlpFlags = 0u

public val EMBDHLP_INPROC_SERVER: EmbdhlpFlags = 1u

public val GCW_WCH_SIBLING: EnumControlsWhichFlags = 1u

public val GC_WCH_ALL: EnumControlsWhichFlags = 4u

public val GC_WCH_CONTAINED: EnumControlsWhichFlags = 3u

public val GC_WCH_CONTAINER: EnumControlsWhichFlags = 2u

public val GC_WCH_FONLYAFTER: EnumControlsWhichFlags = 268435456u

public val GC_WCH_FONLYBEFORE: EnumControlsWhichFlags = 536870912u

public val GC_WCH_FREVERSEDIR: EnumControlsWhichFlags = 134217728u

public val GC_WCH_FSELECTED: EnumControlsWhichFlags = 1073741824u

public val GC_WCH_SIBLING: Int = 1

public val GUIDKIND_DEFAULT_SOURCE_DISP_IID: Guidkind = 1

public val HITRESULT_CLOSE: Hitresult = 2

public val HITRESULT_HIT: Hitresult = 3

public val HITRESULT_OUTSIDE: Hitresult = 0

public val HITRESULT_TRANSPARENT: Hitresult = 1

public val IDC_BZ_ICON: UInt = 601u

public val IDC_BZ_MESSAGE1: UInt = 602u

public val IDC_BZ_RETRY: UInt = 600u

public val IDC_BZ_SWITCHTO: UInt = 604u

public val IDC_CI_BROWSE: UInt = 130u

public val IDC_CI_CURRENT: UInt = 121u

public val IDC_CI_CURRENTICON: UInt = 122u

public val IDC_CI_DEFAULT: UInt = 123u

public val IDC_CI_DEFAULTICON: UInt = 124u

public val IDC_CI_FROMFILE: UInt = 125u

public val IDC_CI_FROMFILEEDIT: UInt = 126u

public val IDC_CI_GROUP: UInt = 120u

public val IDC_CI_ICONDISPLAY: UInt = 131u

public val IDC_CI_ICONLIST: UInt = 127u

public val IDC_CI_LABEL: UInt = 128u

public val IDC_CI_LABELEDIT: UInt = 129u

public val IDC_CV_ACTIVATEAS: UInt = 156u

public val IDC_CV_ACTIVATELIST: UInt = 154u

public val IDC_CV_CHANGEICON: UInt = 153u

public val IDC_CV_CONVERTLIST: UInt = 158u

public val IDC_CV_CONVERTTO: UInt = 155u

public val IDC_CV_DISPLAYASICON: UInt = 152u

public val IDC_CV_ICONDISPLAY: UInt = 165u

public val IDC_CV_OBJECTTYPE: UInt = 150u

public val IDC_CV_RESULTTEXT: UInt = 157u

public val IDC_EL_AUTOMATIC: UInt = 202u

public val IDC_EL_CANCELLINK: UInt = 209u

public val IDC_EL_CHANGESOURCE: UInt = 201u

public val IDC_EL_COL1: UInt = 220u

public val IDC_EL_COL2: UInt = 221u

public val IDC_EL_COL3: UInt = 222u

public val IDC_EL_LINKSLISTBOX: UInt = 206u

public val IDC_EL_LINKSOURCE: UInt = 216u

public val IDC_EL_LINKTYPE: UInt = 217u

public val IDC_EL_MANUAL: UInt = 212u

public val IDC_EL_OPENSOURCE: UInt = 211u

public val IDC_EL_UPDATENOW: UInt = 210u

public val IDC_GP_CONVERT: UInt = 1013u

public val IDC_GP_OBJECTICON: UInt = 1014u

public val IDC_GP_OBJECTLOCATION: UInt = 1022u

public val IDC_GP_OBJECTNAME: UInt = 1009u

public val IDC_GP_OBJECTSIZE: UInt = 1011u

public val IDC_GP_OBJECTTYPE: UInt = 1010u

public val IDC_IO_ADDCONTROL: UInt = 2115u

public val IDC_IO_CHANGEICON: UInt = 2105u

public val IDC_IO_CONTROLTYPELIST: UInt = 2116u

public val IDC_IO_CREATEFROMFILE: UInt = 2101u

public val IDC_IO_CREATENEW: UInt = 2100u

public val IDC_IO_DISPLAYASICON: UInt = 2104u

public val IDC_IO_FILE: UInt = 2106u

public val IDC_IO_FILEDISPLAY: UInt = 2107u

public val IDC_IO_FILETEXT: UInt = 2112u

public val IDC_IO_FILETYPE: UInt = 2113u

public val IDC_IO_ICONDISPLAY: UInt = 2110u

public val IDC_IO_INSERTCONTROL: UInt = 2114u

public val IDC_IO_LINKFILE: UInt = 2102u

public val IDC_IO_OBJECTTYPELIST: UInt = 2103u

public val IDC_IO_OBJECTTYPETEXT: UInt = 2111u

public val IDC_IO_RESULTIMAGE: UInt = 2108u

public val IDC_IO_RESULTTEXT: UInt = 2109u

public val IDC_LP_AUTOMATIC: UInt = 1016u

public val IDC_LP_BREAKLINK: UInt = 1008u

public val IDC_LP_CHANGESOURCE: UInt = 1015u

public val IDC_LP_DATE: UInt = 1018u

public val IDC_LP_LINKSOURCE: UInt = 1012u

public val IDC_LP_MANUAL: UInt = 1017u

public val IDC_LP_OPENSOURCE: UInt = 1006u

public val IDC_LP_TIME: UInt = 1019u

public val IDC_LP_UPDATENOW: UInt = 1007u

public val IDC_OLEUIHELP: UInt = 99u

public val IDC_PS_CHANGEICON: UInt = 508u

public val IDC_PS_DISPLAYASICON: UInt = 506u

public val IDC_PS_DISPLAYLIST: UInt = 505u

public val IDC_PS_ICONDISPLAY: UInt = 507u

public val IDC_PS_PASTE: UInt = 500u

public val IDC_PS_PASTELINK: UInt = 501u

public val IDC_PS_PASTELINKLIST: UInt = 504u

public val IDC_PS_PASTELIST: UInt = 503u

public val IDC_PS_RESULTIMAGE: UInt = 509u

public val IDC_PS_RESULTTEXT: UInt = 510u

public val IDC_PS_SOURCETEXT: UInt = 502u

public val IDC_PU_CONVERT: UInt = 902u

public val IDC_PU_ICON: UInt = 908u

public val IDC_PU_LINKS: UInt = 900u

public val IDC_PU_TEXT: UInt = 901u

public val IDC_UL_METER: UInt = 1029u

public val IDC_UL_PERCENT: UInt = 1031u

public val IDC_UL_PROGRESS: UInt = 1032u

public val IDC_UL_STOP: UInt = 1030u

public val IDC_VP_ASICON: UInt = 1003u

public val IDC_VP_CHANGEICON: UInt = 1001u

public val IDC_VP_EDITABLE: UInt = 1002u

public val IDC_VP_ICONDISPLAY: UInt = 1021u

public val IDC_VP_PERCENT: UInt = 1000u

public val IDC_VP_RELATIVE: UInt = 1005u

public val IDC_VP_RESULTIMAGE: UInt = 1033u

public val IDC_VP_SCALETXT: UInt = 1034u

public val IDC_VP_SPIN: UInt = 1006u

public val IDD_BUSY: UInt = 1006u

public val IDD_CANNOTUPDATELINK: UInt = 1008u

public val IDD_CHANGEICON: UInt = 1001u

public val IDD_CHANGEICONBROWSE: UInt = 1011u

public val IDD_CHANGESOURCE: UInt = 1009u

public val IDD_CHANGESOURCE4: UInt = 1013u

public val IDD_CONVERT: UInt = 1002u

public val IDD_CONVERT4: UInt = 1103u

public val IDD_CONVERTONLY: UInt = 1012u

public val IDD_CONVERTONLY4: UInt = 1104u

public val IDD_EDITLINKS: UInt = 1004u

public val IDD_EDITLINKS4: UInt = 1105u

public val IDD_GNRLPROPS: UInt = 1100u

public val IDD_GNRLPROPS4: UInt = 1106u

public val IDD_INSERTFILEBROWSE: UInt = 1010u

public val IDD_INSERTOBJECT: UInt = 1000u

public val IDD_LINKPROPS: UInt = 1102u

public val IDD_LINKPROPS4: UInt = 1107u

public val IDD_LINKSOURCEUNAVAILABLE: UInt = 1020u

public val IDD_LINKTYPECHANGED: UInt = 1022u

public val IDD_LINKTYPECHANGEDA: UInt = 1026u

public val IDD_LINKTYPECHANGEDW: UInt = 1022u

public val IDD_OUTOFMEMORY: UInt = 1024u

public val IDD_PASTESPECIAL: UInt = 1003u

public val IDD_PASTESPECIAL4: UInt = 1108u

public val IDD_SERVERNOTFOUND: UInt = 1023u

public val IDD_SERVERNOTREG: UInt = 1021u

public val IDD_SERVERNOTREGA: UInt = 1025u

public val IDD_SERVERNOTREGW: UInt = 1021u

public val IDD_UPDATELINKS: UInt = 1007u

public val IDD_VIEWPROPS: UInt = 1101u

public val ID_BROWSE_ADDCONTROL: UInt = 3u

public val ID_BROWSE_CHANGEICON: UInt = 1u

public val ID_BROWSE_CHANGESOURCE: UInt = 4u

public val ID_BROWSE_INSERTFILE: UInt = 2u

public val ID_DEFAULTINST: Int = -2

public val IGNOREMIME_PROMPT: Ignoremime = 1

public val IGNOREMIME_TEXT: Ignoremime = 2

public val INSTALL_SCOPE_INVALID: UInt = 0u

public val INSTALL_SCOPE_MACHINE: UInt = 1u

public val INSTALL_SCOPE_USER: UInt = 2u

public val IOF_CHECKDISPLAYASICON: InsertObjectFlags = 16u

public val IOF_CHECKLINK: InsertObjectFlags = 8u

public val IOF_CREATEFILEOBJECT: InsertObjectFlags = 64u

public val IOF_CREATELINKOBJECT: InsertObjectFlags = 128u

public val IOF_CREATENEWOBJECT: InsertObjectFlags = 32u

public val IOF_DISABLEDISPLAYASICON: InsertObjectFlags = 1024u

public val IOF_DISABLELINK: InsertObjectFlags = 256u

public val IOF_HIDECHANGEICON: InsertObjectFlags = 2048u

public val IOF_SELECTCREATECONTROL: InsertObjectFlags = 8192u

public val IOF_SELECTCREATEFROMFILE: InsertObjectFlags = 4u

public val IOF_SELECTCREATENEW: InsertObjectFlags = 2u

public val IOF_SHOWHELP: InsertObjectFlags = 1u

public val IOF_SHOWINSERTCONTROL: InsertObjectFlags = 4096u

public val IOF_VERIFYSERVERSEXIST: InsertObjectFlags = 512u

public val KEYMOD_ALT: Keymodifiers = 4u

public val KEYMOD_CONTROL: Keymodifiers = 2u

public val KEYMOD_SHIFT: Keymodifiers = 1u

public val LIBFLAG_FCONTROL: Libflags = 2

public val LIBFLAG_FHASDISKIMAGE: Libflags = 8

public val LIBFLAG_FHIDDEN: Libflags = 4

public val LIBFLAG_FRESTRICTED: Libflags = 1

public val LOAD_TLB_AS_32BIT: UInt = 32u

public val LOAD_TLB_AS_64BIT: UInt = 64u

public val LOCALE_USE_NLS: UInt = 268435456u

public val LP_COLOR: LoadPictureFlags = 4u

public val LP_DEFAULT: LoadPictureFlags = 0u

public val LP_MONOCHROME: LoadPictureFlags = 1u

public val LP_VGACOLOR: LoadPictureFlags = 2u

public val MEDIAPLAYBACK_PAUSE: MediaplaybackState = 1

public val MEDIAPLAYBACK_PAUSE_AND_SUSPEND: MediaplaybackState = 2

public val MEDIAPLAYBACK_RESUME: MediaplaybackState = 0

public val MEDIAPLAYBACK_RESUME_FROM_SUSPEND: MediaplaybackState = 3

public val MEMBERID_NIL: Int = -1

public val MK_ALT: UInt = 32u

public val MSOCMDERR_E_CANCELED: Int = -2147221245

public val MSOCMDERR_E_DISABLED: Int = -2147221247

public val MSOCMDERR_E_FIRST: Int = -2147221248

public val MSOCMDERR_E_NOHELP: Int = -2147221246

public val MSOCMDERR_E_NOTSUPPORTED: Int = -2147221248

public val MSOCMDERR_E_UNKNOWNGROUP: Int = -2147221244

public val MULTICLASSINFO_GETIIDPRIMARY: MulticlassinfoFlags = 4u

public val MULTICLASSINFO_GETIIDSOURCE: MulticlassinfoFlags = 8u

public val MULTICLASSINFO_GETNUMRESERVEDDISPIDS: MulticlassinfoFlags = 2u

public val MULTICLASSINFO_GETTYPEINFO: MulticlassinfoFlags = 1u

public val NUMPRS_CURRENCY: NumparseFlags = 1024u

public val NUMPRS_DECIMAL: NumparseFlags = 256u

public val NUMPRS_EXPONENT: NumparseFlags = 2048u

public val NUMPRS_HEX_OCT: NumparseFlags = 64u

public val NUMPRS_INEXACT: NumparseFlags = 131072u

public val NUMPRS_LEADING_MINUS: NumparseFlags = 16u

public val NUMPRS_LEADING_PLUS: NumparseFlags = 4u

public val NUMPRS_LEADING_WHITE: NumparseFlags = 1u

public val NUMPRS_NEG: NumparseFlags = 65536u

public val NUMPRS_PARENS: NumparseFlags = 128u

public val NUMPRS_STD: NumparseFlags = 8191u

public val NUMPRS_THOUSANDS: NumparseFlags = 512u

public val NUMPRS_TRAILING_MINUS: NumparseFlags = 32u

public val NUMPRS_TRAILING_PLUS: NumparseFlags = 8u

public val NUMPRS_TRAILING_WHITE: NumparseFlags = 2u

public val NUMPRS_USE_ALL: NumparseFlags = 4096u

public val OCM_BASE: UInt = 8192u

public val OF_GET: UInt = 2u

public val OF_HANDLER: UInt = 4u

public val OF_SET: UInt = 1u

public val OLECLOSE_NOSAVE: Oleclose = 1

public val OLECLOSE_PROMPTSAVE: Oleclose = 2

public val OLECLOSE_SAVEIFDIRTY: Oleclose = 0

public val OLECMDARGINDEX_ACTIVEXINSTALL_CLSID: UInt = 2u

public val OLECMDARGINDEX_ACTIVEXINSTALL_DISPLAYNAME: UInt = 1u

public val OLECMDARGINDEX_ACTIVEXINSTALL_INSTALLSCOPE: UInt = 3u

public val OLECMDARGINDEX_ACTIVEXINSTALL_PUBLISHER: UInt = 0u

public val OLECMDARGINDEX_ACTIVEXINSTALL_SOURCEURL: UInt = 4u

public val OLECMDARGINDEX_SHOWPAGEACTIONMENU_HWND: UInt = 0u

public val OLECMDARGINDEX_SHOWPAGEACTIONMENU_X: UInt = 1u

public val OLECMDARGINDEX_SHOWPAGEACTIONMENU_Y: UInt = 2u

public val OLECMDERR_E_CANCELED: Hresult = 0x80040103u.toInt()

public val OLECMDERR_E_DISABLED: Hresult = 0x80040101u.toInt()

public val OLECMDERR_E_FIRST: Hresult = 0x80040100u.toInt()

public val OLECMDERR_E_NOHELP: Hresult = 0x80040102u.toInt()

public val OLECMDERR_E_NOTSUPPORTED: Int = -2147221248

public val OLECMDERR_E_UNKNOWNGROUP: Hresult = 0x80040104u.toInt()

public val OLECMDEXECOPT_DODEFAULT: Olecmdexecopt = 0

public val OLECMDEXECOPT_DONTPROMPTUSER: Olecmdexecopt = 2

public val OLECMDEXECOPT_PROMPTUSER: Olecmdexecopt = 1

public val OLECMDEXECOPT_SHOWHELP: Olecmdexecopt = 3

public val OLECMDF_DEFHIDEONCTXTMENU: Olecmdf = 32

public val OLECMDF_ENABLED: Olecmdf = 2

public val OLECMDF_INVISIBLE: Olecmdf = 16

public val OLECMDF_LATCHED: Olecmdf = 4

public val OLECMDF_NINCHED: Olecmdf = 8

public val OLECMDF_SUPPORTED: Olecmdf = 1

public val OLECMDIDF_BROWSERSTATE_BLOCKEDVERSION: OlecmdidBrowserstateflag = 64

public val OLECMDIDF_BROWSERSTATE_DESKTOPHTMLDIALOG: OlecmdidBrowserstateflag = 32

public val OLECMDIDF_BROWSERSTATE_EXTENSIONSOFF: OlecmdidBrowserstateflag = 1

public val OLECMDIDF_BROWSERSTATE_IESECURITY: OlecmdidBrowserstateflag = 2

public val OLECMDIDF_BROWSERSTATE_PROTECTEDMODE_OFF: OlecmdidBrowserstateflag = 4

public val OLECMDIDF_BROWSERSTATE_REQUIRESACTIVEX: OlecmdidBrowserstateflag = 16

public val OLECMDIDF_BROWSERSTATE_RESET: OlecmdidBrowserstateflag = 8

public val OLECMDIDF_OPTICAL_ZOOM_NOLAYOUT: OlecmdidOpticalZoomflag = 16

public val OLECMDIDF_OPTICAL_ZOOM_NOPERSIST: OlecmdidOpticalZoomflag = 1

public val OLECMDIDF_OPTICAL_ZOOM_NOTRANSIENT: OlecmdidOpticalZoomflag = 32

public val OLECMDIDF_OPTICAL_ZOOM_RELOADFORNEWTAB: OlecmdidOpticalZoomflag = 64

public val OLECMDIDF_PAGEACTION_ACTIVEXDISALLOW: OlecmdidPageactionflag = 16

public val OLECMDIDF_PAGEACTION_ACTIVEXINSTALL: OlecmdidPageactionflag = 2

public val OLECMDIDF_PAGEACTION_ACTIVEXTRUSTFAIL: OlecmdidPageactionflag = 4

public val OLECMDIDF_PAGEACTION_ACTIVEXUNSAFE: OlecmdidPageactionflag = 32

public val OLECMDIDF_PAGEACTION_ACTIVEXUSERAPPROVAL: OlecmdidPageactionflag = 262144

public val OLECMDIDF_PAGEACTION_ACTIVEXUSERDISABLE: OlecmdidPageactionflag = 8

public val OLECMDIDF_PAGEACTION_ACTIVEX_EPM_INCOMPATIBLE: OlecmdidPageactionflag = 16777216

public val OLECMDIDF_PAGEACTION_EXTENSION_COMPAT_BLOCKED: OlecmdidPageactionflag = 268435456

public val OLECMDIDF_PAGEACTION_FILEDOWNLOAD: OlecmdidPageactionflag = 1

public val OLECMDIDF_PAGEACTION_GENERIC_STATE: OlecmdidPageactionflag = 1073741824

public val OLECMDIDF_PAGEACTION_INTRANETZONEREQUEST: OlecmdidPageactionflag = 2097152

public val OLECMDIDF_PAGEACTION_INVALID_CERT: OlecmdidPageactionflag = 1048576

public val OLECMDIDF_PAGEACTION_LOCALMACHINE: OlecmdidPageactionflag = 128

public val OLECMDIDF_PAGEACTION_MIMETEXTPLAIN: OlecmdidPageactionflag = 256

public val OLECMDIDF_PAGEACTION_MIXEDCONTENT: OlecmdidPageactionflag = 524288

public val OLECMDIDF_PAGEACTION_NORESETACTIVEX: OlecmdidPageactionflag = 536870912

public val OLECMDIDF_PAGEACTION_POPUPALLOWED: OlecmdidPageactionflag = 65536

public val OLECMDIDF_PAGEACTION_POPUPWINDOW: OlecmdidPageactionflag = 64

public val OLECMDIDF_PAGEACTION_PROTLOCKDOWNDENY: OlecmdidPageactionflag = 32768

public val OLECMDIDF_PAGEACTION_PROTLOCKDOWNINTERNET: OlecmdidPageactionflag = 8192

public val OLECMDIDF_PAGEACTION_PROTLOCKDOWNINTRANET: OlecmdidPageactionflag = 4096

public val OLECMDIDF_PAGEACTION_PROTLOCKDOWNLOCALMACHINE: OlecmdidPageactionflag = 1024

public val OLECMDIDF_PAGEACTION_PROTLOCKDOWNRESTRICTED: OlecmdidPageactionflag = 16384

public val OLECMDIDF_PAGEACTION_PROTLOCKDOWNTRUSTED: OlecmdidPageactionflag = 2048

public val OLECMDIDF_PAGEACTION_RESET: OlecmdidPageactionflag = -2147483648.toInt()

public val OLECMDIDF_PAGEACTION_SCRIPTNAVIGATE: OlecmdidPageactionflag = 512

public val OLECMDIDF_PAGEACTION_SCRIPTNAVIGATE_ACTIVEXINSTALL: OlecmdidPageactionflag = 512

public val OLECMDIDF_PAGEACTION_SCRIPTNAVIGATE_ACTIVEXUSERAPPROVAL: OlecmdidPageactionflag = 33554432

public val OLECMDIDF_PAGEACTION_SCRIPTPROMPT: OlecmdidPageactionflag = 131072

public val OLECMDIDF_PAGEACTION_SPOOFABLEIDNHOST: OlecmdidPageactionflag = 8388608

public val OLECMDIDF_PAGEACTION_WPCBLOCKED: OlecmdidPageactionflag = 67108864

public val OLECMDIDF_PAGEACTION_WPCBLOCKED_ACTIVEX: OlecmdidPageactionflag = 134217728

public val OLECMDIDF_PAGEACTION_XSSFILTERED: OlecmdidPageactionflag = 4194304

public val OLECMDIDF_REFRESH_CLEARUSERINPUT: OlecmdidRefreshflag = 4096

public val OLECMDIDF_REFRESH_COMPLETELY: OlecmdidRefreshflag = 3

public val OLECMDIDF_REFRESH_CONTINUE: OlecmdidRefreshflag = 2

public val OLECMDIDF_REFRESH_IFEXPIRED: OlecmdidRefreshflag = 1

public val OLECMDIDF_REFRESH_LEVELMASK: OlecmdidRefreshflag = 255

public val OLECMDIDF_REFRESH_NORMAL: OlecmdidRefreshflag = 0

public val OLECMDIDF_REFRESH_NO_CACHE: OlecmdidRefreshflag = 4

public val OLECMDIDF_REFRESH_PAGEACTION_ACTIVEXINSTALL: OlecmdidRefreshflag = 65536

public val OLECMDIDF_REFRESH_PAGEACTION_ALLOW_VERSION: OlecmdidRefreshflag = 134217728

public val OLECMDIDF_REFRESH_PAGEACTION_FILEDOWNLOAD: OlecmdidRefreshflag = 131072

public val OLECMDIDF_REFRESH_PAGEACTION_INVALID_CERT: OlecmdidRefreshflag = 67108864

public val OLECMDIDF_REFRESH_PAGEACTION_LOCALMACHINE: OlecmdidRefreshflag = 262144

public val OLECMDIDF_REFRESH_PAGEACTION_MIXEDCONTENT: OlecmdidRefreshflag = 33554432

public val OLECMDIDF_REFRESH_PAGEACTION_POPUPWINDOW: OlecmdidRefreshflag = 524288

public val OLECMDIDF_REFRESH_PAGEACTION_PROTLOCKDOWNINTERNET: OlecmdidRefreshflag = 8388608

public val OLECMDIDF_REFRESH_PAGEACTION_PROTLOCKDOWNINTRANET: OlecmdidRefreshflag = 4194304

public val OLECMDIDF_REFRESH_PAGEACTION_PROTLOCKDOWNLOCALMACHINE: OlecmdidRefreshflag = 1048576

public val OLECMDIDF_REFRESH_PAGEACTION_PROTLOCKDOWNRESTRICTED: OlecmdidRefreshflag = 16777216

public val OLECMDIDF_REFRESH_PAGEACTION_PROTLOCKDOWNTRUSTED: OlecmdidRefreshflag = 2097152

public val OLECMDIDF_REFRESH_PROMPTIFOFFLINE: OlecmdidRefreshflag = 8192

public val OLECMDIDF_REFRESH_RELOAD: OlecmdidRefreshflag = 5

public val OLECMDIDF_REFRESH_SKIPBEFOREUNLOADEVENT: OlecmdidRefreshflag = 32768

public val OLECMDIDF_REFRESH_THROUGHSCRIPT: OlecmdidRefreshflag = 16384

public val OLECMDIDF_VIEWPORTMODE_EXCLUDE_VISUAL_BOTTOM: OlecmdidViewportModeFlag = 2

public val OLECMDIDF_VIEWPORTMODE_EXCLUDE_VISUAL_BOTTOM_VALID: OlecmdidViewportModeFlag = 131072

public val OLECMDIDF_VIEWPORTMODE_FIXED_LAYOUT_WIDTH: OlecmdidViewportModeFlag = 1

public val OLECMDIDF_VIEWPORTMODE_FIXED_LAYOUT_WIDTH_VALID: OlecmdidViewportModeFlag = 65536

public val OLECMDIDF_WINDOWSTATE_ENABLED: OlecmdidWindowstateFlag = 2

public val OLECMDIDF_WINDOWSTATE_ENABLED_VALID: OlecmdidWindowstateFlag = 131072

public val OLECMDIDF_WINDOWSTATE_USERVISIBLE: OlecmdidWindowstateFlag = 1

public val OLECMDIDF_WINDOWSTATE_USERVISIBLE_VALID: OlecmdidWindowstateFlag = 65536

public val OLECMDID_ACTIVEXINSTALLSCOPE: Olecmdid = 66

public val OLECMDID_ADDTRAVELENTRY: Olecmdid = 60

public val OLECMDID_ALLOWUILESSSAVEAS: Olecmdid = 46

public val OLECMDID_CLEARSELECTION: Olecmdid = 18

public val OLECMDID_CLOSE: Olecmdid = 45

public val OLECMDID_COPY: Olecmdid = 12

public val OLECMDID_CUT: Olecmdid = 11

public val OLECMDID_DELETE: Olecmdid = 33

public val OLECMDID_DONTDOWNLOADCSS: Olecmdid = 47

public val OLECMDID_ENABLE_INTERACTION: Olecmdid = 36

public val OLECMDID_ENABLE_VISIBILITY: Olecmdid = 77

public val OLECMDID_EXITFULLSCREEN: Olecmdid = 81

public val OLECMDID_FIND: Olecmdid = 32

public val OLECMDID_FOCUSVIEWCONTROLS: Olecmdid = 57

public val OLECMDID_FOCUSVIEWCONTROLSQUERY: Olecmdid = 58

public val OLECMDID_GETPRINTTEMPLATE: Olecmdid = 52

public val OLECMDID_GETUSERSCALABLE: Olecmdid = 75

public val OLECMDID_GETZOOMRANGE: Olecmdid = 20

public val OLECMDID_HIDETOOLBARS: Olecmdid = 24

public val OLECMDID_HTTPEQUIV: Olecmdid = 34

public val OLECMDID_HTTPEQUIV_DONE: Olecmdid = 35

public val OLECMDID_LAYOUT_VIEWPORT_WIDTH: Olecmdid = 71

public val OLECMDID_MEDIA_PLAYBACK: Olecmdid = 78

public val OLECMDID_NEW: Olecmdid = 2

public val OLECMDID_ONBEFOREUNLOAD: Olecmdid = 83

public val OLECMDID_ONTOOLBARACTIVATED: Olecmdid = 31

public val OLECMDID_ONUNLOAD: Olecmdid = 37

public val OLECMDID_OPEN: Olecmdid = 1

public val OLECMDID_OPTICAL_GETZOOMRANGE: Olecmdid = 64

public val OLECMDID_OPTICAL_ZOOM: Olecmdid = 63

public val OLECMDID_PAGEACTIONBLOCKED: Olecmdid = 55

public val OLECMDID_PAGEACTIONUIQUERY: Olecmdid = 56

public val OLECMDID_PAGEAVAILABLE: Olecmdid = 74

public val OLECMDID_PAGESETUP: Olecmdid = 8

public val OLECMDID_PASTE: Olecmdid = 13

public val OLECMDID_PASTESPECIAL: Olecmdid = 14

public val OLECMDID_POPSTATEEVENT: Olecmdid = 69

public val OLECMDID_PREREFRESH: Olecmdid = 39

public val OLECMDID_PRINT: Olecmdid = 6

public val OLECMDID_PRINT2: Olecmdid = 49

public val OLECMDID_PRINTPREVIEW: Olecmdid = 7

public val OLECMDID_PRINTPREVIEW2: Olecmdid = 50

public val OLECMDID_PROPERTIES: Olecmdid = 10

public val OLECMDID_PROPERTYBAG2: Olecmdid = 38

public val OLECMDID_REDO: Olecmdid = 16

public val OLECMDID_REFRESH: Olecmdid = 22

public val OLECMDID_SAVE: Olecmdid = 3

public val OLECMDID_SAVEAS: Olecmdid = 4

public val OLECMDID_SAVECOPYAS: Olecmdid = 5

public val OLECMDID_SCROLLCOMPLETE: Olecmdid = 82

public val OLECMDID_SELECTALL: Olecmdid = 17

public val OLECMDID_SETDOWNLOADSTATE: Olecmdid = 29

public val OLECMDID_SETFAVICON: Olecmdid = 79

public val OLECMDID_SETPRINTTEMPLATE: Olecmdid = 51

public val OLECMDID_SETPROGRESSMAX: Olecmdid = 25

public val OLECMDID_SETPROGRESSPOS: Olecmdid = 26

public val OLECMDID_SETPROGRESSTEXT: Olecmdid = 27

public val OLECMDID_SETTITLE: Olecmdid = 28

public val OLECMDID_SET_HOST_FULLSCREENMODE: Olecmdid = 80

public val OLECMDID_SHOWFIND: Olecmdid = 42

public val OLECMDID_SHOWMESSAGE: Olecmdid = 41

public val OLECMDID_SHOWMESSAGE_BLOCKABLE: Olecmdid = 84

public val OLECMDID_SHOWPAGEACTIONMENU: Olecmdid = 59

public val OLECMDID_SHOWPAGESETUP: Olecmdid = 43

public val OLECMDID_SHOWPRINT: Olecmdid = 44

public val OLECMDID_SHOWSCRIPTERROR: Olecmdid = 40

public val OLECMDID_SHOWTASKDLG: Olecmdid = 68

public val OLECMDID_SHOWTASKDLG_BLOCKABLE: Olecmdid = 85

public val OLECMDID_SPELL: Olecmdid = 9

public val OLECMDID_STOP: Olecmdid = 23

public val OLECMDID_STOPDOWNLOAD: Olecmdid = 30

public val OLECMDID_UNDO: Olecmdid = 15

public val OLECMDID_UPDATEBACKFORWARDSTATE: Olecmdid = 62

public val OLECMDID_UPDATECOMMANDS: Olecmdid = 21

public val OLECMDID_UPDATEPAGESTATUS: Olecmdid = 48

public val OLECMDID_UPDATETRAVELENTRY: Olecmdid = 61

public val OLECMDID_UPDATETRAVELENTRY_DATARECOVERY: Olecmdid = 67

public val OLECMDID_UPDATE_CARET: Olecmdid = 76

public val OLECMDID_USER_OPTICAL_ZOOM: Olecmdid = 73

public val OLECMDID_VIEWPORT_MODE: Olecmdid = 70

public val OLECMDID_VISUAL_VIEWPORT_EXCLUDE_BOTTOM: Olecmdid = 72

public val OLECMDID_WINDOWSTATECHANGED: Olecmdid = 65

public val OLECMDID_ZOOM: Olecmdid = 19

public val OLECMDTEXTF_NAME: Olecmdtextf = 1

public val OLECMDTEXTF_NONE: Olecmdtextf = 0

public val OLECMDTEXTF_STATUS: Olecmdtextf = 2

public val OLECMD_TASKDLGID_ONBEFOREUNLOAD: UInt = 1u

public val OLECONTF_EMBEDDINGS: Olecontf = 1

public val OLECONTF_LINKS: Olecontf = 2

public val OLECONTF_ONLYIFRUNNING: Olecontf = 16

public val OLECONTF_ONLYUSER: Olecontf = 8

public val OLECONTF_OTHERS: Olecontf = 4

public val OLECREATE_LEAVERUNNING: Olecreate = 1u

public val OLECREATE_ZERO: Olecreate = 0u

public val OLEDC_NODRAW: Oledcflags = 1

public val OLEDC_OFFSCREEN: Oledcflags = 4

public val OLEDC_PAINTBKGND: Oledcflags = 2

public val OLEGETMONIKER_FORCEASSIGN: Olegetmoniker = 2

public val OLEGETMONIKER_ONLYIFTHERE: Olegetmoniker = 1

public val OLEGETMONIKER_TEMPFORUSER: Olegetmoniker = 4

public val OLEGETMONIKER_UNASSIGN: Olegetmoniker = 3

public val OLEIVERB_DISCARDUNDOSTATE: Oleiverb = -6

public val OLEIVERB_HIDE: Oleiverb = -3

public val OLEIVERB_INPLACEACTIVATE: Oleiverb = -5

public val OLEIVERB_OPEN: Oleiverb = -2

public val OLEIVERB_PRIMARY: Oleiverb = 0

public val OLEIVERB_PROPERTIES: Int = -7

public val OLEIVERB_SHOW: Oleiverb = -1

public val OLEIVERB_UIACTIVATE: Oleiverb = -4

public val OLELINKBIND_EVENIFCLASSDIFF: Olelinkbind = 1

public val OLEMISC_ACTIVATEWHENVISIBLE: Olemisc = 256

public val OLEMISC_ACTSLIKEBUTTON: Olemisc = 4096

public val OLEMISC_ACTSLIKELABEL: Olemisc = 8192

public val OLEMISC_ALIGNABLE: Olemisc = 32768

public val OLEMISC_ALWAYSRUN: Olemisc = 2048

public val OLEMISC_CANLINKBYOLE1: Olemisc = 32

public val OLEMISC_CANTLINKINSIDE: Olemisc = 16

public val OLEMISC_IGNOREACTIVATEWHENVISIBLE: Olemisc = 524288

public val OLEMISC_IMEMODE: Olemisc = 262144

public val OLEMISC_INSERTNOTREPLACE: Olemisc = 4

public val OLEMISC_INSIDEOUT: Olemisc = 128

public val OLEMISC_INVISIBLEATRUNTIME: Olemisc = 1024

public val OLEMISC_ISLINKOBJECT: Olemisc = 64

public val OLEMISC_NOUIACTIVATE: Olemisc = 16384

public val OLEMISC_ONLYICONIC: Olemisc = 2

public val OLEMISC_RECOMPOSEONRESIZE: Olemisc = 1

public val OLEMISC_RENDERINGISDEVICEINDEPENDENT: Olemisc = 512

public val OLEMISC_SETCLIENTSITEFIRST: Olemisc = 131072

public val OLEMISC_SIMPLEFRAME: Olemisc = 65536

public val OLEMISC_STATIC: Olemisc = 8

public val OLEMISC_SUPPORTSMULTILEVELUNDO: Olemisc = 2097152

public val OLEMISC_WANTSTOMENUMERGE: Olemisc = 1048576

public val OLERENDER_ASIS: Olerender = 3

public val OLERENDER_DRAW: Olerender = 1

public val OLERENDER_FORMAT: Olerender = 2

public val OLERENDER_NONE: Olerender = 0

public val OLESTDDELIM: Pcwstr = w("\\")

public val OLESTREAM_CONVERSION_DEFAULT: Int = 0

public val OLESTREAM_CONVERSION_DISABLEOLELINK: Int = 1

public val OLEUIPASTE_ENABLEICON: Oleuipasteflag = 2048

public val OLEUIPASTE_LINKANYTYPE: Oleuipasteflag = 1024

public val OLEUIPASTE_LINKTYPE1: Oleuipasteflag = 1

public val OLEUIPASTE_LINKTYPE2: Oleuipasteflag = 2

public val OLEUIPASTE_LINKTYPE3: Oleuipasteflag = 4

public val OLEUIPASTE_LINKTYPE4: Oleuipasteflag = 8

public val OLEUIPASTE_LINKTYPE5: Oleuipasteflag = 16

public val OLEUIPASTE_LINKTYPE6: Oleuipasteflag = 32

public val OLEUIPASTE_LINKTYPE7: Oleuipasteflag = 64

public val OLEUIPASTE_LINKTYPE8: Oleuipasteflag = 128

public val OLEUIPASTE_PASTE: Oleuipasteflag = 512

public val OLEUIPASTE_PASTEONLY: Oleuipasteflag = 0

public val OLEUI_BZERR_HTASKINVALID: UInt = 116u

public val OLEUI_BZ_CALLUNBLOCKED: UInt = 119u

public val OLEUI_BZ_RETRYSELECTED: UInt = 118u

public val OLEUI_BZ_SWITCHTOSELECTED: UInt = 117u

public val OLEUI_CANCEL: UInt = 2u

public val OLEUI_CIERR_MUSTHAVECLSID: UInt = 116u

public val OLEUI_CIERR_MUSTHAVECURRENTMETAFILE: UInt = 117u

public val OLEUI_CIERR_SZICONEXEINVALID: UInt = 118u

public val OLEUI_CSERR_FROMNOTNULL: UInt = 118u

public val OLEUI_CSERR_LINKCNTRINVALID: UInt = 117u

public val OLEUI_CSERR_LINKCNTRNULL: UInt = 116u

public val OLEUI_CSERR_SOURCEINVALID: UInt = 121u

public val OLEUI_CSERR_SOURCENULL: UInt = 120u

public val OLEUI_CSERR_SOURCEPARSEERROR: UInt = 122u

public val OLEUI_CSERR_SOURCEPARSERROR: UInt = 122u

public val OLEUI_CSERR_TONOTNULL: UInt = 119u

public val OLEUI_CTERR_CBFORMATINVALID: UInt = 119u

public val OLEUI_CTERR_CLASSIDINVALID: UInt = 117u

public val OLEUI_CTERR_DVASPECTINVALID: UInt = 118u

public val OLEUI_CTERR_HMETAPICTINVALID: UInt = 120u

public val OLEUI_CTERR_STRINGINVALID: UInt = 121u

public val OLEUI_ELERR_LINKCNTRINVALID: UInt = 117u

public val OLEUI_ELERR_LINKCNTRNULL: UInt = 116u

public val OLEUI_ERR_CBSTRUCTINCORRECT: UInt = 103u

public val OLEUI_ERR_DIALOGFAILURE: UInt = 112u

public val OLEUI_ERR_FINDTEMPLATEFAILURE: UInt = 110u

public val OLEUI_ERR_GLOBALMEMALLOC: UInt = 114u

public val OLEUI_ERR_HINSTANCEINVALID: UInt = 107u

public val OLEUI_ERR_HRESOURCEINVALID: UInt = 109u

public val OLEUI_ERR_HWNDOWNERINVALID: UInt = 104u

public val OLEUI_ERR_LOADSTRING: UInt = 115u

public val OLEUI_ERR_LOADTEMPLATEFAILURE: UInt = 111u

public val OLEUI_ERR_LOCALMEMALLOC: UInt = 113u

public val OLEUI_ERR_LPFNHOOKINVALID: UInt = 106u

public val OLEUI_ERR_LPSZCAPTIONINVALID: UInt = 105u

public val OLEUI_ERR_LPSZTEMPLATEINVALID: UInt = 108u

public val OLEUI_ERR_OLEMEMALLOC: UInt = 100u

public val OLEUI_ERR_STANDARDMAX: UInt = 116u

public val OLEUI_ERR_STANDARDMIN: UInt = 100u

public val OLEUI_ERR_STRUCTUREINVALID: UInt = 102u

public val OLEUI_ERR_STRUCTURENULL: UInt = 101u

public val OLEUI_FALSE: UInt = 0u

public val OLEUI_GPERR_CBFORMATINVALID: UInt = 130u

public val OLEUI_GPERR_CLASSIDINVALID: UInt = 128u

public val OLEUI_GPERR_LPCLSIDEXCLUDEINVALID: UInt = 129u

public val OLEUI_GPERR_STRINGINVALID: UInt = 127u

public val OLEUI_IOERR_ARRLINKTYPESINVALID: UInt = 118u

public val OLEUI_IOERR_ARRPASTEENTRIESINVALID: UInt = 117u

public val OLEUI_IOERR_CCHFILEINVALID: UInt = 125u

public val OLEUI_IOERR_HICONINVALID: UInt = 118u

public val OLEUI_IOERR_LPCLSIDEXCLUDEINVALID: UInt = 124u

public val OLEUI_IOERR_LPFORMATETCINVALID: UInt = 119u

public val OLEUI_IOERR_LPIOLECLIENTSITEINVALID: UInt = 121u

public val OLEUI_IOERR_LPISTORAGEINVALID: UInt = 122u

public val OLEUI_IOERR_LPSZFILEINVALID: UInt = 116u

public val OLEUI_IOERR_LPSZLABELINVALID: UInt = 117u

public val OLEUI_IOERR_PPVOBJINVALID: UInt = 120u

public val OLEUI_IOERR_SCODEHASERROR: UInt = 123u

public val OLEUI_IOERR_SRCDATAOBJECTINVALID: UInt = 116u

public val OLEUI_LPERR_LINKCNTRINVALID: UInt = 134u

public val OLEUI_LPERR_LINKCNTRNULL: UInt = 133u

public val OLEUI_OK: UInt = 1u

public val OLEUI_OPERR_DLGPROCNOTNULL: UInt = 125u

public val OLEUI_OPERR_INVALIDPAGES: UInt = 123u

public val OLEUI_OPERR_LINKINFOINVALID: UInt = 137u

public val OLEUI_OPERR_LPARAMNOTZERO: UInt = 126u

public val OLEUI_OPERR_NOTSUPPORTED: UInt = 124u

public val OLEUI_OPERR_OBJINFOINVALID: UInt = 136u

public val OLEUI_OPERR_PAGESINCORRECT: UInt = 122u

public val OLEUI_OPERR_PROPERTYSHEET: UInt = 135u

public val OLEUI_OPERR_PROPSHEETINVALID: UInt = 119u

public val OLEUI_OPERR_PROPSHEETNULL: UInt = 118u

public val OLEUI_OPERR_PROPSINVALID: UInt = 121u

public val OLEUI_OPERR_SUBPROPINVALID: UInt = 117u

public val OLEUI_OPERR_SUBPROPNULL: UInt = 116u

public val OLEUI_OPERR_SUPPROP: UInt = 120u

public val OLEUI_PSERR_CLIPBOARDCHANGED: UInt = 119u

public val OLEUI_PSERR_GETCLIPBOARDFAILED: UInt = 120u

public val OLEUI_QUERY_GETCLASSID: UInt = 65280u

public val OLEUI_QUERY_LINKBROKEN: UInt = 65281u

public val OLEUI_SUCCESS: UInt = 1u

public val OLEUI_VPERR_DVASPECTINVALID: UInt = 132u

public val OLEUI_VPERR_METAPICTINVALID: UInt = 131u

public val OLEUPDATE_ALWAYS: Oleupdate = 1

public val OLEUPDATE_ONCALL: Oleupdate = 3

public val OLEVERBATTRIB_NEVERDIRTIES: Oleverbattrib = 1

public val OLEVERBATTRIB_ONCONTAINERMENU: Oleverbattrib = 2

public val OLEVERB_PRIMARY: UInt = 0u

public val OLEWHICHMK_CONTAINER: Olewhichmk = 1

public val OLEWHICHMK_OBJFULL: Olewhichmk = 3

public val OLEWHICHMK_OBJREL: Olewhichmk = 2

public val OPF_DISABLECONVERT: ObjectPropertiesFlags = 8u

public val OPF_NOFILLDEFAULT: ObjectPropertiesFlags = 2u

public val OPF_OBJECTISLINK: ObjectPropertiesFlags = 1u

public val OPF_SHOWHELP: ObjectPropertiesFlags = 4u

public val OT_EMBEDDED: Int = 2

public val OT_LINK: Int = 1

public val OT_STATIC: Int = 3

public val PAGEACTION_UI_DEFAULT: PageactionUi = 0

public val PAGEACTION_UI_MODAL: PageactionUi = 1

public val PAGEACTION_UI_MODELESS: PageactionUi = 2

public val PAGEACTION_UI_SILENT: PageactionUi = 3

public val PARAMFLAG_FHASCUSTDATA: Paramflags = 64u.toUShort()

public val PARAMFLAG_FHASDEFAULT: Paramflags = 32u.toUShort()

public val PARAMFLAG_FIN: Paramflags = 1u.toUShort()

public val PARAMFLAG_FLCID: Paramflags = 4u.toUShort()

public val PARAMFLAG_FOPT: Paramflags = 16u.toUShort()

public val PARAMFLAG_FOUT: Paramflags = 2u.toUShort()

public val PARAMFLAG_FRETVAL: Paramflags = 8u.toUShort()

public val PARAMFLAG_NONE: Paramflags = 0u.toUShort()

public val PERPROP_E_FIRST: Int = -2147220992

public val PERPROP_E_LAST: Hresult = 0x8004020Fu.toInt()

public val PERPROP_E_NOPAGEAVAILABLE: Hresult = 0x80040200u.toInt()

public val PERPROP_S_FIRST: Hresult = 0x40200u.toInt()

public val PERPROP_S_LAST: Hresult = 0x4020Fu.toInt()

public val PICTURE_SCALABLE: Pictureattributes = 1

public val PICTURE_TRANSPARENT: Pictureattributes = 2

public val PICTYPE_BITMAP: Pictype = 1

public val PICTYPE_ENHMETAFILE: Pictype = 4

public val PICTYPE_ICON: Pictype = 3

public val PICTYPE_METAFILE: Pictype = 2

public val PICTYPE_NONE: Pictype = 0

public val PICTYPE_UNINITIALIZED: Pictype = (-1).toShort()

public val POINTERINACTIVE_ACTIVATEONDRAG: Pointerinactive = 4

public val POINTERINACTIVE_ACTIVATEONENTRY: Pointerinactive = 1

public val POINTERINACTIVE_DEACTIVATEONLEAVE: Pointerinactive = 2

public val PRINTFLAG_DONTACTUALLYPRINT: Printflag = 16

public val PRINTFLAG_FORCEPROPERTIES: Printflag = 32

public val PRINTFLAG_MAYBOTHERUSER: Printflag = 1

public val PRINTFLAG_PRINTTOFILE: Printflag = 64

public val PRINTFLAG_PROMPTUSER: Printflag = 2

public val PRINTFLAG_RECOMPOSETODEVICE: Printflag = 8

public val PRINTFLAG_USERMAYCHANGEPRINTER: Printflag = 4

public val PROPBAG2_TYPE_DATA: Propbag2Type = 1

public val PROPBAG2_TYPE_MONIKER: Propbag2Type = 6

public val PROPBAG2_TYPE_OBJECT: Propbag2Type = 3

public val PROPBAG2_TYPE_STORAGE: Propbag2Type = 5

public val PROPBAG2_TYPE_STREAM: Propbag2Type = 4

public val PROPBAG2_TYPE_UNDEFINED: Propbag2Type = 0

public val PROPBAG2_TYPE_URL: Propbag2Type = 2

public val PROPPAGESTATUS_CLEAN: Proppagestatus = 4

public val PROPPAGESTATUS_DIRTY: Proppagestatus = 1

public val PROPPAGESTATUS_VALIDATE: Proppagestatus = 2

public val PROP_HWND_CHGICONDLG: Pcwstr = w("HWND_CIDLG")

public val PSF_CHECKDISPLAYASICON: PasteSpecialFlags = 8u

public val PSF_DISABLEDISPLAYASICON: PasteSpecialFlags = 16u

public val PSF_HIDECHANGEICON: PasteSpecialFlags = 32u

public val PSF_NOREFRESHDATAOBJECT: PasteSpecialFlags = 128u

public val PSF_SELECTPASTE: PasteSpecialFlags = 2u

public val PSF_SELECTPASTELINK: PasteSpecialFlags = 4u

public val PSF_SHOWHELP: PasteSpecialFlags = 1u

public val PSF_STAYONCLIPBOARDCHANGE: PasteSpecialFlags = 64u

public val PS_MAXLINKTYPES: UInt = 8u

public val QACONTAINER_AUTOCLIP: Qacontainerflags = 32

public val QACONTAINER_DISPLAYASDEFAULT: Qacontainerflags = 8

public val QACONTAINER_MESSAGEREFLECT: Qacontainerflags = 64

public val QACONTAINER_SHOWGRABHANDLES: Qacontainerflags = 2

public val QACONTAINER_SHOWHATCHING: Qacontainerflags = 1

public val QACONTAINER_SUPPORTSMNEMONICS: Qacontainerflags = 128

public val QACONTAINER_UIDEAD: Qacontainerflags = 16

public val QACONTAINER_USERMODE: Qacontainerflags = 4

public val READYSTATE_COMPLETE: Readystate = 4

public val READYSTATE_INTERACTIVE: Readystate = 3

public val READYSTATE_LOADED: Readystate = 2

public val READYSTATE_LOADING: Readystate = 1

public val READYSTATE_UNINITIALIZED: Readystate = 0

public val REGKIND_DEFAULT: Regkind = 0

public val REGKIND_NONE: Regkind = 2

public val REGKIND_REGISTER: Regkind = 1

public val SELFREG_E_CLASS: Hresult = 0x80040201u.toInt()

public val SELFREG_E_FIRST: Int = -2147220992

public val SELFREG_E_LAST: Hresult = 0x8004020Fu.toInt()

public val SELFREG_E_TYPELIB: Hresult = 0x80040200u.toInt()

public val SELFREG_S_FIRST: Hresult = 0x40200u.toInt()

public val SELFREG_S_LAST: Hresult = 0x4020Fu.toInt()

public val SF_BSTR: SfType = 8

public val SF_DISPATCH: SfType = 9

public val SF_ERROR: SfType = 10

public val SF_HAVEIID: SfType = 32781

public val SF_I1: SfType = 16

public val SF_I2: SfType = 2

public val SF_I4: SfType = 3

public val SF_I8: SfType = 20

public val SF_RECORD: SfType = 36

public val SF_UNKNOWN: SfType = 13

public val SF_VARIANT: SfType = 12

public val STDOLE2_LCID: UInt = 0u

public val STDOLE2_MAJORVERNUM: UInt = 2u

public val STDOLE2_MINORVERNUM: UInt = 0u

public val STDOLE_LCID: UInt = 0u

public val STDOLE_MAJORVERNUM: UInt = 1u

public val STDOLE_MINORVERNUM: UInt = 0u

public val STDOLE_TLB: Pcstr = s("stdole2.tlb")

public val STDTYPE_TLB: Pcstr = s("stdole2.tlb")

public val SZOLEUI_MSG_ADDCONTROL: Pcwstr = w("OLEUI_MSG_ADDCONTROL")

public val SZOLEUI_MSG_BROWSE: Pcwstr = w("OLEUI_MSG_BROWSE")

public val SZOLEUI_MSG_BROWSE_OFN: Pcwstr = w("OLEUI_MSG_BROWSE_OFN")

public val SZOLEUI_MSG_CHANGEICON: Pcwstr = w("OLEUI_MSG_CHANGEICON")

public val SZOLEUI_MSG_CHANGESOURCE: Pcwstr = w("OLEUI_MSG_CHANGESOURCE")

public val SZOLEUI_MSG_CLOSEBUSYDIALOG: Pcwstr = w("OLEUI_MSG_CLOSEBUSYDIALOG")

public val SZOLEUI_MSG_CONVERT: Pcwstr = w("OLEUI_MSG_CONVERT")

public val SZOLEUI_MSG_ENDDIALOG: Pcwstr = w("OLEUI_MSG_ENDDIALOG")

public val SZOLEUI_MSG_HELP: Pcwstr = w("OLEUI_MSG_HELP")

public val TIFLAGS_EXTENDDISPATCHONLY: UInt = 1u

public val TYPEFLAG_FAGGREGATABLE: Typeflags = 1024

public val TYPEFLAG_FAPPOBJECT: Typeflags = 1

public val TYPEFLAG_FCANCREATE: Typeflags = 2

public val TYPEFLAG_FCONTROL: Typeflags = 32

public val TYPEFLAG_FDISPATCHABLE: Typeflags = 4096

public val TYPEFLAG_FDUAL: Typeflags = 64

public val TYPEFLAG_FHIDDEN: Typeflags = 16

public val TYPEFLAG_FLICENSED: Typeflags = 4

public val TYPEFLAG_FNONEXTENSIBLE: Typeflags = 128

public val TYPEFLAG_FOLEAUTOMATION: Typeflags = 256

public val TYPEFLAG_FPREDECLID: Typeflags = 8

public val TYPEFLAG_FPROXY: Typeflags = 16384

public val TYPEFLAG_FREPLACEABLE: Typeflags = 2048

public val TYPEFLAG_FRESTRICTED: Typeflags = 512

public val TYPEFLAG_FREVERSEBIND: Typeflags = 8192

public val UAS_BLOCKED: Uasflags = 1

public val UAS_MASK: Uasflags = 3

public val UAS_NOPARENTENABLE: Uasflags = 2

public val UAS_NORMAL: Uasflags = 0

public val UPDFCACHE_ALL: UpdfcacheFlags = 2147483647u

public val UPDFCACHE_ALLBUTNODATACACHE: UpdfcacheFlags = 2147483646u

public val UPDFCACHE_IFBLANK: UpdfcacheFlags = 16u

public val UPDFCACHE_IFBLANKORONSAVECACHE: UpdfcacheFlags = 18u

public val UPDFCACHE_NODATACACHE: UpdfcacheFlags = 1u

public val UPDFCACHE_NORMALCACHE: UpdfcacheFlags = 8u

public val UPDFCACHE_ONLYIFBLANK: UpdfcacheFlags = 2147483648u

public val UPDFCACHE_ONSAVECACHE: UpdfcacheFlags = 2u

public val UPDFCACHE_ONSTOPCACHE: UpdfcacheFlags = 4u

public val USERCLASSTYPE_APPNAME: Userclasstype = 3

public val USERCLASSTYPE_FULL: Userclasstype = 1

public val USERCLASSTYPE_SHORT: Userclasstype = 2

public val VARCMP_EQ: Varcmp = 1u

public val VARCMP_GT: Varcmp = 2u

public val VARCMP_LT: Varcmp = 0u

public val VARCMP_NULL: Varcmp = 3u

public val VARFORMAT_FIRST_DAY_FRIDAY: VarformatFirstDay = 5

public val VARFORMAT_FIRST_DAY_MONDAY: VarformatFirstDay = 1

public val VARFORMAT_FIRST_DAY_SATURDAY: VarformatFirstDay = 6

public val VARFORMAT_FIRST_DAY_SUNDAY: VarformatFirstDay = 7

public val VARFORMAT_FIRST_DAY_SYSTEMDEFAULT: VarformatFirstDay = 0

public val VARFORMAT_FIRST_DAY_THURSDAY: VarformatFirstDay = 4

public val VARFORMAT_FIRST_DAY_TUESDAY: VarformatFirstDay = 2

public val VARFORMAT_FIRST_DAY_WEDNESDAY: VarformatFirstDay = 3

public val VARFORMAT_FIRST_WEEK_CONTAINS_JANUARY_FIRST: VarformatFirstWeek = 1

public val VARFORMAT_FIRST_WEEK_HAS_SEVEN_DAYS: VarformatFirstWeek = 3

public val VARFORMAT_FIRST_WEEK_LARGER_HALF_IN_CURRENT_YEAR: VarformatFirstWeek = 2

public val VARFORMAT_FIRST_WEEK_SYSTEMDEFAULT: VarformatFirstWeek = 0

public val VARFORMAT_GROUP_NOTTHOUSANDS: VarformatGroup = 0

public val VARFORMAT_GROUP_SYSTEMDEFAULT: VarformatGroup = -2

public val VARFORMAT_GROUP_THOUSANDS: VarformatGroup = -1

public val VARFORMAT_LEADING_DIGIT_INCLUDED: VarformatLeadingDigit = -1

public val VARFORMAT_LEADING_DIGIT_NOTINCLUDED: VarformatLeadingDigit = 0

public val VARFORMAT_LEADING_DIGIT_SYSTEMDEFAULT: VarformatLeadingDigit = -2

public val VARFORMAT_NAMED_FORMAT_GENERALDATE: VarformatNamedFormat = 0

public val VARFORMAT_NAMED_FORMAT_LONGDATE: VarformatNamedFormat = 1

public val VARFORMAT_NAMED_FORMAT_LONGTIME: VarformatNamedFormat = 3

public val VARFORMAT_NAMED_FORMAT_SHORTDATE: VarformatNamedFormat = 2

public val VARFORMAT_NAMED_FORMAT_SHORTTIME: VarformatNamedFormat = 4

public val VARFORMAT_PARENTHESES_NOTUSED: VarformatParentheses = 0

public val VARFORMAT_PARENTHESES_SYSTEMDEFAULT: VarformatParentheses = -2

public val VARFORMAT_PARENTHESES_USED: VarformatParentheses = -1

public val VAR_CALENDAR_GREGORIAN: UInt = 256u

public val VAR_CALENDAR_HIJRI: UInt = 8u

public val VAR_CALENDAR_THAI: UInt = 128u

public val VAR_DATEVALUEONLY: UInt = 2u

public val VAR_FORMAT_NOSUBSTITUTE: UInt = 32u

public val VAR_FOURDIGITYEARS: UInt = 64u

public val VAR_LOCALBOOL: UInt = 16u

public val VAR_TIMEVALUEONLY: UInt = 1u

public val VAR_VALIDDATE: UInt = 4u

public val VIEWSTATUS_3DSURFACE: Viewstatus = 32

public val VIEWSTATUS_DVASPECTOPAQUE: Viewstatus = 4

public val VIEWSTATUS_DVASPECTTRANSPARENT: Viewstatus = 8

public val VIEWSTATUS_OPAQUE: Viewstatus = 1

public val VIEWSTATUS_SOLIDBKGND: Viewstatus = 2

public val VIEWSTATUS_SURFACE: Viewstatus = 16

public val VPF_DISABLERELATIVE: ViewObjectPropertiesFlags = 2u

public val VPF_DISABLESCALE: ViewObjectPropertiesFlags = 4u

public val VPF_SELECTRELATIVE: ViewObjectPropertiesFlags = 1u

public val VTDATEGRE_MAX: UInt = 2958465u

public val VTDATEGRE_MIN: Int = -657434

public val VT_BLOB_PROPSET: UInt = 75u

public val VT_STORED_PROPSET: UInt = 74u

public val VT_STREAMED_PROPSET: UInt = 73u

public val VT_VERBOSE_ENUM: UInt = 76u

public val WIN32: UInt = 100u

public val WPCSETTING_FILEDOWNLOAD_BLOCKED: Wpcsetting = 2

public val WPCSETTING_LOGGING_ENABLED: Wpcsetting = 1

public val XFORMCOORDS_CONTAINERTOHIMETRIC: Xformcoords = 8

public val XFORMCOORDS_EVENTCOMPAT: Xformcoords = 16

public val XFORMCOORDS_HIMETRICTOCONTAINER: Xformcoords = 4

public val XFORMCOORDS_POSITION: Xformcoords = 1

public val XFORMCOORDS_SIZE: Xformcoords = 2

public val FDEX_ENUM_ALL: Int = 2

public val FDEX_ENUM_DEFAULT: Int = 1

public val FDEX_NAME_CASE_INSENSITIVE: Int = 8

public val FDEX_NAME_CASE_SENSITIVE: Int = 1

public val FDEX_NAME_ENSURE: Int = 2

public val FDEX_NAME_IMPLICIT: Int = 4

public val FDEX_NAME_INTERNAL: Int = 16

public val FDEX_NAME_NO_DYNAMIC_PROPERTIES: Int = 32

public val FDEX_PROP_CAN_CALL: FdexPropFlags = 256u

public val FDEX_PROP_CAN_CONSTRUCT: FdexPropFlags = 1024u

public val FDEX_PROP_CAN_GET: FdexPropFlags = 1u

public val FDEX_PROP_CAN_PUT: FdexPropFlags = 4u

public val FDEX_PROP_CAN_PUT_REF: FdexPropFlags = 16u

public val FDEX_PROP_CAN_SOURCE_EVENTS: FdexPropFlags = 4096u

public val FDEX_PROP_CANNOT_CALL: FdexPropFlags = 512u

public val FDEX_PROP_CANNOT_CONSTRUCT: FdexPropFlags = 2048u

public val FDEX_PROP_CANNOT_GET: FdexPropFlags = 2u

public val FDEX_PROP_CANNOT_PUT: FdexPropFlags = 8u

public val FDEX_PROP_CANNOT_PUT_REF: FdexPropFlags = 32u

public val FDEX_PROP_CANNOT_SOURCE_EVENTS: FdexPropFlags = 8192u

public val FDEX_PROP_DYNAMIC_TYPE: FdexPropFlags = 128u

public val FDEX_PROP_NO_SIDE_EFFECTS: FdexPropFlags = 64u

public val TRI_CHECKED: OleTristate = 1

public val TRI_GRAY: OleTristate = 2

public val TRI_UNCHECKED: OleTristate = 0

public val CLSID_C_COLOR_PROP_PAGE: Guid = Guid.fromU128(U128(0xbe352018f9111ceuL, 0x9de300aa004bb851uL))

public val CLSID_C_FONT_PROP_PAGE: Guid = Guid.fromU128(U128(0xbe352008f9111ceuL, 0x9de300aa004bb851uL))

public val CLSID_C_PICTURE_PROP_PAGE: Guid = Guid.fromU128(U128(0xbe352028f9111ceuL, 0x9de300aa004bb851uL))

public val CLSID_CONVERT_VBX: Guid = Guid.fromU128(U128(0xfb8f08220164101buL, 0x84ed08002b2ec713uL))

public val CLSID_PERSIST_PROPSET: Guid = Guid.fromU128(U128(0xfb8f08210164101buL, 0x84ed08002b2ec713uL))

public val CLSID_STD_FONT: Guid = Guid.fromU128(U128(0xbe352038f9111ceuL, 0x9de300aa004bb851uL))

public val CLSID_STD_PICTURE: Guid = Guid.fromU128(U128(0xbe352048f9111ceuL, 0x9de300aa004bb851uL))

public val GUID_CHECKVALUEEXCLUSIVE: Guid = Guid.fromU128(U128(0x6650430cbe0f101auL, 0x8bbb00aa00300cabuL))

public val GUID_COLOR: Guid = Guid.fromU128(U128(0x66504301be0f101auL, 0x8bbb00aa00300cabuL))

public val GUID_FONTBOLD: Guid = Guid.fromU128(U128(0x6650430fbe0f101auL, 0x8bbb00aa00300cabuL))

public val GUID_FONTITALIC: Guid = Guid.fromU128(U128(0x66504310be0f101auL, 0x8bbb00aa00300cabuL))

public val GUID_FONTNAME: Guid = Guid.fromU128(U128(0x6650430dbe0f101auL, 0x8bbb00aa00300cabuL))

public val GUID_FONTSIZE: Guid = Guid.fromU128(U128(0x6650430ebe0f101auL, 0x8bbb00aa00300cabuL))

public val GUID_FONTSTRIKETHROUGH: Guid = Guid.fromU128(U128(0x66504312be0f101auL, 0x8bbb00aa00300cabuL))

public val GUID_FONTUNDERSCORE: Guid = Guid.fromU128(U128(0x66504311be0f101auL, 0x8bbb00aa00300cabuL))

public val GUID_HANDLE: Guid = Guid.fromU128(U128(0x66504313be0f101auL, 0x8bbb00aa00300cabuL))

public val GUID_HIMETRIC: Guid = Guid.fromU128(U128(0x66504300be0f101auL, 0x8bbb00aa00300cabuL))

public val GUID_OPTIONVALUEEXCLUSIVE: Guid = Guid.fromU128(U128(0x6650430bbe0f101auL, 0x8bbb00aa00300cabuL))

public val GUID_TRISTATE: Guid = Guid.fromU128(U128(0x6650430abe0f101auL, 0x8bbb00aa00300cabuL))

public val GUID_XPOS: Guid = Guid.fromU128(U128(0x66504306be0f101auL, 0x8bbb00aa00300cabuL))

public val GUID_XPOSPIXEL: Guid = Guid.fromU128(U128(0x66504302be0f101auL, 0x8bbb00aa00300cabuL))

public val GUID_XSIZE: Guid = Guid.fromU128(U128(0x66504308be0f101auL, 0x8bbb00aa00300cabuL))

public val GUID_XSIZEPIXEL: Guid = Guid.fromU128(U128(0x66504304be0f101auL, 0x8bbb00aa00300cabuL))

public val GUID_YPOS: Guid = Guid.fromU128(U128(0x66504307be0f101auL, 0x8bbb00aa00300cabuL))

public val GUID_YPOSPIXEL: Guid = Guid.fromU128(U128(0x66504303be0f101auL, 0x8bbb00aa00300cabuL))

public val GUID_YSIZE: Guid = Guid.fromU128(U128(0x66504309be0f101auL, 0x8bbb00aa00300cabuL))

public val GUID_YSIZEPIXEL: Guid = Guid.fromU128(U128(0x66504305be0f101auL, 0x8bbb00aa00300cabuL))

public val SID_GET_CALLER: Guid = Guid.fromU128(U128(0x4717cc40bcb911d0uL, 0x933600a0c90dcaa9uL))

public val SID_PROVIDE_RUNTIME_CONTEXT: Guid = Guid.fromU128(U128(0x74a5040cdd0c48f0uL, 0xac85194c3259180auL))

public val SID_VARIANT_CONVERSION: Guid = Guid.fromU128(U128(0x1f101481bccd11d0uL, 0x933600a0c90dcaa9uL))
