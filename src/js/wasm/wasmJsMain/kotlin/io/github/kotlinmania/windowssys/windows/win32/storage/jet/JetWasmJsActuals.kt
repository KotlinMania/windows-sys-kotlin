@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.jet

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JET_API_PTR
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JET_HANDLE
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JET_TABLEID

public actual fun JetAddColumnA(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long, pcolumndef: Long, pvdefault: Long, cbdefault: UInt, pcolumnid: Long): Int =
    0

public actual fun JetAddColumnW(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long, pcolumndef: Long, pvdefault: Long, cbdefault: UInt, pcolumnid: Long): Int =
    0

public actual fun JetAttachDatabase2A(sesid: JET_SESID, szfilename: Long, cpgdatabasesizemax: UInt, grbit: UInt): Int =
    0

public actual fun JetAttachDatabase2W(sesid: JET_SESID, szfilename: Long, cpgdatabasesizemax: UInt, grbit: UInt): Int =
    0

public actual fun JetAttachDatabaseA(sesid: JET_SESID, szfilename: Long, grbit: UInt): Int =
    0

public actual fun JetAttachDatabaseW(sesid: JET_SESID, szfilename: Long, grbit: UInt): Int =
    0

public actual fun JetBackupA(szbackuppath: Long, grbit: UInt, pfnstatus: JET_PFNSTATUS): Int =
    0

public actual fun JetBackupInstanceA(instance: JET_INSTANCE, szbackuppath: Long, grbit: UInt, pfnstatus: JET_PFNSTATUS): Int =
    0

public actual fun JetBackupInstanceW(instance: JET_INSTANCE, szbackuppath: Long, grbit: UInt, pfnstatus: JET_PFNSTATUS): Int =
    0

public actual fun JetBackupW(szbackuppath: Long, grbit: UInt, pfnstatus: JET_PFNSTATUS): Int =
    0

public actual fun JetBeginExternalBackup(grbit: UInt): Int =
    0

public actual fun JetBeginExternalBackupInstance(instance: JET_INSTANCE, grbit: UInt): Int =
    0

public actual fun JetBeginSessionA(instance: JET_INSTANCE, psesid: Long, szusername: Long, szpassword: Long): Int =
    0

public actual fun JetBeginSessionW(instance: JET_INSTANCE, psesid: Long, szusername: Long, szpassword: Long): Int =
    0

public actual fun JetBeginTransaction(sesid: JET_SESID): Int =
    0

public actual fun JetBeginTransaction2(sesid: JET_SESID, grbit: UInt): Int =
    0

public actual fun JetBeginTransaction3(sesid: JET_SESID, trxid: Long, grbit: UInt): Int =
    0

public actual fun JetCloseDatabase(sesid: JET_SESID, dbid: UInt, grbit: UInt): Int =
    0

public actual fun JetCloseFile(hffile: JET_HANDLE): Int =
    0

public actual fun JetCloseFileInstance(instance: JET_INSTANCE, hffile: JET_HANDLE): Int =
    0

public actual fun JetCloseTable(sesid: JET_SESID, tableid: JET_TABLEID): Int =
    0

public actual fun JetCommitTransaction(sesid: JET_SESID, grbit: UInt): Int =
    0

public actual fun JetCommitTransaction2(sesid: JET_SESID, grbit: UInt, cmsecdurablecommit: UInt, pcommitid: Long): Int =
    0

public actual fun JetCompactA(sesid: JET_SESID, szdatabasesrc: Long, szdatabasedest: Long, pfnstatus: JET_PFNSTATUS, pconvert: Long, grbit: UInt): Int =
    0

public actual fun JetCompactW(sesid: JET_SESID, szdatabasesrc: Long, szdatabasedest: Long, pfnstatus: JET_PFNSTATUS, pconvert: Long, grbit: UInt): Int =
    0

public actual fun JetComputeStats(sesid: JET_SESID, tableid: JET_TABLEID): Int =
    0

public actual fun JetConfigureProcessForCrashDump(grbit: UInt): Int =
    0

public actual fun JetCreateDatabase2A(sesid: JET_SESID, szfilename: Long, cpgdatabasesizemax: UInt, pdbid: Long, grbit: UInt): Int =
    0

