package io.github.kotlinmania.windowssys.windows.win32.storage.jet

import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.w

public val JET_BASE_NAME_LENGTH: UInt = 3u

public val JET_ColInfoGrbitMinimalInfo: UInt = 1073741824u

public val JET_ColInfoGrbitNonDerivedColumnsOnly: UInt = 2147483648u

public val JET_ColInfoGrbitSortByColumnid: UInt = 536870912u

public val JET_DbInfoCollate: UInt = 5u

public val JET_DbInfoConnect: UInt = 1u

public val JET_DbInfoCountry: UInt = 2u

public val JET_DbInfoCp: UInt = 4u

public val JET_DbInfoDBInUse: UInt = 15u

public val JET_DbInfoFileType: UInt = 19u

public val JET_DbInfoFilename: UInt = 0u

public val JET_DbInfoFilesize: UInt = 10u

public val JET_DbInfoFilesizeOnDisk: UInt = 21u

public val JET_DbInfoIsam: UInt = 9u

public val JET_DbInfoLCID: UInt = 3u

public val JET_DbInfoLangid: UInt = 3u

public val JET_DbInfoMisc: UInt = 14u

public val JET_DbInfoOptions: UInt = 6u

public val JET_DbInfoPageSize: UInt = 17u

public val JET_DbInfoSpaceAvailable: UInt = 12u

public val JET_DbInfoSpaceOwned: UInt = 11u

public val JET_DbInfoTransactions: UInt = 7u

public val JET_DbInfoUpgrade: UInt = 13u

public val JET_DbInfoVersion: UInt = 8u

public val JET_EventLoggingDisable: UInt = 0u

public val JET_EventLoggingLevelHigh: UInt = 75u

public val JET_EventLoggingLevelLow: UInt = 25u

public val JET_EventLoggingLevelMax: UInt = 100u

public val JET_EventLoggingLevelMedium: UInt = 50u

public val JET_EventLoggingLevelMin: UInt = 1u

public val JET_ExceptionFailFast: UInt = 4u

public val JET_ExceptionMsgBox: UInt = 1u

public val JET_ExceptionNone: UInt = 2u

public val JET_IOPriorityLow: UInt = 1u

public val JET_IOPriorityNormal: UInt = 0u

public val JET_IndexCheckingDeferToOpenTable: JET_INDEXCHECKING = 2

public val JET_IndexCheckingMax: JET_INDEXCHECKING = 3

public val JET_IndexCheckingOff: JET_INDEXCHECKING = 0

public val JET_IndexCheckingOn: JET_INDEXCHECKING = 1

public val JET_MAX_COMPUTERNAME_LENGTH: UInt = 15u

public val JET_MoveFirst: UInt = 2147483648u

public val JET_MoveLast: UInt = 2147483647u

public val JET_MovePrevious: Int = -1

public val JET_OnlineDefragAll: UInt = 65535u

public val JET_OnlineDefragAllOBSOLETE: UInt = 1u

public val JET_OnlineDefragDatabases: UInt = 2u

public val JET_OnlineDefragDisable: UInt = 0u

public val JET_OnlineDefragSpaceTrees: UInt = 4u

public val JET_VERSION: UInt = 1280u

public val JET_bitAbortSnapshot: UInt = 1u

public val JET_bitAllDatabasesSnapshot: UInt = 1u

public val JET_bitBackupAtomic: UInt = 4u

public val JET_bitBackupEndAbort: UInt = 2u

public val JET_bitBackupEndNormal: UInt = 1u

public val JET_bitBackupIncremental: UInt = 1u

public val JET_bitBackupSnapshot: UInt = 16u

public val JET_bitBackupTruncateDone: UInt = 256u

public val JET_bitBookmarkPermitVirtualCurrency: UInt = 1u

public val JET_bitCheckUniqueness: UInt = 64u

public val JET_bitColumnAutoincrement: UInt = 16u

public val JET_bitColumnCompressed: UInt = 524288u

public val JET_bitColumnDeleteOnZero: UInt = 131072u

public val JET_bitColumnEscrowUpdate: UInt = 2048u

public val JET_bitColumnFinalize: UInt = 16384u

public val JET_bitColumnFixed: UInt = 1u

public val JET_bitColumnMaybeNull: UInt = 8192u

public val JET_bitColumnMultiValued: UInt = 1024u

public val JET_bitColumnNotNULL: UInt = 4u

public val JET_bitColumnTTDescending: UInt = 128u

public val JET_bitColumnTTKey: UInt = 64u

public val JET_bitColumnTagged: UInt = 2u

public val JET_bitColumnUnversioned: UInt = 4096u

public val JET_bitColumnUpdatable: UInt = 32u

public val JET_bitColumnUserDefinedDefault: UInt = 32768u

public val JET_bitColumnVersion: UInt = 8u

public val JET_bitCommitLazyFlush: UInt = 1u

public val JET_bitCompactRepair: UInt = 64u

public val JET_bitCompactStats: UInt = 32u

public val JET_bitConfigStoreReadControlDefault: UInt = 0u

public val JET_bitConfigStoreReadControlDisableAll: UInt = 2u

public val JET_bitConfigStoreReadControlInhibitRead: UInt = 1u

public val JET_bitContinueAfterThaw: UInt = 4u

public val JET_bitCopySnapshot: UInt = 2u

public val JET_bitCreateHintAppendSequential: UInt = 2u

public val JET_bitCreateHintHotpointSequential: UInt = 4u

public val JET_bitDbDeleteCorruptIndexes: UInt = 16u

public val JET_bitDbDeleteUnicodeIndexes: UInt = 1024u

public val JET_bitDbEnableBackgroundMaintenance: UInt = 2048u

public val JET_bitDbExclusive: UInt = 2u

public val JET_bitDbOverwriteExisting: UInt = 512u

public val JET_bitDbPurgeCacheOnAttach: UInt = 4096u

public val JET_bitDbReadOnly: UInt = 1u

public val JET_bitDbRecoveryOff: UInt = 8u

public val JET_bitDbShadowingOff: UInt = 128u

public val JET_bitDbUpgrade: UInt = 512u

public val JET_bitDefragmentAvailSpaceTreesOnly: UInt = 64u

public val JET_bitDefragmentBTree: UInt = 256u

public val JET_bitDefragmentBatchStart: UInt = 1u

public val JET_bitDefragmentBatchStop: UInt = 2u

public val JET_bitDefragmentNoPartialMerges: UInt = 128u

public val JET_bitDeleteColumnIgnoreTemplateColumns: UInt = 1u

public val JET_bitDeleteHintTableSequential: UInt = 256u

public val JET_bitDumpCacheIncludeCachedPages: UInt = 32u

public val JET_bitDumpCacheIncludeCorruptedPages: UInt = 64u

public val JET_bitDumpCacheIncludeDirtyPages: UInt = 16u

public val JET_bitDumpCacheMaximum: UInt = 8u

public val JET_bitDumpCacheMinimum: UInt = 4u

public val JET_bitDumpCacheNoDecommit: UInt = 128u

public val JET_bitDumpMaximum: UInt = 2u

public val JET_bitDumpMinimum: UInt = 1u

public val JET_bitDurableCommitCallbackLogUnavailable: UInt = 1u

public val JET_bitESE98FileNames: UInt = 1u

public val JET_bitEightDotThreeSoftCompat: UInt = 2u

public val JET_bitEnumerateCompressOutput: UInt = 524288u

public val JET_bitEnumerateCopy: UInt = 1u

