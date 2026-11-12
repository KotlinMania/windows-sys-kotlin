package io.github.kotlinmania.windowssys.windows.win32.system.registry

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.w

public val AGP_FLAG_NO_1X_RATE: Int = 1

public val AGP_FLAG_NO_2X_RATE: Int = 2

public val AGP_FLAG_NO_4X_RATE: Int = 4

public val AGP_FLAG_NO_8X_RATE: Int = 8

public val AGP_FLAG_NO_FW_ENABLE: Int = 512

public val AGP_FLAG_NO_SBA_ENABLE: Int = 256

public val AGP_FLAG_REVERSE_INITIALIZATION: Int = 128

public val AGP_FLAG_SPECIAL_RESERVE: Int = 1015808

public val AGP_FLAG_SPECIAL_TARGET: Int = 1048575

public val APMMENUSUSPEND_DISABLED: UInt = 0u

public val APMMENUSUSPEND_ENABLED: UInt = 1u

public val APMMENUSUSPEND_NOCHANGE: UInt = 128u

public val APMMENUSUSPEND_UNDOCKED: UInt = 2u

public val APMTIMEOUT_DISABLED: UInt = 0u

public val BIF_RAWDEVICENEEDSDRIVER: UInt = 2u

public val BIF_SHOWSIMILARDRIVERS: UInt = 1u

public val CSCONFIGFLAG_BITS: UInt = 7u

public val CSCONFIGFLAG_DISABLED: UInt = 1u

public val CSCONFIGFLAG_DO_NOT_CREATE: UInt = 2u

public val CSCONFIGFLAG_DO_NOT_START: UInt = 4u

public val DMSTATEFLAG_APPLYTOALL: UInt = 1u

public val DOSOPTF_ALWAYSUSE: Int = 4

public val DOSOPTF_DEFAULT: Int = 1

public val DOSOPTF_INDOSSTART: Int = 64

public val DOSOPTF_MULTIPLE: Int = 128

public val DOSOPTF_NEEDSETUP: Int = 32

public val DOSOPTF_PROVIDESUMB: Int = 16

public val DOSOPTF_SUPPORTED: Int = 2

public val DOSOPTF_USESPMODE: Int = 8

public val DOSOPTGF_DEFCLEAN: Int = 1

public val DRIVERSIGN_BLOCKING: UInt = 2u

public val DRIVERSIGN_NONE: UInt = 0u

public val DRIVERSIGN_WARNING: UInt = 1u

public val DTRESULTFIX: UInt = 1u

public val DTRESULTOK: UInt = 0u

public val DTRESULTPART: UInt = 3u

public val DTRESULTPROB: UInt = 2u

public val EISAFLAG_NO_IO_MERGE: UInt = 1u

public val EISAFLAG_SLOT_IO_FIRST: UInt = 2u

public val EISA_NO_MAX_FUNCTION: UInt = 255u

public val HKEY_CLASSES_ROOT: Hkey = MutPtr((-2147483648.toInt()).toLong())

public val HKEY_CURRENT_CONFIG: Hkey = MutPtr((-2147483643).toLong())

public val HKEY_CURRENT_USER: Hkey = MutPtr((-2147483647).toLong())

public val HKEY_CURRENT_USER_LOCAL_SETTINGS: Hkey = MutPtr((-2147483641).toLong())

public val HKEY_DYN_DATA: Hkey = MutPtr((-2147483642).toLong())

public val HKEY_LOCAL_MACHINE: Hkey = MutPtr((-2147483646).toLong())

public val HKEY_PERFORMANCE_DATA: Hkey = MutPtr((-2147483644).toLong())

public val HKEY_PERFORMANCE_NLSTEXT: Hkey = MutPtr((-2147483552).toLong())

public val HKEY_PERFORMANCE_TEXT: Hkey = MutPtr((-2147483568).toLong())

public val HKEY_USERS: Hkey = MutPtr((-2147483645).toLong())

public val IT_COMPACT: UInt = 0u

public val IT_CUSTOM: UInt = 3u

public val IT_PORTABLE: UInt = 2u

public val IT_TYPICAL: UInt = 1u

public val KEY_ALL_ACCESS: RegSamFlags = 983103u

public val KEY_CREATE_LINK: RegSamFlags = 32u

public val KEY_CREATE_SUB_KEY: RegSamFlags = 4u

public val KEY_ENUMERATE_SUB_KEYS: RegSamFlags = 8u

public val KEY_EXECUTE: RegSamFlags = 131097u

public val KEY_NOTIFY: RegSamFlags = 16u

public val KEY_QUERY_VALUE: RegSamFlags = 1u

public val KEY_READ: RegSamFlags = 131097u

public val KEY_SET_VALUE: RegSamFlags = 2u

public val KEY_WOW64_32KEY: RegSamFlags = 512u

public val KEY_WOW64_64KEY: RegSamFlags = 256u

public val KEY_WOW64_RES: RegSamFlags = 768u

public val KEY_WRITE: RegSamFlags = 131078u

public val LASTGOOD_OPERATION: UInt = 255u

public val LASTGOOD_OPERATION_DELETE: UInt = 1u

public val LASTGOOD_OPERATION_NOPOSTPROC: UInt = 0u

public val MF_FLAGS_CREATE_BUT_NO_SHOW_DISABLED: UInt = 8u

public val MF_FLAGS_EVEN_IF_NO_RESOURCE: UInt = 1u

public val MF_FLAGS_FILL_IN_UNKNOWN_RESOURCE: UInt = 4u

public val MF_FLAGS_NO_CREATE_IF_NO_RESOURCE: UInt = 2u

public val NUM_EISA_RANGES: UInt = 4u

public val NUM_RESOURCE_MAP: UInt = 256u

public val PCIC_DEFAULT_IRQMASK: UInt = 20152u

public val PCIC_DEFAULT_NUMSOCKETS: UInt = 0u

public val PCI_OPTIONS_USE_BIOS: Int = 1

public val PCI_OPTIONS_USE_IRQ_STEERING: Int = 2

public val PCMCIA_DEF_MEMBEGIN: UInt = 786432u

public val PCMCIA_DEF_MEMEND: UInt = 16777215u

public val PCMCIA_DEF_MEMLEN: UInt = 4096u

public val PCMCIA_DEF_MIN_REGION: UInt = 65536u

public val PCMCIA_OPT_AUTOMEM: Int = 4

public val PCMCIA_OPT_HAVE_SOCKET: Int = 1

public val PCMCIA_OPT_NO_APMREMOVE: Int = 32

public val PCMCIA_OPT_NO_AUDIO: Int = 16

public val PCMCIA_OPT_NO_SOUND: Int = 8

public val PIR_OPTION_DEFAULT: UInt = 15u

public val PIR_OPTION_ENABLED: UInt = 1u

public val PIR_OPTION_MSSPEC: UInt = 4u

public val PIR_OPTION_REALMODE: UInt = 8u

public val PIR_OPTION_REGISTRY: UInt = 2u

public val PIR_STATUS_DISABLED: UInt = 2u

public val PIR_STATUS_ENABLED: UInt = 1u

public val PIR_STATUS_ERROR: UInt = 0u

public val PIR_STATUS_MAX: UInt = 3u

public val PIR_STATUS_MINIPORT_COMPATIBLE: UInt = 1u

public val PIR_STATUS_MINIPORT_ERROR: UInt = 4u

public val PIR_STATUS_MINIPORT_INVALID: UInt = 7u

public val PIR_STATUS_MINIPORT_MAX: UInt = 8u

public val PIR_STATUS_MINIPORT_NOKEY: UInt = 5u

public val PIR_STATUS_MINIPORT_NONE: UInt = 3u

public val PIR_STATUS_MINIPORT_NORMAL: UInt = 0u

public val PIR_STATUS_MINIPORT_OVERRIDE: UInt = 2u

public val PIR_STATUS_MINIPORT_SUCCESS: UInt = 6u

public val PIR_STATUS_TABLE_BAD: UInt = 5u

public val PIR_STATUS_TABLE_ERROR: UInt = 4u

public val PIR_STATUS_TABLE_MAX: UInt = 7u

public val PIR_STATUS_TABLE_MSSPEC: UInt = 1u

public val PIR_STATUS_TABLE_NONE: UInt = 3u

public val PIR_STATUS_TABLE_REALMODE: UInt = 2u

public val PIR_STATUS_TABLE_REGISTRY: UInt = 0u

public val PIR_STATUS_TABLE_SUCCESS: UInt = 6u

public val PROVIDER_KEEPS_VALUE_LENGTH: UInt = 1u

public val REGDF_CONFLICTDMA: UInt = 524288u

public val REGDF_CONFLICTIO: UInt = 65536u

public val REGDF_CONFLICTIRQ: UInt = 262144u

public val REGDF_CONFLICTMEM: UInt = 131072u

public val REGDF_GENFORCEDCONFIG: UInt = 32u

public val REGDF_MAPIRQ2TO9: UInt = 1048576u

public val REGDF_NEEDFULLCONFIG: UInt = 16u

public val REGDF_NODETCONFIG: UInt = 32768u

public val REGDF_NOTDETDMA: UInt = 8u

public val REGDF_NOTDETIO: UInt = 1u

public val REGDF_NOTDETIRQ: UInt = 4u

public val REGDF_NOTDETMEM: UInt = 2u

public val REGDF_NOTVERIFIED: UInt = 2147483648u

public val REGSTR_DATA_NETOS_IPX: Pcwstr = w("IPX")

public val REGSTR_DATA_NETOS_NDIS: Pcwstr = w("NDIS")

public val REGSTR_DATA_NETOS_ODI: Pcwstr = w("ODI")

public val REGSTR_DEFAULT_INSTANCE: Pcwstr = w("0000")

public val REGSTR_KEY_ACPIENUM: Pcwstr = w("ACPI")

public val REGSTR_KEY_APM: Pcwstr = w("*PNP0C05")

public val REGSTR_KEY_BIOSENUM: Pcwstr = w("BIOS")

public val REGSTR_KEY_CLASS: Pcwstr = w("Class")

public val REGSTR_KEY_CONFIG: Pcwstr = w("Config")

public val REGSTR_KEY_CONTROL: Pcwstr = w("Control")

public val REGSTR_KEY_CRASHES: Pcwstr = w("Crashes")

public val REGSTR_KEY_CURRENT: Pcwstr = w("Current")

public val REGSTR_KEY_CURRENT_ENV: Pcwstr = w("\\Windows 4.0")

public val REGSTR_KEY_DANGERS: Pcwstr = w("Dangers")

public val REGSTR_KEY_DEFAULT: Pcwstr = w("Default")

public val REGSTR_KEY_DETMODVARS: Pcwstr = w("DetModVars")

public val REGSTR_KEY_DEVICEPARAMETERS: Pcwstr = w("Device Parameters")

public val REGSTR_KEY_DEVICE_PROPERTIES: Pcwstr = w("Properties")

public val REGSTR_KEY_DISPLAY_CLASS: Pcwstr = w("Display")

public val REGSTR_KEY_DOSOPTCDROM: Pcwstr = w("CD-ROM")

public val REGSTR_KEY_DOSOPTMOUSE: Pcwstr = w("MOUSE")

public val REGSTR_KEY_DRIVERPARAMETERS: Pcwstr = w("Driver Parameters")

public val REGSTR_KEY_DRIVERS: Pcwstr = w("\\Drivers")

public val REGSTR_KEY_EBDAUTOEXECBATKEYBOARD: Pcwstr = w("EBDAutoexecBatKeyboard")

