package io.github.kotlinmania.windowssys.windows.win32.ui.shell.propertiessystem

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid

public val FPSPS_DEFAULT: PersistSpropstoreFlags = 0

public val FPSPS_READONLY: PersistSpropstoreFlags = 1

public val FPSPS_TREAT_NEW_VALUES_AS_DIRTY: PersistSpropstoreFlags = 2

public val GPS_BESTEFFORT: Getpropertystoreflags = 64

public val GPS_DEFAULT: Getpropertystoreflags = 0

public val GPS_DELAYCREATION: Getpropertystoreflags = 32

public val GPS_EXTRINSICPROPERTIES: Getpropertystoreflags = 512

public val GPS_EXTRINSICPROPERTIESONLY: Getpropertystoreflags = 1024

public val GPS_FASTPROPERTIESONLY: Getpropertystoreflags = 8

public val GPS_HANDLERPROPERTIESONLY: Getpropertystoreflags = 1

public val GPS_MASK_VALID: Getpropertystoreflags = 8191

public val GPS_NO_OPLOCK: Getpropertystoreflags = 128

public val GPS_OPENSLOWITEM: Getpropertystoreflags = 16

public val GPS_PREFERQUERYPROPERTIES: Getpropertystoreflags = 256

public val GPS_READWRITE: Getpropertystoreflags = 2

public val GPS_TEMPORARY: Getpropertystoreflags = 4

public val GPS_VOLATILEPROPERTIES: Getpropertystoreflags = 2048

public val GPS_VOLATILEPROPERTIESONLY: Getpropertystoreflags = 4096

public val PDAT_AVERAGE: PropdescAggregationType = 3

public val PDAT_DATERANGE: PropdescAggregationType = 4

public val PDAT_DEFAULT: PropdescAggregationType = 0

public val PDAT_FIRST: PropdescAggregationType = 1

public val PDAT_MAX: PropdescAggregationType = 6

public val PDAT_MIN: PropdescAggregationType = 7

public val PDAT_SUM: PropdescAggregationType = 2

public val PDAT_UNION: PropdescAggregationType = 5

public val PDCIT_INMEMORY: PropdescColumnindexType = 2

public val PDCIT_NONE: PropdescColumnindexType = 0

public val PDCIT_ONDEMAND: PropdescColumnindexType = 3

public val PDCIT_ONDISK: PropdescColumnindexType = 1

public val PDCIT_ONDISKALL: PropdescColumnindexType = 4

public val PDCIT_ONDISKVECTOR: PropdescColumnindexType = 5

public val PDCOT_BOOLEAN: PropdescConditionType = 4

public val PDCOT_DATETIME: PropdescConditionType = 3

public val PDCOT_NONE: PropdescConditionType = 0

public val PDCOT_NUMBER: PropdescConditionType = 5

public val PDCOT_SIZE: PropdescConditionType = 2

public val PDCOT_STRING: PropdescConditionType = 1

public val PDDT_BOOLEAN: PropdescDisplaytype = 2

public val PDDT_DATETIME: PropdescDisplaytype = 3

public val PDDT_ENUMERATED: PropdescDisplaytype = 4

public val PDDT_NUMBER: PropdescDisplaytype = 1

public val PDDT_STRING: PropdescDisplaytype = 0

public val PDEF_ALL: PropdescEnumfilter = 0

public val PDEF_COLUMN: PropdescEnumfilter = 6

public val PDEF_INFULLTEXTQUERY: PropdescEnumfilter = 5

public val PDEF_NONSYSTEM: PropdescEnumfilter = 2

public val PDEF_QUERYABLE: PropdescEnumfilter = 4

public val PDEF_SYSTEM: PropdescEnumfilter = 1

public val PDEF_VIEWABLE: PropdescEnumfilter = 3

public val PDFF_ALWAYSKB: PropdescFormatFlags = 4

public val PDFF_DEFAULT: PropdescFormatFlags = 0

public val PDFF_FILENAME: PropdescFormatFlags = 2

public val PDFF_HIDEDATE: PropdescFormatFlags = 512

public val PDFF_HIDETIME: PropdescFormatFlags = 64

public val PDFF_LONGDATE: PropdescFormatFlags = 256

public val PDFF_LONGTIME: PropdescFormatFlags = 32

public val PDFF_NOAUTOREADINGORDER: PropdescFormatFlags = 8192

public val PDFF_PREFIXNAME: PropdescFormatFlags = 1

public val PDFF_READONLY: PropdescFormatFlags = 4096

public val PDFF_RELATIVEDATE: PropdescFormatFlags = 1024

public val PDFF_RESERVED_RIGHTTOLEFT: PropdescFormatFlags = 8

public val PDFF_SHORTDATE: PropdescFormatFlags = 128

public val PDFF_SHORTTIME: PropdescFormatFlags = 16