public val JET_bitEnumerateIgnoreDefault: UInt = 32u

public val JET_bitEnumerateIgnoreUserDefinedDefault: UInt = 1048576u

public val JET_bitEnumerateInRecordOnly: UInt = 2097152u

public val JET_bitEnumeratePresenceOnly: UInt = 131072u

public val JET_bitEnumerateTaggedOnly: UInt = 262144u

public val JET_bitEscrowNoRollback: UInt = 1u

public val JET_bitExplicitPrepare: UInt = 8u

public val JET_bitForceDetach: UInt = 1u

public val JET_bitForceNewLog: UInt = 16u

public val JET_bitFullColumnEndLimit: UInt = 512u

public val JET_bitFullColumnStartLimit: UInt = 256u

public val JET_bitHungIOEvent: UInt = 1u

public val JET_bitIdleCompact: UInt = 2u

public val JET_bitIdleFlushBuffers: UInt = 1u

public val JET_bitIdleStatus: UInt = 4u

public val JET_bitIncrementalSnapshot: UInt = 1u

public val JET_bitIndexColumnMustBeNonNull: UInt = 2u

public val JET_bitIndexColumnMustBeNull: UInt = 1u

public val JET_bitIndexCrossProduct: UInt = 16384u

public val JET_bitIndexDisallowNull: UInt = 4u

public val JET_bitIndexDisallowTruncation: UInt = 65536u

public val JET_bitIndexDotNetGuid: UInt = 262144u

public val JET_bitIndexEmpty: UInt = 256u

public val JET_bitIndexIgnoreAnyNull: UInt = 32u

public val JET_bitIndexIgnoreFirstNull: UInt = 64u

public val JET_bitIndexIgnoreNull: UInt = 8u

public val JET_bitIndexImmutableStructure: UInt = 524288u

public val JET_bitIndexKeyMost: UInt = 32768u

public val JET_bitIndexLazyFlush: UInt = 128u

public val JET_bitIndexNestedTable: UInt = 131072u

public val JET_bitIndexPrimary: UInt = 2u

public val JET_bitIndexSortNullsHigh: UInt = 1024u

public val JET_bitIndexTupleLimits: UInt = 8192u

public val JET_bitIndexTuples: UInt = 4096u

public val JET_bitIndexUnicode: UInt = 2048u

public val JET_bitIndexUnique: UInt = 1u

public val JET_bitIndexUnversioned: UInt = 512u

public val JET_bitKeepDbAttachedAtEndOfRecovery: UInt = 4096u

public val JET_bitKeyAscending: UInt = 0u

public val JET_bitKeyDataZeroLength: UInt = 16u

public val JET_bitKeyDescending: UInt = 1u

public val JET_bitLSCursor: UInt = 2u

public val JET_bitLSReset: UInt = 1u

public val JET_bitLSTable: UInt = 4u

public val JET_bitLogStreamMustExist: UInt = 64u

public val JET_bitMoveFirst: UInt = 0u

public val JET_bitMoveKeyNE: UInt = 1u

public val JET_bitNewKey: UInt = 1u

public val JET_bitNoMove: UInt = 2u

public val JET_bitNormalizedKey: UInt = 8u

public val JET_bitObjectSystem: UInt = 2147483648u

public val JET_bitObjectTableDerived: UInt = 268435456u

public val JET_bitObjectTableFixedDDL: UInt = 1073741824u

public val JET_bitObjectTableNoFixedVarColumnsInDerivedTables: UInt = 67108864u

public val JET_bitObjectTableTemplate: UInt = 536870912u

public val JET_bitPartialColumnEndLimit: UInt = 2048u

public val JET_bitPartialColumnStartLimit: UInt = 1024u

public val JET_bitPrereadBackward: UInt = 2u

public val JET_bitPrereadFirstPage: UInt = 4u

public val JET_bitPrereadForward: UInt = 1u

public val JET_bitPrereadNormalizedKey: UInt = 8u

public val JET_bitRangeInclusive: UInt = 1u

public val JET_bitRangeInstantDuration: UInt = 4u

public val JET_bitRangeRemove: UInt = 8u

public val JET_bitRangeUpperLimit: UInt = 2u

public val JET_bitReadLock: UInt = 1u

public val JET_bitRecordInIndex: UInt = 1u

public val JET_bitRecordNotInIndex: UInt = 2u

public val JET_bitRecordSizeInCopyBuffer: UInt = 1u

public val JET_bitRecordSizeLocal: UInt = 4u

public val JET_bitRecordSizeRunningTotal: UInt = 2u

public val JET_bitRecoveryWithoutUndo: UInt = 8u

public val JET_bitReplayIgnoreLostLogs: UInt = 128u

public val JET_bitReplayIgnoreMissingDB: UInt = 4u

public val JET_bitReplayMissingMapEntryDB: UInt = 32u

public val JET_bitResizeDatabaseOnlyGrow: UInt = 1u

public val JET_bitResizeDatabaseOnlyShrink: UInt = 2u

public val JET_bitRetrieveCopy: UInt = 1u

public val JET_bitRetrieveFromIndex: UInt = 2u

public val JET_bitRetrieveFromPrimaryBookmark: UInt = 4u

public val JET_bitRetrieveHintReserve1: UInt = 8u

public val JET_bitRetrieveHintReserve2: UInt = 64u

public val JET_bitRetrieveHintReserve3: UInt = 128u

public val JET_bitRetrieveHintTableScanBackward: UInt = 32u

public val JET_bitRetrieveHintTableScanForward: UInt = 16u

public val JET_bitRetrieveIgnoreDefault: UInt = 32u

public val JET_bitRetrieveNull: UInt = 16u

public val JET_bitRetrieveTag: UInt = 8u

public val JET_bitRetrieveTuple: UInt = 2048u

public val JET_bitRollbackAll: UInt = 1u

public val JET_bitSeekEQ: UInt = 1u

public val JET_bitSeekGE: UInt = 8u

public val JET_bitSeekGT: UInt = 16u

public val JET_bitSeekLE: UInt = 4u

public val JET_bitSeekLT: UInt = 2u

public val JET_bitSetAppendLV: UInt = 1u

public val JET_bitSetCompressed: UInt = 131072u

public val JET_bitSetContiguousLV: UInt = 262144u

public val JET_bitSetIndexRange: UInt = 32u

public val JET_bitSetIntrinsicLV: UInt = 1024u

public val JET_bitSetOverwriteLV: UInt = 4u

public val JET_bitSetRevertToDefaultValue: UInt = 512u

public val JET_bitSetSeparateLV: UInt = 64u

public val JET_bitSetSizeLV: UInt = 8u

public val JET_bitSetUncompressed: UInt = 65536u

public val JET_bitSetUniqueMultiValues: UInt = 128u

public val JET_bitSetUniqueNormalizedMultiValues: UInt = 256u

public val JET_bitSetZeroLength: UInt = 32u

public val JET_bitShrinkDatabaseOff: UInt = 0u

public val JET_bitShrinkDatabaseOn: UInt = 1u

public val JET_bitShrinkDatabaseRealtime: UInt = 2u

public val JET_bitShrinkDatabaseTrim: UInt = 1u

public val JET_bitSpaceHintsUtilizeParentSpace: UInt = 1u

public val JET_bitStopServiceAll: UInt = 0u

public val JET_bitStopServiceBackgroundUserTasks: UInt = 2u

public val JET_bitStopServiceQuiesceCaches: UInt = 4u

public val JET_bitStopServiceResume: UInt = 2147483648u

