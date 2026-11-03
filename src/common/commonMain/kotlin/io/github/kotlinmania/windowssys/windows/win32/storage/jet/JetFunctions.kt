package io.github.kotlinmania.windowssys.windows.win32.storage.jet

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun interface FnCallback {
    public operator fun invoke(sesid: JET_SESID, snp: UInt, snt: UInt, pv: Long): Int
}

public fun interface FnCallback1 {
    public operator fun invoke(sesid: JET_SESID, dbid: UInt, tableid: StructuredStorage.JET_TABLEID, cbtyp: UInt, pvarg1: Long, pvarg2: Long, pvcontext: Long, ulunused: StructuredStorage.JET_API_PTR): Int
}

public fun interface FnCallback2 {
    public operator fun invoke(pvcontext: Long, pv: Long, cb: UInt): Long
}

public fun JetAddColumnA(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, szcolumnname: Long, pcolumndef: Long, pvdefault: Long, cbdefault: UInt, pcolumnid: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetAddColumnA", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), szcolumnname, pcolumndef, pvdefault, cbdefault.toLong(), pcolumnid)).toInt()
}

public fun JetAddColumnW(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, szcolumnname: Long, pcolumndef: Long, pvdefault: Long, cbdefault: UInt, pcolumnid: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetAddColumnW", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), szcolumnname, pcolumndef, pvdefault, cbdefault.toLong(), pcolumnid)).toInt()
}

public fun JetAttachDatabase2A(sesid: JET_SESID, szfilename: Long, cpgdatabasesizemax: UInt, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetAttachDatabase2A", longArrayOf(sesid.toLong(), szfilename, cpgdatabasesizemax.toLong(), grbit.toLong())).toInt()
}

public fun JetAttachDatabase2W(sesid: JET_SESID, szfilename: Long, cpgdatabasesizemax: UInt, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetAttachDatabase2W", longArrayOf(sesid.toLong(), szfilename, cpgdatabasesizemax.toLong(), grbit.toLong())).toInt()
}

public fun JetAttachDatabaseA(sesid: JET_SESID, szfilename: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetAttachDatabaseA", longArrayOf(sesid.toLong(), szfilename, grbit.toLong())).toInt()
}

public fun JetAttachDatabaseW(sesid: JET_SESID, szfilename: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetAttachDatabaseW", longArrayOf(sesid.toLong(), szfilename, grbit.toLong())).toInt()
}

public fun JetBackupA(szbackuppath: Long, grbit: UInt, pfnstatus: JET_PFNSTATUS): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetBackupA", longArrayOf(szbackuppath, grbit.toLong(), Win32DynamicFfi.objectSlot(pfnstatus))).toInt()
}

public fun JetBackupInstanceA(instance: JET_INSTANCE, szbackuppath: Long, grbit: UInt, pfnstatus: JET_PFNSTATUS): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetBackupInstanceA", longArrayOf(instance.toLong(), szbackuppath, grbit.toLong(), Win32DynamicFfi.objectSlot(pfnstatus))).toInt()
}

public fun JetBackupInstanceW(instance: JET_INSTANCE, szbackuppath: Long, grbit: UInt, pfnstatus: JET_PFNSTATUS): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetBackupInstanceW", longArrayOf(instance.toLong(), szbackuppath, grbit.toLong(), Win32DynamicFfi.objectSlot(pfnstatus))).toInt()
}

public fun JetBackupW(szbackuppath: Long, grbit: UInt, pfnstatus: JET_PFNSTATUS): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetBackupW", longArrayOf(szbackuppath, grbit.toLong(), Win32DynamicFfi.objectSlot(pfnstatus))).toInt()
}

public fun JetBeginExternalBackup(grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetBeginExternalBackup", longArrayOf(grbit.toLong())).toInt()
}

public fun JetBeginExternalBackupInstance(instance: JET_INSTANCE, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetBeginExternalBackupInstance", longArrayOf(instance.toLong(), grbit.toLong())).toInt()
}

public fun JetBeginSessionA(instance: JET_INSTANCE, psesid: Long, szusername: Long, szpassword: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetBeginSessionA", longArrayOf(instance.toLong(), psesid, szusername, szpassword)).toInt()
}

public fun JetBeginSessionW(instance: JET_INSTANCE, psesid: Long, szusername: Long, szpassword: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetBeginSessionW", longArrayOf(instance.toLong(), psesid, szusername, szpassword)).toInt()
}

public fun JetBeginTransaction(sesid: JET_SESID): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetBeginTransaction", longArrayOf(sesid.toLong())).toInt()
}

public fun JetBeginTransaction2(sesid: JET_SESID, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetBeginTransaction2", longArrayOf(sesid.toLong(), grbit.toLong())).toInt()
}

public fun JetBeginTransaction3(sesid: JET_SESID, trxid: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetBeginTransaction3", longArrayOf(sesid.toLong(), trxid, grbit.toLong())).toInt()
}

public fun JetCloseDatabase(sesid: JET_SESID, dbid: UInt, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetCloseDatabase", longArrayOf(sesid.toLong(), dbid.toLong(), grbit.toLong())).toInt()
}

public fun JetCloseFile(hffile: StructuredStorage.JET_HANDLE): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetCloseFile", longArrayOf(Win32DynamicFfi.objectSlot(hffile))).toInt()
}

public fun JetCloseFileInstance(instance: JET_INSTANCE, hffile: StructuredStorage.JET_HANDLE): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetCloseFileInstance", longArrayOf(instance.toLong(), Win32DynamicFfi.objectSlot(hffile))).toInt()
}

public fun JetCloseTable(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetCloseTable", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid))).toInt()
}

public fun JetCommitTransaction(sesid: JET_SESID, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetCommitTransaction", longArrayOf(sesid.toLong(), grbit.toLong())).toInt()
}

public fun JetCommitTransaction2(sesid: JET_SESID, grbit: UInt, cmsecdurablecommit: UInt, pcommitid: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetCommitTransaction2", longArrayOf(sesid.toLong(), grbit.toLong(), cmsecdurablecommit.toLong(), pcommitid)).toInt()
}

public fun JetCompactA(sesid: JET_SESID, szdatabasesrc: Long, szdatabasedest: Long, pfnstatus: JET_PFNSTATUS, pconvert: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetCompactA", longArrayOf(sesid.toLong(), szdatabasesrc, szdatabasedest, Win32DynamicFfi.objectSlot(pfnstatus), pconvert, grbit.toLong())).toInt()
}

public fun JetCompactW(sesid: JET_SESID, szdatabasesrc: Long, szdatabasedest: Long, pfnstatus: JET_PFNSTATUS, pconvert: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetCompactW", longArrayOf(sesid.toLong(), szdatabasesrc, szdatabasedest, Win32DynamicFfi.objectSlot(pfnstatus), pconvert, grbit.toLong())).toInt()
}

public fun JetComputeStats(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetComputeStats", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid))).toInt()
}