public actual fun JetCreateDatabase2W(sesid: JET_SESID, szfilename: Long, cpgdatabasesizemax: UInt, pdbid: Long, grbit: UInt): Int =
    0

public actual fun JetCreateDatabaseA(sesid: JET_SESID, szfilename: Long, szconnect: Long, pdbid: Long, grbit: UInt): Int =
    0

public actual fun JetCreateDatabaseW(sesid: JET_SESID, szfilename: Long, szconnect: Long, pdbid: Long, grbit: UInt): Int =
    0

public actual fun JetCreateIndex2A(sesid: JET_SESID, tableid: JET_TABLEID, pindexcreate: Long, cindexcreate: UInt): Int =
    0

public actual fun JetCreateIndex2W(sesid: JET_SESID, tableid: JET_TABLEID, pindexcreate: Long, cindexcreate: UInt): Int =
    0

public actual fun JetCreateIndex3A(sesid: JET_SESID, tableid: JET_TABLEID, pindexcreate: Long, cindexcreate: UInt): Int =
    0

public actual fun JetCreateIndex3W(sesid: JET_SESID, tableid: JET_TABLEID, pindexcreate: Long, cindexcreate: UInt): Int =
    0

public actual fun JetCreateIndex4A(sesid: JET_SESID, tableid: JET_TABLEID, pindexcreate: Long, cindexcreate: UInt): Int =
    0

public actual fun JetCreateIndex4W(sesid: JET_SESID, tableid: JET_TABLEID, pindexcreate: Long, cindexcreate: UInt): Int =
    0

public actual fun JetCreateIndexA(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, grbit: UInt, szkey: PCSTR, cbkey: UInt, ldensity: UInt): Int =
    0

public actual fun JetCreateIndexW(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, grbit: UInt, szkey: PCWSTR, cbkey: UInt, ldensity: UInt): Int =
    0

public actual fun JetCreateInstance2A(pinstance: Long, szinstancename: Long, szdisplayname: Long, grbit: UInt): Int =
    0

public actual fun JetCreateInstance2W(pinstance: Long, szinstancename: Long, szdisplayname: Long, grbit: UInt): Int =
    0

public actual fun JetCreateInstanceA(pinstance: Long, szinstancename: Long): Int =
    0

public actual fun JetCreateInstanceW(pinstance: Long, szinstancename: Long): Int =
    0

public actual fun JetCreateTableA(sesid: JET_SESID, dbid: UInt, sztablename: Long, lpages: UInt, ldensity: UInt, ptableid: Long): Int =
    0