public val REGSTR_KEY_EBDAUTOEXECBATLOCAL: Pcwstr = w("EBDAutoexecBatLocale")

public val REGSTR_KEY_EBDCONFIGSYSKEYBOARD: Pcwstr = w("EBDConfigSysKeyboard")

public val REGSTR_KEY_EBDCONFIGSYSLOCAL: Pcwstr = w("EBDConfigSysLocale")

public val REGSTR_KEY_EBDFILESKEYBOARD: Pcwstr = w("EBDFilesKeyboard")

public val REGSTR_KEY_EBDFILESLOCAL: Pcwstr = w("EBDFilesLocale")

public val REGSTR_KEY_EISAENUM: Pcwstr = w("EISA")

public val REGSTR_KEY_ENUM: Pcwstr = w("Enum")

public val REGSTR_KEY_EXPLORER: Pcwstr = w("Explorer")

public val REGSTR_KEY_FILTERS: Pcwstr = w("Filters")

public val REGSTR_KEY_INIUPDATE: Pcwstr = w("IniUpdate")

public val REGSTR_KEY_ISAENUM: Pcwstr = w("ISAPnP")

public val REGSTR_KEY_JOYCURR: Pcwstr = w("CurrentJoystickSettings")

public val REGSTR_KEY_JOYSETTINGS: Pcwstr = w("JoystickSettings")

public val REGSTR_KEY_KEYBOARD_CLASS: Pcwstr = w("Keyboard")

public val REGSTR_KEY_KNOWNDOCKINGSTATES: Pcwstr = w("Hardware Profiles")

public val REGSTR_KEY_LOGCONFIG: Pcwstr = w("LogConfig")

public val REGSTR_KEY_LOGON: Pcwstr = w("\\Logon")

public val REGSTR_KEY_LOWER_FILTER_LEVEL_DEFAULT: Pcwstr = w("*Lower")

public val REGSTR_KEY_MEDIA_CLASS: Pcwstr = w("MEDIA")

public val REGSTR_KEY_MODEM_CLASS: Pcwstr = w("Modem")

public val REGSTR_KEY_MODES: Pcwstr = w("Modes")

public val REGSTR_KEY_MONITOR_CLASS: Pcwstr = w("Monitor")

public val REGSTR_KEY_MOUSE_CLASS: Pcwstr = w("Mouse")

public val REGSTR_KEY_NDISINFO: Pcwstr = w("NDISInfo")

public val REGSTR_KEY_NETWORK: Pcwstr = w("Network")

public val REGSTR_KEY_NETWORKPROVIDER: Pcwstr = w("\\NetworkProvider")

public val REGSTR_KEY_NETWORK_PERSISTENT: Pcwstr = w("\\Persistent")

public val REGSTR_KEY_NETWORK_RECENT: Pcwstr = w("\\Recent")

public val REGSTR_KEY_OVERRIDE: Pcwstr = w("Override")

public val REGSTR_KEY_PCIENUM: Pcwstr = w("PCI")

public val REGSTR_KEY_PCMCIA: Pcwstr = w("PCMCIA\\")

public val REGSTR_KEY_PCMCIAENUM: Pcwstr = w("PCMCIA")

public val REGSTR_KEY_PCMCIA_CLASS: Pcwstr = w("PCMCIA")

public val REGSTR_KEY_PCMTD: Pcwstr = w("MTD-")

public val REGSTR_KEY_PCUNKNOWN: Pcwstr = w("UNKNOWN_MANUFACTURER")

public val REGSTR_KEY_POL_COMPUTERS: Pcwstr = w("Computers")

public val REGSTR_KEY_POL_DEFAULT: Pcwstr = w(".default")

public val REGSTR_KEY_POL_USERGROUPDATA: Pcwstr = w("GroupData\\UserGroups\\Priority")

public val REGSTR_KEY_POL_USERGROUPS: Pcwstr = w("UserGroups")

public val REGSTR_KEY_POL_USERS: Pcwstr = w("Users")

public val REGSTR_KEY_PORTS_CLASS: Pcwstr = w("ports")

public val REGSTR_KEY_PRINTERS: Pcwstr = w("Printers")

public val REGSTR_KEY_PRINT_PROC: Pcwstr = w("\\Print Processors")

public val REGSTR_KEY_ROOTENUM: Pcwstr = w("Root")

public val REGSTR_KEY_RUNHISTORY: Pcwstr = w("RunHistory")

public val REGSTR_KEY_SCSI_CLASS: Pcwstr = w("SCSIAdapter")

public val REGSTR_KEY_SETUP: Pcwstr = w("\\Setup")

public val REGSTR_KEY_SHARES: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion\\Network\\LanMan")

public val REGSTR_KEY_SYSTEM: Pcwstr = w("System")

public val REGSTR_KEY_SYSTEMBOARD: Pcwstr = w("*PNP0C01")

public val REGSTR_KEY_UPPER_FILTER_LEVEL_DEFAULT: Pcwstr = w("*Upper")

public val REGSTR_KEY_USER: Pcwstr = w("User")

public val REGSTR_KEY_VPOWERDENUM: Pcwstr = w("VPOWERD")

public val REGSTR_KEY_WINOLDAPP: Pcwstr = w("WinOldApp")

public val REGSTR_MACHTYPE_ATT_PC: Pcwstr = w("AT&T PC")

public val REGSTR_MACHTYPE_HP_VECTRA: Pcwstr = w("HP Vectra")

public val REGSTR_MACHTYPE_IBMPC: Pcwstr = w("IBM PC")

public val REGSTR_MACHTYPE_IBMPCAT: Pcwstr = w("IBM PC/AT")

public val REGSTR_MACHTYPE_IBMPCCONV: Pcwstr = w("IBM PC Convertible")

public val REGSTR_MACHTYPE_IBMPCJR: Pcwstr = w("IBM PCjr")

public val REGSTR_MACHTYPE_IBMPCXT: Pcwstr = w("IBM PC/XT")

public val REGSTR_MACHTYPE_IBMPCXT_286: Pcwstr = w("IBM PC/XT 286")

public val REGSTR_MACHTYPE_IBMPS1: Pcwstr = w("IBM PS/1")

public val REGSTR_MACHTYPE_IBMPS2_25: Pcwstr = w("IBM PS/2-25")

public val REGSTR_MACHTYPE_IBMPS2_30: Pcwstr = w("IBM PS/2-30")

public val REGSTR_MACHTYPE_IBMPS2_30_286: Pcwstr = w("IBM PS/2-30 286")

public val REGSTR_MACHTYPE_IBMPS2_50: Pcwstr = w("IBM PS/2-50")

public val REGSTR_MACHTYPE_IBMPS2_50Z: Pcwstr = w("IBM PS/2-50Z")

public val REGSTR_MACHTYPE_IBMPS2_55SX: Pcwstr = w("IBM PS/2-55SX")

public val REGSTR_MACHTYPE_IBMPS2_60: Pcwstr = w("IBM PS/2-60")

public val REGSTR_MACHTYPE_IBMPS2_65SX: Pcwstr = w("IBM PS/2-65SX")

public val REGSTR_MACHTYPE_IBMPS2_70: Pcwstr = w("IBM PS/2-70")

public val REGSTR_MACHTYPE_IBMPS2_70_80: Pcwstr = w("IBM PS/2-70/80")

public val REGSTR_MACHTYPE_IBMPS2_80: Pcwstr = w("IBM PS/2-80")

public val REGSTR_MACHTYPE_IBMPS2_90: Pcwstr = w("IBM PS/2-90")

public val REGSTR_MACHTYPE_IBMPS2_P70: Pcwstr = w("IBM PS/2-P70")

public val REGSTR_MACHTYPE_PHOENIX_PCAT: Pcwstr = w("Phoenix PC/AT Compatible")

public val REGSTR_MACHTYPE_UNKNOWN: Pcwstr = w("Unknown")

public val REGSTR_MACHTYPE_ZENITH_PC: Pcwstr = w("Zenith PC")

public val REGSTR_MAX_VALUE_LENGTH: UInt = 256u

public val REGSTR_PATH_ADDRARB: Pcwstr = w("System\\CurrentControlSet\\Services\\Arbitrators\\AddrArb")

public val REGSTR_PATH_AEDEBUG: Pcwstr = w("Software\\Microsoft\\Windows NT\\CurrentVersion\\AeDebug")

public val REGSTR_PATH_APPEARANCE: Pcwstr = w("Control Panel\\Appearance")

public val REGSTR_PATH_APPPATCH: Pcwstr = w("System\\CurrentControlSet\\Control\\SessionManager\\AppPatches")

public val REGSTR_PATH_APPPATHS: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion\\App Paths")

public val REGSTR_PATH_BIOSINFO: Pcwstr = w("System\\CurrentControlSet\\Control\\BiosInfo")

public val REGSTR_PATH_BUSINFORMATION: Pcwstr = w("System\\CurrentControlSet\\Control\\PnP\\BusInformation")

public val REGSTR_PATH_CDFS: Pcwstr = w("System\\CurrentControlSet\\Control\\FileSystem\\CDFS")

public val REGSTR_PATH_CHECKBADAPPS: Pcwstr = w("System\\CurrentControlSet\\Control\\SessionManager\\CheckBadApps")

public val REGSTR_PATH_CHECKBADAPPS400: Pcwstr = w("System\\CurrentControlSet\\Control\\SessionManager\\CheckBadApps400")

public val REGSTR_PATH_CHECKDISK: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion\\Applets\\Check Drive")

public val REGSTR_PATH_CHECKDISKSET: Pcwstr = w("Settings")

public val REGSTR_PATH_CHECKDISKUDRVS: Pcwstr = w("NoUnknownDDErrDrvs")

public val REGSTR_PATH_CHECKVERDLLS: Pcwstr = w("System\\CurrentControlSet\\Control\\SessionManager\\CheckVerDLLs")

public val REGSTR_PATH_CHILD_PREFIX: Pcwstr = w("Child")

public val REGSTR_PATH_CHKLASTCHECK: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion\\Applets\\Check Drive\\LastCheck")

public val REGSTR_PATH_CHKLASTSURFAN: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion\\Applets\\Check Drive\\LastSurfaceAnalysis")

public val REGSTR_PATH_CLASS: Pcwstr = w("System\\CurrentControlSet\\Services\\Class")

public val REGSTR_PATH_CLASS_NT: Pcwstr = w("System\\CurrentControlSet\\Control\\Class")

public val REGSTR_PATH_CODEPAGE: Pcwstr = w("System\\CurrentControlSet\\Control\\Nls\\Codepage")

public val REGSTR_PATH_CODEVICEINSTALLERS: Pcwstr = w("System\\CurrentControlSet\\Control\\CoDeviceInstallers")

public val REGSTR_PATH_COLORS: Pcwstr = w("Control Panel\\Colors")

public val REGSTR_PATH_COMPUTRNAME: Pcwstr = w("System\\CurrentControlSet\\Control\\ComputerName\\ComputerName")

public val REGSTR_PATH_CONTROLPANEL: Pcwstr = w("Control Panel")

public val REGSTR_PATH_CONTROLSFOLDER: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion\\Controls Folder")

public val REGSTR_PATH_CRITICALDEVICEDATABASE: Pcwstr = w("System\\CurrentControlSet\\Control\\CriticalDeviceDatabase")

public val REGSTR_PATH_CURRENTCONTROLSET: Pcwstr = w("System\\CurrentControlSet")

public val REGSTR_PATH_CURRENT_CONTROL_SET: Pcwstr = w("System\\CurrentControlSet\\Control")

