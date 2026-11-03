package io.github.kotlinmania.windowssys.windows.win32.system.registry

import io.github.kotlinmania.windowssys.core.PCWSTR
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

public val HKEY_CLASSES_ROOT: HKEY = (-2147483648).toLong()

public val HKEY_CURRENT_CONFIG: HKEY = (-2147483643).toLong()

public val HKEY_CURRENT_USER: HKEY = (-2147483647).toLong()

public val HKEY_CURRENT_USER_LOCAL_SETTINGS: HKEY = (-2147483641).toLong()

public val HKEY_DYN_DATA: HKEY = (-2147483642).toLong()

public val HKEY_LOCAL_MACHINE: HKEY = (-2147483646).toLong()

public val HKEY_PERFORMANCE_DATA: HKEY = (-2147483644).toLong()

public val HKEY_PERFORMANCE_NLSTEXT: HKEY = (-2147483552).toLong()

public val HKEY_PERFORMANCE_TEXT: HKEY = (-2147483568).toLong()

public val HKEY_USERS: HKEY = (-2147483645).toLong()

public val IT_COMPACT: UInt = 0u

public val IT_CUSTOM: UInt = 3u

public val IT_PORTABLE: UInt = 2u

public val IT_TYPICAL: UInt = 1u

public val KEY_ALL_ACCESS: REG_SAM_FLAGS = 983103u

public val KEY_CREATE_LINK: REG_SAM_FLAGS = 32u

public val KEY_CREATE_SUB_KEY: REG_SAM_FLAGS = 4u

public val KEY_ENUMERATE_SUB_KEYS: REG_SAM_FLAGS = 8u

public val KEY_EXECUTE: REG_SAM_FLAGS = 131097u

public val KEY_NOTIFY: REG_SAM_FLAGS = 16u

public val KEY_QUERY_VALUE: REG_SAM_FLAGS = 1u

public val KEY_READ: REG_SAM_FLAGS = 131097u

public val KEY_SET_VALUE: REG_SAM_FLAGS = 2u

public val KEY_WOW64_32KEY: REG_SAM_FLAGS = 512u

public val KEY_WOW64_64KEY: REG_SAM_FLAGS = 256u

public val KEY_WOW64_RES: REG_SAM_FLAGS = 768u

public val KEY_WRITE: REG_SAM_FLAGS = 131078u

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

public val REGSTR_DATA_NETOS_IPX: PCWSTR = w("IPX")

public val REGSTR_DATA_NETOS_NDIS: PCWSTR = w("NDIS")

public val REGSTR_DATA_NETOS_ODI: PCWSTR = w("ODI")

public val REGSTR_DEFAULT_INSTANCE: PCWSTR = w("0000")

public val REGSTR_KEY_ACPIENUM: PCWSTR = w("ACPI")

public val REGSTR_KEY_APM: PCWSTR = w("*PNP0C05")

public val REGSTR_KEY_BIOSENUM: PCWSTR = w("BIOS")

public val REGSTR_KEY_CLASS: PCWSTR = w("Class")

public val REGSTR_KEY_CONFIG: PCWSTR = w("Config")

public val REGSTR_KEY_CONTROL: PCWSTR = w("Control")

public val REGSTR_KEY_CRASHES: PCWSTR = w("Crashes")

public val REGSTR_KEY_CURRENT: PCWSTR = w("Current")

public val REGSTR_KEY_CURRENT_ENV: PCWSTR = w("\\Windows 4.0")

public val REGSTR_KEY_DANGERS: PCWSTR = w("Dangers")

public val REGSTR_KEY_DEFAULT: PCWSTR = w("Default")

public val REGSTR_KEY_DETMODVARS: PCWSTR = w("DetModVars")

public val REGSTR_KEY_DEVICEPARAMETERS: PCWSTR = w("Device Parameters")

public val REGSTR_KEY_DEVICE_PROPERTIES: PCWSTR = w("Properties")

public val REGSTR_KEY_DISPLAY_CLASS: PCWSTR = w("Display")

public val REGSTR_KEY_DOSOPTCDROM: PCWSTR = w("CD-ROM")

public val REGSTR_KEY_DOSOPTMOUSE: PCWSTR = w("MOUSE")

public val REGSTR_KEY_DRIVERPARAMETERS: PCWSTR = w("Driver Parameters")

public val REGSTR_KEY_DRIVERS: PCWSTR = w("\\Drivers")

public val REGSTR_KEY_EBDAUTOEXECBATKEYBOARD: PCWSTR = w("EBDAutoexecBatKeyboard")

public val REGSTR_KEY_EBDAUTOEXECBATLOCAL: PCWSTR = w("EBDAutoexecBatLocale")

public val REGSTR_KEY_EBDCONFIGSYSKEYBOARD: PCWSTR = w("EBDConfigSysKeyboard")

public val REGSTR_KEY_EBDCONFIGSYSLOCAL: PCWSTR = w("EBDConfigSysLocale")

public val REGSTR_KEY_EBDFILESKEYBOARD: PCWSTR = w("EBDFilesKeyboard")

public val REGSTR_KEY_EBDFILESLOCAL: PCWSTR = w("EBDFilesLocale")

public val REGSTR_KEY_EISAENUM: PCWSTR = w("EISA")

public val REGSTR_KEY_ENUM: PCWSTR = w("Enum")

public val REGSTR_KEY_EXPLORER: PCWSTR = w("Explorer")

public val REGSTR_KEY_FILTERS: PCWSTR = w("Filters")

public val REGSTR_KEY_INIUPDATE: PCWSTR = w("IniUpdate")

public val REGSTR_KEY_ISAENUM: PCWSTR = w("ISAPnP")

public val REGSTR_KEY_JOYCURR: PCWSTR = w("CurrentJoystickSettings")

public val REGSTR_KEY_JOYSETTINGS: PCWSTR = w("JoystickSettings")

public val REGSTR_KEY_KEYBOARD_CLASS: PCWSTR = w("Keyboard")

public val REGSTR_KEY_KNOWNDOCKINGSTATES: PCWSTR = w("Hardware Profiles")

public val REGSTR_KEY_LOGCONFIG: PCWSTR = w("LogConfig")

public val REGSTR_KEY_LOGON: PCWSTR = w("\\Logon")

public val REGSTR_KEY_LOWER_FILTER_LEVEL_DEFAULT: PCWSTR = w("*Lower")

public val REGSTR_KEY_MEDIA_CLASS: PCWSTR = w("MEDIA")

public val REGSTR_KEY_MODEM_CLASS: PCWSTR = w("Modem")

public val REGSTR_KEY_MODES: PCWSTR = w("Modes")

public val REGSTR_KEY_MONITOR_CLASS: PCWSTR = w("Monitor")

public val REGSTR_KEY_MOUSE_CLASS: PCWSTR = w("Mouse")

public val REGSTR_KEY_NDISINFO: PCWSTR = w("NDISInfo")

public val REGSTR_KEY_NETWORK: PCWSTR = w("Network")

public val REGSTR_KEY_NETWORKPROVIDER: PCWSTR = w("\\NetworkProvider")

public val REGSTR_KEY_NETWORK_PERSISTENT: PCWSTR = w("\\Persistent")

public val REGSTR_KEY_NETWORK_RECENT: PCWSTR = w("\\Recent")

public val REGSTR_KEY_OVERRIDE: PCWSTR = w("Override")

public val REGSTR_KEY_PCIENUM: PCWSTR = w("PCI")

public val REGSTR_KEY_PCMCIA: PCWSTR = w("PCMCIA\\")

public val REGSTR_KEY_PCMCIAENUM: PCWSTR = w("PCMCIA")

public val REGSTR_KEY_PCMCIA_CLASS: PCWSTR = w("PCMCIA")

public val REGSTR_KEY_PCMTD: PCWSTR = w("MTD-")

public val REGSTR_KEY_PCUNKNOWN: PCWSTR = w("UNKNOWN_MANUFACTURER")

public val REGSTR_KEY_POL_COMPUTERS: PCWSTR = w("Computers")

public val REGSTR_KEY_POL_DEFAULT: PCWSTR = w(".default")

public val REGSTR_KEY_POL_USERGROUPDATA: PCWSTR = w("GroupData\\UserGroups\\Priority")

public val REGSTR_KEY_POL_USERGROUPS: PCWSTR = w("UserGroups")

public val REGSTR_KEY_POL_USERS: PCWSTR = w("Users")

public val REGSTR_KEY_PORTS_CLASS: PCWSTR = w("ports")

public val REGSTR_KEY_PRINTERS: PCWSTR = w("Printers")

public val REGSTR_KEY_PRINT_PROC: PCWSTR = w("\\Print Processors")

public val REGSTR_KEY_ROOTENUM: PCWSTR = w("Root")

public val REGSTR_KEY_RUNHISTORY: PCWSTR = w("RunHistory")

public val REGSTR_KEY_SCSI_CLASS: PCWSTR = w("SCSIAdapter")

public val REGSTR_KEY_SETUP: PCWSTR = w("\\Setup")

public val REGSTR_KEY_SHARES: PCWSTR = w("Software\\Microsoft\\Windows\\CurrentVersion\\Network\\LanMan")

public val REGSTR_KEY_SYSTEM: PCWSTR = w("System")

public val REGSTR_KEY_SYSTEMBOARD: PCWSTR = w("*PNP0C01")

public val REGSTR_KEY_UPPER_FILTER_LEVEL_DEFAULT: PCWSTR = w("*Upper")

public val REGSTR_KEY_USER: PCWSTR = w("User")

public val REGSTR_KEY_VPOWERDENUM: PCWSTR = w("VPOWERD")

public val REGSTR_KEY_WINOLDAPP: PCWSTR = w("WinOldApp")

public val REGSTR_MACHTYPE_ATT_PC: PCWSTR = w("AT&T PC")

public val REGSTR_MACHTYPE_HP_VECTRA: PCWSTR = w("HP Vectra")

public val REGSTR_MACHTYPE_IBMPC: PCWSTR = w("IBM PC")

public val REGSTR_MACHTYPE_IBMPCAT: PCWSTR = w("IBM PC/AT")

public val REGSTR_MACHTYPE_IBMPCCONV: PCWSTR = w("IBM PC Convertible")

public val REGSTR_MACHTYPE_IBMPCJR: PCWSTR = w("IBM PCjr")

public val REGSTR_MACHTYPE_IBMPCXT: PCWSTR = w("IBM PC/XT")

public val REGSTR_MACHTYPE_IBMPCXT_286: PCWSTR = w("IBM PC/XT 286")

public val REGSTR_MACHTYPE_IBMPS1: PCWSTR = w("IBM PS/1")

public val REGSTR_MACHTYPE_IBMPS2_25: PCWSTR = w("IBM PS/2-25")

public val REGSTR_MACHTYPE_IBMPS2_30: PCWSTR = w("IBM PS/2-30")

public val REGSTR_MACHTYPE_IBMPS2_30_286: PCWSTR = w("IBM PS/2-30 286")