public fun JetConfigureProcessForCrashDump(grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetConfigureProcessForCrashDump", longArrayOf(grbit.toLong())).toInt()
}

public fun JetCreateDatabase2A(sesid: JET_SESID, szfilename: Long, cpgdatabasesizemax: UInt, pdbid: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetCreateDatabase2A", longArrayOf(sesid.toLong(), szfilename, cpgdatabasesizemax.toLong(), pdbid, grbit.toLong())).toInt()
}

public fun JetCreateDatabase2W(sesid: JET_SESID, szfilename: Long, cpgdatabasesizemax: UInt, pdbid: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetCreateDatabase2W", longArrayOf(sesid.toLong(), szfilename, cpgdatabasesizemax.toLong(), pdbid, grbit.toLong())).toInt()
}

public fun JetCreateDatabaseA(sesid: JET_SESID, szfilename: Long, szconnect: Long, pdbid: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetCreateDatabaseA", longArrayOf(sesid.toLong(), szfilename, szconnect, pdbid, grbit.toLong())).toInt()
}

public fun JetCreateDatabaseW(sesid: JET_SESID, szfilename: Long, szconnect: Long, pdbid: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetCreateDatabaseW", longArrayOf(sesid.toLong(), szfilename, szconnect, pdbid, grbit.toLong())).toInt()
}

public fun JetCreateIndex2A(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, pindexcreate: Long, cindexcreate: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetCreateIndex2A", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), pindexcreate, cindexcreate.toLong())).toInt()
}

public fun JetCreateIndex2W(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, pindexcreate: Long, cindexcreate: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetCreateIndex2W", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), pindexcreate, cindexcreate.toLong())).toInt()
}

public fun JetCreateIndex3A(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, pindexcreate: Long, cindexcreate: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetCreateIndex3A", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), pindexcreate, cindexcreate.toLong())).toInt()
}

public fun JetCreateIndex3W(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, pindexcreate: Long, cindexcreate: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetCreateIndex3W", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), pindexcreate, cindexcreate.toLong())).toInt()
}

public fun JetCreateIndex4A(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, pindexcreate: Long, cindexcreate: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetCreateIndex4A", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), pindexcreate, cindexcreate.toLong())).toInt()
}

public fun JetCreateIndex4W(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, pindexcreate: Long, cindexcreate: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetCreateIndex4W", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), pindexcreate, cindexcreate.toLong())).toInt()
}

public fun JetCreateIndexA(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, szindexname: Long, grbit: UInt, szkey: PCSTR, cbkey: UInt, ldensity: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetCreateIndexA", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), szindexname, grbit.toLong(), szkey, cbkey.toLong(), ldensity.toLong())).toInt()
}

public fun JetCreateIndexW(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, szindexname: Long, grbit: UInt, szkey: PCWSTR, cbkey: UInt, ldensity: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetCreateIndexW", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), szindexname, grbit.toLong(), szkey, cbkey.toLong(), ldensity.toLong())).toInt()
}

public fun JetCreateInstance2A(pinstance: Long, szinstancename: Long, szdisplayname: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetCreateInstance2A", longArrayOf(pinstance, szinstancename, szdisplayname, grbit.toLong())).toInt()
}

public fun JetCreateInstance2W(pinstance: Long, szinstancename: Long, szdisplayname: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetCreateInstance2W", longArrayOf(pinstance, szinstancename, szdisplayname, grbit.toLong())).toInt()
}

public fun JetCreateInstanceA(pinstance: Long, szinstancename: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetCreateInstanceA", longArrayOf(pinstance, szinstancename)).toInt()
}

public fun JetCreateInstanceW(pinstance: Long, szinstancename: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetCreateInstanceW", longArrayOf(pinstance, szinstancename)).toInt()
}

public fun JetCreateTableA(sesid: JET_SESID, dbid: UInt, sztablename: Long, lpages: UInt, ldensity: UInt, ptableid: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetCreateTableA", longArrayOf(sesid.toLong(), dbid.toLong(), sztablename, lpages.toLong(), ldensity.toLong(), ptableid)).toInt()
}

public fun JetCreateTableColumnIndex2A(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetCreateTableColumnIndex2A", longArrayOf(sesid.toLong(), dbid.toLong(), ptablecreate)).toInt()
}

public fun JetCreateTableColumnIndex2W(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetCreateTableColumnIndex2W", longArrayOf(sesid.toLong(), dbid.toLong(), ptablecreate)).toInt()
}

public fun JetCreateTableColumnIndex3A(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetCreateTableColumnIndex3A", longArrayOf(sesid.toLong(), dbid.toLong(), ptablecreate)).toInt()
}

public fun JetCreateTableColumnIndex3W(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetCreateTableColumnIndex3W", longArrayOf(sesid.toLong(), dbid.toLong(), ptablecreate)).toInt()
}

public fun JetCreateTableColumnIndex4A(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetCreateTableColumnIndex4A", longArrayOf(sesid.toLong(), dbid.toLong(), ptablecreate)).toInt()
}

public fun JetCreateTableColumnIndex4W(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetCreateTableColumnIndex4W", longArrayOf(sesid.toLong(), dbid.toLong(), ptablecreate)).toInt()
}

public fun JetCreateTableColumnIndexA(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetCreateTableColumnIndexA", longArrayOf(sesid.toLong(), dbid.toLong(), ptablecreate)).toInt()
}

public fun JetCreateTableColumnIndexW(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetCreateTableColumnIndexW", longArrayOf(sesid.toLong(), dbid.toLong(), ptablecreate)).toInt()
}

public fun JetCreateTableW(sesid: JET_SESID, dbid: UInt, sztablename: Long, lpages: UInt, ldensity: UInt, ptableid: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetCreateTableW", longArrayOf(sesid.toLong(), dbid.toLong(), sztablename, lpages.toLong(), ldensity.toLong(), ptableid)).toInt()
}

public fun JetDefragment2A(sesid: JET_SESID, dbid: UInt, sztablename: Long, pcpasses: Long, pcseconds: Long, callback: JET_CALLBACK, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetDefragment2A", longArrayOf(sesid.toLong(), dbid.toLong(), sztablename, pcpasses, pcseconds, Win32DynamicFfi.objectSlot(callback), grbit.toLong())).toInt()
}

public fun JetDefragment2W(sesid: JET_SESID, dbid: UInt, sztablename: Long, pcpasses: Long, pcseconds: Long, callback: JET_CALLBACK, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetDefragment2W", longArrayOf(sesid.toLong(), dbid.toLong(), sztablename, pcpasses, pcseconds, Win32DynamicFfi.objectSlot(callback), grbit.toLong())).toInt()
}

public fun JetDefragment3A(sesid: JET_SESID, szdatabasename: Long, sztablename: Long, pcpasses: Long, pcseconds: Long, callback: JET_CALLBACK, pvcontext: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetDefragment3A", longArrayOf(sesid.toLong(), szdatabasename, sztablename, pcpasses, pcseconds, Win32DynamicFfi.objectSlot(callback), pvcontext, grbit.toLong())).toInt()
}

