package io.github.kotlinmania.windowssys.windows.win32.devices.deviceanddriverinstallation

import io.github.kotlinmania.windowssys.core.PCWSTR
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

public val SZ_KEY_ADDAUTOLOGGER: PCWSTR = w("AddAutoLogger")

public val SZ_KEY_ADDAUTOLOGGERPROVIDER: PCWSTR = w("AddAutoLoggerProvider")

public val SZ_KEY_ADDCHANNEL: PCWSTR = w("AddChannel")

public val SZ_KEY_ADDEVENTPROVIDER: PCWSTR = w("AddEventProvider")

public val SZ_KEY_ADDFILTER: PCWSTR = w("AddFilter")

public val SZ_KEY_ADDIME: PCWSTR = w("AddIme")

public val SZ_KEY_ADDINTERFACE: PCWSTR = w("AddInterface")

public val SZ_KEY_ADDPOWERSETTING: PCWSTR = w("AddPowerSetting")

public val SZ_KEY_ADDPROP: PCWSTR = w("AddProperty")

public val SZ_KEY_ADDREG: PCWSTR = w("AddReg")

public val SZ_KEY_ADDREGNOCLOBBER: PCWSTR = w("AddRegNoClobber")

public val SZ_KEY_ADDSERVICE: PCWSTR = w("AddService")

public val SZ_KEY_ADDTRIGGER: PCWSTR = w("AddTrigger")

public val SZ_KEY_BITREG: PCWSTR = w("BitReg")

public val SZ_KEY_CLEANONLY: PCWSTR = w("CleanOnly")

public val SZ_KEY_COPYFILES: PCWSTR = w("CopyFiles")

public val SZ_KEY_COPYINF: PCWSTR = w("CopyINF")

public val SZ_KEY_DEFAULTOPTION: PCWSTR = w("DefaultOption")

public val SZ_KEY_DEFDESTDIR: PCWSTR = w("DefaultDestDir")

public val SZ_KEY_DELFILES: PCWSTR = w("DelFiles")

public val SZ_KEY_DELIME: PCWSTR = w("DelIme")

public val SZ_KEY_DELPROP: PCWSTR = w("DelProperty")

public val SZ_KEY_DELREG: PCWSTR = w("DelReg")

public val SZ_KEY_DELSERVICE: PCWSTR = w("DelService")

public val SZ_KEY_DESTDIRS: PCWSTR = w("DestinationDirs")

public val SZ_KEY_EXCLUDEID: PCWSTR = w("ExcludeId")

public val SZ_KEY_FAILUREACTIONS: PCWSTR = w("FailureActions")

public val SZ_KEY_FEATURESCORE: PCWSTR = w("FeatureScore")

public val SZ_KEY_FILTERLEVEL: PCWSTR = w("FilterLevel")

public val SZ_KEY_FILTERPOSITION: PCWSTR = w("FilterPosition")

public val SZ_KEY_HARDWARE: PCWSTR = w("Hardware")

public val SZ_KEY_IMPORTCHANNEL: PCWSTR = w("ImportChannel")

public val SZ_KEY_INI2REG: PCWSTR = w("Ini2Reg")

public val SZ_KEY_LAYOUT_FILE: PCWSTR = w("LayoutFile")

public val SZ_KEY_LDIDOEM: PCWSTR = w("LdidOEM")

public val SZ_KEY_LFN_SECTION: PCWSTR = w("VarLDID.LFN")

public val SZ_KEY_LISTOPTIONS: PCWSTR = w("ListOptions")

public val SZ_KEY_LOGCONFIG: PCWSTR = w("LogConfig")

public val SZ_KEY_MODULES: PCWSTR = w("Modules")

public val SZ_KEY_OPTIONDESC: PCWSTR = w("OptionDesc")

public val SZ_KEY_PHASE1: PCWSTR = w("Phase1")

public val SZ_KEY_PROFILEITEMS: PCWSTR = w("ProfileItems")

public val SZ_KEY_REGSVR: PCWSTR = w("RegisterDlls")

public val SZ_KEY_RENFILES: PCWSTR = w("RenFiles")

