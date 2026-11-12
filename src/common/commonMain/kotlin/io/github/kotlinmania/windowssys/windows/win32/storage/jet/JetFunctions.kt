package io.github.kotlinmania.windowssys.windows.win32.storage.jet

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetApiPtr
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetHandle
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetTableid

public expect fun jetAddColumnA(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr<Byte>, pcolumndef: ConstPtr<JetColumndef>, pvdefault: ConstPtr<CVoid>, cbdefault: UInt, pcolumnid: MutPtr<UInt>): Int

public expect fun jetAddColumnW(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr<UShort>, pcolumndef: ConstPtr<JetColumndef>, pvdefault: ConstPtr<CVoid>, cbdefault: UInt, pcolumnid: MutPtr<UInt>): Int

public expect fun jetAttachDatabase2A(sesid: JetSesid, szfilename: ConstPtr<Byte>, cpgdatabasesizemax: UInt, grbit: UInt): Int

public expect fun jetAttachDatabase2W(sesid: JetSesid, szfilename: ConstPtr<UShort>, cpgdatabasesizemax: UInt, grbit: UInt): Int

public expect fun jetAttachDatabaseA(sesid: JetSesid, szfilename: ConstPtr<Byte>, grbit: UInt): Int

public expect fun jetAttachDatabaseW(sesid: JetSesid, szfilename: ConstPtr<UShort>, grbit: UInt): Int

public expect fun jetBackupA(szbackuppath: ConstPtr<Byte>, grbit: UInt, pfnstatus: JetPfnstatus): Int

public expect fun jetBackupInstanceA(instance: JetInstance, szbackuppath: ConstPtr<Byte>, grbit: UInt, pfnstatus: JetPfnstatus): Int

public expect fun jetBackupInstanceW(instance: JetInstance, szbackuppath: ConstPtr<UShort>, grbit: UInt, pfnstatus: JetPfnstatus): Int

public expect fun jetBackupW(szbackuppath: ConstPtr<UShort>, grbit: UInt, pfnstatus: JetPfnstatus): Int

public expect fun jetBeginExternalBackup(grbit: UInt): Int

public expect fun jetBeginExternalBackupInstance(instance: JetInstance, grbit: UInt): Int

public expect fun jetBeginSessionA(instance: JetInstance, psesid: MutPtr<JetSesid>, szusername: ConstPtr<Byte>, szpassword: ConstPtr<Byte>): Int

public expect fun jetBeginSessionW(instance: JetInstance, psesid: MutPtr<JetSesid>, szusername: ConstPtr<UShort>, szpassword: ConstPtr<UShort>): Int

public expect fun jetBeginTransaction(sesid: JetSesid): Int

public expect fun jetBeginTransaction2(sesid: JetSesid, grbit: UInt): Int

public expect fun jetBeginTransaction3(sesid: JetSesid, trxid: Long, grbit: UInt): Int

public expect fun jetCloseDatabase(sesid: JetSesid, dbid: UInt, grbit: UInt): Int

public expect fun jetCloseFile(hffile: JetHandle): Int

public expect fun jetCloseFileInstance(instance: JetInstance, hffile: JetHandle): Int

public expect fun jetCloseTable(sesid: JetSesid, tableid: JetTableid): Int

public expect fun jetCommitTransaction(sesid: JetSesid, grbit: UInt): Int

public expect fun jetCommitTransaction2(sesid: JetSesid, grbit: UInt, cmsecdurablecommit: UInt, pcommitid: MutPtr<JetCommitId>): Int

public expect fun jetCompactA(sesid: JetSesid, szdatabasesrc: ConstPtr<Byte>, szdatabasedest: ConstPtr<Byte>, pfnstatus: JetPfnstatus, pconvert: ConstPtr<JetConvertA>, grbit: UInt): Int

public expect fun jetCompactW(sesid: JetSesid, szdatabasesrc: ConstPtr<UShort>, szdatabasedest: ConstPtr<UShort>, pfnstatus: JetPfnstatus, pconvert: ConstPtr<JetConvertW>, grbit: UInt): Int

public expect fun jetComputeStats(sesid: JetSesid, tableid: JetTableid): Int

public expect fun jetConfigureProcessForCrashDump(grbit: UInt): Int

public expect fun jetCreateDatabase2A(sesid: JetSesid, szfilename: ConstPtr<Byte>, cpgdatabasesizemax: UInt, pdbid: MutPtr<UInt>, grbit: UInt): Int

public expect fun jetCreateDatabase2W(sesid: JetSesid, szfilename: ConstPtr<UShort>, cpgdatabasesizemax: UInt, pdbid: MutPtr<UInt>, grbit: UInt): Int