public val REGSTR_MACHTYPE_IBMPS2_50: PCWSTR = w("IBM PS/2-50")

public val REGSTR_MACHTYPE_IBMPS2_50Z: PCWSTR = w("IBM PS/2-50Z")

public val REGSTR_MACHTYPE_IBMPS2_55SX: PCWSTR = w("IBM PS/2-55SX")

public val REGSTR_MACHTYPE_IBMPS2_60: PCWSTR = w("IBM PS/2-60")

public val REGSTR_MACHTYPE_IBMPS2_65SX: PCWSTR = w("IBM PS/2-65SX")

public val REGSTR_MACHTYPE_IBMPS2_70: PCWSTR = w("IBM PS/2-70")

public val REGSTR_MACHTYPE_IBMPS2_70_80: PCWSTR = w("IBM PS/2-70/80")

public val REGSTR_MACHTYPE_IBMPS2_80: PCWSTR = w("IBM PS/2-80")

public val REGSTR_MACHTYPE_IBMPS2_90: PCWSTR = w("IBM PS/2-90")

public val REGSTR_MACHTYPE_IBMPS2_P70: PCWSTR = w("IBM PS/2-P70")

public val REGSTR_MACHTYPE_PHOENIX_PCAT: PCWSTR = w("Phoenix PC/AT Compatible")

public val REGSTR_MACHTYPE_UNKNOWN: PCWSTR = w("Unknown")

public val REGSTR_MACHTYPE_ZENITH_PC: PCWSTR = w("Zenith PC")

public val REGSTR_MAX_VALUE_LENGTH: UInt = 256u

public val REGSTR_PATH_ADDRARB: PCWSTR = w("System\\CurrentControlSet\\Services\\Arbitrators\\AddrArb")

public val REGSTR_PATH_AEDEBUG: PCWSTR = w("Software\\Microsoft\\Windows NT\\CurrentVersion\\AeDebug")

public val REGSTR_PATH_APPEARANCE: PCWSTR = w("Control Panel\\Appearance")

public val REGSTR_PATH_APPPATCH: PCWSTR = w("System\\CurrentControlSet\\Control\\SessionManager\\AppPatches")

public val REGSTR_PATH_APPPATHS: PCWSTR = w("Software\\Microsoft\\Windows\\CurrentVersion\\App Paths")

public val REGSTR_PATH_BIOSINFO: PCWSTR = w("System\\CurrentControlSet\\Control\\BiosInfo")

public val REGSTR_PATH_BUSINFORMATION: PCWSTR = w("System\\CurrentControlSet\\Control\\PnP\\BusInformation")

public val REGSTR_PATH_CDFS: PCWSTR = w("System\\CurrentControlSet\\Control\\FileSystem\\CDFS")

public val REGSTR_PATH_CHECKBADAPPS: PCWSTR = w("System\\CurrentControlSet\\Control\\SessionManager\\CheckBadApps")

public val REGSTR_PATH_CHECKBADAPPS400: PCWSTR = w("System\\CurrentControlSet\\Control\\SessionManager\\CheckBadApps400")

public val REGSTR_PATH_CHECKDISK: PCWSTR = w("Software\\Microsoft\\Windows\\CurrentVersion\\Applets\\Check Drive")

public val REGSTR_PATH_CHECKDISKSET: PCWSTR = w("Settings")

public val REGSTR_PATH_CHECKDISKUDRVS: PCWSTR = w("NoUnknownDDErrDrvs")

public val REGSTR_PATH_CHECKVERDLLS: PCWSTR = w("System\\CurrentControlSet\\Control\\SessionManager\\CheckVerDLLs")

public val REGSTR_PATH_CHILD_PREFIX: PCWSTR = w("Child")

public val REGSTR_PATH_CHKLASTCHECK: PCWSTR = w("Software\\Microsoft\\Windows\\CurrentVersion\\Applets\\Check Drive\\LastCheck")

public val REGSTR_PATH_CHKLASTSURFAN: PCWSTR = w("Software\\Microsoft\\Windows\\CurrentVersion\\Applets\\Check Drive\\LastSurfaceAnalysis")

public val REGSTR_PATH_CLASS: PCWSTR = w("System\\CurrentControlSet\\Services\\Class")

public val REGSTR_PATH_CLASS_NT: PCWSTR = w("System\\CurrentControlSet\\Control\\Class")

public val REGSTR_PATH_CODEPAGE: PCWSTR = w("System\\CurrentControlSet\\Control\\Nls\\Codepage")

public val REGSTR_PATH_CODEVICEINSTALLERS: PCWSTR = w("System\\CurrentControlSet\\Control\\CoDeviceInstallers")

public val REGSTR_PATH_COLORS: PCWSTR = w("Control Panel\\Colors")

public val REGSTR_PATH_COMPUTRNAME: PCWSTR = w("System\\CurrentControlSet\\Control\\ComputerName\\ComputerName")

public val REGSTR_PATH_CONTROLPANEL: PCWSTR = w("Control Panel")

public val REGSTR_PATH_CONTROLSFOLDER: PCWSTR = w("Software\\Microsoft\\Windows\\CurrentVersion\\Controls Folder")

public val REGSTR_PATH_CRITICALDEVICEDATABASE: PCWSTR = w("System\\CurrentControlSet\\Control\\CriticalDeviceDatabase")

public val REGSTR_PATH_CURRENTCONTROLSET: PCWSTR = w("System\\CurrentControlSet")

public val REGSTR_PATH_CURRENT_CONTROL_SET: PCWSTR = w("System\\CurrentControlSet\\Control")

public val REGSTR_PATH_CURSORS: PCWSTR = w("Control Panel\\Cursors")

public val REGSTR_PATH_CVNETWORK: PCWSTR = w("Software\\Microsoft\\Windows\\CurrentVersion\\Network")

public val REGSTR_PATH_DESKTOP: PCWSTR = w("Control Panel\\Desktop")

public val REGSTR_PATH_DETECT: PCWSTR = w("Software\\Microsoft\\Windows\\CurrentVersion\\Detect")

public val REGSTR_PATH_DEVICEINSTALLER: PCWSTR = w("Software\\Microsoft\\Windows\\CurrentVersion\\Device Installer")

public val REGSTR_PATH_DEVICE_CLASSES: PCWSTR = w("System\\CurrentControlSet\\Control\\DeviceClasses")

public val REGSTR_PATH_DIFX: PCWSTR = w("Software\\Microsoft\\Windows\\CurrentVersion\\DIFX")

public val REGSTR_PATH_DISPLAYSETTINGS: PCWSTR = w("Display\\Settings")

public val REGSTR_PATH_DMAARB: PCWSTR = w("System\\CurrentControlSet\\Services\\Arbitrators\\DMAArb")

public val REGSTR_PATH_DRIVERSIGN: PCWSTR = w("Software\\Microsoft\\Driver Signing")

public val REGSTR_PATH_DRIVERSIGN_POLICY: PCWSTR = w("Software\\Policies\\Microsoft\\Windows NT\\Driver Signing")

public val REGSTR_PATH_ENUM: PCWSTR = w("Enum")

public val REGSTR_PATH_ENVIRONMENTS: PCWSTR = w("System\\CurrentControlSet\\Control\\Print\\Environments")

public val REGSTR_PATH_EVENTLABELS: PCWSTR = w("AppEvents\\EventLabels")

public val REGSTR_PATH_EXPLORER: PCWSTR = w("Software\\Microsoft\\Windows\\CurrentVersion\\Explorer")

public val REGSTR_PATH_FAULT: PCWSTR = w("Software\\Microsoft\\Windows\\CurrentVersion\\Fault")

public val REGSTR_PATH_FILESYSTEM: PCWSTR = w("System\\CurrentControlSet\\Control\\FileSystem")

public val REGSTR_PATH_FILESYSTEM_NOVOLTRACK: PCWSTR = w("System\\CurrentControlSet\\Control\\FileSystem\\NoVolTrack")

public val REGSTR_PATH_FLOATINGPOINTPROCESSOR: PCWSTR = w("HARDWARE\\DESCRIPTION\\System\\FloatingPointProcessor")

public val REGSTR_PATH_FLOATINGPOINTPROCESSOR0: PCWSTR = w("HARDWARE\\DESCRIPTION\\System\\FloatingPointProcessor\\0")

public val REGSTR_PATH_FONTS: PCWSTR = w("Display\\Fonts")

public val REGSTR_PATH_GRPCONV: PCWSTR = w("Software\\Microsoft\\Windows\\CurrentVersion\\GrpConv")

public val REGSTR_PATH_HACKINIFILE: PCWSTR = w("System\\CurrentControlSet\\Control\\SessionManager\\HackIniFiles")

public val REGSTR_PATH_HWPROFILES: PCWSTR = w("System\\CurrentControlSet\\Hardware Profiles")

public val REGSTR_PATH_HWPROFILESCURRENT: PCWSTR = w("System\\CurrentControlSet\\Hardware Profiles\\Current")

public val REGSTR_PATH_ICONS: PCWSTR = w("Control Panel\\Icons")

public val REGSTR_PATH_IDCONFIGDB: PCWSTR = w("System\\CurrentControlSet\\Control\\IDConfigDB")

public val REGSTR_PATH_INSTALLEDFILES: PCWSTR = w("System\\CurrentControlSet\\Control\\InstalledFiles")

public val REGSTR_PATH_IOARB: PCWSTR = w("System\\CurrentControlSet\\Services\\Arbitrators\\IOArb")

public val REGSTR_PATH_IOS: PCWSTR = w("System\\CurrentControlSet\\Services\\VxD\\IOS")

public val REGSTR_PATH_IRQARB: PCWSTR = w("System\\CurrentControlSet\\Services\\Arbitrators\\IRQArb")

public val REGSTR_PATH_KEYBOARD: PCWSTR = w("Control Panel\\Keyboard")

public val REGSTR_PATH_KNOWN16DLLS: PCWSTR = w("System\\CurrentControlSet\\Control\\SessionManager\\Known16DLLs")

public val REGSTR_PATH_KNOWNDLLS: PCWSTR = w("System\\CurrentControlSet\\Control\\SessionManager\\KnownDLLs")

public val REGSTR_PATH_KNOWNVXDS: PCWSTR = w("System\\CurrentControlSet\\Control\\SessionManager\\KnownVxDs")

public val REGSTR_PATH_LASTBACKUP: PCWSTR = w("Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\LastBackup")

public val REGSTR_PATH_LASTCHECK: PCWSTR = w("Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\LastCheck")

public val REGSTR_PATH_LASTGOOD: PCWSTR = w("System\\LastKnownGoodRecovery\\LastGood")

public val REGSTR_PATH_LASTGOODTMP: PCWSTR = w("System\\LastKnownGoodRecovery\\LastGood.Tmp")

public val REGSTR_PATH_LASTOPTIMIZE: PCWSTR = w("Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\LastOptimize")

