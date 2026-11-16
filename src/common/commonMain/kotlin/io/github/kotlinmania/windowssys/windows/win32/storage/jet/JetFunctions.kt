package io.github.kotlinmania.windowssys.windows.win32.storage.jet

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetApiPtr
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetHandle
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetTableid

public expect fun jetAddColumnA(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr, pcolumndef: ConstPtr, pvdefault: ConstPtr, cbdefault: UInt, pcolumnid: MutPtr): Int

public expect fun jetAddColumnW(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr, pcolumndef: ConstPtr, pvdefault: ConstPtr, cbdefault: UInt, pcolumnid: MutPtr): Int

public expect fun jetAttachDatabase2A(sesid: JetSesid, szfilename: ConstPtr, cpgdatabasesizemax: UInt, grbit: UInt): Int

public expect fun jetAttachDatabase2W(sesid: JetSesid, szfilename: ConstPtr, cpgdatabasesizemax: UInt, grbit: UInt): Int

public expect fun jetAttachDatabaseA(sesid: JetSesid, szfilename: ConstPtr, grbit: UInt): Int

public expect fun jetAttachDatabaseW(sesid: JetSesid, szfilename: ConstPtr, grbit: UInt): Int

public expect fun jetBackupA(szbackuppath: ConstPtr, grbit: UInt, pfnstatus: JetPfnstatus): Int

public expect fun jetBackupInstanceA(instance: JetInstance, szbackuppath: ConstPtr, grbit: UInt, pfnstatus: JetPfnstatus): Int

public expect fun jetBackupInstanceW(instance: JetInstance, szbackuppath: ConstPtr, grbit: UInt, pfnstatus: JetPfnstatus): Int

public expect fun jetBackupW(szbackuppath: ConstPtr, grbit: UInt, pfnstatus: JetPfnstatus): Int

public expect fun jetBeginExternalBackup(grbit: UInt): Int

public expect fun jetBeginExternalBackupInstance(instance: JetInstance, grbit: UInt): Int

public expect fun jetBeginSessionA(instance: JetInstance, psesid: MutPtr, szusername: ConstPtr, szpassword: ConstPtr): Int

public expect fun jetBeginSessionW(instance: JetInstance, psesid: MutPtr, szusername: ConstPtr, szpassword: ConstPtr): Int

public expect fun jetBeginTransaction(sesid: JetSesid): Int

public expect fun jetBeginTransaction2(sesid: JetSesid, grbit: UInt): Int

public expect fun jetBeginTransaction3(sesid: JetSesid, trxid: Long, grbit: UInt): Int

public expect fun jetCloseDatabase(sesid: JetSesid, dbid: UInt, grbit: UInt): Int

public expect fun jetCloseFile(hffile: JetHandle): Int

public expect fun jetCloseFileInstance(instance: JetInstance, hffile: JetHandle): Int

public expect fun jetCloseTable(sesid: JetSesid, tableid: JetTableid): Int

public expect fun jetCommitTransaction(sesid: JetSesid, grbit: UInt): Int

public expect fun jetCommitTransaction2(sesid: JetSesid, grbit: UInt, cmsecdurablecommit: UInt, pcommitid: MutPtr): Int

public expect fun jetCompactA(sesid: JetSesid, szdatabasesrc: ConstPtr, szdatabasedest: ConstPtr, pfnstatus: JetPfnstatus, pconvert: ConstPtr, grbit: UInt): Int

public expect fun jetCompactW(sesid: JetSesid, szdatabasesrc: ConstPtr, szdatabasedest: ConstPtr, pfnstatus: JetPfnstatus, pconvert: ConstPtr, grbit: UInt): Int

public expect fun jetComputeStats(sesid: JetSesid, tableid: JetTableid): Int

public expect fun jetConfigureProcessForCrashDump(grbit: UInt): Int

