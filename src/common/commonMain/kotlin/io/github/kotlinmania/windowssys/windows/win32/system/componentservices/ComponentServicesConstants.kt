package io.github.kotlinmania.windowssys.windows.win32.system.componentservices

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.w

public val APPTYPE_LIBRARY: COMPLUS_APPTYPE = 0

public val APPTYPE_SERVER: COMPLUS_APPTYPE = 1

public val APPTYPE_SWC: COMPLUS_APPTYPE = 2

public val APPTYPE_UNKNOWN: COMPLUS_APPTYPE = -1

public val AppDomainHelper: GUID = GUID.from_u128(U128(0xef24f68914f84d92uL, 0xb4afd7b1f0e70fd4uL))

public val ByotServerEx: GUID = GUID.from_u128(U128(0xecabb0aa7f1911d2uL, 0x978e0000f8757e2auL))

public val COMAdmin32BitComponent: COMAdminComponentType = 1

public val COMAdmin64BitComponent: COMAdminComponentType = 2

public val COMAdminAccessChecksApplicationComponentLevel: COMAdminAccessChecksLevelOptions = 1

public val COMAdminAccessChecksApplicationLevel: COMAdminAccessChecksLevelOptions = 0

public val COMAdminActivationInproc: COMAdminActivationOptions = 0

public val COMAdminActivationLocal: COMAdminActivationOptions = 1

public val COMAdminAuthenticationCall: COMAdminAuthenticationLevelOptions = 3

public val COMAdminAuthenticationCapabilitiesDynamicCloaking: COMAdminAuthenticationCapabilitiesOptions = 64

public val COMAdminAuthenticationCapabilitiesNone: COMAdminAuthenticationCapabilitiesOptions = 0

public val COMAdminAuthenticationCapabilitiesSecureReference: COMAdminAuthenticationCapabilitiesOptions = 2

public val COMAdminAuthenticationCapabilitiesStaticCloaking: COMAdminAuthenticationCapabilitiesOptions = 32

public val COMAdminAuthenticationConnect: COMAdminAuthenticationLevelOptions = 2

public val COMAdminAuthenticationDefault: COMAdminAuthenticationLevelOptions = 0

public val COMAdminAuthenticationIntegrity: COMAdminAuthenticationLevelOptions = 5

public val COMAdminAuthenticationNone: COMAdminAuthenticationLevelOptions = 1

public val COMAdminAuthenticationPacket: COMAdminAuthenticationLevelOptions = 4

public val COMAdminAuthenticationPrivacy: COMAdminAuthenticationLevelOptions = 6

public val COMAdminCatalog: GUID = GUID.from_u128(U128(0xf618c514dfb811d1uL, 0xa2cf00805fc79235uL))

public val COMAdminCatalogCollection: GUID = GUID.from_u128(U128(0xf618c516dfb811d1uL, 0xa2cf00805fc79235uL))

public val COMAdminCatalogObject: GUID = GUID.from_u128(U128(0xf618c515dfb811d1uL, 0xa2cf00805fc79235uL))

public val COMAdminCompFlagAlreadyInstalled: COMAdminComponentFlags = 16

public val COMAdminCompFlagCOMPlusPropertiesFound: COMAdminComponentFlags = 2

public val COMAdminCompFlagInterfacesFound: COMAdminComponentFlags = 8

public val COMAdminCompFlagNotInApplication: COMAdminComponentFlags = 32

public val COMAdminCompFlagProxyFound: COMAdminComponentFlags = 4

public val COMAdminCompFlagTypeInfoFound: COMAdminComponentFlags = 1

public val COMAdminErrAlreadyInstalled: COMAdminErrorCodes = -2146368508

public val COMAdminErrAppDirNotFound: COMAdminErrorCodes = -2146368481

public val COMAdminErrAppFileReadFail: COMAdminErrorCodes = -2146368504

public val COMAdminErrAppFileVersion: COMAdminErrorCodes = -2146368503

public val COMAdminErrAppFileWriteFail: COMAdminErrorCodes = -2146368505

public val COMAdminErrAppNotRunning: COMAdminErrorCodes = -2146367478