public val REGSTR_PATH_LOOKSCHEMES: PCWSTR = w("Control Panel\\Appearance\\Schemes")

public val REGSTR_PATH_METRICS: PCWSTR = w("Control Panel\\Desktop\\WindowMetrics")

public val REGSTR_PATH_MONITORS: PCWSTR = w("System\\CurrentControlSet\\Control\\Print\\Monitors")

public val REGSTR_PATH_MOUSE: PCWSTR = w("Control Panel\\Mouse")

public val REGSTR_PATH_MSDOSOPTS: PCWSTR = w("Software\\Microsoft\\Windows\\CurrentVersion\\MS-DOSOptions")

public val REGSTR_PATH_MULTIMEDIA_AUDIO: PCWSTR = w("Software\\Microsoft\\Multimedia\\Audio")

public val REGSTR_PATH_MULTI_FUNCTION: PCWSTR = w("MF")

public val REGSTR_PATH_NCPSERVER: PCWSTR = w("System\\CurrentControlSet\\Services\\NcpServer\\Parameters")

public val REGSTR_PATH_NETEQUIV: PCWSTR = w("Software\\Microsoft\\Windows\\CurrentVersion\\Network\\Equivalent")

public val REGSTR_PATH_NETWORK_USERSETTINGS: PCWSTR = w("Network")

public val REGSTR_PATH_NEWDOSBOX: PCWSTR = w("Software\\Microsoft\\Windows\\CurrentVersion\\MS-DOSSpecialConfig")

public val REGSTR_PATH_NONDRIVERSIGN: PCWSTR = w("Software\\Microsoft\\Non-Driver Signing")

public val REGSTR_PATH_NONDRIVERSIGN_POLICY: PCWSTR = w("Software\\Policies\\Microsoft\\Windows NT\\Non-Driver Signing")

public val REGSTR_PATH_NOSUGGMSDOS: PCWSTR = w("Software\\Microsoft\\Windows\\CurrentVersion\\NoMSDOSWarn")

public val REGSTR_PATH_NT_CURRENTVERSION: PCWSTR = w("Software\\Microsoft\\Windows NT\\CurrentVersion")

public val REGSTR_PATH_NWREDIR: PCWSTR = w("System\\CurrentControlSet\\Services\\VxD\\NWREDIR")

public val REGSTR_PATH_PCIIR: PCWSTR = w("System\\CurrentControlSet\\Control\\Pnp\\PciIrqRouting")

public val REGSTR_PATH_PER_HW_ID_STORAGE: PCWSTR = w("Software\\Microsoft\\Windows NT\\CurrentVersion\\PerHwIdStorage")

public val REGSTR_PATH_PIFCONVERT: PCWSTR = w("Software\\Microsoft\\Windows\\CurrentVersion\\PIFConvert")

public val REGSTR_PATH_POLICIES: PCWSTR = w("Software\\Microsoft\\Windows\\CurrentVersion\\Policies")

public val REGSTR_PATH_PRINT: PCWSTR = w("System\\CurrentControlSet\\Control\\Print")

public val REGSTR_PATH_PRINTERS: PCWSTR = w("System\\CurrentControlSet\\Control\\Print\\Printers")

public val REGSTR_PATH_PROPERTYSYSTEM: PCWSTR = w("Software\\Microsoft\\Windows\\CurrentVersion\\PropertySystem")

public val REGSTR_PATH_PROVIDERS: PCWSTR = w("System\\CurrentControlSet\\Control\\Print\\Providers")

public val REGSTR_PATH_PWDPROVIDER: PCWSTR = w("System\\CurrentControlSet\\Control\\PwdProvider")

public val REGSTR_PATH_REALMODENET: PCWSTR = w("Software\\Microsoft\\Windows\\CurrentVersion\\Network\\Real Mode Net")

public val REGSTR_PATH_REINSTALL: PCWSTR = w("SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Reinstall")

public val REGSTR_PATH_RELIABILITY: PCWSTR = w("Software\\Microsoft\\Windows\\CurrentVersion\\Reliability")

public val REGSTR_PATH_RELIABILITY_POLICY: PCWSTR = w("Software\\Policies\\Microsoft\\Windows NT\\Reliability")

public val REGSTR_PATH_RELIABILITY_POLICY_REPORTSNAPSHOT: PCWSTR = w("ReportSnapshot")

public val REGSTR_PATH_RELIABILITY_POLICY_SHUTDOWNREASONUI: PCWSTR = w("ShutdownReasonUI")

public val REGSTR_PATH_RELIABILITY_POLICY_SNAPSHOT: PCWSTR = w("Snapshot")

public val REGSTR_PATH_ROOT: PCWSTR = w("Enum\\Root")

public val REGSTR_PATH_RUN: PCWSTR = w("Software\\Microsoft\\Windows\\CurrentVersion\\Run")

public val REGSTR_PATH_RUNONCE: PCWSTR = w("Software\\Microsoft\\Windows\\CurrentVersion\\RunOnce")

public val REGSTR_PATH_RUNONCEEX: PCWSTR = w("Software\\Microsoft\\Windows\\CurrentVersion\\RunOnceEx")

public val REGSTR_PATH_RUNSERVICES: PCWSTR = w("Software\\Microsoft\\Windows\\CurrentVersion\\RunServices")

public val REGSTR_PATH_RUNSERVICESONCE: PCWSTR = w("Software\\Microsoft\\Windows\\CurrentVersion\\RunServicesOnce")

public val REGSTR_PATH_SCHEMES: PCWSTR = w("AppEvents\\Schemes")

public val REGSTR_PATH_SCREENSAVE: PCWSTR = w("Control Panel\\Desktop")

public val REGSTR_PATH_SERVICES: PCWSTR = w("System\\CurrentControlSet\\Services")

public val REGSTR_PATH_SETUP: PCWSTR = w("Software\\Microsoft\\Windows\\CurrentVersion")

public val REGSTR_PATH_SHUTDOWN: PCWSTR = w("System\\CurrentControlSet\\Control\\Shutdown")

public val REGSTR_PATH_SOUND: PCWSTR = w("Control Panel\\Sound")

public val REGSTR_PATH_SYSTEMENUM: PCWSTR = w("System\\CurrentControlSet\\Enum")

public val REGSTR_PATH_SYSTRAY: PCWSTR = w("Software\\Microsoft\\Windows\\CurrentVersion\\Applets\\SysTray")

public val REGSTR_PATH_TIMEZONE: PCWSTR = w("System\\CurrentControlSet\\Control\\TimeZoneInformation")

public val REGSTR_PATH_UNINSTALL: PCWSTR = w("Software\\Microsoft\\Windows\\CurrentVersion\\Uninstall")

public val REGSTR_PATH_UPDATE: PCWSTR = w("System\\CurrentControlSet\\Control\\Update")

public val REGSTR_PATH_VCOMM: PCWSTR = w("System\\CurrentControlSet\\Services\\VxD\\VCOMM")

public val REGSTR_PATH_VMM: PCWSTR = w("System\\CurrentControlSet\\Services\\VxD\\VMM")

public val REGSTR_PATH_VMM32FILES: PCWSTR = w("System\\CurrentControlSet\\Control\\VMM32Files")

public val REGSTR_PATH_VNETSUP: PCWSTR = w("System\\CurrentControlSet\\Services\\VxD\\VNETSUP")

public val REGSTR_PATH_VOLUMECACHE: PCWSTR = w("Software\\Microsoft\\Windows\\CurrentVersion\\Explorer\\VolumeCaches")

public val REGSTR_PATH_VPOWERD: PCWSTR = w("System\\CurrentControlSet\\Services\\VxD\\VPOWERD")

public val REGSTR_PATH_VXD: PCWSTR = w("System\\CurrentControlSet\\Services\\VxD")

public val REGSTR_PATH_WARNVERDLLS: PCWSTR = w("System\\CurrentControlSet\\Control\\SessionManager\\WarnVerDLLs")

public val REGSTR_PATH_WINBOOT: PCWSTR = w("System\\CurrentControlSet\\Control\\WinBoot")

public val REGSTR_PATH_WINDOWSAPPLETS: PCWSTR = w("Software\\Microsoft\\Windows\\CurrentVersion\\Applets")

public val REGSTR_PATH_WINLOGON: PCWSTR = w("Software\\Microsoft\\Windows\\CurrentVersion\\Winlogon")

public val REGSTR_PATH_WMI_SECURITY: PCWSTR = w("System\\CurrentControlSet\\Control\\Wmi\\Security")

public val REGSTR_PCI_DUAL_IDE: PCWSTR = w("PCIDualIDE")

public val REGSTR_PCI_OPTIONS: PCWSTR = w("Options")

public val REGSTR_VALUE_DEFAULTLOC: PCWSTR = w("UseDefaultNetLocation")

public val REGSTR_VALUE_ENABLE: PCWSTR = w("Enable")

public val REGSTR_VALUE_LOWPOWERACTIVE: PCWSTR = w("ScreenSaveLowPowerActive")

public val REGSTR_VALUE_LOWPOWERTIMEOUT: PCWSTR = w("ScreenSaveLowPowerTimeout")

public val REGSTR_VALUE_NETPATH: PCWSTR = w("NetworkPath")

public val REGSTR_VALUE_POWEROFFACTIVE: PCWSTR = w("ScreenSavePowerOffActive")

public val REGSTR_VALUE_POWEROFFTIMEOUT: PCWSTR = w("ScreenSavePowerOffTimeout")

public val REGSTR_VALUE_SCRPASSWORD: PCWSTR = w("ScreenSave_Data")

public val REGSTR_VALUE_USESCRPASSWORD: PCWSTR = w("ScreenSaveUsePassword")

public val REGSTR_VALUE_VERBOSE: PCWSTR = w("Verbose")

public val REGSTR_VAL_ACDRIVESPINDOWN: PCWSTR = w("ACDriveSpinDown")

public val REGSTR_VAL_ACSPINDOWNPREVIOUS: PCWSTR = w("ACSpinDownPrevious")

public val REGSTR_VAL_ACTIVESERVICE: PCWSTR = w("ActiveService")

public val REGSTR_VAL_ADDRESS: PCWSTR = w("Address")

public val REGSTR_VAL_AEDEBUG_AUTO: PCWSTR = w("Auto")

public val REGSTR_VAL_AEDEBUG_DEBUGGER: PCWSTR = w("Debugger")

public val REGSTR_VAL_ALPHANUMPWDS: PCWSTR = w("AlphanumPwds")

public val REGSTR_VAL_APISUPPORT: PCWSTR = w("APISupport")

public val REGSTR_VAL_APMACTIMEOUT: PCWSTR = w("APMACTimeout")

public val REGSTR_VAL_APMBATTIMEOUT: PCWSTR = w("APMBatTimeout")

public val REGSTR_VAL_APMBIOSVER: PCWSTR = w("APMBiosVer")

public val REGSTR_VAL_APMFLAGS: PCWSTR = w("APMFlags")

