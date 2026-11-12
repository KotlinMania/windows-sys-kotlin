@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.jet

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetAddColumnA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetAddColumnW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetAttachDatabase2A
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetAttachDatabase2W
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetAttachDatabaseA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetAttachDatabaseW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetBackupA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetBackupInstanceA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetBackupInstanceW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetBackupW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetBeginExternalBackup
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetBeginExternalBackupInstance
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetBeginSessionA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetBeginSessionW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetBeginTransaction
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetBeginTransaction2
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetBeginTransaction3
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetCloseDatabase
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetCloseFile
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetCloseFileInstance
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetCloseTable
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetCommitTransaction
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetCommitTransaction2
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetCompactA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetCompactW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetComputeStats
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetConfigureProcessForCrashDump
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetCreateDatabase2A
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetCreateDatabase2W
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetCreateDatabaseA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetCreateDatabaseW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetCreateIndex2A
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetCreateIndex2W
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetCreateIndex3A
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetCreateIndex3W
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetCreateIndex4A
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetCreateIndex4W
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetCreateIndexA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetCreateIndexW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetCreateInstance2A
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetCreateInstance2W
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetCreateInstanceA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetCreateInstanceW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetCreateTableA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetCreateTableColumnIndex2A
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetCreateTableColumnIndex2W
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetCreateTableColumnIndex3A
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetCreateTableColumnIndex3W
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetCreateTableColumnIndex4A
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetCreateTableColumnIndex4W
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetCreateTableColumnIndexA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetCreateTableColumnIndexW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetCreateTableW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetDefragment2A
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetDefragment2W
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetDefragment3A
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetDefragment3W
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetDefragmentA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetDefragmentW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetDelete
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetDeleteColumn2A
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetDeleteColumn2W
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetDeleteColumnA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetDeleteColumnW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetDeleteIndexA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetDeleteIndexW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetDeleteTableA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetDeleteTableW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetDetachDatabase2A
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetDetachDatabase2W
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetDetachDatabaseA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetDetachDatabaseW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetDupCursor
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetDupSession
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetEnableMultiInstanceA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetEnableMultiInstanceW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetEndExternalBackup
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetEndExternalBackupInstance
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetEndExternalBackupInstance2
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetEndSession
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetEnumerateColumns
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetEscrowUpdate
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetExternalRestore2A
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetExternalRestore2W
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetExternalRestoreA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetExternalRestoreW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetFreeBuffer
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetAttachInfoA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetAttachInfoInstanceA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetAttachInfoInstanceW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetAttachInfoW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetBookmark
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetColumnInfoA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetColumnInfoW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetCurrentIndexA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetCurrentIndexW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetCursorInfo
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetDatabaseFileInfoA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetDatabaseFileInfoW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetDatabaseInfoA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetDatabaseInfoW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetErrorInfoW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetIndexInfoA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetIndexInfoW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetInstanceInfoA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetInstanceInfoW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetInstanceMiscInfo
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetLS
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetLock
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetLogInfoA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetLogInfoInstance2A
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetLogInfoInstance2W
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetLogInfoInstanceA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetLogInfoInstanceW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetLogInfoW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetObjectInfoA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetObjectInfoW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetRecordPosition
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetRecordSize
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetRecordSize2
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetSecondaryIndexBookmark
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetSessionParameter
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetSystemParameterA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetSystemParameterW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetTableColumnInfoA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetTableColumnInfoW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetTableIndexInfoA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetTableIndexInfoW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetTableInfoA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetTableInfoW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetThreadStats
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetTruncateLogInfoInstanceA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetTruncateLogInfoInstanceW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGetVersion
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGotoBookmark
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGotoPosition
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGotoSecondaryIndexBookmark
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetGrowDatabase
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetIdle
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetIndexRecordCount
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetInit
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetInit2
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetInit3A
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetInit3W
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetIntersectIndexes
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetMakeKey
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetMove
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetOSSnapshotAbort
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetOSSnapshotEnd
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetOSSnapshotFreezeA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetOSSnapshotFreezeW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetOSSnapshotGetFreezeInfoA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetOSSnapshotGetFreezeInfoW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetOSSnapshotPrepare
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetOSSnapshotPrepareInstance
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetOSSnapshotThaw
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetOSSnapshotTruncateLog
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetOSSnapshotTruncateLogInstance
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetOpenDatabaseA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetOpenDatabaseW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetOpenFileA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetOpenFileInstanceA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetOpenFileInstanceW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetOpenFileW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetOpenTableA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetOpenTableW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetOpenTempTable
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetOpenTempTable2
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetOpenTempTable3
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetOpenTemporaryTable
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetOpenTemporaryTable2
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetPrepareUpdate
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetPrereadIndexRanges
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetPrereadKeys
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetReadFile
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetReadFileInstance
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetRegisterCallback
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetRenameColumnA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetRenameColumnW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetRenameTableA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetRenameTableW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetResetSessionContext
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetResetTableSequential
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetResizeDatabase
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetRestore2A
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetRestore2W
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetRestoreA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetRestoreInstanceA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetRestoreInstanceW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetRestoreW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetRetrieveColumn
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetRetrieveColumns
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetRetrieveKey
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetRollback
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetSeek
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetSetColumn
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetSetColumnDefaultValueA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetSetColumnDefaultValueW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetSetColumns
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetSetCurrentIndex2A
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetSetCurrentIndex2W
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetSetCurrentIndex3A
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetSetCurrentIndex3W
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetSetCurrentIndex4A
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetSetCurrentIndex4W
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetSetCurrentIndexA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetSetCurrentIndexW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetSetCursorFilter
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetSetDatabaseSizeA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetSetDatabaseSizeW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetSetIndexRange
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetSetLS
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetSetSessionContext
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetSetSessionParameter
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetSetSystemParameterA
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetSetSystemParameterW
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetSetTableSequential
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetStopBackup
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetStopBackupInstance
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetStopService
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetStopServiceInstance
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetStopServiceInstance2
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetTerm
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetTerm2
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetTruncateLog
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetTruncateLogInstance
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetUnregisterCallback
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetUpdate
import io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssysWindowsWin32StorageJetJetUpdate2
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetApiPtr
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetHandle
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetTableid
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun jetAddColumnA(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr, pcolumndef: ConstPtr, pvdefault: ConstPtr, cbdefault: UInt, pcolumnid: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetAddColumnA(sesid, tableid, szcolumnname.rawAddress.toCPointer<ByteVar>(), pcolumndef.rawAddress.toCPointer<ByteVar>(), pvdefault.rawAddress.toCPointer<ByteVar>(), cbdefault, pcolumnid.rawAddress.toCPointer<ByteVar>())

public actual fun jetAddColumnW(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr, pcolumndef: ConstPtr, pvdefault: ConstPtr, cbdefault: UInt, pcolumnid: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetAddColumnW(sesid, tableid, szcolumnname.rawAddress.toCPointer<ByteVar>(), pcolumndef.rawAddress.toCPointer<ByteVar>(), pvdefault.rawAddress.toCPointer<ByteVar>(), cbdefault, pcolumnid.rawAddress.toCPointer<ByteVar>())

public actual fun jetAttachDatabase2A(sesid: JetSesid, szfilename: ConstPtr, cpgdatabasesizemax: UInt, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetAttachDatabase2A(sesid, szfilename.rawAddress.toCPointer<ByteVar>(), cpgdatabasesizemax, grbit)

public actual fun jetAttachDatabase2W(sesid: JetSesid, szfilename: ConstPtr, cpgdatabasesizemax: UInt, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetAttachDatabase2W(sesid, szfilename.rawAddress.toCPointer<ByteVar>(), cpgdatabasesizemax, grbit)

public actual fun jetAttachDatabaseA(sesid: JetSesid, szfilename: ConstPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetAttachDatabaseA(sesid, szfilename.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetAttachDatabaseW(sesid: JetSesid, szfilename: ConstPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetAttachDatabaseW(sesid, szfilename.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetBackupA(szbackuppath: ConstPtr, grbit: UInt, pfnstatus: JetPfnstatus): Int =
    windowssysWindowsWin32StorageJetJetBackupA(szbackuppath.rawAddress.toCPointer<ByteVar>(), grbit, 0L.toCPointer<ByteVar>())

public actual fun jetBackupInstanceA(instance: JetInstance, szbackuppath: ConstPtr, grbit: UInt, pfnstatus: JetPfnstatus): Int =
    windowssysWindowsWin32StorageJetJetBackupInstanceA(instance, szbackuppath.rawAddress.toCPointer<ByteVar>(), grbit, 0L.toCPointer<ByteVar>())

public actual fun jetBackupInstanceW(instance: JetInstance, szbackuppath: ConstPtr, grbit: UInt, pfnstatus: JetPfnstatus): Int =
    windowssysWindowsWin32StorageJetJetBackupInstanceW(instance, szbackuppath.rawAddress.toCPointer<ByteVar>(), grbit, 0L.toCPointer<ByteVar>())

public actual fun jetBackupW(szbackuppath: ConstPtr, grbit: UInt, pfnstatus: JetPfnstatus): Int =
    windowssysWindowsWin32StorageJetJetBackupW(szbackuppath.rawAddress.toCPointer<ByteVar>(), grbit, 0L.toCPointer<ByteVar>())

public actual fun jetBeginExternalBackup(grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetBeginExternalBackup(grbit)

public actual fun jetBeginExternalBackupInstance(instance: JetInstance, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetBeginExternalBackupInstance(instance, grbit)

public actual fun jetBeginSessionA(instance: JetInstance, psesid: MutPtr, szusername: ConstPtr, szpassword: ConstPtr): Int =
    windowssysWindowsWin32StorageJetJetBeginSessionA(instance, psesid.rawAddress.toCPointer<ByteVar>(), szusername.rawAddress.toCPointer<ByteVar>(), szpassword.rawAddress.toCPointer<ByteVar>())

public actual fun jetBeginSessionW(instance: JetInstance, psesid: MutPtr, szusername: ConstPtr, szpassword: ConstPtr): Int =
    windowssysWindowsWin32StorageJetJetBeginSessionW(instance, psesid.rawAddress.toCPointer<ByteVar>(), szusername.rawAddress.toCPointer<ByteVar>(), szpassword.rawAddress.toCPointer<ByteVar>())

public actual fun jetBeginTransaction(sesid: JetSesid): Int =
    windowssysWindowsWin32StorageJetJetBeginTransaction(sesid)

public actual fun jetBeginTransaction2(sesid: JetSesid, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetBeginTransaction2(sesid, grbit)

public actual fun jetBeginTransaction3(sesid: JetSesid, trxid: Long, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetBeginTransaction3(sesid, trxid, grbit)

public actual fun jetCloseDatabase(sesid: JetSesid, dbid: UInt, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetCloseDatabase(sesid, dbid, grbit)

public actual fun jetCloseFile(hffile: JetHandle): Int =
    windowssysWindowsWin32StorageJetJetCloseFile(hffile)

public actual fun jetCloseFileInstance(instance: JetInstance, hffile: JetHandle): Int =
    windowssysWindowsWin32StorageJetJetCloseFileInstance(instance, hffile)

public actual fun jetCloseTable(sesid: JetSesid, tableid: JetTableid): Int =
    windowssysWindowsWin32StorageJetJetCloseTable(sesid, tableid)

public actual fun jetCommitTransaction(sesid: JetSesid, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetCommitTransaction(sesid, grbit)

public actual fun jetCommitTransaction2(sesid: JetSesid, grbit: UInt, cmsecdurablecommit: UInt, pcommitid: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetCommitTransaction2(sesid, grbit, cmsecdurablecommit, pcommitid.rawAddress.toCPointer<ByteVar>())

public actual fun jetCompactA(sesid: JetSesid, szdatabasesrc: ConstPtr, szdatabasedest: ConstPtr, pfnstatus: JetPfnstatus, pconvert: ConstPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetCompactA(sesid, szdatabasesrc.rawAddress.toCPointer<ByteVar>(), szdatabasedest.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pconvert.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetCompactW(sesid: JetSesid, szdatabasesrc: ConstPtr, szdatabasedest: ConstPtr, pfnstatus: JetPfnstatus, pconvert: ConstPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetCompactW(sesid, szdatabasesrc.rawAddress.toCPointer<ByteVar>(), szdatabasedest.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pconvert.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetComputeStats(sesid: JetSesid, tableid: JetTableid): Int =
    windowssysWindowsWin32StorageJetJetComputeStats(sesid, tableid)

public actual fun jetConfigureProcessForCrashDump(grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetConfigureProcessForCrashDump(grbit)

public actual fun jetCreateDatabase2A(sesid: JetSesid, szfilename: ConstPtr, cpgdatabasesizemax: UInt, pdbid: MutPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetCreateDatabase2A(sesid, szfilename.rawAddress.toCPointer<ByteVar>(), cpgdatabasesizemax, pdbid.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetCreateDatabase2W(sesid: JetSesid, szfilename: ConstPtr, cpgdatabasesizemax: UInt, pdbid: MutPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetCreateDatabase2W(sesid, szfilename.rawAddress.toCPointer<ByteVar>(), cpgdatabasesizemax, pdbid.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetCreateDatabaseA(sesid: JetSesid, szfilename: ConstPtr, szconnect: ConstPtr, pdbid: MutPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetCreateDatabaseA(sesid, szfilename.rawAddress.toCPointer<ByteVar>(), szconnect.rawAddress.toCPointer<ByteVar>(), pdbid.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetCreateDatabaseW(sesid: JetSesid, szfilename: ConstPtr, szconnect: ConstPtr, pdbid: MutPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetCreateDatabaseW(sesid, szfilename.rawAddress.toCPointer<ByteVar>(), szconnect.rawAddress.toCPointer<ByteVar>(), pdbid.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetCreateIndex2A(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr, cindexcreate: UInt): Int =
    windowssysWindowsWin32StorageJetJetCreateIndex2A(sesid, tableid, pindexcreate.rawAddress.toCPointer<ByteVar>(), cindexcreate)

public actual fun jetCreateIndex2W(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr, cindexcreate: UInt): Int =
    windowssysWindowsWin32StorageJetJetCreateIndex2W(sesid, tableid, pindexcreate.rawAddress.toCPointer<ByteVar>(), cindexcreate)

public actual fun jetCreateIndex3A(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr, cindexcreate: UInt): Int =
    windowssysWindowsWin32StorageJetJetCreateIndex3A(sesid, tableid, pindexcreate.rawAddress.toCPointer<ByteVar>(), cindexcreate)

public actual fun jetCreateIndex3W(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr, cindexcreate: UInt): Int =
    windowssysWindowsWin32StorageJetJetCreateIndex3W(sesid, tableid, pindexcreate.rawAddress.toCPointer<ByteVar>(), cindexcreate)

public actual fun jetCreateIndex4A(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr, cindexcreate: UInt): Int =
    windowssysWindowsWin32StorageJetJetCreateIndex4A(sesid, tableid, pindexcreate.rawAddress.toCPointer<ByteVar>(), cindexcreate)

public actual fun jetCreateIndex4W(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr, cindexcreate: UInt): Int =
    windowssysWindowsWin32StorageJetJetCreateIndex4W(sesid, tableid, pindexcreate.rawAddress.toCPointer<ByteVar>(), cindexcreate)

public actual fun jetCreateIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, grbit: UInt, szkey: Pcstr, cbkey: UInt, ldensity: UInt): Int =
    windowssysWindowsWin32StorageJetJetCreateIndexA(sesid, tableid, szindexname.rawAddress.toCPointer<ByteVar>(), grbit, szkey.rawAddress.toCPointer<ByteVar>(), cbkey, ldensity)

public actual fun jetCreateIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, grbit: UInt, szkey: Pcwstr, cbkey: UInt, ldensity: UInt): Int =
    windowssysWindowsWin32StorageJetJetCreateIndexW(sesid, tableid, szindexname.rawAddress.toCPointer<ByteVar>(), grbit, szkey.rawAddress.toCPointer<ByteVar>(), cbkey, ldensity)

public actual fun jetCreateInstance2A(pinstance: MutPtr, szinstancename: ConstPtr, szdisplayname: ConstPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetCreateInstance2A(pinstance.rawAddress.toCPointer<ByteVar>(), szinstancename.rawAddress.toCPointer<ByteVar>(), szdisplayname.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetCreateInstance2W(pinstance: MutPtr, szinstancename: ConstPtr, szdisplayname: ConstPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetCreateInstance2W(pinstance.rawAddress.toCPointer<ByteVar>(), szinstancename.rawAddress.toCPointer<ByteVar>(), szdisplayname.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetCreateInstanceA(pinstance: MutPtr, szinstancename: ConstPtr): Int =
    windowssysWindowsWin32StorageJetJetCreateInstanceA(pinstance.rawAddress.toCPointer<ByteVar>(), szinstancename.rawAddress.toCPointer<ByteVar>())

public actual fun jetCreateInstanceW(pinstance: MutPtr, szinstancename: ConstPtr): Int =
    windowssysWindowsWin32StorageJetJetCreateInstanceW(pinstance.rawAddress.toCPointer<ByteVar>(), szinstancename.rawAddress.toCPointer<ByteVar>())

public actual fun jetCreateTableA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, lpages: UInt, ldensity: UInt, ptableid: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetCreateTableA(sesid, dbid, sztablename.rawAddress.toCPointer<ByteVar>(), lpages, ldensity, ptableid.rawAddress.toCPointer<ByteVar>())

public actual fun jetCreateTableColumnIndex2A(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetCreateTableColumnIndex2A(sesid, dbid, ptablecreate.rawAddress.toCPointer<ByteVar>())

public actual fun jetCreateTableColumnIndex2W(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetCreateTableColumnIndex2W(sesid, dbid, ptablecreate.rawAddress.toCPointer<ByteVar>())

public actual fun jetCreateTableColumnIndex3A(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetCreateTableColumnIndex3A(sesid, dbid, ptablecreate.rawAddress.toCPointer<ByteVar>())

public actual fun jetCreateTableColumnIndex3W(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetCreateTableColumnIndex3W(sesid, dbid, ptablecreate.rawAddress.toCPointer<ByteVar>())

public actual fun jetCreateTableColumnIndex4A(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetCreateTableColumnIndex4A(sesid, dbid, ptablecreate.rawAddress.toCPointer<ByteVar>())

public actual fun jetCreateTableColumnIndex4W(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetCreateTableColumnIndex4W(sesid, dbid, ptablecreate.rawAddress.toCPointer<ByteVar>())

public actual fun jetCreateTableColumnIndexA(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetCreateTableColumnIndexA(sesid, dbid, ptablecreate.rawAddress.toCPointer<ByteVar>())

public actual fun jetCreateTableColumnIndexW(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetCreateTableColumnIndexW(sesid, dbid, ptablecreate.rawAddress.toCPointer<ByteVar>())

public actual fun jetCreateTableW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, lpages: UInt, ldensity: UInt, ptableid: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetCreateTableW(sesid, dbid, sztablename.rawAddress.toCPointer<ByteVar>(), lpages, ldensity, ptableid.rawAddress.toCPointer<ByteVar>())

public actual fun jetDefragment2A(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, pcpasses: MutPtr, pcseconds: MutPtr, callback: JetCallback, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetDefragment2A(sesid, dbid, sztablename.rawAddress.toCPointer<ByteVar>(), pcpasses.rawAddress.toCPointer<ByteVar>(), pcseconds.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), grbit)

public actual fun jetDefragment2W(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, pcpasses: MutPtr, pcseconds: MutPtr, callback: JetCallback, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetDefragment2W(sesid, dbid, sztablename.rawAddress.toCPointer<ByteVar>(), pcpasses.rawAddress.toCPointer<ByteVar>(), pcseconds.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), grbit)

public actual fun jetDefragment3A(sesid: JetSesid, szdatabasename: ConstPtr, sztablename: ConstPtr, pcpasses: MutPtr, pcseconds: MutPtr, callback: JetCallback, pvcontext: ConstPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetDefragment3A(sesid, szdatabasename.rawAddress.toCPointer<ByteVar>(), sztablename.rawAddress.toCPointer<ByteVar>(), pcpasses.rawAddress.toCPointer<ByteVar>(), pcseconds.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pvcontext.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetDefragment3W(sesid: JetSesid, szdatabasename: ConstPtr, sztablename: ConstPtr, pcpasses: MutPtr, pcseconds: MutPtr, callback: JetCallback, pvcontext: ConstPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetDefragment3W(sesid, szdatabasename.rawAddress.toCPointer<ByteVar>(), sztablename.rawAddress.toCPointer<ByteVar>(), pcpasses.rawAddress.toCPointer<ByteVar>(), pcseconds.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pvcontext.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetDefragmentA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, pcpasses: MutPtr, pcseconds: MutPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetDefragmentA(sesid, dbid, sztablename.rawAddress.toCPointer<ByteVar>(), pcpasses.rawAddress.toCPointer<ByteVar>(), pcseconds.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetDefragmentW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, pcpasses: MutPtr, pcseconds: MutPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetDefragmentW(sesid, dbid, sztablename.rawAddress.toCPointer<ByteVar>(), pcpasses.rawAddress.toCPointer<ByteVar>(), pcseconds.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetDelete(sesid: JetSesid, tableid: JetTableid): Int =
    windowssysWindowsWin32StorageJetJetDelete(sesid, tableid)

public actual fun jetDeleteColumn2A(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetDeleteColumn2A(sesid, tableid, szcolumnname.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetDeleteColumn2W(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetDeleteColumn2W(sesid, tableid, szcolumnname.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetDeleteColumnA(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr): Int =
    windowssysWindowsWin32StorageJetJetDeleteColumnA(sesid, tableid, szcolumnname.rawAddress.toCPointer<ByteVar>())

public actual fun jetDeleteColumnW(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr): Int =
    windowssysWindowsWin32StorageJetJetDeleteColumnW(sesid, tableid, szcolumnname.rawAddress.toCPointer<ByteVar>())

public actual fun jetDeleteIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr): Int =
    windowssysWindowsWin32StorageJetJetDeleteIndexA(sesid, tableid, szindexname.rawAddress.toCPointer<ByteVar>())

public actual fun jetDeleteIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr): Int =
    windowssysWindowsWin32StorageJetJetDeleteIndexW(sesid, tableid, szindexname.rawAddress.toCPointer<ByteVar>())

public actual fun jetDeleteTableA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr): Int =
    windowssysWindowsWin32StorageJetJetDeleteTableA(sesid, dbid, sztablename.rawAddress.toCPointer<ByteVar>())

public actual fun jetDeleteTableW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr): Int =
    windowssysWindowsWin32StorageJetJetDeleteTableW(sesid, dbid, sztablename.rawAddress.toCPointer<ByteVar>())

public actual fun jetDetachDatabase2A(sesid: JetSesid, szfilename: ConstPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetDetachDatabase2A(sesid, szfilename.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetDetachDatabase2W(sesid: JetSesid, szfilename: ConstPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetDetachDatabase2W(sesid, szfilename.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetDetachDatabaseA(sesid: JetSesid, szfilename: ConstPtr): Int =
    windowssysWindowsWin32StorageJetJetDetachDatabaseA(sesid, szfilename.rawAddress.toCPointer<ByteVar>())

public actual fun jetDetachDatabaseW(sesid: JetSesid, szfilename: ConstPtr): Int =
    windowssysWindowsWin32StorageJetJetDetachDatabaseW(sesid, szfilename.rawAddress.toCPointer<ByteVar>())

public actual fun jetDupCursor(sesid: JetSesid, tableid: JetTableid, ptableid: MutPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetDupCursor(sesid, tableid, ptableid.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetDupSession(sesid: JetSesid, psesid: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetDupSession(sesid, psesid.rawAddress.toCPointer<ByteVar>())

public actual fun jetEnableMultiInstanceA(psetsysparam: ConstPtr, csetsysparam: UInt, pcsetsucceed: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetEnableMultiInstanceA(psetsysparam.rawAddress.toCPointer<ByteVar>(), csetsysparam, pcsetsucceed.rawAddress.toCPointer<ByteVar>())

public actual fun jetEnableMultiInstanceW(psetsysparam: ConstPtr, csetsysparam: UInt, pcsetsucceed: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetEnableMultiInstanceW(psetsysparam.rawAddress.toCPointer<ByteVar>(), csetsysparam, pcsetsucceed.rawAddress.toCPointer<ByteVar>())

public actual fun jetEndExternalBackup(): Int =
    windowssysWindowsWin32StorageJetJetEndExternalBackup()

public actual fun jetEndExternalBackupInstance(instance: JetInstance): Int =
    windowssysWindowsWin32StorageJetJetEndExternalBackupInstance(instance)

public actual fun jetEndExternalBackupInstance2(instance: JetInstance, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetEndExternalBackupInstance2(instance, grbit)

public actual fun jetEndSession(sesid: JetSesid, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetEndSession(sesid, grbit)

public actual fun jetEnumerateColumns(sesid: JetSesid, tableid: JetTableid, cenumcolumnid: UInt, rgenumcolumnid: ConstPtr, pcenumcolumn: MutPtr, prgenumcolumn: MutPtr, pfnrealloc: JetPfnrealloc, pvrealloccontext: ConstPtr, cbdatamost: UInt, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetEnumerateColumns(sesid, tableid, cenumcolumnid, rgenumcolumnid.rawAddress.toCPointer<ByteVar>(), pcenumcolumn.rawAddress.toCPointer<ByteVar>(), prgenumcolumn.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pvrealloccontext.rawAddress.toCPointer<ByteVar>(), cbdatamost, grbit)

public actual fun jetEscrowUpdate(sesid: JetSesid, tableid: JetTableid, columnid: UInt, pv: ConstPtr, cbmax: UInt, pvold: MutPtr, cboldmax: UInt, pcboldactual: MutPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetEscrowUpdate(sesid, tableid, columnid, pv.rawAddress.toCPointer<ByteVar>(), cbmax, pvold.rawAddress.toCPointer<ByteVar>(), cboldmax, pcboldactual.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetExternalRestore2A(szcheckpointfilepath: ConstPtr, szlogpath: ConstPtr, rgrstmap: ConstPtr, crstfilemap: Int, szbackuplogpath: ConstPtr, ploginfo: MutPtr, sztargetinstancename: ConstPtr, sztargetinstancelogpath: ConstPtr, sztargetinstancecheckpointpath: ConstPtr, pfn: JetPfnstatus): Int =
    windowssysWindowsWin32StorageJetJetExternalRestore2A(szcheckpointfilepath.rawAddress.toCPointer<ByteVar>(), szlogpath.rawAddress.toCPointer<ByteVar>(), rgrstmap.rawAddress.toCPointer<ByteVar>(), crstfilemap, szbackuplogpath.rawAddress.toCPointer<ByteVar>(), ploginfo.rawAddress.toCPointer<ByteVar>(), sztargetinstancename.rawAddress.toCPointer<ByteVar>(), sztargetinstancelogpath.rawAddress.toCPointer<ByteVar>(), sztargetinstancecheckpointpath.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun jetExternalRestore2W(szcheckpointfilepath: ConstPtr, szlogpath: ConstPtr, rgrstmap: ConstPtr, crstfilemap: Int, szbackuplogpath: ConstPtr, ploginfo: MutPtr, sztargetinstancename: ConstPtr, sztargetinstancelogpath: ConstPtr, sztargetinstancecheckpointpath: ConstPtr, pfn: JetPfnstatus): Int =
    windowssysWindowsWin32StorageJetJetExternalRestore2W(szcheckpointfilepath.rawAddress.toCPointer<ByteVar>(), szlogpath.rawAddress.toCPointer<ByteVar>(), rgrstmap.rawAddress.toCPointer<ByteVar>(), crstfilemap, szbackuplogpath.rawAddress.toCPointer<ByteVar>(), ploginfo.rawAddress.toCPointer<ByteVar>(), sztargetinstancename.rawAddress.toCPointer<ByteVar>(), sztargetinstancelogpath.rawAddress.toCPointer<ByteVar>(), sztargetinstancecheckpointpath.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun jetExternalRestoreA(szcheckpointfilepath: ConstPtr, szlogpath: ConstPtr, rgrstmap: ConstPtr, crstfilemap: Int, szbackuplogpath: ConstPtr, genlow: Int, genhigh: Int, pfn: JetPfnstatus): Int =
    windowssysWindowsWin32StorageJetJetExternalRestoreA(szcheckpointfilepath.rawAddress.toCPointer<ByteVar>(), szlogpath.rawAddress.toCPointer<ByteVar>(), rgrstmap.rawAddress.toCPointer<ByteVar>(), crstfilemap, szbackuplogpath.rawAddress.toCPointer<ByteVar>(), genlow, genhigh, 0L.toCPointer<ByteVar>())

public actual fun jetExternalRestoreW(szcheckpointfilepath: ConstPtr, szlogpath: ConstPtr, rgrstmap: ConstPtr, crstfilemap: Int, szbackuplogpath: ConstPtr, genlow: Int, genhigh: Int, pfn: JetPfnstatus): Int =
    windowssysWindowsWin32StorageJetJetExternalRestoreW(szcheckpointfilepath.rawAddress.toCPointer<ByteVar>(), szlogpath.rawAddress.toCPointer<ByteVar>(), rgrstmap.rawAddress.toCPointer<ByteVar>(), crstfilemap, szbackuplogpath.rawAddress.toCPointer<ByteVar>(), genlow, genhigh, 0L.toCPointer<ByteVar>())

public actual fun jetFreeBuffer(pbbuf: Pcstr): Int =
    windowssysWindowsWin32StorageJetJetFreeBuffer(pbbuf.rawAddress.toCPointer<ByteVar>())

public actual fun jetGetAttachInfoA(szzdatabases: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetGetAttachInfoA(szzdatabases.rawAddress.toCPointer<ByteVar>(), cbmax, pcbactual.rawAddress.toCPointer<ByteVar>())

public actual fun jetGetAttachInfoInstanceA(instance: JetInstance, szzdatabases: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetGetAttachInfoInstanceA(instance, szzdatabases.rawAddress.toCPointer<ByteVar>(), cbmax, pcbactual.rawAddress.toCPointer<ByteVar>())

public actual fun jetGetAttachInfoInstanceW(instance: JetInstance, szzdatabases: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetGetAttachInfoInstanceW(instance, szzdatabases.rawAddress.toCPointer<ByteVar>(), cbmax, pcbactual.rawAddress.toCPointer<ByteVar>())

public actual fun jetGetAttachInfoW(wszzdatabases: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetGetAttachInfoW(wszzdatabases.rawAddress.toCPointer<ByteVar>(), cbmax, pcbactual.rawAddress.toCPointer<ByteVar>())

public actual fun jetGetBookmark(sesid: JetSesid, tableid: JetTableid, pvbookmark: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetGetBookmark(sesid, tableid, pvbookmark.rawAddress.toCPointer<ByteVar>(), cbmax, pcbactual.rawAddress.toCPointer<ByteVar>())

public actual fun jetGetColumnInfoA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, pcolumnnameorid: ConstPtr, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    windowssysWindowsWin32StorageJetJetGetColumnInfoA(sesid, dbid, sztablename.rawAddress.toCPointer<ByteVar>(), pcolumnnameorid.rawAddress.toCPointer<ByteVar>(), pvresult.rawAddress.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun jetGetColumnInfoW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, pwcolumnnameorid: ConstPtr, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    windowssysWindowsWin32StorageJetJetGetColumnInfoW(sesid, dbid, sztablename.rawAddress.toCPointer<ByteVar>(), pwcolumnnameorid.rawAddress.toCPointer<ByteVar>(), pvresult.rawAddress.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun jetGetCurrentIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: MutPtr, cbindexname: UInt): Int =
    windowssysWindowsWin32StorageJetJetGetCurrentIndexA(sesid, tableid, szindexname.rawAddress.toCPointer<ByteVar>(), cbindexname)

public actual fun jetGetCurrentIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: MutPtr, cbindexname: UInt): Int =
    windowssysWindowsWin32StorageJetJetGetCurrentIndexW(sesid, tableid, szindexname.rawAddress.toCPointer<ByteVar>(), cbindexname)

public actual fun jetGetCursorInfo(sesid: JetSesid, tableid: JetTableid, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    windowssysWindowsWin32StorageJetJetGetCursorInfo(sesid, tableid, pvresult.rawAddress.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun jetGetDatabaseFileInfoA(szdatabasename: ConstPtr, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    windowssysWindowsWin32StorageJetJetGetDatabaseFileInfoA(szdatabasename.rawAddress.toCPointer<ByteVar>(), pvresult.rawAddress.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun jetGetDatabaseFileInfoW(szdatabasename: ConstPtr, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    windowssysWindowsWin32StorageJetJetGetDatabaseFileInfoW(szdatabasename.rawAddress.toCPointer<ByteVar>(), pvresult.rawAddress.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun jetGetDatabaseInfoA(sesid: JetSesid, dbid: UInt, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    windowssysWindowsWin32StorageJetJetGetDatabaseInfoA(sesid, dbid, pvresult.rawAddress.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun jetGetDatabaseInfoW(sesid: JetSesid, dbid: UInt, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    windowssysWindowsWin32StorageJetJetGetDatabaseInfoW(sesid, dbid, pvresult.rawAddress.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun jetGetErrorInfoW(pvcontext: ConstPtr, pvresult: MutPtr, cbmax: UInt, infolevel: UInt, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetGetErrorInfoW(pvcontext.rawAddress.toCPointer<ByteVar>(), pvresult.rawAddress.toCPointer<ByteVar>(), cbmax, infolevel, grbit)

public actual fun jetGetIndexInfoA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, szindexname: ConstPtr, pvresult: MutPtr, cbresult: UInt, infolevel: UInt): Int =
    windowssysWindowsWin32StorageJetJetGetIndexInfoA(sesid, dbid, sztablename.rawAddress.toCPointer<ByteVar>(), szindexname.rawAddress.toCPointer<ByteVar>(), pvresult.rawAddress.toCPointer<ByteVar>(), cbresult, infolevel)

public actual fun jetGetIndexInfoW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, szindexname: ConstPtr, pvresult: MutPtr, cbresult: UInt, infolevel: UInt): Int =
    windowssysWindowsWin32StorageJetJetGetIndexInfoW(sesid, dbid, sztablename.rawAddress.toCPointer<ByteVar>(), szindexname.rawAddress.toCPointer<ByteVar>(), pvresult.rawAddress.toCPointer<ByteVar>(), cbresult, infolevel)

public actual fun jetGetInstanceInfoA(pcinstanceinfo: MutPtr, painstanceinfo: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetGetInstanceInfoA(pcinstanceinfo.rawAddress.toCPointer<ByteVar>(), painstanceinfo.rawAddress.toCPointer<ByteVar>())

public actual fun jetGetInstanceInfoW(pcinstanceinfo: MutPtr, painstanceinfo: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetGetInstanceInfoW(pcinstanceinfo.rawAddress.toCPointer<ByteVar>(), painstanceinfo.rawAddress.toCPointer<ByteVar>())

public actual fun jetGetInstanceMiscInfo(instance: JetInstance, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    windowssysWindowsWin32StorageJetJetGetInstanceMiscInfo(instance, pvresult.rawAddress.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun jetGetLS(sesid: JetSesid, tableid: JetTableid, pls: MutPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetGetLS(sesid, tableid, pls.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetGetLock(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetGetLock(sesid, tableid, grbit)

public actual fun jetGetLogInfoA(szzlogs: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetGetLogInfoA(szzlogs.rawAddress.toCPointer<ByteVar>(), cbmax, pcbactual.rawAddress.toCPointer<ByteVar>())

public actual fun jetGetLogInfoInstance2A(instance: JetInstance, szzlogs: MutPtr, cbmax: UInt, pcbactual: MutPtr, ploginfo: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetGetLogInfoInstance2A(instance, szzlogs.rawAddress.toCPointer<ByteVar>(), cbmax, pcbactual.rawAddress.toCPointer<ByteVar>(), ploginfo.rawAddress.toCPointer<ByteVar>())

public actual fun jetGetLogInfoInstance2W(instance: JetInstance, wszzlogs: MutPtr, cbmax: UInt, pcbactual: MutPtr, ploginfo: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetGetLogInfoInstance2W(instance, wszzlogs.rawAddress.toCPointer<ByteVar>(), cbmax, pcbactual.rawAddress.toCPointer<ByteVar>(), ploginfo.rawAddress.toCPointer<ByteVar>())

public actual fun jetGetLogInfoInstanceA(instance: JetInstance, szzlogs: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetGetLogInfoInstanceA(instance, szzlogs.rawAddress.toCPointer<ByteVar>(), cbmax, pcbactual.rawAddress.toCPointer<ByteVar>())

public actual fun jetGetLogInfoInstanceW(instance: JetInstance, wszzlogs: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetGetLogInfoInstanceW(instance, wszzlogs.rawAddress.toCPointer<ByteVar>(), cbmax, pcbactual.rawAddress.toCPointer<ByteVar>())

public actual fun jetGetLogInfoW(szzlogs: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetGetLogInfoW(szzlogs.rawAddress.toCPointer<ByteVar>(), cbmax, pcbactual.rawAddress.toCPointer<ByteVar>())

public actual fun jetGetObjectInfoA(sesid: JetSesid, dbid: UInt, objtyp: UInt, szcontainername: ConstPtr, szobjectname: ConstPtr, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    windowssysWindowsWin32StorageJetJetGetObjectInfoA(sesid, dbid, objtyp, szcontainername.rawAddress.toCPointer<ByteVar>(), szobjectname.rawAddress.toCPointer<ByteVar>(), pvresult.rawAddress.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun jetGetObjectInfoW(sesid: JetSesid, dbid: UInt, objtyp: UInt, szcontainername: ConstPtr, szobjectname: ConstPtr, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    windowssysWindowsWin32StorageJetJetGetObjectInfoW(sesid, dbid, objtyp, szcontainername.rawAddress.toCPointer<ByteVar>(), szobjectname.rawAddress.toCPointer<ByteVar>(), pvresult.rawAddress.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun jetGetRecordPosition(sesid: JetSesid, tableid: JetTableid, precpos: MutPtr, cbrecpos: UInt): Int =
    windowssysWindowsWin32StorageJetJetGetRecordPosition(sesid, tableid, precpos.rawAddress.toCPointer<ByteVar>(), cbrecpos)

public actual fun jetGetRecordSize(sesid: JetSesid, tableid: JetTableid, precsize: MutPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetGetRecordSize(sesid, tableid, precsize.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetGetRecordSize2(sesid: JetSesid, tableid: JetTableid, precsize: MutPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetGetRecordSize2(sesid, tableid, precsize.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetGetSecondaryIndexBookmark(sesid: JetSesid, tableid: JetTableid, pvsecondarykey: MutPtr, cbsecondarykeymax: UInt, pcbsecondarykeyactual: MutPtr, pvprimarybookmark: MutPtr, cbprimarybookmarkmax: UInt, pcbprimarybookmarkactual: MutPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetGetSecondaryIndexBookmark(sesid, tableid, pvsecondarykey.rawAddress.toCPointer<ByteVar>(), cbsecondarykeymax, pcbsecondarykeyactual.rawAddress.toCPointer<ByteVar>(), pvprimarybookmark.rawAddress.toCPointer<ByteVar>(), cbprimarybookmarkmax, pcbprimarybookmarkactual.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetGetSessionParameter(sesid: JetSesid, sesparamid: UInt, pvparam: MutPtr, cbparammax: UInt, pcbparamactual: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetGetSessionParameter(sesid, sesparamid, pvparam.rawAddress.toCPointer<ByteVar>(), cbparammax, pcbparamactual.rawAddress.toCPointer<ByteVar>())

public actual fun jetGetSystemParameterA(instance: JetInstance, sesid: JetSesid, paramid: UInt, plparam: MutPtr, szparam: MutPtr, cbmax: UInt): Int =
    windowssysWindowsWin32StorageJetJetGetSystemParameterA(instance, sesid, paramid, plparam.rawAddress.toCPointer<ByteVar>(), szparam.rawAddress.toCPointer<ByteVar>(), cbmax)

public actual fun jetGetSystemParameterW(instance: JetInstance, sesid: JetSesid, paramid: UInt, plparam: MutPtr, szparam: MutPtr, cbmax: UInt): Int =
    windowssysWindowsWin32StorageJetJetGetSystemParameterW(instance, sesid, paramid, plparam.rawAddress.toCPointer<ByteVar>(), szparam.rawAddress.toCPointer<ByteVar>(), cbmax)

public actual fun jetGetTableColumnInfoA(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    windowssysWindowsWin32StorageJetJetGetTableColumnInfoA(sesid, tableid, szcolumnname.rawAddress.toCPointer<ByteVar>(), pvresult.rawAddress.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun jetGetTableColumnInfoW(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    windowssysWindowsWin32StorageJetJetGetTableColumnInfoW(sesid, tableid, szcolumnname.rawAddress.toCPointer<ByteVar>(), pvresult.rawAddress.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun jetGetTableIndexInfoA(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, pvresult: MutPtr, cbresult: UInt, infolevel: UInt): Int =
    windowssysWindowsWin32StorageJetJetGetTableIndexInfoA(sesid, tableid, szindexname.rawAddress.toCPointer<ByteVar>(), pvresult.rawAddress.toCPointer<ByteVar>(), cbresult, infolevel)

public actual fun jetGetTableIndexInfoW(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, pvresult: MutPtr, cbresult: UInt, infolevel: UInt): Int =
    windowssysWindowsWin32StorageJetJetGetTableIndexInfoW(sesid, tableid, szindexname.rawAddress.toCPointer<ByteVar>(), pvresult.rawAddress.toCPointer<ByteVar>(), cbresult, infolevel)

public actual fun jetGetTableInfoA(sesid: JetSesid, tableid: JetTableid, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    windowssysWindowsWin32StorageJetJetGetTableInfoA(sesid, tableid, pvresult.rawAddress.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun jetGetTableInfoW(sesid: JetSesid, tableid: JetTableid, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int =
    windowssysWindowsWin32StorageJetJetGetTableInfoW(sesid, tableid, pvresult.rawAddress.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun jetGetThreadStats(pvresult: MutPtr, cbmax: UInt): Int =
    windowssysWindowsWin32StorageJetJetGetThreadStats(pvresult.rawAddress.toCPointer<ByteVar>(), cbmax)

public actual fun jetGetTruncateLogInfoInstanceA(instance: JetInstance, szzlogs: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetGetTruncateLogInfoInstanceA(instance, szzlogs.rawAddress.toCPointer<ByteVar>(), cbmax, pcbactual.rawAddress.toCPointer<ByteVar>())

public actual fun jetGetTruncateLogInfoInstanceW(instance: JetInstance, wszzlogs: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetGetTruncateLogInfoInstanceW(instance, wszzlogs.rawAddress.toCPointer<ByteVar>(), cbmax, pcbactual.rawAddress.toCPointer<ByteVar>())

public actual fun jetGetVersion(sesid: JetSesid, pwversion: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetGetVersion(sesid, pwversion.rawAddress.toCPointer<ByteVar>())

public actual fun jetGotoBookmark(sesid: JetSesid, tableid: JetTableid, pvbookmark: ConstPtr, cbbookmark: UInt): Int =
    windowssysWindowsWin32StorageJetJetGotoBookmark(sesid, tableid, pvbookmark.rawAddress.toCPointer<ByteVar>(), cbbookmark)

public actual fun jetGotoPosition(sesid: JetSesid, tableid: JetTableid, precpos: ConstPtr): Int =
    windowssysWindowsWin32StorageJetJetGotoPosition(sesid, tableid, precpos.rawAddress.toCPointer<ByteVar>())

public actual fun jetGotoSecondaryIndexBookmark(sesid: JetSesid, tableid: JetTableid, pvsecondarykey: ConstPtr, cbsecondarykey: UInt, pvprimarybookmark: ConstPtr, cbprimarybookmark: UInt, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetGotoSecondaryIndexBookmark(sesid, tableid, pvsecondarykey.rawAddress.toCPointer<ByteVar>(), cbsecondarykey, pvprimarybookmark.rawAddress.toCPointer<ByteVar>(), cbprimarybookmark, grbit)

public actual fun jetGrowDatabase(sesid: JetSesid, dbid: UInt, cpg: UInt, pcpgreal: ConstPtr): Int =
    windowssysWindowsWin32StorageJetJetGrowDatabase(sesid, dbid, cpg, pcpgreal.rawAddress.toCPointer<ByteVar>())

public actual fun jetIdle(sesid: JetSesid, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetIdle(sesid, grbit)

public actual fun jetIndexRecordCount(sesid: JetSesid, tableid: JetTableid, pcrec: MutPtr, crecmax: UInt): Int =
    windowssysWindowsWin32StorageJetJetIndexRecordCount(sesid, tableid, pcrec.rawAddress.toCPointer<ByteVar>(), crecmax)

public actual fun jetInit(pinstance: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetInit(pinstance.rawAddress.toCPointer<ByteVar>())

public actual fun jetInit2(pinstance: MutPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetInit2(pinstance.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetInit3A(pinstance: MutPtr, prstinfo: ConstPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetInit3A(pinstance.rawAddress.toCPointer<ByteVar>(), prstinfo.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetInit3W(pinstance: MutPtr, prstinfo: ConstPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetInit3W(pinstance.rawAddress.toCPointer<ByteVar>(), prstinfo.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetIntersectIndexes(sesid: JetSesid, rgindexrange: ConstPtr, cindexrange: UInt, precordlist: MutPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetIntersectIndexes(sesid, rgindexrange.rawAddress.toCPointer<ByteVar>(), cindexrange, precordlist.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetMakeKey(sesid: JetSesid, tableid: JetTableid, pvdata: ConstPtr, cbdata: UInt, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetMakeKey(sesid, tableid, pvdata.rawAddress.toCPointer<ByteVar>(), cbdata, grbit)

public actual fun jetMove(sesid: JetSesid, tableid: JetTableid, crow: Int, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetMove(sesid, tableid, crow, grbit)

public actual fun jetOSSnapshotAbort(snapid: JetOssnapid, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetOSSnapshotAbort(snapid, grbit)

public actual fun jetOSSnapshotEnd(snapid: JetOssnapid, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetOSSnapshotEnd(snapid, grbit)

public actual fun jetOSSnapshotFreezeA(snapid: JetOssnapid, pcinstanceinfo: MutPtr, painstanceinfo: MutPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetOSSnapshotFreezeA(snapid, pcinstanceinfo.rawAddress.toCPointer<ByteVar>(), painstanceinfo.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetOSSnapshotFreezeW(snapid: JetOssnapid, pcinstanceinfo: MutPtr, painstanceinfo: MutPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetOSSnapshotFreezeW(snapid, pcinstanceinfo.rawAddress.toCPointer<ByteVar>(), painstanceinfo.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetOSSnapshotGetFreezeInfoA(snapid: JetOssnapid, pcinstanceinfo: MutPtr, painstanceinfo: MutPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetOSSnapshotGetFreezeInfoA(snapid, pcinstanceinfo.rawAddress.toCPointer<ByteVar>(), painstanceinfo.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetOSSnapshotGetFreezeInfoW(snapid: JetOssnapid, pcinstanceinfo: MutPtr, painstanceinfo: MutPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetOSSnapshotGetFreezeInfoW(snapid, pcinstanceinfo.rawAddress.toCPointer<ByteVar>(), painstanceinfo.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetOSSnapshotPrepare(psnapid: MutPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetOSSnapshotPrepare(psnapid.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetOSSnapshotPrepareInstance(snapid: JetOssnapid, instance: JetInstance, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetOSSnapshotPrepareInstance(snapid, instance, grbit)

public actual fun jetOSSnapshotThaw(snapid: JetOssnapid, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetOSSnapshotThaw(snapid, grbit)

public actual fun jetOSSnapshotTruncateLog(snapid: JetOssnapid, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetOSSnapshotTruncateLog(snapid, grbit)

public actual fun jetOSSnapshotTruncateLogInstance(snapid: JetOssnapid, instance: JetInstance, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetOSSnapshotTruncateLogInstance(snapid, instance, grbit)

public actual fun jetOpenDatabaseA(sesid: JetSesid, szfilename: ConstPtr, szconnect: ConstPtr, pdbid: MutPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetOpenDatabaseA(sesid, szfilename.rawAddress.toCPointer<ByteVar>(), szconnect.rawAddress.toCPointer<ByteVar>(), pdbid.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetOpenDatabaseW(sesid: JetSesid, szfilename: ConstPtr, szconnect: ConstPtr, pdbid: MutPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetOpenDatabaseW(sesid, szfilename.rawAddress.toCPointer<ByteVar>(), szconnect.rawAddress.toCPointer<ByteVar>(), pdbid.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetOpenFileA(szfilename: ConstPtr, phffile: MutPtr, pulfilesizelow: MutPtr, pulfilesizehigh: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetOpenFileA(szfilename.rawAddress.toCPointer<ByteVar>(), phffile.rawAddress.toCPointer<ByteVar>(), pulfilesizelow.rawAddress.toCPointer<ByteVar>(), pulfilesizehigh.rawAddress.toCPointer<ByteVar>())

public actual fun jetOpenFileInstanceA(instance: JetInstance, szfilename: ConstPtr, phffile: MutPtr, pulfilesizelow: MutPtr, pulfilesizehigh: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetOpenFileInstanceA(instance, szfilename.rawAddress.toCPointer<ByteVar>(), phffile.rawAddress.toCPointer<ByteVar>(), pulfilesizelow.rawAddress.toCPointer<ByteVar>(), pulfilesizehigh.rawAddress.toCPointer<ByteVar>())

public actual fun jetOpenFileInstanceW(instance: JetInstance, szfilename: ConstPtr, phffile: MutPtr, pulfilesizelow: MutPtr, pulfilesizehigh: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetOpenFileInstanceW(instance, szfilename.rawAddress.toCPointer<ByteVar>(), phffile.rawAddress.toCPointer<ByteVar>(), pulfilesizelow.rawAddress.toCPointer<ByteVar>(), pulfilesizehigh.rawAddress.toCPointer<ByteVar>())

public actual fun jetOpenFileW(szfilename: ConstPtr, phffile: MutPtr, pulfilesizelow: MutPtr, pulfilesizehigh: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetOpenFileW(szfilename.rawAddress.toCPointer<ByteVar>(), phffile.rawAddress.toCPointer<ByteVar>(), pulfilesizelow.rawAddress.toCPointer<ByteVar>(), pulfilesizehigh.rawAddress.toCPointer<ByteVar>())

public actual fun jetOpenTableA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, pvparameters: ConstPtr, cbparameters: UInt, grbit: UInt, ptableid: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetOpenTableA(sesid, dbid, sztablename.rawAddress.toCPointer<ByteVar>(), pvparameters.rawAddress.toCPointer<ByteVar>(), cbparameters, grbit, ptableid.rawAddress.toCPointer<ByteVar>())

public actual fun jetOpenTableW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, pvparameters: ConstPtr, cbparameters: UInt, grbit: UInt, ptableid: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetOpenTableW(sesid, dbid, sztablename.rawAddress.toCPointer<ByteVar>(), pvparameters.rawAddress.toCPointer<ByteVar>(), cbparameters, grbit, ptableid.rawAddress.toCPointer<ByteVar>())

public actual fun jetOpenTempTable(sesid: JetSesid, prgcolumndef: ConstPtr, ccolumn: UInt, grbit: UInt, ptableid: MutPtr, prgcolumnid: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetOpenTempTable(sesid, prgcolumndef.rawAddress.toCPointer<ByteVar>(), ccolumn, grbit, ptableid.rawAddress.toCPointer<ByteVar>(), prgcolumnid.rawAddress.toCPointer<ByteVar>())

public actual fun jetOpenTempTable2(sesid: JetSesid, prgcolumndef: ConstPtr, ccolumn: UInt, lcid: UInt, grbit: UInt, ptableid: MutPtr, prgcolumnid: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetOpenTempTable2(sesid, prgcolumndef.rawAddress.toCPointer<ByteVar>(), ccolumn, lcid, grbit, ptableid.rawAddress.toCPointer<ByteVar>(), prgcolumnid.rawAddress.toCPointer<ByteVar>())

public actual fun jetOpenTempTable3(sesid: JetSesid, prgcolumndef: ConstPtr, ccolumn: UInt, pidxunicode: ConstPtr, grbit: UInt, ptableid: MutPtr, prgcolumnid: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetOpenTempTable3(sesid, prgcolumndef.rawAddress.toCPointer<ByteVar>(), ccolumn, pidxunicode.rawAddress.toCPointer<ByteVar>(), grbit, ptableid.rawAddress.toCPointer<ByteVar>(), prgcolumnid.rawAddress.toCPointer<ByteVar>())

public actual fun jetOpenTemporaryTable(sesid: JetSesid, popentemporarytable: ConstPtr): Int =
    windowssysWindowsWin32StorageJetJetOpenTemporaryTable(sesid, popentemporarytable.rawAddress.toCPointer<ByteVar>())

public actual fun jetOpenTemporaryTable2(sesid: JetSesid, popentemporarytable: ConstPtr): Int =
    windowssysWindowsWin32StorageJetJetOpenTemporaryTable2(sesid, popentemporarytable.rawAddress.toCPointer<ByteVar>())

public actual fun jetPrepareUpdate(sesid: JetSesid, tableid: JetTableid, prep: UInt): Int =
    windowssysWindowsWin32StorageJetJetPrepareUpdate(sesid, tableid, prep)

public actual fun jetPrereadIndexRanges(sesid: JetSesid, tableid: JetTableid, rgindexranges: ConstPtr, cindexranges: UInt, pcrangespreread: MutPtr, rgcolumnidpreread: ConstPtr, ccolumnidpreread: UInt, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetPrereadIndexRanges(sesid, tableid, rgindexranges.rawAddress.toCPointer<ByteVar>(), cindexranges, pcrangespreread.rawAddress.toCPointer<ByteVar>(), rgcolumnidpreread.rawAddress.toCPointer<ByteVar>(), ccolumnidpreread, grbit)

public actual fun jetPrereadKeys(sesid: JetSesid, tableid: JetTableid, rgpvkeys: ConstPtr, rgcbkeys: ConstPtr, ckeys: Int, pckeyspreread: MutPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetPrereadKeys(sesid, tableid, rgpvkeys.rawAddress.toCPointer<ByteVar>(), rgcbkeys.rawAddress.toCPointer<ByteVar>(), ckeys, pckeyspreread.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetReadFile(hffile: JetHandle, pv: MutPtr, cb: UInt, pcbactual: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetReadFile(hffile, pv.rawAddress.toCPointer<ByteVar>(), cb, pcbactual.rawAddress.toCPointer<ByteVar>())

public actual fun jetReadFileInstance(instance: JetInstance, hffile: JetHandle, pv: MutPtr, cb: UInt, pcbactual: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetReadFileInstance(instance, hffile, pv.rawAddress.toCPointer<ByteVar>(), cb, pcbactual.rawAddress.toCPointer<ByteVar>())

public actual fun jetRegisterCallback(sesid: JetSesid, tableid: JetTableid, cbtyp: UInt, pcallback: JetCallback, pvcontext: ConstPtr, phcallbackid: ConstPtr): Int =
    windowssysWindowsWin32StorageJetJetRegisterCallback(sesid, tableid, cbtyp, 0L.toCPointer<ByteVar>(), pvcontext.rawAddress.toCPointer<ByteVar>(), phcallbackid.rawAddress.toCPointer<ByteVar>())

public actual fun jetRenameColumnA(sesid: JetSesid, tableid: JetTableid, szname: ConstPtr, sznamenew: ConstPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetRenameColumnA(sesid, tableid, szname.rawAddress.toCPointer<ByteVar>(), sznamenew.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetRenameColumnW(sesid: JetSesid, tableid: JetTableid, szname: ConstPtr, sznamenew: ConstPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetRenameColumnW(sesid, tableid, szname.rawAddress.toCPointer<ByteVar>(), sznamenew.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetRenameTableA(sesid: JetSesid, dbid: UInt, szname: ConstPtr, sznamenew: ConstPtr): Int =
    windowssysWindowsWin32StorageJetJetRenameTableA(sesid, dbid, szname.rawAddress.toCPointer<ByteVar>(), sznamenew.rawAddress.toCPointer<ByteVar>())

public actual fun jetRenameTableW(sesid: JetSesid, dbid: UInt, szname: ConstPtr, sznamenew: ConstPtr): Int =
    windowssysWindowsWin32StorageJetJetRenameTableW(sesid, dbid, szname.rawAddress.toCPointer<ByteVar>(), sznamenew.rawAddress.toCPointer<ByteVar>())

public actual fun jetResetSessionContext(sesid: JetSesid): Int =
    windowssysWindowsWin32StorageJetJetResetSessionContext(sesid)

public actual fun jetResetTableSequential(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetResetTableSequential(sesid, tableid, grbit)

public actual fun jetResizeDatabase(sesid: JetSesid, dbid: UInt, cpgtarget: UInt, pcpgactual: MutPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetResizeDatabase(sesid, dbid, cpgtarget, pcpgactual.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetRestore2A(sz: ConstPtr, szdest: ConstPtr, pfn: JetPfnstatus): Int =
    windowssysWindowsWin32StorageJetJetRestore2A(sz.rawAddress.toCPointer<ByteVar>(), szdest.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun jetRestore2W(sz: ConstPtr, szdest: ConstPtr, pfn: JetPfnstatus): Int =
    windowssysWindowsWin32StorageJetJetRestore2W(sz.rawAddress.toCPointer<ByteVar>(), szdest.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun jetRestoreA(szsource: ConstPtr, pfn: JetPfnstatus): Int =
    windowssysWindowsWin32StorageJetJetRestoreA(szsource.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun jetRestoreInstanceA(instance: JetInstance, sz: ConstPtr, szdest: ConstPtr, pfn: JetPfnstatus): Int =
    windowssysWindowsWin32StorageJetJetRestoreInstanceA(instance, sz.rawAddress.toCPointer<ByteVar>(), szdest.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun jetRestoreInstanceW(instance: JetInstance, sz: ConstPtr, szdest: ConstPtr, pfn: JetPfnstatus): Int =
    windowssysWindowsWin32StorageJetJetRestoreInstanceW(instance, sz.rawAddress.toCPointer<ByteVar>(), szdest.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun jetRestoreW(szsource: ConstPtr, pfn: JetPfnstatus): Int =
    windowssysWindowsWin32StorageJetJetRestoreW(szsource.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun jetRetrieveColumn(sesid: JetSesid, tableid: JetTableid, columnid: UInt, pvdata: MutPtr, cbdata: UInt, pcbactual: MutPtr, grbit: UInt, pretinfo: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetRetrieveColumn(sesid, tableid, columnid, pvdata.rawAddress.toCPointer<ByteVar>(), cbdata, pcbactual.rawAddress.toCPointer<ByteVar>(), grbit, pretinfo.rawAddress.toCPointer<ByteVar>())

public actual fun jetRetrieveColumns(sesid: JetSesid, tableid: JetTableid, pretrievecolumn: MutPtr, cretrievecolumn: UInt): Int =
    windowssysWindowsWin32StorageJetJetRetrieveColumns(sesid, tableid, pretrievecolumn.rawAddress.toCPointer<ByteVar>(), cretrievecolumn)

public actual fun jetRetrieveKey(sesid: JetSesid, tableid: JetTableid, pvkey: MutPtr, cbmax: UInt, pcbactual: MutPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetRetrieveKey(sesid, tableid, pvkey.rawAddress.toCPointer<ByteVar>(), cbmax, pcbactual.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetRollback(sesid: JetSesid, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetRollback(sesid, grbit)

public actual fun jetSeek(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetSeek(sesid, tableid, grbit)

public actual fun jetSetColumn(sesid: JetSesid, tableid: JetTableid, columnid: UInt, pvdata: ConstPtr, cbdata: UInt, grbit: UInt, psetinfo: ConstPtr): Int =
    windowssysWindowsWin32StorageJetJetSetColumn(sesid, tableid, columnid, pvdata.rawAddress.toCPointer<ByteVar>(), cbdata, grbit, psetinfo.rawAddress.toCPointer<ByteVar>())

public actual fun jetSetColumnDefaultValueA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, szcolumnname: ConstPtr, pvdata: ConstPtr, cbdata: UInt, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetSetColumnDefaultValueA(sesid, dbid, sztablename.rawAddress.toCPointer<ByteVar>(), szcolumnname.rawAddress.toCPointer<ByteVar>(), pvdata.rawAddress.toCPointer<ByteVar>(), cbdata, grbit)

public actual fun jetSetColumnDefaultValueW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, szcolumnname: ConstPtr, pvdata: ConstPtr, cbdata: UInt, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetSetColumnDefaultValueW(sesid, dbid, sztablename.rawAddress.toCPointer<ByteVar>(), szcolumnname.rawAddress.toCPointer<ByteVar>(), pvdata.rawAddress.toCPointer<ByteVar>(), cbdata, grbit)

public actual fun jetSetColumns(sesid: JetSesid, tableid: JetTableid, psetcolumn: ConstPtr, csetcolumn: UInt): Int =
    windowssysWindowsWin32StorageJetJetSetColumns(sesid, tableid, psetcolumn.rawAddress.toCPointer<ByteVar>(), csetcolumn)

public actual fun jetSetCurrentIndex2A(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetSetCurrentIndex2A(sesid, tableid, szindexname.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetSetCurrentIndex2W(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetSetCurrentIndex2W(sesid, tableid, szindexname.rawAddress.toCPointer<ByteVar>(), grbit)

public actual fun jetSetCurrentIndex3A(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, grbit: UInt, itagsequence: UInt): Int =
    windowssysWindowsWin32StorageJetJetSetCurrentIndex3A(sesid, tableid, szindexname.rawAddress.toCPointer<ByteVar>(), grbit, itagsequence)

public actual fun jetSetCurrentIndex3W(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, grbit: UInt, itagsequence: UInt): Int =
    windowssysWindowsWin32StorageJetJetSetCurrentIndex3W(sesid, tableid, szindexname.rawAddress.toCPointer<ByteVar>(), grbit, itagsequence)

public actual fun jetSetCurrentIndex4A(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, pindexid: ConstPtr, grbit: UInt, itagsequence: UInt): Int =
    windowssysWindowsWin32StorageJetJetSetCurrentIndex4A(sesid, tableid, szindexname.rawAddress.toCPointer<ByteVar>(), pindexid.rawAddress.toCPointer<ByteVar>(), grbit, itagsequence)

public actual fun jetSetCurrentIndex4W(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, pindexid: ConstPtr, grbit: UInt, itagsequence: UInt): Int =
    windowssysWindowsWin32StorageJetJetSetCurrentIndex4W(sesid, tableid, szindexname.rawAddress.toCPointer<ByteVar>(), pindexid.rawAddress.toCPointer<ByteVar>(), grbit, itagsequence)

public actual fun jetSetCurrentIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr): Int =
    windowssysWindowsWin32StorageJetJetSetCurrentIndexA(sesid, tableid, szindexname.rawAddress.toCPointer<ByteVar>())

public actual fun jetSetCurrentIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr): Int =
    windowssysWindowsWin32StorageJetJetSetCurrentIndexW(sesid, tableid, szindexname.rawAddress.toCPointer<ByteVar>())

public actual fun jetSetCursorFilter(sesid: JetSesid, tableid: JetTableid, rgcolumnfilters: ConstPtr, ccolumnfilters: UInt, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetSetCursorFilter(sesid, tableid, rgcolumnfilters.rawAddress.toCPointer<ByteVar>(), ccolumnfilters, grbit)

public actual fun jetSetDatabaseSizeA(sesid: JetSesid, szdatabasename: ConstPtr, cpg: UInt, pcpgreal: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetSetDatabaseSizeA(sesid, szdatabasename.rawAddress.toCPointer<ByteVar>(), cpg, pcpgreal.rawAddress.toCPointer<ByteVar>())

public actual fun jetSetDatabaseSizeW(sesid: JetSesid, szdatabasename: ConstPtr, cpg: UInt, pcpgreal: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetSetDatabaseSizeW(sesid, szdatabasename.rawAddress.toCPointer<ByteVar>(), cpg, pcpgreal.rawAddress.toCPointer<ByteVar>())

public actual fun jetSetIndexRange(sesid: JetSesid, tableidsrc: JetTableid, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetSetIndexRange(sesid, tableidsrc, grbit)

public actual fun jetSetLS(sesid: JetSesid, tableid: JetTableid, ls: JetLs, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetSetLS(sesid, tableid, ls, grbit)

public actual fun jetSetSessionContext(sesid: JetSesid, ulcontext: JetApiPtr): Int =
    windowssysWindowsWin32StorageJetJetSetSessionContext(sesid, ulcontext)

public actual fun jetSetSessionParameter(sesid: JetSesid, sesparamid: UInt, pvparam: ConstPtr, cbparam: UInt): Int =
    windowssysWindowsWin32StorageJetJetSetSessionParameter(sesid, sesparamid, pvparam.rawAddress.toCPointer<ByteVar>(), cbparam)

public actual fun jetSetSystemParameterA(pinstance: MutPtr, sesid: JetSesid, paramid: UInt, lparam: JetApiPtr, szparam: ConstPtr): Int =
    windowssysWindowsWin32StorageJetJetSetSystemParameterA(pinstance.rawAddress.toCPointer<ByteVar>(), sesid, paramid, lparam, szparam.rawAddress.toCPointer<ByteVar>())

public actual fun jetSetSystemParameterW(pinstance: MutPtr, sesid: JetSesid, paramid: UInt, lparam: JetApiPtr, szparam: ConstPtr): Int =
    windowssysWindowsWin32StorageJetJetSetSystemParameterW(pinstance.rawAddress.toCPointer<ByteVar>(), sesid, paramid, lparam, szparam.rawAddress.toCPointer<ByteVar>())

public actual fun jetSetTableSequential(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetSetTableSequential(sesid, tableid, grbit)

public actual fun jetStopBackup(): Int =
    windowssysWindowsWin32StorageJetJetStopBackup()

public actual fun jetStopBackupInstance(instance: JetInstance): Int =
    windowssysWindowsWin32StorageJetJetStopBackupInstance(instance)

public actual fun jetStopService(): Int =
    windowssysWindowsWin32StorageJetJetStopService()

public actual fun jetStopServiceInstance(instance: JetInstance): Int =
    windowssysWindowsWin32StorageJetJetStopServiceInstance(instance)

public actual fun jetStopServiceInstance2(instance: JetInstance, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetStopServiceInstance2(instance, grbit)

public actual fun jetTerm(instance: JetInstance): Int =
    windowssysWindowsWin32StorageJetJetTerm(instance)

public actual fun jetTerm2(instance: JetInstance, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetTerm2(instance, grbit)

public actual fun jetTruncateLog(): Int =
    windowssysWindowsWin32StorageJetJetTruncateLog()

public actual fun jetTruncateLogInstance(instance: JetInstance): Int =
    windowssysWindowsWin32StorageJetJetTruncateLogInstance(instance)

public actual fun jetUnregisterCallback(sesid: JetSesid, tableid: JetTableid, cbtyp: UInt, hcallbackid: JetHandle): Int =
    windowssysWindowsWin32StorageJetJetUnregisterCallback(sesid, tableid, cbtyp, hcallbackid)

public actual fun jetUpdate(sesid: JetSesid, tableid: JetTableid, pvbookmark: MutPtr, cbbookmark: UInt, pcbactual: MutPtr): Int =
    windowssysWindowsWin32StorageJetJetUpdate(sesid, tableid, pvbookmark.rawAddress.toCPointer<ByteVar>(), cbbookmark, pcbactual.rawAddress.toCPointer<ByteVar>())

public actual fun jetUpdate2(sesid: JetSesid, tableid: JetTableid, pvbookmark: MutPtr, cbbookmark: UInt, pcbactual: MutPtr, grbit: UInt): Int =
    windowssysWindowsWin32StorageJetJetUpdate2(sesid, tableid, pvbookmark.rawAddress.toCPointer<ByteVar>(), cbbookmark, pcbactual.rawAddress.toCPointer<ByteVar>(), grbit)