public val JET_bitStrLimit: UInt = 2u

public val JET_bitSubStrLimit: UInt = 4u

public val JET_bitTTDotNetGuid: UInt = 256u

public val JET_bitTTErrorOnDuplicateInsertion: UInt = 32u

public val JET_bitTTForceMaterialization: UInt = 32u

public val JET_bitTTForwardOnly: UInt = 64u

public val JET_bitTTIndexed: UInt = 1u

public val JET_bitTTIntrinsicLVsOnly: UInt = 128u

public val JET_bitTTScrollable: UInt = 8u

public val JET_bitTTSortNullsHigh: UInt = 16u

public val JET_bitTTUnique: UInt = 2u

public val JET_bitTTUpdatable: UInt = 4u

public val JET_bitTableClass1: UInt = 65536u

public val JET_bitTableClass10: UInt = 655360u

public val JET_bitTableClass11: UInt = 720896u

public val JET_bitTableClass12: UInt = 786432u

public val JET_bitTableClass13: UInt = 851968u

public val JET_bitTableClass14: UInt = 917504u

public val JET_bitTableClass15: UInt = 983040u

public val JET_bitTableClass2: UInt = 131072u

public val JET_bitTableClass3: UInt = 196608u

public val JET_bitTableClass4: UInt = 262144u

public val JET_bitTableClass5: UInt = 327680u

public val JET_bitTableClass6: UInt = 393216u

public val JET_bitTableClass7: UInt = 458752u

public val JET_bitTableClass8: UInt = 524288u

public val JET_bitTableClass9: UInt = 589824u

public val JET_bitTableClassMask: UInt = 2031616u

public val JET_bitTableClassNone: UInt = 0u

public val JET_bitTableCreateFixedDDL: UInt = 1u

public val JET_bitTableCreateImmutableStructure: UInt = 8u

public val JET_bitTableCreateNoFixedVarColumnsInDerivedTables: UInt = 4u

public val JET_bitTableCreateTemplateTable: UInt = 2u

public val JET_bitTableDenyRead: UInt = 2u

public val JET_bitTableDenyWrite: UInt = 1u

public val JET_bitTableInfoBookmark: UInt = 2u

public val JET_bitTableInfoRollback: UInt = 4u

public val JET_bitTableInfoUpdatable: UInt = 1u

public val JET_bitTableNoCache: UInt = 32u

public val JET_bitTableOpportuneRead: UInt = 128u

public val JET_bitTablePermitDDL: UInt = 16u

public val JET_bitTablePreread: UInt = 64u

public val JET_bitTableReadOnly: UInt = 4u

public val JET_bitTableSequential: UInt = 32768u

public val JET_bitTableUpdatable: UInt = 8u

public val JET_bitTermAbrupt: UInt = 2u

public val JET_bitTermComplete: UInt = 1u

public val JET_bitTermDirty: UInt = 8u

public val JET_bitTermStopBackup: UInt = 4u

public val JET_bitTransactionReadOnly: UInt = 1u

public val JET_bitTruncateLogsAfterRecovery: UInt = 16u

public val JET_bitUpdateCheckESE97Compatibility: UInt = 1u

public val JET_bitWaitAllLevel0Commit: UInt = 8u

public val JET_bitWaitLastLevel0Commit: UInt = 2u

public val JET_bitWriteLock: UInt = 2u

public val JET_bitZeroLength: UInt = 1u

public val JET_cbBookmarkMost: UInt = 256u

public val JET_cbColumnLVPageOverhead: UInt = 82u

public val JET_cbColumnMost: UInt = 255u

public val JET_cbFullNameMost: UInt = 255u

public val JET_cbKeyMost: UInt = 255u

public val JET_cbKeyMost2KBytePage: UInt = 500u

public val JET_cbKeyMost4KBytePage: UInt = 1000u

public val JET_cbKeyMost8KBytePage: UInt = 2000u

public val JET_cbKeyMostMin: UInt = 255u

public val JET_cbLVColumnMost: UInt = 2147483647u

public val JET_cbLVDefaultValueMost: UInt = 255u

public val JET_cbLimitKeyMost: UInt = 256u

public val JET_cbNameMost: UInt = 64u

public val JET_cbPrimaryKeyMost: UInt = 255u

public val JET_cbSecondaryKeyMost: UInt = 255u

public val JET_cbtypAfterDelete: UInt = 64u

public val JET_cbtypAfterInsert: UInt = 4u

public val JET_cbtypAfterReplace: UInt = 16u

public val JET_cbtypBeforeDelete: UInt = 32u

public val JET_cbtypBeforeInsert: UInt = 2u

public val JET_cbtypBeforeReplace: UInt = 8u

public val JET_cbtypFinalize: UInt = 1u

public val JET_cbtypFreeCursorLS: UInt = 512u

public val JET_cbtypFreeTableLS: UInt = 1024u

public val JET_cbtypNull: UInt = 0u

public val JET_cbtypOnlineDefragCompleted: UInt = 256u

public val JET_cbtypUserDefinedDefaultValue: UInt = 128u

public val JET_ccolFixedMost: UInt = 127u

public val JET_ccolKeyMost: UInt = 16u

public val JET_ccolMost: UInt = 65248u

public val JET_ccolTaggedMost: UInt = 64993u

public val JET_ccolVarMost: UInt = 128u

public val JET_coltypBinary: UInt = 9u

public val JET_coltypBit: UInt = 1u

public val JET_coltypCurrency: UInt = 5u

public val JET_coltypDateTime: UInt = 8u

public val JET_coltypGUID: UInt = 16u

public val JET_coltypIEEEDouble: UInt = 7u

public val JET_coltypIEEESingle: UInt = 6u

public val JET_coltypLong: UInt = 4u

public val JET_coltypLongBinary: UInt = 11u

public val JET_coltypLongLong: UInt = 15u

public val JET_coltypLongText: UInt = 12u

public val JET_coltypMax: UInt = 13u

public val JET_coltypNil: UInt = 0u

public val JET_coltypSLV: UInt = 13u

public val JET_coltypShort: UInt = 3u

public val JET_coltypText: UInt = 10u

public val JET_coltypUnsignedByte: UInt = 2u

public val JET_coltypUnsignedLong: UInt = 14u

public val JET_coltypUnsignedLongLong: UInt = 18u

public val JET_coltypUnsignedShort: UInt = 17u

public val JET_configDefault: UInt = 1u

public val JET_configDynamicMediumMemory: UInt = 32u

public val JET_configHighConcurrencyScaling: UInt = 1024u

public val JET_configLowDiskFootprint: UInt = 4u

public val JET_configLowMemory: UInt = 16u

public val JET_configLowPower: UInt = 64u

public val JET_configMediumDiskFootprint: UInt = 8u

public val JET_configRemoveQuotas: UInt = 2u

public val JET_configRunSilent: UInt = 256u

public val JET_configSSDProfileIO: UInt = 128u

public val JET_configUnthrottledMemory: UInt = 512u

public val JET_dbstateBeingConverted: UInt = 4u

public val JET_dbstateCleanShutdown: UInt = 3u

public val JET_dbstateDirtyShutdown: UInt = 2u

public val JET_dbstateForceDetach: UInt = 5u

public val JET_dbstateJustCreated: UInt = 1u

public val JET_errAccessDenied: Int = -1907

public val JET_errAfterInitialization: Int = -1850

public val JET_errAlreadyInitialized: Int = -1030

public val JET_errAlreadyPrepared: Int = -1607