public val REGSTR_PATH_CURSORS: Pcwstr = w("Control Panel\\Cursors")

public val REGSTR_PATH_CVNETWORK: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion\\Network")

public val REGSTR_PATH_DESKTOP: Pcwstr = w("Control Panel\\Desktop")

public val REGSTR_PATH_DETECT: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion\\Detect")

public val REGSTR_PATH_DEVICEINSTALLER: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion\\Device Installer")

public val REGSTR_PATH_DEVICE_CLASSES: Pcwstr = w("System\\CurrentControlSet\\Control\\DeviceClasses")

public val REGSTR_PATH_DIFX: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion\\DIFX")

public val REGSTR_PATH_DISPLAYSETTINGS: Pcwstr = w("Display\\Settings")

public val REGSTR_PATH_DMAARB: Pcwstr = w("System\\CurrentControlSet\\Services\\Arbitrators\\DMAArb")

public val REGSTR_PATH_DRIVERSIGN: Pcwstr = w("Software\\Microsoft\\Driver Signing")

public val REGSTR_PATH_DRIVERSIGN_POLICY: Pcwstr = w("Software\\Policies\\Microsoft\\Windows NT\\Driver Signing")

public val REGSTR_PATH_ENUM: Pcwstr = w("Enum")

public val REGSTR_PATH_ENVIRONMENTS: Pcwstr = w("System\\CurrentControlSet\\Control\\Print\\Environments")

public val REGSTR_PATH_EVENTLABELS: Pcwstr = w("AppEvents\\EventLabels")

public val REGSTR_PATH_EXPLORER: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion\\Explorer")

public val REGSTR_PATH_FAULT: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion\\Fault")

public val REGSTR_PATH_FILESYSTEM: Pcwstr = w("System\\CurrentControlSet\\Control\\FileSystem")

public val REGSTR_PATH_FILESYSTEM_NOVOLTRACK: Pcwstr = w("System\\CurrentControlSet\\Control\\FileSystem\\NoVolTrack")

public val REGSTR_PATH_FLOATINGPOINTPROCESSOR: Pcwstr = w("HARDWARE\\DESCRIPTION\\System\\FloatingPointProcessor")

public val REGSTR_PATH_FLOATINGPOINTPROCESSOR0: Pcwstr = w("HARDWARE\\DESCRIPTION\\System\\FloatingPointProcessor\\0")

public val REGSTR_PATH_FONTS: Pcwstr = w("Display\\Fonts")

public val REGSTR_PATH_GRPCONV: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion\\GrpConv")

public val REGSTR_PATH_HACKINIFILE: Pcwstr = w("System\\CurrentControlSet\\Control\\SessionManager\\HackIniFiles")

public val REGSTR_PATH_HWPROFILES: Pcwstr = w("System\\CurrentControlSet\\Hardware Profiles")

public val REGSTR_PATH_HWPROFILESCURRENT: Pcwstr = w("System\\CurrentControlSet\\Hardware Profiles\\Current")

public val REGSTR_PATH_ICONS: Pcwstr = w("Control Panel\\Icons")

public val REGSTR_PATH_IDCONFIGDB: Pcwstr = w("System\\CurrentControlSet\\Control\\IDConfigDB")

public val REGSTR_PATH_INSTALLEDFILES: Pcwstr = w("System\\CurrentControlSet\\Control\\InstalledFiles")

public val REGSTR_PATH_IOARB: Pcwstr = w("System\\CurrentControlSet\\Services\\Arbitrators\\IOArb")

public val REGSTR_PATH_IOS: Pcwstr = w("System\\CurrentControlSet\\Services\\VxD\\IOS")

public val REGSTR_PATH_IRQARB: Pcwstr = w("System\\CurrentControlSet\\Services\\Arbitrators\\IRQArb")

public val REGSTR_PATH_KEYBOARD: Pcwstr = w("Control Panel\\Keyboard")

public val REGSTR_PATH_KNOWN16DLLS: Pcwstr = w("System\\CurrentControlSet\\Control\\SessionManager\\Known16DLLs")

public val REGSTR_PATH_KNOWNDLLS: Pcwstr = w("System\\CurrentControlSet\\Control\\SessionManager\\KnownDLLs")

public val REGSTR_PATH_KNOWNVXDS: Pcwstr = w("System\\CurrentControlSet\\Control\\SessionManager\\KnownVxDs")

public val REGSTR_PATH_LASTBACKUP: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\LastBackup")

public val REGSTR_PATH_LASTCHECK: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\LastCheck")

public val REGSTR_PATH_LASTGOOD: Pcwstr = w("System\\LastKnownGoodRecovery\\LastGood")

public val REGSTR_PATH_LASTGOODTMP: Pcwstr = w("System\\LastKnownGoodRecovery\\LastGood.Tmp")

public val REGSTR_PATH_LASTOPTIMIZE: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\LastOptimize")

public val REGSTR_PATH_LOOKSCHEMES: Pcwstr = w("Control Panel\\Appearance\\Schemes")

public val REGSTR_PATH_METRICS: Pcwstr = w("Control Panel\\Desktop\\WindowMetrics")

public val REGSTR_PATH_MONITORS: Pcwstr = w("System\\CurrentControlSet\\Control\\Print\\Monitors")

public val REGSTR_PATH_MOUSE: Pcwstr = w("Control Panel\\Mouse")

public val REGSTR_PATH_MSDOSOPTS: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion\\MS-DOSOptions")

public val REGSTR_PATH_MULTIMEDIA_AUDIO: Pcwstr = w("Software\\Microsoft\\Multimedia\\Audio")

public val REGSTR_PATH_MULTI_FUNCTION: Pcwstr = w("MF")

public val REGSTR_PATH_NCPSERVER: Pcwstr = w("System\\CurrentControlSet\\Services\\NcpServer\\Parameters")

public val REGSTR_PATH_NETEQUIV: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion\\Network\\Equivalent")

public val REGSTR_PATH_NETWORK_USERSETTINGS: Pcwstr = w("Network")

public val REGSTR_PATH_NEWDOSBOX: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion\\MS-DOSSpecialConfig")

public val REGSTR_PATH_NONDRIVERSIGN: Pcwstr = w("Software\\Microsoft\\Non-Driver Signing")

public val REGSTR_PATH_NONDRIVERSIGN_POLICY: Pcwstr = w("Software\\Policies\\Microsoft\\Windows NT\\Non-Driver Signing")

public val REGSTR_PATH_NOSUGGMSDOS: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion\\NoMSDOSWarn")

public val REGSTR_PATH_NT_CURRENTVERSION: Pcwstr = w("Software\\Microsoft\\Windows NT\\CurrentVersion")

public val REGSTR_PATH_NWREDIR: Pcwstr = w("System\\CurrentControlSet\\Services\\VxD\\NWREDIR")

public val REGSTR_PATH_PCIIR: Pcwstr = w("System\\CurrentControlSet\\Control\\Pnp\\PciIrqRouting")

public val REGSTR_PATH_PER_HW_ID_STORAGE: Pcwstr = w("Software\\Microsoft\\Windows NT\\CurrentVersion\\PerHwIdStorage")

public val REGSTR_PATH_PIFCONVERT: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion\\PIFConvert")

public val REGSTR_PATH_POLICIES: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion\\Policies")

public val REGSTR_PATH_PRINT: Pcwstr = w("System\\CurrentControlSet\\Control\\Print")

public val REGSTR_PATH_PRINTERS: Pcwstr = w("System\\CurrentControlSet\\Control\\Print\\Printers")

public val REGSTR_PATH_PROPERTYSYSTEM: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion\\PropertySystem")

public val REGSTR_PATH_PROVIDERS: Pcwstr = w("System\\CurrentControlSet\\Control\\Print\\Providers")

public val REGSTR_PATH_PWDPROVIDER: Pcwstr = w("System\\CurrentControlSet\\Control\\PwdProvider")

public val REGSTR_PATH_REALMODENET: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion\\Network\\Real Mode Net")

public val REGSTR_PATH_REINSTALL: Pcwstr = w("SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Reinstall")

public val REGSTR_PATH_RELIABILITY: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion\\Reliability")

public val REGSTR_PATH_RELIABILITY_POLICY: Pcwstr = w("Software\\Policies\\Microsoft\\Windows NT\\Reliability")

public val REGSTR_PATH_RELIABILITY_POLICY_REPORTSNAPSHOT: Pcwstr = w("ReportSnapshot")

public val REGSTR_PATH_RELIABILITY_POLICY_SHUTDOWNREASONUI: Pcwstr = w("ShutdownReasonUI")

public val REGSTR_PATH_RELIABILITY_POLICY_SNAPSHOT: Pcwstr = w("Snapshot")

public val REGSTR_PATH_ROOT: Pcwstr = w("Enum\\Root")

public val REGSTR_PATH_RUN: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion\\Run")

public val REGSTR_PATH_RUNONCE: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion\\RunOnce")

public val REGSTR_PATH_RUNONCEEX: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion\\RunOnceEx")

public val REGSTR_PATH_RUNSERVICES: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion\\RunServices")

public val REGSTR_PATH_RUNSERVICESONCE: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion\\RunServicesOnce")

public val REGSTR_PATH_SCHEMES: Pcwstr = w("AppEvents\\Schemes")

public val REGSTR_PATH_SCREENSAVE: Pcwstr = w("Control Panel\\Desktop")

public val REGSTR_PATH_SERVICES: Pcwstr = w("System\\CurrentControlSet\\Services")

public val REGSTR_PATH_SETUP: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion")

public val REGSTR_PATH_SHUTDOWN: Pcwstr = w("System\\CurrentControlSet\\Control\\Shutdown")

public val REGSTR_PATH_SOUND: Pcwstr = w("Control Panel\\Sound")

public val REGSTR_PATH_SYSTEMENUM: Pcwstr = w("System\\CurrentControlSet\\Enum")

public val REGSTR_PATH_SYSTRAY: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion\\Applets\\SysTray")

public val REGSTR_PATH_TIMEZONE: Pcwstr = w("System\\CurrentControlSet\\Control\\TimeZoneInformation")

public val REGSTR_PATH_UNINSTALL: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion\\Uninstall")

public val REGSTR_PATH_UPDATE: Pcwstr = w("System\\CurrentControlSet\\Control\\Update")

public val REGSTR_PATH_VCOMM: Pcwstr = w("System\\CurrentControlSet\\Services\\VxD\\VCOMM")

public val REGSTR_PATH_VMM: Pcwstr = w("System\\CurrentControlSet\\Services\\VxD\\VMM")

public val REGSTR_PATH_VMM32FILES: Pcwstr = w("System\\CurrentControlSet\\Control\\VMM32Files")

public val REGSTR_PATH_VNETSUP: Pcwstr = w("System\\CurrentControlSet\\Services\\VxD\\VNETSUP")

public val REGSTR_PATH_VOLUMECACHE: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\VolumeCaches")

public val REGSTR_PATH_VPOWERD: Pcwstr = w("System\\CurrentControlSet\\Services\\VxD\\VPOWERD")

public val REGSTR_PATH_VXD: Pcwstr = w("System\\CurrentControlSet\\Services\\VxD")

public val REGSTR_PATH_WARNVERDLLS: Pcwstr = w("System\\CurrentControlSet\\Control\\SessionManager\\WarnVerDLLs")

public val REGSTR_PATH_WINBOOT: Pcwstr = w("System\\CurrentControlSet\\Control\\WinBoot")