public val COMAdminErrApplicationExists: COMAdminErrorCodes = -2146368501

public val COMAdminErrApplidMatchesClsid: COMAdminErrorCodes = -2146368442

public val COMAdminErrAuthenticationLevel: COMAdminErrorCodes = -2146368493

public val COMAdminErrBadPath: COMAdminErrorCodes = -2146368502

public val COMAdminErrBadRegistryLibID: COMAdminErrorCodes = -2146368482

public val COMAdminErrBadRegistryProgID: COMAdminErrorCodes = -2146368494

public val COMAdminErrBasePartitionOnly: COMAdminErrorCodes = -2146368432

public val COMAdminErrCLSIDOrIIDMismatch: COMAdminErrorCodes = -2146368488

public val COMAdminErrCanNotExportAppProxy: COMAdminErrorCodes = -2146368438

public val COMAdminErrCanNotExportSystemApp: COMAdminErrorCodes = -2146368436

public val COMAdminErrCanNotStartApp: COMAdminErrorCodes = -2146368437

public val COMAdminErrCanNotSubscribeToComponent: COMAdminErrorCodes = -2146368435

public val COMAdminErrCannotCopyEventClass: COMAdminErrorCodes = -2146367456

public val COMAdminErrCantCopyFile: COMAdminErrorCodes = -2146368499

public val COMAdminErrCantRecycleLibraryApps: COMAdminErrorCodes = -2146367473

public val COMAdminErrCantRecycleServiceApps: COMAdminErrorCodes = -2146367471

public val COMAdminErrCatBitnessMismatch: COMAdminErrorCodes = -2146368382

public val COMAdminErrCatPauseResumeNotSupported: COMAdminErrorCodes = -2146368379

public val COMAdminErrCatServerFault: COMAdminErrorCodes = -2146368378

public val COMAdminErrCatUnacceptableBitness: COMAdminErrorCodes = -2146368381

public val COMAdminErrCatWrongAppBitnessBitness: COMAdminErrorCodes = -2146368380

public val COMAdminErrCoReqCompInstalled: COMAdminErrorCodes = -2146368459

public val COMAdminErrCompFileBadTLB: COMAdminErrorCodes = -2146368472

public val COMAdminErrCompFileClassNotAvail: COMAdminErrorCodes = -2146368473

public val COMAdminErrCompFileDoesNotExist: COMAdminErrorCodes = -2146368476

public val COMAdminErrCompFileGetClassObj: COMAdminErrorCodes = -2146368474

public val COMAdminErrCompFileLoadDLLFail: COMAdminErrorCodes = -2146368475

public val COMAdminErrCompFileNoRegistrar: COMAdminErrorCodes = -2146368460

public val COMAdminErrCompFileNotInstallable: COMAdminErrorCodes = -2146368471

public val COMAdminErrCompMoveBadDest: COMAdminErrorCodes = -2146368466

public val COMAdminErrCompMoveDest: COMAdminErrorCodes = -2146367459

public val COMAdminErrCompMoveLocked: COMAdminErrorCodes = -2146368467

public val COMAdminErrCompMovePrivate: COMAdminErrorCodes = -2146367458

public val COMAdminErrCompMoveSource: COMAdminErrorCodes = -2146367460

public val COMAdminErrComponentExists: COMAdminErrorCodes = -2146368455

public val COMAdminErrDllLoadFailed: COMAdminErrorCodes = -2146368483

public val COMAdminErrDllRegisterServer: COMAdminErrorCodes = -2146368486

public val COMAdminErrDuplicatePartitionName: COMAdminErrorCodes = -2146368425

public val COMAdminErrEventClassCannotBeSubscriber: COMAdminErrorCodes = -2146368434

public val COMAdminErrImportedComponentsNotAllowed: COMAdminErrorCodes = -2146368421

public val COMAdminErrInvalidPartition: COMAdminErrorCodes = -2146367477

public val COMAdminErrInvalidUserids: COMAdminErrorCodes = -2146368496

public val COMAdminErrKeyMissing: COMAdminErrorCodes = -2146368509

public val COMAdminErrLibAppProxyIncompatible: COMAdminErrorCodes = -2146368433