public fun JetDefragment3W(sesid: JET_SESID, szdatabasename: Long, sztablename: Long, pcpasses: Long, pcseconds: Long, callback: JET_CALLBACK, pvcontext: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetDefragment3W", longArrayOf(sesid.toLong(), szdatabasename, sztablename, pcpasses, pcseconds, Win32DynamicFfi.objectSlot(callback), pvcontext, grbit.toLong())).toInt()
}

public fun JetDefragmentA(sesid: JET_SESID, dbid: UInt, sztablename: Long, pcpasses: Long, pcseconds: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetDefragmentA", longArrayOf(sesid.toLong(), dbid.toLong(), sztablename, pcpasses, pcseconds, grbit.toLong())).toInt()
}

public fun JetDefragmentW(sesid: JET_SESID, dbid: UInt, sztablename: Long, pcpasses: Long, pcseconds: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetDefragmentW", longArrayOf(sesid.toLong(), dbid.toLong(), sztablename, pcpasses, pcseconds, grbit.toLong())).toInt()
}

public fun JetDelete(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetDelete", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid))).toInt()
}

public fun JetDeleteColumn2A(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, szcolumnname: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetDeleteColumn2A", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), szcolumnname, grbit.toLong())).toInt()
}

public fun JetDeleteColumn2W(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, szcolumnname: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetDeleteColumn2W", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), szcolumnname, grbit.toLong())).toInt()
}

public fun JetDeleteColumnA(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, szcolumnname: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetDeleteColumnA", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), szcolumnname)).toInt()
}

public fun JetDeleteColumnW(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, szcolumnname: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetDeleteColumnW", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), szcolumnname)).toInt()
}

public fun JetDeleteIndexA(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, szindexname: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetDeleteIndexA", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), szindexname)).toInt()
}

public fun JetDeleteIndexW(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, szindexname: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetDeleteIndexW", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), szindexname)).toInt()
}

public fun JetDeleteTableA(sesid: JET_SESID, dbid: UInt, sztablename: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetDeleteTableA", longArrayOf(sesid.toLong(), dbid.toLong(), sztablename)).toInt()
}

public fun JetDeleteTableW(sesid: JET_SESID, dbid: UInt, sztablename: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetDeleteTableW", longArrayOf(sesid.toLong(), dbid.toLong(), sztablename)).toInt()
}

public fun JetDetachDatabase2A(sesid: JET_SESID, szfilename: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetDetachDatabase2A", longArrayOf(sesid.toLong(), szfilename, grbit.toLong())).toInt()
}

public fun JetDetachDatabase2W(sesid: JET_SESID, szfilename: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetDetachDatabase2W", longArrayOf(sesid.toLong(), szfilename, grbit.toLong())).toInt()
}

public fun JetDetachDatabaseA(sesid: JET_SESID, szfilename: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetDetachDatabaseA", longArrayOf(sesid.toLong(), szfilename)).toInt()
}

public fun JetDetachDatabaseW(sesid: JET_SESID, szfilename: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetDetachDatabaseW", longArrayOf(sesid.toLong(), szfilename)).toInt()
}

public fun JetDupCursor(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, ptableid: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetDupCursor", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), ptableid, grbit.toLong())).toInt()
}

public fun JetDupSession(sesid: JET_SESID, psesid: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetDupSession", longArrayOf(sesid.toLong(), psesid)).toInt()
}

public fun JetEnableMultiInstanceA(psetsysparam: Long, csetsysparam: UInt, pcsetsucceed: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetEnableMultiInstanceA", longArrayOf(psetsysparam, csetsysparam.toLong(), pcsetsucceed)).toInt()
}

public fun JetEnableMultiInstanceW(psetsysparam: Long, csetsysparam: UInt, pcsetsucceed: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetEnableMultiInstanceW", longArrayOf(psetsysparam, csetsysparam.toLong(), pcsetsucceed)).toInt()
}

public fun JetEndExternalBackup(): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetEndExternalBackup", longArrayOf()).toInt()
}

public fun JetEndExternalBackupInstance(instance: JET_INSTANCE): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetEndExternalBackupInstance", longArrayOf(instance.toLong())).toInt()
}

public fun JetEndExternalBackupInstance2(instance: JET_INSTANCE, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetEndExternalBackupInstance2", longArrayOf(instance.toLong(), grbit.toLong())).toInt()
}

public fun JetEndSession(sesid: JET_SESID, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetEndSession", longArrayOf(sesid.toLong(), grbit.toLong())).toInt()
}

public fun JetEnumerateColumns(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, cenumcolumnid: UInt, rgenumcolumnid: Long, pcenumcolumn: Long, prgenumcolumn: Long, pfnrealloc: JET_PFNREALLOC, pvrealloccontext: Long, cbdatamost: UInt, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetEnumerateColumns", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), cenumcolumnid.toLong(), rgenumcolumnid, pcenumcolumn, prgenumcolumn, Win32DynamicFfi.objectSlot(pfnrealloc), pvrealloccontext, cbdatamost.toLong(), grbit.toLong())).toInt()
}

public fun JetEscrowUpdate(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, columnid: UInt, pv: Long, cbmax: UInt, pvold: Long, cboldmax: UInt, pcboldactual: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetEscrowUpdate", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), columnid.toLong(), pv, cbmax.toLong(), pvold, cboldmax.toLong(), pcboldactual, grbit.toLong())).toInt()
}

public fun JetExternalRestore2A(szcheckpointfilepath: Long, szlogpath: Long, rgrstmap: Long, crstfilemap: Int, szbackuplogpath: Long, ploginfo: Long, sztargetinstancename: Long, sztargetinstancelogpath: Long, sztargetinstancecheckpointpath: Long, pfn: JET_PFNSTATUS): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetExternalRestore2A", longArrayOf(szcheckpointfilepath, szlogpath, rgrstmap, crstfilemap.toLong(), szbackuplogpath, ploginfo, sztargetinstancename, sztargetinstancelogpath, sztargetinstancecheckpointpath, Win32DynamicFfi.objectSlot(pfn))).toInt()
}

public fun JetExternalRestore2W(szcheckpointfilepath: Long, szlogpath: Long, rgrstmap: Long, crstfilemap: Int, szbackuplogpath: Long, ploginfo: Long, sztargetinstancename: Long, sztargetinstancelogpath: Long, sztargetinstancecheckpointpath: Long, pfn: JET_PFNSTATUS): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetExternalRestore2W", longArrayOf(szcheckpointfilepath, szlogpath, rgrstmap, crstfilemap.toLong(), szbackuplogpath, ploginfo, sztargetinstancename, sztargetinstancelogpath, sztargetinstancecheckpointpath, Win32DynamicFfi.objectSlot(pfn))).toInt()
}