public expect fun jetCreateDatabase2A(sesid: JetSesid, szfilename: ConstPtr, cpgdatabasesizemax: UInt, pdbid: MutPtr, grbit: UInt): Int

public expect fun jetCreateDatabase2W(sesid: JetSesid, szfilename: ConstPtr, cpgdatabasesizemax: UInt, pdbid: MutPtr, grbit: UInt): Int

public expect fun jetCreateDatabaseA(sesid: JetSesid, szfilename: ConstPtr, szconnect: ConstPtr, pdbid: MutPtr, grbit: UInt): Int

public expect fun jetCreateDatabaseW(sesid: JetSesid, szfilename: ConstPtr, szconnect: ConstPtr, pdbid: MutPtr, grbit: UInt): Int

public expect fun jetCreateIndex2A(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr, cindexcreate: UInt): Int

public expect fun jetCreateIndex2W(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr, cindexcreate: UInt): Int

public expect fun jetCreateIndex3A(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr, cindexcreate: UInt): Int

public expect fun jetCreateIndex3W(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr, cindexcreate: UInt): Int

public expect fun jetCreateIndex4A(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr, cindexcreate: UInt): Int

public expect fun jetCreateIndex4W(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr, cindexcreate: UInt): Int

public expect fun jetCreateIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, grbit: UInt, szkey: Pcstr, cbkey: UInt, ldensity: UInt): Int

public expect fun jetCreateIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, grbit: UInt, szkey: Pcwstr, cbkey: UInt, ldensity: UInt): Int

public expect fun jetCreateInstance2A(pinstance: MutPtr, szinstancename: ConstPtr, szdisplayname: ConstPtr, grbit: UInt): Int

public expect fun jetCreateInstance2W(pinstance: MutPtr, szinstancename: ConstPtr, szdisplayname: ConstPtr, grbit: UInt): Int

public expect fun jetCreateInstanceA(pinstance: MutPtr, szinstancename: ConstPtr): Int

public expect fun jetCreateInstanceW(pinstance: MutPtr, szinstancename: ConstPtr): Int

public expect fun jetCreateTableA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, lpages: UInt, ldensity: UInt, ptableid: MutPtr): Int

public expect fun jetCreateTableColumnIndex2A(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr): Int

public expect fun jetCreateTableColumnIndex2W(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr): Int

public expect fun jetCreateTableColumnIndex3A(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr): Int

public expect fun jetCreateTableColumnIndex3W(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr): Int

public expect fun jetCreateTableColumnIndex4A(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr): Int

public expect fun jetCreateTableColumnIndex4W(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr): Int

public expect fun jetCreateTableColumnIndexA(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr): Int

public expect fun jetCreateTableColumnIndexW(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr): Int

public expect fun jetCreateTableW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, lpages: UInt, ldensity: UInt, ptableid: MutPtr): Int

public expect fun jetDefragment2A(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, pcpasses: MutPtr, pcseconds: MutPtr, callback: JetCallback, grbit: UInt): Int

public expect fun jetDefragment2W(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, pcpasses: MutPtr, pcseconds: MutPtr, callback: JetCallback, grbit: UInt): Int

public expect fun jetDefragment3A(sesid: JetSesid, szdatabasename: ConstPtr, sztablename: ConstPtr, pcpasses: MutPtr, pcseconds: MutPtr, callback: JetCallback, pvcontext: ConstPtr, grbit: UInt): Int

public expect fun jetDefragment3W(sesid: JetSesid, szdatabasename: ConstPtr, sztablename: ConstPtr, pcpasses: MutPtr, pcseconds: MutPtr, callback: JetCallback, pvcontext: ConstPtr, grbit: UInt): Int

public expect fun jetDefragmentA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, pcpasses: MutPtr, pcseconds: MutPtr, grbit: UInt): Int

public expect fun jetDefragmentW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, pcpasses: MutPtr, pcseconds: MutPtr, grbit: UInt): Int