public val COMAdminErrMigSchemaNotFound: COMAdminErrorCodes = -2146368383

public val COMAdminErrMigVersionNotSupported: COMAdminErrorCodes = -2146368384

public val COMAdminErrNoRegistryCLSID: COMAdminErrorCodes = -2146368495

public val COMAdminErrNoServerShare: COMAdminErrorCodes = -2146368485

public val COMAdminErrNoUser: COMAdminErrorCodes = -2146368497

public val COMAdminErrNotChangeable: COMAdminErrorCodes = -2146368470

public val COMAdminErrNotDeletable: COMAdminErrorCodes = -2146368469

public val COMAdminErrNotInRegistry: COMAdminErrorCodes = -2146368450

public val COMAdminErrObjectDoesNotExist: COMAdminErrorCodes = -2146367479

public val COMAdminErrObjectErrors: COMAdminErrorCodes = -2146368511

public val COMAdminErrObjectExists: COMAdminErrorCodes = -2146368456

public val COMAdminErrObjectInvalid: COMAdminErrorCodes = -2146368510

public val COMAdminErrObjectNotPoolable: COMAdminErrorCodes = -2146368449

public val COMAdminErrObjectParentMissing: COMAdminErrorCodes = -2146367480

public val COMAdminErrPartitionInUse: COMAdminErrorCodes = -2146368423

public val COMAdminErrPartitionMsiOnly: COMAdminErrorCodes = -2146367463

public val COMAdminErrPausedProcessMayNotBeRecycled: COMAdminErrorCodes = -2146367469

public val COMAdminErrProcessAlreadyRecycled: COMAdminErrorCodes = -2146367470

public val COMAdminErrPropertyOverflow: COMAdminErrorCodes = -2146368452

public val COMAdminErrPropertySaveFailed: COMAdminErrorCodes = -2146368457

public val COMAdminErrQueuingServiceNotAvailable: COMAdminErrorCodes = -2146367998

public val COMAdminErrRegFileCorrupt: COMAdminErrorCodes = -2146368453

public val COMAdminErrRegdbAlreadyRunning: COMAdminErrorCodes = -2146368395

public val COMAdminErrRegdbNotInitialized: COMAdminErrorCodes = -2146368398

public val COMAdminErrRegdbNotOpen: COMAdminErrorCodes = -2146368397

public val COMAdminErrRegdbSystemErr: COMAdminErrorCodes = -2146368396

public val COMAdminErrRegisterTLB: COMAdminErrorCodes = -2146368464

public val COMAdminErrRegistrarFailed: COMAdminErrorCodes = -2146368477

public val COMAdminErrRemoteInterface: COMAdminErrorCodes = -2146368487

public val COMAdminErrRequiresDifferentPlatform: COMAdminErrorCodes = -2146368439

public val COMAdminErrRoleDoesNotExist: COMAdminErrorCodes = -2146368441

public val COMAdminErrRoleExists: COMAdminErrorCodes = -2146368500

public val COMAdminErrServiceNotInstalled: COMAdminErrorCodes = -2146368458

public val COMAdminErrSession: COMAdminErrorCodes = -2146368468

public val COMAdminErrStartAppDisabled: COMAdminErrorCodes = -2146368431

public val COMAdminErrStartAppNeedsComponents: COMAdminErrorCodes = -2146368440

public val COMAdminErrSystemApp: COMAdminErrorCodes = -2146368461

public val COMAdminErrUserPasswdNotValid: COMAdminErrorCodes = -2146368492

public val COMAdminExportApplicationProxy: COMAdminApplicationExportOptions = 2

public val COMAdminExportForceOverwriteOfFiles: COMAdminApplicationExportOptions = 4

public val COMAdminExportIn10Format: COMAdminApplicationExportOptions = 16

public val COMAdminExportNoUsers: COMAdminApplicationExportOptions = 0

public val COMAdminExportUsers: COMAdminApplicationExportOptions = 1

public val COMAdminFileFlagAlreadyInstalled: COMAdminFileFlags = 512

public val COMAdminFileFlagBadTLB: COMAdminFileFlags = 1024