public val JET_errAttachedDatabaseMismatch: Int = -1216

public val JET_errBackupAbortByServer: Int = -801

public val JET_errBackupDirectoryNotEmpty: Int = -504

public val JET_errBackupInProgress: Int = -505

public val JET_errBackupNotAllowedYet: Int = -523

public val JET_errBadBackupDatabaseSize: Int = -561

public val JET_errBadBookmark: Int = -328

public val JET_errBadCheckpointSignature: Int = -532

public val JET_errBadColumnId: Int = -1517

public val JET_errBadDbSignature: Int = -531

public val JET_errBadEmptyPage: Int = -351

public val JET_errBadItagSequence: Int = -1518

public val JET_errBadLineCount: Int = -354

public val JET_errBadLogSignature: Int = -530

public val JET_errBadLogVersion: Int = -514

public val JET_errBadPageLink: Int = -327

public val JET_errBadParentPageLink: Int = -338

public val JET_errBadPatchPage: Int = -535

public val JET_errBadRestoreTargetInstance: Int = -577

public val JET_errBufferTooSmall: Int = -1038

public val JET_errCallbackFailed: Int = -2101

public val JET_errCallbackNotResolved: Int = -2102

public val JET_errCannotAddFixedVarColumnToDerivedTable: Int = -1330

public val JET_errCannotBeTagged: Int = -1521

public val JET_errCannotDeleteSystemTable: Int = -1318

public val JET_errCannotDeleteTempTable: Int = -1317

public val JET_errCannotDeleteTemplateTable: Int = -1319

public val JET_errCannotDisableVersioning: Int = -1208

public val JET_errCannotIndex: Int = -1071

public val JET_errCannotIndexOnEncryptedColumn: Int = -1440

public val JET_errCannotLogDuringRecoveryRedo: Int = -512

public val JET_errCannotMaterializeForwardOnlySort: Int = -1113

public val JET_errCannotNestDDL: Int = -1325

public val JET_errCannotSeparateIntrinsicLV: Int = -416

public val JET_errCatalogCorrupted: Int = -1220

public val JET_errCheckpointCorrupt: Int = -533

public val JET_errCheckpointDepthTooDeep: Int = -614

public val JET_errCheckpointFileNotFound: Int = -542

public val JET_errClientRequestToStopJetService: Int = -1329

public val JET_errColumnCannotBeCompressed: Int = -1538

public val JET_errColumnCannotBeEncrypted: Int = -1439

public val JET_errColumnDoesNotFit: Int = -1503

public val JET_errColumnDuplicate: Int = -1508

public val JET_errColumnInRelationship: Int = -1519

public val JET_errColumnInUse: Int = -1046

public val JET_errColumnIndexed: Int = -1505

public val JET_errColumnLong: Int = -1501

public val JET_errColumnNoChunk: Int = -1502

public val JET_errColumnNoEncryptionKey: Int = -1540

public val JET_errColumnNotFound: Int = -1507

public val JET_errColumnNotUpdatable: Int = -1048

public val JET_errColumnRedundant: Int = -1510

public val JET_errColumnTooBig: Int = -1506

public val JET_errCommittedLogFileCorrupt: Int = -586

public val JET_errCommittedLogFilesMissing: Int = -582

public val JET_errConsistentTimeMismatch: Int = -551

public val JET_errContainerNotEmpty: Int = -1043

public val JET_errDDLNotInheritable: Int = -1326

public val JET_errDataHasChanged: Int = -1611

public val JET_errDatabase200Format: Int = -1210

public val JET_errDatabase400Format: Int = -1211

public val JET_errDatabase500Format: Int = -1212

public val JET_errDatabaseAlreadyRunningMaintenance: Int = -2004

public val JET_errDatabaseAlreadyUpgraded: Int = -562

public val JET_errDatabaseAttachedForRecovery: Int = -1231

public val JET_errDatabaseBufferDependenciesCorrupted: Int = -255

public val JET_errDatabaseCorrupted: Int = -1206

public val JET_errDatabaseCorruptedNoRepair: Int = -1224

public val JET_errDatabaseDirtyShutdown: Int = -550

public val JET_errDatabaseDuplicate: Int = -1201

public val JET_errDatabaseFileReadOnly: Int = -1008

public val JET_errDatabaseIdInUse: Int = -1218

public val JET_errDatabaseInUse: Int = -1202

public val JET_errDatabaseIncompleteUpgrade: Int = -563

public val JET_errDatabaseInconsistent: Int = -550

public val JET_errDatabaseInvalidName: Int = -1204

public val JET_errDatabaseInvalidPages: Int = -1205

public val JET_errDatabaseInvalidPath: Int = -1217

public val JET_errDatabaseLeakInSpace: Int = -348

public val JET_errDatabaseLocked: Int = -1207

public val JET_errDatabaseLogSetMismatch: Int = -539

public val JET_errDatabaseNotFound: Int = -1203

public val JET_errDatabaseNotReady: Int = -1230

public val JET_errDatabasePatchFileMismatch: Int = -552

public val JET_errDatabaseSharingViolation: Int = -1215

public val JET_errDatabaseSignInUse: Int = -1222

public val JET_errDatabaseStreamingFileMismatch: Int = -540

public val JET_errDatabaseUnavailable: Int = -1091

public val JET_errDatabasesNotFromSameSnapshot: Int = -580

public val JET_errDbTimeBeyondMaxRequired: Int = -625

public val JET_errDbTimeCorrupted: Int = -344

public val JET_errDbTimeTooNew: Int = -567

public val JET_errDbTimeTooOld: Int = -566

public val JET_errDecompressionFailed: Int = -1620

public val JET_errDecryptionFailed: Int = -1622

public val JET_errDefaultValueTooBig: Int = -1524

public val JET_errDeleteBackupFileFail: Int = -524

public val JET_errDensityInvalid: Int = -1307

public val JET_errDerivedColumnCorruption: Int = -1529

public val JET_errDirtyShutdown: Int = -1116

public val JET_errDisabledFunctionality: Int = -112

public val JET_errDiskFull: Int = -1808

public val JET_errDiskIO: Int = -1022

public val JET_errDiskReadVerificationFailure: Int = -1021

public val JET_errEncryptionBadItag: Int = -1623

public val JET_errEndingRestoreLogTooLow: Int = -553

public val JET_errEngineFormatVersionNoLongerSupportedTooLow: Int = -619

public val JET_errEngineFormatVersionNotYetImplementedTooHigh: Int = -620

public val JET_errEngineFormatVersionParamTooLowForRequestedFeature: Int = -621

public val JET_errEngineFormatVersionSpecifiedTooLowForDatabaseVersion: Int = -623

public val JET_errEngineFormatVersionSpecifiedTooLowForLogVersion: Int = -622

public val JET_errEntryPointNotFound: Int = -1911

public val JET_errExclusiveTableLockRequired: Int = -1322

public val JET_errExistingLogFileHasBadSignature: Int = -610

public val JET_errExistingLogFileIsNotContiguous: Int = -611

public val JET_errFeatureNotAvailable: Int = -1001

public val JET_errFileAccessDenied: Int = -1032

public val JET_errFileAlreadyExists: Int = -1814

public val JET_errFileClose: Int = -102

public val JET_errFileCompressed: Int = -4005

public val JET_errFileIOAbort: Int = -4002

public val JET_errFileIOBeyondEOF: Int = -4001

public val JET_errFileIOFail: Int = -4004

public val JET_errFileIORetry: Int = -4003

public val JET_errFileIOSparse: Int = -4000