public val REGSTR_PATH_WINDOWSAPPLETS: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion\\Applets")

public val REGSTR_PATH_WINLOGON: Pcwstr = w("Software\\Microsoft\\Windows\\CurrentVersion\\Winlogon")

public val REGSTR_PATH_WMI_SECURITY: Pcwstr = w("System\\CurrentControlSet\\Control\\Wmi\\Security")

public val REGSTR_PCI_DUAL_IDE: Pcwstr = w("PCIDualIDE")

public val REGSTR_PCI_OPTIONS: Pcwstr = w("Options")

public val REGSTR_VALUE_DEFAULTLOC: Pcwstr = w("UseDefaultNetLocation")

public val REGSTR_VALUE_ENABLE: Pcwstr = w("Enable")

public val REGSTR_VALUE_LOWPOWERACTIVE: Pcwstr = w("ScreenSaveLowPowerActive")

public val REGSTR_VALUE_LOWPOWERTIMEOUT: Pcwstr = w("ScreenSaveLowPowerTimeout")

public val REGSTR_VALUE_NETPATH: Pcwstr = w("NetworkPath")

public val REGSTR_VALUE_POWEROFFACTIVE: Pcwstr = w("ScreenSavePowerOffActive")

public val REGSTR_VALUE_POWEROFFTIMEOUT: Pcwstr = w("ScreenSavePowerOffTimeout")

public val REGSTR_VALUE_SCRPASSWORD: Pcwstr = w("ScreenSave_Data")

public val REGSTR_VALUE_USESCRPASSWORD: Pcwstr = w("ScreenSaveUsePassword")

public val REGSTR_VALUE_VERBOSE: Pcwstr = w("Verbose")

public val REGSTR_VAL_ACDRIVESPINDOWN: Pcwstr = w("ACDriveSpinDown")

public val REGSTR_VAL_ACSPINDOWNPREVIOUS: Pcwstr = w("ACSpinDownPrevious")

public val REGSTR_VAL_ACTIVESERVICE: Pcwstr = w("ActiveService")

public val REGSTR_VAL_ADDRESS: Pcwstr = w("Address")

public val REGSTR_VAL_AEDEBUG_AUTO: Pcwstr = w("Auto")

public val REGSTR_VAL_AEDEBUG_DEBUGGER: Pcwstr = w("Debugger")

public val REGSTR_VAL_ALPHANUMPWDS: Pcwstr = w("AlphanumPwds")

public val REGSTR_VAL_APISUPPORT: Pcwstr = w("APISupport")

public val REGSTR_VAL_APMACTIMEOUT: Pcwstr = w("APMACTimeout")

public val REGSTR_VAL_APMBATTIMEOUT: Pcwstr = w("APMBatTimeout")

public val REGSTR_VAL_APMBIOSVER: Pcwstr = w("APMBiosVer")

public val REGSTR_VAL_APMFLAGS: Pcwstr = w("APMFlags")

public val REGSTR_VAL_APMMENUSUSPEND: Pcwstr = w("APMMenuSuspend")

public val REGSTR_VAL_APMSHUTDOWNPOWER: Pcwstr = w("APMShutDownPower")

public val REGSTR_VAL_APPINSTPATH: Pcwstr = w("AppInstallPath")

public val REGSTR_VAL_ASKFORCONFIG: Pcwstr = w("AskForConfig")

public val REGSTR_VAL_ASKFORCONFIGFUNC: Pcwstr = w("AskForConfigFunc")

public val REGSTR_VAL_ASYNCFILECOMMIT: Pcwstr = w("AsyncFileCommit")

public val REGSTR_VAL_AUDIO_BITMAP: Pcwstr = w("bitmap")

public val REGSTR_VAL_AUDIO_ICON: Pcwstr = w("icon")

public val REGSTR_VAL_AUTHENT_AGENT: Pcwstr = w("AuthenticatingAgent")

public val REGSTR_VAL_AUTOEXEC: Pcwstr = w("Autoexec.Bat")

public val REGSTR_VAL_AUTOINSNOTE: Pcwstr = w("AutoInsertNotification")

public val REGSTR_VAL_AUTOLOGON: Pcwstr = w("AutoLogon")

public val REGSTR_VAL_AUTOMOUNT: Pcwstr = w("AutoMountDrives")

public val REGSTR_VAL_AUTOSTART: Pcwstr = w("AutoStart")

public val REGSTR_VAL_BASICPROPERTIES: Pcwstr = w("BasicProperties")

public val REGSTR_VAL_BASICPROPERTIES_32: Pcwstr = w("BasicProperties32")

public val REGSTR_VAL_BATDRIVESPINDOWN: Pcwstr = w("BatDriveSpinDown")

public val REGSTR_VAL_BATSPINDOWNPREVIOUS: Pcwstr = w("BatSpinDownPrevious")

public val REGSTR_VAL_BEHAVIOR_ON_FAILED_VERIFY: Pcwstr = w("BehaviorOnFailedVerify")

public val REGSTR_VAL_BIOSDATE: Pcwstr = w("BIOSDate")

public val REGSTR_VAL_BIOSNAME: Pcwstr = w("BIOSName")

public val REGSTR_VAL_BIOSVERSION: Pcwstr = w("BIOSVersion")

public val REGSTR_VAL_BITSPERPIXEL: Pcwstr = w("BitsPerPixel")

public val REGSTR_VAL_BOOTCONFIG: Pcwstr = w("BootConfig")

public val REGSTR_VAL_BOOTCOUNT: Pcwstr = w("BootCount")

public val REGSTR_VAL_BOOTDIR: Pcwstr = w("BootDir")

public val REGSTR_VAL_BPP: Pcwstr = w("BPP")

public val REGSTR_VAL_BT: Pcwstr = w("6005BT")

public val REGSTR_VAL_BUFFAGETIMEOUT: Pcwstr = w("BufferAgeTimeout")

public val REGSTR_VAL_BUFFIDLETIMEOUT: Pcwstr = w("BufferIdleTimeout")

public val REGSTR_VAL_BUSTYPE: Pcwstr = w("BusType")

public val REGSTR_VAL_CAPABILITIES: Pcwstr = w("Capabilities")

public val REGSTR_VAL_CARDSPECIFIC: Pcwstr = w("CardSpecific")

public val REGSTR_VAL_CDCACHESIZE: Pcwstr = w("CacheSize")

public val REGSTR_VAL_CDCOMPATNAMES: Pcwstr = w("MSCDEXCompatNames")

public val REGSTR_VAL_CDEXTERRORS: Pcwstr = w("ExtendedErrors")

public val REGSTR_VAL_CDNOREADAHEAD: Pcwstr = w("NoReadAhead")

public val REGSTR_VAL_CDPREFETCH: Pcwstr = w("Prefetch")

public val REGSTR_VAL_CDPREFETCHTAIL: Pcwstr = w("PrefetchTail")

public val REGSTR_VAL_CDRAWCACHE: Pcwstr = w("RawCache")

public val REGSTR_VAL_CDROM: Pcwstr = w("GenCD")

public val REGSTR_VAL_CDROMCLASSNAME: Pcwstr = w("CDROM")

public val REGSTR_VAL_CDSHOWVERSIONS: Pcwstr = w("ShowVersions")

public val REGSTR_VAL_CDSVDSENSE: Pcwstr = w("SVDSense")

public val REGSTR_VAL_CHECKSUM: Pcwstr = w("CurrentChecksum")

public val REGSTR_VAL_CLASS: Pcwstr = w("Class")

public val REGSTR_VAL_CLASSDESC: Pcwstr = w("ClassDesc")

public val REGSTR_VAL_CLASSGUID: Pcwstr = w("ClassGUID")

public val REGSTR_VAL_CMDRIVFLAGS: Pcwstr = w("CMDrivFlags")

public val REGSTR_VAL_CMENUMFLAGS: Pcwstr = w("CMEnumFlags")

public val REGSTR_VAL_COINSTALLERS_32: Pcwstr = w("CoInstallers32")

public val REGSTR_VAL_COMINFO: Pcwstr = w("ComInfo")

public val REGSTR_VAL_COMMENT: Pcwstr = w("Comment")

public val REGSTR_VAL_COMPATIBLEIDS: Pcwstr = w("CompatibleIDs")

public val REGSTR_VAL_COMPRESSIONMETHOD: Pcwstr = w("CompressionAlgorithm")

public val REGSTR_VAL_COMPRESSIONTHRESHOLD: Pcwstr = w("CompressionThreshold")

public val REGSTR_VAL_COMPUTERNAME: Pcwstr = w("ComputerName")

public val REGSTR_VAL_COMPUTRNAME: Pcwstr = w("ComputerName")

public val REGSTR_VAL_COMVERIFYBASE: Pcwstr = w("COMVerifyBase")

public val REGSTR_VAL_CONFIG: Pcwstr = w("ConfigPath")

public val REGSTR_VAL_CONFIGFLAGS: Pcwstr = w("ConfigFlags")

public val REGSTR_VAL_CONFIGMG: Pcwstr = w("CONFIGMG")

public val REGSTR_VAL_CONFIGSYS: Pcwstr = w("Config.Sys")

public val REGSTR_VAL_CONNECTION_TYPE: Pcwstr = w("ConnectionType")

public val REGSTR_VAL_CONTAINERID: Pcwstr = w("ContainerID")

public val REGSTR_VAL_CONTIGFILEALLOC: Pcwstr = w("ContigFileAllocSize")

public val REGSTR_VAL_CONVMEM: Pcwstr = w("ConvMem")

public val REGSTR_VAL_CPU: Pcwstr = w("CPU")

public val REGSTR_VAL_CRASHFUNCS: Pcwstr = w("CrashFuncs")

public val REGSTR_VAL_CSCONFIGFLAGS: Pcwstr = w("CSConfigFlags")

public val REGSTR_VAL_CURCONFIG: Pcwstr = w("CurrentConfig")

public val REGSTR_VAL_CURDRVLET: Pcwstr = w("CurrentDriveLetterAssignment")

public val REGSTR_VAL_CURRENTCONFIG: Pcwstr = w("CurrentConfig")

public val REGSTR_VAL_CURRENT_BUILD: Pcwstr = w("CurrentBuildNumber")

public val REGSTR_VAL_CURRENT_CSDVERSION: Pcwstr = w("CSDVersion")

public val REGSTR_VAL_CURRENT_TYPE: Pcwstr = w("CurrentType")

public val REGSTR_VAL_CURRENT_USER: Pcwstr = w("Current User")

public val REGSTR_VAL_CURRENT_VERSION: Pcwstr = w("CurrentVersion")

public val REGSTR_VAL_CUSTOMCOLORS: Pcwstr = w("CustomColors")

public val REGSTR_VAL_CUSTOM_PROPERTY_CACHE_DATE: Pcwstr = w("CustomPropertyCacheDate")

public val REGSTR_VAL_CUSTOM_PROPERTY_HW_ID_KEY: Pcwstr = w("CustomPropertyHwIdKey")

public val REGSTR_VAL_DEFAULT: Pcwstr = w("Default")

public val REGSTR_VAL_DETCONFIG: Pcwstr = w("DetConfig")

public val REGSTR_VAL_DETECT: Pcwstr = w("Detect")

public val REGSTR_VAL_DETECTFUNC: Pcwstr = w("DetectFunc")

public val REGSTR_VAL_DETFLAGS: Pcwstr = w("DetFlags")

public val REGSTR_VAL_DETFUNC: Pcwstr = w("DetFunc")