public val COMAdminFileFlagCOM: COMAdminFileFlags = 2

public val COMAdminFileFlagClassNotAvailable: COMAdminFileFlags = 4096

public val COMAdminFileFlagContainsComp: COMAdminFileFlags = 8

public val COMAdminFileFlagContainsPS: COMAdminFileFlags = 4

public val COMAdminFileFlagContainsTLB: COMAdminFileFlags = 16

public val COMAdminFileFlagDLLRegsvrFailed: COMAdminFileFlags = 32768

public val COMAdminFileFlagDoesNotExist: COMAdminFileFlags = 256

public val COMAdminFileFlagError: COMAdminFileFlags = 262144

public val COMAdminFileFlagGetClassObjFailed: COMAdminFileFlags = 2048

public val COMAdminFileFlagLoadable: COMAdminFileFlags = 1

public val COMAdminFileFlagNoRegistrar: COMAdminFileFlags = 16384

public val COMAdminFileFlagRegTLBFailed: COMAdminFileFlags = 65536

public val COMAdminFileFlagRegistrar: COMAdminFileFlags = 8192

public val COMAdminFileFlagRegistrarFailed: COMAdminFileFlags = 131072

public val COMAdminFileFlagSelfReg: COMAdminFileFlags = 32

public val COMAdminFileFlagSelfUnReg: COMAdminFileFlags = 64

public val COMAdminFileFlagUnloadableDLL: COMAdminFileFlags = 128

public val COMAdminImpersonationAnonymous: COMAdminImpersonationLevelOptions = 1

public val COMAdminImpersonationDelegate: COMAdminImpersonationLevelOptions = 4

public val COMAdminImpersonationIdentify: COMAdminImpersonationLevelOptions = 2

public val COMAdminImpersonationImpersonate: COMAdminImpersonationLevelOptions = 3

public val COMAdminInUseByCatalog: COMAdminInUse = 1

public val COMAdminInUseByRegistryClsid: COMAdminInUse = 5

public val COMAdminInUseByRegistryProxyStub: COMAdminInUse = 3

public val COMAdminInUseByRegistryTypeLib: COMAdminInUse = 4

public val COMAdminInUseByRegistryUnknown: COMAdminInUse = 2

public val COMAdminInstallForceOverwriteOfFiles: COMAdminApplicationInstallOptions = 2

public val COMAdminInstallNoUsers: COMAdminApplicationInstallOptions = 0

public val COMAdminInstallUsers: COMAdminApplicationInstallOptions = 1

public val COMAdminNotInUse: COMAdminInUse = 0

public val COMAdminOSNotInitialized: COMAdminOS = 0

public val COMAdminOSUnknown: COMAdminOS = 6

public val COMAdminOSWindows2000: COMAdminOS = 3

public val COMAdminOSWindows2000AdvancedServer: COMAdminOS = 4

public val COMAdminOSWindows2000Unknown: COMAdminOS = 5

public val COMAdminOSWindows3_1: COMAdminOS = 1

public val COMAdminOSWindows7DatacenterServer: COMAdminOS = 27

public val COMAdminOSWindows7EnterpriseServer: COMAdminOS = 26

public val COMAdminOSWindows7Personal: COMAdminOS = 23

public val COMAdminOSWindows7Professional: COMAdminOS = 24

public val COMAdminOSWindows7StandardServer: COMAdminOS = 25

public val COMAdminOSWindows7WebServer: COMAdminOS = 28

public val COMAdminOSWindows8DatacenterServer: COMAdminOS = 33

public val COMAdminOSWindows8EnterpriseServer: COMAdminOS = 32

public val COMAdminOSWindows8Personal: COMAdminOS = 29

public val COMAdminOSWindows8Professional: COMAdminOS = 30

public val COMAdminOSWindows8StandardServer: COMAdminOS = 31

public val COMAdminOSWindows8WebServer: COMAdminOS = 34

public val COMAdminOSWindows9x: COMAdminOS = 2

public val COMAdminOSWindowsBlueDatacenterServer: COMAdminOS = 39

public val COMAdminOSWindowsBlueEnterpriseServer: COMAdminOS = 38