public val JET_errFileInvalidType: Int = -1812

public val JET_errFileNotFound: Int = -1811

public val JET_errFileSystemCorruption: Int = -1121

public val JET_errFilteredMoveNotSupported: Int = -1124

public val JET_errFixedDDL: Int = -1323

public val JET_errFixedInheritedDDL: Int = -1324

public val JET_errFlushMapDatabaseMismatch: Int = -1919

public val JET_errFlushMapUnrecoverable: Int = -1920

public val JET_errFlushMapVersionUnsupported: Int = -1918

public val JET_errForceDetachNotAllowed: Int = -1219

public val JET_errGivenLogFileHasBadSignature: Int = -555

public val JET_errGivenLogFileIsNotContiguous: Int = -556

public val JET_errIllegalOperation: Int = -1312

public val JET_errInTransaction: Int = -1108

public val JET_errIndexBuildCorrupted: Int = -1412

public val JET_errIndexCantBuild: Int = -1401

public val JET_errIndexDuplicate: Int = -1403

public val JET_errIndexHasPrimary: Int = -1402

public val JET_errIndexInUse: Int = -1051

public val JET_errIndexInvalidDef: Int = -1406

public val JET_errIndexMustStay: Int = -1405

public val JET_errIndexNotFound: Int = -1404

public val JET_errIndexTuplesCannotRetrieveFromIndex: Int = -1436

public val JET_errIndexTuplesInvalidLimits: Int = -1435

public val JET_errIndexTuplesKeyTooSmall: Int = -1437

public val JET_errIndexTuplesNonUniqueOnly: Int = -1432

public val JET_errIndexTuplesOneColumnOnly: Int = -1431

public val JET_errIndexTuplesSecondaryIndexOnly: Int = -1430

public val JET_errIndexTuplesTextBinaryColumnsOnly: Int = -1433

public val JET_errIndexTuplesTextColumnsOnly: Int = -1433

public val JET_errIndexTuplesTooManyColumns: Int = -1431

public val JET_errIndexTuplesVarSegMacNotAllowed: Int = -1434

public val JET_errInitInProgress: Int = -1031

public val JET_errInstanceNameInUse: Int = -1086

public val JET_errInstanceUnavailable: Int = -1090

public val JET_errInstanceUnavailableDueToFatalLogDiskFull: Int = -1092

public val JET_errInternalError: Int = -107

public val JET_errInvalidBackup: Int = -526

public val JET_errInvalidBackupSequence: Int = -521

public val JET_errInvalidBookmark: Int = -1045

public val JET_errInvalidBufferSize: Int = -1047

public val JET_errInvalidCodePage: Int = -1063

public val JET_errInvalidColumnType: Int = -1511

public val JET_errInvalidCountry: Int = -1061

public val JET_errInvalidCreateDbVersion: Int = -1225

public val JET_errInvalidCreateIndex: Int = -1409

public val JET_errInvalidDatabase: Int = -1028

public val JET_errInvalidDatabaseId: Int = -1010

public val JET_errInvalidDatabaseVersion: Int = -1209

public val JET_errInvalidDbparamId: Int = -1095

public val JET_errInvalidFilename: Int = -1044

public val JET_errInvalidGrbit: Int = -900

public val JET_errInvalidIndexId: Int = -1416

public val JET_errInvalidInstance: Int = -1115

public val JET_errInvalidLCMapStringFlags: Int = -1064

public val JET_errInvalidLVChunkSize: Int = -1438

public val JET_errInvalidLanguageId: Int = -1062

public val JET_errInvalidLogDirectory: Int = -1025

public val JET_errInvalidLogSequence: Int = -515

public val JET_errInvalidLoggedOperation: Int = -500

public val JET_errInvalidName: Int = -1002

public val JET_errInvalidObject: Int = -1316

public val JET_errInvalidOnSort: Int = -1702

public val JET_errInvalidOperation: Int = -1906

public val JET_errInvalidParameter: Int = -1003

public val JET_errInvalidPath: Int = -1023

public val JET_errInvalidPlaceholderColumn: Int = -1530

public val JET_errInvalidPreread: Int = -424

public val JET_errInvalidSesid: Int = -1104

public val JET_errInvalidSesparamId: Int = -1093

public val JET_errInvalidSettings: Int = -1328

public val JET_errInvalidSystemPath: Int = -1024

public val JET_errInvalidTableId: Int = -1310

public val JET_errKeyBoundary: Int = -324

public val JET_errKeyDuplicate: Int = -1605

public val JET_errKeyIsMade: Int = -1516

public val JET_errKeyNotMade: Int = -1608

public val JET_errKeyTooBig: Int = -408

public val JET_errKeyTruncated: Int = -346

public val JET_errLSAlreadySet: Int = -3001

public val JET_errLSCallbackNotSpecified: Int = -3000

public val JET_errLSNotSet: Int = -3002

public val JET_errLVCorrupted: Int = -1526

public val JET_errLanguageNotSupported: Int = -1619

public val JET_errLinkNotSupported: Int = -1052

public val JET_errLogBufferTooSmall: Int = -517

public val JET_errLogCorruptDuringHardRecovery: Int = -574

public val JET_errLogCorruptDuringHardRestore: Int = -573

public val JET_errLogCorrupted: Int = -1852

public val JET_errLogDisabledDueToRecoveryFailure: Int = -511

public val JET_errLogDiskFull: Int = -529

public val JET_errLogFileCorrupt: Int = -501

public val JET_errLogFileNotCopied: Int = -616

public val JET_errLogFilePathInUse: Int = -1084

public val JET_errLogFileSizeMismatch: Int = -541

public val JET_errLogFileSizeMismatchDatabasesConsistent: Int = -545

public val JET_errLogGenerationMismatch: Int = -513

public val JET_errLogReadVerifyFailure: Int = -612

public val JET_errLogSectorSizeMismatch: Int = -546

public val JET_errLogSectorSizeMismatchDatabasesConsistent: Int = -547

public val JET_errLogSequenceChecksumMismatch: Int = -590

public val JET_errLogSequenceEnd: Int = -519

public val JET_errLogSequenceEndDatabasesConsistent: Int = -548

public val JET_errLogTornWriteDuringHardRecovery: Int = -571

public val JET_errLogTornWriteDuringHardRestore: Int = -570

public val JET_errLogWriteFail: Int = -510

public val JET_errLoggingDisabled: Int = -516

public val JET_errMakeBackupDirectoryFail: Int = -525

public val JET_errMissingCurrentLogFiles: Int = -565

public val JET_errMissingFileToBackup: Int = -569

public val JET_errMissingFullBackup: Int = -560

public val JET_errMissingLogFile: Int = -528

public val JET_errMissingPatchPage: Int = -534

public val JET_errMissingPreviousLogFile: Int = -509

public val JET_errMissingRestoreLogFiles: Int = -557

public val JET_errMultiValuedColumnMustBeTagged: Int = -1509

public val JET_errMultiValuedDuplicate: Int = -1525

public val JET_errMultiValuedDuplicateAfterTruncation: Int = -1528

public val JET_errMultiValuedIndexViolation: Int = -1411

public val JET_errMustBeSeparateLongValue: Int = -423

public val JET_errMustDisableLoggingForDbUpgrade: Int = -575

public val JET_errMustRollback: Int = -1057

public val JET_errNTSystemCallFailed: Int = -334

public val JET_errNoBackup: Int = -520

public val JET_errNoBackupDirectory: Int = -503