public expect fun jetCreateDatabaseA(sesid: JetSesid, szfilename: ConstPtr<Byte>, szconnect: ConstPtr<Byte>, pdbid: MutPtr<UInt>, grbit: UInt): Int

public expect fun jetCreateDatabaseW(sesid: JetSesid, szfilename: ConstPtr<UShort>, szconnect: ConstPtr<UShort>, pdbid: MutPtr<UInt>, grbit: UInt): Int

public expect fun jetCreateIndex2A(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr<JetIndexcreateA>, cindexcreate: UInt): Int

public expect fun jetCreateIndex2W(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr<JetIndexcreateW>, cindexcreate: UInt): Int

public expect fun jetCreateIndex3A(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr<JetIndexcreate2A>, cindexcreate: UInt): Int

public expect fun jetCreateIndex3W(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr<JetIndexcreate2W>, cindexcreate: UInt): Int

public expect fun jetCreateIndex4A(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr<JetIndexcreate3A>, cindexcreate: UInt): Int

public expect fun jetCreateIndex4W(sesid: JetSesid, tableid: JetTableid, pindexcreate: ConstPtr<JetIndexcreate3W>, cindexcreate: UInt): Int

public expect fun jetCreateIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<Byte>, grbit: UInt, szkey: Pcstr, cbkey: UInt, ldensity: UInt): Int

public expect fun jetCreateIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<UShort>, grbit: UInt, szkey: Pcwstr, cbkey: UInt, ldensity: UInt): Int

public expect fun jetCreateInstance2A(pinstance: MutPtr<JetInstance>, szinstancename: ConstPtr<Byte>, szdisplayname: ConstPtr<Byte>, grbit: UInt): Int

public expect fun jetCreateInstance2W(pinstance: MutPtr<JetInstance>, szinstancename: ConstPtr<UShort>, szdisplayname: ConstPtr<UShort>, grbit: UInt): Int

public expect fun jetCreateInstanceA(pinstance: MutPtr<JetInstance>, szinstancename: ConstPtr<Byte>): Int

public expect fun jetCreateInstanceW(pinstance: MutPtr<JetInstance>, szinstancename: ConstPtr<UShort>): Int

public expect fun jetCreateTableA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<Byte>, lpages: UInt, ldensity: UInt, ptableid: MutPtr<JetTableid>): Int

public expect fun jetCreateTableColumnIndex2A(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr<JetTablecreate2A>): Int

public expect fun jetCreateTableColumnIndex2W(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr<JetTablecreate2W>): Int

public expect fun jetCreateTableColumnIndex3A(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr<JetTablecreate3A>): Int

public expect fun jetCreateTableColumnIndex3W(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr<JetTablecreate3W>): Int

public expect fun jetCreateTableColumnIndex4A(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr<JetTablecreate4A>): Int

public expect fun jetCreateTableColumnIndex4W(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr<JetTablecreate4W>): Int

public expect fun jetCreateTableColumnIndexA(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr<JetTablecreateA>): Int

public expect fun jetCreateTableColumnIndexW(sesid: JetSesid, dbid: UInt, ptablecreate: MutPtr<JetTablecreateW>): Int

public expect fun jetCreateTableW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<UShort>, lpages: UInt, ldensity: UInt, ptableid: MutPtr<JetTableid>): Int

public expect fun jetDefragment2A(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<Byte>, pcpasses: MutPtr<UInt>, pcseconds: MutPtr<UInt>, callback: JetCallback, grbit: UInt): Int

public expect fun jetDefragment2W(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<UShort>, pcpasses: MutPtr<UInt>, pcseconds: MutPtr<UInt>, callback: JetCallback, grbit: UInt): Int

public expect fun jetDefragment3A(sesid: JetSesid, szdatabasename: ConstPtr<Byte>, sztablename: ConstPtr<Byte>, pcpasses: MutPtr<UInt>, pcseconds: MutPtr<UInt>, callback: JetCallback, pvcontext: ConstPtr<CVoid>, grbit: UInt): Int

public expect fun jetDefragment3W(sesid: JetSesid, szdatabasename: ConstPtr<UShort>, sztablename: ConstPtr<UShort>, pcpasses: MutPtr<UInt>, pcseconds: MutPtr<UInt>, callback: JetCallback, pvcontext: ConstPtr<CVoid>, grbit: UInt): Int

public expect fun jetDefragmentA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<Byte>, pcpasses: MutPtr<UInt>, pcseconds: MutPtr<UInt>, grbit: UInt): Int

