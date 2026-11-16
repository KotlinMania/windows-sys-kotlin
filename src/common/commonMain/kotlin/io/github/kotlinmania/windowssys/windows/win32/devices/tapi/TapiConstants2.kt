package io.github.kotlinmania.windowssys.windows.win32.devices.tapi

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid

public val TSPI_LINESETCURRENTLOCATION: UInt = 600u

public val TSPI_LINESETDEFAULTMEDIADETECTION: UInt = 549u

public val TSPI_LINESETDEVCONFIG: UInt = 550u

public val TSPI_LINESETMEDIACONTROL: UInt = 551u

public val TSPI_LINESETMEDIAMODE: UInt = 552u

public val TSPI_LINESETSTATUSMESSAGES: UInt = 553u

public val TSPI_LINESETTERMINAL: UInt = 554u

public val TSPI_LINESETUPCONFERENCE: UInt = 555u

public val TSPI_LINESETUPTRANSFER: UInt = 556u

public val TSPI_LINESWAPHOLD: UInt = 557u

public val TSPI_LINEUNCOMPLETECALL: UInt = 558u

public val TSPI_LINEUNHOLD: UInt = 559u

public val TSPI_LINEUNPARK: UInt = 560u

public val TSPI_MESSAGE_BASE: UInt = 500u

public val TSPI_PHONECLOSE: UInt = 561u

public val TSPI_PHONECONFIGDIALOG: UInt = 562u

public val TSPI_PHONEDEVSPECIFIC: UInt = 563u

public val TSPI_PHONEGETBUTTONINFO: UInt = 564u

public val TSPI_PHONEGETDATA: UInt = 565u

public val TSPI_PHONEGETDEVCAPS: UInt = 566u

public val TSPI_PHONEGETDISPLAY: UInt = 567u

public val TSPI_PHONEGETEXTENSIONID: UInt = 568u

public val TSPI_PHONEGETGAIN: UInt = 569u

public val TSPI_PHONEGETHOOKSWITCH: UInt = 570u

public val TSPI_PHONEGETICON: UInt = 571u

public val TSPI_PHONEGETID: UInt = 572u

public val TSPI_PHONEGETLAMP: UInt = 573u

public val TSPI_PHONEGETRING: UInt = 574u

public val TSPI_PHONEGETSTATUS: UInt = 575u

public val TSPI_PHONEGETVOLUME: UInt = 576u

public val TSPI_PHONENEGOTIATEEXTVERSION: UInt = 577u

public val TSPI_PHONENEGOTIATETSPIVERSION: UInt = 578u

public val TSPI_PHONEOPEN: UInt = 579u

public val TSPI_PHONESELECTEXTVERSION: UInt = 580u

public val TSPI_PHONESETBUTTONINFO: UInt = 581u

public val TSPI_PHONESETDATA: UInt = 582u

public val TSPI_PHONESETDISPLAY: UInt = 583u

public val TSPI_PHONESETGAIN: UInt = 584u

public val TSPI_PHONESETHOOKSWITCH: UInt = 585u

public val TSPI_PHONESETLAMP: UInt = 586u

public val TSPI_PHONESETRING: UInt = 587u

public val TSPI_PHONESETSTATUSMESSAGES: UInt = 588u

public val TSPI_PHONESETVOLUME: UInt = 589u

public val TSPI_PROC_BASE: UInt = 500u

public val TSPI_PROVIDERCONFIG: UInt = 590u

public val TSPI_PROVIDERCREATELINEDEVICE: UInt = 598u

public val TSPI_PROVIDERCREATEPHONEDEVICE: UInt = 599u

public val TSPI_PROVIDERENUMDEVICES: UInt = 595u

public val TSPI_PROVIDERINIT: UInt = 591u

public val TSPI_PROVIDERINSTALL: UInt = 592u

public val TSPI_PROVIDERREMOVE: UInt = 593u

public val TSPI_PROVIDERSHUTDOWN: UInt = 594u

public val TS_INUSE: TerminalState = 0

public val TS_NOTINUSE: TerminalState = 1

public val TTM_BEEP: TapiTonemode = 8

public val TTM_BILLING: TapiTonemode = 16

public val TTM_BUSY: TapiTonemode = 4

public val TTM_RINGBACK: TapiTonemode = 2

public val TT_DYNAMIC: TerminalType = 1

public val TT_STATIC: TerminalType = 0

public val TUISPIDLL_OBJECT_DIALOGINSTANCE: Int = 4

public val TUISPIDLL_OBJECT_LINEID: Int = 1

public val TUISPIDLL_OBJECT_PHONEID: Int = 2

public val TUISPIDLL_OBJECT_PROVIDERID: Int = 3

public val ATYP_FILE: Int = 1

public val ATYP_MAX: Int = 4

public val ATYP_NULL: Int = 0

public val ATYP_OLE: Int = 2

public val ATYP_PICTURE: Int = 3

public val CB_DISPLAY_NAME: UInt = 41u

public val CB_EMAIL_NAME: UInt = 11u

public val CB_MAX_ID_DATA: UInt = 200u

public val CB_SEVER_NAME: UInt = 12u

public val CB_TYPE: UInt = 16u

public val PRIO_HIGH: UInt = 1u

public val PRIO_LOW: UInt = 3u

public val PRIO_NORM: UInt = 2u

public val DISPATCH_MAPPER: Guid = Guid.fromU128(U128(0xe9225296c75911d1uL, 0xa02b00c04fb6809fuL))

public val MCAST_ADDRESS_ALLOCATION: Guid = Guid.fromU128(U128(0xdf0daef2a28911d1uL, 0x8697006008b0e5d2uL))

public val RENDEZVOUS: Guid = Guid.fromU128(U128(0xf1029e5bcb5b11d0uL, 0x8d5900c04fd91ac0uL))

public val REQUEST_MAKE_CALL: Guid = Guid.fromU128(U128(0xac48ffe0f8c411d1uL, 0xa03000c04fb6809fuL))

public val TAPI: Guid = Guid.fromU128(U128(0x21d6d48ea88b11d0uL, 0x83dd00aa003ccabduL))