public val COMAdminOSWindowsBluePersonal: COMAdminOS = 35

public val COMAdminOSWindowsBlueProfessional: COMAdminOS = 36

public val COMAdminOSWindowsBlueStandardServer: COMAdminOS = 37

public val COMAdminOSWindowsBlueWebServer: COMAdminOS = 40

public val COMAdminOSWindowsLonghornDatacenterServer: COMAdminOS = 21

public val COMAdminOSWindowsLonghornEnterpriseServer: COMAdminOS = 20

public val COMAdminOSWindowsLonghornPersonal: COMAdminOS = 17

public val COMAdminOSWindowsLonghornProfessional: COMAdminOS = 18

public val COMAdminOSWindowsLonghornStandardServer: COMAdminOS = 19

public val COMAdminOSWindowsLonghornWebServer: COMAdminOS = 22

public val COMAdminOSWindowsNETDatacenterServer: COMAdminOS = 15

public val COMAdminOSWindowsNETEnterpriseServer: COMAdminOS = 14

public val COMAdminOSWindowsNETStandardServer: COMAdminOS = 13

public val COMAdminOSWindowsNETWebServer: COMAdminOS = 16

public val COMAdminOSWindowsXPPersonal: COMAdminOS = 11

public val COMAdminOSWindowsXPProfessional: COMAdminOS = 12

public val COMAdminQCMessageAuthenticateOff: COMAdminQCMessageAuthenticateOptions = 1

public val COMAdminQCMessageAuthenticateOn: COMAdminQCMessageAuthenticateOptions = 2

public val COMAdminQCMessageAuthenticateSecureApps: COMAdminQCMessageAuthenticateOptions = 0

public val COMAdminServiceContinuePending: COMAdminServiceStatusOptions = 4

public val COMAdminServiceLoadBalanceRouter: COMAdminServiceOptions = 1

public val COMAdminServicePausePending: COMAdminServiceStatusOptions = 5

public val COMAdminServicePaused: COMAdminServiceStatusOptions = 6

public val COMAdminServiceRunning: COMAdminServiceStatusOptions = 3

public val COMAdminServiceStartPending: COMAdminServiceStatusOptions = 1

public val COMAdminServiceStopPending: COMAdminServiceStatusOptions = 2

public val COMAdminServiceStopped: COMAdminServiceStatusOptions = 0

public val COMAdminServiceUnknownState: COMAdminServiceStatusOptions = 7

public val COMAdminSynchronizationIgnored: COMAdminSynchronizationOptions = 0

public val COMAdminSynchronizationNone: COMAdminSynchronizationOptions = 1

public val COMAdminSynchronizationRequired: COMAdminSynchronizationOptions = 3

public val COMAdminSynchronizationRequiresNew: COMAdminSynchronizationOptions = 4

public val COMAdminSynchronizationSupported: COMAdminSynchronizationOptions = 2

public val COMAdminThreadingModelApartment: COMAdminThreadingModels = 0

public val COMAdminThreadingModelBoth: COMAdminThreadingModels = 3

public val COMAdminThreadingModelFree: COMAdminThreadingModels = 1

public val COMAdminThreadingModelMain: COMAdminThreadingModels = 2

public val COMAdminThreadingModelNeutral: COMAdminThreadingModels = 4

public val COMAdminThreadingModelNotSpecified: COMAdminThreadingModels = 5

public val COMAdminTransactionIgnored: COMAdminTransactionOptions = 0

public val COMAdminTransactionNone: COMAdminTransactionOptions = 1

public val COMAdminTransactionRequired: COMAdminTransactionOptions = 3

public val COMAdminTransactionRequiresNew: COMAdminTransactionOptions = 4

public val COMAdminTransactionSupported: COMAdminTransactionOptions = 2

public val COMAdminTxIsolationLevelAny: COMAdminTxIsolationLevelOptions = 0

public val COMAdminTxIsolationLevelReadCommitted: COMAdminTxIsolationLevelOptions = 2

public val COMAdminTxIsolationLevelReadUnCommitted: COMAdminTxIsolationLevelOptions = 1