public expect fun jetDefragmentW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<UShort>, pcpasses: MutPtr<UInt>, pcseconds: MutPtr<UInt>, grbit: UInt): Int

public expect fun jetDelete(sesid: JetSesid, tableid: JetTableid): Int

public expect fun jetDeleteColumn2A(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr<Byte>, grbit: UInt): Int

public expect fun jetDeleteColumn2W(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr<UShort>, grbit: UInt): Int

public expect fun jetDeleteColumnA(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr<Byte>): Int

public expect fun jetDeleteColumnW(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr<UShort>): Int

public expect fun jetDeleteIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<Byte>): Int

public expect fun jetDeleteIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<UShort>): Int

public expect fun jetDeleteTableA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<Byte>): Int

public expect fun jetDeleteTableW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<UShort>): Int

public expect fun jetDetachDatabase2A(sesid: JetSesid, szfilename: ConstPtr<Byte>, grbit: UInt): Int

public expect fun jetDetachDatabase2W(sesid: JetSesid, szfilename: ConstPtr<UShort>, grbit: UInt): Int

public expect fun jetDetachDatabaseA(sesid: JetSesid, szfilename: ConstPtr<Byte>): Int

public expect fun jetDetachDatabaseW(sesid: JetSesid, szfilename: ConstPtr<UShort>): Int

public expect fun jetDupCursor(sesid: JetSesid, tableid: JetTableid, ptableid: MutPtr<JetTableid>, grbit: UInt): Int

public expect fun jetDupSession(sesid: JetSesid, psesid: MutPtr<JetSesid>): Int

public expect fun jetEnableMultiInstanceA(psetsysparam: ConstPtr<JetSetsysparamA>, csetsysparam: UInt, pcsetsucceed: MutPtr<UInt>): Int

public expect fun jetEnableMultiInstanceW(psetsysparam: ConstPtr<JetSetsysparamW>, csetsysparam: UInt, pcsetsucceed: MutPtr<UInt>): Int

public expect fun jetEndExternalBackup(): Int

public expect fun jetEndExternalBackupInstance(instance: JetInstance): Int

public expect fun jetEndExternalBackupInstance2(instance: JetInstance, grbit: UInt): Int

public expect fun jetEndSession(sesid: JetSesid, grbit: UInt): Int

public expect fun jetEnumerateColumns(sesid: JetSesid, tableid: JetTableid, cenumcolumnid: UInt, rgenumcolumnid: ConstPtr<JetEnumcolumnid>, pcenumcolumn: MutPtr<UInt>, prgenumcolumn: MutPtr<MutPtr<JetEnumcolumn>>, pfnrealloc: JetPfnrealloc, pvrealloccontext: ConstPtr<CVoid>, cbdatamost: UInt, grbit: UInt): Int

public expect fun jetEscrowUpdate(sesid: JetSesid, tableid: JetTableid, columnid: UInt, pv: ConstPtr<CVoid>, cbmax: UInt, pvold: MutPtr<CVoid>, cboldmax: UInt, pcboldactual: MutPtr<UInt>, grbit: UInt): Int

public expect fun jetExternalRestore2A(szcheckpointfilepath: ConstPtr<Byte>, szlogpath: ConstPtr<Byte>, rgrstmap: ConstPtr<JetRstmapA>, crstfilemap: Int, szbackuplogpath: ConstPtr<Byte>, ploginfo: MutPtr<JetLoginfoA>, sztargetinstancename: ConstPtr<Byte>, sztargetinstancelogpath: ConstPtr<Byte>, sztargetinstancecheckpointpath: ConstPtr<Byte>, pfn: JetPfnstatus): Int

public expect fun jetExternalRestore2W(szcheckpointfilepath: ConstPtr<UShort>, szlogpath: ConstPtr<UShort>, rgrstmap: ConstPtr<JetRstmapW>, crstfilemap: Int, szbackuplogpath: ConstPtr<UShort>, ploginfo: MutPtr<JetLoginfoW>, sztargetinstancename: ConstPtr<UShort>, sztargetinstancelogpath: ConstPtr<UShort>, sztargetinstancecheckpointpath: ConstPtr<UShort>, pfn: JetPfnstatus): Int

public expect fun jetExternalRestoreA(szcheckpointfilepath: ConstPtr<Byte>, szlogpath: ConstPtr<Byte>, rgrstmap: ConstPtr<JetRstmapA>, crstfilemap: Int, szbackuplogpath: ConstPtr<Byte>, genlow: Int, genhigh: Int, pfn: JetPfnstatus): Int