public val SZ_KEY_SFN_SECTION: PCWSTR = w("VarLDID.SFN")

public val SZ_KEY_SRCDISKFILES: PCWSTR = w("SourceDisksFiles")

public val SZ_KEY_SRCDISKNAMES: PCWSTR = w("SourceDisksNames")

public val SZ_KEY_STRINGS: PCWSTR = w("Strings")

public val SZ_KEY_UNREGSVR: PCWSTR = w("UnregisterDlls")

public val SZ_KEY_UPDATEAUTOLOGGER: PCWSTR = w("UpdateAutoLogger")

public val SZ_KEY_UPDATEINIFIELDS: PCWSTR = w("UpdateIniFields")

public val SZ_KEY_UPDATEINIS: PCWSTR = w("UpdateInis")

public val SZ_KEY_UPGRADEONLY: PCWSTR = w("UpgradeOnly")

public val SetupFileLogChecksum: SetupFileLogInfo = 1

public val SetupFileLogDiskDescription: SetupFileLogInfo = 3

public val SetupFileLogDiskTagfile: SetupFileLogInfo = 2

public val SetupFileLogMax: SetupFileLogInfo = 5

public val SetupFileLogOtherInfo: SetupFileLogInfo = 4

public val SetupFileLogSourceFilename: SetupFileLogInfo = 0

public val fDD_BYTE: DD_FLAGS = 0u

public val fDD_BYTE_AND_WORD: DD_FLAGS = 3u

public val fDD_BusMaster: DD_FLAGS = 4u

public val fDD_DWORD: DD_FLAGS = 2u

public val fDD_NoBusMaster: DD_FLAGS = 0u

public val fDD_TypeA: DD_FLAGS = 8u

public val fDD_TypeB: DD_FLAGS = 16u

public val fDD_TypeF: DD_FLAGS = 24u

public val fDD_TypeStandard: DD_FLAGS = 0u

public val fDD_WORD: DD_FLAGS = 1u

public val fIOD_10_BIT_DECODE: IOD_DESFLAGS = 4u

public val fIOD_12_BIT_DECODE: IOD_DESFLAGS = 8u

public val fIOD_16_BIT_DECODE: IOD_DESFLAGS = 16u

public val fIOD_DECODE: IOD_DESFLAGS = 252u

public val fIOD_IO: IOD_DESFLAGS = 1u

public val fIOD_Memory: IOD_DESFLAGS = 0u

public val fIOD_PASSIVE_DECODE: IOD_DESFLAGS = 64u

public val fIOD_PORT_BAR: IOD_DESFLAGS = 256u

public val fIOD_POSITIVE_DECODE: IOD_DESFLAGS = 32u

public val fIOD_PortType: IOD_DESFLAGS = 1u

public val fIOD_WINDOW_DECODE: IOD_DESFLAGS = 128u

public val fIRQD_Edge: IRQD_FLAGS = 2u

public val fIRQD_Exclusive: IRQD_FLAGS = 0u

public val fIRQD_Level: IRQD_FLAGS = 0u

public val fIRQD_Level_Bit: IRQD_FLAGS = 1u

public val fIRQD_Share: IRQD_FLAGS = 1u

public val fIRQD_Share_Bit: IRQD_FLAGS = 0u

public val fMD_24: MD_FLAGS = 0u

public val fMD_32: MD_FLAGS = 2u

public val fMD_32_24: MD_FLAGS = 2u

public val fMD_Cacheable: MD_FLAGS = 32u

public val fMD_CombinedWrite: MD_FLAGS = 16u

public val fMD_CombinedWriteAllowed: MD_FLAGS = 16u

public val fMD_CombinedWriteDisallowed: MD_FLAGS = 0u

public val fMD_MEMORY_BAR: MD_FLAGS = 128u

public val fMD_MemoryType: MD_FLAGS = 1u

public val fMD_NonCacheable: MD_FLAGS = 0u

public val fMD_Pref: MD_FLAGS = 4u

public val fMD_PrefetchAllowed: MD_FLAGS = 4u

public val fMD_PrefetchDisallowed: MD_FLAGS = 0u