public expect fun jetDelete(sesid: JetSesid, tableid: JetTableid): Int

public expect fun jetDeleteColumn2A(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr, grbit: UInt): Int

public expect fun jetDeleteColumn2W(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr, grbit: UInt): Int

public expect fun jetDeleteColumnA(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr): Int

public expect fun jetDeleteColumnW(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr): Int

public expect fun jetDeleteIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr): Int

public expect fun jetDeleteIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr): Int

public expect fun jetDeleteTableA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr): Int

public expect fun jetDeleteTableW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr): Int

public expect fun jetDetachDatabase2A(sesid: JetSesid, szfilename: ConstPtr, grbit: UInt): Int

public expect fun jetDetachDatabase2W(sesid: JetSesid, szfilename: ConstPtr, grbit: UInt): Int

public expect fun jetDetachDatabaseA(sesid: JetSesid, szfilename: ConstPtr): Int

public expect fun jetDetachDatabaseW(sesid: JetSesid, szfilename: ConstPtr): Int

public expect fun jetDupCursor(sesid: JetSesid, tableid: JetTableid, ptableid: MutPtr, grbit: UInt): Int

public expect fun jetDupSession(sesid: JetSesid, psesid: MutPtr): Int

public expect fun jetEnableMultiInstanceA(psetsysparam: ConstPtr, csetsysparam: UInt, pcsetsucceed: MutPtr): Int

public expect fun jetEnableMultiInstanceW(psetsysparam: ConstPtr, csetsysparam: UInt, pcsetsucceed: MutPtr): Int

public expect fun jetEndExternalBackup(): Int

public expect fun jetEndExternalBackupInstance(instance: JetInstance): Int

public expect fun jetEndExternalBackupInstance2(instance: JetInstance, grbit: UInt): Int

public expect fun jetEndSession(sesid: JetSesid, grbit: UInt): Int

public expect fun jetEnumerateColumns(sesid: JetSesid, tableid: JetTableid, cenumcolumnid: UInt, rgenumcolumnid: ConstPtr, pcenumcolumn: MutPtr, prgenumcolumn: MutPtr, pfnrealloc: JetPfnrealloc, pvrealloccontext: ConstPtr, cbdatamost: UInt, grbit: UInt): Int

public expect fun jetEscrowUpdate(sesid: JetSesid, tableid: JetTableid, columnid: UInt, pv: ConstPtr, cbmax: UInt, pvold: MutPtr, cboldmax: UInt, pcboldactual: MutPtr, grbit: UInt): Int

public expect fun jetExternalRestore2A(szcheckpointfilepath: ConstPtr, szlogpath: ConstPtr, rgrstmap: ConstPtr, crstfilemap: Int, szbackuplogpath: ConstPtr, ploginfo: MutPtr, sztargetinstancename: ConstPtr, sztargetinstancelogpath: ConstPtr, sztargetinstancecheckpointpath: ConstPtr, pfn: JetPfnstatus): Int

public expect fun jetExternalRestore2W(szcheckpointfilepath: ConstPtr, szlogpath: ConstPtr, rgrstmap: ConstPtr, crstfilemap: Int, szbackuplogpath: ConstPtr, ploginfo: MutPtr, sztargetinstancename: ConstPtr, sztargetinstancelogpath: ConstPtr, sztargetinstancecheckpointpath: ConstPtr, pfn: JetPfnstatus): Int

public expect fun jetExternalRestoreA(szcheckpointfilepath: ConstPtr, szlogpath: ConstPtr, rgrstmap: ConstPtr, crstfilemap: Int, szbackuplogpath: ConstPtr, genlow: Int, genhigh: Int, pfn: JetPfnstatus): Int

public expect fun jetExternalRestoreW(szcheckpointfilepath: ConstPtr, szlogpath: ConstPtr, rgrstmap: ConstPtr, crstfilemap: Int, szbackuplogpath: ConstPtr, genlow: Int, genhigh: Int, pfn: JetPfnstatus): Int

