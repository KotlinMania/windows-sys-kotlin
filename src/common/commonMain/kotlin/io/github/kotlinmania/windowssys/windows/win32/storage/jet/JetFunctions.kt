package io.github.kotlinmania.windowssys.windows.win32.storage.jet

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JET_API_PTR
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JET_HANDLE
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JET_TABLEID

public expect fun JetAddColumnA(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long, pcolumndef: Long, pvdefault: Long, cbdefault: UInt, pcolumnid: Long): Int

public expect fun JetAddColumnW(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long, pcolumndef: Long, pvdefault: Long, cbdefault: UInt, pcolumnid: Long): Int

public expect fun JetAttachDatabase2A(sesid: JET_SESID, szfilename: Long, cpgdatabasesizemax: UInt, grbit: UInt): Int

public expect fun JetAttachDatabase2W(sesid: JET_SESID, szfilename: Long, cpgdatabasesizemax: UInt, grbit: UInt): Int

public expect fun JetAttachDatabaseA(sesid: JET_SESID, szfilename: Long, grbit: UInt): Int

public expect fun JetAttachDatabaseW(sesid: JET_SESID, szfilename: Long, grbit: UInt): Int

public expect fun JetBackupA(szbackuppath: Long, grbit: UInt, pfnstatus: JET_PFNSTATUS): Int

public expect fun JetBackupInstanceA(instance: JET_INSTANCE, szbackuppath: Long, grbit: UInt, pfnstatus: JET_PFNSTATUS): Int

public expect fun JetBackupInstanceW(instance: JET_INSTANCE, szbackuppath: Long, grbit: UInt, pfnstatus: JET_PFNSTATUS): Int

public expect fun JetBackupW(szbackuppath: Long, grbit: UInt, pfnstatus: JET_PFNSTATUS): Int

public expect fun JetBeginExternalBackup(grbit: UInt): Int

public expect fun JetBeginExternalBackupInstance(instance: JET_INSTANCE, grbit: UInt): Int

public expect fun JetBeginSessionA(instance: JET_INSTANCE, psesid: Long, szusername: Long, szpassword: Long): Int

public expect fun JetBeginSessionW(instance: JET_INSTANCE, psesid: Long, szusername: Long, szpassword: Long): Int

public expect fun JetBeginTransaction(sesid: JET_SESID): Int

public expect fun JetBeginTransaction2(sesid: JET_SESID, grbit: UInt): Int

public expect fun JetBeginTransaction3(sesid: JET_SESID, trxid: Long, grbit: UInt): Int

public expect fun JetCloseDatabase(sesid: JET_SESID, dbid: UInt, grbit: UInt): Int

public expect fun JetCloseFile(hffile: JET_HANDLE): Int

public expect fun JetCloseFileInstance(instance: JET_INSTANCE, hffile: JET_HANDLE): Int

public expect fun JetCloseTable(sesid: JET_SESID, tableid: JET_TABLEID): Int

public expect fun JetCommitTransaction(sesid: JET_SESID, grbit: UInt): Int

public expect fun JetCommitTransaction2(sesid: JET_SESID, grbit: UInt, cmsecdurablecommit: UInt, pcommitid: Long): Int

public expect fun JetCompactA(sesid: JET_SESID, szdatabasesrc: Long, szdatabasedest: Long, pfnstatus: JET_PFNSTATUS, pconvert: Long, grbit: UInt): Int

public expect fun JetCompactW(sesid: JET_SESID, szdatabasesrc: Long, szdatabasedest: Long, pfnstatus: JET_PFNSTATUS, pconvert: Long, grbit: UInt): Int

public expect fun JetComputeStats(sesid: JET_SESID, tableid: JET_TABLEID): Int

public expect fun JetConfigureProcessForCrashDump(grbit: UInt): Int

public expect fun JetCreateDatabase2A(sesid: JET_SESID, szfilename: Long, cpgdatabasesizemax: UInt, pdbid: Long, grbit: UInt): Int

public expect fun JetCreateDatabase2W(sesid: JET_SESID, szfilename: Long, cpgdatabasesizemax: UInt, pdbid: Long, grbit: UInt): Int