public fun JetExternalRestoreA(szcheckpointfilepath: Long, szlogpath: Long, rgrstmap: Long, crstfilemap: Int, szbackuplogpath: Long, genlow: Int, genhigh: Int, pfn: JET_PFNSTATUS): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetExternalRestoreA", longArrayOf(szcheckpointfilepath, szlogpath, rgrstmap, crstfilemap.toLong(), szbackuplogpath, genlow.toLong(), genhigh.toLong(), Win32DynamicFfi.objectSlot(pfn))).toInt()
}

public fun JetExternalRestoreW(szcheckpointfilepath: Long, szlogpath: Long, rgrstmap: Long, crstfilemap: Int, szbackuplogpath: Long, genlow: Int, genhigh: Int, pfn: JET_PFNSTATUS): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetExternalRestoreW", longArrayOf(szcheckpointfilepath, szlogpath, rgrstmap, crstfilemap.toLong(), szbackuplogpath, genlow.toLong(), genhigh.toLong(), Win32DynamicFfi.objectSlot(pfn))).toInt()
}

public fun JetFreeBuffer(pbbuf: PCSTR): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetFreeBuffer", longArrayOf(pbbuf)).toInt()
}

public fun JetGetAttachInfoA(szzdatabases: Long, cbmax: UInt, pcbactual: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetAttachInfoA", longArrayOf(szzdatabases, cbmax.toLong(), pcbactual)).toInt()
}

public fun JetGetAttachInfoInstanceA(instance: JET_INSTANCE, szzdatabases: Long, cbmax: UInt, pcbactual: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetAttachInfoInstanceA", longArrayOf(instance.toLong(), szzdatabases, cbmax.toLong(), pcbactual)).toInt()
}

public fun JetGetAttachInfoInstanceW(instance: JET_INSTANCE, szzdatabases: Long, cbmax: UInt, pcbactual: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetAttachInfoInstanceW", longArrayOf(instance.toLong(), szzdatabases, cbmax.toLong(), pcbactual)).toInt()
}

public fun JetGetAttachInfoW(wszzdatabases: Long, cbmax: UInt, pcbactual: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetAttachInfoW", longArrayOf(wszzdatabases, cbmax.toLong(), pcbactual)).toInt()
}

public fun JetGetBookmark(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, pvbookmark: Long, cbmax: UInt, pcbactual: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetBookmark", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), pvbookmark, cbmax.toLong(), pcbactual)).toInt()
}

public fun JetGetColumnInfoA(sesid: JET_SESID, dbid: UInt, sztablename: Long, pcolumnnameorid: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetColumnInfoA", longArrayOf(sesid.toLong(), dbid.toLong(), sztablename, pcolumnnameorid, pvresult, cbmax.toLong(), infolevel.toLong())).toInt()
}

public fun JetGetColumnInfoW(sesid: JET_SESID, dbid: UInt, sztablename: Long, pwcolumnnameorid: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetColumnInfoW", longArrayOf(sesid.toLong(), dbid.toLong(), sztablename, pwcolumnnameorid, pvresult, cbmax.toLong(), infolevel.toLong())).toInt()
}

public fun JetGetCurrentIndexA(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, szindexname: Long, cbindexname: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetCurrentIndexA", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), szindexname, cbindexname.toLong())).toInt()
}

public fun JetGetCurrentIndexW(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, szindexname: Long, cbindexname: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetCurrentIndexW", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), szindexname, cbindexname.toLong())).toInt()
}

public fun JetGetCursorInfo(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, pvresult: Long, cbmax: UInt, infolevel: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetCursorInfo", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), pvresult, cbmax.toLong(), infolevel.toLong())).toInt()
}

public fun JetGetDatabaseFileInfoA(szdatabasename: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetDatabaseFileInfoA", longArrayOf(szdatabasename, pvresult, cbmax.toLong(), infolevel.toLong())).toInt()
}

public fun JetGetDatabaseFileInfoW(szdatabasename: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetDatabaseFileInfoW", longArrayOf(szdatabasename, pvresult, cbmax.toLong(), infolevel.toLong())).toInt()
}

public fun JetGetDatabaseInfoA(sesid: JET_SESID, dbid: UInt, pvresult: Long, cbmax: UInt, infolevel: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetDatabaseInfoA", longArrayOf(sesid.toLong(), dbid.toLong(), pvresult, cbmax.toLong(), infolevel.toLong())).toInt()
}

public fun JetGetDatabaseInfoW(sesid: JET_SESID, dbid: UInt, pvresult: Long, cbmax: UInt, infolevel: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetDatabaseInfoW", longArrayOf(sesid.toLong(), dbid.toLong(), pvresult, cbmax.toLong(), infolevel.toLong())).toInt()
}

public fun JetGetErrorInfoW(pvcontext: Long, pvresult: Long, cbmax: UInt, infolevel: UInt, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetErrorInfoW", longArrayOf(pvcontext, pvresult, cbmax.toLong(), infolevel.toLong(), grbit.toLong())).toInt()
}

public fun JetGetIndexInfoA(sesid: JET_SESID, dbid: UInt, sztablename: Long, szindexname: Long, pvresult: Long, cbresult: UInt, infolevel: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetIndexInfoA", longArrayOf(sesid.toLong(), dbid.toLong(), sztablename, szindexname, pvresult, cbresult.toLong(), infolevel.toLong())).toInt()
}

public fun JetGetIndexInfoW(sesid: JET_SESID, dbid: UInt, sztablename: Long, szindexname: Long, pvresult: Long, cbresult: UInt, infolevel: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetIndexInfoW", longArrayOf(sesid.toLong(), dbid.toLong(), sztablename, szindexname, pvresult, cbresult.toLong(), infolevel.toLong())).toInt()
}

public fun JetGetInstanceInfoA(pcinstanceinfo: Long, painstanceinfo: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetInstanceInfoA", longArrayOf(pcinstanceinfo, painstanceinfo)).toInt()
}

public fun JetGetInstanceInfoW(pcinstanceinfo: Long, painstanceinfo: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetInstanceInfoW", longArrayOf(pcinstanceinfo, painstanceinfo)).toInt()
}

public fun JetGetInstanceMiscInfo(instance: JET_INSTANCE, pvresult: Long, cbmax: UInt, infolevel: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetInstanceMiscInfo", longArrayOf(instance.toLong(), pvresult, cbmax.toLong(), infolevel.toLong())).toInt()
}

public fun JetGetLS(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, pls: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetLS", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), pls, grbit.toLong())).toInt()
}

public fun JetGetLock(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetLock", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), grbit.toLong())).toInt()
}

public fun JetGetLogInfoA(szzlogs: Long, cbmax: UInt, pcbactual: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetLogInfoA", longArrayOf(szzlogs, cbmax.toLong(), pcbactual)).toInt()
}

public fun JetGetLogInfoInstance2A(instance: JET_INSTANCE, szzlogs: Long, cbmax: UInt, pcbactual: Long, ploginfo: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetLogInfoInstance2A", longArrayOf(instance.toLong(), szzlogs, cbmax.toLong(), pcbactual, ploginfo)).toInt()
}

