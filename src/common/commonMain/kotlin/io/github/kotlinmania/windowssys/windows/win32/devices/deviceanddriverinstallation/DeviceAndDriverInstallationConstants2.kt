package io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation

import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.w

public val SRCINFO_DESCRIPTION: UInt = 3u

public val SRCINFO_FLAGS: UInt = 4u

public val SRCINFO_PATH: UInt = 1u

public val SRCINFO_TAGFILE: UInt = 2u

public val SRCINFO_TAGFILE2: UInt = 5u

public val SRCLIST_APPEND: UInt = 512u

public val SRCLIST_NOBROWSE: UInt = 2u

public val SRCLIST_NOSTRIPPLATFORM: UInt = 1024u

public val SRCLIST_SUBDIRS: UInt = 256u

public val SRCLIST_SYSIFADMIN: UInt = 64u

public val SRCLIST_SYSTEM: UInt = 16u

public val SRCLIST_TEMPORARY: UInt = 1u

public val SRCLIST_USER: UInt = 32u

public val SRC_FLAGS_CABFILE: UInt = 16u

public val SUOI_FORCEDELETE: UInt = 1u

public val SUOI_INTERNAL1: UInt = 2u

public val SZ_KEY_ADDAUTOLOGGER: Pcwstr = w("AddAutoLogger")

public val SZ_KEY_ADDAUTOLOGGERPROVIDER: Pcwstr = w("AddAutoLoggerProvider")

public val SZ_KEY_ADDCHANNEL: Pcwstr = w("AddChannel")

public val SZ_KEY_ADDEVENTPROVIDER: Pcwstr = w("AddEventProvider")

public val SZ_KEY_ADDFILTER: Pcwstr = w("AddFilter")

public val SZ_KEY_ADDIME: Pcwstr = w("AddIme")

public val SZ_KEY_ADDINTERFACE: Pcwstr = w("AddInterface")

public val SZ_KEY_ADDPOWERSETTING: Pcwstr = w("AddPowerSetting")

public val SZ_KEY_ADDPROP: Pcwstr = w("AddProperty")

public val SZ_KEY_ADDREG: Pcwstr = w("AddReg")

public val SZ_KEY_ADDREGNOCLOBBER: Pcwstr = w("AddRegNoClobber")

public val SZ_KEY_ADDSERVICE: Pcwstr = w("AddService")

public val SZ_KEY_ADDTRIGGER: Pcwstr = w("AddTrigger")

public val SZ_KEY_BITREG: Pcwstr = w("BitReg")

public val SZ_KEY_CLEANONLY: Pcwstr = w("CleanOnly")

public val SZ_KEY_COPYFILES: Pcwstr = w("CopyFiles")

public val SZ_KEY_COPYINF: Pcwstr = w("CopyINF")

public val SZ_KEY_DEFAULTOPTION: Pcwstr = w("DefaultOption")

public val SZ_KEY_DEFDESTDIR: Pcwstr = w("DefaultDestDir")

public val SZ_KEY_DELFILES: Pcwstr = w("DelFiles")

public val SZ_KEY_DELIME: Pcwstr = w("DelIme")

public val SZ_KEY_DELPROP: Pcwstr = w("DelProperty")

public val SZ_KEY_DELREG: Pcwstr = w("DelReg")

public val SZ_KEY_DELSERVICE: Pcwstr = w("DelService")

public val SZ_KEY_DESTDIRS: Pcwstr = w("DestinationDirs")

public val SZ_KEY_EXCLUDEID: Pcwstr = w("ExcludeId")

public val SZ_KEY_FAILUREACTIONS: Pcwstr = w("FailureActions")

public val SZ_KEY_FEATURESCORE: Pcwstr = w("FeatureScore")

public val SZ_KEY_FILTERLEVEL: Pcwstr = w("FilterLevel")

public val SZ_KEY_FILTERPOSITION: Pcwstr = w("FilterPosition")

public val SZ_KEY_HARDWARE: Pcwstr = w("Hardware")

public val SZ_KEY_IMPORTCHANNEL: Pcwstr = w("ImportChannel")

public val SZ_KEY_INI2REG: Pcwstr = w("Ini2Reg")

public val SZ_KEY_LAYOUT_FILE: Pcwstr = w("LayoutFile")

public val SZ_KEY_LDIDOEM: Pcwstr = w("LdidOEM")