public val COMAdminTxIsolationLevelRepeatableRead: COMAdminTxIsolationLevelOptions = 3

public val COMAdminTxIsolationLevelSerializable: COMAdminTxIsolationLevelOptions = 4

public val COMEvents: GUID = GUID.from_u128(U128(0xecabb0ab7f1911d2uL, 0x978e0000f8757e2auL))

public val CRMClerk: GUID = GUID.from_u128(U128(0xecabb0bd7f1911d2uL, 0x978e0000f8757e2auL))

public val CRMFLAG_FORGETTARGET: CRMFLAGS = 1

public val CRMFLAG_REPLAYINPROGRESS: CRMFLAGS = 64

public val CRMFLAG_WRITTENDURINGABORT: CRMFLAGS = 8

public val CRMFLAG_WRITTENDURINGCOMMIT: CRMFLAGS = 4

public val CRMFLAG_WRITTENDURINGPREPARE: CRMFLAGS = 2

public val CRMFLAG_WRITTENDURINGRECOVERY: CRMFLAGS = 16

public val CRMFLAG_WRITTENDURINGREPLAY: CRMFLAGS = 32

public val CRMREGFLAG_ABORTPHASE: CRMREGFLAGS = 4

public val CRMREGFLAG_ALLPHASES: CRMREGFLAGS = 7

public val CRMREGFLAG_COMMITPHASE: CRMREGFLAGS = 2

public val CRMREGFLAG_FAILIFINDOUBTSREMAIN: CRMREGFLAGS = 16

public val CRMREGFLAG_PREPAREPHASE: CRMREGFLAGS = 1

public val CRMRecoveryClerk: GUID = GUID.from_u128(U128(0xecabb0be7f1911d2uL, 0x978e0000f8757e2auL))

public val CRR_ACTIVATION_LIMIT: UInt = 4294967294u

public val CRR_CALL_LIMIT: UInt = 4294967293u

public val CRR_LIFETIME_LIMIT: UInt = 4294967295u

public val CRR_MEMORY_LIMIT: UInt = 4294967292u

public val CRR_NO_REASON_SUPPLIED: UInt = 0u

public val CRR_RECYCLED_FROM_UI: UInt = 4294967291u

public val CSC_BindToPoolThread: CSC_Binding = 1

public val CSC_CreateTransactionIfNecessary: CSC_TransactionConfig = 2

public val CSC_DontUseTracker: CSC_TrackerConfig = 0

public val CSC_IfContainerIsSynchronized: CSC_SynchronizationConfig = 1

public val CSC_IfContainerIsTransactional: CSC_TransactionConfig = 1

public val CSC_Ignore: CSC_InheritanceConfig = 1

public val CSC_Inherit: CSC_InheritanceConfig = 0

public val CSC_InheritCOMTIIntrinsics: CSC_COMTIIntrinsicsConfig = 1

public val CSC_InheritIISIntrinsics: CSC_IISIntrinsicsConfig = 1

public val CSC_InheritPartition: CSC_PartitionConfig = 1

public val CSC_InheritSxs: CSC_SxsConfig = 1

public val CSC_MTAThreadPool: CSC_ThreadPool = 3

public val CSC_NewPartition: CSC_PartitionConfig = 2

public val CSC_NewSxs: CSC_SxsConfig = 2

public val CSC_NewSynchronization: CSC_SynchronizationConfig = 3

public val CSC_NewSynchronizationIfNecessary: CSC_SynchronizationConfig = 2

public val CSC_NewTransaction: CSC_TransactionConfig = 3

public val CSC_NoBinding: CSC_Binding = 0

public val CSC_NoCOMTIIntrinsics: CSC_COMTIIntrinsicsConfig = 0

public val CSC_NoIISIntrinsics: CSC_IISIntrinsicsConfig = 0

public val CSC_NoPartition: CSC_PartitionConfig = 0

public val CSC_NoSxs: CSC_SxsConfig = 0

public val CSC_NoSynchronization: CSC_SynchronizationConfig = 0

public val CSC_NoTransaction: CSC_TransactionConfig = 0

public val CSC_STAThreadPool: CSC_ThreadPool = 2