public actual fun JetCreateTableColumnIndex2A(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int =
    0

public actual fun JetCreateTableColumnIndex2W(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int =
    0

public actual fun JetCreateTableColumnIndex3A(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int =
    0

public actual fun JetCreateTableColumnIndex3W(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int =
    0

public actual fun JetCreateTableColumnIndex4A(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int =
    0

public actual fun JetCreateTableColumnIndex4W(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int =
    0

public actual fun JetCreateTableColumnIndexA(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int =
    0

public actual fun JetCreateTableColumnIndexW(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int =
    0

public actual fun JetCreateTableW(sesid: JET_SESID, dbid: UInt, sztablename: Long, lpages: UInt, ldensity: UInt, ptableid: Long): Int =
    0

public actual fun JetDefragment2A(sesid: JET_SESID, dbid: UInt, sztablename: Long, pcpasses: Long, pcseconds: Long, callback: JET_CALLBACK, grbit: UInt): Int =
    0

public actual fun JetDefragment2W(sesid: JET_SESID, dbid: UInt, sztablename: Long, pcpasses: Long, pcseconds: Long, callback: JET_CALLBACK, grbit: UInt): Int =
    0

public actual fun JetDefragment3A(sesid: JET_SESID, szdatabasename: Long, sztablename: Long, pcpasses: Long, pcseconds: Long, callback: JET_CALLBACK, pvcontext: Long, grbit: UInt): Int =
    0

public actual fun JetDefragment3W(sesid: JET_SESID, szdatabasename: Long, sztablename: Long, pcpasses: Long, pcseconds: Long, callback: JET_CALLBACK, pvcontext: Long, grbit: UInt): Int =
    0

public actual fun JetDefragmentA(sesid: JET_SESID, dbid: UInt, sztablename: Long, pcpasses: Long, pcseconds: Long, grbit: UInt): Int =
    0

public actual fun JetDefragmentW(sesid: JET_SESID, dbid: UInt, sztablename: Long, pcpasses: Long, pcseconds: Long, grbit: UInt): Int =
    0

public actual fun JetDelete(sesid: JET_SESID, tableid: JET_TABLEID): Int =
    0

public actual fun JetDeleteColumn2A(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long, grbit: UInt): Int =
    0

public actual fun JetDeleteColumn2W(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long, grbit: UInt): Int =
    0

public actual fun JetDeleteColumnA(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long): Int =
    0

public actual fun JetDeleteColumnW(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long): Int =
    0

public actual fun JetDeleteIndexA(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long): Int =
    0

public actual fun JetDeleteIndexW(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long): Int =
    0

public actual fun JetDeleteTableA(sesid: JET_SESID, dbid: UInt, sztablename: Long): Int =
    0

public actual fun JetDeleteTableW(sesid: JET_SESID, dbid: UInt, sztablename: Long): Int =
    0

public actual fun JetDetachDatabase2A(sesid: JET_SESID, szfilename: Long, grbit: UInt): Int =
    0

public actual fun JetDetachDatabase2W(sesid: JET_SESID, szfilename: Long, grbit: UInt): Int =
    0

public actual fun JetDetachDatabaseA(sesid: JET_SESID, szfilename: Long): Int =
    0

public actual fun JetDetachDatabaseW(sesid: JET_SESID, szfilename: Long): Int =
    0

public actual fun JetDupCursor(sesid: JET_SESID, tableid: JET_TABLEID, ptableid: Long, grbit: UInt): Int =
    0

public actual fun JetDupSession(sesid: JET_SESID, psesid: Long): Int =
    0

public actual fun JetEnableMultiInstanceA(psetsysparam: Long, csetsysparam: UInt, pcsetsucceed: Long): Int =
    0

public actual fun JetEnableMultiInstanceW(psetsysparam: Long, csetsysparam: UInt, pcsetsucceed: Long): Int =
    0

public actual fun JetEndExternalBackup(): Int =
    0

public actual fun JetEndExternalBackupInstance(instance: JET_INSTANCE): Int =
    0

public actual fun JetEndExternalBackupInstance2(instance: JET_INSTANCE, grbit: UInt): Int =
    0

public actual fun JetEndSession(sesid: JET_SESID, grbit: UInt): Int =
    0

public actual fun JetEnumerateColumns(sesid: JET_SESID, tableid: JET_TABLEID, cenumcolumnid: UInt, rgenumcolumnid: Long, pcenumcolumn: Long, prgenumcolumn: Long, pfnrealloc: JET_PFNREALLOC, pvrealloccontext: Long, cbdatamost: UInt, grbit: UInt): Int =
    0

public actual fun JetEscrowUpdate(sesid: JET_SESID, tableid: JET_TABLEID, columnid: UInt, pv: Long, cbmax: UInt, pvold: Long, cboldmax: UInt, pcboldactual: Long, grbit: UInt): Int =
    0

public actual fun JetExternalRestore2A(szcheckpointfilepath: Long, szlogpath: Long, rgrstmap: Long, crstfilemap: Int, szbackuplogpath: Long, ploginfo: Long, sztargetinstancename: Long, sztargetinstancelogpath: Long, sztargetinstancecheckpointpath: Long, pfn: JET_PFNSTATUS): Int =
    0

public actual fun JetExternalRestore2W(szcheckpointfilepath: Long, szlogpath: Long, rgrstmap: Long, crstfilemap: Int, szbackuplogpath: Long, ploginfo: Long, sztargetinstancename: Long, sztargetinstancelogpath: Long, sztargetinstancecheckpointpath: Long, pfn: JET_PFNSTATUS): Int =
    0

public actual fun JetExternalRestoreA(szcheckpointfilepath: Long, szlogpath: Long, rgrstmap: Long, crstfilemap: Int, szbackuplogpath: Long, genlow: Int, genhigh: Int, pfn: JET_PFNSTATUS): Int =
    0

public actual fun JetExternalRestoreW(szcheckpointfilepath: Long, szlogpath: Long, rgrstmap: Long, crstfilemap: Int, szbackuplogpath: Long, genlow: Int, genhigh: Int, pfn: JET_PFNSTATUS): Int =
    0

public actual fun JetFreeBuffer(pbbuf: PCSTR): Int =
    0

public actual fun JetGetAttachInfoA(szzdatabases: Long, cbmax: UInt, pcbactual: Long): Int =
    0

public actual fun JetGetAttachInfoInstanceA(instance: JET_INSTANCE, szzdatabases: Long, cbmax: UInt, pcbactual: Long): Int =
    0

public actual fun JetGetAttachInfoInstanceW(instance: JET_INSTANCE, szzdatabases: Long, cbmax: UInt, pcbactual: Long): Int =
    0

public actual fun JetGetAttachInfoW(wszzdatabases: Long, cbmax: UInt, pcbactual: Long): Int =
    0

public actual fun JetGetBookmark(sesid: JET_SESID, tableid: JET_TABLEID, pvbookmark: Long, cbmax: UInt, pcbactual: Long): Int =
    0

public actual fun JetGetColumnInfoA(sesid: JET_SESID, dbid: UInt, sztablename: Long, pcolumnnameorid: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    0

public actual fun JetGetColumnInfoW(sesid: JET_SESID, dbid: UInt, sztablename: Long, pwcolumnnameorid: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    0

public actual fun JetGetCurrentIndexA(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, cbindexname: UInt): Int =
    0

public actual fun JetGetCurrentIndexW(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, cbindexname: UInt): Int =
    0

public actual fun JetGetCursorInfo(sesid: JET_SESID, tableid: JET_TABLEID, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    0

public actual fun JetGetDatabaseFileInfoA(szdatabasename: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    0

public actual fun JetGetDatabaseFileInfoW(szdatabasename: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    0

public actual fun JetGetDatabaseInfoA(sesid: JET_SESID, dbid: UInt, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    0

public actual fun JetGetDatabaseInfoW(sesid: JET_SESID, dbid: UInt, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    0

public actual fun JetGetErrorInfoW(pvcontext: Long, pvresult: Long, cbmax: UInt, infolevel: UInt, grbit: UInt): Int =
    0

public actual fun JetGetIndexInfoA(sesid: JET_SESID, dbid: UInt, sztablename: Long, szindexname: Long, pvresult: Long, cbresult: UInt, infolevel: UInt): Int =
    0

public actual fun JetGetIndexInfoW(sesid: JET_SESID, dbid: UInt, sztablename: Long, szindexname: Long, pvresult: Long, cbresult: UInt, infolevel: UInt): Int =
    0

public actual fun JetGetInstanceInfoA(pcinstanceinfo: Long, painstanceinfo: Long): Int =
    0

public actual fun JetGetInstanceInfoW(pcinstanceinfo: Long, painstanceinfo: Long): Int =
    0

public actual fun JetGetInstanceMiscInfo(instance: JET_INSTANCE, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    0

public actual fun JetGetLS(sesid: JET_SESID, tableid: JET_TABLEID, pls: Long, grbit: UInt): Int =
    0

public actual fun JetGetLock(sesid: JET_SESID, tableid: JET_TABLEID, grbit: UInt): Int =
    0

public actual fun JetGetLogInfoA(szzlogs: Long, cbmax: UInt, pcbactual: Long): Int =
    0

public actual fun JetGetLogInfoInstance2A(instance: JET_INSTANCE, szzlogs: Long, cbmax: UInt, pcbactual: Long, ploginfo: Long): Int =
    0

public actual fun JetGetLogInfoInstance2W(instance: JET_INSTANCE, wszzlogs: Long, cbmax: UInt, pcbactual: Long, ploginfo: Long): Int =
    0

public actual fun JetGetLogInfoInstanceA(instance: JET_INSTANCE, szzlogs: Long, cbmax: UInt, pcbactual: Long): Int =
    0

public actual fun JetGetLogInfoInstanceW(instance: JET_INSTANCE, wszzlogs: Long, cbmax: UInt, pcbactual: Long): Int =
    0

public actual fun JetGetLogInfoW(szzlogs: Long, cbmax: UInt, pcbactual: Long): Int =
    0

public actual fun JetGetObjectInfoA(sesid: JET_SESID, dbid: UInt, objtyp: UInt, szcontainername: Long, szobjectname: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    0

public actual fun JetGetObjectInfoW(sesid: JET_SESID, dbid: UInt, objtyp: UInt, szcontainername: Long, szobjectname: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    0

public actual fun JetGetRecordPosition(sesid: JET_SESID, tableid: JET_TABLEID, precpos: Long, cbrecpos: UInt): Int =
    0

public actual fun JetGetRecordSize(sesid: JET_SESID, tableid: JET_TABLEID, precsize: Long, grbit: UInt): Int =
    0

public actual fun JetGetRecordSize2(sesid: JET_SESID, tableid: JET_TABLEID, precsize: Long, grbit: UInt): Int =
    0

public actual fun JetGetSecondaryIndexBookmark(sesid: JET_SESID, tableid: JET_TABLEID, pvsecondarykey: Long, cbsecondarykeymax: UInt, pcbsecondarykeyactual: Long, pvprimarybookmark: Long, cbprimarybookmarkmax: UInt, pcbprimarybookmarkactual: Long, grbit: UInt): Int =
    0

public actual fun JetGetSessionParameter(sesid: JET_SESID, sesparamid: UInt, pvparam: Long, cbparammax: UInt, pcbparamactual: Long): Int =
    0

public actual fun JetGetSystemParameterA(instance: JET_INSTANCE, sesid: JET_SESID, paramid: UInt, plparam: Long, szparam: Long, cbmax: UInt): Int =
    0

public actual fun JetGetSystemParameterW(instance: JET_INSTANCE, sesid: JET_SESID, paramid: UInt, plparam: Long, szparam: Long, cbmax: UInt): Int =
    0

public actual fun JetGetTableColumnInfoA(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    0

public actual fun JetGetTableColumnInfoW(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    0

public actual fun JetGetTableIndexInfoA(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, pvresult: Long, cbresult: UInt, infolevel: UInt): Int =
    0

public actual fun JetGetTableIndexInfoW(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, pvresult: Long, cbresult: UInt, infolevel: UInt): Int =
    0

public actual fun JetGetTableInfoA(sesid: JET_SESID, tableid: JET_TABLEID, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    0

public actual fun JetGetTableInfoW(sesid: JET_SESID, tableid: JET_TABLEID, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    0

public actual fun JetGetThreadStats(pvresult: Long, cbmax: UInt): Int =
    0

public actual fun JetGetTruncateLogInfoInstanceA(instance: JET_INSTANCE, szzlogs: Long, cbmax: UInt, pcbactual: Long): Int =
    0

public actual fun JetGetTruncateLogInfoInstanceW(instance: JET_INSTANCE, wszzlogs: Long, cbmax: UInt, pcbactual: Long): Int =
    0

public actual fun JetGetVersion(sesid: JET_SESID, pwversion: Long): Int =
    0

public actual fun JetGotoBookmark(sesid: JET_SESID, tableid: JET_TABLEID, pvbookmark: Long, cbbookmark: UInt): Int =
    0

public actual fun JetGotoPosition(sesid: JET_SESID, tableid: JET_TABLEID, precpos: Long): Int =
    0

public actual fun JetGotoSecondaryIndexBookmark(sesid: JET_SESID, tableid: JET_TABLEID, pvsecondarykey: Long, cbsecondarykey: UInt, pvprimarybookmark: Long, cbprimarybookmark: UInt, grbit: UInt): Int =
    0

public actual fun JetGrowDatabase(sesid: JET_SESID, dbid: UInt, cpg: UInt, pcpgreal: Long): Int =
    0

public actual fun JetIdle(sesid: JET_SESID, grbit: UInt): Int =
    0

public actual fun JetIndexRecordCount(sesid: JET_SESID, tableid: JET_TABLEID, pcrec: Long, crecmax: UInt): Int =
    0

public actual fun JetInit(pinstance: Long): Int =
    0

public actual fun JetInit2(pinstance: Long, grbit: UInt): Int =
    0

public actual fun JetInit3A(pinstance: Long, prstinfo: Long, grbit: UInt): Int =
    0

public actual fun JetInit3W(pinstance: Long, prstinfo: Long, grbit: UInt): Int =
    0

public actual fun JetIntersectIndexes(sesid: JET_SESID, rgindexrange: Long, cindexrange: UInt, precordlist: Long, grbit: UInt): Int =
    0

public actual fun JetMakeKey(sesid: JET_SESID, tableid: JET_TABLEID, pvdata: Long, cbdata: UInt, grbit: UInt): Int =
    0

public actual fun JetMove(sesid: JET_SESID, tableid: JET_TABLEID, crow: Int, grbit: UInt): Int =
    0

public actual fun JetOSSnapshotAbort(snapid: JET_OSSNAPID, grbit: UInt): Int =
    0

public actual fun JetOSSnapshotEnd(snapid: JET_OSSNAPID, grbit: UInt): Int =
    0

public actual fun JetOSSnapshotFreezeA(snapid: JET_OSSNAPID, pcinstanceinfo: Long, painstanceinfo: Long, grbit: UInt): Int =
    0

public actual fun JetOSSnapshotFreezeW(snapid: JET_OSSNAPID, pcinstanceinfo: Long, painstanceinfo: Long, grbit: UInt): Int =
    0

public actual fun JetOSSnapshotGetFreezeInfoA(snapid: JET_OSSNAPID, pcinstanceinfo: Long, painstanceinfo: Long, grbit: UInt): Int =
    0

public actual fun JetOSSnapshotGetFreezeInfoW(snapid: JET_OSSNAPID, pcinstanceinfo: Long, painstanceinfo: Long, grbit: UInt): Int =
    0

public actual fun JetOSSnapshotPrepare(psnapid: Long, grbit: UInt): Int =
    0

public actual fun JetOSSnapshotPrepareInstance(snapid: JET_OSSNAPID, instance: JET_INSTANCE, grbit: UInt): Int =
    0

public actual fun JetOSSnapshotThaw(snapid: JET_OSSNAPID, grbit: UInt): Int =
    0

public actual fun JetOSSnapshotTruncateLog(snapid: JET_OSSNAPID, grbit: UInt): Int =
    0

public actual fun JetOSSnapshotTruncateLogInstance(snapid: JET_OSSNAPID, instance: JET_INSTANCE, grbit: UInt): Int =
    0

public actual fun JetOpenDatabaseA(sesid: JET_SESID, szfilename: Long, szconnect: Long, pdbid: Long, grbit: UInt): Int =
    0

public actual fun JetOpenDatabaseW(sesid: JET_SESID, szfilename: Long, szconnect: Long, pdbid: Long, grbit: UInt): Int =
    0

public actual fun JetOpenFileA(szfilename: Long, phffile: Long, pulfilesizelow: Long, pulfilesizehigh: Long): Int =
    0

public actual fun JetOpenFileInstanceA(instance: JET_INSTANCE, szfilename: Long, phffile: Long, pulfilesizelow: Long, pulfilesizehigh: Long): Int =
    0

public actual fun JetOpenFileInstanceW(instance: JET_INSTANCE, szfilename: Long, phffile: Long, pulfilesizelow: Long, pulfilesizehigh: Long): Int =
    0

public actual fun JetOpenFileW(szfilename: Long, phffile: Long, pulfilesizelow: Long, pulfilesizehigh: Long): Int =
    0

public actual fun JetOpenTableA(sesid: JET_SESID, dbid: UInt, sztablename: Long, pvparameters: Long, cbparameters: UInt, grbit: UInt, ptableid: Long): Int =
    0

public actual fun JetOpenTableW(sesid: JET_SESID, dbid: UInt, sztablename: Long, pvparameters: Long, cbparameters: UInt, grbit: UInt, ptableid: Long): Int =
    0

public actual fun JetOpenTempTable(sesid: JET_SESID, prgcolumndef: Long, ccolumn: UInt, grbit: UInt, ptableid: Long, prgcolumnid: Long): Int =
    0

public actual fun JetOpenTempTable2(sesid: JET_SESID, prgcolumndef: Long, ccolumn: UInt, lcid: UInt, grbit: UInt, ptableid: Long, prgcolumnid: Long): Int =
    0

public actual fun JetOpenTempTable3(sesid: JET_SESID, prgcolumndef: Long, ccolumn: UInt, pidxunicode: Long, grbit: UInt, ptableid: Long, prgcolumnid: Long): Int =
    0

public actual fun JetOpenTemporaryTable(sesid: JET_SESID, popentemporarytable: Long): Int =
    0

public actual fun JetOpenTemporaryTable2(sesid: JET_SESID, popentemporarytable: Long): Int =
    0

public actual fun JetPrepareUpdate(sesid: JET_SESID, tableid: JET_TABLEID, prep: UInt): Int =
    0

public actual fun JetPrereadIndexRanges(sesid: JET_SESID, tableid: JET_TABLEID, rgindexranges: Long, cindexranges: UInt, pcrangespreread: Long, rgcolumnidpreread: Long, ccolumnidpreread: UInt, grbit: UInt): Int =
    0

public actual fun JetPrereadKeys(sesid: JET_SESID, tableid: JET_TABLEID, rgpvkeys: Long, rgcbkeys: Long, ckeys: Int, pckeyspreread: Long, grbit: UInt): Int =
    0

public actual fun JetReadFile(hffile: JET_HANDLE, pv: Long, cb: UInt, pcbactual: Long): Int =
    0

public actual fun JetReadFileInstance(instance: JET_INSTANCE, hffile: JET_HANDLE, pv: Long, cb: UInt, pcbactual: Long): Int =
    0

public actual fun JetRegisterCallback(sesid: JET_SESID, tableid: JET_TABLEID, cbtyp: UInt, pcallback: JET_CALLBACK, pvcontext: Long, phcallbackid: Long): Int =
    0

public actual fun JetRenameColumnA(sesid: JET_SESID, tableid: JET_TABLEID, szname: Long, sznamenew: Long, grbit: UInt): Int =
    0

public actual fun JetRenameColumnW(sesid: JET_SESID, tableid: JET_TABLEID, szname: Long, sznamenew: Long, grbit: UInt): Int =
    0

public actual fun JetRenameTableA(sesid: JET_SESID, dbid: UInt, szname: Long, sznamenew: Long): Int =
    0

public actual fun JetRenameTableW(sesid: JET_SESID, dbid: UInt, szname: Long, sznamenew: Long): Int =
    0

public actual fun JetResetSessionContext(sesid: JET_SESID): Int =
    0

public actual fun JetResetTableSequential(sesid: JET_SESID, tableid: JET_TABLEID, grbit: UInt): Int =
    0

public actual fun JetResizeDatabase(sesid: JET_SESID, dbid: UInt, cpgtarget: UInt, pcpgactual: Long, grbit: UInt): Int =
    0

public actual fun JetRestore2A(sz: Long, szdest: Long, pfn: JET_PFNSTATUS): Int =
    0

public actual fun JetRestore2W(sz: Long, szdest: Long, pfn: JET_PFNSTATUS): Int =
    0

public actual fun JetRestoreA(szsource: Long, pfn: JET_PFNSTATUS): Int =
    0

public actual fun JetRestoreInstanceA(instance: JET_INSTANCE, sz: Long, szdest: Long, pfn: JET_PFNSTATUS): Int =
    0

public actual fun JetRestoreInstanceW(instance: JET_INSTANCE, sz: Long, szdest: Long, pfn: JET_PFNSTATUS): Int =
    0

public actual fun JetRestoreW(szsource: Long, pfn: JET_PFNSTATUS): Int =
    0

public actual fun JetRetrieveColumn(sesid: JET_SESID, tableid: JET_TABLEID, columnid: UInt, pvdata: Long, cbdata: UInt, pcbactual: Long, grbit: UInt, pretinfo: Long): Int =
    0

public actual fun JetRetrieveColumns(sesid: JET_SESID, tableid: JET_TABLEID, pretrievecolumn: Long, cretrievecolumn: UInt): Int =
    0

public actual fun JetRetrieveKey(sesid: JET_SESID, tableid: JET_TABLEID, pvkey: Long, cbmax: UInt, pcbactual: Long, grbit: UInt): Int =
    0

public actual fun JetRollback(sesid: JET_SESID, grbit: UInt): Int =
    0

public actual fun JetSeek(sesid: JET_SESID, tableid: JET_TABLEID, grbit: UInt): Int =
    0

public actual fun JetSetColumn(sesid: JET_SESID, tableid: JET_TABLEID, columnid: UInt, pvdata: Long, cbdata: UInt, grbit: UInt, psetinfo: Long): Int =
    0

public actual fun JetSetColumnDefaultValueA(sesid: JET_SESID, dbid: UInt, sztablename: Long, szcolumnname: Long, pvdata: Long, cbdata: UInt, grbit: UInt): Int =
    0

public actual fun JetSetColumnDefaultValueW(sesid: JET_SESID, dbid: UInt, sztablename: Long, szcolumnname: Long, pvdata: Long, cbdata: UInt, grbit: UInt): Int =
    0

public actual fun JetSetColumns(sesid: JET_SESID, tableid: JET_TABLEID, psetcolumn: Long, csetcolumn: UInt): Int =
    0

public actual fun JetSetCurrentIndex2A(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, grbit: UInt): Int =
    0

public actual fun JetSetCurrentIndex2W(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, grbit: UInt): Int =
    0

public actual fun JetSetCurrentIndex3A(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, grbit: UInt, itagsequence: UInt): Int =
    0

public actual fun JetSetCurrentIndex3W(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, grbit: UInt, itagsequence: UInt): Int =
    0

public actual fun JetSetCurrentIndex4A(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, pindexid: Long, grbit: UInt, itagsequence: UInt): Int =
    0

public actual fun JetSetCurrentIndex4W(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, pindexid: Long, grbit: UInt, itagsequence: UInt): Int =
    0

public actual fun JetSetCurrentIndexA(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long): Int =
    0

public actual fun JetSetCurrentIndexW(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long): Int =
    0

public actual fun JetSetCursorFilter(sesid: JET_SESID, tableid: JET_TABLEID, rgcolumnfilters: Long, ccolumnfilters: UInt, grbit: UInt): Int =
    0

public actual fun JetSetDatabaseSizeA(sesid: JET_SESID, szdatabasename: Long, cpg: UInt, pcpgreal: Long): Int =
    0

public actual fun JetSetDatabaseSizeW(sesid: JET_SESID, szdatabasename: Long, cpg: UInt, pcpgreal: Long): Int =
    0

public actual fun JetSetIndexRange(sesid: JET_SESID, tableidsrc: JET_TABLEID, grbit: UInt): Int =
    0

public actual fun JetSetLS(sesid: JET_SESID, tableid: JET_TABLEID, ls: JET_LS, grbit: UInt): Int =
    0

public actual fun JetSetSessionContext(sesid: JET_SESID, ulcontext: JET_API_PTR): Int =
    0

public actual fun JetSetSessionParameter(sesid: JET_SESID, sesparamid: UInt, pvparam: Long, cbparam: UInt): Int =
    0

public actual fun JetSetSystemParameterA(pinstance: Long, sesid: JET_SESID, paramid: UInt, lparam: JET_API_PTR, szparam: Long): Int =
    0

public actual fun JetSetSystemParameterW(pinstance: Long, sesid: JET_SESID, paramid: UInt, lparam: JET_API_PTR, szparam: Long): Int =
    0

public actual fun JetSetTableSequential(sesid: JET_SESID, tableid: JET_TABLEID, grbit: UInt): Int =
    0

public actual fun JetStopBackup(): Int =
    0

public actual fun JetStopBackupInstance(instance: JET_INSTANCE): Int =
    0

public actual fun JetStopService(): Int =
    0

public actual fun JetStopServiceInstance(instance: JET_INSTANCE): Int =
    0

public actual fun JetStopServiceInstance2(instance: JET_INSTANCE, grbit: UInt): Int =
    0

public actual fun JetTerm(instance: JET_INSTANCE): Int =
    0

public actual fun JetTerm2(instance: JET_INSTANCE, grbit: UInt): Int =
    0

public actual fun JetTruncateLog(): Int =
    0

public actual fun JetTruncateLogInstance(instance: JET_INSTANCE): Int =
    0

public actual fun JetUnregisterCallback(sesid: JET_SESID, tableid: JET_TABLEID, cbtyp: UInt, hcallbackid: JET_HANDLE): Int =
    0

public actual fun JetUpdate(sesid: JET_SESID, tableid: JET_TABLEID, pvbookmark: Long, cbbookmark: UInt, pcbactual: Long): Int =
    0

public actual fun JetUpdate2(sesid: JET_SESID, tableid: JET_TABLEID, pvbookmark: Long, cbbookmark: UInt, pcbactual: Long, grbit: UInt): Int =
    0