public val REGSTR_VAL_DEVDESC: Pcwstr = w("DeviceDesc")

public val REGSTR_VAL_DEVICEDRIVER: Pcwstr = w("DeviceDriver")

public val REGSTR_VAL_DEVICEPATH: Pcwstr = w("DevicePath")

public val REGSTR_VAL_DEVICE_CHARACTERISTICS: Pcwstr = w("DeviceCharacteristics")

public val REGSTR_VAL_DEVICE_EXCLUSIVE: Pcwstr = w("Exclusive")

public val REGSTR_VAL_DEVICE_INSTANCE: Pcwstr = w("DeviceInstance")

public val REGSTR_VAL_DEVICE_SECURITY_DESCRIPTOR: Pcwstr = w("Security")

public val REGSTR_VAL_DEVICE_TYPE: Pcwstr = w("DeviceType")

public val REGSTR_VAL_DEVLOADER: Pcwstr = w("DevLoader")

public val REGSTR_VAL_DEVTYPE: Pcwstr = w("DeviceType")

public val REGSTR_VAL_DIRECTHOST: Pcwstr = w("DirectHost")

public val REGSTR_VAL_DIRTYSHUTDOWN: Pcwstr = w("DirtyShutdown")

public val REGSTR_VAL_DIRTYSHUTDOWNTIME: Pcwstr = w("DirtyShutdownTime")

public val REGSTR_VAL_DISABLECOUNT: Pcwstr = w("DisableCount")

public val REGSTR_VAL_DISABLEPWDCACHING: Pcwstr = w("DisablePwdCaching")

public val REGSTR_VAL_DISABLEREGTOOLS: Pcwstr = w("DisableRegistryTools")

public val REGSTR_VAL_DISCONNECT: Pcwstr = w("Disconnect")

public val REGSTR_VAL_DISK: Pcwstr = w("GenDisk")

public val REGSTR_VAL_DISKCLASSNAME: Pcwstr = w("DiskDrive")

public val REGSTR_VAL_DISPCPL_NOAPPEARANCEPAGE: Pcwstr = w("NoDispAppearancePage")

public val REGSTR_VAL_DISPCPL_NOBACKGROUNDPAGE: Pcwstr = w("NoDispBackgroundPage")

public val REGSTR_VAL_DISPCPL_NODISPCPL: Pcwstr = w("NoDispCPL")

public val REGSTR_VAL_DISPCPL_NOSCRSAVPAGE: Pcwstr = w("NoDispScrSavPage")

public val REGSTR_VAL_DISPCPL_NOSETTINGSPAGE: Pcwstr = w("NoDispSettingsPage")

public val REGSTR_VAL_DISPLAY: Pcwstr = w("display")

public val REGSTR_VAL_DISPLAYFLAGS: Pcwstr = w("DisplayFlags")

public val REGSTR_VAL_DOCKED: Pcwstr = w("CurrentDockedState")

public val REGSTR_VAL_DOCKSTATE: Pcwstr = w("DockState")

public val REGSTR_VAL_DOES_POLLING: Pcwstr = w("PollingSupportNeeded")

public val REGSTR_VAL_DONTLOADIFCONFLICT: Pcwstr = w("DontLoadIfConflict")

public val REGSTR_VAL_DONTUSEMEM: Pcwstr = w("DontAllocLastMem")

public val REGSTR_VAL_DOSCP: Pcwstr = w("OEMCP")

public val REGSTR_VAL_DOSOPTFLAGS: Pcwstr = w("Flags")

public val REGSTR_VAL_DOSOPTGLOBALFLAGS: Pcwstr = w("GlobalFlags")

public val REGSTR_VAL_DOSOPTTIP: Pcwstr = w("TipText")

public val REGSTR_VAL_DOSPAGER: Pcwstr = w("DOSPager")

public val REGSTR_VAL_DOS_SPOOL_MASK: Pcwstr = w("DOSSpoolMask")

public val REGSTR_VAL_DOUBLEBUFFER: Pcwstr = w("DoubleBuffer")

public val REGSTR_VAL_DPI: Pcwstr = w("dpi")

public val REGSTR_VAL_DPILOGICALX: Pcwstr = w("DPILogicalX")

public val REGSTR_VAL_DPILOGICALY: Pcwstr = w("DPILogicalY")

public val REGSTR_VAL_DPIPHYSICALX: Pcwstr = w("DPIPhysicalX")

public val REGSTR_VAL_DPIPHYSICALY: Pcwstr = w("DPIPhysicalY")

public val REGSTR_VAL_DPMS: Pcwstr = w("DPMS")

public val REGSTR_VAL_DRIVER: Pcwstr = w("Driver")

public val REGSTR_VAL_DRIVERCACHEPATH: Pcwstr = w("DriverCachePath")

public val REGSTR_VAL_DRIVERDATE: Pcwstr = w("DriverDate")

public val REGSTR_VAL_DRIVERDATEDATA: Pcwstr = w("DriverDateData")

public val REGSTR_VAL_DRIVERVERSION: Pcwstr = w("DriverVersion")

public val REGSTR_VAL_DRIVESPINDOWN: Pcwstr = w("DriveSpinDown")

public val REGSTR_VAL_DRIVEWRITEBEHIND: Pcwstr = w("DriveWriteBehind")

public val REGSTR_VAL_DRIVE_SPINDOWN: Pcwstr = w("NoDispSpinDown")

public val REGSTR_VAL_DRV: Pcwstr = w("drv")

public val REGSTR_VAL_DRVDESC: Pcwstr = w("DriverDesc")

public val REGSTR_VAL_DYNAMIC: Pcwstr = w("Dynamic")

public val REGSTR_VAL_EISA_FLAGS: Pcwstr = w("EISAFlags")

public val REGSTR_VAL_EISA_FUNCTIONS: Pcwstr = w("EISAFunctions")

public val REGSTR_VAL_EISA_FUNCTIONS_MASK: Pcwstr = w("EISAFunctionsMask")

public val REGSTR_VAL_EISA_RANGES: Pcwstr = w("EISARanges")

public val REGSTR_VAL_EISA_SIMULATE_INT15: Pcwstr = w("EISASimulateInt15")

public val REGSTR_VAL_EJECT_PRIORITY: Pcwstr = w("EjectPriority")

public val REGSTR_VAL_ENABLEINTS: Pcwstr = w("EnableInts")

public val REGSTR_VAL_ENUMERATOR: Pcwstr = w("Enumerator")

public val REGSTR_VAL_ENUMPROPPAGES: Pcwstr = w("EnumPropPages")

public val REGSTR_VAL_ENUMPROPPAGES_32: Pcwstr = w("EnumPropPages32")

public val REGSTR_VAL_ESDI: Pcwstr = w("ESDI\\")

public val REGSTR_VAL_EXISTS: Pcwstr = w("Exists")

public val REGSTR_VAL_EXTMEM: Pcwstr = w("ExtMem")

public val REGSTR_VAL_FAULT_LOGFILE: Pcwstr = w("LogFile")

public val REGSTR_VAL_FIFODEPTH: Pcwstr = w("FIFODepth")

public val REGSTR_VAL_FILESHARING: Pcwstr = w("FileSharing")

public val REGSTR_VAL_FIRSTINSTALLDATETIME: Pcwstr = w("FirstInstallDateTime")

public val REGSTR_VAL_FIRSTNETDRIVE: Pcwstr = w("FirstNetworkDrive")

public val REGSTR_VAL_FLOP: Pcwstr = w("FLOP\\")

public val REGSTR_VAL_FLOPPY: Pcwstr = w("FLOPPY")

public val REGSTR_VAL_FONTSIZE: Pcwstr = w("FontSize")

public val REGSTR_VAL_FORCECL: Pcwstr = w("ForceChangeLine")

public val REGSTR_VAL_FORCEDCONFIG: Pcwstr = w("ForcedConfig")

public val REGSTR_VAL_FORCEFIFO: Pcwstr = w("ForceFIFO")

public val REGSTR_VAL_FORCELOAD: Pcwstr = w("ForceLoadPD")

public val REGSTR_VAL_FORCEPMIO: Pcwstr = w("ForcePMIO")

public val REGSTR_VAL_FORCEREBOOT: Pcwstr = w("ForceReboot")

public val REGSTR_VAL_FORCERMIO: Pcwstr = w("ForceRMIO")

public val REGSTR_VAL_FREESPACERATIO: Pcwstr = w("FreeSpaceRatio")

public val REGSTR_VAL_FRIENDLYNAME: Pcwstr = w("FriendlyName")

public val REGSTR_VAL_FSFILTERCLASS: Pcwstr = w("FSFilterClass")

public val REGSTR_VAL_FULLTRACE: Pcwstr = w("FullTrace")

public val REGSTR_VAL_FUNCDESC: Pcwstr = w("FunctionDesc")

public val REGSTR_VAL_GAPTIME: Pcwstr = w("GapTime")

public val REGSTR_VAL_GRB: Pcwstr = w("grb")

public val REGSTR_VAL_HARDWAREID: Pcwstr = w("HardwareID")

public val REGSTR_VAL_HIDESHAREPWDS: Pcwstr = w("HideSharePwds")

public val REGSTR_VAL_HRES: Pcwstr = w("HRes")

public val REGSTR_VAL_HWDETECT: Pcwstr = w("HardwareDetect")

public val REGSTR_VAL_HWMECHANISM: Pcwstr = w("HWMechanism")

public val REGSTR_VAL_HWREV: Pcwstr = w("HWRevision")

public val REGSTR_VAL_ID: Pcwstr = w("CurrentID")

public val REGSTR_VAL_IDE_FORCE_SERIALIZE: Pcwstr = w("ForceSerialization")

public val REGSTR_VAL_IDE_NO_SERIALIZE: Pcwstr = w("IDENoSerialize")

public val REGSTR_VAL_INFNAME: Pcwstr = w("InfName")

public val REGSTR_VAL_INFPATH: Pcwstr = w("InfPath")

public val REGSTR_VAL_INFSECTION: Pcwstr = w("InfSection")

public val REGSTR_VAL_INFSECTIONEXT: Pcwstr = w("InfSectionExt")

public val REGSTR_VAL_INHIBITRESULTS: Pcwstr = w("InhibitResults")

public val REGSTR_VAL_INSICON: Pcwstr = w("Icon")

public val REGSTR_VAL_INSTALLER: Pcwstr = w("Installer")

public val REGSTR_VAL_INSTALLER_32: Pcwstr = w("Installer32")

public val REGSTR_VAL_INSTALLTYPE: Pcwstr = w("InstallType")

public val REGSTR_VAL_INT13: Pcwstr = w("Int13")

public val REGSTR_VAL_ISAPNP: Pcwstr = w("ISAPNP")

public val REGSTR_VAL_ISAPNP_RDP_OVERRIDE: Pcwstr = w("RDPOverRide")

public val REGSTR_VAL_JOYCALLOUT: Pcwstr = w("JoystickCallout")

public val REGSTR_VAL_JOYNCONFIG: Pcwstr = w("Joystick%dConfiguration")

public val REGSTR_VAL_JOYNOEMCALLOUT: Pcwstr = w("Joystick%dOEMCallout")

public val REGSTR_VAL_JOYNOEMNAME: Pcwstr = w("Joystick%dOEMName")

public val REGSTR_VAL_JOYOEMCAL1: Pcwstr = w("OEMCal1")

public val REGSTR_VAL_JOYOEMCAL10: Pcwstr = w("OEMCal10")

public val REGSTR_VAL_JOYOEMCAL11: Pcwstr = w("OEMCal11")

