package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.internetconnectionwizard

import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.s

public val ICW_ALREADYRUN: UInt = 4u

public val ICW_CHECKSTATUS: UInt = 1u

public val ICW_FULLPRESENT: UInt = 1u

public val ICW_FULL_SMARTSTART: UInt = 2048u

public val ICW_LAUNCHEDFULL: UInt = 256u

public val ICW_LAUNCHEDMANUAL: UInt = 512u

public val ICW_LAUNCHFULL: UInt = 256u

public val ICW_LAUNCHMANUAL: UInt = 512u

public val ICW_MANUALPRESENT: UInt = 2u

public val ICW_MAX_ACCTNAME: UInt = 256u

public val ICW_MAX_EMAILADDR: UInt = 128u

public val ICW_MAX_EMAILNAME: UInt = 64u

public val ICW_MAX_LOGONNAME: UInt = 256u

public val ICW_MAX_PASSWORD: UInt = 256u

public val ICW_MAX_RASNAME: UInt = 256u

public val ICW_MAX_SERVERNAME: UInt = 64u

public val ICW_REGKEYCOMPLETED: Pcstr = s("Completed")

public val ICW_REGPATHSETTINGS: Pcstr = s("Software\\Microsoft\\Internet Connection Wizard")

public val ICW_USEDEFAULTS: UInt = 1u

public val ICW_USE_SHELLNEXT: UInt = 1024u