public val CSC_ThreadPoolInherit: CSC_ThreadPool = 1

public val CSC_ThreadPoolNone: CSC_ThreadPool = 0

public val CSC_UseTracker: CSC_TrackerConfig = 1

public val CServiceConfig: GUID = GUID.from_u128(U128(0xecabb0c87f1911d2uL, 0x978e0000f8757e2auL))

public val ClrAssemblyLocator: GUID = GUID.from_u128(U128(0x458aa3b5265a4b75uL, 0xbc059bea4630cf18uL))

public val CoMTSLocator: GUID = GUID.from_u128(U128(0xecabb0ac7f1911d2uL, 0x978e0000f8757e2auL))

public val ComServiceEvents: GUID = GUID.from_u128(U128(0xecabb0c37f1911d2uL, 0x978e0000f8757e2auL))

public val ComSystemAppEventData: GUID = GUID.from_u128(U128(0xecabb0c67f1911d2uL, 0x978e0000f8757e2auL))

public val DATA_NOT_AVAILABLE: UInt = 4294967295u

public val DUMPTYPE_FULL: DUMPTYPE = 0

public val DUMPTYPE_MINI: DUMPTYPE = 1

public val DUMPTYPE_NONE: DUMPTYPE = 2

public val DispenserManager: GUID = GUID.from_u128(U128(0xecabb0c07f1911d2uL, 0x978e0000f8757e2auL))

public val Dummy30040732: GUID = GUID.from_u128(U128(0xecabb0a97f1911d2uL, 0x978e0000f8757e2auL))

public val EventServer: GUID = GUID.from_u128(U128(0xecabafbc7f1911d2uL, 0x978e0000f8757e2auL))

public val GATD_INCLUDE_APPLICATION_NAME: GetAppTrackerDataFlags = 16

public val GATD_INCLUDE_CLASS_NAME: GetAppTrackerDataFlags = 8

public val GATD_INCLUDE_LIBRARY_APPS: GetAppTrackerDataFlags = 2

public val GATD_INCLUDE_PROCESS_EXE_NAME: GetAppTrackerDataFlags = 1

public val GATD_INCLUDE_SWC: GetAppTrackerDataFlags = 4

public val GUID_STRING_SIZE: UInt = 40u

public val GetSecurityCallContextAppObject: GUID = GUID.from_u128(U128(0xecabb0a87f1911d2uL, 0x978e0000f8757e2auL))

public val LBEvents: GUID = GUID.from_u128(U128(0xecabb0c17f1911d2uL, 0x978e0000f8757e2auL))

public val LockMethod: LockModes = 1

public val LockSetGet: LockModes = 0

public val MTXDM_E_ENLISTRESOURCEFAILED: UInt = 2147803392u

public val MessageMover: GUID = GUID.from_u128(U128(0xecabb0bf7f1911d2uL, 0x978e0000f8757e2auL))

public val MtsGrp: GUID = GUID.from_u128(U128(0x4b2e958d039311d1uL, 0xb1ab00aa00ba3258uL))

public val PoolMgr: GUID = GUID.from_u128(U128(0xecabafb57f1911d2uL, 0x978e0000f8757e2auL))

public val Process: ReleaseModes = 1

public val SecurityCallContext: GUID = GUID.from_u128(U128(0xecabb0a77f1911d2uL, 0x978e0000f8757e2auL))

public val SecurityCallers: GUID = GUID.from_u128(U128(0xecabb0a67f1911d2uL, 0x978e0000f8757e2auL))

public val SecurityIdentity: GUID = GUID.from_u128(U128(0xecabb0a57f1911d2uL, 0x978e0000f8757e2auL))

public val ServicePool: GUID = GUID.from_u128(U128(0xecabb0c97f1911d2uL, 0x978e0000f8757e2auL))

public val ServicePoolConfig: GUID = GUID.from_u128(U128(0xecabb0ca7f1911d2uL, 0x978e0000f8757e2auL))

public val SharedProperty: GUID = GUID.from_u128(U128(0x2a005c05a5de11cfuL, 0x9e6600aa00a3f464uL))