public val REGSTR_VAL_APMMENUSUSPEND: PCWSTR = w("APMMenuSuspend")

public val REGSTR_VAL_APMSHUTDOWNPOWER: PCWSTR = w("APMShutDownPower")

public val REGSTR_VAL_APPINSTPATH: PCWSTR = w("AppInstallPath")

public val REGSTR_VAL_ASKFORCONFIG: PCWSTR = w("AskForConfig")

public val REGSTR_VAL_ASKFORCONFIGFUNC: PCWSTR = w("AskForConfigFunc")

public val REGSTR_VAL_ASYNCFILECOMMIT: PCWSTR = w("AsyncFileCommit")

public val REGSTR_VAL_AUDIO_BITMAP: PCWSTR = w("bitmap")

public val REGSTR_VAL_AUDIO_ICON: PCWSTR = w("icon")

public val REGSTR_VAL_AUTHENT_AGENT: PCWSTR = w("AuthenticatingAgent")

public val REGSTR_VAL_AUTOEXEC: PCWSTR = w("Autoexec.Bat")

public val REGSTR_VAL_AUTOINSNOTE: PCWSTR = w("AutoInsertNotification")

public val REGSTR_VAL_AUTOLOGON: PCWSTR = w("AutoLogon")

public val REGSTR_VAL_AUTOMOUNT: PCWSTR = w("AutoMountDrives")

public val REGSTR_VAL_AUTOSTART: PCWSTR = w("AutoStart")

public val REGSTR_VAL_BASICPROPERTIES: PCWSTR = w("BasicProperties")

public val REGSTR_VAL_BASICPROPERTIES_32: PCWSTR = w("BasicProperties32")

public val REGSTR_VAL_BATDRIVESPINDOWN: PCWSTR = w("BatDriveSpinDown")

public val REGSTR_VAL_BATSPINDOWNPREVIOUS: PCWSTR = w("BatSpinDownPrevious")

public val REGSTR_VAL_BEHAVIOR_ON_FAILED_VERIFY: PCWSTR = w("BehaviorOnFailedVerify")

public val REGSTR_VAL_BIOSDATE: PCWSTR = w("BIOSDate")

public val REGSTR_VAL_BIOSNAME: PCWSTR = w("BIOSName")

public val REGSTR_VAL_BIOSVERSION: PCWSTR = w("BIOSVersion")

public val REGSTR_VAL_BITSPERPIXEL: PCWSTR = w("BitsPerPixel")

public val REGSTR_VAL_BOOTCONFIG: PCWSTR = w("BootConfig")

public val REGSTR_VAL_BOOTCOUNT: PCWSTR = w("BootCount")

public val REGSTR_VAL_BOOTDIR: PCWSTR = w("BootDir")

public val REGSTR_VAL_BPP: PCWSTR = w("BPP")

public val REGSTR_VAL_BT: PCWSTR = w("6005BT")

public val REGSTR_VAL_BUFFAGETIMEOUT: PCWSTR = w("BufferAgeTimeout")

public val REGSTR_VAL_BUFFIDLETIMEOUT: PCWSTR = w("BufferIdleTimeout")

public val REGSTR_VAL_BUSTYPE: PCWSTR = w("BusType")

public val REGSTR_VAL_CAPABILITIES: PCWSTR = w("Capabilities")

public val REGSTR_VAL_CARDSPECIFIC: PCWSTR = w("CardSpecific")

public val REGSTR_VAL_CDCACHESIZE: PCWSTR = w("CacheSize")

public val REGSTR_VAL_CDCOMPATNAMES: PCWSTR = w("MSCDEXCompatNames")

public val REGSTR_VAL_CDEXTERRORS: PCWSTR = w("ExtendedErrors")

public val REGSTR_VAL_CDNOREADAHEAD: PCWSTR = w("NoReadAhead")

public val REGSTR_VAL_CDPREFETCH: PCWSTR = w("Prefetch")

public val REGSTR_VAL_CDPREFETCHTAIL: PCWSTR = w("PrefetchTail")

public val REGSTR_VAL_CDRAWCACHE: PCWSTR = w("RawCache")

public val REGSTR_VAL_CDROM: PCWSTR = w("GenCD")

public val REGSTR_VAL_CDROMCLASSNAME: PCWSTR = w("CDROM")

public val REGSTR_VAL_CDSHOWVERSIONS: PCWSTR = w("ShowVersions")

public val REGSTR_VAL_CDSVDSENSE: PCWSTR = w("SVDSense")

public val REGSTR_VAL_CHECKSUM: PCWSTR = w("CurrentChecksum")

public val REGSTR_VAL_CLASS: PCWSTR = w("Class")

public val REGSTR_VAL_CLASSDESC: PCWSTR = w("ClassDesc")

public val REGSTR_VAL_CLASSGUID: PCWSTR = w("ClassGUID")

public val REGSTR_VAL_CMDRIVFLAGS: PCWSTR = w("CMDrivFlags")

public val REGSTR_VAL_CMENUMFLAGS: PCWSTR = w("CMEnumFlags")

public val REGSTR_VAL_COINSTALLERS_32: PCWSTR = w("CoInstallers32")

public val REGSTR_VAL_COMINFO: PCWSTR = w("ComInfo")

public val REGSTR_VAL_COMMENT: PCWSTR = w("Comment")

public val REGSTR_VAL_COMPATIBLEIDS: PCWSTR = w("CompatibleIDs")

public val REGSTR_VAL_COMPRESSIONMETHOD: PCWSTR = w("CompressionAlgorithm")

public val REGSTR_VAL_COMPRESSIONTHRESHOLD: PCWSTR = w("CompressionThreshold")

public val REGSTR_VAL_COMPUTERNAME: PCWSTR = w("ComputerName")

public val REGSTR_VAL_COMPUTRNAME: PCWSTR = w("ComputerName")

public val REGSTR_VAL_COMVERIFYBASE: PCWSTR = w("COMVerifyBase")

public val REGSTR_VAL_CONFIG: PCWSTR = w("ConfigPath")

public val REGSTR_VAL_CONFIGFLAGS: PCWSTR = w("ConfigFlags")

public val REGSTR_VAL_CONFIGMG: PCWSTR = w("CONFIGMG")

public val REGSTR_VAL_CONFIGSYS: PCWSTR = w("Config.Sys")

public val REGSTR_VAL_CONNECTION_TYPE: PCWSTR = w("ConnectionType")

public val REGSTR_VAL_CONTAINERID: PCWSTR = w("ContainerID")

public val REGSTR_VAL_CONTIGFILEALLOC: PCWSTR = w("ContigFileAllocSize")

public val REGSTR_VAL_CONVMEM: PCWSTR = w("ConvMem")

public val REGSTR_VAL_CPU: PCWSTR = w("CPU")

public val REGSTR_VAL_CRASHFUNCS: PCWSTR = w("CrashFuncs")

public val REGSTR_VAL_CSCONFIGFLAGS: PCWSTR = w("CSConfigFlags")

public val REGSTR_VAL_CURCONFIG: PCWSTR = w("CurrentConfig")

public val REGSTR_VAL_CURDRVLET: PCWSTR = w("CurrentDriveLetterAssignment")

public val REGSTR_VAL_CURRENTCONFIG: PCWSTR = w("CurrentConfig")

public val REGSTR_VAL_CURRENT_BUILD: PCWSTR = w("CurrentBuildNumber")

public val REGSTR_VAL_CURRENT_CSDVERSION: PCWSTR = w("CSDVersion")

public val REGSTR_VAL_CURRENT_TYPE: PCWSTR = w("CurrentType")

public val REGSTR_VAL_CURRENT_USER: PCWSTR = w("Current User")

public val REGSTR_VAL_CURRENT_VERSION: PCWSTR = w("CurrentVersion")

public val REGSTR_VAL_CUSTOMCOLORS: PCWSTR = w("CustomColors")

public val REGSTR_VAL_CUSTOM_PROPERTY_CACHE_DATE: PCWSTR = w("CustomPropertyCacheDate")

public val REGSTR_VAL_CUSTOM_PROPERTY_HW_ID_KEY: PCWSTR = w("CustomPropertyHwIdKey")

public val REGSTR_VAL_DEFAULT: PCWSTR = w("Default")

public val REGSTR_VAL_DETCONFIG: PCWSTR = w("DetConfig")

public val REGSTR_VAL_DETECT: PCWSTR = w("Detect")

public val REGSTR_VAL_DETECTFUNC: PCWSTR = w("DetectFunc")

public val REGSTR_VAL_DETFLAGS: PCWSTR = w("DetFlags")

public val REGSTR_VAL_DETFUNC: PCWSTR = w("DetFunc")

public val REGSTR_VAL_DEVDESC: PCWSTR = w("DeviceDesc")

public val REGSTR_VAL_DEVICEDRIVER: PCWSTR = w("DeviceDriver")

public val REGSTR_VAL_DEVICEPATH: PCWSTR = w("DevicePath")

public val REGSTR_VAL_DEVICE_CHARACTERISTICS: PCWSTR = w("DeviceCharacteristics")

public val REGSTR_VAL_DEVICE_EXCLUSIVE: PCWSTR = w("Exclusive")

public val REGSTR_VAL_DEVICE_INSTANCE: PCWSTR = w("DeviceInstance")

public val REGSTR_VAL_DEVICE_SECURITY_DESCRIPTOR: PCWSTR = w("Security")

public val REGSTR_VAL_DEVICE_TYPE: PCWSTR = w("DeviceType")

public val REGSTR_VAL_DEVLOADER: PCWSTR = w("DevLoader")

public val REGSTR_VAL_DEVTYPE: PCWSTR = w("DeviceType")

public val REGSTR_VAL_DIRECTHOST: PCWSTR = w("DirectHost")

public val REGSTR_VAL_DIRTYSHUTDOWN: PCWSTR = w("DirtyShutdown")

public val REGSTR_VAL_DIRTYSHUTDOWNTIME: PCWSTR = w("DirtyShutdownTime")

public val REGSTR_VAL_DISABLECOUNT: PCWSTR = w("DisableCount")

public val REGSTR_VAL_DISABLEPWDCACHING: PCWSTR = w("DisablePwdCaching")

public val REGSTR_VAL_DISABLEREGTOOLS: PCWSTR = w("DisableRegistryTools")

public val REGSTR_VAL_DISCONNECT: PCWSTR = w("Disconnect")

public val REGSTR_VAL_DISK: PCWSTR = w("GenDisk")

public val REGSTR_VAL_DISKCLASSNAME: PCWSTR = w("DiskDrive")

public val REGSTR_VAL_DISPCPL_NOAPPEARANCEPAGE: PCWSTR = w("NoDispAppearancePage")

public val REGSTR_VAL_DISPCPL_NOBACKGROUNDPAGE: PCWSTR = w("NoDispBackgroundPage")

public val REGSTR_VAL_DISPCPL_NODISPCPL: PCWSTR = w("NoDispCPL")