public val SZ_KEY_LFN_SECTION: Pcwstr = w("VarLDID.LFN")

public val SZ_KEY_LISTOPTIONS: Pcwstr = w("ListOptions")

public val SZ_KEY_LOGCONFIG: Pcwstr = w("LogConfig")

public val SZ_KEY_MODULES: Pcwstr = w("Modules")

public val SZ_KEY_OPTIONDESC: Pcwstr = w("OptionDesc")

public val SZ_KEY_PHASE1: Pcwstr = w("Phase1")

public val SZ_KEY_PROFILEITEMS: Pcwstr = w("ProfileItems")

public val SZ_KEY_REGSVR: Pcwstr = w("RegisterDlls")

public val SZ_KEY_RENFILES: Pcwstr = w("RenFiles")

public val SZ_KEY_SFN_SECTION: Pcwstr = w("VarLDID.SFN")

public val SZ_KEY_SRCDISKFILES: Pcwstr = w("SourceDisksFiles")

public val SZ_KEY_SRCDISKNAMES: Pcwstr = w("SourceDisksNames")

public val SZ_KEY_STRINGS: Pcwstr = w("Strings")

public val SZ_KEY_UNREGSVR: Pcwstr = w("UnregisterDlls")

public val SZ_KEY_UPDATEAUTOLOGGER: Pcwstr = w("UpdateAutoLogger")

public val SZ_KEY_UPDATEINIFIELDS: Pcwstr = w("UpdateIniFields")

public val SZ_KEY_UPDATEINIS: Pcwstr = w("UpdateInis")

public val SZ_KEY_UPGRADEONLY: Pcwstr = w("UpgradeOnly")

public val SETUP_FILE_LOG_CHECKSUM: SetupFileLogInfo = 1

public val SETUP_FILE_LOG_DISK_DESCRIPTION: SetupFileLogInfo = 3

public val SETUP_FILE_LOG_DISK_TAGFILE: SetupFileLogInfo = 2

public val SETUP_FILE_LOG_MAX: SetupFileLogInfo = 5

public val SETUP_FILE_LOG_OTHER_INFO: SetupFileLogInfo = 4

public val SETUP_FILE_LOG_SOURCE_FILENAME: SetupFileLogInfo = 0

public val F_DD_BYTE: DdFlags = 0u

public val F_DD_BYTE_AND_WORD: DdFlags = 3u

public val F_DD_BUS_MASTER: DdFlags = 4u

public val F_DD_DWORD: DdFlags = 2u

public val F_DD_NO_BUS_MASTER: DdFlags = 0u

public val F_DD_TYPE_A: DdFlags = 8u

public val F_DD_TYPE_B: DdFlags = 16u

public val F_DD_TYPE_F: DdFlags = 24u

public val F_DD_TYPE_STANDARD: DdFlags = 0u

public val F_DD_WORD: DdFlags = 1u

public val F_IOD_10_BIT_DECODE: IodDesflags = 4u

public val F_IOD_12_BIT_DECODE: IodDesflags = 8u

public val F_IOD_16_BIT_DECODE: IodDesflags = 16u

public val F_IOD_DECODE: IodDesflags = 252u

public val F_IOD_IO: IodDesflags = 1u

public val F_IOD_MEMORY: IodDesflags = 0u

public val F_IOD_PASSIVE_DECODE: IodDesflags = 64u

public val F_IOD_PORT_BAR: IodDesflags = 256u

public val F_IOD_POSITIVE_DECODE: IodDesflags = 32u

public val F_IOD_PORT_TYPE: IodDesflags = 1u

public val F_IOD_WINDOW_DECODE: IodDesflags = 128u

public val F_IRQD_EDGE: IrqdFlags = 2u

public val F_IRQD_EXCLUSIVE: IrqdFlags = 0u

public val F_IRQD_LEVEL: IrqdFlags = 0u

public val F_IRQD_LEVEL_BIT: IrqdFlags = 1u

public val F_IRQD_SHARE: IrqdFlags = 1u

public val F_IRQD_SHARE_BIT: IrqdFlags = 0u

public val F_MD_24: MdFlags = 0u

public val F_MD_32: MdFlags = 2u

public val F_MD_32_24: MdFlags = 2u

public val F_MD_CACHEABLE: MdFlags = 32u

public val F_MD_COMBINED_WRITE: MdFlags = 16u

public val F_MD_COMBINED_WRITE_ALLOWED: MdFlags = 16u