public val REGSTR_VAL_JOYOEMCAL12: Pcwstr = w("OEMCal12")

public val REGSTR_VAL_JOYOEMCAL2: Pcwstr = w("OEMCal2")

public val REGSTR_VAL_JOYOEMCAL3: Pcwstr = w("OEMCal3")

public val REGSTR_VAL_JOYOEMCAL4: Pcwstr = w("OEMCal4")

public val REGSTR_VAL_JOYOEMCAL5: Pcwstr = w("OEMCal5")

public val REGSTR_VAL_JOYOEMCAL6: Pcwstr = w("OEMCal6")

public val REGSTR_VAL_JOYOEMCAL7: Pcwstr = w("OEMCal7")

public val REGSTR_VAL_JOYOEMCAL8: Pcwstr = w("OEMCal8")

public val REGSTR_VAL_JOYOEMCAL9: Pcwstr = w("OEMCal9")

public val REGSTR_VAL_JOYOEMCALCAP: Pcwstr = w("OEMCalCap")

public val REGSTR_VAL_JOYOEMCALLOUT: Pcwstr = w("OEMCallout")

public val REGSTR_VAL_JOYOEMCALWINCAP: Pcwstr = w("OEMCalWinCap")

public val REGSTR_VAL_JOYOEMDATA: Pcwstr = w("OEMData")

public val REGSTR_VAL_JOYOEMNAME: Pcwstr = w("OEMName")

public val REGSTR_VAL_JOYOEMPOVLABEL: Pcwstr = w("OEMPOVLabel")

public val REGSTR_VAL_JOYOEMRLABEL: Pcwstr = w("OEMRLabel")

public val REGSTR_VAL_JOYOEMTESTBUTTONCAP: Pcwstr = w("OEMTestButtonCap")

public val REGSTR_VAL_JOYOEMTESTBUTTONDESC: Pcwstr = w("OEMTestButtonDesc")

public val REGSTR_VAL_JOYOEMTESTMOVECAP: Pcwstr = w("OEMTestMoveCap")

public val REGSTR_VAL_JOYOEMTESTMOVEDESC: Pcwstr = w("OEMTestMoveDesc")

public val REGSTR_VAL_JOYOEMTESTWINCAP: Pcwstr = w("OEMTestWinCap")

public val REGSTR_VAL_JOYOEMULABEL: Pcwstr = w("OEMULabel")

public val REGSTR_VAL_JOYOEMVLABEL: Pcwstr = w("OEMVLabel")

public val REGSTR_VAL_JOYOEMXYLABEL: Pcwstr = w("OEMXYLabel")

public val REGSTR_VAL_JOYOEMZLABEL: Pcwstr = w("OEMZLabel")

public val REGSTR_VAL_JOYUSERVALUES: Pcwstr = w("JoystickUserValues")

public val REGSTR_VAL_LASTALIVEBT: Pcwstr = w("LastAliveBT")

public val REGSTR_VAL_LASTALIVEINTERVAL: Pcwstr = w("TimeStampInterval")

public val REGSTR_VAL_LASTALIVEPMPOLICY: Pcwstr = w("LastAlivePMPolicy")

public val REGSTR_VAL_LASTALIVESTAMP: Pcwstr = w("LastAliveStamp")

public val REGSTR_VAL_LASTALIVESTAMPFORCED: Pcwstr = w("LastAliveStampForced")

public val REGSTR_VAL_LASTALIVESTAMPINTERVAL: Pcwstr = w("LastAliveStampInterval")

public val REGSTR_VAL_LASTALIVESTAMPPOLICYINTERVAL: Pcwstr = w("LastAliveStampPolicyInterval")

public val REGSTR_VAL_LASTALIVEUPTIME: Pcwstr = w("LastAliveUptime")

public val REGSTR_VAL_LASTBOOTPMDRVS: Pcwstr = w("LastBootPMDrvs")

public val REGSTR_VAL_LASTCOMPUTERNAME: Pcwstr = w("LastComputerName")

public val REGSTR_VAL_LASTPCIBUSNUM: Pcwstr = w("LastPCIBusNum")

public val REGSTR_VAL_LAST_UPDATE_TIME: Pcwstr = w("LastUpdateTime")

public val REGSTR_VAL_LEGALNOTICECAPTION: Pcwstr = w("LegalNoticeCaption")

public val REGSTR_VAL_LEGALNOTICETEXT: Pcwstr = w("LegalNoticeText")

public val REGSTR_VAL_LICENSINGINFO: Pcwstr = w("LicensingInfo")

public val REGSTR_VAL_LINKED: Pcwstr = w("Linked")

public val REGSTR_VAL_LOADHI: Pcwstr = w("LoadHi")

public val REGSTR_VAL_LOADRMDRIVERS: Pcwstr = w("LoadRMDrivers")

public val REGSTR_VAL_LOCATION_INFORMATION: Pcwstr = w("LocationInformation")

public val REGSTR_VAL_LOCATION_INFORMATION_OVERRIDE: Pcwstr = w("LocationInformationOverride")

public val REGSTR_VAL_LOWERFILTERS: Pcwstr = w("LowerFilters")

public val REGSTR_VAL_LOWER_FILTER_DEFAULT_LEVEL: Pcwstr = w("LowerFilterDefaultLevel")

public val REGSTR_VAL_LOWER_FILTER_LEVELS: Pcwstr = w("LowerFilterLevels")

public val REGSTR_VAL_MACHINETYPE: Pcwstr = w("MachineType")

public val REGSTR_VAL_MANUFACTURER: Pcwstr = w("Manufacturer")

public val REGSTR_VAL_MAP: Pcwstr = w("Map")

public val REGSTR_VAL_MATCHINGDEVID: Pcwstr = w("MatchingDeviceId")

public val REGSTR_VAL_MAXCONNECTIONS: Pcwstr = w("MaxConnections")

public val REGSTR_VAL_MAXLIP: Pcwstr = w("MaxLIP")

public val REGSTR_VAL_MAXRES: Pcwstr = w("MaxResolution")

public val REGSTR_VAL_MAXRETRY: Pcwstr = w("MaxRetry")

public val REGSTR_VAL_MAX_HCID_LEN: UInt = 1024u

public val REGSTR_VAL_MEDIA: Pcwstr = w("MediaPath")

public val REGSTR_VAL_MFG: Pcwstr = w("Mfg")

public val REGSTR_VAL_MF_FLAGS: Pcwstr = w("MFFlags")

public val REGSTR_VAL_MINIPORT_STAT: Pcwstr = w("MiniportStatus")

public val REGSTR_VAL_MINPWDLEN: Pcwstr = w("MinPwdLen")

public val REGSTR_VAL_MINRETRY: Pcwstr = w("MinRetry")

public val REGSTR_VAL_MODE: Pcwstr = w("Mode")

public val REGSTR_VAL_MODEL: Pcwstr = w("Model")

public val REGSTR_VAL_MSDOSMODE: Pcwstr = w("MSDOSMode")

public val REGSTR_VAL_MSDOSMODEDISCARD: Pcwstr = w("Discard")

public val REGSTR_VAL_MUSTBEVALIDATED: Pcwstr = w("MustBeValidated")

public val REGSTR_VAL_NAMECACHECOUNT: Pcwstr = w("NameCache")

public val REGSTR_VAL_NAMENUMERICTAIL: Pcwstr = w("NameNumericTail")

public val REGSTR_VAL_NCP_BROWSEMASTER: Pcwstr = w("BrowseMaster")

public val REGSTR_VAL_NCP_USEPEERBROWSING: Pcwstr = w("Use_PeerBrowsing")

public val REGSTR_VAL_NCP_USESAP: Pcwstr = w("Use_Sap")

public val REGSTR_VAL_NDP: Pcwstr = w("NDP")

public val REGSTR_VAL_NETCARD: Pcwstr = w("Netcard")

public val REGSTR_VAL_NETCLEAN: Pcwstr = w("NetClean")

public val REGSTR_VAL_NETOSTYPE: Pcwstr = w("NetOSType")

public val REGSTR_VAL_NETSETUP_DISABLE: Pcwstr = w("NoNetSetup")

public val REGSTR_VAL_NETSETUP_NOCONFIGPAGE: Pcwstr = w("NoNetSetupConfigPage")

public val REGSTR_VAL_NETSETUP_NOIDPAGE: Pcwstr = w("NoNetSetupIDPage")

public val REGSTR_VAL_NETSETUP_NOSECURITYPAGE: Pcwstr = w("NoNetSetupSecurityPage")

public val REGSTR_VAL_NOCMOSORFDPT: Pcwstr = w("NoCMOSorFDPT")

public val REGSTR_VAL_NODISPLAYCLASS: Pcwstr = w("NoDisplayClass")

public val REGSTR_VAL_NOENTIRENETWORK: Pcwstr = w("NoEntireNetwork")

public val REGSTR_VAL_NOFILESHARING: Pcwstr = w("NoFileSharing")

public val REGSTR_VAL_NOFILESHARINGCTRL: Pcwstr = w("NoFileSharingControl")

public val REGSTR_VAL_NOIDE: Pcwstr = w("NoIDE")

public val REGSTR_VAL_NOINSTALLCLASS: Pcwstr = w("NoInstallClass")

public val REGSTR_VAL_NONSTANDARD_ATAPI: Pcwstr = w("NonStandardATAPI")

public val REGSTR_VAL_NOPRINTSHARING: Pcwstr = w("NoPrintSharing")

public val REGSTR_VAL_NOPRINTSHARINGCTRL: Pcwstr = w("NoPrintSharingControl")

public val REGSTR_VAL_NOUSECLASS: Pcwstr = w("NoUseClass")

public val REGSTR_VAL_NOWORKGROUPCONTENTS: Pcwstr = w("NoWorkgroupContents")

public val REGSTR_VAL_OLDMSDOSVER: Pcwstr = w("OldMSDOSVer")

public val REGSTR_VAL_OLDWINDIR: Pcwstr = w("OldWinDir")

public val REGSTR_VAL_OPTIMIZESFN: Pcwstr = w("OptimizeSFN")

public val REGSTR_VAL_OPTIONS: Pcwstr = w("Options")

public val REGSTR_VAL_OPTORDER: Pcwstr = w("Order")

public val REGSTR_VAL_P1284MDL: Pcwstr = w("Model")

public val REGSTR_VAL_P1284MFG: Pcwstr = w("Manufacturer")

public val REGSTR_VAL_PATHCACHECOUNT: Pcwstr = w("PathCache")

public val REGSTR_VAL_PCCARD_POWER: Pcwstr = w("EnablePowerManagement")

public val REGSTR_VAL_PCI: Pcwstr = w("PCI")

public val REGSTR_VAL_PCIBIOSVER: Pcwstr = w("PCIBIOSVer")

public val REGSTR_VAL_PCICIRQMAP: Pcwstr = w("PCICIRQMap")

public val REGSTR_VAL_PCICOPTIONS: Pcwstr = w("PCICOptions")

public val REGSTR_VAL_PCMCIA_ALLOC: Pcwstr = w("AllocMemWin")

public val REGSTR_VAL_PCMCIA_ATAD: Pcwstr = w("ATADelay")

public val REGSTR_VAL_PCMCIA_MEM: Pcwstr = w("Memory")

public val REGSTR_VAL_PCMCIA_OPT: Pcwstr = w("Options")

public val REGSTR_VAL_PCMCIA_SIZ: Pcwstr = w("MinRegionSize")