public val REGSTR_VAL_DISPCPL_NOSCRSAVPAGE: PCWSTR = w("NoDispScrSavPage")

public val REGSTR_VAL_DISPCPL_NOSETTINGSPAGE: PCWSTR = w("NoDispSettingsPage")

public val REGSTR_VAL_DISPLAY: PCWSTR = w("display")

public val REGSTR_VAL_DISPLAYFLAGS: PCWSTR = w("DisplayFlags")

public val REGSTR_VAL_DOCKED: PCWSTR = w("CurrentDockedState")

public val REGSTR_VAL_DOCKSTATE: PCWSTR = w("DockState")

public val REGSTR_VAL_DOES_POLLING: PCWSTR = w("PollingSupportNeeded")

public val REGSTR_VAL_DONTLOADIFCONFLICT: PCWSTR = w("DontLoadIfConflict")

public val REGSTR_VAL_DONTUSEMEM: PCWSTR = w("DontAllocLastMem")

public val REGSTR_VAL_DOSCP: PCWSTR = w("OEMCP")

public val REGSTR_VAL_DOSOPTFLAGS: PCWSTR = w("Flags")

public val REGSTR_VAL_DOSOPTGLOBALFLAGS: PCWSTR = w("GlobalFlags")

public val REGSTR_VAL_DOSOPTTIP: PCWSTR = w("TipText")

public val REGSTR_VAL_DOSPAGER: PCWSTR = w("DOSPager")

public val REGSTR_VAL_DOS_SPOOL_MASK: PCWSTR = w("DOSSpoolMask")

public val REGSTR_VAL_DOUBLEBUFFER: PCWSTR = w("DoubleBuffer")

public val REGSTR_VAL_DPI: PCWSTR = w("dpi")

public val REGSTR_VAL_DPILOGICALX: PCWSTR = w("DPILogicalX")

public val REGSTR_VAL_DPILOGICALY: PCWSTR = w("DPILogicalY")

public val REGSTR_VAL_DPIPHYSICALX: PCWSTR = w("DPIPhysicalX")

public val REGSTR_VAL_DPIPHYSICALY: PCWSTR = w("DPIPhysicalY")

public val REGSTR_VAL_DPMS: PCWSTR = w("DPMS")

public val REGSTR_VAL_DRIVER: PCWSTR = w("Driver")

public val REGSTR_VAL_DRIVERCACHEPATH: PCWSTR = w("DriverCachePath")

public val REGSTR_VAL_DRIVERDATE: PCWSTR = w("DriverDate")

public val REGSTR_VAL_DRIVERDATEDATA: PCWSTR = w("DriverDateData")

public val REGSTR_VAL_DRIVERVERSION: PCWSTR = w("DriverVersion")

public val REGSTR_VAL_DRIVESPINDOWN: PCWSTR = w("DriveSpinDown")

public val REGSTR_VAL_DRIVEWRITEBEHIND: PCWSTR = w("DriveWriteBehind")

public val REGSTR_VAL_DRIVE_SPINDOWN: PCWSTR = w("NoDispSpinDown")

public val REGSTR_VAL_DRV: PCWSTR = w("drv")

public val REGSTR_VAL_DRVDESC: PCWSTR = w("DriverDesc")

public val REGSTR_VAL_DYNAMIC: PCWSTR = w("Dynamic")

public val REGSTR_VAL_EISA_FLAGS: PCWSTR = w("EISAFlags")

public val REGSTR_VAL_EISA_FUNCTIONS: PCWSTR = w("EISAFunctions")

public val REGSTR_VAL_EISA_FUNCTIONS_MASK: PCWSTR = w("EISAFunctionsMask")

public val REGSTR_VAL_EISA_RANGES: PCWSTR = w("EISARanges")

public val REGSTR_VAL_EISA_SIMULATE_INT15: PCWSTR = w("EISASimulateInt15")

public val REGSTR_VAL_EJECT_PRIORITY: PCWSTR = w("EjectPriority")

public val REGSTR_VAL_ENABLEINTS: PCWSTR = w("EnableInts")

public val REGSTR_VAL_ENUMERATOR: PCWSTR = w("Enumerator")

public val REGSTR_VAL_ENUMPROPPAGES: PCWSTR = w("EnumPropPages")

public val REGSTR_VAL_ENUMPROPPAGES_32: PCWSTR = w("EnumPropPages32")

public val REGSTR_VAL_ESDI: PCWSTR = w("ESDI\\")

public val REGSTR_VAL_EXISTS: PCWSTR = w("Exists")

public val REGSTR_VAL_EXTMEM: PCWSTR = w("ExtMem")

public val REGSTR_VAL_FAULT_LOGFILE: PCWSTR = w("LogFile")

public val REGSTR_VAL_FIFODEPTH: PCWSTR = w("FIFODepth")

public val REGSTR_VAL_FILESHARING: PCWSTR = w("FileSharing")

public val REGSTR_VAL_FIRSTINSTALLDATETIME: PCWSTR = w("FirstInstallDateTime")

public val REGSTR_VAL_FIRSTNETDRIVE: PCWSTR = w("FirstNetworkDrive")

public val REGSTR_VAL_FLOP: PCWSTR = w("FLOP\\")

public val REGSTR_VAL_FLOPPY: PCWSTR = w("FLOPPY")

public val REGSTR_VAL_FONTSIZE: PCWSTR = w("FontSize")

public val REGSTR_VAL_FORCECL: PCWSTR = w("ForceChangeLine")

public val REGSTR_VAL_FORCEDCONFIG: PCWSTR = w("ForcedConfig")

public val REGSTR_VAL_FORCEFIFO: PCWSTR = w("ForceFIFO")

public val REGSTR_VAL_FORCELOAD: PCWSTR = w("ForceLoadPD")

public val REGSTR_VAL_FORCEPMIO: PCWSTR = w("ForcePMIO")

public val REGSTR_VAL_FORCEREBOOT: PCWSTR = w("ForceReboot")

public val REGSTR_VAL_FORCERMIO: PCWSTR = w("ForceRMIO")

public val REGSTR_VAL_FREESPACERATIO: PCWSTR = w("FreeSpaceRatio")

public val REGSTR_VAL_FRIENDLYNAME: PCWSTR = w("FriendlyName")

public val REGSTR_VAL_FSFILTERCLASS: PCWSTR = w("FSFilterClass")

public val REGSTR_VAL_FULLTRACE: PCWSTR = w("FullTrace")

public val REGSTR_VAL_FUNCDESC: PCWSTR = w("FunctionDesc")

public val REGSTR_VAL_GAPTIME: PCWSTR = w("GapTime")

public val REGSTR_VAL_GRB: PCWSTR = w("grb")

public val REGSTR_VAL_HARDWAREID: PCWSTR = w("HardwareID")

public val REGSTR_VAL_HIDESHAREPWDS: PCWSTR = w("HideSharePwds")

public val REGSTR_VAL_HRES: PCWSTR = w("HRes")

public val REGSTR_VAL_HWDETECT: PCWSTR = w("HardwareDetect")

public val REGSTR_VAL_HWMECHANISM: PCWSTR = w("HWMechanism")

public val REGSTR_VAL_HWREV: PCWSTR = w("HWRevision")

public val REGSTR_VAL_ID: PCWSTR = w("CurrentID")

public val REGSTR_VAL_IDE_FORCE_SERIALIZE: PCWSTR = w("ForceSerialization")

public val REGSTR_VAL_IDE_NO_SERIALIZE: PCWSTR = w("IDENoSerialize")

public val REGSTR_VAL_INFNAME: PCWSTR = w("InfName")

public val REGSTR_VAL_INFPATH: PCWSTR = w("InfPath")

public val REGSTR_VAL_INFSECTION: PCWSTR = w("InfSection")

public val REGSTR_VAL_INFSECTIONEXT: PCWSTR = w("InfSectionExt")

public val REGSTR_VAL_INHIBITRESULTS: PCWSTR = w("InhibitResults")

public val REGSTR_VAL_INSICON: PCWSTR = w("Icon")

public val REGSTR_VAL_INSTALLER: PCWSTR = w("Installer")

public val REGSTR_VAL_INSTALLER_32: PCWSTR = w("Installer32")

public val REGSTR_VAL_INSTALLTYPE: PCWSTR = w("InstallType")

public val REGSTR_VAL_INT13: PCWSTR = w("Int13")

public val REGSTR_VAL_ISAPNP: PCWSTR = w("ISAPNP")

public val REGSTR_VAL_ISAPNP_RDP_OVERRIDE: PCWSTR = w("RDPOverRide")

public val REGSTR_VAL_JOYCALLOUT: PCWSTR = w("JoystickCallout")

public val REGSTR_VAL_JOYNCONFIG: PCWSTR = w("Joystick%dConfiguration")

public val REGSTR_VAL_JOYNOEMCALLOUT: PCWSTR = w("Joystick%dOEMCallout")

public val REGSTR_VAL_JOYNOEMNAME: PCWSTR = w("Joystick%dOEMName")

public val REGSTR_VAL_JOYOEMCAL1: PCWSTR = w("OEMCal1")

public val REGSTR_VAL_JOYOEMCAL10: PCWSTR = w("OEMCal10")

public val REGSTR_VAL_JOYOEMCAL11: PCWSTR = w("OEMCal11")

public val REGSTR_VAL_JOYOEMCAL12: PCWSTR = w("OEMCal12")

public val REGSTR_VAL_JOYOEMCAL2: PCWSTR = w("OEMCal2")

public val REGSTR_VAL_JOYOEMCAL3: PCWSTR = w("OEMCal3")

public val REGSTR_VAL_JOYOEMCAL4: PCWSTR = w("OEMCal4")

public val REGSTR_VAL_JOYOEMCAL5: PCWSTR = w("OEMCal5")

public val REGSTR_VAL_JOYOEMCAL6: PCWSTR = w("OEMCal6")

public val REGSTR_VAL_JOYOEMCAL7: PCWSTR = w("OEMCal7")

public val REGSTR_VAL_JOYOEMCAL8: PCWSTR = w("OEMCal8")

public val REGSTR_VAL_JOYOEMCAL9: PCWSTR = w("OEMCal9")

public val REGSTR_VAL_JOYOEMCALCAP: PCWSTR = w("OEMCalCap")

public val REGSTR_VAL_JOYOEMCALLOUT: PCWSTR = w("OEMCallout")

public val REGSTR_VAL_JOYOEMCALWINCAP: PCWSTR = w("OEMCalWinCap")

public val REGSTR_VAL_JOYOEMDATA: PCWSTR = w("OEMData")

public val REGSTR_VAL_JOYOEMNAME: PCWSTR = w("OEMName")

public val REGSTR_VAL_JOYOEMPOVLABEL: PCWSTR = w("OEMPOVLabel")

public val REGSTR_VAL_JOYOEMRLABEL: PCWSTR = w("OEMRLabel")