public expect fun JetCreateDatabaseA(sesid: JET_SESID, szfilename: Long, szconnect: Long, pdbid: Long, grbit: UInt): Int

public expect fun JetCreateDatabaseW(sesid: JET_SESID, szfilename: Long, szconnect: Long, pdbid: Long, grbit: UInt): Int

public expect fun JetCreateIndex2A(sesid: JET_SESID, tableid: JET_TABLEID, pindexcreate: Long, cindexcreate: UInt): Int

public expect fun JetCreateIndex2W(sesid: JET_SESID, tableid: JET_TABLEID, pindexcreate: Long, cindexcreate: UInt): Int

public expect fun JetCreateIndex3A(sesid: JET_SESID, tableid: JET_TABLEID, pindexcreate: Long, cindexcreate: UInt): Int

public expect fun JetCreateIndex3W(sesid: JET_SESID, tableid: JET_TABLEID, pindexcreate: Long, cindexcreate: UInt): Int

public expect fun JetCreateIndex4A(sesid: JET_SESID, tableid: JET_TABLEID, pindexcreate: Long, cindexcreate: UInt): Int

public expect fun JetCreateIndex4W(sesid: JET_SESID, tableid: JET_TABLEID, pindexcreate: Long, cindexcreate: UInt): Int

public expect fun JetCreateIndexA(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, grbit: UInt, szkey: PCSTR, cbkey: UInt, ldensity: UInt): Int

public expect fun JetCreateIndexW(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, grbit: UInt, szkey: PCWSTR, cbkey: UInt, ldensity: UInt): Int

public expect fun JetCreateInstance2A(pinstance: Long, szinstancename: Long, szdisplayname: Long, grbit: UInt): Int

public expect fun JetCreateInstance2W(pinstance: Long, szinstancename: Long, szdisplayname: Long, grbit: UInt): Int

public expect fun JetCreateInstanceA(pinstance: Long, szinstancename: Long): Int

public expect fun JetCreateInstanceW(pinstance: Long, szinstancename: Long): Int

public expect fun JetCreateTableA(sesid: JET_SESID, dbid: UInt, sztablename: Long, lpages: UInt, ldensity: UInt, ptableid: Long): Int

