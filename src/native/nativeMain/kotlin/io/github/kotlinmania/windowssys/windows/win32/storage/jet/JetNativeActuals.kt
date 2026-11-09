@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.jet

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JET_API_PTR
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JET_HANDLE
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JET_TABLEID
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun JetAddColumnA(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long, pcolumndef: Long, pvdefault: Long, cbdefault: UInt, pcolumnid: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetAddColumnA(sesid, tableid, szcolumnname.toCPointer<ByteVar>(), pcolumndef.toCPointer<ByteVar>(), pvdefault.toCPointer<ByteVar>(), cbdefault, pcolumnid.toCPointer<ByteVar>())

public actual fun JetAddColumnW(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long, pcolumndef: Long, pvdefault: Long, cbdefault: UInt, pcolumnid: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetAddColumnW(sesid, tableid, szcolumnname.toCPointer<ByteVar>(), pcolumndef.toCPointer<ByteVar>(), pvdefault.toCPointer<ByteVar>(), cbdefault, pcolumnid.toCPointer<ByteVar>())

public actual fun JetAttachDatabase2A(sesid: JET_SESID, szfilename: Long, cpgdatabasesizemax: UInt, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetAttachDatabase2A(sesid, szfilename.toCPointer<ByteVar>(), cpgdatabasesizemax, grbit)

public actual fun JetAttachDatabase2W(sesid: JET_SESID, szfilename: Long, cpgdatabasesizemax: UInt, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetAttachDatabase2W(sesid, szfilename.toCPointer<ByteVar>(), cpgdatabasesizemax, grbit)

public actual fun JetAttachDatabaseA(sesid: JET_SESID, szfilename: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetAttachDatabaseA(sesid, szfilename.toCPointer<ByteVar>(), grbit)

public actual fun JetAttachDatabaseW(sesid: JET_SESID, szfilename: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetAttachDatabaseW(sesid, szfilename.toCPointer<ByteVar>(), grbit)

public actual fun JetBackupA(szbackuppath: Long, grbit: UInt, pfnstatus: JET_PFNSTATUS): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetBackupA(szbackuppath.toCPointer<ByteVar>(), grbit, pfnstatus.toLong().toCPointer<ByteVar>())

public actual fun JetBackupInstanceA(instance: JET_INSTANCE, szbackuppath: Long, grbit: UInt, pfnstatus: JET_PFNSTATUS): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetBackupInstanceA(instance, szbackuppath.toCPointer<ByteVar>(), grbit, pfnstatus.toLong().toCPointer<ByteVar>())

public actual fun JetBackupInstanceW(instance: JET_INSTANCE, szbackuppath: Long, grbit: UInt, pfnstatus: JET_PFNSTATUS): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetBackupInstanceW(instance, szbackuppath.toCPointer<ByteVar>(), grbit, pfnstatus.toLong().toCPointer<ByteVar>())

public actual fun JetBackupW(szbackuppath: Long, grbit: UInt, pfnstatus: JET_PFNSTATUS): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetBackupW(szbackuppath.toCPointer<ByteVar>(), grbit, pfnstatus.toLong().toCPointer<ByteVar>())

public actual fun JetBeginExternalBackup(grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetBeginExternalBackup(grbit)

public actual fun JetBeginExternalBackupInstance(instance: JET_INSTANCE, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetBeginExternalBackupInstance(instance, grbit)

public actual fun JetBeginSessionA(instance: JET_INSTANCE, psesid: Long, szusername: Long, szpassword: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetBeginSessionA(instance, psesid.toCPointer<ByteVar>(), szusername.toCPointer<ByteVar>(), szpassword.toCPointer<ByteVar>())

public actual fun JetBeginSessionW(instance: JET_INSTANCE, psesid: Long, szusername: Long, szpassword: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetBeginSessionW(instance, psesid.toCPointer<ByteVar>(), szusername.toCPointer<ByteVar>(), szpassword.toCPointer<ByteVar>())

public actual fun JetBeginTransaction(sesid: JET_SESID): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetBeginTransaction(sesid)

public actual fun JetBeginTransaction2(sesid: JET_SESID, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetBeginTransaction2(sesid, grbit)

public actual fun JetBeginTransaction3(sesid: JET_SESID, trxid: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetBeginTransaction3(sesid, trxid, grbit)

public actual fun JetCloseDatabase(sesid: JET_SESID, dbid: UInt, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetCloseDatabase(sesid, dbid, grbit)

public actual fun JetCloseFile(hffile: JET_HANDLE): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetCloseFile(hffile)

public actual fun JetCloseFileInstance(instance: JET_INSTANCE, hffile: JET_HANDLE): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetCloseFileInstance(instance, hffile)

public actual fun JetCloseTable(sesid: JET_SESID, tableid: JET_TABLEID): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetCloseTable(sesid, tableid)

public actual fun JetCommitTransaction(sesid: JET_SESID, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetCommitTransaction(sesid, grbit)

public actual fun JetCommitTransaction2(sesid: JET_SESID, grbit: UInt, cmsecdurablecommit: UInt, pcommitid: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetCommitTransaction2(sesid, grbit, cmsecdurablecommit, pcommitid.toCPointer<ByteVar>())

public actual fun JetCompactA(sesid: JET_SESID, szdatabasesrc: Long, szdatabasedest: Long, pfnstatus: JET_PFNSTATUS, pconvert: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetCompactA(sesid, szdatabasesrc.toCPointer<ByteVar>(), szdatabasedest.toCPointer<ByteVar>(), pfnstatus.toLong().toCPointer<ByteVar>(), pconvert.toCPointer<ByteVar>(), grbit)

public actual fun JetCompactW(sesid: JET_SESID, szdatabasesrc: Long, szdatabasedest: Long, pfnstatus: JET_PFNSTATUS, pconvert: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetCompactW(sesid, szdatabasesrc.toCPointer<ByteVar>(), szdatabasedest.toCPointer<ByteVar>(), pfnstatus.toLong().toCPointer<ByteVar>(), pconvert.toCPointer<ByteVar>(), grbit)

public actual fun JetComputeStats(sesid: JET_SESID, tableid: JET_TABLEID): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetComputeStats(sesid, tableid)

public actual fun JetConfigureProcessForCrashDump(grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetConfigureProcessForCrashDump(grbit)

public actual fun JetCreateDatabase2A(sesid: JET_SESID, szfilename: Long, cpgdatabasesizemax: UInt, pdbid: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetCreateDatabase2A(sesid, szfilename.toCPointer<ByteVar>(), cpgdatabasesizemax, pdbid.toCPointer<ByteVar>(), grbit)

public actual fun JetCreateDatabase2W(sesid: JET_SESID, szfilename: Long, cpgdatabasesizemax: UInt, pdbid: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetCreateDatabase2W(sesid, szfilename.toCPointer<ByteVar>(), cpgdatabasesizemax, pdbid.toCPointer<ByteVar>(), grbit)

public actual fun JetCreateDatabaseA(sesid: JET_SESID, szfilename: Long, szconnect: Long, pdbid: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetCreateDatabaseA(sesid, szfilename.toCPointer<ByteVar>(), szconnect.toCPointer<ByteVar>(), pdbid.toCPointer<ByteVar>(), grbit)

public actual fun JetCreateDatabaseW(sesid: JET_SESID, szfilename: Long, szconnect: Long, pdbid: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetCreateDatabaseW(sesid, szfilename.toCPointer<ByteVar>(), szconnect.toCPointer<ByteVar>(), pdbid.toCPointer<ByteVar>(), grbit)

public actual fun JetCreateIndex2A(sesid: JET_SESID, tableid: JET_TABLEID, pindexcreate: Long, cindexcreate: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetCreateIndex2A(sesid, tableid, pindexcreate.toCPointer<ByteVar>(), cindexcreate)

public actual fun JetCreateIndex2W(sesid: JET_SESID, tableid: JET_TABLEID, pindexcreate: Long, cindexcreate: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetCreateIndex2W(sesid, tableid, pindexcreate.toCPointer<ByteVar>(), cindexcreate)

public actual fun JetCreateIndex3A(sesid: JET_SESID, tableid: JET_TABLEID, pindexcreate: Long, cindexcreate: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetCreateIndex3A(sesid, tableid, pindexcreate.toCPointer<ByteVar>(), cindexcreate)

public actual fun JetCreateIndex3W(sesid: JET_SESID, tableid: JET_TABLEID, pindexcreate: Long, cindexcreate: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetCreateIndex3W(sesid, tableid, pindexcreate.toCPointer<ByteVar>(), cindexcreate)

public actual fun JetCreateIndex4A(sesid: JET_SESID, tableid: JET_TABLEID, pindexcreate: Long, cindexcreate: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetCreateIndex4A(sesid, tableid, pindexcreate.toCPointer<ByteVar>(), cindexcreate)

public actual fun JetCreateIndex4W(sesid: JET_SESID, tableid: JET_TABLEID, pindexcreate: Long, cindexcreate: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetCreateIndex4W(sesid, tableid, pindexcreate.toCPointer<ByteVar>(), cindexcreate)

public actual fun JetCreateIndexA(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, grbit: UInt, szkey: PCSTR, cbkey: UInt, ldensity: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetCreateIndexA(sesid, tableid, szindexname.toCPointer<ByteVar>(), grbit, szkey.toCPointer<ByteVar>(), cbkey, ldensity)

public actual fun JetCreateIndexW(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, grbit: UInt, szkey: PCWSTR, cbkey: UInt, ldensity: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetCreateIndexW(sesid, tableid, szindexname.toCPointer<ByteVar>(), grbit, szkey.toCPointer<ByteVar>(), cbkey, ldensity)

public actual fun JetCreateInstance2A(pinstance: Long, szinstancename: Long, szdisplayname: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetCreateInstance2A(pinstance.toCPointer<ByteVar>(), szinstancename.toCPointer<ByteVar>(), szdisplayname.toCPointer<ByteVar>(), grbit)

public actual fun JetCreateInstance2W(pinstance: Long, szinstancename: Long, szdisplayname: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetCreateInstance2W(pinstance.toCPointer<ByteVar>(), szinstancename.toCPointer<ByteVar>(), szdisplayname.toCPointer<ByteVar>(), grbit)

public actual fun JetCreateInstanceA(pinstance: Long, szinstancename: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetCreateInstanceA(pinstance.toCPointer<ByteVar>(), szinstancename.toCPointer<ByteVar>())

public actual fun JetCreateInstanceW(pinstance: Long, szinstancename: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetCreateInstanceW(pinstance.toCPointer<ByteVar>(), szinstancename.toCPointer<ByteVar>())

public actual fun JetCreateTableA(sesid: JET_SESID, dbid: UInt, sztablename: Long, lpages: UInt, ldensity: UInt, ptableid: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetCreateTableA(sesid, dbid, sztablename.toCPointer<ByteVar>(), lpages, ldensity, ptableid.toCPointer<ByteVar>())

public actual fun JetCreateTableColumnIndex2A(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex2A(sesid, dbid, ptablecreate.toCPointer<ByteVar>())

public actual fun JetCreateTableColumnIndex2W(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex2W(sesid, dbid, ptablecreate.toCPointer<ByteVar>())

public actual fun JetCreateTableColumnIndex3A(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex3A(sesid, dbid, ptablecreate.toCPointer<ByteVar>())

public actual fun JetCreateTableColumnIndex3W(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex3W(sesid, dbid, ptablecreate.toCPointer<ByteVar>())

public actual fun JetCreateTableColumnIndex4A(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex4A(sesid, dbid, ptablecreate.toCPointer<ByteVar>())

public actual fun JetCreateTableColumnIndex4W(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex4W(sesid, dbid, ptablecreate.toCPointer<ByteVar>())

public actual fun JetCreateTableColumnIndexA(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetCreateTableColumnIndexA(sesid, dbid, ptablecreate.toCPointer<ByteVar>())

public actual fun JetCreateTableColumnIndexW(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetCreateTableColumnIndexW(sesid, dbid, ptablecreate.toCPointer<ByteVar>())

public actual fun JetCreateTableW(sesid: JET_SESID, dbid: UInt, sztablename: Long, lpages: UInt, ldensity: UInt, ptableid: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetCreateTableW(sesid, dbid, sztablename.toCPointer<ByteVar>(), lpages, ldensity, ptableid.toCPointer<ByteVar>())

public actual fun JetDefragment2A(sesid: JET_SESID, dbid: UInt, sztablename: Long, pcpasses: Long, pcseconds: Long, callback: JET_CALLBACK, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetDefragment2A(sesid, dbid, sztablename.toCPointer<ByteVar>(), pcpasses.toCPointer<ByteVar>(), pcseconds.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), grbit)

public actual fun JetDefragment2W(sesid: JET_SESID, dbid: UInt, sztablename: Long, pcpasses: Long, pcseconds: Long, callback: JET_CALLBACK, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetDefragment2W(sesid, dbid, sztablename.toCPointer<ByteVar>(), pcpasses.toCPointer<ByteVar>(), pcseconds.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), grbit)

public actual fun JetDefragment3A(sesid: JET_SESID, szdatabasename: Long, sztablename: Long, pcpasses: Long, pcseconds: Long, callback: JET_CALLBACK, pvcontext: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetDefragment3A(sesid, szdatabasename.toCPointer<ByteVar>(), sztablename.toCPointer<ByteVar>(), pcpasses.toCPointer<ByteVar>(), pcseconds.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), pvcontext.toCPointer<ByteVar>(), grbit)

public actual fun JetDefragment3W(sesid: JET_SESID, szdatabasename: Long, sztablename: Long, pcpasses: Long, pcseconds: Long, callback: JET_CALLBACK, pvcontext: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetDefragment3W(sesid, szdatabasename.toCPointer<ByteVar>(), sztablename.toCPointer<ByteVar>(), pcpasses.toCPointer<ByteVar>(), pcseconds.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), pvcontext.toCPointer<ByteVar>(), grbit)

public actual fun JetDefragmentA(sesid: JET_SESID, dbid: UInt, sztablename: Long, pcpasses: Long, pcseconds: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetDefragmentA(sesid, dbid, sztablename.toCPointer<ByteVar>(), pcpasses.toCPointer<ByteVar>(), pcseconds.toCPointer<ByteVar>(), grbit)

public actual fun JetDefragmentW(sesid: JET_SESID, dbid: UInt, sztablename: Long, pcpasses: Long, pcseconds: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetDefragmentW(sesid, dbid, sztablename.toCPointer<ByteVar>(), pcpasses.toCPointer<ByteVar>(), pcseconds.toCPointer<ByteVar>(), grbit)

public actual fun JetDelete(sesid: JET_SESID, tableid: JET_TABLEID): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetDelete(sesid, tableid)

public actual fun JetDeleteColumn2A(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetDeleteColumn2A(sesid, tableid, szcolumnname.toCPointer<ByteVar>(), grbit)

public actual fun JetDeleteColumn2W(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetDeleteColumn2W(sesid, tableid, szcolumnname.toCPointer<ByteVar>(), grbit)

public actual fun JetDeleteColumnA(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetDeleteColumnA(sesid, tableid, szcolumnname.toCPointer<ByteVar>())

public actual fun JetDeleteColumnW(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetDeleteColumnW(sesid, tableid, szcolumnname.toCPointer<ByteVar>())

public actual fun JetDeleteIndexA(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetDeleteIndexA(sesid, tableid, szindexname.toCPointer<ByteVar>())

public actual fun JetDeleteIndexW(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetDeleteIndexW(sesid, tableid, szindexname.toCPointer<ByteVar>())

public actual fun JetDeleteTableA(sesid: JET_SESID, dbid: UInt, sztablename: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetDeleteTableA(sesid, dbid, sztablename.toCPointer<ByteVar>())

public actual fun JetDeleteTableW(sesid: JET_SESID, dbid: UInt, sztablename: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetDeleteTableW(sesid, dbid, sztablename.toCPointer<ByteVar>())

public actual fun JetDetachDatabase2A(sesid: JET_SESID, szfilename: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetDetachDatabase2A(sesid, szfilename.toCPointer<ByteVar>(), grbit)

public actual fun JetDetachDatabase2W(sesid: JET_SESID, szfilename: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetDetachDatabase2W(sesid, szfilename.toCPointer<ByteVar>(), grbit)

public actual fun JetDetachDatabaseA(sesid: JET_SESID, szfilename: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetDetachDatabaseA(sesid, szfilename.toCPointer<ByteVar>())

public actual fun JetDetachDatabaseW(sesid: JET_SESID, szfilename: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetDetachDatabaseW(sesid, szfilename.toCPointer<ByteVar>())

public actual fun JetDupCursor(sesid: JET_SESID, tableid: JET_TABLEID, ptableid: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetDupCursor(sesid, tableid, ptableid.toCPointer<ByteVar>(), grbit)

public actual fun JetDupSession(sesid: JET_SESID, psesid: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetDupSession(sesid, psesid.toCPointer<ByteVar>())

public actual fun JetEnableMultiInstanceA(psetsysparam: Long, csetsysparam: UInt, pcsetsucceed: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetEnableMultiInstanceA(psetsysparam.toCPointer<ByteVar>(), csetsysparam, pcsetsucceed.toCPointer<ByteVar>())

public actual fun JetEnableMultiInstanceW(psetsysparam: Long, csetsysparam: UInt, pcsetsucceed: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetEnableMultiInstanceW(psetsysparam.toCPointer<ByteVar>(), csetsysparam, pcsetsucceed.toCPointer<ByteVar>())

public actual fun JetEndExternalBackup(): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetEndExternalBackup()

public actual fun JetEndExternalBackupInstance(instance: JET_INSTANCE): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetEndExternalBackupInstance(instance)

public actual fun JetEndExternalBackupInstance2(instance: JET_INSTANCE, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetEndExternalBackupInstance2(instance, grbit)

public actual fun JetEndSession(sesid: JET_SESID, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetEndSession(sesid, grbit)

public actual fun JetEnumerateColumns(sesid: JET_SESID, tableid: JET_TABLEID, cenumcolumnid: UInt, rgenumcolumnid: Long, pcenumcolumn: Long, prgenumcolumn: Long, pfnrealloc: JET_PFNREALLOC, pvrealloccontext: Long, cbdatamost: UInt, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetEnumerateColumns(sesid, tableid, cenumcolumnid, rgenumcolumnid.toCPointer<ByteVar>(), pcenumcolumn.toCPointer<ByteVar>(), prgenumcolumn.toCPointer<ByteVar>(), pfnrealloc.toLong().toCPointer<ByteVar>(), pvrealloccontext.toCPointer<ByteVar>(), cbdatamost, grbit)

public actual fun JetEscrowUpdate(sesid: JET_SESID, tableid: JET_TABLEID, columnid: UInt, pv: Long, cbmax: UInt, pvold: Long, cboldmax: UInt, pcboldactual: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetEscrowUpdate(sesid, tableid, columnid, pv.toCPointer<ByteVar>(), cbmax, pvold.toCPointer<ByteVar>(), cboldmax, pcboldactual.toCPointer<ByteVar>(), grbit)

public actual fun JetExternalRestore2A(szcheckpointfilepath: Long, szlogpath: Long, rgrstmap: Long, crstfilemap: Int, szbackuplogpath: Long, ploginfo: Long, sztargetinstancename: Long, sztargetinstancelogpath: Long, sztargetinstancecheckpointpath: Long, pfn: JET_PFNSTATUS): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetExternalRestore2A(szcheckpointfilepath.toCPointer<ByteVar>(), szlogpath.toCPointer<ByteVar>(), rgrstmap.toCPointer<ByteVar>(), crstfilemap, szbackuplogpath.toCPointer<ByteVar>(), ploginfo.toCPointer<ByteVar>(), sztargetinstancename.toCPointer<ByteVar>(), sztargetinstancelogpath.toCPointer<ByteVar>(), sztargetinstancecheckpointpath.toCPointer<ByteVar>(), pfn.toLong().toCPointer<ByteVar>())

public actual fun JetExternalRestore2W(szcheckpointfilepath: Long, szlogpath: Long, rgrstmap: Long, crstfilemap: Int, szbackuplogpath: Long, ploginfo: Long, sztargetinstancename: Long, sztargetinstancelogpath: Long, sztargetinstancecheckpointpath: Long, pfn: JET_PFNSTATUS): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetExternalRestore2W(szcheckpointfilepath.toCPointer<ByteVar>(), szlogpath.toCPointer<ByteVar>(), rgrstmap.toCPointer<ByteVar>(), crstfilemap, szbackuplogpath.toCPointer<ByteVar>(), ploginfo.toCPointer<ByteVar>(), sztargetinstancename.toCPointer<ByteVar>(), sztargetinstancelogpath.toCPointer<ByteVar>(), sztargetinstancecheckpointpath.toCPointer<ByteVar>(), pfn.toLong().toCPointer<ByteVar>())

public actual fun JetExternalRestoreA(szcheckpointfilepath: Long, szlogpath: Long, rgrstmap: Long, crstfilemap: Int, szbackuplogpath: Long, genlow: Int, genhigh: Int, pfn: JET_PFNSTATUS): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetExternalRestoreA(szcheckpointfilepath.toCPointer<ByteVar>(), szlogpath.toCPointer<ByteVar>(), rgrstmap.toCPointer<ByteVar>(), crstfilemap, szbackuplogpath.toCPointer<ByteVar>(), genlow, genhigh, pfn.toLong().toCPointer<ByteVar>())

public actual fun JetExternalRestoreW(szcheckpointfilepath: Long, szlogpath: Long, rgrstmap: Long, crstfilemap: Int, szbackuplogpath: Long, genlow: Int, genhigh: Int, pfn: JET_PFNSTATUS): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetExternalRestoreW(szcheckpointfilepath.toCPointer<ByteVar>(), szlogpath.toCPointer<ByteVar>(), rgrstmap.toCPointer<ByteVar>(), crstfilemap, szbackuplogpath.toCPointer<ByteVar>(), genlow, genhigh, pfn.toLong().toCPointer<ByteVar>())

public actual fun JetFreeBuffer(pbbuf: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetFreeBuffer(pbbuf.toCPointer<ByteVar>())

public actual fun JetGetAttachInfoA(szzdatabases: Long, cbmax: UInt, pcbactual: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetAttachInfoA(szzdatabases.toCPointer<ByteVar>(), cbmax, pcbactual.toCPointer<ByteVar>())

public actual fun JetGetAttachInfoInstanceA(instance: JET_INSTANCE, szzdatabases: Long, cbmax: UInt, pcbactual: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetAttachInfoInstanceA(instance, szzdatabases.toCPointer<ByteVar>(), cbmax, pcbactual.toCPointer<ByteVar>())

public actual fun JetGetAttachInfoInstanceW(instance: JET_INSTANCE, szzdatabases: Long, cbmax: UInt, pcbactual: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetAttachInfoInstanceW(instance, szzdatabases.toCPointer<ByteVar>(), cbmax, pcbactual.toCPointer<ByteVar>())

public actual fun JetGetAttachInfoW(wszzdatabases: Long, cbmax: UInt, pcbactual: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetAttachInfoW(wszzdatabases.toCPointer<ByteVar>(), cbmax, pcbactual.toCPointer<ByteVar>())

public actual fun JetGetBookmark(sesid: JET_SESID, tableid: JET_TABLEID, pvbookmark: Long, cbmax: UInt, pcbactual: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetBookmark(sesid, tableid, pvbookmark.toCPointer<ByteVar>(), cbmax, pcbactual.toCPointer<ByteVar>())

public actual fun JetGetColumnInfoA(sesid: JET_SESID, dbid: UInt, sztablename: Long, pcolumnnameorid: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetColumnInfoA(sesid, dbid, sztablename.toCPointer<ByteVar>(), pcolumnnameorid.toCPointer<ByteVar>(), pvresult.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun JetGetColumnInfoW(sesid: JET_SESID, dbid: UInt, sztablename: Long, pwcolumnnameorid: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetColumnInfoW(sesid, dbid, sztablename.toCPointer<ByteVar>(), pwcolumnnameorid.toCPointer<ByteVar>(), pvresult.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun JetGetCurrentIndexA(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, cbindexname: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetCurrentIndexA(sesid, tableid, szindexname.toCPointer<ByteVar>(), cbindexname)

public actual fun JetGetCurrentIndexW(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, cbindexname: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetCurrentIndexW(sesid, tableid, szindexname.toCPointer<ByteVar>(), cbindexname)

public actual fun JetGetCursorInfo(sesid: JET_SESID, tableid: JET_TABLEID, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetCursorInfo(sesid, tableid, pvresult.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun JetGetDatabaseFileInfoA(szdatabasename: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetDatabaseFileInfoA(szdatabasename.toCPointer<ByteVar>(), pvresult.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun JetGetDatabaseFileInfoW(szdatabasename: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetDatabaseFileInfoW(szdatabasename.toCPointer<ByteVar>(), pvresult.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun JetGetDatabaseInfoA(sesid: JET_SESID, dbid: UInt, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetDatabaseInfoA(sesid, dbid, pvresult.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun JetGetDatabaseInfoW(sesid: JET_SESID, dbid: UInt, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetDatabaseInfoW(sesid, dbid, pvresult.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun JetGetErrorInfoW(pvcontext: Long, pvresult: Long, cbmax: UInt, infolevel: UInt, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetErrorInfoW(pvcontext.toCPointer<ByteVar>(), pvresult.toCPointer<ByteVar>(), cbmax, infolevel, grbit)

public actual fun JetGetIndexInfoA(sesid: JET_SESID, dbid: UInt, sztablename: Long, szindexname: Long, pvresult: Long, cbresult: UInt, infolevel: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetIndexInfoA(sesid, dbid, sztablename.toCPointer<ByteVar>(), szindexname.toCPointer<ByteVar>(), pvresult.toCPointer<ByteVar>(), cbresult, infolevel)

public actual fun JetGetIndexInfoW(sesid: JET_SESID, dbid: UInt, sztablename: Long, szindexname: Long, pvresult: Long, cbresult: UInt, infolevel: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetIndexInfoW(sesid, dbid, sztablename.toCPointer<ByteVar>(), szindexname.toCPointer<ByteVar>(), pvresult.toCPointer<ByteVar>(), cbresult, infolevel)

public actual fun JetGetInstanceInfoA(pcinstanceinfo: Long, painstanceinfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetInstanceInfoA(pcinstanceinfo.toCPointer<ByteVar>(), painstanceinfo.toCPointer<ByteVar>())

public actual fun JetGetInstanceInfoW(pcinstanceinfo: Long, painstanceinfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetInstanceInfoW(pcinstanceinfo.toCPointer<ByteVar>(), painstanceinfo.toCPointer<ByteVar>())

public actual fun JetGetInstanceMiscInfo(instance: JET_INSTANCE, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetInstanceMiscInfo(instance, pvresult.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun JetGetLS(sesid: JET_SESID, tableid: JET_TABLEID, pls: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetLS(sesid, tableid, pls.toCPointer<ByteVar>(), grbit)

public actual fun JetGetLock(sesid: JET_SESID, tableid: JET_TABLEID, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetLock(sesid, tableid, grbit)

public actual fun JetGetLogInfoA(szzlogs: Long, cbmax: UInt, pcbactual: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetLogInfoA(szzlogs.toCPointer<ByteVar>(), cbmax, pcbactual.toCPointer<ByteVar>())

public actual fun JetGetLogInfoInstance2A(instance: JET_INSTANCE, szzlogs: Long, cbmax: UInt, pcbactual: Long, ploginfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetLogInfoInstance2A(instance, szzlogs.toCPointer<ByteVar>(), cbmax, pcbactual.toCPointer<ByteVar>(), ploginfo.toCPointer<ByteVar>())

public actual fun JetGetLogInfoInstance2W(instance: JET_INSTANCE, wszzlogs: Long, cbmax: UInt, pcbactual: Long, ploginfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetLogInfoInstance2W(instance, wszzlogs.toCPointer<ByteVar>(), cbmax, pcbactual.toCPointer<ByteVar>(), ploginfo.toCPointer<ByteVar>())

public actual fun JetGetLogInfoInstanceA(instance: JET_INSTANCE, szzlogs: Long, cbmax: UInt, pcbactual: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetLogInfoInstanceA(instance, szzlogs.toCPointer<ByteVar>(), cbmax, pcbactual.toCPointer<ByteVar>())

public actual fun JetGetLogInfoInstanceW(instance: JET_INSTANCE, wszzlogs: Long, cbmax: UInt, pcbactual: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetLogInfoInstanceW(instance, wszzlogs.toCPointer<ByteVar>(), cbmax, pcbactual.toCPointer<ByteVar>())

public actual fun JetGetLogInfoW(szzlogs: Long, cbmax: UInt, pcbactual: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetLogInfoW(szzlogs.toCPointer<ByteVar>(), cbmax, pcbactual.toCPointer<ByteVar>())

public actual fun JetGetObjectInfoA(sesid: JET_SESID, dbid: UInt, objtyp: UInt, szcontainername: Long, szobjectname: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetObjectInfoA(sesid, dbid, objtyp, szcontainername.toCPointer<ByteVar>(), szobjectname.toCPointer<ByteVar>(), pvresult.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun JetGetObjectInfoW(sesid: JET_SESID, dbid: UInt, objtyp: UInt, szcontainername: Long, szobjectname: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetObjectInfoW(sesid, dbid, objtyp, szcontainername.toCPointer<ByteVar>(), szobjectname.toCPointer<ByteVar>(), pvresult.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun JetGetRecordPosition(sesid: JET_SESID, tableid: JET_TABLEID, precpos: Long, cbrecpos: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetRecordPosition(sesid, tableid, precpos.toCPointer<ByteVar>(), cbrecpos)

public actual fun JetGetRecordSize(sesid: JET_SESID, tableid: JET_TABLEID, precsize: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetRecordSize(sesid, tableid, precsize.toCPointer<ByteVar>(), grbit)

public actual fun JetGetRecordSize2(sesid: JET_SESID, tableid: JET_TABLEID, precsize: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetRecordSize2(sesid, tableid, precsize.toCPointer<ByteVar>(), grbit)

public actual fun JetGetSecondaryIndexBookmark(sesid: JET_SESID, tableid: JET_TABLEID, pvsecondarykey: Long, cbsecondarykeymax: UInt, pcbsecondarykeyactual: Long, pvprimarybookmark: Long, cbprimarybookmarkmax: UInt, pcbprimarybookmarkactual: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetSecondaryIndexBookmark(sesid, tableid, pvsecondarykey.toCPointer<ByteVar>(), cbsecondarykeymax, pcbsecondarykeyactual.toCPointer<ByteVar>(), pvprimarybookmark.toCPointer<ByteVar>(), cbprimarybookmarkmax, pcbprimarybookmarkactual.toCPointer<ByteVar>(), grbit)

public actual fun JetGetSessionParameter(sesid: JET_SESID, sesparamid: UInt, pvparam: Long, cbparammax: UInt, pcbparamactual: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetSessionParameter(sesid, sesparamid, pvparam.toCPointer<ByteVar>(), cbparammax, pcbparamactual.toCPointer<ByteVar>())

public actual fun JetGetSystemParameterA(instance: JET_INSTANCE, sesid: JET_SESID, paramid: UInt, plparam: Long, szparam: Long, cbmax: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetSystemParameterA(instance, sesid, paramid, plparam.toCPointer<ByteVar>(), szparam.toCPointer<ByteVar>(), cbmax)

public actual fun JetGetSystemParameterW(instance: JET_INSTANCE, sesid: JET_SESID, paramid: UInt, plparam: Long, szparam: Long, cbmax: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetSystemParameterW(instance, sesid, paramid, plparam.toCPointer<ByteVar>(), szparam.toCPointer<ByteVar>(), cbmax)

public actual fun JetGetTableColumnInfoA(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetTableColumnInfoA(sesid, tableid, szcolumnname.toCPointer<ByteVar>(), pvresult.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun JetGetTableColumnInfoW(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetTableColumnInfoW(sesid, tableid, szcolumnname.toCPointer<ByteVar>(), pvresult.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun JetGetTableIndexInfoA(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, pvresult: Long, cbresult: UInt, infolevel: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetTableIndexInfoA(sesid, tableid, szindexname.toCPointer<ByteVar>(), pvresult.toCPointer<ByteVar>(), cbresult, infolevel)

public actual fun JetGetTableIndexInfoW(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, pvresult: Long, cbresult: UInt, infolevel: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetTableIndexInfoW(sesid, tableid, szindexname.toCPointer<ByteVar>(), pvresult.toCPointer<ByteVar>(), cbresult, infolevel)

public actual fun JetGetTableInfoA(sesid: JET_SESID, tableid: JET_TABLEID, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetTableInfoA(sesid, tableid, pvresult.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun JetGetTableInfoW(sesid: JET_SESID, tableid: JET_TABLEID, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetTableInfoW(sesid, tableid, pvresult.toCPointer<ByteVar>(), cbmax, infolevel)

public actual fun JetGetThreadStats(pvresult: Long, cbmax: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetThreadStats(pvresult.toCPointer<ByteVar>(), cbmax)

public actual fun JetGetTruncateLogInfoInstanceA(instance: JET_INSTANCE, szzlogs: Long, cbmax: UInt, pcbactual: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetTruncateLogInfoInstanceA(instance, szzlogs.toCPointer<ByteVar>(), cbmax, pcbactual.toCPointer<ByteVar>())

public actual fun JetGetTruncateLogInfoInstanceW(instance: JET_INSTANCE, wszzlogs: Long, cbmax: UInt, pcbactual: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetTruncateLogInfoInstanceW(instance, wszzlogs.toCPointer<ByteVar>(), cbmax, pcbactual.toCPointer<ByteVar>())

public actual fun JetGetVersion(sesid: JET_SESID, pwversion: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGetVersion(sesid, pwversion.toCPointer<ByteVar>())

public actual fun JetGotoBookmark(sesid: JET_SESID, tableid: JET_TABLEID, pvbookmark: Long, cbbookmark: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGotoBookmark(sesid, tableid, pvbookmark.toCPointer<ByteVar>(), cbbookmark)

public actual fun JetGotoPosition(sesid: JET_SESID, tableid: JET_TABLEID, precpos: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGotoPosition(sesid, tableid, precpos.toCPointer<ByteVar>())

public actual fun JetGotoSecondaryIndexBookmark(sesid: JET_SESID, tableid: JET_TABLEID, pvsecondarykey: Long, cbsecondarykey: UInt, pvprimarybookmark: Long, cbprimarybookmark: UInt, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGotoSecondaryIndexBookmark(sesid, tableid, pvsecondarykey.toCPointer<ByteVar>(), cbsecondarykey, pvprimarybookmark.toCPointer<ByteVar>(), cbprimarybookmark, grbit)

public actual fun JetGrowDatabase(sesid: JET_SESID, dbid: UInt, cpg: UInt, pcpgreal: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetGrowDatabase(sesid, dbid, cpg, pcpgreal.toCPointer<ByteVar>())

public actual fun JetIdle(sesid: JET_SESID, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetIdle(sesid, grbit)

public actual fun JetIndexRecordCount(sesid: JET_SESID, tableid: JET_TABLEID, pcrec: Long, crecmax: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetIndexRecordCount(sesid, tableid, pcrec.toCPointer<ByteVar>(), crecmax)

public actual fun JetInit(pinstance: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetInit(pinstance.toCPointer<ByteVar>())

public actual fun JetInit2(pinstance: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetInit2(pinstance.toCPointer<ByteVar>(), grbit)

public actual fun JetInit3A(pinstance: Long, prstinfo: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetInit3A(pinstance.toCPointer<ByteVar>(), prstinfo.toCPointer<ByteVar>(), grbit)

public actual fun JetInit3W(pinstance: Long, prstinfo: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetInit3W(pinstance.toCPointer<ByteVar>(), prstinfo.toCPointer<ByteVar>(), grbit)

public actual fun JetIntersectIndexes(sesid: JET_SESID, rgindexrange: Long, cindexrange: UInt, precordlist: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetIntersectIndexes(sesid, rgindexrange.toCPointer<ByteVar>(), cindexrange, precordlist.toCPointer<ByteVar>(), grbit)

public actual fun JetMakeKey(sesid: JET_SESID, tableid: JET_TABLEID, pvdata: Long, cbdata: UInt, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetMakeKey(sesid, tableid, pvdata.toCPointer<ByteVar>(), cbdata, grbit)

public actual fun JetMove(sesid: JET_SESID, tableid: JET_TABLEID, crow: Int, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetMove(sesid, tableid, crow, grbit)

public actual fun JetOSSnapshotAbort(snapid: JET_OSSNAPID, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetOSSnapshotAbort(snapid, grbit)

public actual fun JetOSSnapshotEnd(snapid: JET_OSSNAPID, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetOSSnapshotEnd(snapid, grbit)

public actual fun JetOSSnapshotFreezeA(snapid: JET_OSSNAPID, pcinstanceinfo: Long, painstanceinfo: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetOSSnapshotFreezeA(snapid, pcinstanceinfo.toCPointer<ByteVar>(), painstanceinfo.toCPointer<ByteVar>(), grbit)

public actual fun JetOSSnapshotFreezeW(snapid: JET_OSSNAPID, pcinstanceinfo: Long, painstanceinfo: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetOSSnapshotFreezeW(snapid, pcinstanceinfo.toCPointer<ByteVar>(), painstanceinfo.toCPointer<ByteVar>(), grbit)

public actual fun JetOSSnapshotGetFreezeInfoA(snapid: JET_OSSNAPID, pcinstanceinfo: Long, painstanceinfo: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetOSSnapshotGetFreezeInfoA(snapid, pcinstanceinfo.toCPointer<ByteVar>(), painstanceinfo.toCPointer<ByteVar>(), grbit)

public actual fun JetOSSnapshotGetFreezeInfoW(snapid: JET_OSSNAPID, pcinstanceinfo: Long, painstanceinfo: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetOSSnapshotGetFreezeInfoW(snapid, pcinstanceinfo.toCPointer<ByteVar>(), painstanceinfo.toCPointer<ByteVar>(), grbit)

public actual fun JetOSSnapshotPrepare(psnapid: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetOSSnapshotPrepare(psnapid.toCPointer<ByteVar>(), grbit)

public actual fun JetOSSnapshotPrepareInstance(snapid: JET_OSSNAPID, instance: JET_INSTANCE, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetOSSnapshotPrepareInstance(snapid, instance, grbit)

public actual fun JetOSSnapshotThaw(snapid: JET_OSSNAPID, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetOSSnapshotThaw(snapid, grbit)

public actual fun JetOSSnapshotTruncateLog(snapid: JET_OSSNAPID, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetOSSnapshotTruncateLog(snapid, grbit)

public actual fun JetOSSnapshotTruncateLogInstance(snapid: JET_OSSNAPID, instance: JET_INSTANCE, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetOSSnapshotTruncateLogInstance(snapid, instance, grbit)

public actual fun JetOpenDatabaseA(sesid: JET_SESID, szfilename: Long, szconnect: Long, pdbid: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetOpenDatabaseA(sesid, szfilename.toCPointer<ByteVar>(), szconnect.toCPointer<ByteVar>(), pdbid.toCPointer<ByteVar>(), grbit)

public actual fun JetOpenDatabaseW(sesid: JET_SESID, szfilename: Long, szconnect: Long, pdbid: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetOpenDatabaseW(sesid, szfilename.toCPointer<ByteVar>(), szconnect.toCPointer<ByteVar>(), pdbid.toCPointer<ByteVar>(), grbit)

public actual fun JetOpenFileA(szfilename: Long, phffile: Long, pulfilesizelow: Long, pulfilesizehigh: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetOpenFileA(szfilename.toCPointer<ByteVar>(), phffile.toCPointer<ByteVar>(), pulfilesizelow.toCPointer<ByteVar>(), pulfilesizehigh.toCPointer<ByteVar>())

public actual fun JetOpenFileInstanceA(instance: JET_INSTANCE, szfilename: Long, phffile: Long, pulfilesizelow: Long, pulfilesizehigh: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetOpenFileInstanceA(instance, szfilename.toCPointer<ByteVar>(), phffile.toCPointer<ByteVar>(), pulfilesizelow.toCPointer<ByteVar>(), pulfilesizehigh.toCPointer<ByteVar>())

public actual fun JetOpenFileInstanceW(instance: JET_INSTANCE, szfilename: Long, phffile: Long, pulfilesizelow: Long, pulfilesizehigh: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetOpenFileInstanceW(instance, szfilename.toCPointer<ByteVar>(), phffile.toCPointer<ByteVar>(), pulfilesizelow.toCPointer<ByteVar>(), pulfilesizehigh.toCPointer<ByteVar>())

public actual fun JetOpenFileW(szfilename: Long, phffile: Long, pulfilesizelow: Long, pulfilesizehigh: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetOpenFileW(szfilename.toCPointer<ByteVar>(), phffile.toCPointer<ByteVar>(), pulfilesizelow.toCPointer<ByteVar>(), pulfilesizehigh.toCPointer<ByteVar>())

public actual fun JetOpenTableA(sesid: JET_SESID, dbid: UInt, sztablename: Long, pvparameters: Long, cbparameters: UInt, grbit: UInt, ptableid: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetOpenTableA(sesid, dbid, sztablename.toCPointer<ByteVar>(), pvparameters.toCPointer<ByteVar>(), cbparameters, grbit, ptableid.toCPointer<ByteVar>())

public actual fun JetOpenTableW(sesid: JET_SESID, dbid: UInt, sztablename: Long, pvparameters: Long, cbparameters: UInt, grbit: UInt, ptableid: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetOpenTableW(sesid, dbid, sztablename.toCPointer<ByteVar>(), pvparameters.toCPointer<ByteVar>(), cbparameters, grbit, ptableid.toCPointer<ByteVar>())

public actual fun JetOpenTempTable(sesid: JET_SESID, prgcolumndef: Long, ccolumn: UInt, grbit: UInt, ptableid: Long, prgcolumnid: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetOpenTempTable(sesid, prgcolumndef.toCPointer<ByteVar>(), ccolumn, grbit, ptableid.toCPointer<ByteVar>(), prgcolumnid.toCPointer<ByteVar>())

public actual fun JetOpenTempTable2(sesid: JET_SESID, prgcolumndef: Long, ccolumn: UInt, lcid: UInt, grbit: UInt, ptableid: Long, prgcolumnid: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetOpenTempTable2(sesid, prgcolumndef.toCPointer<ByteVar>(), ccolumn, lcid, grbit, ptableid.toCPointer<ByteVar>(), prgcolumnid.toCPointer<ByteVar>())

public actual fun JetOpenTempTable3(sesid: JET_SESID, prgcolumndef: Long, ccolumn: UInt, pidxunicode: Long, grbit: UInt, ptableid: Long, prgcolumnid: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetOpenTempTable3(sesid, prgcolumndef.toCPointer<ByteVar>(), ccolumn, pidxunicode.toCPointer<ByteVar>(), grbit, ptableid.toCPointer<ByteVar>(), prgcolumnid.toCPointer<ByteVar>())

public actual fun JetOpenTemporaryTable(sesid: JET_SESID, popentemporarytable: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetOpenTemporaryTable(sesid, popentemporarytable.toCPointer<ByteVar>())

public actual fun JetOpenTemporaryTable2(sesid: JET_SESID, popentemporarytable: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetOpenTemporaryTable2(sesid, popentemporarytable.toCPointer<ByteVar>())

public actual fun JetPrepareUpdate(sesid: JET_SESID, tableid: JET_TABLEID, prep: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetPrepareUpdate(sesid, tableid, prep)

public actual fun JetPrereadIndexRanges(sesid: JET_SESID, tableid: JET_TABLEID, rgindexranges: Long, cindexranges: UInt, pcrangespreread: Long, rgcolumnidpreread: Long, ccolumnidpreread: UInt, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetPrereadIndexRanges(sesid, tableid, rgindexranges.toCPointer<ByteVar>(), cindexranges, pcrangespreread.toCPointer<ByteVar>(), rgcolumnidpreread.toCPointer<ByteVar>(), ccolumnidpreread, grbit)

public actual fun JetPrereadKeys(sesid: JET_SESID, tableid: JET_TABLEID, rgpvkeys: Long, rgcbkeys: Long, ckeys: Int, pckeyspreread: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetPrereadKeys(sesid, tableid, rgpvkeys.toCPointer<ByteVar>(), rgcbkeys.toCPointer<ByteVar>(), ckeys, pckeyspreread.toCPointer<ByteVar>(), grbit)

public actual fun JetReadFile(hffile: JET_HANDLE, pv: Long, cb: UInt, pcbactual: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetReadFile(hffile, pv.toCPointer<ByteVar>(), cb, pcbactual.toCPointer<ByteVar>())

public actual fun JetReadFileInstance(instance: JET_INSTANCE, hffile: JET_HANDLE, pv: Long, cb: UInt, pcbactual: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetReadFileInstance(instance, hffile, pv.toCPointer<ByteVar>(), cb, pcbactual.toCPointer<ByteVar>())

public actual fun JetRegisterCallback(sesid: JET_SESID, tableid: JET_TABLEID, cbtyp: UInt, pcallback: JET_CALLBACK, pvcontext: Long, phcallbackid: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetRegisterCallback(sesid, tableid, cbtyp, pcallback.toLong().toCPointer<ByteVar>(), pvcontext.toCPointer<ByteVar>(), phcallbackid.toCPointer<ByteVar>())

public actual fun JetRenameColumnA(sesid: JET_SESID, tableid: JET_TABLEID, szname: Long, sznamenew: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetRenameColumnA(sesid, tableid, szname.toCPointer<ByteVar>(), sznamenew.toCPointer<ByteVar>(), grbit)

public actual fun JetRenameColumnW(sesid: JET_SESID, tableid: JET_TABLEID, szname: Long, sznamenew: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetRenameColumnW(sesid, tableid, szname.toCPointer<ByteVar>(), sznamenew.toCPointer<ByteVar>(), grbit)

public actual fun JetRenameTableA(sesid: JET_SESID, dbid: UInt, szname: Long, sznamenew: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetRenameTableA(sesid, dbid, szname.toCPointer<ByteVar>(), sznamenew.toCPointer<ByteVar>())

public actual fun JetRenameTableW(sesid: JET_SESID, dbid: UInt, szname: Long, sznamenew: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetRenameTableW(sesid, dbid, szname.toCPointer<ByteVar>(), sznamenew.toCPointer<ByteVar>())

public actual fun JetResetSessionContext(sesid: JET_SESID): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetResetSessionContext(sesid)

public actual fun JetResetTableSequential(sesid: JET_SESID, tableid: JET_TABLEID, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetResetTableSequential(sesid, tableid, grbit)

public actual fun JetResizeDatabase(sesid: JET_SESID, dbid: UInt, cpgtarget: UInt, pcpgactual: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetResizeDatabase(sesid, dbid, cpgtarget, pcpgactual.toCPointer<ByteVar>(), grbit)

public actual fun JetRestore2A(sz: Long, szdest: Long, pfn: JET_PFNSTATUS): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetRestore2A(sz.toCPointer<ByteVar>(), szdest.toCPointer<ByteVar>(), pfn.toLong().toCPointer<ByteVar>())

public actual fun JetRestore2W(sz: Long, szdest: Long, pfn: JET_PFNSTATUS): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetRestore2W(sz.toCPointer<ByteVar>(), szdest.toCPointer<ByteVar>(), pfn.toLong().toCPointer<ByteVar>())

public actual fun JetRestoreA(szsource: Long, pfn: JET_PFNSTATUS): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetRestoreA(szsource.toCPointer<ByteVar>(), pfn.toLong().toCPointer<ByteVar>())

public actual fun JetRestoreInstanceA(instance: JET_INSTANCE, sz: Long, szdest: Long, pfn: JET_PFNSTATUS): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetRestoreInstanceA(instance, sz.toCPointer<ByteVar>(), szdest.toCPointer<ByteVar>(), pfn.toLong().toCPointer<ByteVar>())

public actual fun JetRestoreInstanceW(instance: JET_INSTANCE, sz: Long, szdest: Long, pfn: JET_PFNSTATUS): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetRestoreInstanceW(instance, sz.toCPointer<ByteVar>(), szdest.toCPointer<ByteVar>(), pfn.toLong().toCPointer<ByteVar>())

public actual fun JetRestoreW(szsource: Long, pfn: JET_PFNSTATUS): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetRestoreW(szsource.toCPointer<ByteVar>(), pfn.toLong().toCPointer<ByteVar>())

public actual fun JetRetrieveColumn(sesid: JET_SESID, tableid: JET_TABLEID, columnid: UInt, pvdata: Long, cbdata: UInt, pcbactual: Long, grbit: UInt, pretinfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetRetrieveColumn(sesid, tableid, columnid, pvdata.toCPointer<ByteVar>(), cbdata, pcbactual.toCPointer<ByteVar>(), grbit, pretinfo.toCPointer<ByteVar>())

public actual fun JetRetrieveColumns(sesid: JET_SESID, tableid: JET_TABLEID, pretrievecolumn: Long, cretrievecolumn: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetRetrieveColumns(sesid, tableid, pretrievecolumn.toCPointer<ByteVar>(), cretrievecolumn)

public actual fun JetRetrieveKey(sesid: JET_SESID, tableid: JET_TABLEID, pvkey: Long, cbmax: UInt, pcbactual: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetRetrieveKey(sesid, tableid, pvkey.toCPointer<ByteVar>(), cbmax, pcbactual.toCPointer<ByteVar>(), grbit)

public actual fun JetRollback(sesid: JET_SESID, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetRollback(sesid, grbit)

public actual fun JetSeek(sesid: JET_SESID, tableid: JET_TABLEID, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetSeek(sesid, tableid, grbit)

public actual fun JetSetColumn(sesid: JET_SESID, tableid: JET_TABLEID, columnid: UInt, pvdata: Long, cbdata: UInt, grbit: UInt, psetinfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetSetColumn(sesid, tableid, columnid, pvdata.toCPointer<ByteVar>(), cbdata, grbit, psetinfo.toCPointer<ByteVar>())

public actual fun JetSetColumnDefaultValueA(sesid: JET_SESID, dbid: UInt, sztablename: Long, szcolumnname: Long, pvdata: Long, cbdata: UInt, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetSetColumnDefaultValueA(sesid, dbid, sztablename.toCPointer<ByteVar>(), szcolumnname.toCPointer<ByteVar>(), pvdata.toCPointer<ByteVar>(), cbdata, grbit)

public actual fun JetSetColumnDefaultValueW(sesid: JET_SESID, dbid: UInt, sztablename: Long, szcolumnname: Long, pvdata: Long, cbdata: UInt, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetSetColumnDefaultValueW(sesid, dbid, sztablename.toCPointer<ByteVar>(), szcolumnname.toCPointer<ByteVar>(), pvdata.toCPointer<ByteVar>(), cbdata, grbit)

public actual fun JetSetColumns(sesid: JET_SESID, tableid: JET_TABLEID, psetcolumn: Long, csetcolumn: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetSetColumns(sesid, tableid, psetcolumn.toCPointer<ByteVar>(), csetcolumn)

public actual fun JetSetCurrentIndex2A(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetSetCurrentIndex2A(sesid, tableid, szindexname.toCPointer<ByteVar>(), grbit)

public actual fun JetSetCurrentIndex2W(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetSetCurrentIndex2W(sesid, tableid, szindexname.toCPointer<ByteVar>(), grbit)

public actual fun JetSetCurrentIndex3A(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, grbit: UInt, itagsequence: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetSetCurrentIndex3A(sesid, tableid, szindexname.toCPointer<ByteVar>(), grbit, itagsequence)

public actual fun JetSetCurrentIndex3W(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, grbit: UInt, itagsequence: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetSetCurrentIndex3W(sesid, tableid, szindexname.toCPointer<ByteVar>(), grbit, itagsequence)

public actual fun JetSetCurrentIndex4A(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, pindexid: Long, grbit: UInt, itagsequence: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetSetCurrentIndex4A(sesid, tableid, szindexname.toCPointer<ByteVar>(), pindexid.toCPointer<ByteVar>(), grbit, itagsequence)

public actual fun JetSetCurrentIndex4W(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, pindexid: Long, grbit: UInt, itagsequence: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetSetCurrentIndex4W(sesid, tableid, szindexname.toCPointer<ByteVar>(), pindexid.toCPointer<ByteVar>(), grbit, itagsequence)

public actual fun JetSetCurrentIndexA(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetSetCurrentIndexA(sesid, tableid, szindexname.toCPointer<ByteVar>())

public actual fun JetSetCurrentIndexW(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetSetCurrentIndexW(sesid, tableid, szindexname.toCPointer<ByteVar>())

public actual fun JetSetCursorFilter(sesid: JET_SESID, tableid: JET_TABLEID, rgcolumnfilters: Long, ccolumnfilters: UInt, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetSetCursorFilter(sesid, tableid, rgcolumnfilters.toCPointer<ByteVar>(), ccolumnfilters, grbit)

public actual fun JetSetDatabaseSizeA(sesid: JET_SESID, szdatabasename: Long, cpg: UInt, pcpgreal: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetSetDatabaseSizeA(sesid, szdatabasename.toCPointer<ByteVar>(), cpg, pcpgreal.toCPointer<ByteVar>())

public actual fun JetSetDatabaseSizeW(sesid: JET_SESID, szdatabasename: Long, cpg: UInt, pcpgreal: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetSetDatabaseSizeW(sesid, szdatabasename.toCPointer<ByteVar>(), cpg, pcpgreal.toCPointer<ByteVar>())

public actual fun JetSetIndexRange(sesid: JET_SESID, tableidsrc: JET_TABLEID, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetSetIndexRange(sesid, tableidsrc, grbit)

public actual fun JetSetLS(sesid: JET_SESID, tableid: JET_TABLEID, ls: JET_LS, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetSetLS(sesid, tableid, ls, grbit)

public actual fun JetSetSessionContext(sesid: JET_SESID, ulcontext: JET_API_PTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetSetSessionContext(sesid, ulcontext)

public actual fun JetSetSessionParameter(sesid: JET_SESID, sesparamid: UInt, pvparam: Long, cbparam: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetSetSessionParameter(sesid, sesparamid, pvparam.toCPointer<ByteVar>(), cbparam)

public actual fun JetSetSystemParameterA(pinstance: Long, sesid: JET_SESID, paramid: UInt, lparam: JET_API_PTR, szparam: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetSetSystemParameterA(pinstance.toCPointer<ByteVar>(), sesid, paramid, lparam, szparam.toCPointer<ByteVar>())

public actual fun JetSetSystemParameterW(pinstance: Long, sesid: JET_SESID, paramid: UInt, lparam: JET_API_PTR, szparam: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetSetSystemParameterW(pinstance.toCPointer<ByteVar>(), sesid, paramid, lparam, szparam.toCPointer<ByteVar>())

public actual fun JetSetTableSequential(sesid: JET_SESID, tableid: JET_TABLEID, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetSetTableSequential(sesid, tableid, grbit)

public actual fun JetStopBackup(): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetStopBackup()

public actual fun JetStopBackupInstance(instance: JET_INSTANCE): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetStopBackupInstance(instance)

public actual fun JetStopService(): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetStopService()

public actual fun JetStopServiceInstance(instance: JET_INSTANCE): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetStopServiceInstance(instance)

public actual fun JetStopServiceInstance2(instance: JET_INSTANCE, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetStopServiceInstance2(instance, grbit)

public actual fun JetTerm(instance: JET_INSTANCE): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetTerm(instance)

public actual fun JetTerm2(instance: JET_INSTANCE, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetTerm2(instance, grbit)

public actual fun JetTruncateLog(): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetTruncateLog()

public actual fun JetTruncateLogInstance(instance: JET_INSTANCE): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetTruncateLogInstance(instance)

public actual fun JetUnregisterCallback(sesid: JET_SESID, tableid: JET_TABLEID, cbtyp: UInt, hcallbackid: JET_HANDLE): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetUnregisterCallback(sesid, tableid, cbtyp, hcallbackid)

public actual fun JetUpdate(sesid: JET_SESID, tableid: JET_TABLEID, pvbookmark: Long, cbbookmark: UInt, pcbactual: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetUpdate(sesid, tableid, pvbookmark.toCPointer<ByteVar>(), cbbookmark, pcbactual.toCPointer<ByteVar>())

public actual fun JetUpdate2(sesid: JET_SESID, tableid: JET_TABLEID, pvbookmark: Long, cbbookmark: UInt, pcbactual: Long, grbit: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.jet.cinterop.windowssys_windows_win32_storage_jet_JetUpdate2(sesid, tableid, pvbookmark.toCPointer<ByteVar>(), cbbookmark, pcbactual.toCPointer<ByteVar>(), grbit)