public val REGSTR_VAL_JOYOEMTESTBUTTONCAP: PCWSTR = w("OEMTestButtonCap")

public val REGSTR_VAL_JOYOEMTESTBUTTONDESC: PCWSTR = w("OEMTestButtonDesc")

public val REGSTR_VAL_JOYOEMTESTMOVECAP: PCWSTR = w("OEMTestMoveCap")

public val REGSTR_VAL_JOYOEMTESTMOVEDESC: PCWSTR = w("OEMTestMoveDesc")

public val REGSTR_VAL_JOYOEMTESTWINCAP: PCWSTR = w("OEMTestWinCap")

public val REGSTR_VAL_JOYOEMULABEL: PCWSTR = w("OEMULabel")

public val REGSTR_VAL_JOYOEMVLABEL: PCWSTR = w("OEMVLabel")

public val REGSTR_VAL_JOYOEMXYLABEL: PCWSTR = w("OEMXYLabel")

public val REGSTR_VAL_JOYOEMZLABEL: PCWSTR = w("OEMZLabel")

public val REGSTR_VAL_JOYUSERVALUES: PCWSTR = w("JoystickUserValues")

public val REGSTR_VAL_LASTALIVEBT: PCWSTR = w("LastAliveBT")

public val REGSTR_VAL_LASTALIVEINTERVAL: PCWSTR = w("TimeStampInterval")

public val REGSTR_VAL_LASTALIVEPMPOLICY: PCWSTR = w("LastAlivePMPolicy")

public val REGSTR_VAL_LASTALIVESTAMP: PCWSTR = w("LastAliveStamp")

public val REGSTR_VAL_LASTALIVESTAMPFORCED: PCWSTR = w("LastAliveStampForced")

public val REGSTR_VAL_LASTALIVESTAMPINTERVAL: PCWSTR = w("LastAliveStampInterval")

public val REGSTR_VAL_LASTALIVESTAMPPOLICYINTERVAL: PCWSTR = w("LastAliveStampPolicyInterval")

public val REGSTR_VAL_LASTALIVEUPTIME: PCWSTR = w("LastAliveUptime")

public val REGSTR_VAL_LASTBOOTPMDRVS: PCWSTR = w("LastBootPMDrvs")

public val REGSTR_VAL_LASTCOMPUTERNAME: PCWSTR = w("LastComputerName")

public val REGSTR_VAL_LASTPCIBUSNUM: PCWSTR = w("LastPCIBusNum")

public val REGSTR_VAL_LAST_UPDATE_TIME: PCWSTR = w("LastUpdateTime")

public val REGSTR_VAL_LEGALNOTICECAPTION: PCWSTR = w("LegalNoticeCaption")

public val REGSTR_VAL_LEGALNOTICETEXT: PCWSTR = w("LegalNoticeText")

public val REGSTR_VAL_LICENSINGINFO: PCWSTR = w("LicensingInfo")

public val REGSTR_VAL_LINKED: PCWSTR = w("Linked")

public val REGSTR_VAL_LOADHI: PCWSTR = w("LoadHi")

public val REGSTR_VAL_LOADRMDRIVERS: PCWSTR = w("LoadRMDrivers")

public val REGSTR_VAL_LOCATION_INFORMATION: PCWSTR = w("LocationInformation")

public val REGSTR_VAL_LOCATION_INFORMATION_OVERRIDE: PCWSTR = w("LocationInformationOverride")

public val REGSTR_VAL_LOWERFILTERS: PCWSTR = w("LowerFilters")

public val REGSTR_VAL_LOWER_FILTER_DEFAULT_LEVEL: PCWSTR = w("LowerFilterDefaultLevel")

public val REGSTR_VAL_LOWER_FILTER_LEVELS: PCWSTR = w("LowerFilterLevels")

public val REGSTR_VAL_MACHINETYPE: PCWSTR = w("MachineType")

public val REGSTR_VAL_MANUFACTURER: PCWSTR = w("Manufacturer")

public val REGSTR_VAL_MAP: PCWSTR = w("Map")

public val REGSTR_VAL_MATCHINGDEVID: PCWSTR = w("MatchingDeviceId")

public val REGSTR_VAL_MAXCONNECTIONS: PCWSTR = w("MaxConnections")

public val REGSTR_VAL_MAXLIP: PCWSTR = w("MaxLIP")

public val REGSTR_VAL_MAXRES: PCWSTR = w("MaxResolution")

public val REGSTR_VAL_MAXRETRY: PCWSTR = w("MaxRetry")

public val REGSTR_VAL_MAX_HCID_LEN: UInt = 1024u

public val REGSTR_VAL_MEDIA: PCWSTR = w("MediaPath")

public val REGSTR_VAL_MFG: PCWSTR = w("Mfg")

public val REGSTR_VAL_MF_FLAGS: PCWSTR = w("MFFlags")

public val REGSTR_VAL_MINIPORT_STAT: PCWSTR = w("MiniportStatus")

public val REGSTR_VAL_MINPWDLEN: PCWSTR = w("MinPwdLen")

public val REGSTR_VAL_MINRETRY: PCWSTR = w("MinRetry")

public val REGSTR_VAL_MODE: PCWSTR = w("Mode")

public val REGSTR_VAL_MODEL: PCWSTR = w("Model")

public val REGSTR_VAL_MSDOSMODE: PCWSTR = w("MSDOSMode")

public val REGSTR_VAL_MSDOSMODEDISCARD: PCWSTR = w("Discard")

public val REGSTR_VAL_MUSTBEVALIDATED: PCWSTR = w("MustBeValidated")

public val REGSTR_VAL_NAMECACHECOUNT: PCWSTR = w("NameCache")

public val REGSTR_VAL_NAMENUMERICTAIL: PCWSTR = w("NameNumericTail")

public val REGSTR_VAL_NCP_BROWSEMASTER: PCWSTR = w("BrowseMaster")

public val REGSTR_VAL_NCP_USEPEERBROWSING: PCWSTR = w("Use_PeerBrowsing")

public val REGSTR_VAL_NCP_USESAP: PCWSTR = w("Use_Sap")

public val REGSTR_VAL_NDP: PCWSTR = w("NDP")

public val REGSTR_VAL_NETCARD: PCWSTR = w("Netcard")

public val REGSTR_VAL_NETCLEAN: PCWSTR = w("NetClean")

public val REGSTR_VAL_NETOSTYPE: PCWSTR = w("NetOSType")

public val REGSTR_VAL_NETSETUP_DISABLE: PCWSTR = w("NoNetSetup")

public val REGSTR_VAL_NETSETUP_NOCONFIGPAGE: PCWSTR = w("NoNetSetupConfigPage")

public val REGSTR_VAL_NETSETUP_NOIDPAGE: PCWSTR = w("NoNetSetupIDPage")

public val REGSTR_VAL_NETSETUP_NOSECURITYPAGE: PCWSTR = w("NoNetSetupSecurityPage")

public val REGSTR_VAL_NOCMOSORFDPT: PCWSTR = w("NoCMOSorFDPT")

public val REGSTR_VAL_NODISPLAYCLASS: PCWSTR = w("NoDisplayClass")

public val REGSTR_VAL_NOENTIRENETWORK: PCWSTR = w("NoEntireNetwork")

public val REGSTR_VAL_NOFILESHARING: PCWSTR = w("NoFileSharing")

public val REGSTR_VAL_NOFILESHARINGCTRL: PCWSTR = w("NoFileSharingControl")

public val REGSTR_VAL_NOIDE: PCWSTR = w("NoIDE")

public val REGSTR_VAL_NOINSTALLCLASS: PCWSTR = w("NoInstallClass")

public val REGSTR_VAL_NONSTANDARD_ATAPI: PCWSTR = w("NonStandardATAPI")

public val REGSTR_VAL_NOPRINTSHARING: PCWSTR = w("NoPrintSharing")

public val REGSTR_VAL_NOPRINTSHARINGCTRL: PCWSTR = w("NoPrintSharingControl")

public val REGSTR_VAL_NOUSECLASS: PCWSTR = w("NoUseClass")

public val REGSTR_VAL_NOWORKGROUPCONTENTS: PCWSTR = w("NoWorkgroupContents")

public val REGSTR_VAL_OLDMSDOSVER: PCWSTR = w("OldMSDOSVer")

public val REGSTR_VAL_OLDWINDIR: PCWSTR = w("OldWinDir")

public val REGSTR_VAL_OPTIMIZESFN: PCWSTR = w("OptimizeSFN")

public val REGSTR_VAL_OPTIONS: PCWSTR = w("Options")

public val REGSTR_VAL_OPTORDER: PCWSTR = w("Order")

public val REGSTR_VAL_P1284MDL: PCWSTR = w("Model")

public val REGSTR_VAL_P1284MFG: PCWSTR = w("Manufacturer")

public val REGSTR_VAL_PATHCACHECOUNT: PCWSTR = w("PathCache")

public val REGSTR_VAL_PCCARD_POWER: PCWSTR = w("EnablePowerManagement")

public val REGSTR_VAL_PCI: PCWSTR = w("PCI")

public val REGSTR_VAL_PCIBIOSVER: PCWSTR = w("PCIBIOSVer")

public val REGSTR_VAL_PCICIRQMAP: PCWSTR = w("PCICIRQMap")

public val REGSTR_VAL_PCICOPTIONS: PCWSTR = w("PCICOptions")

public val REGSTR_VAL_PCMCIA_ALLOC: PCWSTR = w("AllocMemWin")

public val REGSTR_VAL_PCMCIA_ATAD: PCWSTR = w("ATADelay")

public val REGSTR_VAL_PCMCIA_MEM: PCWSTR = w("Memory")

public val REGSTR_VAL_PCMCIA_OPT: PCWSTR = w("Options")

public val REGSTR_VAL_PCMCIA_SIZ: PCWSTR = w("MinRegionSize")

public val REGSTR_VAL_PCMTDRIVER: PCWSTR = w("MTD")

public val REGSTR_VAL_PCSSDRIVER: PCWSTR = w("Driver")

public val REGSTR_VAL_PHYSICALDEVICEOBJECT: PCWSTR = w("PhysicalDeviceObject")

public val REGSTR_VAL_PMODE_INT13: PCWSTR = w("PModeInt13")

public val REGSTR_VAL_PNPBIOSVER: PCWSTR = w("PnPBIOSVer")

public val REGSTR_VAL_PNPSTRUCOFFSET: PCWSTR = w("PnPStrucOffset")

public val REGSTR_VAL_POLICY: PCWSTR = w("Policy")

public val REGSTR_VAL_POLLING: PCWSTR = w("Polling")

public val REGSTR_VAL_PORTNAME: PCWSTR = w("PortName")

public val REGSTR_VAL_PORTSUBCLASS: PCWSTR = w("PortSubClass")

public val REGSTR_VAL_PREFREDIR: PCWSTR = w("PreferredRedir")

public val REGSTR_VAL_PRESERVECASE: PCWSTR = w("PreserveCase")