public expect fun jetFreeBuffer(pbbuf: Pcstr): Int

public expect fun jetGetAttachInfoA(szzdatabases: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int

public expect fun jetGetAttachInfoInstanceA(instance: JetInstance, szzdatabases: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int

public expect fun jetGetAttachInfoInstanceW(instance: JetInstance, szzdatabases: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int

public expect fun jetGetAttachInfoW(wszzdatabases: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int

public expect fun jetGetBookmark(sesid: JetSesid, tableid: JetTableid, pvbookmark: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int

public expect fun jetGetColumnInfoA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, pcolumnnameorid: ConstPtr, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int

public expect fun jetGetColumnInfoW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, pwcolumnnameorid: ConstPtr, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int

public expect fun jetGetCurrentIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: MutPtr, cbindexname: UInt): Int

public expect fun jetGetCurrentIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: MutPtr, cbindexname: UInt): Int

public expect fun jetGetCursorInfo(sesid: JetSesid, tableid: JetTableid, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int

public expect fun jetGetDatabaseFileInfoA(szdatabasename: ConstPtr, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int

public expect fun jetGetDatabaseFileInfoW(szdatabasename: ConstPtr, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int

public expect fun jetGetDatabaseInfoA(sesid: JetSesid, dbid: UInt, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int

public expect fun jetGetDatabaseInfoW(sesid: JetSesid, dbid: UInt, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int

public expect fun jetGetErrorInfoW(pvcontext: ConstPtr, pvresult: MutPtr, cbmax: UInt, infolevel: UInt, grbit: UInt): Int

public expect fun jetGetIndexInfoA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, szindexname: ConstPtr, pvresult: MutPtr, cbresult: UInt, infolevel: UInt): Int

public expect fun jetGetIndexInfoW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, szindexname: ConstPtr, pvresult: MutPtr, cbresult: UInt, infolevel: UInt): Int

public expect fun jetGetInstanceInfoA(pcinstanceinfo: MutPtr, painstanceinfo: MutPtr): Int

public expect fun jetGetInstanceInfoW(pcinstanceinfo: MutPtr, painstanceinfo: MutPtr): Int

public expect fun jetGetInstanceMiscInfo(instance: JetInstance, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int

public expect fun jetGetLS(sesid: JetSesid, tableid: JetTableid, pls: MutPtr, grbit: UInt): Int

public expect fun jetGetLock(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int

public expect fun jetGetLogInfoA(szzlogs: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int

public expect fun jetGetLogInfoInstance2A(instance: JetInstance, szzlogs: MutPtr, cbmax: UInt, pcbactual: MutPtr, ploginfo: MutPtr): Int

public expect fun jetGetLogInfoInstance2W(instance: JetInstance, wszzlogs: MutPtr, cbmax: UInt, pcbactual: MutPtr, ploginfo: MutPtr): Int

public expect fun jetGetLogInfoInstanceA(instance: JetInstance, szzlogs: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int

public expect fun jetGetLogInfoInstanceW(instance: JetInstance, wszzlogs: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int

public expect fun jetGetLogInfoW(szzlogs: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int

public expect fun jetGetObjectInfoA(sesid: JetSesid, dbid: UInt, objtyp: UInt, szcontainername: ConstPtr, szobjectname: ConstPtr, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int

public expect fun jetGetObjectInfoW(sesid: JetSesid, dbid: UInt, objtyp: UInt, szcontainername: ConstPtr, szobjectname: ConstPtr, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int

public expect fun jetGetRecordPosition(sesid: JetSesid, tableid: JetTableid, precpos: MutPtr, cbrecpos: UInt): Int

public expect fun jetGetRecordSize(sesid: JetSesid, tableid: JetTableid, precsize: MutPtr, grbit: UInt): Int

public expect fun jetGetRecordSize2(sesid: JetSesid, tableid: JetTableid, precsize: MutPtr, grbit: UInt): Int

public expect fun jetGetSecondaryIndexBookmark(sesid: JetSesid, tableid: JetTableid, pvsecondarykey: MutPtr, cbsecondarykeymax: UInt, pcbsecondarykeyactual: MutPtr, pvprimarybookmark: MutPtr, cbprimarybookmarkmax: UInt, pcbprimarybookmarkactual: MutPtr, grbit: UInt): Int

public expect fun jetGetSessionParameter(sesid: JetSesid, sesparamid: UInt, pvparam: MutPtr, cbparammax: UInt, pcbparamactual: MutPtr): Int

public expect fun jetGetSystemParameterA(instance: JetInstance, sesid: JetSesid, paramid: UInt, plparam: MutPtr, szparam: MutPtr, cbmax: UInt): Int

public expect fun jetGetSystemParameterW(instance: JetInstance, sesid: JetSesid, paramid: UInt, plparam: MutPtr, szparam: MutPtr, cbmax: UInt): Int

public expect fun jetGetTableColumnInfoA(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int

public expect fun jetGetTableColumnInfoW(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int

public expect fun jetGetTableIndexInfoA(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, pvresult: MutPtr, cbresult: UInt, infolevel: UInt): Int

public expect fun jetGetTableIndexInfoW(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, pvresult: MutPtr, cbresult: UInt, infolevel: UInt): Int

public expect fun jetGetTableInfoA(sesid: JetSesid, tableid: JetTableid, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int

public expect fun jetGetTableInfoW(sesid: JetSesid, tableid: JetTableid, pvresult: MutPtr, cbmax: UInt, infolevel: UInt): Int

public expect fun jetGetThreadStats(pvresult: MutPtr, cbmax: UInt): Int

public expect fun jetGetTruncateLogInfoInstanceA(instance: JetInstance, szzlogs: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int

public expect fun jetGetTruncateLogInfoInstanceW(instance: JetInstance, wszzlogs: MutPtr, cbmax: UInt, pcbactual: MutPtr): Int

public expect fun jetGetVersion(sesid: JetSesid, pwversion: MutPtr): Int

public expect fun jetGotoBookmark(sesid: JetSesid, tableid: JetTableid, pvbookmark: ConstPtr, cbbookmark: UInt): Int

public expect fun jetGotoPosition(sesid: JetSesid, tableid: JetTableid, precpos: ConstPtr): Int

public expect fun jetGotoSecondaryIndexBookmark(sesid: JetSesid, tableid: JetTableid, pvsecondarykey: ConstPtr, cbsecondarykey: UInt, pvprimarybookmark: ConstPtr, cbprimarybookmark: UInt, grbit: UInt): Int

public expect fun jetGrowDatabase(sesid: JetSesid, dbid: UInt, cpg: UInt, pcpgreal: ConstPtr): Int

public expect fun jetIdle(sesid: JetSesid, grbit: UInt): Int

public expect fun jetIndexRecordCount(sesid: JetSesid, tableid: JetTableid, pcrec: MutPtr, crecmax: UInt): Int

public expect fun jetInit(pinstance: MutPtr): Int

public expect fun jetInit2(pinstance: MutPtr, grbit: UInt): Int

public expect fun jetInit3A(pinstance: MutPtr, prstinfo: ConstPtr, grbit: UInt): Int

public expect fun jetInit3W(pinstance: MutPtr, prstinfo: ConstPtr, grbit: UInt): Int

public expect fun jetIntersectIndexes(sesid: JetSesid, rgindexrange: ConstPtr, cindexrange: UInt, precordlist: MutPtr, grbit: UInt): Int

public expect fun jetMakeKey(sesid: JetSesid, tableid: JetTableid, pvdata: ConstPtr, cbdata: UInt, grbit: UInt): Int

public expect fun jetMove(sesid: JetSesid, tableid: JetTableid, crow: Int, grbit: UInt): Int

public expect fun jetOSSnapshotAbort(snapid: JetOssnapid, grbit: UInt): Int

public expect fun jetOSSnapshotEnd(snapid: JetOssnapid, grbit: UInt): Int

public expect fun jetOSSnapshotFreezeA(snapid: JetOssnapid, pcinstanceinfo: MutPtr, painstanceinfo: MutPtr, grbit: UInt): Int

public expect fun jetOSSnapshotFreezeW(snapid: JetOssnapid, pcinstanceinfo: MutPtr, painstanceinfo: MutPtr, grbit: UInt): Int

public expect fun jetOSSnapshotGetFreezeInfoA(snapid: JetOssnapid, pcinstanceinfo: MutPtr, painstanceinfo: MutPtr, grbit: UInt): Int

public expect fun jetOSSnapshotGetFreezeInfoW(snapid: JetOssnapid, pcinstanceinfo: MutPtr, painstanceinfo: MutPtr, grbit: UInt): Int

public expect fun jetOSSnapshotPrepare(psnapid: MutPtr, grbit: UInt): Int

public expect fun jetOSSnapshotPrepareInstance(snapid: JetOssnapid, instance: JetInstance, grbit: UInt): Int

public expect fun jetOSSnapshotThaw(snapid: JetOssnapid, grbit: UInt): Int

public expect fun jetOSSnapshotTruncateLog(snapid: JetOssnapid, grbit: UInt): Int

public expect fun jetOSSnapshotTruncateLogInstance(snapid: JetOssnapid, instance: JetInstance, grbit: UInt): Int

public expect fun jetOpenDatabaseA(sesid: JetSesid, szfilename: ConstPtr, szconnect: ConstPtr, pdbid: MutPtr, grbit: UInt): Int

public expect fun jetOpenDatabaseW(sesid: JetSesid, szfilename: ConstPtr, szconnect: ConstPtr, pdbid: MutPtr, grbit: UInt): Int

public expect fun jetOpenFileA(szfilename: ConstPtr, phffile: MutPtr, pulfilesizelow: MutPtr, pulfilesizehigh: MutPtr): Int

public expect fun jetOpenFileInstanceA(instance: JetInstance, szfilename: ConstPtr, phffile: MutPtr, pulfilesizelow: MutPtr, pulfilesizehigh: MutPtr): Int

public expect fun jetOpenFileInstanceW(instance: JetInstance, szfilename: ConstPtr, phffile: MutPtr, pulfilesizelow: MutPtr, pulfilesizehigh: MutPtr): Int

public expect fun jetOpenFileW(szfilename: ConstPtr, phffile: MutPtr, pulfilesizelow: MutPtr, pulfilesizehigh: MutPtr): Int

public expect fun jetOpenTableA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, pvparameters: ConstPtr, cbparameters: UInt, grbit: UInt, ptableid: MutPtr): Int

public expect fun jetOpenTableW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, pvparameters: ConstPtr, cbparameters: UInt, grbit: UInt, ptableid: MutPtr): Int

public expect fun jetOpenTempTable(sesid: JetSesid, prgcolumndef: ConstPtr, ccolumn: UInt, grbit: UInt, ptableid: MutPtr, prgcolumnid: MutPtr): Int

public expect fun jetOpenTempTable2(sesid: JetSesid, prgcolumndef: ConstPtr, ccolumn: UInt, lcid: UInt, grbit: UInt, ptableid: MutPtr, prgcolumnid: MutPtr): Int

public expect fun jetOpenTempTable3(sesid: JetSesid, prgcolumndef: ConstPtr, ccolumn: UInt, pidxunicode: ConstPtr, grbit: UInt, ptableid: MutPtr, prgcolumnid: MutPtr): Int

public expect fun jetOpenTemporaryTable(sesid: JetSesid, popentemporarytable: ConstPtr): Int

public expect fun jetOpenTemporaryTable2(sesid: JetSesid, popentemporarytable: ConstPtr): Int

public expect fun jetPrepareUpdate(sesid: JetSesid, tableid: JetTableid, prep: UInt): Int

public expect fun jetPrereadIndexRanges(sesid: JetSesid, tableid: JetTableid, rgindexranges: ConstPtr, cindexranges: UInt, pcrangespreread: MutPtr, rgcolumnidpreread: ConstPtr, ccolumnidpreread: UInt, grbit: UInt): Int

public expect fun jetPrereadKeys(sesid: JetSesid, tableid: JetTableid, rgpvkeys: ConstPtr, rgcbkeys: ConstPtr, ckeys: Int, pckeyspreread: MutPtr, grbit: UInt): Int

public expect fun jetReadFile(hffile: JetHandle, pv: MutPtr, cb: UInt, pcbactual: MutPtr): Int

public expect fun jetReadFileInstance(instance: JetInstance, hffile: JetHandle, pv: MutPtr, cb: UInt, pcbactual: MutPtr): Int

public expect fun jetRegisterCallback(sesid: JetSesid, tableid: JetTableid, cbtyp: UInt, pcallback: JetCallback, pvcontext: ConstPtr, phcallbackid: ConstPtr): Int

public expect fun jetRenameColumnA(sesid: JetSesid, tableid: JetTableid, szname: ConstPtr, sznamenew: ConstPtr, grbit: UInt): Int

public expect fun jetRenameColumnW(sesid: JetSesid, tableid: JetTableid, szname: ConstPtr, sznamenew: ConstPtr, grbit: UInt): Int

public expect fun jetRenameTableA(sesid: JetSesid, dbid: UInt, szname: ConstPtr, sznamenew: ConstPtr): Int

public expect fun jetRenameTableW(sesid: JetSesid, dbid: UInt, szname: ConstPtr, sznamenew: ConstPtr): Int

public expect fun jetResetSessionContext(sesid: JetSesid): Int

public expect fun jetResetTableSequential(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int

public expect fun jetResizeDatabase(sesid: JetSesid, dbid: UInt, cpgtarget: UInt, pcpgactual: MutPtr, grbit: UInt): Int

public expect fun jetRestore2A(sz: ConstPtr, szdest: ConstPtr, pfn: JetPfnstatus): Int

public expect fun jetRestore2W(sz: ConstPtr, szdest: ConstPtr, pfn: JetPfnstatus): Int

public expect fun jetRestoreA(szsource: ConstPtr, pfn: JetPfnstatus): Int

public expect fun jetRestoreInstanceA(instance: JetInstance, sz: ConstPtr, szdest: ConstPtr, pfn: JetPfnstatus): Int

public expect fun jetRestoreInstanceW(instance: JetInstance, sz: ConstPtr, szdest: ConstPtr, pfn: JetPfnstatus): Int

public expect fun jetRestoreW(szsource: ConstPtr, pfn: JetPfnstatus): Int

public expect fun jetRetrieveColumn(sesid: JetSesid, tableid: JetTableid, columnid: UInt, pvdata: MutPtr, cbdata: UInt, pcbactual: MutPtr, grbit: UInt, pretinfo: MutPtr): Int

public expect fun jetRetrieveColumns(sesid: JetSesid, tableid: JetTableid, pretrievecolumn: MutPtr, cretrievecolumn: UInt): Int

public expect fun jetRetrieveKey(sesid: JetSesid, tableid: JetTableid, pvkey: MutPtr, cbmax: UInt, pcbactual: MutPtr, grbit: UInt): Int

public expect fun jetRollback(sesid: JetSesid, grbit: UInt): Int

public expect fun jetSeek(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int

public expect fun jetSetColumn(sesid: JetSesid, tableid: JetTableid, columnid: UInt, pvdata: ConstPtr, cbdata: UInt, grbit: UInt, psetinfo: ConstPtr): Int

public expect fun jetSetColumnDefaultValueA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, szcolumnname: ConstPtr, pvdata: ConstPtr, cbdata: UInt, grbit: UInt): Int

public expect fun jetSetColumnDefaultValueW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr, szcolumnname: ConstPtr, pvdata: ConstPtr, cbdata: UInt, grbit: UInt): Int

public expect fun jetSetColumns(sesid: JetSesid, tableid: JetTableid, psetcolumn: ConstPtr, csetcolumn: UInt): Int

public expect fun jetSetCurrentIndex2A(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, grbit: UInt): Int

public expect fun jetSetCurrentIndex2W(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, grbit: UInt): Int

public expect fun jetSetCurrentIndex3A(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, grbit: UInt, itagsequence: UInt): Int

public expect fun jetSetCurrentIndex3W(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, grbit: UInt, itagsequence: UInt): Int

public expect fun jetSetCurrentIndex4A(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, pindexid: ConstPtr, grbit: UInt, itagsequence: UInt): Int

public expect fun jetSetCurrentIndex4W(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr, pindexid: ConstPtr, grbit: UInt, itagsequence: UInt): Int

public expect fun jetSetCurrentIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr): Int

public expect fun jetSetCurrentIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr): Int

public expect fun jetSetCursorFilter(sesid: JetSesid, tableid: JetTableid, rgcolumnfilters: ConstPtr, ccolumnfilters: UInt, grbit: UInt): Int

public expect fun jetSetDatabaseSizeA(sesid: JetSesid, szdatabasename: ConstPtr, cpg: UInt, pcpgreal: MutPtr): Int

public expect fun jetSetDatabaseSizeW(sesid: JetSesid, szdatabasename: ConstPtr, cpg: UInt, pcpgreal: MutPtr): Int

public expect fun jetSetIndexRange(sesid: JetSesid, tableidsrc: JetTableid, grbit: UInt): Int

public expect fun jetSetLS(sesid: JetSesid, tableid: JetTableid, ls: JetLs, grbit: UInt): Int

public expect fun jetSetSessionContext(sesid: JetSesid, ulcontext: JetApiPtr): Int

public expect fun jetSetSessionParameter(sesid: JetSesid, sesparamid: UInt, pvparam: ConstPtr, cbparam: UInt): Int

public expect fun jetSetSystemParameterA(pinstance: MutPtr, sesid: JetSesid, paramid: UInt, lparam: JetApiPtr, szparam: ConstPtr): Int

public expect fun jetSetSystemParameterW(pinstance: MutPtr, sesid: JetSesid, paramid: UInt, lparam: JetApiPtr, szparam: ConstPtr): Int

public expect fun jetSetTableSequential(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int

public expect fun jetStopBackup(): Int

public expect fun jetStopBackupInstance(instance: JetInstance): Int

public expect fun jetStopService(): Int

public expect fun jetStopServiceInstance(instance: JetInstance): Int

public expect fun jetStopServiceInstance2(instance: JetInstance, grbit: UInt): Int

public expect fun jetTerm(instance: JetInstance): Int

public expect fun jetTerm2(instance: JetInstance, grbit: UInt): Int

public expect fun jetTruncateLog(): Int

public expect fun jetTruncateLogInstance(instance: JetInstance): Int

public expect fun jetUnregisterCallback(sesid: JetSesid, tableid: JetTableid, cbtyp: UInt, hcallbackid: JetHandle): Int

public expect fun jetUpdate(sesid: JetSesid, tableid: JetTableid, pvbookmark: MutPtr, cbbookmark: UInt, pcbactual: MutPtr): Int

public expect fun jetUpdate2(sesid: JetSesid, tableid: JetTableid, pvbookmark: MutPtr, cbbookmark: UInt, pcbactual: MutPtr, grbit: UInt): Int