public val JET_errNoCurrentIndex: Int = -1515

public val JET_errNoCurrentRecord: Int = -1603

public val JET_errNodeCorrupted: Int = -358

public val JET_errNotInTransaction: Int = -1054

public val JET_errNotInitialized: Int = -1029

public val JET_errNullInvalid: Int = -1504

public val JET_errNullKeyDisallowed: Int = -1053

public val JET_errOSSnapshotInvalidSequence: Int = -2401

public val JET_errOSSnapshotInvalidSnapId: Int = -2404

public val JET_errOSSnapshotNotAllowed: Int = -2403

public val JET_errOSSnapshotTimeOut: Int = -2402

public val JET_errObjectDuplicate: Int = -1314

public val JET_errObjectNotFound: Int = -1305

public val JET_errOneDatabasePerSession: Int = -1916

public val JET_errOutOfAutoincrementValues: Int = -1076

public val JET_errOutOfBuffers: Int = -1014

public val JET_errOutOfCursors: Int = -1013

public val JET_errOutOfDatabaseSpace: Int = -1012

public val JET_errOutOfDbtimeValues: Int = -1077

public val JET_errOutOfFileHandles: Int = -1020

public val JET_errOutOfLongValueIDs: Int = -1075

public val JET_errOutOfMemory: Int = -1011

public val JET_errOutOfObjectIDs: Int = -1074

public val JET_errOutOfSequentialIndexValues: Int = -1078

public val JET_errOutOfSessions: Int = -1101

public val JET_errOutOfThreads: Int = -103

public val JET_errPageBoundary: Int = -323

public val JET_errPageInitializedMismatch: Int = -596

public val JET_errPageNotInitialized: Int = -1019

public val JET_errPageSizeMismatch: Int = -1213

public val JET_errPageTagCorrupted: Int = -357

public val JET_errPartiallyAttachedDB: Int = -1221

public val JET_errPatchFileMissing: Int = -538

public val JET_errPermissionDenied: Int = -1809

public val JET_errPreviousVersion: Int = -322

public val JET_errPrimaryIndexCorrupted: Int = -1413

public val JET_errReadLostFlushVerifyFailure: Int = -1119

public val JET_errReadPgnoVerifyFailure: Int = -1118

public val JET_errReadVerifyFailure: Int = -1018

public val JET_errRecordDeleted: Int = -1017

public val JET_errRecordFormatConversionFailed: Int = -1915

public val JET_errRecordNoCopy: Int = -1602

public val JET_errRecordNotDeleted: Int = -1072

public val JET_errRecordNotFound: Int = -1601

public val JET_errRecordPrimaryChanged: Int = -1604

public val JET_errRecordTooBig: Int = -1026

public val JET_errRecordTooBigForBackwardCompatibility: Int = -1112

public val JET_errRecoveredWithErrors: Int = -527

public val JET_errRecoveredWithoutUndo: Int = -579

public val JET_errRecoveredWithoutUndoDatabasesConsistent: Int = -584

public val JET_errRecoveryVerifyFailure: Int = -1123

public val JET_errRedoAbruptEnded: Int = -536

public val JET_errRequiredLogFilesMissing: Int = -543

public val JET_errRestoreInProgress: Int = -506

public val JET_errRestoreOfNonBackupDatabase: Int = -615

public val JET_errRfsFailure: Int = -100

public val JET_errRfsNotArmed: Int = -101

public val JET_errRollbackError: Int = -1917

public val JET_errRollbackRequired: Int = -1109

public val JET_errRunningInMultiInstanceMode: Int = -1081

public val JET_errRunningInOneInstanceMode: Int = -1080

public val JET_errSPAvailExtCacheOutOfMemory: Int = -342

public val JET_errSPAvailExtCacheOutOfSync: Int = -340

public val JET_errSPAvailExtCorrupted: Int = -341

public val JET_errSPOwnExtCorrupted: Int = -343

public val JET_errSecondaryIndexCorrupted: Int = -1414

public val JET_errSectorSizeNotSupported: Int = -583

public val JET_errSeparatedLongValue: Int = -421

public val JET_errSesidTableIdMismatch: Int = -1114

public val JET_errSessionContextAlreadySet: Int = -1912

public val JET_errSessionContextNotSetByThisThread: Int = -1913

public val JET_errSessionInUse: Int = -1914

public val JET_errSessionSharingViolation: Int = -1910

public val JET_errSessionWriteConflict: Int = -1111

public val JET_errSoftRecoveryOnBackupDatabase: Int = -544

public val JET_errSoftRecoveryOnSnapshot: Int = -581

public val JET_errSpaceHintsInvalid: Int = -2103

public val JET_errStartingRestoreLogTooHigh: Int = -554

public val JET_errStreamingDataNotLogged: Int = -549

public val JET_errSuccess: Int = 0

public val JET_errSystemParameterConflict: Int = -1087

public val JET_errSystemParamsAlreadySet: Int = -1082

public val JET_errSystemPathInUse: Int = -1083

public val JET_errTableDuplicate: Int = -1303

public val JET_errTableInUse: Int = -1304

public val JET_errTableLocked: Int = -1302

public val JET_errTableNotEmpty: Int = -1308

public val JET_errTaggedNotNULL: Int = -1514

public val JET_errTaskDropped: Int = -106

public val JET_errTempFileOpenError: Int = -1803

public val JET_errTempPathInUse: Int = -1085

public val JET_errTermInProgress: Int = -1000

public val JET_errTooManyActiveUsers: Int = -1059

public val JET_errTooManyAttachedDatabases: Int = -1805

public val JET_errTooManyColumns: Int = -1040

public val JET_errTooManyIO: Int = -105

public val JET_errTooManyIndexes: Int = -1015

public val JET_errTooManyInstances: Int = -1214

public val JET_errTooManyKeys: Int = -1016

public val JET_errTooManyMempoolEntries: Int = -1073

public val JET_errTooManyOpenDatabases: Int = -1027

public val JET_errTooManyOpenIndexes: Int = -1410

public val JET_errTooManyOpenTables: Int = -1311

public val JET_errTooManyOpenTablesAndCleanupTimedOut: Int = -1313

public val JET_errTooManyRecords: Int = -1094

public val JET_errTooManySorts: Int = -1701

public val JET_errTooManySplits: Int = -1909

public val JET_errTransReadOnly: Int = -1110

public val JET_errTransTooDeep: Int = -1103

public val JET_errTransactionTooLong: Int = -618

public val JET_errTransactionsNotReadyDuringRecovery: Int = -1232

public val JET_errUnicodeLanguageValidationFailure: Int = -604

public val JET_errUnicodeNormalizationNotSupported: Int = -603

public val JET_errUnicodeTranslationBufferTooSmall: Int = -601

public val JET_errUnicodeTranslationFail: Int = -602

public val JET_errUnloadableOSFunctionality: Int = -113

public val JET_errUpdateMustVersion: Int = -1621

public val JET_errUpdateNotPrepared: Int = -1609

public val JET_errVersionStoreEntryTooBig: Int = -1065

public val JET_errVersionStoreOutOfMemory: Int = -1069

public val JET_errVersionStoreOutOfMemoryAndCleanupTimedOut: Int = -1066

public val JET_errWriteConflict: Int = -1102

public val JET_errWriteConflictPrimaryIndex: Int = -1105

public val JET_errcatApi: JET_ERRCAT = 13

public val JET_errcatCorruption: JET_ERRCAT = 10

public val JET_errcatData: JET_ERRCAT = 9