public fun JetGetLogInfoInstance2W(instance: JET_INSTANCE, wszzlogs: Long, cbmax: UInt, pcbactual: Long, ploginfo: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetLogInfoInstance2W", longArrayOf(instance.toLong(), wszzlogs, cbmax.toLong(), pcbactual, ploginfo)).toInt()
}

public fun JetGetLogInfoInstanceA(instance: JET_INSTANCE, szzlogs: Long, cbmax: UInt, pcbactual: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetLogInfoInstanceA", longArrayOf(instance.toLong(), szzlogs, cbmax.toLong(), pcbactual)).toInt()
}

public fun JetGetLogInfoInstanceW(instance: JET_INSTANCE, wszzlogs: Long, cbmax: UInt, pcbactual: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetLogInfoInstanceW", longArrayOf(instance.toLong(), wszzlogs, cbmax.toLong(), pcbactual)).toInt()
}

public fun JetGetLogInfoW(szzlogs: Long, cbmax: UInt, pcbactual: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetLogInfoW", longArrayOf(szzlogs, cbmax.toLong(), pcbactual)).toInt()
}

public fun JetGetObjectInfoA(sesid: JET_SESID, dbid: UInt, objtyp: UInt, szcontainername: Long, szobjectname: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetObjectInfoA", longArrayOf(sesid.toLong(), dbid.toLong(), objtyp.toLong(), szcontainername, szobjectname, pvresult, cbmax.toLong(), infolevel.toLong())).toInt()
}

public fun JetGetObjectInfoW(sesid: JET_SESID, dbid: UInt, objtyp: UInt, szcontainername: Long, szobjectname: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetObjectInfoW", longArrayOf(sesid.toLong(), dbid.toLong(), objtyp.toLong(), szcontainername, szobjectname, pvresult, cbmax.toLong(), infolevel.toLong())).toInt()
}

public fun JetGetRecordPosition(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, precpos: Long, cbrecpos: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetRecordPosition", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), precpos, cbrecpos.toLong())).toInt()
}

public fun JetGetRecordSize(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, precsize: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetRecordSize", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), precsize, grbit.toLong())).toInt()
}

public fun JetGetRecordSize2(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, precsize: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetRecordSize2", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), precsize, grbit.toLong())).toInt()
}

public fun JetGetSecondaryIndexBookmark(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, pvsecondarykey: Long, cbsecondarykeymax: UInt, pcbsecondarykeyactual: Long, pvprimarybookmark: Long, cbprimarybookmarkmax: UInt, pcbprimarybookmarkactual: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetSecondaryIndexBookmark", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), pvsecondarykey, cbsecondarykeymax.toLong(), pcbsecondarykeyactual, pvprimarybookmark, cbprimarybookmarkmax.toLong(), pcbprimarybookmarkactual, grbit.toLong())).toInt()
}

public fun JetGetSessionParameter(sesid: JET_SESID, sesparamid: UInt, pvparam: Long, cbparammax: UInt, pcbparamactual: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetSessionParameter", longArrayOf(sesid.toLong(), sesparamid.toLong(), pvparam, cbparammax.toLong(), pcbparamactual)).toInt()
}

public fun JetGetSystemParameterA(instance: JET_INSTANCE, sesid: JET_SESID, paramid: UInt, plparam: Long, szparam: Long, cbmax: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetSystemParameterA", longArrayOf(instance.toLong(), sesid.toLong(), paramid.toLong(), plparam, szparam, cbmax.toLong())).toInt()
}

public fun JetGetSystemParameterW(instance: JET_INSTANCE, sesid: JET_SESID, paramid: UInt, plparam: Long, szparam: Long, cbmax: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetSystemParameterW", longArrayOf(instance.toLong(), sesid.toLong(), paramid.toLong(), plparam, szparam, cbmax.toLong())).toInt()
}

public fun JetGetTableColumnInfoA(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, szcolumnname: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetTableColumnInfoA", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), szcolumnname, pvresult, cbmax.toLong(), infolevel.toLong())).toInt()
}

public fun JetGetTableColumnInfoW(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, szcolumnname: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetTableColumnInfoW", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), szcolumnname, pvresult, cbmax.toLong(), infolevel.toLong())).toInt()
}

public fun JetGetTableIndexInfoA(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, szindexname: Long, pvresult: Long, cbresult: UInt, infolevel: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetTableIndexInfoA", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), szindexname, pvresult, cbresult.toLong(), infolevel.toLong())).toInt()
}

public fun JetGetTableIndexInfoW(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, szindexname: Long, pvresult: Long, cbresult: UInt, infolevel: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetTableIndexInfoW", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), szindexname, pvresult, cbresult.toLong(), infolevel.toLong())).toInt()
}

public fun JetGetTableInfoA(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, pvresult: Long, cbmax: UInt, infolevel: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetTableInfoA", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), pvresult, cbmax.toLong(), infolevel.toLong())).toInt()
}

public fun JetGetTableInfoW(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, pvresult: Long, cbmax: UInt, infolevel: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetTableInfoW", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), pvresult, cbmax.toLong(), infolevel.toLong())).toInt()
}

public fun JetGetThreadStats(pvresult: Long, cbmax: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetThreadStats", longArrayOf(pvresult, cbmax.toLong())).toInt()
}

public fun JetGetTruncateLogInfoInstanceA(instance: JET_INSTANCE, szzlogs: Long, cbmax: UInt, pcbactual: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetTruncateLogInfoInstanceA", longArrayOf(instance.toLong(), szzlogs, cbmax.toLong(), pcbactual)).toInt()
}

public fun JetGetTruncateLogInfoInstanceW(instance: JET_INSTANCE, wszzlogs: Long, cbmax: UInt, pcbactual: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetTruncateLogInfoInstanceW", longArrayOf(instance.toLong(), wszzlogs, cbmax.toLong(), pcbactual)).toInt()
}

public fun JetGetVersion(sesid: JET_SESID, pwversion: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGetVersion", longArrayOf(sesid.toLong(), pwversion)).toInt()
}

public fun JetGotoBookmark(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, pvbookmark: Long, cbbookmark: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGotoBookmark", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), pvbookmark, cbbookmark.toLong())).toInt()
}

public fun JetGotoPosition(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, precpos: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGotoPosition", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), precpos)).toInt()
}

public fun JetGotoSecondaryIndexBookmark(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, pvsecondarykey: Long, cbsecondarykey: UInt, pvprimarybookmark: Long, cbprimarybookmark: UInt, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGotoSecondaryIndexBookmark", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), pvsecondarykey, cbsecondarykey.toLong(), pvprimarybookmark, cbprimarybookmark.toLong(), grbit.toLong())).toInt()
}

public fun JetGrowDatabase(sesid: JET_SESID, dbid: UInt, cpg: UInt, pcpgreal: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetGrowDatabase", longArrayOf(sesid.toLong(), dbid.toLong(), cpg.toLong(), pcpgreal)).toInt()
}