public expect fun jetExternalRestoreW(szcheckpointfilepath: ConstPtr<UShort>, szlogpath: ConstPtr<UShort>, rgrstmap: ConstPtr<JetRstmapW>, crstfilemap: Int, szbackuplogpath: ConstPtr<UShort>, genlow: Int, genhigh: Int, pfn: JetPfnstatus): Int

public expect fun jetFreeBuffer(pbbuf: Pcstr): Int

public expect fun jetGetAttachInfoA(szzdatabases: MutPtr<Byte>, cbmax: UInt, pcbactual: MutPtr<UInt>): Int

public expect fun jetGetAttachInfoInstanceA(instance: JetInstance, szzdatabases: MutPtr<Byte>, cbmax: UInt, pcbactual: MutPtr<UInt>): Int

public expect fun jetGetAttachInfoInstanceW(instance: JetInstance, szzdatabases: MutPtr<UShort>, cbmax: UInt, pcbactual: MutPtr<UInt>): Int

public expect fun jetGetAttachInfoW(wszzdatabases: MutPtr<UShort>, cbmax: UInt, pcbactual: MutPtr<UInt>): Int

public expect fun jetGetBookmark(sesid: JetSesid, tableid: JetTableid, pvbookmark: MutPtr<CVoid>, cbmax: UInt, pcbactual: MutPtr<UInt>): Int

public expect fun jetGetColumnInfoA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<Byte>, pcolumnnameorid: ConstPtr<Byte>, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int

public expect fun jetGetColumnInfoW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<UShort>, pwcolumnnameorid: ConstPtr<UShort>, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int

public expect fun jetGetCurrentIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: MutPtr<Byte>, cbindexname: UInt): Int

public expect fun jetGetCurrentIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: MutPtr<UShort>, cbindexname: UInt): Int