public val REGSTR_VAL_PRESERVELONGNAMES: PCWSTR = w("PreserveLongNames")

public val REGSTR_VAL_PRINTERS_HIDETABS: PCWSTR = w("NoPrinterTabs")

public val REGSTR_VAL_PRINTERS_MASK: PCWSTR = w("PrintersMask")

public val REGSTR_VAL_PRINTERS_NOADD: PCWSTR = w("NoAddPrinter")

public val REGSTR_VAL_PRINTERS_NODELETE: PCWSTR = w("NoDeletePrinter")

public val REGSTR_VAL_PRINTSHARING: PCWSTR = w("PrintSharing")

public val REGSTR_VAL_PRIORITY: PCWSTR = w("Priority")

public val REGSTR_VAL_PRIVATE: PCWSTR = w("Private")

public val REGSTR_VAL_PRIVATEFUNC: PCWSTR = w("PrivateFunc")

public val REGSTR_VAL_PRIVATEPROBLEM: PCWSTR = w("PrivateProblem")

public val REGSTR_VAL_PRODUCTID: PCWSTR = w("ProductId")

public val REGSTR_VAL_PRODUCTTYPE: PCWSTR = w("ProductType")

public val REGSTR_VAL_PROFILEFLAGS: PCWSTR = w("ProfileFlags")

public val REGSTR_VAL_PROPERTIES: PCWSTR = w("Properties")

public val REGSTR_VAL_PROTINIPATH: PCWSTR = w("ProtIniPath")

public val REGSTR_VAL_PROVIDER_NAME: PCWSTR = w("ProviderName")

public val REGSTR_VAL_PWDEXPIRATION: PCWSTR = w("PwdExpiration")

public val REGSTR_VAL_PWDPROVIDER_CHANGEORDER: PCWSTR = w("ChangeOrder")

public val REGSTR_VAL_PWDPROVIDER_CHANGEPWD: PCWSTR = w("ChangePassword")

public val REGSTR_VAL_PWDPROVIDER_CHANGEPWDHWND: PCWSTR = w("ChangePasswordHwnd")

public val REGSTR_VAL_PWDPROVIDER_DESC: PCWSTR = w("Description")

public val REGSTR_VAL_PWDPROVIDER_GETPWDSTATUS: PCWSTR = w("GetPasswordStatus")

public val REGSTR_VAL_PWDPROVIDER_ISNP: PCWSTR = w("NetworkProvider")

public val REGSTR_VAL_PWDPROVIDER_PATH: PCWSTR = w("ProviderPath")

public val REGSTR_VAL_RDINTTHRESHOLD: PCWSTR = w("RDIntThreshold")

public val REGSTR_VAL_READAHEADTHRESHOLD: PCWSTR = w("ReadAheadThreshold")

public val REGSTR_VAL_READCACHING: PCWSTR = w("ReadCaching")

public val REGSTR_VAL_REALNETSTART: PCWSTR = w("RealNetStart")

public val REGSTR_VAL_REASONCODE: PCWSTR = w("ReasonCode")

public val REGSTR_VAL_REFRESHRATE: PCWSTR = w("RefreshRate")

public val REGSTR_VAL_REGITEMDELETEMESSAGE: PCWSTR = w("Removal Message")

public val REGSTR_VAL_REGORGANIZATION: PCWSTR = w("RegisteredOrganization")

public val REGSTR_VAL_REGOWNER: PCWSTR = w("RegisteredOwner")

public val REGSTR_VAL_REINSTALL_DEVICEINSTANCEIDS: PCWSTR = w("DeviceInstanceIds")

public val REGSTR_VAL_REINSTALL_DISPLAYNAME: PCWSTR = w("DisplayName")

public val REGSTR_VAL_REINSTALL_STRING: PCWSTR = w("ReinstallString")

public val REGSTR_VAL_REMOTE_PATH: PCWSTR = w("RemotePath")

public val REGSTR_VAL_REMOVABLE: PCWSTR = w("Removable")

public val REGSTR_VAL_REMOVAL_POLICY: PCWSTR = w("RemovalPolicy")

public val REGSTR_VAL_REMOVEROMOKAY: PCWSTR = w("RemoveRomOkay")

public val REGSTR_VAL_REMOVEROMOKAYFUNC: PCWSTR = w("RemoveRomOkayFunc")

public val REGSTR_VAL_RESERVED_DEVNODE: PCWSTR = w("HTREE\\RESERVED\\0")

public val REGSTR_VAL_RESOLUTION: PCWSTR = w("Resolution")

public val REGSTR_VAL_RESOURCES: PCWSTR = w("Resources")

public val REGSTR_VAL_RESOURCE_MAP: PCWSTR = w("ResourceMap")

public val REGSTR_VAL_RESOURCE_PICKER_EXCEPTIONS: PCWSTR = w("ResourcePickerExceptions")

public val REGSTR_VAL_RESOURCE_PICKER_TAGS: PCWSTR = w("ResourcePickerTags")

public val REGSTR_VAL_RESTRICTRUN: PCWSTR = w("RestrictRun")

public val REGSTR_VAL_RESUMERESET: PCWSTR = w("ResumeReset")

public val REGSTR_VAL_REVISION: PCWSTR = w("Revision")

public val REGSTR_VAL_REVLEVEL: PCWSTR = w("RevisionLevel")

public val REGSTR_VAL_ROOT_DEVNODE: PCWSTR = w("HTREE\\ROOT\\0")

public val REGSTR_VAL_RUNLOGINSCRIPT: PCWSTR = w("ProcessLoginScript")

public val REGSTR_VAL_SCANNER: PCWSTR = w("SCANNER")

public val REGSTR_VAL_SCAN_ONLY_FIRST: PCWSTR = w("ScanOnlyFirstDrive")

public val REGSTR_VAL_SCSI: PCWSTR = w("SCSI\\")

public val REGSTR_VAL_SCSILUN: PCWSTR = w("SCSILUN")

public val REGSTR_VAL_SCSITID: PCWSTR = w("SCSITargetID")

public val REGSTR_VAL_SEARCHMODE: PCWSTR = w("SearchMode")

public val REGSTR_VAL_SEARCHOPTIONS: PCWSTR = w("SearchOptions")

public val REGSTR_VAL_SECCPL_NOADMINPAGE: PCWSTR = w("NoAdminPage")

public val REGSTR_VAL_SECCPL_NOPROFILEPAGE: PCWSTR = w("NoProfilePage")

public val REGSTR_VAL_SECCPL_NOPWDPAGE: PCWSTR = w("NoPwdPage")

public val REGSTR_VAL_SECCPL_NOSECCPL: PCWSTR = w("NoSecCPL")

public val REGSTR_VAL_SERVICE: PCWSTR = w("Service")

public val REGSTR_VAL_SETUPFLAGS: PCWSTR = w("SetupFlags")

public val REGSTR_VAL_SETUPMACHINETYPE: PCWSTR = w("SetupMachineType")

public val REGSTR_VAL_SETUPN: PCWSTR = w("SetupN")

public val REGSTR_VAL_SETUPNPATH: PCWSTR = w("SetupNPath")

public val REGSTR_VAL_SETUPPROGRAMRAN: PCWSTR = w("SetupProgramRan")

public val REGSTR_VAL_SHARES_FLAGS: PCWSTR = w("Flags")

public val REGSTR_VAL_SHARES_PATH: PCWSTR = w("Path")

public val REGSTR_VAL_SHARES_REMARK: PCWSTR = w("Remark")

public val REGSTR_VAL_SHARES_RO_PASS: PCWSTR = w("Parm2")

public val REGSTR_VAL_SHARES_RW_PASS: PCWSTR = w("Parm1")

public val REGSTR_VAL_SHARES_TYPE: PCWSTR = w("Type")

public val REGSTR_VAL_SHARE_IRQ: PCWSTR = w("ForceIRQSharing")

public val REGSTR_VAL_SHELLVERSION: PCWSTR = w("ShellVersion")

public val REGSTR_VAL_SHOWDOTS: PCWSTR = w("ShowDots")

public val REGSTR_VAL_SHOWREASONUI: PCWSTR = w("ShutdownReasonUI")

public val REGSTR_VAL_SHUTDOWNREASON: PCWSTR = w("ShutdownReason")

public val REGSTR_VAL_SHUTDOWNREASON_CODE: PCWSTR = w("ShutdownReasonCode")

public val REGSTR_VAL_SHUTDOWNREASON_COMMENT: PCWSTR = w("ShutdownReasonComment")

public val REGSTR_VAL_SHUTDOWNREASON_PROCESS: PCWSTR = w("ShutdownReasonProcess")

public val REGSTR_VAL_SHUTDOWNREASON_USERNAME: PCWSTR = w("ShutdownReasonUserName")

public val REGSTR_VAL_SHUTDOWN_FLAGS: PCWSTR = w("ShutdownFlags")

public val REGSTR_VAL_SHUTDOWN_IGNORE_PREDEFINED: PCWSTR = w("ShutdownIgnorePredefinedReasons")

public val REGSTR_VAL_SHUTDOWN_STATE_SNAPSHOT: PCWSTR = w("ShutdownStateSnapshot")

public val REGSTR_VAL_SILENTINSTALL: PCWSTR = w("SilentInstall")

public val REGSTR_VAL_SLSUPPORT: PCWSTR = w("SLSupport")

public val REGSTR_VAL_SOFTCOMPATMODE: PCWSTR = w("SoftCompatMode")

public val REGSTR_VAL_SRCPATH: PCWSTR = w("SourcePath")

public val REGSTR_VAL_SRVNAMECACHE: PCWSTR = w("ServerNameCache")

public val REGSTR_VAL_SRVNAMECACHECOUNT: PCWSTR = w("ServerNameCacheMax")

public val REGSTR_VAL_SRVNAMECACHENETPROV: PCWSTR = w("ServerNameCacheNumNets")

public val REGSTR_VAL_START_ON_BOOT: PCWSTR = w("StartOnBoot")

public val REGSTR_VAL_STAT: PCWSTR = w("Status")

public val REGSTR_VAL_STATICDRIVE: PCWSTR = w("StaticDrive")

public val REGSTR_VAL_STATICVXD: PCWSTR = w("StaticVxD")

public val REGSTR_VAL_STDDOSOPTION: PCWSTR = w("StdOption")

public val REGSTR_VAL_SUBMODEL: PCWSTR = w("Submodel")

public val REGSTR_VAL_SUPPORTBURST: PCWSTR = w("SupportBurst")

public val REGSTR_VAL_SUPPORTLFN: PCWSTR = w("SupportLFN")

public val REGSTR_VAL_SUPPORTTUNNELLING: PCWSTR = w("SupportTunnelling")

public val REGSTR_VAL_SYMBOLIC_LINK: PCWSTR = w("SymbolicLink")

public val REGSTR_VAL_SYNCDATAXFER: PCWSTR = w("SyncDataXfer")