public fun JetIdle(sesid: JET_SESID, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetIdle", longArrayOf(sesid.toLong(), grbit.toLong())).toInt()
}

public fun JetIndexRecordCount(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, pcrec: Long, crecmax: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetIndexRecordCount", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), pcrec, crecmax.toLong())).toInt()
}

public fun JetInit(pinstance: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetInit", longArrayOf(pinstance)).toInt()
}

public fun JetInit2(pinstance: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetInit2", longArrayOf(pinstance, grbit.toLong())).toInt()
}

public fun JetInit3A(pinstance: Long, prstinfo: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetInit3A", longArrayOf(pinstance, prstinfo, grbit.toLong())).toInt()
}

public fun JetInit3W(pinstance: Long, prstinfo: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetInit3W", longArrayOf(pinstance, prstinfo, grbit.toLong())).toInt()
}

public fun JetIntersectIndexes(sesid: JET_SESID, rgindexrange: Long, cindexrange: UInt, precordlist: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetIntersectIndexes", longArrayOf(sesid.toLong(), rgindexrange, cindexrange.toLong(), precordlist, grbit.toLong())).toInt()
}

public fun JetMakeKey(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, pvdata: Long, cbdata: UInt, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetMakeKey", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), pvdata, cbdata.toLong(), grbit.toLong())).toInt()
}

public fun JetMove(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, crow: Int, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetMove", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), crow.toLong(), grbit.toLong())).toInt()
}

public fun JetOSSnapshotAbort(snapid: JET_OSSNAPID, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetOSSnapshotAbort", longArrayOf(snapid.toLong(), grbit.toLong())).toInt()
}

public fun JetOSSnapshotEnd(snapid: JET_OSSNAPID, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetOSSnapshotEnd", longArrayOf(snapid.toLong(), grbit.toLong())).toInt()
}

public fun JetOSSnapshotFreezeA(snapid: JET_OSSNAPID, pcinstanceinfo: Long, painstanceinfo: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetOSSnapshotFreezeA", longArrayOf(snapid.toLong(), pcinstanceinfo, painstanceinfo, grbit.toLong())).toInt()
}

public fun JetOSSnapshotFreezeW(snapid: JET_OSSNAPID, pcinstanceinfo: Long, painstanceinfo: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetOSSnapshotFreezeW", longArrayOf(snapid.toLong(), pcinstanceinfo, painstanceinfo, grbit.toLong())).toInt()
}

public fun JetOSSnapshotGetFreezeInfoA(snapid: JET_OSSNAPID, pcinstanceinfo: Long, painstanceinfo: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetOSSnapshotGetFreezeInfoA", longArrayOf(snapid.toLong(), pcinstanceinfo, painstanceinfo, grbit.toLong())).toInt()
}

public fun JetOSSnapshotGetFreezeInfoW(snapid: JET_OSSNAPID, pcinstanceinfo: Long, painstanceinfo: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetOSSnapshotGetFreezeInfoW", longArrayOf(snapid.toLong(), pcinstanceinfo, painstanceinfo, grbit.toLong())).toInt()
}

public fun JetOSSnapshotPrepare(psnapid: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetOSSnapshotPrepare", longArrayOf(psnapid, grbit.toLong())).toInt()
}

public fun JetOSSnapshotPrepareInstance(snapid: JET_OSSNAPID, instance: JET_INSTANCE, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetOSSnapshotPrepareInstance", longArrayOf(snapid.toLong(), instance.toLong(), grbit.toLong())).toInt()
}

public fun JetOSSnapshotThaw(snapid: JET_OSSNAPID, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetOSSnapshotThaw", longArrayOf(snapid.toLong(), grbit.toLong())).toInt()
}

public fun JetOSSnapshotTruncateLog(snapid: JET_OSSNAPID, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetOSSnapshotTruncateLog", longArrayOf(snapid.toLong(), grbit.toLong())).toInt()
}

public fun JetOSSnapshotTruncateLogInstance(snapid: JET_OSSNAPID, instance: JET_INSTANCE, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetOSSnapshotTruncateLogInstance", longArrayOf(snapid.toLong(), instance.toLong(), grbit.toLong())).toInt()
}

public fun JetOpenDatabaseA(sesid: JET_SESID, szfilename: Long, szconnect: Long, pdbid: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetOpenDatabaseA", longArrayOf(sesid.toLong(), szfilename, szconnect, pdbid, grbit.toLong())).toInt()
}

public fun JetOpenDatabaseW(sesid: JET_SESID, szfilename: Long, szconnect: Long, pdbid: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetOpenDatabaseW", longArrayOf(sesid.toLong(), szfilename, szconnect, pdbid, grbit.toLong())).toInt()
}

public fun JetOpenFileA(szfilename: Long, phffile: Long, pulfilesizelow: Long, pulfilesizehigh: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetOpenFileA", longArrayOf(szfilename, phffile, pulfilesizelow, pulfilesizehigh)).toInt()
}

public fun JetOpenFileInstanceA(instance: JET_INSTANCE, szfilename: Long, phffile: Long, pulfilesizelow: Long, pulfilesizehigh: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetOpenFileInstanceA", longArrayOf(instance.toLong(), szfilename, phffile, pulfilesizelow, pulfilesizehigh)).toInt()
}

public fun JetOpenFileInstanceW(instance: JET_INSTANCE, szfilename: Long, phffile: Long, pulfilesizelow: Long, pulfilesizehigh: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetOpenFileInstanceW", longArrayOf(instance.toLong(), szfilename, phffile, pulfilesizelow, pulfilesizehigh)).toInt()
}

public fun JetOpenFileW(szfilename: Long, phffile: Long, pulfilesizelow: Long, pulfilesizehigh: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetOpenFileW", longArrayOf(szfilename, phffile, pulfilesizelow, pulfilesizehigh)).toInt()
}

public fun JetOpenTableA(sesid: JET_SESID, dbid: UInt, sztablename: Long, pvparameters: Long, cbparameters: UInt, grbit: UInt, ptableid: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetOpenTableA", longArrayOf(sesid.toLong(), dbid.toLong(), sztablename, pvparameters, cbparameters.toLong(), grbit.toLong(), ptableid)).toInt()
}

public fun JetOpenTableW(sesid: JET_SESID, dbid: UInt, sztablename: Long, pvparameters: Long, cbparameters: UInt, grbit: UInt, ptableid: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetOpenTableW", longArrayOf(sesid.toLong(), dbid.toLong(), sztablename, pvparameters, cbparameters.toLong(), grbit.toLong(), ptableid)).toInt()
}

public fun JetOpenTempTable(sesid: JET_SESID, prgcolumndef: Long, ccolumn: UInt, grbit: UInt, ptableid: Long, prgcolumnid: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetOpenTempTable", longArrayOf(sesid.toLong(), prgcolumndef, ccolumn.toLong(), grbit.toLong(), ptableid, prgcolumnid)).toInt()
}

