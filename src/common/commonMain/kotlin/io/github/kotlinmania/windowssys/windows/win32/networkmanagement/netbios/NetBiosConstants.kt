package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netbios

import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.s

public val ALL_TRANSPORTS: Pcstr = s("M\u0000\u0000\u0000")

public val ASYNCH: UInt = 128u

public val CALL_PENDING: UInt = 2u

public val DEREGISTERED: UInt = 5u

public val DUPLICATE: UInt = 6u

public val DUPLICATE_DEREG: UInt = 7u

public val GROUP_NAME: UInt = 128u

public val HANGUP_COMPLETE: UInt = 5u

public val HANGUP_PENDING: UInt = 4u

public val LISTEN_OUTSTANDING: UInt = 1u

public val MAX_LANA: UInt = 254u

public val MS_NBF: Pcstr = s("MNBF")

public val NAME_FLAGS_MASK: UInt = 135u

public val NCBACTION: UInt = 119u

public val NCBADDGRNAME: UInt = 54u

public val NCBADDNAME: UInt = 48u

public val NCBASTAT: UInt = 51u

public val NCBCALL: UInt = 16u

public val NCBCANCEL: UInt = 53u

public val NCBCHAINSEND: UInt = 23u

public val NCBCHAINSENDNA: UInt = 114u

public val NCBDELNAME: UInt = 49u

public val NCBDGRECV: UInt = 33u

public val NCBDGRECVBC: UInt = 35u

public val NCBDGSEND: UInt = 32u

public val NCBDGSENDBC: UInt = 34u

public val NCBENUM: UInt = 55u

public val NCBFINDNAME: UInt = 120u

public val NCBHANGUP: UInt = 18u

public val NCBLANSTALERT: UInt = 115u

public val NCBLISTEN: UInt = 17u

public val NCBNAMSZ: UInt = 16u

public val NCBRECV: UInt = 21u

public val NCBRECVANY: UInt = 22u

public val NCBRESET: UInt = 50u

public val NCBSEND: UInt = 20u

public val NCBSENDNA: UInt = 113u

public val NCBSSTAT: UInt = 52u

public val NCBTRACE: UInt = 121u

public val NCBUNLINK: UInt = 112u

public val NRC_ACTSES: UInt = 15u

public val NRC_BADDR: UInt = 7u

public val NRC_BRIDGE: UInt = 35u

public val NRC_BUFLEN: UInt = 1u

public val NRC_CANCEL: UInt = 38u

public val NRC_CANOCCR: UInt = 36u

public val NRC_CMDCAN: UInt = 11u

public val NRC_CMDTMO: UInt = 5u

public val NRC_DUPENV: UInt = 48u

public val NRC_DUPNAME: UInt = 13u

public val NRC_ENVNOTDEF: UInt = 52u

public val NRC_GOODRET: UInt = 0u

public val NRC_IFBUSY: UInt = 33u

public val NRC_ILLCMD: UInt = 3u

public val NRC_ILLNN: UInt = 19u

public val NRC_INCOMP: UInt = 6u

public val NRC_INUSE: UInt = 22u

public val NRC_INVADDRESS: UInt = 57u

public val NRC_INVDDID: UInt = 59u

public val NRC_LOCKFAIL: UInt = 60u

public val NRC_LOCTFUL: UInt = 17u

public val NRC_MAXAPPS: UInt = 54u

public val NRC_NAMCONF: UInt = 25u

public val NRC_NAMERR: UInt = 23u

public val NRC_NAMTFUL: UInt = 14u

public val NRC_NOCALL: UInt = 20u

public val NRC_NORES: UInt = 9u

public val NRC_NORESOURCES: UInt = 56u

public val NRC_NOSAPS: UInt = 55u

public val NRC_NOWILD: UInt = 21u

public val NRC_OPENERR: UInt = 63u

public val NRC_OSRESNOTAV: UInt = 53u

public val NRC_PENDING: UInt = 255u

public val NRC_REMTFUL: UInt = 18u

public val NRC_SABORT: UInt = 24u

public val NRC_SCLOSED: UInt = 10u

public val NRC_SNUMOUT: UInt = 8u

public val NRC_SYSTEM: UInt = 64u

public val NRC_TOOMANY: UInt = 34u

public val REGISTERED: UInt = 4u

public val REGISTERING: UInt = 0u

public val SESSION_ABORTED: UInt = 6u

public val SESSION_ESTABLISHED: UInt = 3u

public val UNIQUE_NAME: UInt = 0u