public val REGSTR_VAL_PCMTDRIVER: Pcwstr = w("MTD")

public val REGSTR_VAL_PCSSDRIVER: Pcwstr = w("Driver")

public val REGSTR_VAL_PHYSICALDEVICEOBJECT: Pcwstr = w("PhysicalDeviceObject")

public val REGSTR_VAL_PMODE_INT13: Pcwstr = w("PModeInt13")

public val REGSTR_VAL_PNPBIOSVER: Pcwstr = w("PnPBIOSVer")

public val REGSTR_VAL_PNPSTRUCOFFSET: Pcwstr = w("PnPStrucOffset")

public val REGSTR_VAL_POLICY: Pcwstr = w("Policy")

public val REGSTR_VAL_POLLING: Pcwstr = w("Polling")

public val REGSTR_VAL_PORTNAME: Pcwstr = w("PortName")

public val REGSTR_VAL_PORTSUBCLASS: Pcwstr = w("PortSubClass")

public val REGSTR_VAL_PREFREDIR: Pcwstr = w("PreferredRedir")

public val REGSTR_VAL_PRESERVECASE: Pcwstr = w("PreserveCase")

public val REGSTR_VAL_PRESERVELONGNAMES: Pcwstr = w("PreserveLongNames")

public val REGSTR_VAL_PRINTERS_HIDETABS: Pcwstr = w("NoPrinterTabs")

public val REGSTR_VAL_PRINTERS_MASK: Pcwstr = w("PrintersMask")

public val REGSTR_VAL_PRINTERS_NOADD: Pcwstr = w("NoAddPrinter")

public val REGSTR_VAL_PRINTERS_NODELETE: Pcwstr = w("NoDeletePrinter")

public val REGSTR_VAL_PRINTSHARING: Pcwstr = w("PrintSharing")

public val REGSTR_VAL_PRIORITY: Pcwstr = w("Priority")

public val REGSTR_VAL_PRIVATE: Pcwstr = w("Private")

public val REGSTR_VAL_PRIVATEFUNC: Pcwstr = w("PrivateFunc")

public val REGSTR_VAL_PRIVATEPROBLEM: Pcwstr = w("PrivateProblem")

public val REGSTR_VAL_PRODUCTID: Pcwstr = w("ProductId")

public val REGSTR_VAL_PRODUCTTYPE: Pcwstr = w("ProductType")

public val REGSTR_VAL_PROFILEFLAGS: Pcwstr = w("ProfileFlags")

public val REGSTR_VAL_PROPERTIES: Pcwstr = w("Properties")

public val REGSTR_VAL_PROTINIPATH: Pcwstr = w("ProtIniPath")

public val REGSTR_VAL_PROVIDER_NAME: Pcwstr = w("ProviderName")

public val REGSTR_VAL_PWDEXPIRATION: Pcwstr = w("PwdExpiration")

public val REGSTR_VAL_PWDPROVIDER_CHANGEORDER: Pcwstr = w("ChangeOrder")

public val REGSTR_VAL_PWDPROVIDER_CHANGEPWD: Pcwstr = w("ChangePassword")

public val REGSTR_VAL_PWDPROVIDER_CHANGEPWDHWND: Pcwstr = w("ChangePasswordHwnd")

public val REGSTR_VAL_PWDPROVIDER_DESC: Pcwstr = w("Description")

public val REGSTR_VAL_PWDPROVIDER_GETPWDSTATUS: Pcwstr = w("GetPasswordStatus")

public val REGSTR_VAL_PWDPROVIDER_ISNP: Pcwstr = w("NetworkProvider")

public val REGSTR_VAL_PWDPROVIDER_PATH: Pcwstr = w("ProviderPath")

public val REGSTR_VAL_RDINTTHRESHOLD: Pcwstr = w("RDIntThreshold")

public val REGSTR_VAL_READAHEADTHRESHOLD: Pcwstr = w("ReadAheadThreshold")

public val REGSTR_VAL_READCACHING: Pcwstr = w("ReadCaching")

public val REGSTR_VAL_REALNETSTART: Pcwstr = w("RealNetStart")

public val REGSTR_VAL_REASONCODE: Pcwstr = w("ReasonCode")

public val REGSTR_VAL_REFRESHRATE: Pcwstr = w("RefreshRate")

public val REGSTR_VAL_REGITEMDELETEMESSAGE: Pcwstr = w("Removal Message")

public val REGSTR_VAL_REGORGANIZATION: Pcwstr = w("RegisteredOrganization")

public val REGSTR_VAL_REGOWNER: Pcwstr = w("RegisteredOwner")

public val REGSTR_VAL_REINSTALL_DEVICEINSTANCEIDS: Pcwstr = w("DeviceInstanceIds")

public val REGSTR_VAL_REINSTALL_DISPLAYNAME: Pcwstr = w("DisplayName")

public val REGSTR_VAL_REINSTALL_STRING: Pcwstr = w("ReinstallString")

public val REGSTR_VAL_REMOTE_PATH: Pcwstr = w("RemotePath")

public val REGSTR_VAL_REMOVABLE: Pcwstr = w("Removable")

public val REGSTR_VAL_REMOVAL_POLICY: Pcwstr = w("RemovalPolicy")

public val REGSTR_VAL_REMOVEROMOKAY: Pcwstr = w("RemoveRomOkay")

public val REGSTR_VAL_REMOVEROMOKAYFUNC: Pcwstr = w("RemoveRomOkayFunc")

public val REGSTR_VAL_RESERVED_DEVNODE: Pcwstr = w("HTREE\\RESERVED\\0")

public val REGSTR_VAL_RESOLUTION: Pcwstr = w("Resolution")

public val REGSTR_VAL_RESOURCES: Pcwstr = w("Resources")

public val REGSTR_VAL_RESOURCE_MAP: Pcwstr = w("ResourceMap")

public val REGSTR_VAL_RESOURCE_PICKER_EXCEPTIONS: Pcwstr = w("ResourcePickerExceptions")

public val REGSTR_VAL_RESOURCE_PICKER_TAGS: Pcwstr = w("ResourcePickerTags")

public val REGSTR_VAL_RESTRICTRUN: Pcwstr = w("RestrictRun")

public val REGSTR_VAL_RESUMERESET: Pcwstr = w("ResumeReset")

public val REGSTR_VAL_REVISION: Pcwstr = w("Revision")

public val REGSTR_VAL_REVLEVEL: Pcwstr = w("RevisionLevel")

public val REGSTR_VAL_ROOT_DEVNODE: Pcwstr = w("HTREE\\ROOT\\0")

public val REGSTR_VAL_RUNLOGINSCRIPT: Pcwstr = w("ProcessLoginScript")

public val REGSTR_VAL_SCANNER: Pcwstr = w("SCANNER")

public val REGSTR_VAL_SCAN_ONLY_FIRST: Pcwstr = w("ScanOnlyFirstDrive")

public val REGSTR_VAL_SCSI: Pcwstr = w("SCSI\\")

public val REGSTR_VAL_SCSILUN: Pcwstr = w("SCSILUN")

public val REGSTR_VAL_SCSITID: Pcwstr = w("SCSITargetID")

public val REGSTR_VAL_SEARCHMODE: Pcwstr = w("SearchMode")

public val REGSTR_VAL_SEARCHOPTIONS: Pcwstr = w("SearchOptions")

public val REGSTR_VAL_SECCPL_NOADMINPAGE: Pcwstr = w("NoAdminPage")

public val REGSTR_VAL_SECCPL_NOPROFILEPAGE: Pcwstr = w("NoProfilePage")

public val REGSTR_VAL_SECCPL_NOPWDPAGE: Pcwstr = w("NoPwdPage")

public val REGSTR_VAL_SECCPL_NOSECCPL: Pcwstr = w("NoSecCPL")

public val REGSTR_VAL_SERVICE: Pcwstr = w("Service")

public val REGSTR_VAL_SETUPFLAGS: Pcwstr = w("SetupFlags")

public val REGSTR_VAL_SETUPMACHINETYPE: Pcwstr = w("SetupMachineType")

public val REGSTR_VAL_SETUPN: Pcwstr = w("SetupN")

public val REGSTR_VAL_SETUPNPATH: Pcwstr = w("SetupNPath")

public val REGSTR_VAL_SETUPPROGRAMRAN: Pcwstr = w("SetupProgramRan")

public val REGSTR_VAL_SHARES_FLAGS: Pcwstr = w("Flags")

public val REGSTR_VAL_SHARES_PATH: Pcwstr = w("Path")

public val REGSTR_VAL_SHARES_REMARK: Pcwstr = w("Remark")

public val REGSTR_VAL_SHARES_RO_PASS: Pcwstr = w("Parm2")

public val REGSTR_VAL_SHARES_RW_PASS: Pcwstr = w("Parm1")

public val REGSTR_VAL_SHARES_TYPE: Pcwstr = w("Type")

public val REGSTR_VAL_SHARE_IRQ: Pcwstr = w("ForceIRQSharing")

public val REGSTR_VAL_SHELLVERSION: Pcwstr = w("ShellVersion")

public val REGSTR_VAL_SHOWDOTS: Pcwstr = w("ShowDots")

public val REGSTR_VAL_SHOWREASONUI: Pcwstr = w("ShutdownReasonUI")

public val REGSTR_VAL_SHUTDOWNREASON: Pcwstr = w("ShutdownReason")

public val REGSTR_VAL_SHUTDOWNREASON_CODE: Pcwstr = w("ShutdownReasonCode")

public val REGSTR_VAL_SHUTDOWNREASON_COMMENT: Pcwstr = w("ShutdownReasonComment")

public val REGSTR_VAL_SHUTDOWNREASON_PROCESS: Pcwstr = w("ShutdownReasonProcess")

public val REGSTR_VAL_SHUTDOWNREASON_USERNAME: Pcwstr = w("ShutdownReasonUserName")

public val REGSTR_VAL_SHUTDOWN_FLAGS: Pcwstr = w("ShutdownFlags")

public val REGSTR_VAL_SHUTDOWN_IGNORE_PREDEFINED: Pcwstr = w("ShutdownIgnorePredefinedReasons")

public val REGSTR_VAL_SHUTDOWN_STATE_SNAPSHOT: Pcwstr = w("ShutdownStateSnapshot")

public val REGSTR_VAL_SILENTINSTALL: Pcwstr = w("SilentInstall")

public val REGSTR_VAL_SLSUPPORT: Pcwstr = w("SLSupport")

public val REGSTR_VAL_SOFTCOMPATMODE: Pcwstr = w("SoftCompatMode")

public val REGSTR_VAL_SRCPATH: Pcwstr = w("SourcePath")

public val REGSTR_VAL_SRVNAMECACHE: Pcwstr = w("ServerNameCache")

public val REGSTR_VAL_SRVNAMECACHECOUNT: Pcwstr = w("ServerNameCacheMax")

public val REGSTR_VAL_SRVNAMECACHENETPROV: Pcwstr = w("ServerNameCacheNumNets")

public val REGSTR_VAL_START_ON_BOOT: Pcwstr = w("StartOnBoot")

public val REGSTR_VAL_STAT: Pcwstr = w("Status")

public val REGSTR_VAL_STATICDRIVE: Pcwstr = w("StaticDrive")

public val REGSTR_VAL_STATICVXD: Pcwstr = w("StaticVxD")

public val REGSTR_VAL_STDDOSOPTION: Pcwstr = w("StdOption")

public val REGSTR_VAL_SUBMODEL: Pcwstr = w("Submodel")