public val REGSTR_VAL_SYSDM: PCWSTR = w("SysDM")

public val REGSTR_VAL_SYSDMFUNC: PCWSTR = w("SysDMFunc")

public val REGSTR_VAL_SYSTEMCPL_NOCONFIGPAGE: PCWSTR = w("NoConfigPage")

public val REGSTR_VAL_SYSTEMCPL_NODEVMGRPAGE: PCWSTR = w("NoDevMgrPage")

public val REGSTR_VAL_SYSTEMCPL_NOFILESYSPAGE: PCWSTR = w("NoFileSysPage")

public val REGSTR_VAL_SYSTEMCPL_NOVIRTMEMPAGE: PCWSTR = w("NoVirtMemPage")

public val REGSTR_VAL_SYSTEMROOT: PCWSTR = w("SystemRoot")

public val REGSTR_VAL_SYSTRAYBATFLAGS: PCWSTR = w("PowerFlags")

public val REGSTR_VAL_SYSTRAYPCCARDFLAGS: PCWSTR = w("PCMCIAFlags")

public val REGSTR_VAL_SYSTRAYSVCS: PCWSTR = w("Services")

public val REGSTR_VAL_TABLE_STAT: PCWSTR = w("TableStatus")

public val REGSTR_VAL_TAPE: PCWSTR = w("TAPE")

public val REGSTR_VAL_TRANSITION: PCWSTR = w("Transition")

public val REGSTR_VAL_TRANSPORT: PCWSTR = w("Transport")

public val REGSTR_VAL_TZACTBIAS: PCWSTR = w("ActiveTimeBias")

public val REGSTR_VAL_TZBIAS: PCWSTR = w("Bias")

public val REGSTR_VAL_TZDLTBIAS: PCWSTR = w("DaylightBias")

public val REGSTR_VAL_TZDLTFLAG: PCWSTR = w("DaylightFlag")

public val REGSTR_VAL_TZDLTNAME: PCWSTR = w("DaylightName")

public val REGSTR_VAL_TZDLTSTART: PCWSTR = w("DaylightStart")

public val REGSTR_VAL_TZNOAUTOTIME: PCWSTR = w("DisableAutoDaylightTimeSet")

public val REGSTR_VAL_TZNOCHANGEEND: PCWSTR = w("NoChangeEnd")

public val REGSTR_VAL_TZNOCHANGESTART: PCWSTR = w("NoChangeStart")

public val REGSTR_VAL_TZSTDBIAS: PCWSTR = w("StandardBias")

public val REGSTR_VAL_TZSTDNAME: PCWSTR = w("StandardName")

public val REGSTR_VAL_TZSTDSTART: PCWSTR = w("StandardStart")

public val REGSTR_VAL_UI_NUMBER: PCWSTR = w("UINumber")

public val REGSTR_VAL_UI_NUMBER_DESC_FORMAT: PCWSTR = w("UINumberDescFormat")

public val REGSTR_VAL_UNDOCK_WITHOUT_LOGON: PCWSTR = w("UndockWithoutLogon")

public val REGSTR_VAL_UNINSTALLER_COMMANDLINE: PCWSTR = w("UninstallString")

public val REGSTR_VAL_UNINSTALLER_DISPLAYNAME: PCWSTR = w("DisplayName")

public val REGSTR_VAL_UPGRADE: PCWSTR = w("Upgrade")

public val REGSTR_VAL_UPPERFILTERS: PCWSTR = w("UpperFilters")

public val REGSTR_VAL_UPPER_FILTER_DEFAULT_LEVEL: PCWSTR = w("UpperFilterDefaultLevel")

public val REGSTR_VAL_UPPER_FILTER_LEVELS: PCWSTR = w("UpperFilterLevels")

public val REGSTR_VAL_USERSETTINGS: PCWSTR = w("AdapterSettings")

public val REGSTR_VAL_USER_NAME: PCWSTR = w("UserName")

public val REGSTR_VAL_USRDRVLET: PCWSTR = w("UserDriveLetterAssignment")

public val REGSTR_VAL_VDD: PCWSTR = w("vdd")

public val REGSTR_VAL_VER: PCWSTR = w("Ver")

public val REGSTR_VAL_VERIFYKEY: PCWSTR = w("VerifyKey")

public val REGSTR_VAL_VIRTUALHDIRQ: PCWSTR = w("VirtualHDIRQ")

public val REGSTR_VAL_VOLIDLETIMEOUT: PCWSTR = w("VolumeIdleTimeout")

public val REGSTR_VAL_VPOWERDFLAGS: PCWSTR = w("Flags")

public val REGSTR_VAL_VRES: PCWSTR = w("VRes")

public val REGSTR_VAL_VXDGROUPS: PCWSTR = w("VXDGroups")

public val REGSTR_VAL_WAITFORUNDOCK: PCWSTR = w("WaitForUndock")

public val REGSTR_VAL_WAITFORUNDOCKFUNC: PCWSTR = w("WaitForUndockFunc")

public val REGSTR_VAL_WIN31FILESYSTEM: PCWSTR = w("Win31FileSystem")

public val REGSTR_VAL_WIN31PROVIDER: PCWSTR = w("Win31Provider")

public val REGSTR_VAL_WINBOOTDIR: PCWSTR = w("WinbootDir")

public val REGSTR_VAL_WINCP: PCWSTR = w("ACP")

public val REGSTR_VAL_WINDIR: PCWSTR = w("WinDir")

public val REGSTR_VAL_WINOLDAPP_DISABLED: PCWSTR = w("Disabled")

public val REGSTR_VAL_WINOLDAPP_NOREALMODE: PCWSTR = w("NoRealMode")

public val REGSTR_VAL_WORKGROUP: PCWSTR = w("Workgroup")

public val REGSTR_VAL_WRAPPER: PCWSTR = w("Wrapper")

public val REGSTR_VAL_WRINTTHRESHOLD: PCWSTR = w("WRIntThreshold")

public val REGSTR_VAL_WRKGRP_FORCEMAPPING: PCWSTR = w("WrkgrpForceMapping")

public val REGSTR_VAL_WRKGRP_REQUIRED: PCWSTR = w("WrkgrpRequired")

public val REG_BINARY: REG_VALUE_TYPE = 3u

public val REG_CREATED_NEW_KEY: REG_CREATE_KEY_DISPOSITION = 1u

public val REG_DWORD: REG_VALUE_TYPE = 4u

public val REG_DWORD_BIG_ENDIAN: REG_VALUE_TYPE = 5u

public val REG_DWORD_LITTLE_ENDIAN: REG_VALUE_TYPE = 4u

public val REG_EXPAND_SZ: REG_VALUE_TYPE = 2u

public val REG_FORCE_RESTORE: REG_RESTORE_KEY_FLAGS = 8

public val REG_FULL_RESOURCE_DESCRIPTOR: REG_VALUE_TYPE = 9u

public val REG_KEY_INSTDEV: PCWSTR = w("Installed")

public val REG_LATEST_FORMAT: REG_SAVE_FORMAT = 2u

public val REG_LINK: REG_VALUE_TYPE = 6u

public val REG_MUI_STRING_TRUNCATE: UInt = 1u

public val REG_MULTI_SZ: REG_VALUE_TYPE = 7u

public val REG_NONE: REG_VALUE_TYPE = 0u

public val REG_NOTIFY_CHANGE_ATTRIBUTES: REG_NOTIFY_FILTER = 2u

public val REG_NOTIFY_CHANGE_LAST_SET: REG_NOTIFY_FILTER = 4u

public val REG_NOTIFY_CHANGE_NAME: REG_NOTIFY_FILTER = 1u

public val REG_NOTIFY_CHANGE_SECURITY: REG_NOTIFY_FILTER = 8u

public val REG_NOTIFY_THREAD_AGNOSTIC: REG_NOTIFY_FILTER = 268435456u

public val REG_NO_COMPRESSION: REG_SAVE_FORMAT = 4u

public val REG_OPENED_EXISTING_KEY: REG_CREATE_KEY_DISPOSITION = 2u

public val REG_OPTION_BACKUP_RESTORE: REG_OPEN_CREATE_OPTIONS = 4u

public val REG_OPTION_CREATE_LINK: REG_OPEN_CREATE_OPTIONS = 2u

public val REG_OPTION_DONT_VIRTUALIZE: REG_OPEN_CREATE_OPTIONS = 16u

public val REG_OPTION_NON_VOLATILE: REG_OPEN_CREATE_OPTIONS = 0u

public val REG_OPTION_OPEN_LINK: REG_OPEN_CREATE_OPTIONS = 8u

public val REG_OPTION_RESERVED: REG_OPEN_CREATE_OPTIONS = 0u

public val REG_OPTION_VOLATILE: REG_OPEN_CREATE_OPTIONS = 1u

public val REG_PROCESS_APPKEY: UInt = 1u

public val REG_QWORD: REG_VALUE_TYPE = 11u

public val REG_QWORD_LITTLE_ENDIAN: REG_VALUE_TYPE = 11u

public val REG_RESOURCE_LIST: REG_VALUE_TYPE = 8u

public val REG_RESOURCE_REQUIREMENTS_LIST: REG_VALUE_TYPE = 10u

public val REG_SECURE_CONNECTION: UInt = 1u

public val REG_STANDARD_FORMAT: REG_SAVE_FORMAT = 1u

public val REG_SZ: REG_VALUE_TYPE = 1u

public val REG_USE_CURRENT_SECURITY_CONTEXT: UInt = 2u

public val REG_WHOLE_HIVE_VOLATILE: REG_RESTORE_KEY_FLAGS = 1

public val RRF_NOEXPAND: REG_ROUTINE_FLAGS = 268435456u

public val RRF_RT_ANY: REG_ROUTINE_FLAGS = 65535u

public val RRF_RT_DWORD: REG_ROUTINE_FLAGS = 24u

public val RRF_RT_QWORD: REG_ROUTINE_FLAGS = 72u

public val RRF_RT_REG_BINARY: REG_ROUTINE_FLAGS = 8u

public val RRF_RT_REG_DWORD: REG_ROUTINE_FLAGS = 16u

public val RRF_RT_REG_EXPAND_SZ: REG_ROUTINE_FLAGS = 4u

public val RRF_RT_REG_MULTI_SZ: REG_ROUTINE_FLAGS = 32u

public val RRF_RT_REG_NONE: REG_ROUTINE_FLAGS = 1u

public val RRF_RT_REG_QWORD: REG_ROUTINE_FLAGS = 64u

public val RRF_RT_REG_SZ: REG_ROUTINE_FLAGS = 2u

public val RRF_SUBKEY_WOW6432KEY: REG_ROUTINE_FLAGS = 131072u

public val RRF_SUBKEY_WOW6464KEY: REG_ROUTINE_FLAGS = 65536u

public val RRF_WOW64_MASK: REG_ROUTINE_FLAGS = 196608u

public val RRF_ZEROONFAILURE: REG_ROUTINE_FLAGS = 536870912u

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