public val JET_errcatDisk: JET_ERRCAT = 8

public val JET_errcatError: JET_ERRCAT = 1

public val JET_errcatFatal: JET_ERRCAT = 3

public val JET_errcatFragmentation: JET_ERRCAT = 12

public val JET_errcatIO: JET_ERRCAT = 4

public val JET_errcatInconsistent: JET_ERRCAT = 11

public val JET_errcatMax: JET_ERRCAT = 17

public val JET_errcatMemory: JET_ERRCAT = 6

public val JET_errcatObsolete: JET_ERRCAT = 16

public val JET_errcatOperation: JET_ERRCAT = 2

public val JET_errcatQuota: JET_ERRCAT = 7

public val JET_errcatResource: JET_ERRCAT = 5

public val JET_errcatState: JET_ERRCAT = 15

public val JET_errcatUnknown: JET_ERRCAT = 0

public val JET_errcatUsage: JET_ERRCAT = 14

public val JET_filetypeCheckpoint: UInt = 4u

public val JET_filetypeDatabase: UInt = 1u

public val JET_filetypeFlushMap: UInt = 7u

public val JET_filetypeLog: UInt = 3u

public val JET_filetypeTempDatabase: UInt = 5u

public val JET_filetypeUnknown: UInt = 0u

public val JET_objtypNil: UInt = 0u

public val JET_objtypTable: UInt = 1u

public val JET_paramAccessDeniedRetryPeriod: UInt = 53u

public val JET_paramAlternateDatabaseRecoveryPath: UInt = 113u

public val JET_paramBaseName: UInt = 3u

public val JET_paramBatchIOBufferMax: UInt = 22u

public val JET_paramCachePriority: UInt = 177u

public val JET_paramCacheSize: UInt = 41u

public val JET_paramCacheSizeMax: UInt = 23u

public val JET_paramCacheSizeMin: UInt = 60u

public val JET_paramCachedClosedTables: UInt = 125u

public val JET_paramCheckFormatWhenOpenFail: UInt = 44u

public val JET_paramCheckpointDepthMax: UInt = 24u

public val JET_paramCheckpointIOMax: UInt = 135u

public val JET_paramCircularLog: UInt = 17u

public val JET_paramCleanupMismatchedLogFiles: UInt = 77u

public val JET_paramCommitDefault: UInt = 16u

public val JET_paramConfigStoreSpec: UInt = 189u

public val JET_paramConfiguration: UInt = 129u

public val JET_paramCreatePathIfNotExist: UInt = 100u

public val JET_paramDatabasePageSize: UInt = 64u

public val JET_paramDbExtensionSize: UInt = 18u

public val JET_paramDbScanIntervalMaxSec: UInt = 172u

public val JET_paramDbScanIntervalMinSec: UInt = 171u

public val JET_paramDbScanThrottle: UInt = 170u

public val JET_paramDefragmentSequentialBTrees: UInt = 160u

public val JET_paramDefragmentSequentialBTreesDensityCheckFrequency: UInt = 161u

public val JET_paramDeleteOldLogs: UInt = 48u

public val JET_paramDeleteOutOfRangeLogs: UInt = 52u

public val JET_paramDisableCallbacks: UInt = 65u

public val JET_paramDisablePerfmon: UInt = 107u

public val JET_paramDurableCommitCallback: UInt = 187u

public val JET_paramEnableAdvanced: UInt = 130u

public val JET_paramEnableDBScanInRecovery: UInt = 169u

public val JET_paramEnableDBScanSerialization: UInt = 180u

public val JET_paramEnableFileCache: UInt = 126u

public val JET_paramEnableIndexChecking: UInt = 45u

public val JET_paramEnableIndexCleanup: UInt = 54u

public val JET_paramEnableOnlineDefrag: UInt = 35u

public val JET_paramEnablePersistedCallbacks: UInt = 156u

public val JET_paramEnableRBS: UInt = 215u

public val JET_paramEnableShrinkDatabase: UInt = 184u

public val JET_paramEnableSqm: UInt = 188u

public val JET_paramEnableTempTableVersioning: UInt = 46u

public val JET_paramEnableViewCache: UInt = 127u

public val JET_paramErrorToString: UInt = 70u

public val JET_paramEventLogCache: UInt = 99u

public val JET_paramEventLoggingLevel: UInt = 51u

public val JET_paramEventSource: UInt = 4u

public val JET_paramEventSourceKey: UInt = 49u

public val JET_paramExceptionAction: UInt = 98u

public val JET_paramGlobalMinVerPages: UInt = 81u

public val JET_paramHungIOActions: UInt = 182u

public val JET_paramHungIOThreshold: UInt = 181u

public val JET_paramIOPriority: UInt = 152u

public val JET_paramIOThrottlingTimeQuanta: UInt = 162u

public val JET_paramIgnoreLogVersion: UInt = 47u

public val JET_paramIndexTupleIncrement: UInt = 132u

public val JET_paramIndexTupleStart: UInt = 133u

public val JET_paramIndexTuplesLengthMax: UInt = 111u

public val JET_paramIndexTuplesLengthMin: UInt = 110u

public val JET_paramIndexTuplesToIndexMax: UInt = 112u

public val JET_paramKeyMost: UInt = 134u

public val JET_paramLRUKCorrInterval: UInt = 25u

public val JET_paramLRUKHistoryMax: UInt = 26u

public val JET_paramLRUKPolicy: UInt = 27u

public val JET_paramLRUKTimeout: UInt = 28u

public val JET_paramLRUKTrxCorrInterval: UInt = 29u

public val JET_paramLVChunkSizeMost: UInt = 163u

public val JET_paramLegacyFileNames: UInt = 136u

public val JET_paramLogBuffers: UInt = 12u

public val JET_paramLogCheckpointPeriod: UInt = 14u

public val JET_paramLogFileCreateAsynch: UInt = 69u

public val JET_paramLogFilePath: UInt = 2u

public val JET_paramLogFileSize: UInt = 11u

public val JET_paramLogWaitingUserMax: UInt = 15u

public val JET_paramMaxCoalesceReadGapSize: UInt = 166u

public val JET_paramMaxCoalesceReadSize: UInt = 164u

public val JET_paramMaxCoalesceWriteGapSize: UInt = 167u

public val JET_paramMaxCoalesceWriteSize: UInt = 165u

public val JET_paramMaxColtyp: UInt = 131u

public val JET_paramMaxCursors: UInt = 8u

public val JET_paramMaxInstances: UInt = 104u

public val JET_paramMaxOpenTables: UInt = 6u

public val JET_paramMaxSessions: UInt = 5u

public val JET_paramMaxTemporaryTables: UInt = 10u

public val JET_paramMaxTransactionSize: UInt = 178u

public val JET_paramMaxValueInvalid: UInt = 218u

public val JET_paramMaxVerPages: UInt = 9u

public val JET_paramMinDataForXpress: UInt = 183u

public val JET_paramNoInformationEvent: UInt = 50u

public val JET_paramOSSnapshotTimeout: UInt = 82u

public val JET_paramOneDatabasePerSession: UInt = 102u

public val JET_paramOutstandingIOMax: UInt = 30u

public val JET_paramPageFragment: UInt = 20u

public val JET_paramPageHintCacheSize: UInt = 101u

public val JET_paramPageTempDBMin: UInt = 19u

public val JET_paramPerfmonRefreshInterval: UInt = 217u

public val JET_paramPreferredMaxOpenTables: UInt = 7u

public val JET_paramPreferredVerPages: UInt = 63u