public val REGSTR_VAL_SUPPORTBURST: Pcwstr = w("SupportBurst")

public val REGSTR_VAL_SUPPORTLFN: Pcwstr = w("SupportLFN")

public val REGSTR_VAL_SUPPORTTUNNELLING: Pcwstr = w("SupportTunnelling")

public val REGSTR_VAL_SYMBOLIC_LINK: Pcwstr = w("SymbolicLink")

public val REGSTR_VAL_SYNCDATAXFER: Pcwstr = w("SyncDataXfer")

public val REGSTR_VAL_SYSDM: Pcwstr = w("SysDM")

public val REGSTR_VAL_SYSDMFUNC: Pcwstr = w("SysDMFunc")

public val REGSTR_VAL_SYSTEMCPL_NOCONFIGPAGE: Pcwstr = w("NoConfigPage")

public val REGSTR_VAL_SYSTEMCPL_NODEVMGRPAGE: Pcwstr = w("NoDevMgrPage")

public val REGSTR_VAL_SYSTEMCPL_NOFILESYSPAGE: Pcwstr = w("NoFileSysPage")

public val REGSTR_VAL_SYSTEMCPL_NOVIRTMEMPAGE: Pcwstr = w("NoVirtMemPage")

public val REGSTR_VAL_SYSTEMROOT: Pcwstr = w("SystemRoot")

public val REGSTR_VAL_SYSTRAYBATFLAGS: Pcwstr = w("PowerFlags")

public val REGSTR_VAL_SYSTRAYPCCARDFLAGS: Pcwstr = w("PCMCIAFlags")

public val REGSTR_VAL_SYSTRAYSVCS: Pcwstr = w("Services")

public val REGSTR_VAL_TABLE_STAT: Pcwstr = w("TableStatus")

public val REGSTR_VAL_TAPE: Pcwstr = w("TAPE")

public val REGSTR_VAL_TRANSITION: Pcwstr = w("Transition")

public val REGSTR_VAL_TRANSPORT: Pcwstr = w("Transport")

public val REGSTR_VAL_TZACTBIAS: Pcwstr = w("ActiveTimeBias")

public val REGSTR_VAL_TZBIAS: Pcwstr = w("Bias")

public val REGSTR_VAL_TZDLTBIAS: Pcwstr = w("DaylightBias")

public val REGSTR_VAL_TZDLTFLAG: Pcwstr = w("DaylightFlag")

public val REGSTR_VAL_TZDLTNAME: Pcwstr = w("DaylightName")

public val REGSTR_VAL_TZDLTSTART: Pcwstr = w("DaylightStart")

public val REGSTR_VAL_TZNOAUTOTIME: Pcwstr = w("DisableAutoDaylightTimeSet")

public val REGSTR_VAL_TZNOCHANGEEND: Pcwstr = w("NoChangeEnd")

public val REGSTR_VAL_TZNOCHANGESTART: Pcwstr = w("NoChangeStart")

public val REGSTR_VAL_TZSTDBIAS: Pcwstr = w("StandardBias")

public val REGSTR_VAL_TZSTDNAME: Pcwstr = w("StandardName")

public val REGSTR_VAL_TZSTDSTART: Pcwstr = w("StandardStart")

public val REGSTR_VAL_UI_NUMBER: Pcwstr = w("UINumber")

public val REGSTR_VAL_UI_NUMBER_DESC_FORMAT: Pcwstr = w("UINumberDescFormat")

public val REGSTR_VAL_UNDOCK_WITHOUT_LOGON: Pcwstr = w("UndockWithoutLogon")

public val REGSTR_VAL_UNINSTALLER_COMMANDLINE: Pcwstr = w("UninstallString")

public val REGSTR_VAL_UNINSTALLER_DISPLAYNAME: Pcwstr = w("DisplayName")

public val REGSTR_VAL_UPGRADE: Pcwstr = w("Upgrade")

public val REGSTR_VAL_UPPERFILTERS: Pcwstr = w("UpperFilters")

public val REGSTR_VAL_UPPER_FILTER_DEFAULT_LEVEL: Pcwstr = w("UpperFilterDefaultLevel")

public val REGSTR_VAL_UPPER_FILTER_LEVELS: Pcwstr = w("UpperFilterLevels")

public val REGSTR_VAL_USERSETTINGS: Pcwstr = w("AdapterSettings")

public val REGSTR_VAL_USER_NAME: Pcwstr = w("UserName")

public val REGSTR_VAL_USRDRVLET: Pcwstr = w("UserDriveLetterAssignment")

public val REGSTR_VAL_VDD: Pcwstr = w("vdd")

public val REGSTR_VAL_VER: Pcwstr = w("Ver")

public val REGSTR_VAL_VERIFYKEY: Pcwstr = w("VerifyKey")

public val REGSTR_VAL_VIRTUALHDIRQ: Pcwstr = w("VirtualHDIRQ")

public val REGSTR_VAL_VOLIDLETIMEOUT: Pcwstr = w("VolumeIdleTimeout")

public val REGSTR_VAL_VPOWERDFLAGS: Pcwstr = w("Flags")

public val REGSTR_VAL_VRES: Pcwstr = w("VRes")

public val REGSTR_VAL_VXDGROUPS: Pcwstr = w("VXDGroups")

public val REGSTR_VAL_WAITFORUNDOCK: Pcwstr = w("WaitForUndock")

public val REGSTR_VAL_WAITFORUNDOCKFUNC: Pcwstr = w("WaitForUndockFunc")

public val REGSTR_VAL_WIN31FILESYSTEM: Pcwstr = w("Win31FileSystem")

public val REGSTR_VAL_WIN31PROVIDER: Pcwstr = w("Win31Provider")

public val REGSTR_VAL_WINBOOTDIR: Pcwstr = w("WinbootDir")

public val REGSTR_VAL_WINCP: Pcwstr = w("ACP")

public val REGSTR_VAL_WINDIR: Pcwstr = w("WinDir")

public val REGSTR_VAL_WINOLDAPP_DISABLED: Pcwstr = w("Disabled")

public val REGSTR_VAL_WINOLDAPP_NOREALMODE: Pcwstr = w("NoRealMode")

public val REGSTR_VAL_WORKGROUP: Pcwstr = w("Workgroup")

public val REGSTR_VAL_WRAPPER: Pcwstr = w("Wrapper")

public val REGSTR_VAL_WRINTTHRESHOLD: Pcwstr = w("WRIntThreshold")

public val REGSTR_VAL_WRKGRP_FORCEMAPPING: Pcwstr = w("WrkgrpForceMapping")

public val REGSTR_VAL_WRKGRP_REQUIRED: Pcwstr = w("WrkgrpRequired")

public val REG_BINARY: RegValueType = 3u

public val REG_CREATED_NEW_KEY: RegCreateKeyDisposition = 1u

public val REG_DWORD: RegValueType = 4u

public val REG_DWORD_BIG_ENDIAN: RegValueType = 5u

public val REG_DWORD_LITTLE_ENDIAN: RegValueType = 4u

public val REG_EXPAND_SZ: RegValueType = 2u

public val REG_FORCE_RESTORE: RegRestoreKeyFlags = 8

public val REG_FULL_RESOURCE_DESCRIPTOR: RegValueType = 9u

public val REG_KEY_INSTDEV: Pcwstr = w("Installed")

public val REG_LATEST_FORMAT: RegSaveFormat = 2u

public val REG_LINK: RegValueType = 6u

public val REG_MUI_STRING_TRUNCATE: UInt = 1u

public val REG_MULTI_SZ: RegValueType = 7u

public val REG_NONE: RegValueType = 0u

public val REG_NOTIFY_CHANGE_ATTRIBUTES: RegNotifyFilter = 2u

public val REG_NOTIFY_CHANGE_LAST_SET: RegNotifyFilter = 4u

public val REG_NOTIFY_CHANGE_NAME: RegNotifyFilter = 1u

public val REG_NOTIFY_CHANGE_SECURITY: RegNotifyFilter = 8u

public val REG_NOTIFY_THREAD_AGNOSTIC: RegNotifyFilter = 268435456u

public val REG_NO_COMPRESSION: RegSaveFormat = 4u

public val REG_OPENED_EXISTING_KEY: RegCreateKeyDisposition = 2u

public val REG_OPTION_BACKUP_RESTORE: RegOpenCreateOptions = 4u

public val REG_OPTION_CREATE_LINK: RegOpenCreateOptions = 2u

public val REG_OPTION_DONT_VIRTUALIZE: RegOpenCreateOptions = 16u

public val REG_OPTION_NON_VOLATILE: RegOpenCreateOptions = 0u

public val REG_OPTION_OPEN_LINK: RegOpenCreateOptions = 8u

public val REG_OPTION_RESERVED: RegOpenCreateOptions = 0u

public val REG_OPTION_VOLATILE: RegOpenCreateOptions = 1u

public val REG_PROCESS_APPKEY: UInt = 1u

public val REG_QWORD: RegValueType = 11u

public val REG_QWORD_LITTLE_ENDIAN: RegValueType = 11u

public val REG_RESOURCE_LIST: RegValueType = 8u

public val REG_RESOURCE_REQUIREMENTS_LIST: RegValueType = 10u

public val REG_SECURE_CONNECTION: UInt = 1u

public val REG_STANDARD_FORMAT: RegSaveFormat = 1u

public val REG_SZ: RegValueType = 1u

public val REG_USE_CURRENT_SECURITY_CONTEXT: UInt = 2u

public val REG_WHOLE_HIVE_VOLATILE: RegRestoreKeyFlags = 1

public val RRF_NOEXPAND: RegRoutineFlags = 268435456u

public val RRF_RT_ANY: RegRoutineFlags = 65535u

public val RRF_RT_DWORD: RegRoutineFlags = 24u

public val RRF_RT_QWORD: RegRoutineFlags = 72u

public val RRF_RT_REG_BINARY: RegRoutineFlags = 8u

public val RRF_RT_REG_DWORD: RegRoutineFlags = 16u

public val RRF_RT_REG_EXPAND_SZ: RegRoutineFlags = 4u

public val RRF_RT_REG_MULTI_SZ: RegRoutineFlags = 32u

public val RRF_RT_REG_NONE: RegRoutineFlags = 1u

public val RRF_RT_REG_QWORD: RegRoutineFlags = 64u

public val RRF_RT_REG_SZ: RegRoutineFlags = 2u

public val RRF_SUBKEY_WOW6432KEY: RegRoutineFlags = 131072u

public val RRF_SUBKEY_WOW6464KEY: RegRoutineFlags = 65536u

public val RRF_WOW64_MASK: RegRoutineFlags = 196608u

public val RRF_ZEROONFAILURE: RegRoutineFlags = 536870912u

public val SUF_BATCHINF: Int = 4

public val SUF_CLEAN: Int = 8

public val SUF_EXPRESS: Int = 2

public val SUF_FIRSTTIME: Int = 1

public val SUF_INSETUP: Int = 16

public val SUF_NETHDBOOT: Int = 64

public val SUF_NETRPLBOOT: Int = 128

public val SUF_NETSETUP: Int = 32

public val SUF_SBSCOPYOK: Int = 256

public val VPDF_DISABLEPWRMGMT: UInt = 1u

public val VPDF_DISABLEPWRSTATUSPOLL: UInt = 8u

public val VPDF_DISABLERINGRESUME: UInt = 16u

public val VPDF_FORCEAPM10MODE: UInt = 2u

public val VPDF_SHOWMULTIBATT: UInt = 32u

public val VPDF_SKIPINTELSLCHECK: UInt = 4u