public val fMD_Prefetchable: MD_FLAGS = 4u

public val fMD_RAM: MD_FLAGS = 1u

public val fMD_ROM: MD_FLAGS = 0u

public val fMD_ReadAllowed: MD_FLAGS = 0u

public val fMD_ReadDisallowed: MD_FLAGS = 8u

public val fMD_Readable: MD_FLAGS = 8u

public val fMD_WINDOW_DECODE: MD_FLAGS = 64u

public val fPCD_ATTRIBUTES_PER_WINDOW: PCD_FLAGS = 32768u

public val fPCD_IO1_16: PCD_FLAGS = 65536u

public val fPCD_IO1_SRC_16: PCD_FLAGS = 262144u

public val fPCD_IO1_WS_16: PCD_FLAGS = 524288u

public val fPCD_IO1_ZW_8: PCD_FLAGS = 131072u

public val fPCD_IO2_16: PCD_FLAGS = 1048576u

public val fPCD_IO2_SRC_16: PCD_FLAGS = 4194304u

public val fPCD_IO2_WS_16: PCD_FLAGS = 8388608u

public val fPCD_IO2_ZW_8: PCD_FLAGS = 2097152u

public val fPCD_IO_16: PCD_FLAGS = 1u

public val fPCD_IO_8: PCD_FLAGS = 0u

public val fPCD_IO_SRC_16: PCD_FLAGS = 32u

public val fPCD_IO_WS_16: PCD_FLAGS = 64u

public val fPCD_IO_ZW_8: PCD_FLAGS = 16u

public val fPCD_MEM1_16: PCD_FLAGS = 67108864u

public val fPCD_MEM1_A: PCD_FLAGS = 4u

public val fPCD_MEM1_WS_ONE: PCD_FLAGS = 16777216u

public val fPCD_MEM1_WS_THREE: PCD_FLAGS = 50331648u

public val fPCD_MEM1_WS_TWO: PCD_FLAGS = 33554432u

public val fPCD_MEM2_16: PCD_FLAGS = 1073741824u

public val fPCD_MEM2_A: PCD_FLAGS = 8u

public val fPCD_MEM2_WS_ONE: PCD_FLAGS = 268435456u

public val fPCD_MEM2_WS_THREE: PCD_FLAGS = 805306368u

public val fPCD_MEM2_WS_TWO: PCD_FLAGS = 536870912u

public val fPCD_MEM_16: PCD_FLAGS = 2u

public val fPCD_MEM_8: PCD_FLAGS = 0u

public val fPCD_MEM_A: PCD_FLAGS = 4u

public val fPCD_MEM_WS_ONE: PCD_FLAGS = 256u

public val fPCD_MEM_WS_THREE: PCD_FLAGS = 768u

public val fPCD_MEM_WS_TWO: PCD_FLAGS = 512u

public val fPMF_AUDIO_ENABLE: PMF_FLAGS = 8u

public val mDD_BusMaster: DD_FLAGS = 4u

public val mDD_Type: DD_FLAGS = 24u

public val mDD_Width: DD_FLAGS = 3u

public val mIRQD_Edge_Level: IRQD_FLAGS = 2u

public val mIRQD_Share: IRQD_FLAGS = 1u

public val mMD_32_24: MD_FLAGS = 2u

public val mMD_Cacheable: MD_FLAGS = 32u

public val mMD_CombinedWrite: MD_FLAGS = 16u

public val mMD_MemoryType: MD_FLAGS = 1u

public val mMD_Prefetchable: MD_FLAGS = 4u

public val mMD_Readable: MD_FLAGS = 8u

public val mPCD_IO_8_16: PCD_FLAGS = 1u

public val mPCD_MEM1_WS: PCD_FLAGS = 50331648u

public val mPCD_MEM2_WS: PCD_FLAGS = 805306368u

public val mPCD_MEM_8_16: PCD_FLAGS = 2u

public val mPCD_MEM_A_C: PCD_FLAGS = 12u

public val mPCD_MEM_WS: PCD_FLAGS = 768u

public val mPMF_AUDIO_ENABLE: UInt = 8u