public val PDFF_USEEDITINVITATION: PropdescFormatFlags = 2048

public val PDGR_ALPHANUMERIC: PropdescGroupingRange = 1

public val PDGR_DATE: PropdescGroupingRange = 4

public val PDGR_DISCRETE: PropdescGroupingRange = 0

public val PDGR_DYNAMIC: PropdescGroupingRange = 3

public val PDGR_ENUMERATED: PropdescGroupingRange = 6

public val PDGR_PERCENT: PropdescGroupingRange = 5

public val PDGR_SIZE: PropdescGroupingRange = 2

public val PDOPS_CANCELLED: Pdopstatus = 3

public val PDOPS_ERRORS: Pdopstatus = 5

public val PDOPS_PAUSED: Pdopstatus = 2

public val PDOPS_RUNNING: Pdopstatus = 1

public val PDOPS_STOPPED: Pdopstatus = 4

public val PDRDT_COUNT: PropdescRelativedescriptionType = 3

public val PDRDT_DATE: PropdescRelativedescriptionType = 1

public val PDRDT_DURATION: PropdescRelativedescriptionType = 6

public val PDRDT_GENERAL: PropdescRelativedescriptionType = 0

public val PDRDT_LENGTH: PropdescRelativedescriptionType = 5

public val PDRDT_PRIORITY: PropdescRelativedescriptionType = 10

public val PDRDT_RATE: PropdescRelativedescriptionType = 8

public val PDRDT_RATING: PropdescRelativedescriptionType = 9

public val PDRDT_REVISION: PropdescRelativedescriptionType = 4

public val PDRDT_SIZE: PropdescRelativedescriptionType = 2

public val PDRDT_SPEED: PropdescRelativedescriptionType = 7

public val PDSD_A_Z: PropdescSortdescription = 1

public val PDSD_GENERAL: PropdescSortdescription = 0

public val PDSD_LOWEST_HIGHEST: PropdescSortdescription = 2

public val PDSD_OLDEST_NEWEST: PropdescSortdescription = 4

public val PDSD_SMALLEST_BIGGEST: PropdescSortdescription = 3

public val PDSIF_ALWAYSINCLUDE: PropdescSearchinfoFlags = 8

public val PDSIF_DEFAULT: PropdescSearchinfoFlags = 0

public val PDSIF_ININVERTEDINDEX: PropdescSearchinfoFlags = 1

public val PDSIF_ISCOLUMN: PropdescSearchinfoFlags = 2

public val PDSIF_ISCOLUMNSPARSE: PropdescSearchinfoFlags = 4

public val PDSIF_USEFORTYPEAHEAD: PropdescSearchinfoFlags = 16

public val PDTF_ALWAYSINSUPPLEMENTALSTORE: PropdescTypeFlags = 4096u

public val PDTF_CANBEPURGED: PropdescTypeFlags = 512u

public val PDTF_CANGROUPBY: PropdescTypeFlags = 8u

public val PDTF_CANSTACKBY: PropdescTypeFlags = 16u

public val PDTF_DEFAULT: PropdescTypeFlags = 0u

public val PDTF_DONTCOERCEEMPTYSTRINGS: PropdescTypeFlags = 2048u

public val PDTF_INCLUDEINFULLTEXTQUERY: PropdescTypeFlags = 64u

public val PDTF_ISGROUP: PropdescTypeFlags = 4u

public val PDTF_ISINNATE: PropdescTypeFlags = 2u

public val PDTF_ISQUERYABLE: PropdescTypeFlags = 256u

public val PDTF_ISSYSTEMPROPERTY: PropdescTypeFlags = 2147483648u

public val PDTF_ISTREEPROPERTY: PropdescTypeFlags = 32u

public val PDTF_ISVIEWABLE: PropdescTypeFlags = 128u

public val PDTF_MASK_ALL: PropdescTypeFlags = 2147491839u

public val PDTF_MULTIPLEVALUES: PropdescTypeFlags = 1u

public val PDTF_SEARCHRAWVALUE: PropdescTypeFlags = 1024u

public val PDVF_BEGINNEWGROUP: PropdescViewFlags = 4

public val PDVF_CANWRAP: PropdescViewFlags = 4096

public val PDVF_CENTERALIGN: PropdescViewFlags = 1

public val PDVF_DEFAULT: PropdescViewFlags = 0

public val PDVF_FILLAREA: PropdescViewFlags = 8

public val PDVF_HIDDEN: PropdescViewFlags = 2048

public val PDVF_HIDELABEL: PropdescViewFlags = 512

public val PDVF_MASK_ALL: PropdescViewFlags = 7167

public val PDVF_RIGHTALIGN: PropdescViewFlags = 2

public val PDVF_SHOWBYDEFAULT: PropdescViewFlags = 64

public val PDVF_SHOWINPRIMARYLIST: PropdescViewFlags = 128