public fun JetOpenTempTable2(sesid: JET_SESID, prgcolumndef: Long, ccolumn: UInt, lcid: UInt, grbit: UInt, ptableid: Long, prgcolumnid: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetOpenTempTable2", longArrayOf(sesid.toLong(), prgcolumndef, ccolumn.toLong(), lcid.toLong(), grbit.toLong(), ptableid, prgcolumnid)).toInt()
}

public fun JetOpenTempTable3(sesid: JET_SESID, prgcolumndef: Long, ccolumn: UInt, pidxunicode: Long, grbit: UInt, ptableid: Long, prgcolumnid: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetOpenTempTable3", longArrayOf(sesid.toLong(), prgcolumndef, ccolumn.toLong(), pidxunicode, grbit.toLong(), ptableid, prgcolumnid)).toInt()
}

public fun JetOpenTemporaryTable(sesid: JET_SESID, popentemporarytable: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetOpenTemporaryTable", longArrayOf(sesid.toLong(), popentemporarytable)).toInt()
}

public fun JetOpenTemporaryTable2(sesid: JET_SESID, popentemporarytable: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetOpenTemporaryTable2", longArrayOf(sesid.toLong(), popentemporarytable)).toInt()
}

public fun JetPrepareUpdate(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, prep: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetPrepareUpdate", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), prep.toLong())).toInt()
}

public fun JetPrereadIndexRanges(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, rgindexranges: Long, cindexranges: UInt, pcrangespreread: Long, rgcolumnidpreread: Long, ccolumnidpreread: UInt, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetPrereadIndexRanges", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), rgindexranges, cindexranges.toLong(), pcrangespreread, rgcolumnidpreread, ccolumnidpreread.toLong(), grbit.toLong())).toInt()
}

public fun JetPrereadKeys(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, rgpvkeys: Long, rgcbkeys: Long, ckeys: Int, pckeyspreread: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetPrereadKeys", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), rgpvkeys, rgcbkeys, ckeys.toLong(), pckeyspreread, grbit.toLong())).toInt()
}

public fun JetReadFile(hffile: StructuredStorage.JET_HANDLE, pv: Long, cb: UInt, pcbactual: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetReadFile", longArrayOf(Win32DynamicFfi.objectSlot(hffile), pv, cb.toLong(), pcbactual)).toInt()
}

public fun JetReadFileInstance(instance: JET_INSTANCE, hffile: StructuredStorage.JET_HANDLE, pv: Long, cb: UInt, pcbactual: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetReadFileInstance", longArrayOf(instance.toLong(), Win32DynamicFfi.objectSlot(hffile), pv, cb.toLong(), pcbactual)).toInt()
}

public fun JetRegisterCallback(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, cbtyp: UInt, pcallback: JET_CALLBACK, pvcontext: Long, phcallbackid: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetRegisterCallback", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), cbtyp.toLong(), Win32DynamicFfi.objectSlot(pcallback), pvcontext, phcallbackid)).toInt()
}

public fun JetRenameColumnA(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, szname: Long, sznamenew: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetRenameColumnA", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), szname, sznamenew, grbit.toLong())).toInt()
}

public fun JetRenameColumnW(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, szname: Long, sznamenew: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetRenameColumnW", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), szname, sznamenew, grbit.toLong())).toInt()
}

public fun JetRenameTableA(sesid: JET_SESID, dbid: UInt, szname: Long, sznamenew: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetRenameTableA", longArrayOf(sesid.toLong(), dbid.toLong(), szname, sznamenew)).toInt()
}

public fun JetRenameTableW(sesid: JET_SESID, dbid: UInt, szname: Long, sznamenew: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetRenameTableW", longArrayOf(sesid.toLong(), dbid.toLong(), szname, sznamenew)).toInt()
}

public fun JetResetSessionContext(sesid: JET_SESID): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetResetSessionContext", longArrayOf(sesid.toLong())).toInt()
}

public fun JetResetTableSequential(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetResetTableSequential", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), grbit.toLong())).toInt()
}

public fun JetResizeDatabase(sesid: JET_SESID, dbid: UInt, cpgtarget: UInt, pcpgactual: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetResizeDatabase", longArrayOf(sesid.toLong(), dbid.toLong(), cpgtarget.toLong(), pcpgactual, grbit.toLong())).toInt()
}

public fun JetRestore2A(sz: Long, szdest: Long, pfn: JET_PFNSTATUS): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetRestore2A", longArrayOf(sz, szdest, Win32DynamicFfi.objectSlot(pfn))).toInt()
}

public fun JetRestore2W(sz: Long, szdest: Long, pfn: JET_PFNSTATUS): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetRestore2W", longArrayOf(sz, szdest, Win32DynamicFfi.objectSlot(pfn))).toInt()
}

public fun JetRestoreA(szsource: Long, pfn: JET_PFNSTATUS): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetRestoreA", longArrayOf(szsource, Win32DynamicFfi.objectSlot(pfn))).toInt()
}

public fun JetRestoreInstanceA(instance: JET_INSTANCE, sz: Long, szdest: Long, pfn: JET_PFNSTATUS): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetRestoreInstanceA", longArrayOf(instance.toLong(), sz, szdest, Win32DynamicFfi.objectSlot(pfn))).toInt()
}

public fun JetRestoreInstanceW(instance: JET_INSTANCE, sz: Long, szdest: Long, pfn: JET_PFNSTATUS): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetRestoreInstanceW", longArrayOf(instance.toLong(), sz, szdest, Win32DynamicFfi.objectSlot(pfn))).toInt()
}

public fun JetRestoreW(szsource: Long, pfn: JET_PFNSTATUS): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetRestoreW", longArrayOf(szsource, Win32DynamicFfi.objectSlot(pfn))).toInt()
}

public fun JetRetrieveColumn(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, columnid: UInt, pvdata: Long, cbdata: UInt, pcbactual: Long, grbit: UInt, pretinfo: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetRetrieveColumn", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), columnid.toLong(), pvdata, cbdata.toLong(), pcbactual, grbit.toLong(), pretinfo)).toInt()
}

public fun JetRetrieveColumns(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, pretrievecolumn: Long, cretrievecolumn: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetRetrieveColumns", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), pretrievecolumn, cretrievecolumn.toLong())).toInt()
}

public fun JetRetrieveKey(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, pvkey: Long, cbmax: UInt, pcbactual: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetRetrieveKey", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), pvkey, cbmax.toLong(), pcbactual, grbit.toLong())).toInt()
}

public fun JetRollback(sesid: JET_SESID, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetRollback", longArrayOf(sesid.toLong(), grbit.toLong())).toInt()
}

public fun JetSeek(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetSeek", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), grbit.toLong())).toInt()
}

public fun JetSetColumn(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, columnid: UInt, pvdata: Long, cbdata: UInt, grbit: UInt, psetinfo: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetSetColumn", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), columnid.toLong(), pvdata, cbdata.toLong(), grbit.toLong(), psetinfo)).toInt()
}