public val F_MD_COMBINED_WRITE_DISALLOWED: MdFlags = 0u

public val F_MD_MEMORY_BAR: MdFlags = 128u

public val F_MD_MEMORY_TYPE: MdFlags = 1u

public val F_MD_NON_CACHEABLE: MdFlags = 0u

public val F_MD_PREF: MdFlags = 4u

public val F_MD_PREFETCH_ALLOWED: MdFlags = 4u

public val F_MD_PREFETCH_DISALLOWED: MdFlags = 0u

public val F_MD_PREFETCHABLE: MdFlags = 4u

public val F_MD_RAM: MdFlags = 1u

public val F_MD_ROM: MdFlags = 0u

public val F_MD_READ_ALLOWED: MdFlags = 0u

public val F_MD_READ_DISALLOWED: MdFlags = 8u

public val F_MD_READABLE: MdFlags = 8u

public val F_MD_WINDOW_DECODE: MdFlags = 64u

public val F_PCD_ATTRIBUTES_PER_WINDOW: PcdFlags = 32768u

public val F_PCD_IO1_16: PcdFlags = 65536u

public val F_PCD_IO1_SRC_16: PcdFlags = 262144u

public val F_PCD_IO1_WS_16: PcdFlags = 524288u

public val F_PCD_IO1_ZW_8: PcdFlags = 131072u

public val F_PCD_IO2_16: PcdFlags = 1048576u

public val F_PCD_IO2_SRC_16: PcdFlags = 4194304u

public val F_PCD_IO2_WS_16: PcdFlags = 8388608u

public val F_PCD_IO2_ZW_8: PcdFlags = 2097152u

public val F_PCD_IO_16: PcdFlags = 1u

public val F_PCD_IO_8: PcdFlags = 0u

public val F_PCD_IO_SRC_16: PcdFlags = 32u

public val F_PCD_IO_WS_16: PcdFlags = 64u

public val F_PCD_IO_ZW_8: PcdFlags = 16u

public val F_PCD_MEM1_16: PcdFlags = 67108864u

public val F_PCD_MEM1_A: PcdFlags = 4u

public val F_PCD_MEM1_WS_ONE: PcdFlags = 16777216u

public val F_PCD_MEM1_WS_THREE: PcdFlags = 50331648u

public val F_PCD_MEM1_WS_TWO: PcdFlags = 33554432u

public val F_PCD_MEM2_16: PcdFlags = 1073741824u

public val F_PCD_MEM2_A: PcdFlags = 8u

public val F_PCD_MEM2_WS_ONE: PcdFlags = 268435456u

public val F_PCD_MEM2_WS_THREE: PcdFlags = 805306368u

public val F_PCD_MEM2_WS_TWO: PcdFlags = 536870912u

public val F_PCD_MEM_16: PcdFlags = 2u

public val F_PCD_MEM_8: PcdFlags = 0u

public val F_PCD_MEM_A: PcdFlags = 4u

public val F_PCD_MEM_WS_ONE: PcdFlags = 256u

public val F_PCD_MEM_WS_THREE: PcdFlags = 768u

public val F_PCD_MEM_WS_TWO: PcdFlags = 512u

public val F_PMF_AUDIO_ENABLE: PmfFlags = 8u

public val M_DD_BUS_MASTER: DdFlags = 4u

public val M_DD_TYPE: DdFlags = 24u

public val M_DD_WIDTH: DdFlags = 3u

public val M_IRQD_EDGE_LEVEL: IrqdFlags = 2u

public val M_IRQD_SHARE: IrqdFlags = 1u

public val M_MD_32_24: MdFlags = 2u

public val M_MD_CACHEABLE: MdFlags = 32u

public val M_MD_COMBINED_WRITE: MdFlags = 16u

public val M_MD_MEMORY_TYPE: MdFlags = 1u

public val M_MD_PREFETCHABLE: MdFlags = 4u

public val M_MD_READABLE: MdFlags = 8u

public val M_PCD_IO_8_16: PcdFlags = 1u

public val M_PCD_MEM1_WS: PcdFlags = 50331648u

public val M_PCD_MEM2_WS: PcdFlags = 805306368u

public val M_PCD_MEM_8_16: PcdFlags = 2u

public val M_PCD_MEM_A_C: PcdFlags = 12u

public val M_PCD_MEM_WS: PcdFlags = 768u

public val M_PMF_AUDIO_ENABLE: UInt = 8u