public expect fun jetGetCursorInfo(sesid: JetSesid, tableid: JetTableid, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int

public expect fun jetGetDatabaseFileInfoA(szdatabasename: ConstPtr<Byte>, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int

public expect fun jetGetDatabaseFileInfoW(szdatabasename: ConstPtr<UShort>, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int

public expect fun jetGetDatabaseInfoA(sesid: JetSesid, dbid: UInt, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int

public expect fun jetGetDatabaseInfoW(sesid: JetSesid, dbid: UInt, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int

public expect fun jetGetErrorInfoW(pvcontext: ConstPtr<CVoid>, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt, grbit: UInt): Int

public expect fun jetGetIndexInfoA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<Byte>, szindexname: ConstPtr<Byte>, pvresult: MutPtr<CVoid>, cbresult: UInt, infolevel: UInt): Int

public expect fun jetGetIndexInfoW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<UShort>, szindexname: ConstPtr<UShort>, pvresult: MutPtr<CVoid>, cbresult: UInt, infolevel: UInt): Int

public expect fun jetGetInstanceInfoA(pcinstanceinfo: MutPtr<UInt>, painstanceinfo: MutPtr<MutPtr<JetInstanceInfoA>>): Int

public expect fun jetGetInstanceInfoW(pcinstanceinfo: MutPtr<UInt>, painstanceinfo: MutPtr<MutPtr<JetInstanceInfoW>>): Int

public expect fun jetGetInstanceMiscInfo(instance: JetInstance, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int

public expect fun jetGetLS(sesid: JetSesid, tableid: JetTableid, pls: MutPtr<JetLs>, grbit: UInt): Int

public expect fun jetGetLock(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int

public expect fun jetGetLogInfoA(szzlogs: MutPtr<Byte>, cbmax: UInt, pcbactual: MutPtr<UInt>): Int

public expect fun jetGetLogInfoInstance2A(instance: JetInstance, szzlogs: MutPtr<Byte>, cbmax: UInt, pcbactual: MutPtr<UInt>, ploginfo: MutPtr<JetLoginfoA>): Int

public expect fun jetGetLogInfoInstance2W(instance: JetInstance, wszzlogs: MutPtr<UShort>, cbmax: UInt, pcbactual: MutPtr<UInt>, ploginfo: MutPtr<JetLoginfoW>): Int

public expect fun jetGetLogInfoInstanceA(instance: JetInstance, szzlogs: MutPtr<Byte>, cbmax: UInt, pcbactual: MutPtr<UInt>): Int

public expect fun jetGetLogInfoInstanceW(instance: JetInstance, wszzlogs: MutPtr<UShort>, cbmax: UInt, pcbactual: MutPtr<UInt>): Int

public expect fun jetGetLogInfoW(szzlogs: MutPtr<UShort>, cbmax: UInt, pcbactual: MutPtr<UInt>): Int

public expect fun jetGetObjectInfoA(sesid: JetSesid, dbid: UInt, objtyp: UInt, szcontainername: ConstPtr<Byte>, szobjectname: ConstPtr<Byte>, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int

public expect fun jetGetObjectInfoW(sesid: JetSesid, dbid: UInt, objtyp: UInt, szcontainername: ConstPtr<UShort>, szobjectname: ConstPtr<UShort>, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int

public expect fun jetGetRecordPosition(sesid: JetSesid, tableid: JetTableid, precpos: MutPtr<JetRecpos>, cbrecpos: UInt): Int

public expect fun jetGetRecordSize(sesid: JetSesid, tableid: JetTableid, precsize: MutPtr<JetRecsize>, grbit: UInt): Int

public expect fun jetGetRecordSize2(sesid: JetSesid, tableid: JetTableid, precsize: MutPtr<JetRecsize2>, grbit: UInt): Int

public expect fun jetGetSecondaryIndexBookmark(sesid: JetSesid, tableid: JetTableid, pvsecondarykey: MutPtr<CVoid>, cbsecondarykeymax: UInt, pcbsecondarykeyactual: MutPtr<UInt>, pvprimarybookmark: MutPtr<CVoid>, cbprimarybookmarkmax: UInt, pcbprimarybookmarkactual: MutPtr<UInt>, grbit: UInt): Int

public expect fun jetGetSessionParameter(sesid: JetSesid, sesparamid: UInt, pvparam: MutPtr<CVoid>, cbparammax: UInt, pcbparamactual: MutPtr<UInt>): Int

public expect fun jetGetSystemParameterA(instance: JetInstance, sesid: JetSesid, paramid: UInt, plparam: MutPtr<JetApiPtr>, szparam: MutPtr<Byte>, cbmax: UInt): Int

public expect fun jetGetSystemParameterW(instance: JetInstance, sesid: JetSesid, paramid: UInt, plparam: MutPtr<JetApiPtr>, szparam: MutPtr<UShort>, cbmax: UInt): Int

public expect fun jetGetTableColumnInfoA(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr<Byte>, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int

public expect fun jetGetTableColumnInfoW(sesid: JetSesid, tableid: JetTableid, szcolumnname: ConstPtr<UShort>, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int

public expect fun jetGetTableIndexInfoA(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<Byte>, pvresult: MutPtr<CVoid>, cbresult: UInt, infolevel: UInt): Int

public expect fun jetGetTableIndexInfoW(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<UShort>, pvresult: MutPtr<CVoid>, cbresult: UInt, infolevel: UInt): Int

public expect fun jetGetTableInfoA(sesid: JetSesid, tableid: JetTableid, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int

public expect fun jetGetTableInfoW(sesid: JetSesid, tableid: JetTableid, pvresult: MutPtr<CVoid>, cbmax: UInt, infolevel: UInt): Int

public expect fun jetGetThreadStats(pvresult: MutPtr<CVoid>, cbmax: UInt): Int

public expect fun jetGetTruncateLogInfoInstanceA(instance: JetInstance, szzlogs: MutPtr<Byte>, cbmax: UInt, pcbactual: MutPtr<UInt>): Int

public expect fun jetGetTruncateLogInfoInstanceW(instance: JetInstance, wszzlogs: MutPtr<UShort>, cbmax: UInt, pcbactual: MutPtr<UInt>): Int

public expect fun jetGetVersion(sesid: JetSesid, pwversion: MutPtr<UInt>): Int

public expect fun jetGotoBookmark(sesid: JetSesid, tableid: JetTableid, pvbookmark: ConstPtr<CVoid>, cbbookmark: UInt): Int

public expect fun jetGotoPosition(sesid: JetSesid, tableid: JetTableid, precpos: ConstPtr<JetRecpos>): Int

public expect fun jetGotoSecondaryIndexBookmark(sesid: JetSesid, tableid: JetTableid, pvsecondarykey: ConstPtr<CVoid>, cbsecondarykey: UInt, pvprimarybookmark: ConstPtr<CVoid>, cbprimarybookmark: UInt, grbit: UInt): Int

public expect fun jetGrowDatabase(sesid: JetSesid, dbid: UInt, cpg: UInt, pcpgreal: ConstPtr<UInt>): Int

public expect fun jetIdle(sesid: JetSesid, grbit: UInt): Int

public expect fun jetIndexRecordCount(sesid: JetSesid, tableid: JetTableid, pcrec: MutPtr<UInt>, crecmax: UInt): Int

public expect fun jetInit(pinstance: MutPtr<JetInstance>): Int

public expect fun jetInit2(pinstance: MutPtr<JetInstance>, grbit: UInt): Int

public expect fun jetInit3A(pinstance: MutPtr<JetInstance>, prstinfo: ConstPtr<JetRstinfoA>, grbit: UInt): Int

public expect fun jetInit3W(pinstance: MutPtr<JetInstance>, prstinfo: ConstPtr<JetRstinfoW>, grbit: UInt): Int

public expect fun jetIntersectIndexes(sesid: JetSesid, rgindexrange: ConstPtr<JetIndexrange>, cindexrange: UInt, precordlist: MutPtr<JetRecordlist>, grbit: UInt): Int

public expect fun jetMakeKey(sesid: JetSesid, tableid: JetTableid, pvdata: ConstPtr<CVoid>, cbdata: UInt, grbit: UInt): Int

public expect fun jetMove(sesid: JetSesid, tableid: JetTableid, crow: Int, grbit: UInt): Int

public expect fun jetOSSnapshotAbort(snapid: JetOssnapid, grbit: UInt): Int

public expect fun jetOSSnapshotEnd(snapid: JetOssnapid, grbit: UInt): Int

public expect fun jetOSSnapshotFreezeA(snapid: JetOssnapid, pcinstanceinfo: MutPtr<UInt>, painstanceinfo: MutPtr<MutPtr<JetInstanceInfoA>>, grbit: UInt): Int

public expect fun jetOSSnapshotFreezeW(snapid: JetOssnapid, pcinstanceinfo: MutPtr<UInt>, painstanceinfo: MutPtr<MutPtr<JetInstanceInfoW>>, grbit: UInt): Int

public expect fun jetOSSnapshotGetFreezeInfoA(snapid: JetOssnapid, pcinstanceinfo: MutPtr<UInt>, painstanceinfo: MutPtr<MutPtr<JetInstanceInfoA>>, grbit: UInt): Int

public expect fun jetOSSnapshotGetFreezeInfoW(snapid: JetOssnapid, pcinstanceinfo: MutPtr<UInt>, painstanceinfo: MutPtr<MutPtr<JetInstanceInfoW>>, grbit: UInt): Int

public expect fun jetOSSnapshotPrepare(psnapid: MutPtr<JetOssnapid>, grbit: UInt): Int

public expect fun jetOSSnapshotPrepareInstance(snapid: JetOssnapid, instance: JetInstance, grbit: UInt): Int

public expect fun jetOSSnapshotThaw(snapid: JetOssnapid, grbit: UInt): Int

public expect fun jetOSSnapshotTruncateLog(snapid: JetOssnapid, grbit: UInt): Int

public expect fun jetOSSnapshotTruncateLogInstance(snapid: JetOssnapid, instance: JetInstance, grbit: UInt): Int

public expect fun jetOpenDatabaseA(sesid: JetSesid, szfilename: ConstPtr<Byte>, szconnect: ConstPtr<Byte>, pdbid: MutPtr<UInt>, grbit: UInt): Int

public expect fun jetOpenDatabaseW(sesid: JetSesid, szfilename: ConstPtr<UShort>, szconnect: ConstPtr<UShort>, pdbid: MutPtr<UInt>, grbit: UInt): Int

public expect fun jetOpenFileA(szfilename: ConstPtr<Byte>, phffile: MutPtr<JetHandle>, pulfilesizelow: MutPtr<UInt>, pulfilesizehigh: MutPtr<UInt>): Int

public expect fun jetOpenFileInstanceA(instance: JetInstance, szfilename: ConstPtr<Byte>, phffile: MutPtr<JetHandle>, pulfilesizelow: MutPtr<UInt>, pulfilesizehigh: MutPtr<UInt>): Int

public expect fun jetOpenFileInstanceW(instance: JetInstance, szfilename: ConstPtr<UShort>, phffile: MutPtr<JetHandle>, pulfilesizelow: MutPtr<UInt>, pulfilesizehigh: MutPtr<UInt>): Int

public expect fun jetOpenFileW(szfilename: ConstPtr<UShort>, phffile: MutPtr<JetHandle>, pulfilesizelow: MutPtr<UInt>, pulfilesizehigh: MutPtr<UInt>): Int

public expect fun jetOpenTableA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<Byte>, pvparameters: ConstPtr<CVoid>, cbparameters: UInt, grbit: UInt, ptableid: MutPtr<JetTableid>): Int

public expect fun jetOpenTableW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<UShort>, pvparameters: ConstPtr<CVoid>, cbparameters: UInt, grbit: UInt, ptableid: MutPtr<JetTableid>): Int

public expect fun jetOpenTempTable(sesid: JetSesid, prgcolumndef: ConstPtr<JetColumndef>, ccolumn: UInt, grbit: UInt, ptableid: MutPtr<JetTableid>, prgcolumnid: MutPtr<UInt>): Int

public expect fun jetOpenTempTable2(sesid: JetSesid, prgcolumndef: ConstPtr<JetColumndef>, ccolumn: UInt, lcid: UInt, grbit: UInt, ptableid: MutPtr<JetTableid>, prgcolumnid: MutPtr<UInt>): Int

public expect fun jetOpenTempTable3(sesid: JetSesid, prgcolumndef: ConstPtr<JetColumndef>, ccolumn: UInt, pidxunicode: ConstPtr<JetUnicodeindex>, grbit: UInt, ptableid: MutPtr<JetTableid>, prgcolumnid: MutPtr<UInt>): Int

public expect fun jetOpenTemporaryTable(sesid: JetSesid, popentemporarytable: ConstPtr<JetOpentemporarytable>): Int

public expect fun jetOpenTemporaryTable2(sesid: JetSesid, popentemporarytable: ConstPtr<JetOpentemporarytable2>): Int

public expect fun jetPrepareUpdate(sesid: JetSesid, tableid: JetTableid, prep: UInt): Int

public expect fun jetPrereadIndexRanges(sesid: JetSesid, tableid: JetTableid, rgindexranges: ConstPtr<JetIndexRange>, cindexranges: UInt, pcrangespreread: MutPtr<UInt>, rgcolumnidpreread: ConstPtr<UInt>, ccolumnidpreread: UInt, grbit: UInt): Int

public expect fun jetPrereadKeys(sesid: JetSesid, tableid: JetTableid, rgpvkeys: ConstPtr<ConstPtr<CVoid>>, rgcbkeys: ConstPtr<UInt>, ckeys: Int, pckeyspreread: MutPtr<Int>, grbit: UInt): Int

public expect fun jetReadFile(hffile: JetHandle, pv: MutPtr<CVoid>, cb: UInt, pcbactual: MutPtr<UInt>): Int

public expect fun jetReadFileInstance(instance: JetInstance, hffile: JetHandle, pv: MutPtr<CVoid>, cb: UInt, pcbactual: MutPtr<UInt>): Int

public expect fun jetRegisterCallback(sesid: JetSesid, tableid: JetTableid, cbtyp: UInt, pcallback: JetCallback, pvcontext: ConstPtr<CVoid>, phcallbackid: ConstPtr<JetHandle>): Int

public expect fun jetRenameColumnA(sesid: JetSesid, tableid: JetTableid, szname: ConstPtr<Byte>, sznamenew: ConstPtr<Byte>, grbit: UInt): Int

public expect fun jetRenameColumnW(sesid: JetSesid, tableid: JetTableid, szname: ConstPtr<UShort>, sznamenew: ConstPtr<UShort>, grbit: UInt): Int

public expect fun jetRenameTableA(sesid: JetSesid, dbid: UInt, szname: ConstPtr<Byte>, sznamenew: ConstPtr<Byte>): Int

public expect fun jetRenameTableW(sesid: JetSesid, dbid: UInt, szname: ConstPtr<UShort>, sznamenew: ConstPtr<UShort>): Int

public expect fun jetResetSessionContext(sesid: JetSesid): Int

public expect fun jetResetTableSequential(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int

public expect fun jetResizeDatabase(sesid: JetSesid, dbid: UInt, cpgtarget: UInt, pcpgactual: MutPtr<UInt>, grbit: UInt): Int

public expect fun jetRestore2A(sz: ConstPtr<Byte>, szdest: ConstPtr<Byte>, pfn: JetPfnstatus): Int

public expect fun jetRestore2W(sz: ConstPtr<UShort>, szdest: ConstPtr<UShort>, pfn: JetPfnstatus): Int

public expect fun jetRestoreA(szsource: ConstPtr<Byte>, pfn: JetPfnstatus): Int

public expect fun jetRestoreInstanceA(instance: JetInstance, sz: ConstPtr<Byte>, szdest: ConstPtr<Byte>, pfn: JetPfnstatus): Int

public expect fun jetRestoreInstanceW(instance: JetInstance, sz: ConstPtr<UShort>, szdest: ConstPtr<UShort>, pfn: JetPfnstatus): Int

public expect fun jetRestoreW(szsource: ConstPtr<UShort>, pfn: JetPfnstatus): Int

public expect fun jetRetrieveColumn(sesid: JetSesid, tableid: JetTableid, columnid: UInt, pvdata: MutPtr<CVoid>, cbdata: UInt, pcbactual: MutPtr<UInt>, grbit: UInt, pretinfo: MutPtr<JetRetinfo>): Int

public expect fun jetRetrieveColumns(sesid: JetSesid, tableid: JetTableid, pretrievecolumn: MutPtr<JetRetrievecolumn>, cretrievecolumn: UInt): Int

public expect fun jetRetrieveKey(sesid: JetSesid, tableid: JetTableid, pvkey: MutPtr<CVoid>, cbmax: UInt, pcbactual: MutPtr<UInt>, grbit: UInt): Int

public expect fun jetRollback(sesid: JetSesid, grbit: UInt): Int

public expect fun jetSeek(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int

public expect fun jetSetColumn(sesid: JetSesid, tableid: JetTableid, columnid: UInt, pvdata: ConstPtr<CVoid>, cbdata: UInt, grbit: UInt, psetinfo: ConstPtr<JetSetinfo>): Int

public expect fun jetSetColumnDefaultValueA(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<Byte>, szcolumnname: ConstPtr<Byte>, pvdata: ConstPtr<CVoid>, cbdata: UInt, grbit: UInt): Int

public expect fun jetSetColumnDefaultValueW(sesid: JetSesid, dbid: UInt, sztablename: ConstPtr<UShort>, szcolumnname: ConstPtr<UShort>, pvdata: ConstPtr<CVoid>, cbdata: UInt, grbit: UInt): Int

public expect fun jetSetColumns(sesid: JetSesid, tableid: JetTableid, psetcolumn: ConstPtr<JetSetcolumn>, csetcolumn: UInt): Int

public expect fun jetSetCurrentIndex2A(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<Byte>, grbit: UInt): Int

public expect fun jetSetCurrentIndex2W(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<UShort>, grbit: UInt): Int

public expect fun jetSetCurrentIndex3A(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<Byte>, grbit: UInt, itagsequence: UInt): Int

public expect fun jetSetCurrentIndex3W(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<UShort>, grbit: UInt, itagsequence: UInt): Int

public expect fun jetSetCurrentIndex4A(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<Byte>, pindexid: ConstPtr<JetIndexid>, grbit: UInt, itagsequence: UInt): Int

public expect fun jetSetCurrentIndex4W(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<UShort>, pindexid: ConstPtr<JetIndexid>, grbit: UInt, itagsequence: UInt): Int

public expect fun jetSetCurrentIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<Byte>): Int

public expect fun jetSetCurrentIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: ConstPtr<UShort>): Int

public expect fun jetSetCursorFilter(sesid: JetSesid, tableid: JetTableid, rgcolumnfilters: ConstPtr<JetIndexColumn>, ccolumnfilters: UInt, grbit: UInt): Int

public expect fun jetSetDatabaseSizeA(sesid: JetSesid, szdatabasename: ConstPtr<Byte>, cpg: UInt, pcpgreal: MutPtr<UInt>): Int

public expect fun jetSetDatabaseSizeW(sesid: JetSesid, szdatabasename: ConstPtr<UShort>, cpg: UInt, pcpgreal: MutPtr<UInt>): Int

public expect fun jetSetIndexRange(sesid: JetSesid, tableidsrc: JetTableid, grbit: UInt): Int

public expect fun jetSetLS(sesid: JetSesid, tableid: JetTableid, ls: JetLs, grbit: UInt): Int

public expect fun jetSetSessionContext(sesid: JetSesid, ulcontext: JetApiPtr): Int

public expect fun jetSetSessionParameter(sesid: JetSesid, sesparamid: UInt, pvparam: ConstPtr<CVoid>, cbparam: UInt): Int

public expect fun jetSetSystemParameterA(pinstance: MutPtr<JetInstance>, sesid: JetSesid, paramid: UInt, lparam: JetApiPtr, szparam: ConstPtr<Byte>): Int

public expect fun jetSetSystemParameterW(pinstance: MutPtr<JetInstance>, sesid: JetSesid, paramid: UInt, lparam: JetApiPtr, szparam: ConstPtr<UShort>): Int

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

public expect fun jetUpdate(sesid: JetSesid, tableid: JetTableid, pvbookmark: MutPtr<CVoid>, cbbookmark: UInt, pcbactual: MutPtr<UInt>): Int

public expect fun jetUpdate2(sesid: JetSesid, tableid: JetTableid, pvbookmark: MutPtr<CVoid>, cbbookmark: UInt, pcbactual: MutPtr<UInt>, grbit: UInt): Int