public val PDVF_SHOWINSECONDARYLIST: PropdescViewFlags = 256

public val PDVF_SHOWONLYIFPRESENT: PropdescViewFlags = 32

public val PDVF_SORTDESCENDING: PropdescViewFlags = 16

public val PET_DEFAULTVALUE: Propenumtype = 2

public val PET_DISCRETEVALUE: Propenumtype = 0

public val PET_ENDRANGE: Propenumtype = 3

public val PET_RANGEDVALUE: Propenumtype = 1

public val PKA_APPEND: PkaFlags = 1

public val PKA_DELETE: PkaFlags = 2

public val PKA_SET: PkaFlags = 0

public val PKEY_PIDSTR_MAX: UInt = 10u

public val PSC_DIRTY: PscState = 2

public val PSC_NORMAL: PscState = 0

public val PSC_NOTINSOURCE: PscState = 1

public val PSC_READONLY: PscState = 3

public val PS_ALL: PlaceholderStates = 15

public val PS_CLOUDFILE_PLACEHOLDER: PlaceholderStates = 8

public val PS_CREATE_FILE_ACCESSIBLE: PlaceholderStates = 4

public val PS_DEFAULT: PlaceholderStates = 7

public val PS_FULL_PRIMARY_STREAM_AVAILABLE: PlaceholderStates = 2

public val PS_MARKED_FOR_OFFLINE_AVAILABILITY: PlaceholderStates = 1

public val PS_NONE: PlaceholderStates = 0

public val PUIFFDF_DEFAULT: PropertyuiFormatFlags = 0

public val PUIFFDF_FRIENDLYDATE: PropertyuiFormatFlags = 8

public val PUIFFDF_NOTIME: PropertyuiFormatFlags = 4

public val PUIFFDF_RIGHTTOLEFT: PropertyuiFormatFlags = 1

public val PUIFFDF_SHORTFORMAT: PropertyuiFormatFlags = 2

public val PUIFNF_DEFAULT: PropertyuiNameFlags = 0

public val PUIFNF_MNEMONIC: PropertyuiNameFlags = 1

public val PUIF_DEFAULT: PropertyuiFlags = 0

public val PUIF_NOLABELININFOTIP: PropertyuiFlags = 2

public val PUIF_RIGHTALIGN: PropertyuiFlags = 1

public val SESF_ALL_FLAGS: SyncEngineStateFlags = 511

public val SESF_AUTHENTICATION_ERROR: SyncEngineStateFlags = 4

public val SESF_NONE: SyncEngineStateFlags = 0

public val SESF_PAUSED_DUE_TO_CLIENT_POLICY: SyncEngineStateFlags = 32

public val SESF_PAUSED_DUE_TO_DISK_SPACE_FULL: SyncEngineStateFlags = 16

public val SESF_PAUSED_DUE_TO_METERED_NETWORK: SyncEngineStateFlags = 8

public val SESF_PAUSED_DUE_TO_SERVICE_POLICY: SyncEngineStateFlags = 64

public val SESF_PAUSED_DUE_TO_USER_REQUEST: SyncEngineStateFlags = 256

public val SESF_SERVICE_QUOTA_EXCEEDED_LIMIT: SyncEngineStateFlags = 2

public val SESF_SERVICE_QUOTA_NEARING_LIMIT: SyncEngineStateFlags = 1

public val SESF_SERVICE_UNAVAILABLE: SyncEngineStateFlags = 128

public val STS_EXCLUDED: SyncTransferStatus = 256

public val STS_FETCHING_METADATA: SyncTransferStatus = 32

public val STS_HASERROR: SyncTransferStatus = 16

public val STS_HASWARNING: SyncTransferStatus = 128

public val STS_INCOMPLETE: SyncTransferStatus = 512

public val STS_NEEDSDOWNLOAD: SyncTransferStatus = 2

public val STS_NEEDSUPLOAD: SyncTransferStatus = 1

public val STS_NONE: SyncTransferStatus = 0

public val STS_PAUSED: SyncTransferStatus = 8

public val STS_PLACEHOLDER_IFEMPTY: SyncTransferStatus = 1024

public val STS_TRANSFERRING: SyncTransferStatus = 4

public val STS_USER_REQUESTED_REFRESH: SyncTransferStatus = 64

public val IN_MEMORY_PROPERTY_STORE: Guid = Guid.fromU128(U128(0x9a02e01263034e1euL, 0xb9a1630f802592c5uL))

public val IN_MEMORY_PROPERTY_STORE_MARSHAL_BY_VALUE: Guid = Guid.fromU128(U128(0xd4ca0e2d6da74b75uL, 0xa97c5f306f0eaedcuL))

public val PROPERTY_SYSTEM: Guid = Guid.fromU128(U128(0xb8967f8558ae4f46uL, 0x9fb25d7904798f4buL))