public val JET_paramPrereadIOMax: UInt = 179u

public val JET_paramProcessFriendlyName: UInt = 186u

public val JET_paramRBSFilePath: UInt = 216u

public val JET_paramRecordUpgradeDirtyLevel: UInt = 78u

public val JET_paramRecovery: UInt = 34u

public val JET_paramRuntimeCallback: UInt = 73u

public val JET_paramStartFlushThreshold: UInt = 31u

public val JET_paramStopFlushThreshold: UInt = 32u

public val JET_paramSystemPath: UInt = 0u

public val JET_paramTableClass10Name: UInt = 146u

public val JET_paramTableClass11Name: UInt = 147u

public val JET_paramTableClass12Name: UInt = 148u

public val JET_paramTableClass13Name: UInt = 149u

public val JET_paramTableClass14Name: UInt = 150u

public val JET_paramTableClass15Name: UInt = 151u

public val JET_paramTableClass1Name: UInt = 137u

public val JET_paramTableClass2Name: UInt = 138u

public val JET_paramTableClass3Name: UInt = 139u

public val JET_paramTableClass4Name: UInt = 140u

public val JET_paramTableClass5Name: UInt = 141u

public val JET_paramTableClass6Name: UInt = 142u

public val JET_paramTableClass7Name: UInt = 143u

public val JET_paramTableClass8Name: UInt = 144u

public val JET_paramTableClass9Name: UInt = 145u

public val JET_paramTempPath: UInt = 1u

public val JET_paramUnicodeIndexDefault: UInt = 72u

public val JET_paramUseFlushForWriteDurability: UInt = 214u

public val JET_paramVerPageSize: UInt = 128u

public val JET_paramVersionStoreTaskQueueMax: UInt = 105u

public val JET_paramWaitLogFlush: UInt = 13u

public val JET_paramWaypointLatency: UInt = 153u

public val JET_paramZeroDatabaseDuringBackup: UInt = 71u

public val JET_prepCancel: UInt = 3u

public val JET_prepInsert: UInt = 0u

public val JET_prepInsertCopy: UInt = 5u

public val JET_prepInsertCopyDeleteOriginal: UInt = 7u

public val JET_prepInsertCopyReplaceOriginal: UInt = 9u

public val JET_prepReplace: UInt = 2u

public val JET_prepReplaceNoLock: UInt = 4u

public val JET_relopBitmaskEqualsZero: JET_RELOP = 7

public val JET_relopBitmaskNotEqualsZero: JET_RELOP = 8

public val JET_relopEquals: JET_RELOP = 0

public val JET_relopGreaterThan: JET_RELOP = 6

public val JET_relopGreaterThanOrEqual: JET_RELOP = 5

public val JET_relopLessThan: JET_RELOP = 4

public val JET_relopLessThanOrEqual: JET_RELOP = 3

public val JET_relopNotEquals: JET_RELOP = 2

public val JET_relopPrefixEquals: JET_RELOP = 1

public val JET_sesparamCommitDefault: UInt = 4097u

public val JET_sesparamCorrelationID: UInt = 4101u

public val JET_sesparamMaxValueInvalid: UInt = 4111u

public val JET_sesparamOperationContext: UInt = 4100u

public val JET_sesparamTransactionLevel: UInt = 4099u

public val JET_snpBackup: UInt = 9u

public val JET_snpCompact: UInt = 4u

public val JET_snpRepair: UInt = 2u

public val JET_snpRestore: UInt = 8u

public val JET_snpScrub: UInt = 11u

public val JET_snpUpgrade: UInt = 10u

public val JET_snpUpgradeRecordFormat: UInt = 12u

public val JET_sntBegin: UInt = 5u

public val JET_sntComplete: UInt = 6u

public val JET_sntFail: UInt = 3u

public val JET_sntProgress: UInt = 0u

public val JET_sntRequirements: UInt = 7u

public val JET_sqmDisable: UInt = 0u

public val JET_sqmEnable: UInt = 1u

public val JET_sqmFromCEIP: UInt = 2u

public val JET_wrnBufferTruncated: UInt = 1006u

public val JET_wrnCallbackNotRegistered: UInt = 2100u

public val JET_wrnColumnDefault: UInt = 1537u

public val JET_wrnColumnMaxTruncated: UInt = 1512u

public val JET_wrnColumnMoreTags: UInt = 1533u

public val JET_wrnColumnNotInRecord: UInt = 1539u

public val JET_wrnColumnNotLocal: UInt = 1532u

public val JET_wrnColumnNull: UInt = 1004u

public val JET_wrnColumnPresent: UInt = 1535u

public val JET_wrnColumnReference: UInt = 1541u

public val JET_wrnColumnSetNull: UInt = 1068u

public val JET_wrnColumnSingleValue: UInt = 1536u

public val JET_wrnColumnSkipped: UInt = 1531u

public val JET_wrnColumnTruncated: UInt = 1534u

public val JET_wrnCommittedLogFilesLost: UInt = 585u

public val JET_wrnCommittedLogFilesRemoved: UInt = 587u

public val JET_wrnCopyLongValue: UInt = 1520u

public val JET_wrnCorruptIndexDeleted: UInt = 1415u

public val JET_wrnDataHasChanged: UInt = 1610u

public val JET_wrnDatabaseAttached: UInt = 1007u

public val JET_wrnDatabaseRepaired: UInt = 595u

public val JET_wrnDefragAlreadyRunning: UInt = 2000u

public val JET_wrnDefragNotRunning: UInt = 2001u

public val JET_wrnExistingLogFileHasBadSignature: UInt = 558u

public val JET_wrnExistingLogFileIsNotContiguous: UInt = 559u

public val JET_wrnFileOpenReadOnly: UInt = 1813u

public val JET_wrnFinishWithUndo: UInt = 588u

public val JET_wrnIdleFull: UInt = 1908u

public val JET_wrnKeyChanged: UInt = 1618u

public val JET_wrnNoErrorInfo: UInt = 1055u

public val JET_wrnNoIdleActivity: UInt = 1058u

public val JET_wrnNoWriteLock: UInt = 1067u

public val JET_wrnNyi: Int = -1

public val JET_wrnPrimaryIndexOutOfDate: UInt = 1417u

public val JET_wrnRemainingVersions: UInt = 321u

public val JET_wrnSecondaryIndexOutOfDate: UInt = 1418u

public val JET_wrnSeekNotEqual: UInt = 1039u

public val JET_wrnSeparateLongValue: UInt = 406u

public val JET_wrnShrinkNotPossible: UInt = 1122u

public val JET_wrnSkipThisRecord: UInt = 564u

public val JET_wrnSortOverflow: UInt = 1009u

public val JET_wrnTableEmpty: UInt = 1301u

public val JET_wrnTableInUseBySystem: UInt = 1327u

public val JET_wrnTargetInstanceRunning: UInt = 578u

public val JET_wrnUniqueKey: UInt = 345u

public val JET_wszConfigStoreReadControl: PCWSTR = w("CsReadControl")

public val JET_wszConfigStoreRelPathSysParamDefault: PCWSTR = w("SysParamDefault")

public val JET_wszConfigStoreRelPathSysParamOverride: PCWSTR = w("SysParamOverride")

public val cColumnInfoCols: UInt = 14u

public val cIndexInfoCols: UInt = 15u

public val cObjectInfoCols: UInt = 9u

public val wrnBTNotVisibleAccumulated: UInt = 353u

public val wrnBTNotVisibleRejected: UInt = 352u