public expect fun JetCreateTableColumnIndex2A(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int

public expect fun JetCreateTableColumnIndex2W(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int

public expect fun JetCreateTableColumnIndex3A(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int

public expect fun JetCreateTableColumnIndex3W(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int

public expect fun JetCreateTableColumnIndex4A(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int

public expect fun JetCreateTableColumnIndex4W(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int

public expect fun JetCreateTableColumnIndexA(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int

public expect fun JetCreateTableColumnIndexW(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int

public expect fun JetCreateTableW(sesid: JET_SESID, dbid: UInt, sztablename: Long, lpages: UInt, ldensity: UInt, ptableid: Long): Int

public expect fun JetDefragment2A(sesid: JET_SESID, dbid: UInt, sztablename: Long, pcpasses: Long, pcseconds: Long, callback: JET_CALLBACK, grbit: UInt): Int

public expect fun JetDefragment2W(sesid: JET_SESID, dbid: UInt, sztablename: Long, pcpasses: Long, pcseconds: Long, callback: JET_CALLBACK, grbit: UInt): Int

public expect fun JetDefragment3A(sesid: JET_SESID, szdatabasename: Long, sztablename: Long, pcpasses: Long, pcseconds: Long, callback: JET_CALLBACK, pvcontext: Long, grbit: UInt): Int

public expect fun JetDefragment3W(sesid: JET_SESID, szdatabasename: Long, sztablename: Long, pcpasses: Long, pcseconds: Long, callback: JET_CALLBACK, pvcontext: Long, grbit: UInt): Int

public expect fun JetDefragmentA(sesid: JET_SESID, dbid: UInt, sztablename: Long, pcpasses: Long, pcseconds: Long, grbit: UInt): Int

public expect fun JetDefragmentW(sesid: JET_SESID, dbid: UInt, sztablename: Long, pcpasses: Long, pcseconds: Long, grbit: UInt): Int

public expect fun JetDelete(sesid: JET_SESID, tableid: JET_TABLEID): Int

public expect fun JetDeleteColumn2A(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long, grbit: UInt): Int

public expect fun JetDeleteColumn2W(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long, grbit: UInt): Int

public expect fun JetDeleteColumnA(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long): Int

public expect fun JetDeleteColumnW(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long): Int

public expect fun JetDeleteIndexA(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long): Int

public expect fun JetDeleteIndexW(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long): Int

public expect fun JetDeleteTableA(sesid: JET_SESID, dbid: UInt, sztablename: Long): Int

public expect fun JetDeleteTableW(sesid: JET_SESID, dbid: UInt, sztablename: Long): Int

public expect fun JetDetachDatabase2A(sesid: JET_SESID, szfilename: Long, grbit: UInt): Int

public expect fun JetDetachDatabase2W(sesid: JET_SESID, szfilename: Long, grbit: UInt): Int

public expect fun JetDetachDatabaseA(sesid: JET_SESID, szfilename: Long): Int

public expect fun JetDetachDatabaseW(sesid: JET_SESID, szfilename: Long): Int

public expect fun JetDupCursor(sesid: JET_SESID, tableid: JET_TABLEID, ptableid: Long, grbit: UInt): Int

public expect fun JetDupSession(sesid: JET_SESID, psesid: Long): Int

public expect fun JetEnableMultiInstanceA(psetsysparam: Long, csetsysparam: UInt, pcsetsucceed: Long): Int

public expect fun JetEnableMultiInstanceW(psetsysparam: Long, csetsysparam: UInt, pcsetsucceed: Long): Int

public expect fun JetEndExternalBackup(): Int

public expect fun JetEndExternalBackupInstance(instance: JET_INSTANCE): Int

public expect fun JetEndExternalBackupInstance2(instance: JET_INSTANCE, grbit: UInt): Int

public expect fun JetEndSession(sesid: JET_SESID, grbit: UInt): Int

public expect fun JetEnumerateColumns(sesid: JET_SESID, tableid: JET_TABLEID, cenumcolumnid: UInt, rgenumcolumnid: Long, pcenumcolumn: Long, prgenumcolumn: Long, pfnrealloc: JET_PFNREALLOC, pvrealloccontext: Long, cbdatamost: UInt, grbit: UInt): Int

public expect fun JetEscrowUpdate(sesid: JET_SESID, tableid: JET_TABLEID, columnid: UInt, pv: Long, cbmax: UInt, pvold: Long, cboldmax: UInt, pcboldactual: Long, grbit: UInt): Int

public expect fun JetExternalRestore2A(szcheckpointfilepath: Long, szlogpath: Long, rgrstmap: Long, crstfilemap: Int, szbackuplogpath: Long, ploginfo: Long, sztargetinstancename: Long, sztargetinstancelogpath: Long, sztargetinstancecheckpointpath: Long, pfn: JET_PFNSTATUS): Int

public expect fun JetExternalRestore2W(szcheckpointfilepath: Long, szlogpath: Long, rgrstmap: Long, crstfilemap: Int, szbackuplogpath: Long, ploginfo: Long, sztargetinstancename: Long, sztargetinstancelogpath: Long, sztargetinstancecheckpointpath: Long, pfn: JET_PFNSTATUS): Int

public expect fun JetExternalRestoreA(szcheckpointfilepath: Long, szlogpath: Long, rgrstmap: Long, crstfilemap: Int, szbackuplogpath: Long, genlow: Int, genhigh: Int, pfn: JET_PFNSTATUS): Int

public expect fun JetExternalRestoreW(szcheckpointfilepath: Long, szlogpath: Long, rgrstmap: Long, crstfilemap: Int, szbackuplogpath: Long, genlow: Int, genhigh: Int, pfn: JET_PFNSTATUS): Int

public expect fun JetFreeBuffer(pbbuf: PCSTR): Int

public expect fun JetGetAttachInfoA(szzdatabases: Long, cbmax: UInt, pcbactual: Long): Int

public expect fun JetGetAttachInfoInstanceA(instance: JET_INSTANCE, szzdatabases: Long, cbmax: UInt, pcbactual: Long): Int

public expect fun JetGetAttachInfoInstanceW(instance: JET_INSTANCE, szzdatabases: Long, cbmax: UInt, pcbactual: Long): Int

public expect fun JetGetAttachInfoW(wszzdatabases: Long, cbmax: UInt, pcbactual: Long): Int

public expect fun JetGetBookmark(sesid: JET_SESID, tableid: JET_TABLEID, pvbookmark: Long, cbmax: UInt, pcbactual: Long): Int

public expect fun JetGetColumnInfoA(sesid: JET_SESID, dbid: UInt, sztablename: Long, pcolumnnameorid: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int

public expect fun JetGetColumnInfoW(sesid: JET_SESID, dbid: UInt, sztablename: Long, pwcolumnnameorid: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int

public expect fun JetGetCurrentIndexA(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, cbindexname: UInt): Int

public expect fun JetGetCurrentIndexW(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, cbindexname: UInt): Int

public expect fun JetGetCursorInfo(sesid: JET_SESID, tableid: JET_TABLEID, pvresult: Long, cbmax: UInt, infolevel: UInt): Int

public expect fun JetGetDatabaseFileInfoA(szdatabasename: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int

public expect fun JetGetDatabaseFileInfoW(szdatabasename: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int

public expect fun JetGetDatabaseInfoA(sesid: JET_SESID, dbid: UInt, pvresult: Long, cbmax: UInt, infolevel: UInt): Int

public expect fun JetGetDatabaseInfoW(sesid: JET_SESID, dbid: UInt, pvresult: Long, cbmax: UInt, infolevel: UInt): Int

public expect fun JetGetErrorInfoW(pvcontext: Long, pvresult: Long, cbmax: UInt, infolevel: UInt, grbit: UInt): Int

public expect fun JetGetIndexInfoA(sesid: JET_SESID, dbid: UInt, sztablename: Long, szindexname: Long, pvresult: Long, cbresult: UInt, infolevel: UInt): Int

public expect fun JetGetIndexInfoW(sesid: JET_SESID, dbid: UInt, sztablename: Long, szindexname: Long, pvresult: Long, cbresult: UInt, infolevel: UInt): Int

public expect fun JetGetInstanceInfoA(pcinstanceinfo: Long, painstanceinfo: Long): Int

public expect fun JetGetInstanceInfoW(pcinstanceinfo: Long, painstanceinfo: Long): Int

public expect fun JetGetInstanceMiscInfo(instance: JET_INSTANCE, pvresult: Long, cbmax: UInt, infolevel: UInt): Int

public expect fun JetGetLS(sesid: JET_SESID, tableid: JET_TABLEID, pls: Long, grbit: UInt): Int

public expect fun JetGetLock(sesid: JET_SESID, tableid: JET_TABLEID, grbit: UInt): Int

public expect fun JetGetLogInfoA(szzlogs: Long, cbmax: UInt, pcbactual: Long): Int

public expect fun JetGetLogInfoInstance2A(instance: JET_INSTANCE, szzlogs: Long, cbmax: UInt, pcbactual: Long, ploginfo: Long): Int

public expect fun JetGetLogInfoInstance2W(instance: JET_INSTANCE, wszzlogs: Long, cbmax: UInt, pcbactual: Long, ploginfo: Long): Int

public expect fun JetGetLogInfoInstanceA(instance: JET_INSTANCE, szzlogs: Long, cbmax: UInt, pcbactual: Long): Int

public expect fun JetGetLogInfoInstanceW(instance: JET_INSTANCE, wszzlogs: Long, cbmax: UInt, pcbactual: Long): Int

public expect fun JetGetLogInfoW(szzlogs: Long, cbmax: UInt, pcbactual: Long): Int

public expect fun JetGetObjectInfoA(sesid: JET_SESID, dbid: UInt, objtyp: UInt, szcontainername: Long, szobjectname: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int

public expect fun JetGetObjectInfoW(sesid: JET_SESID, dbid: UInt, objtyp: UInt, szcontainername: Long, szobjectname: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int

public expect fun JetGetRecordPosition(sesid: JET_SESID, tableid: JET_TABLEID, precpos: Long, cbrecpos: UInt): Int

public expect fun JetGetRecordSize(sesid: JET_SESID, tableid: JET_TABLEID, precsize: Long, grbit: UInt): Int

public expect fun JetGetRecordSize2(sesid: JET_SESID, tableid: JET_TABLEID, precsize: Long, grbit: UInt): Int

public expect fun JetGetSecondaryIndexBookmark(sesid: JET_SESID, tableid: JET_TABLEID, pvsecondarykey: Long, cbsecondarykeymax: UInt, pcbsecondarykeyactual: Long, pvprimarybookmark: Long, cbprimarybookmarkmax: UInt, pcbprimarybookmarkactual: Long, grbit: UInt): Int

public expect fun JetGetSessionParameter(sesid: JET_SESID, sesparamid: UInt, pvparam: Long, cbparammax: UInt, pcbparamactual: Long): Int

public expect fun JetGetSystemParameterA(instance: JET_INSTANCE, sesid: JET_SESID, paramid: UInt, plparam: Long, szparam: Long, cbmax: UInt): Int

public expect fun JetGetSystemParameterW(instance: JET_INSTANCE, sesid: JET_SESID, paramid: UInt, plparam: Long, szparam: Long, cbmax: UInt): Int

public expect fun JetGetTableColumnInfoA(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int

public expect fun JetGetTableColumnInfoW(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int

public expect fun JetGetTableIndexInfoA(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, pvresult: Long, cbresult: UInt, infolevel: UInt): Int

public expect fun JetGetTableIndexInfoW(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, pvresult: Long, cbresult: UInt, infolevel: UInt): Int

public expect fun JetGetTableInfoA(sesid: JET_SESID, tableid: JET_TABLEID, pvresult: Long, cbmax: UInt, infolevel: UInt): Int

public expect fun JetGetTableInfoW(sesid: JET_SESID, tableid: JET_TABLEID, pvresult: Long, cbmax: UInt, infolevel: UInt): Int

public expect fun JetGetThreadStats(pvresult: Long, cbmax: UInt): Int

public expect fun JetGetTruncateLogInfoInstanceA(instance: JET_INSTANCE, szzlogs: Long, cbmax: UInt, pcbactual: Long): Int

public expect fun JetGetTruncateLogInfoInstanceW(instance: JET_INSTANCE, wszzlogs: Long, cbmax: UInt, pcbactual: Long): Int

public expect fun JetGetVersion(sesid: JET_SESID, pwversion: Long): Int

public expect fun JetGotoBookmark(sesid: JET_SESID, tableid: JET_TABLEID, pvbookmark: Long, cbbookmark: UInt): Int

public expect fun JetGotoPosition(sesid: JET_SESID, tableid: JET_TABLEID, precpos: Long): Int

public expect fun JetGotoSecondaryIndexBookmark(sesid: JET_SESID, tableid: JET_TABLEID, pvsecondarykey: Long, cbsecondarykey: UInt, pvprimarybookmark: Long, cbprimarybookmark: UInt, grbit: UInt): Int

public expect fun JetGrowDatabase(sesid: JET_SESID, dbid: UInt, cpg: UInt, pcpgreal: Long): Int

public expect fun JetIdle(sesid: JET_SESID, grbit: UInt): Int

public expect fun JetIndexRecordCount(sesid: JET_SESID, tableid: JET_TABLEID, pcrec: Long, crecmax: UInt): Int

public expect fun JetInit(pinstance: Long): Int

public expect fun JetInit2(pinstance: Long, grbit: UInt): Int

public expect fun JetInit3A(pinstance: Long, prstinfo: Long, grbit: UInt): Int

public expect fun JetInit3W(pinstance: Long, prstinfo: Long, grbit: UInt): Int

public expect fun JetIntersectIndexes(sesid: JET_SESID, rgindexrange: Long, cindexrange: UInt, precordlist: Long, grbit: UInt): Int

public expect fun JetMakeKey(sesid: JET_SESID, tableid: JET_TABLEID, pvdata: Long, cbdata: UInt, grbit: UInt): Int

public expect fun JetMove(sesid: JET_SESID, tableid: JET_TABLEID, crow: Int, grbit: UInt): Int

public expect fun JetOSSnapshotAbort(snapid: JET_OSSNAPID, grbit: UInt): Int

public expect fun JetOSSnapshotEnd(snapid: JET_OSSNAPID, grbit: UInt): Int

public expect fun JetOSSnapshotFreezeA(snapid: JET_OSSNAPID, pcinstanceinfo: Long, painstanceinfo: Long, grbit: UInt): Int

public expect fun JetOSSnapshotFreezeW(snapid: JET_OSSNAPID, pcinstanceinfo: Long, painstanceinfo: Long, grbit: UInt): Int

public expect fun JetOSSnapshotGetFreezeInfoA(snapid: JET_OSSNAPID, pcinstanceinfo: Long, painstanceinfo: Long, grbit: UInt): Int

public expect fun JetOSSnapshotGetFreezeInfoW(snapid: JET_OSSNAPID, pcinstanceinfo: Long, painstanceinfo: Long, grbit: UInt): Int

public expect fun JetOSSnapshotPrepare(psnapid: Long, grbit: UInt): Int

public expect fun JetOSSnapshotPrepareInstance(snapid: JET_OSSNAPID, instance: JET_INSTANCE, grbit: UInt): Int

public expect fun JetOSSnapshotThaw(snapid: JET_OSSNAPID, grbit: UInt): Int

public expect fun JetOSSnapshotTruncateLog(snapid: JET_OSSNAPID, grbit: UInt): Int

public expect fun JetOSSnapshotTruncateLogInstance(snapid: JET_OSSNAPID, instance: JET_INSTANCE, grbit: UInt): Int

public expect fun JetOpenDatabaseA(sesid: JET_SESID, szfilename: Long, szconnect: Long, pdbid: Long, grbit: UInt): Int

public expect fun JetOpenDatabaseW(sesid: JET_SESID, szfilename: Long, szconnect: Long, pdbid: Long, grbit: UInt): Int

public expect fun JetOpenFileA(szfilename: Long, phffile: Long, pulfilesizelow: Long, pulfilesizehigh: Long): Int

public expect fun JetOpenFileInstanceA(instance: JET_INSTANCE, szfilename: Long, phffile: Long, pulfilesizelow: Long, pulfilesizehigh: Long): Int

public expect fun JetOpenFileInstanceW(instance: JET_INSTANCE, szfilename: Long, phffile: Long, pulfilesizelow: Long, pulfilesizehigh: Long): Int

public expect fun JetOpenFileW(szfilename: Long, phffile: Long, pulfilesizelow: Long, pulfilesizehigh: Long): Int

public expect fun JetOpenTableA(sesid: JET_SESID, dbid: UInt, sztablename: Long, pvparameters: Long, cbparameters: UInt, grbit: UInt, ptableid: Long): Int

public expect fun JetOpenTableW(sesid: JET_SESID, dbid: UInt, sztablename: Long, pvparameters: Long, cbparameters: UInt, grbit: UInt, ptableid: Long): Int

public expect fun JetOpenTempTable(sesid: JET_SESID, prgcolumndef: Long, ccolumn: UInt, grbit: UInt, ptableid: Long, prgcolumnid: Long): Int

public expect fun JetOpenTempTable2(sesid: JET_SESID, prgcolumndef: Long, ccolumn: UInt, lcid: UInt, grbit: UInt, ptableid: Long, prgcolumnid: Long): Int

public expect fun JetOpenTempTable3(sesid: JET_SESID, prgcolumndef: Long, ccolumn: UInt, pidxunicode: Long, grbit: UInt, ptableid: Long, prgcolumnid: Long): Int

public expect fun JetOpenTemporaryTable(sesid: JET_SESID, popentemporarytable: Long): Int

public expect fun JetOpenTemporaryTable2(sesid: JET_SESID, popentemporarytable: Long): Int

public expect fun JetPrepareUpdate(sesid: JET_SESID, tableid: JET_TABLEID, prep: UInt): Int

public expect fun JetPrereadIndexRanges(sesid: JET_SESID, tableid: JET_TABLEID, rgindexranges: Long, cindexranges: UInt, pcrangespreread: Long, rgcolumnidpreread: Long, ccolumnidpreread: UInt, grbit: UInt): Int

public expect fun JetPrereadKeys(sesid: JET_SESID, tableid: JET_TABLEID, rgpvkeys: Long, rgcbkeys: Long, ckeys: Int, pckeyspreread: Long, grbit: UInt): Int

public expect fun JetReadFile(hffile: JET_HANDLE, pv: Long, cb: UInt, pcbactual: Long): Int

public expect fun JetReadFileInstance(instance: JET_INSTANCE, hffile: JET_HANDLE, pv: Long, cb: UInt, pcbactual: Long): Int

public expect fun JetRegisterCallback(sesid: JET_SESID, tableid: JET_TABLEID, cbtyp: UInt, pcallback: JET_CALLBACK, pvcontext: Long, phcallbackid: Long): Int

public expect fun JetRenameColumnA(sesid: JET_SESID, tableid: JET_TABLEID, szname: Long, sznamenew: Long, grbit: UInt): Int

public expect fun JetRenameColumnW(sesid: JET_SESID, tableid: JET_TABLEID, szname: Long, sznamenew: Long, grbit: UInt): Int

public expect fun JetRenameTableA(sesid: JET_SESID, dbid: UInt, szname: Long, sznamenew: Long): Int

public expect fun JetRenameTableW(sesid: JET_SESID, dbid: UInt, szname: Long, sznamenew: Long): Int

public expect fun JetResetSessionContext(sesid: JET_SESID): Int

public expect fun JetResetTableSequential(sesid: JET_SESID, tableid: JET_TABLEID, grbit: UInt): Int

public expect fun JetResizeDatabase(sesid: JET_SESID, dbid: UInt, cpgtarget: UInt, pcpgactual: Long, grbit: UInt): Int

public expect fun JetRestore2A(sz: Long, szdest: Long, pfn: JET_PFNSTATUS): Int

public expect fun JetRestore2W(sz: Long, szdest: Long, pfn: JET_PFNSTATUS): Int

public expect fun JetRestoreA(szsource: Long, pfn: JET_PFNSTATUS): Int

public expect fun JetRestoreInstanceA(instance: JET_INSTANCE, sz: Long, szdest: Long, pfn: JET_PFNSTATUS): Int

public expect fun JetRestoreInstanceW(instance: JET_INSTANCE, sz: Long, szdest: Long, pfn: JET_PFNSTATUS): Int

public expect fun JetRestoreW(szsource: Long, pfn: JET_PFNSTATUS): Int

public expect fun JetRetrieveColumn(sesid: JET_SESID, tableid: JET_TABLEID, columnid: UInt, pvdata: Long, cbdata: UInt, pcbactual: Long, grbit: UInt, pretinfo: Long): Int

public expect fun JetRetrieveColumns(sesid: JET_SESID, tableid: JET_TABLEID, pretrievecolumn: Long, cretrievecolumn: UInt): Int

public expect fun JetRetrieveKey(sesid: JET_SESID, tableid: JET_TABLEID, pvkey: Long, cbmax: UInt, pcbactual: Long, grbit: UInt): Int

public expect fun JetRollback(sesid: JET_SESID, grbit: UInt): Int

public expect fun JetSeek(sesid: JET_SESID, tableid: JET_TABLEID, grbit: UInt): Int

public expect fun JetSetColumn(sesid: JET_SESID, tableid: JET_TABLEID, columnid: UInt, pvdata: Long, cbdata: UInt, grbit: UInt, psetinfo: Long): Int

public expect fun JetSetColumnDefaultValueA(sesid: JET_SESID, dbid: UInt, sztablename: Long, szcolumnname: Long, pvdata: Long, cbdata: UInt, grbit: UInt): Int

public expect fun JetSetColumnDefaultValueW(sesid: JET_SESID, dbid: UInt, sztablename: Long, szcolumnname: Long, pvdata: Long, cbdata: UInt, grbit: UInt): Int

public expect fun JetSetColumns(sesid: JET_SESID, tableid: JET_TABLEID, psetcolumn: Long, csetcolumn: UInt): Int

public expect fun JetSetCurrentIndex2A(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, grbit: UInt): Int

public expect fun JetSetCurrentIndex2W(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, grbit: UInt): Int

public expect fun JetSetCurrentIndex3A(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, grbit: UInt, itagsequence: UInt): Int

public expect fun JetSetCurrentIndex3W(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, grbit: UInt, itagsequence: UInt): Int

public expect fun JetSetCurrentIndex4A(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, pindexid: Long, grbit: UInt, itagsequence: UInt): Int

public expect fun JetSetCurrentIndex4W(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, pindexid: Long, grbit: UInt, itagsequence: UInt): Int

public expect fun JetSetCurrentIndexA(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long): Int

public expect fun JetSetCurrentIndexW(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long): Int

public expect fun JetSetCursorFilter(sesid: JET_SESID, tableid: JET_TABLEID, rgcolumnfilters: Long, ccolumnfilters: UInt, grbit: UInt): Int

public expect fun JetSetDatabaseSizeA(sesid: JET_SESID, szdatabasename: Long, cpg: UInt, pcpgreal: Long): Int

public expect fun JetSetDatabaseSizeW(sesid: JET_SESID, szdatabasename: Long, cpg: UInt, pcpgreal: Long): Int

public expect fun JetSetIndexRange(sesid: JET_SESID, tableidsrc: JET_TABLEID, grbit: UInt): Int

public expect fun JetSetLS(sesid: JET_SESID, tableid: JET_TABLEID, ls: JET_LS, grbit: UInt): Int

public expect fun JetSetSessionContext(sesid: JET_SESID, ulcontext: JET_API_PTR): Int

public expect fun JetSetSessionParameter(sesid: JET_SESID, sesparamid: UInt, pvparam: Long, cbparam: UInt): Int

public expect fun JetSetSystemParameterA(pinstance: Long, sesid: JET_SESID, paramid: UInt, lparam: JET_API_PTR, szparam: Long): Int

public expect fun JetSetSystemParameterW(pinstance: Long, sesid: JET_SESID, paramid: UInt, lparam: JET_API_PTR, szparam: Long): Int

public expect fun JetSetTableSequential(sesid: JET_SESID, tableid: JET_TABLEID, grbit: UInt): Int

public expect fun JetStopBackup(): Int

public expect fun JetStopBackupInstance(instance: JET_INSTANCE): Int

public expect fun JetStopService(): Int

public expect fun JetStopServiceInstance(instance: JET_INSTANCE): Int

public expect fun JetStopServiceInstance2(instance: JET_INSTANCE, grbit: UInt): Int

public expect fun JetTerm(instance: JET_INSTANCE): Int

public expect fun JetTerm2(instance: JET_INSTANCE, grbit: UInt): Int

public expect fun JetTruncateLog(): Int

public expect fun JetTruncateLogInstance(instance: JET_INSTANCE): Int

public expect fun JetUnregisterCallback(sesid: JET_SESID, tableid: JET_TABLEID, cbtyp: UInt, hcallbackid: JET_HANDLE): Int

public expect fun JetUpdate(sesid: JET_SESID, tableid: JET_TABLEID, pvbookmark: Long, cbbookmark: UInt, pcbactual: Long): Int

public expect fun JetUpdate2(sesid: JET_SESID, tableid: JET_TABLEID, pvbookmark: Long, cbbookmark: UInt, pcbactual: Long, grbit: UInt): Int