public fun JetSetColumnDefaultValueA(sesid: JET_SESID, dbid: UInt, sztablename: Long, szcolumnname: Long, pvdata: Long, cbdata: UInt, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetSetColumnDefaultValueA", longArrayOf(sesid.toLong(), dbid.toLong(), sztablename, szcolumnname, pvdata, cbdata.toLong(), grbit.toLong())).toInt()
}

public fun JetSetColumnDefaultValueW(sesid: JET_SESID, dbid: UInt, sztablename: Long, szcolumnname: Long, pvdata: Long, cbdata: UInt, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetSetColumnDefaultValueW", longArrayOf(sesid.toLong(), dbid.toLong(), sztablename, szcolumnname, pvdata, cbdata.toLong(), grbit.toLong())).toInt()
}

public fun JetSetColumns(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, psetcolumn: Long, csetcolumn: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetSetColumns", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), psetcolumn, csetcolumn.toLong())).toInt()
}

public fun JetSetCurrentIndex2A(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, szindexname: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetSetCurrentIndex2A", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), szindexname, grbit.toLong())).toInt()
}

public fun JetSetCurrentIndex2W(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, szindexname: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetSetCurrentIndex2W", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), szindexname, grbit.toLong())).toInt()
}

public fun JetSetCurrentIndex3A(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, szindexname: Long, grbit: UInt, itagsequence: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetSetCurrentIndex3A", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), szindexname, grbit.toLong(), itagsequence.toLong())).toInt()
}

public fun JetSetCurrentIndex3W(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, szindexname: Long, grbit: UInt, itagsequence: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetSetCurrentIndex3W", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), szindexname, grbit.toLong(), itagsequence.toLong())).toInt()
}

public fun JetSetCurrentIndex4A(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, szindexname: Long, pindexid: Long, grbit: UInt, itagsequence: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetSetCurrentIndex4A", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), szindexname, pindexid, grbit.toLong(), itagsequence.toLong())).toInt()
}

public fun JetSetCurrentIndex4W(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, szindexname: Long, pindexid: Long, grbit: UInt, itagsequence: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetSetCurrentIndex4W", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), szindexname, pindexid, grbit.toLong(), itagsequence.toLong())).toInt()
}

public fun JetSetCurrentIndexA(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, szindexname: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetSetCurrentIndexA", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), szindexname)).toInt()
}

public fun JetSetCurrentIndexW(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, szindexname: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetSetCurrentIndexW", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), szindexname)).toInt()
}

public fun JetSetCursorFilter(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, rgcolumnfilters: Long, ccolumnfilters: UInt, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetSetCursorFilter", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), rgcolumnfilters, ccolumnfilters.toLong(), grbit.toLong())).toInt()
}

public fun JetSetDatabaseSizeA(sesid: JET_SESID, szdatabasename: Long, cpg: UInt, pcpgreal: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetSetDatabaseSizeA", longArrayOf(sesid.toLong(), szdatabasename, cpg.toLong(), pcpgreal)).toInt()
}

public fun JetSetDatabaseSizeW(sesid: JET_SESID, szdatabasename: Long, cpg: UInt, pcpgreal: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetSetDatabaseSizeW", longArrayOf(sesid.toLong(), szdatabasename, cpg.toLong(), pcpgreal)).toInt()
}

public fun JetSetIndexRange(sesid: JET_SESID, tableidsrc: StructuredStorage.JET_TABLEID, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetSetIndexRange", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableidsrc), grbit.toLong())).toInt()
}

public fun JetSetLS(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, ls: JET_LS, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetSetLS", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), ls.toLong(), grbit.toLong())).toInt()
}

public fun JetSetSessionContext(sesid: JET_SESID, ulcontext: StructuredStorage.JET_API_PTR): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetSetSessionContext", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(ulcontext))).toInt()
}

public fun JetSetSessionParameter(sesid: JET_SESID, sesparamid: UInt, pvparam: Long, cbparam: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetSetSessionParameter", longArrayOf(sesid.toLong(), sesparamid.toLong(), pvparam, cbparam.toLong())).toInt()
}

public fun JetSetSystemParameterA(pinstance: Long, sesid: JET_SESID, paramid: UInt, lparam: StructuredStorage.JET_API_PTR, szparam: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetSetSystemParameterA", longArrayOf(pinstance, sesid.toLong(), paramid.toLong(), Win32DynamicFfi.objectSlot(lparam), szparam)).toInt()
}

public fun JetSetSystemParameterW(pinstance: Long, sesid: JET_SESID, paramid: UInt, lparam: StructuredStorage.JET_API_PTR, szparam: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetSetSystemParameterW", longArrayOf(pinstance, sesid.toLong(), paramid.toLong(), Win32DynamicFfi.objectSlot(lparam), szparam)).toInt()
}

public fun JetSetTableSequential(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetSetTableSequential", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), grbit.toLong())).toInt()
}

public fun JetStopBackup(): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetStopBackup", longArrayOf()).toInt()
}

public fun JetStopBackupInstance(instance: JET_INSTANCE): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetStopBackupInstance", longArrayOf(instance.toLong())).toInt()
}

public fun JetStopService(): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetStopService", longArrayOf()).toInt()
}

public fun JetStopServiceInstance(instance: JET_INSTANCE): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetStopServiceInstance", longArrayOf(instance.toLong())).toInt()
}

public fun JetStopServiceInstance2(instance: JET_INSTANCE, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetStopServiceInstance2", longArrayOf(instance.toLong(), grbit.toLong())).toInt()
}

public fun JetTerm(instance: JET_INSTANCE): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetTerm", longArrayOf(instance.toLong())).toInt()
}

public fun JetTerm2(instance: JET_INSTANCE, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetTerm2", longArrayOf(instance.toLong(), grbit.toLong())).toInt()
}

public fun JetTruncateLog(): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetTruncateLog", longArrayOf()).toInt()
}

public fun JetTruncateLogInstance(instance: JET_INSTANCE): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetTruncateLogInstance", longArrayOf(instance.toLong())).toInt()
}

public fun JetUnregisterCallback(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, cbtyp: UInt, hcallbackid: StructuredStorage.JET_HANDLE): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetUnregisterCallback", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), cbtyp.toLong(), Win32DynamicFfi.objectSlot(hcallbackid))).toInt()
}

public fun JetUpdate(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, pvbookmark: Long, cbbookmark: UInt, pcbactual: Long): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetUpdate", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), pvbookmark, cbbookmark.toLong(), pcbactual)).toInt()
}

public fun JetUpdate2(sesid: JET_SESID, tableid: StructuredStorage.JET_TABLEID, pvbookmark: Long, cbbookmark: UInt, pcbactual: Long, grbit: UInt): Int {
    return Win32DynamicFfi.invoke("esent.dll", "JetUpdate2", longArrayOf(sesid.toLong(), Win32DynamicFfi.objectSlot(tableid), pvbookmark, cbbookmark.toLong(), pcbactual, grbit.toLong())).toInt()
}