public val SharedPropertyGroup: GUID = GUID.from_u128(U128(0x2a005c0ba5de11cfuL, 0x9e6600aa00a3f464uL))

public val SharedPropertyGroupManager: GUID = GUID.from_u128(U128(0x2a005c11a5de11cfuL, 0x9e6600aa00a3f464uL))

public val Standard: ReleaseModes = 0

public val TRACKER_INIT_EVENT: PCWSTR = w("Global\\COM+ Tracker Init Event")

public val TRACKER_STARTSTOP_EVENT: PCWSTR = w("Global\\COM+ Tracker Push Event")

public val TRKCOLL_APPLICATIONS: TRACKING_COLL_TYPE = 1

public val TRKCOLL_COMPONENTS: TRACKING_COLL_TYPE = 2

public val TRKCOLL_PROCESSES: TRACKING_COLL_TYPE = 0

public val TrackerServer: GUID = GUID.from_u128(U128(0xecabafb97f1911d2uL, 0x978e0000f8757e2auL))

public val TransactionContext: GUID = GUID.from_u128(U128(0x7999fc25d3c611cfuL, 0xacab00a024a55aefuL))

public val TransactionContextEx: GUID = GUID.from_u128(U128(0x5cb66670d3d411cfuL, 0xacab00a024a55aefuL))

public val TxAbort: TransactionVote = 1

public val TxCommit: TransactionVote = 0

public val TxState_Aborted: CrmTransactionState = 2

public val TxState_Active: CrmTransactionState = 0

public val TxState_Committed: CrmTransactionState = 1

public val TxState_Indoubt: CrmTransactionState = 3

public val comQCErrApplicationNotQueued: AutoSvcs_Error_Constants = 2148599296u

public val comQCErrNoQueueableInterfaces: AutoSvcs_Error_Constants = 2148599297u

public val comQCErrQueueTransactMismatch: AutoSvcs_Error_Constants = 2148599299u

public val comQCErrQueuingServiceNotAvailable: AutoSvcs_Error_Constants = 2148599298u

public val comqcErrBadMarshaledObject: AutoSvcs_Error_Constants = 2148599382u

public val comqcErrInvalidMessage: AutoSvcs_Error_Constants = 2148599376u

public val comqcErrMarshaledObjSameTxn: AutoSvcs_Error_Constants = 2148599304u

public val comqcErrMsgNotAuthenticated: AutoSvcs_Error_Constants = 2148599380u

public val comqcErrMsmqConnectorUsed: AutoSvcs_Error_Constants = 2148599381u

public val comqcErrMsmqServiceUnavailable: AutoSvcs_Error_Constants = 2148599379u

public val comqcErrMsmqSidUnavailable: AutoSvcs_Error_Constants = 2148599377u

public val comqcErrOutParam: AutoSvcs_Error_Constants = 2148599301u

public val comqcErrPSLoad: AutoSvcs_Error_Constants = 2148599303u

public val comqcErrRecorderMarshalled: AutoSvcs_Error_Constants = 2148599300u

public val comqcErrRecorderNotTrusted: AutoSvcs_Error_Constants = 2148599302u

public val comqcErrWrongMsgExtension: AutoSvcs_Error_Constants = 2148599378u

public val mtsErrCtxAborted: AutoSvcs_Error_Constants = 2147803138u

public val mtsErrCtxAborting: AutoSvcs_Error_Constants = 2147803139u

public val mtsErrCtxNoContext: AutoSvcs_Error_Constants = 2147803140u

public val mtsErrCtxNoSecurity: AutoSvcs_Error_Constants = 2147803149u

public val mtsErrCtxNotRegistered: AutoSvcs_Error_Constants = 2147803141u

public val mtsErrCtxOldReference: AutoSvcs_Error_Constants = 2147803143u

public val mtsErrCtxRoleNotFound: AutoSvcs_Error_Constants = 2147803148u

public val mtsErrCtxSynchTimeout: AutoSvcs_Error_Constants = 2147803142u

public val mtsErrCtxTMNotAvailable: AutoSvcs_Error_Constants = 2147803151u

public val mtsErrCtxWrongThread: AutoSvcs_Error_Constants = 2147803150u
