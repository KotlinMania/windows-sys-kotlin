@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.jet

import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JET_API_PTR
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JET_HANDLE
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JET_TABLEID

private val _windowsWin32StorageJetNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun JetAddColumnA(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long, pcolumndef: Long, pvdefault: Long, cbdefault: UInt, pcolumnid: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetAddColumnA(sesid.toString(), tableid.toString(), szcolumnname.toString(), pcolumndef.toString(), pvdefault.toString(), cbdefault.toInt(), pcolumnid.toString()) as Int) else 0

public actual fun JetAddColumnW(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long, pcolumndef: Long, pvdefault: Long, cbdefault: UInt, pcolumnid: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetAddColumnW(sesid.toString(), tableid.toString(), szcolumnname.toString(), pcolumndef.toString(), pvdefault.toString(), cbdefault.toInt(), pcolumnid.toString()) as Int) else 0

public actual fun JetAttachDatabase2A(sesid: JET_SESID, szfilename: Long, cpgdatabasesizemax: UInt, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetAttachDatabase2A(sesid.toString(), szfilename.toString(), cpgdatabasesizemax.toInt(), grbit.toInt()) as Int) else 0

public actual fun JetAttachDatabase2W(sesid: JET_SESID, szfilename: Long, cpgdatabasesizemax: UInt, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetAttachDatabase2W(sesid.toString(), szfilename.toString(), cpgdatabasesizemax.toInt(), grbit.toInt()) as Int) else 0

public actual fun JetAttachDatabaseA(sesid: JET_SESID, szfilename: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetAttachDatabaseA(sesid.toString(), szfilename.toString(), grbit.toInt()) as Int) else 0

public actual fun JetAttachDatabaseW(sesid: JET_SESID, szfilename: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetAttachDatabaseW(sesid.toString(), szfilename.toString(), grbit.toInt()) as Int) else 0

public actual fun JetBackupA(szbackuppath: Long, grbit: UInt, pfnstatus: JET_PFNSTATUS): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetBackupA(szbackuppath.toString(), grbit.toInt(), pfnstatus.toLong().toString()) as Int) else 0

public actual fun JetBackupInstanceA(instance: JET_INSTANCE, szbackuppath: Long, grbit: UInt, pfnstatus: JET_PFNSTATUS): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetBackupInstanceA(instance.toString(), szbackuppath.toString(), grbit.toInt(), pfnstatus.toLong().toString()) as Int) else 0

public actual fun JetBackupInstanceW(instance: JET_INSTANCE, szbackuppath: Long, grbit: UInt, pfnstatus: JET_PFNSTATUS): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetBackupInstanceW(instance.toString(), szbackuppath.toString(), grbit.toInt(), pfnstatus.toLong().toString()) as Int) else 0

public actual fun JetBackupW(szbackuppath: Long, grbit: UInt, pfnstatus: JET_PFNSTATUS): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetBackupW(szbackuppath.toString(), grbit.toInt(), pfnstatus.toLong().toString()) as Int) else 0

public actual fun JetBeginExternalBackup(grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetBeginExternalBackup(grbit.toInt()) as Int) else 0

public actual fun JetBeginExternalBackupInstance(instance: JET_INSTANCE, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetBeginExternalBackupInstance(instance.toString(), grbit.toInt()) as Int) else 0

public actual fun JetBeginSessionA(instance: JET_INSTANCE, psesid: Long, szusername: Long, szpassword: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetBeginSessionA(instance.toString(), psesid.toString(), szusername.toString(), szpassword.toString()) as Int) else 0

public actual fun JetBeginSessionW(instance: JET_INSTANCE, psesid: Long, szusername: Long, szpassword: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetBeginSessionW(instance.toString(), psesid.toString(), szusername.toString(), szpassword.toString()) as Int) else 0

public actual fun JetBeginTransaction(sesid: JET_SESID): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetBeginTransaction(sesid.toString()) as Int) else 0

public actual fun JetBeginTransaction2(sesid: JET_SESID, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetBeginTransaction2(sesid.toString(), grbit.toInt()) as Int) else 0

public actual fun JetBeginTransaction3(sesid: JET_SESID, trxid: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetBeginTransaction3(sesid.toString(), trxid.toString(), grbit.toInt()) as Int) else 0

public actual fun JetCloseDatabase(sesid: JET_SESID, dbid: UInt, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetCloseDatabase(sesid.toString(), dbid.toInt(), grbit.toInt()) as Int) else 0

public actual fun JetCloseFile(hffile: JET_HANDLE): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetCloseFile(hffile.toString()) as Int) else 0

public actual fun JetCloseFileInstance(instance: JET_INSTANCE, hffile: JET_HANDLE): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetCloseFileInstance(instance.toString(), hffile.toString()) as Int) else 0

public actual fun JetCloseTable(sesid: JET_SESID, tableid: JET_TABLEID): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetCloseTable(sesid.toString(), tableid.toString()) as Int) else 0

public actual fun JetCommitTransaction(sesid: JET_SESID, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetCommitTransaction(sesid.toString(), grbit.toInt()) as Int) else 0

public actual fun JetCommitTransaction2(sesid: JET_SESID, grbit: UInt, cmsecdurablecommit: UInt, pcommitid: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetCommitTransaction2(sesid.toString(), grbit.toInt(), cmsecdurablecommit.toInt(), pcommitid.toString()) as Int) else 0

public actual fun JetCompactA(sesid: JET_SESID, szdatabasesrc: Long, szdatabasedest: Long, pfnstatus: JET_PFNSTATUS, pconvert: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetCompactA(sesid.toString(), szdatabasesrc.toString(), szdatabasedest.toString(), pfnstatus.toLong().toString(), pconvert.toString(), grbit.toInt()) as Int) else 0

public actual fun JetCompactW(sesid: JET_SESID, szdatabasesrc: Long, szdatabasedest: Long, pfnstatus: JET_PFNSTATUS, pconvert: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetCompactW(sesid.toString(), szdatabasesrc.toString(), szdatabasedest.toString(), pfnstatus.toLong().toString(), pconvert.toString(), grbit.toInt()) as Int) else 0

public actual fun JetComputeStats(sesid: JET_SESID, tableid: JET_TABLEID): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetComputeStats(sesid.toString(), tableid.toString()) as Int) else 0

public actual fun JetConfigureProcessForCrashDump(grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetConfigureProcessForCrashDump(grbit.toInt()) as Int) else 0

public actual fun JetCreateDatabase2A(sesid: JET_SESID, szfilename: Long, cpgdatabasesizemax: UInt, pdbid: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetCreateDatabase2A(sesid.toString(), szfilename.toString(), cpgdatabasesizemax.toInt(), pdbid.toString(), grbit.toInt()) as Int) else 0

public actual fun JetCreateDatabase2W(sesid: JET_SESID, szfilename: Long, cpgdatabasesizemax: UInt, pdbid: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetCreateDatabase2W(sesid.toString(), szfilename.toString(), cpgdatabasesizemax.toInt(), pdbid.toString(), grbit.toInt()) as Int) else 0

public actual fun JetCreateDatabaseA(sesid: JET_SESID, szfilename: Long, szconnect: Long, pdbid: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetCreateDatabaseA(sesid.toString(), szfilename.toString(), szconnect.toString(), pdbid.toString(), grbit.toInt()) as Int) else 0

public actual fun JetCreateDatabaseW(sesid: JET_SESID, szfilename: Long, szconnect: Long, pdbid: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetCreateDatabaseW(sesid.toString(), szfilename.toString(), szconnect.toString(), pdbid.toString(), grbit.toInt()) as Int) else 0

public actual fun JetCreateIndex2A(sesid: JET_SESID, tableid: JET_TABLEID, pindexcreate: Long, cindexcreate: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetCreateIndex2A(sesid.toString(), tableid.toString(), pindexcreate.toString(), cindexcreate.toInt()) as Int) else 0

public actual fun JetCreateIndex2W(sesid: JET_SESID, tableid: JET_TABLEID, pindexcreate: Long, cindexcreate: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetCreateIndex2W(sesid.toString(), tableid.toString(), pindexcreate.toString(), cindexcreate.toInt()) as Int) else 0

public actual fun JetCreateIndex3A(sesid: JET_SESID, tableid: JET_TABLEID, pindexcreate: Long, cindexcreate: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetCreateIndex3A(sesid.toString(), tableid.toString(), pindexcreate.toString(), cindexcreate.toInt()) as Int) else 0

public actual fun JetCreateIndex3W(sesid: JET_SESID, tableid: JET_TABLEID, pindexcreate: Long, cindexcreate: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetCreateIndex3W(sesid.toString(), tableid.toString(), pindexcreate.toString(), cindexcreate.toInt()) as Int) else 0

public actual fun JetCreateIndex4A(sesid: JET_SESID, tableid: JET_TABLEID, pindexcreate: Long, cindexcreate: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetCreateIndex4A(sesid.toString(), tableid.toString(), pindexcreate.toString(), cindexcreate.toInt()) as Int) else 0

public actual fun JetCreateIndex4W(sesid: JET_SESID, tableid: JET_TABLEID, pindexcreate: Long, cindexcreate: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetCreateIndex4W(sesid.toString(), tableid.toString(), pindexcreate.toString(), cindexcreate.toInt()) as Int) else 0

public actual fun JetCreateIndexA(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, grbit: UInt, szkey: PCSTR, cbkey: UInt, ldensity: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetCreateIndexA(sesid.toString(), tableid.toString(), szindexname.toString(), grbit.toInt(), szkey.toString(), cbkey.toInt(), ldensity.toInt()) as Int) else 0

public actual fun JetCreateIndexW(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, grbit: UInt, szkey: PCWSTR, cbkey: UInt, ldensity: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetCreateIndexW(sesid.toString(), tableid.toString(), szindexname.toString(), grbit.toInt(), szkey.toString(), cbkey.toInt(), ldensity.toInt()) as Int) else 0

public actual fun JetCreateInstance2A(pinstance: Long, szinstancename: Long, szdisplayname: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetCreateInstance2A(pinstance.toString(), szinstancename.toString(), szdisplayname.toString(), grbit.toInt()) as Int) else 0

public actual fun JetCreateInstance2W(pinstance: Long, szinstancename: Long, szdisplayname: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetCreateInstance2W(pinstance.toString(), szinstancename.toString(), szdisplayname.toString(), grbit.toInt()) as Int) else 0

public actual fun JetCreateInstanceA(pinstance: Long, szinstancename: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetCreateInstanceA(pinstance.toString(), szinstancename.toString()) as Int) else 0

public actual fun JetCreateInstanceW(pinstance: Long, szinstancename: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetCreateInstanceW(pinstance.toString(), szinstancename.toString()) as Int) else 0

public actual fun JetCreateTableA(sesid: JET_SESID, dbid: UInt, sztablename: Long, lpages: UInt, ldensity: UInt, ptableid: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetCreateTableA(sesid.toString(), dbid.toInt(), sztablename.toString(), lpages.toInt(), ldensity.toInt(), ptableid.toString()) as Int) else 0

public actual fun JetCreateTableColumnIndex2A(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex2A(sesid.toString(), dbid.toInt(), ptablecreate.toString()) as Int) else 0

public actual fun JetCreateTableColumnIndex2W(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex2W(sesid.toString(), dbid.toInt(), ptablecreate.toString()) as Int) else 0

public actual fun JetCreateTableColumnIndex3A(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex3A(sesid.toString(), dbid.toInt(), ptablecreate.toString()) as Int) else 0

public actual fun JetCreateTableColumnIndex3W(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex3W(sesid.toString(), dbid.toInt(), ptablecreate.toString()) as Int) else 0

public actual fun JetCreateTableColumnIndex4A(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex4A(sesid.toString(), dbid.toInt(), ptablecreate.toString()) as Int) else 0

public actual fun JetCreateTableColumnIndex4W(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetCreateTableColumnIndex4W(sesid.toString(), dbid.toInt(), ptablecreate.toString()) as Int) else 0

public actual fun JetCreateTableColumnIndexA(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetCreateTableColumnIndexA(sesid.toString(), dbid.toInt(), ptablecreate.toString()) as Int) else 0

public actual fun JetCreateTableColumnIndexW(sesid: JET_SESID, dbid: UInt, ptablecreate: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetCreateTableColumnIndexW(sesid.toString(), dbid.toInt(), ptablecreate.toString()) as Int) else 0

public actual fun JetCreateTableW(sesid: JET_SESID, dbid: UInt, sztablename: Long, lpages: UInt, ldensity: UInt, ptableid: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetCreateTableW(sesid.toString(), dbid.toInt(), sztablename.toString(), lpages.toInt(), ldensity.toInt(), ptableid.toString()) as Int) else 0

public actual fun JetDefragment2A(sesid: JET_SESID, dbid: UInt, sztablename: Long, pcpasses: Long, pcseconds: Long, callback: JET_CALLBACK, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetDefragment2A(sesid.toString(), dbid.toInt(), sztablename.toString(), pcpasses.toString(), pcseconds.toString(), callback.toLong().toString(), grbit.toInt()) as Int) else 0

public actual fun JetDefragment2W(sesid: JET_SESID, dbid: UInt, sztablename: Long, pcpasses: Long, pcseconds: Long, callback: JET_CALLBACK, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetDefragment2W(sesid.toString(), dbid.toInt(), sztablename.toString(), pcpasses.toString(), pcseconds.toString(), callback.toLong().toString(), grbit.toInt()) as Int) else 0

public actual fun JetDefragment3A(sesid: JET_SESID, szdatabasename: Long, sztablename: Long, pcpasses: Long, pcseconds: Long, callback: JET_CALLBACK, pvcontext: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetDefragment3A(sesid.toString(), szdatabasename.toString(), sztablename.toString(), pcpasses.toString(), pcseconds.toString(), callback.toLong().toString(), pvcontext.toString(), grbit.toInt()) as Int) else 0

public actual fun JetDefragment3W(sesid: JET_SESID, szdatabasename: Long, sztablename: Long, pcpasses: Long, pcseconds: Long, callback: JET_CALLBACK, pvcontext: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetDefragment3W(sesid.toString(), szdatabasename.toString(), sztablename.toString(), pcpasses.toString(), pcseconds.toString(), callback.toLong().toString(), pvcontext.toString(), grbit.toInt()) as Int) else 0

public actual fun JetDefragmentA(sesid: JET_SESID, dbid: UInt, sztablename: Long, pcpasses: Long, pcseconds: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetDefragmentA(sesid.toString(), dbid.toInt(), sztablename.toString(), pcpasses.toString(), pcseconds.toString(), grbit.toInt()) as Int) else 0

public actual fun JetDefragmentW(sesid: JET_SESID, dbid: UInt, sztablename: Long, pcpasses: Long, pcseconds: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetDefragmentW(sesid.toString(), dbid.toInt(), sztablename.toString(), pcpasses.toString(), pcseconds.toString(), grbit.toInt()) as Int) else 0

public actual fun JetDelete(sesid: JET_SESID, tableid: JET_TABLEID): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetDelete(sesid.toString(), tableid.toString()) as Int) else 0

public actual fun JetDeleteColumn2A(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetDeleteColumn2A(sesid.toString(), tableid.toString(), szcolumnname.toString(), grbit.toInt()) as Int) else 0

public actual fun JetDeleteColumn2W(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetDeleteColumn2W(sesid.toString(), tableid.toString(), szcolumnname.toString(), grbit.toInt()) as Int) else 0

public actual fun JetDeleteColumnA(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetDeleteColumnA(sesid.toString(), tableid.toString(), szcolumnname.toString()) as Int) else 0

public actual fun JetDeleteColumnW(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetDeleteColumnW(sesid.toString(), tableid.toString(), szcolumnname.toString()) as Int) else 0

public actual fun JetDeleteIndexA(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetDeleteIndexA(sesid.toString(), tableid.toString(), szindexname.toString()) as Int) else 0

public actual fun JetDeleteIndexW(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetDeleteIndexW(sesid.toString(), tableid.toString(), szindexname.toString()) as Int) else 0

public actual fun JetDeleteTableA(sesid: JET_SESID, dbid: UInt, sztablename: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetDeleteTableA(sesid.toString(), dbid.toInt(), sztablename.toString()) as Int) else 0

public actual fun JetDeleteTableW(sesid: JET_SESID, dbid: UInt, sztablename: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetDeleteTableW(sesid.toString(), dbid.toInt(), sztablename.toString()) as Int) else 0

public actual fun JetDetachDatabase2A(sesid: JET_SESID, szfilename: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetDetachDatabase2A(sesid.toString(), szfilename.toString(), grbit.toInt()) as Int) else 0

public actual fun JetDetachDatabase2W(sesid: JET_SESID, szfilename: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetDetachDatabase2W(sesid.toString(), szfilename.toString(), grbit.toInt()) as Int) else 0

public actual fun JetDetachDatabaseA(sesid: JET_SESID, szfilename: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetDetachDatabaseA(sesid.toString(), szfilename.toString()) as Int) else 0

public actual fun JetDetachDatabaseW(sesid: JET_SESID, szfilename: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetDetachDatabaseW(sesid.toString(), szfilename.toString()) as Int) else 0

public actual fun JetDupCursor(sesid: JET_SESID, tableid: JET_TABLEID, ptableid: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetDupCursor(sesid.toString(), tableid.toString(), ptableid.toString(), grbit.toInt()) as Int) else 0

public actual fun JetDupSession(sesid: JET_SESID, psesid: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetDupSession(sesid.toString(), psesid.toString()) as Int) else 0

public actual fun JetEnableMultiInstanceA(psetsysparam: Long, csetsysparam: UInt, pcsetsucceed: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetEnableMultiInstanceA(psetsysparam.toString(), csetsysparam.toInt(), pcsetsucceed.toString()) as Int) else 0

public actual fun JetEnableMultiInstanceW(psetsysparam: Long, csetsysparam: UInt, pcsetsucceed: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetEnableMultiInstanceW(psetsysparam.toString(), csetsysparam.toInt(), pcsetsucceed.toString()) as Int) else 0

public actual fun JetEndExternalBackup(): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetEndExternalBackup() as Int) else 0

public actual fun JetEndExternalBackupInstance(instance: JET_INSTANCE): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetEndExternalBackupInstance(instance.toString()) as Int) else 0

public actual fun JetEndExternalBackupInstance2(instance: JET_INSTANCE, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetEndExternalBackupInstance2(instance.toString(), grbit.toInt()) as Int) else 0

public actual fun JetEndSession(sesid: JET_SESID, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetEndSession(sesid.toString(), grbit.toInt()) as Int) else 0

public actual fun JetEnumerateColumns(sesid: JET_SESID, tableid: JET_TABLEID, cenumcolumnid: UInt, rgenumcolumnid: Long, pcenumcolumn: Long, prgenumcolumn: Long, pfnrealloc: JET_PFNREALLOC, pvrealloccontext: Long, cbdatamost: UInt, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetEnumerateColumns(sesid.toString(), tableid.toString(), cenumcolumnid.toInt(), rgenumcolumnid.toString(), pcenumcolumn.toString(), prgenumcolumn.toString(), pfnrealloc.toLong().toString(), pvrealloccontext.toString(), cbdatamost.toInt(), grbit.toInt()) as Int) else 0

public actual fun JetEscrowUpdate(sesid: JET_SESID, tableid: JET_TABLEID, columnid: UInt, pv: Long, cbmax: UInt, pvold: Long, cboldmax: UInt, pcboldactual: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetEscrowUpdate(sesid.toString(), tableid.toString(), columnid.toInt(), pv.toString(), cbmax.toInt(), pvold.toString(), cboldmax.toInt(), pcboldactual.toString(), grbit.toInt()) as Int) else 0

public actual fun JetExternalRestore2A(szcheckpointfilepath: Long, szlogpath: Long, rgrstmap: Long, crstfilemap: Int, szbackuplogpath: Long, ploginfo: Long, sztargetinstancename: Long, sztargetinstancelogpath: Long, sztargetinstancecheckpointpath: Long, pfn: JET_PFNSTATUS): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetExternalRestore2A(szcheckpointfilepath.toString(), szlogpath.toString(), rgrstmap.toString(), crstfilemap, szbackuplogpath.toString(), ploginfo.toString(), sztargetinstancename.toString(), sztargetinstancelogpath.toString(), sztargetinstancecheckpointpath.toString(), pfn.toLong().toString()) as Int) else 0

public actual fun JetExternalRestore2W(szcheckpointfilepath: Long, szlogpath: Long, rgrstmap: Long, crstfilemap: Int, szbackuplogpath: Long, ploginfo: Long, sztargetinstancename: Long, sztargetinstancelogpath: Long, sztargetinstancecheckpointpath: Long, pfn: JET_PFNSTATUS): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetExternalRestore2W(szcheckpointfilepath.toString(), szlogpath.toString(), rgrstmap.toString(), crstfilemap, szbackuplogpath.toString(), ploginfo.toString(), sztargetinstancename.toString(), sztargetinstancelogpath.toString(), sztargetinstancecheckpointpath.toString(), pfn.toLong().toString()) as Int) else 0

public actual fun JetExternalRestoreA(szcheckpointfilepath: Long, szlogpath: Long, rgrstmap: Long, crstfilemap: Int, szbackuplogpath: Long, genlow: Int, genhigh: Int, pfn: JET_PFNSTATUS): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetExternalRestoreA(szcheckpointfilepath.toString(), szlogpath.toString(), rgrstmap.toString(), crstfilemap, szbackuplogpath.toString(), genlow, genhigh, pfn.toLong().toString()) as Int) else 0

public actual fun JetExternalRestoreW(szcheckpointfilepath: Long, szlogpath: Long, rgrstmap: Long, crstfilemap: Int, szbackuplogpath: Long, genlow: Int, genhigh: Int, pfn: JET_PFNSTATUS): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetExternalRestoreW(szcheckpointfilepath.toString(), szlogpath.toString(), rgrstmap.toString(), crstfilemap, szbackuplogpath.toString(), genlow, genhigh, pfn.toLong().toString()) as Int) else 0

public actual fun JetFreeBuffer(pbbuf: PCSTR): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetFreeBuffer(pbbuf.toString()) as Int) else 0

public actual fun JetGetAttachInfoA(szzdatabases: Long, cbmax: UInt, pcbactual: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetAttachInfoA(szzdatabases.toString(), cbmax.toInt(), pcbactual.toString()) as Int) else 0

public actual fun JetGetAttachInfoInstanceA(instance: JET_INSTANCE, szzdatabases: Long, cbmax: UInt, pcbactual: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetAttachInfoInstanceA(instance.toString(), szzdatabases.toString(), cbmax.toInt(), pcbactual.toString()) as Int) else 0

public actual fun JetGetAttachInfoInstanceW(instance: JET_INSTANCE, szzdatabases: Long, cbmax: UInt, pcbactual: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetAttachInfoInstanceW(instance.toString(), szzdatabases.toString(), cbmax.toInt(), pcbactual.toString()) as Int) else 0

public actual fun JetGetAttachInfoW(wszzdatabases: Long, cbmax: UInt, pcbactual: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetAttachInfoW(wszzdatabases.toString(), cbmax.toInt(), pcbactual.toString()) as Int) else 0

public actual fun JetGetBookmark(sesid: JET_SESID, tableid: JET_TABLEID, pvbookmark: Long, cbmax: UInt, pcbactual: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetBookmark(sesid.toString(), tableid.toString(), pvbookmark.toString(), cbmax.toInt(), pcbactual.toString()) as Int) else 0

public actual fun JetGetColumnInfoA(sesid: JET_SESID, dbid: UInt, sztablename: Long, pcolumnnameorid: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetColumnInfoA(sesid.toString(), dbid.toInt(), sztablename.toString(), pcolumnnameorid.toString(), pvresult.toString(), cbmax.toInt(), infolevel.toInt()) as Int) else 0

public actual fun JetGetColumnInfoW(sesid: JET_SESID, dbid: UInt, sztablename: Long, pwcolumnnameorid: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetColumnInfoW(sesid.toString(), dbid.toInt(), sztablename.toString(), pwcolumnnameorid.toString(), pvresult.toString(), cbmax.toInt(), infolevel.toInt()) as Int) else 0

public actual fun JetGetCurrentIndexA(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, cbindexname: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetCurrentIndexA(sesid.toString(), tableid.toString(), szindexname.toString(), cbindexname.toInt()) as Int) else 0

public actual fun JetGetCurrentIndexW(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, cbindexname: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetCurrentIndexW(sesid.toString(), tableid.toString(), szindexname.toString(), cbindexname.toInt()) as Int) else 0

public actual fun JetGetCursorInfo(sesid: JET_SESID, tableid: JET_TABLEID, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetCursorInfo(sesid.toString(), tableid.toString(), pvresult.toString(), cbmax.toInt(), infolevel.toInt()) as Int) else 0

public actual fun JetGetDatabaseFileInfoA(szdatabasename: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetDatabaseFileInfoA(szdatabasename.toString(), pvresult.toString(), cbmax.toInt(), infolevel.toInt()) as Int) else 0

public actual fun JetGetDatabaseFileInfoW(szdatabasename: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetDatabaseFileInfoW(szdatabasename.toString(), pvresult.toString(), cbmax.toInt(), infolevel.toInt()) as Int) else 0

public actual fun JetGetDatabaseInfoA(sesid: JET_SESID, dbid: UInt, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetDatabaseInfoA(sesid.toString(), dbid.toInt(), pvresult.toString(), cbmax.toInt(), infolevel.toInt()) as Int) else 0

public actual fun JetGetDatabaseInfoW(sesid: JET_SESID, dbid: UInt, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetDatabaseInfoW(sesid.toString(), dbid.toInt(), pvresult.toString(), cbmax.toInt(), infolevel.toInt()) as Int) else 0

public actual fun JetGetErrorInfoW(pvcontext: Long, pvresult: Long, cbmax: UInt, infolevel: UInt, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetErrorInfoW(pvcontext.toString(), pvresult.toString(), cbmax.toInt(), infolevel.toInt(), grbit.toInt()) as Int) else 0

public actual fun JetGetIndexInfoA(sesid: JET_SESID, dbid: UInt, sztablename: Long, szindexname: Long, pvresult: Long, cbresult: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetIndexInfoA(sesid.toString(), dbid.toInt(), sztablename.toString(), szindexname.toString(), pvresult.toString(), cbresult.toInt(), infolevel.toInt()) as Int) else 0

public actual fun JetGetIndexInfoW(sesid: JET_SESID, dbid: UInt, sztablename: Long, szindexname: Long, pvresult: Long, cbresult: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetIndexInfoW(sesid.toString(), dbid.toInt(), sztablename.toString(), szindexname.toString(), pvresult.toString(), cbresult.toInt(), infolevel.toInt()) as Int) else 0

public actual fun JetGetInstanceInfoA(pcinstanceinfo: Long, painstanceinfo: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetInstanceInfoA(pcinstanceinfo.toString(), painstanceinfo.toString()) as Int) else 0

public actual fun JetGetInstanceInfoW(pcinstanceinfo: Long, painstanceinfo: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetInstanceInfoW(pcinstanceinfo.toString(), painstanceinfo.toString()) as Int) else 0

public actual fun JetGetInstanceMiscInfo(instance: JET_INSTANCE, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetInstanceMiscInfo(instance.toString(), pvresult.toString(), cbmax.toInt(), infolevel.toInt()) as Int) else 0

public actual fun JetGetLS(sesid: JET_SESID, tableid: JET_TABLEID, pls: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetLS(sesid.toString(), tableid.toString(), pls.toString(), grbit.toInt()) as Int) else 0

public actual fun JetGetLock(sesid: JET_SESID, tableid: JET_TABLEID, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetLock(sesid.toString(), tableid.toString(), grbit.toInt()) as Int) else 0

public actual fun JetGetLogInfoA(szzlogs: Long, cbmax: UInt, pcbactual: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetLogInfoA(szzlogs.toString(), cbmax.toInt(), pcbactual.toString()) as Int) else 0

public actual fun JetGetLogInfoInstance2A(instance: JET_INSTANCE, szzlogs: Long, cbmax: UInt, pcbactual: Long, ploginfo: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetLogInfoInstance2A(instance.toString(), szzlogs.toString(), cbmax.toInt(), pcbactual.toString(), ploginfo.toString()) as Int) else 0

public actual fun JetGetLogInfoInstance2W(instance: JET_INSTANCE, wszzlogs: Long, cbmax: UInt, pcbactual: Long, ploginfo: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetLogInfoInstance2W(instance.toString(), wszzlogs.toString(), cbmax.toInt(), pcbactual.toString(), ploginfo.toString()) as Int) else 0

public actual fun JetGetLogInfoInstanceA(instance: JET_INSTANCE, szzlogs: Long, cbmax: UInt, pcbactual: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetLogInfoInstanceA(instance.toString(), szzlogs.toString(), cbmax.toInt(), pcbactual.toString()) as Int) else 0

public actual fun JetGetLogInfoInstanceW(instance: JET_INSTANCE, wszzlogs: Long, cbmax: UInt, pcbactual: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetLogInfoInstanceW(instance.toString(), wszzlogs.toString(), cbmax.toInt(), pcbactual.toString()) as Int) else 0

public actual fun JetGetLogInfoW(szzlogs: Long, cbmax: UInt, pcbactual: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetLogInfoW(szzlogs.toString(), cbmax.toInt(), pcbactual.toString()) as Int) else 0

public actual fun JetGetObjectInfoA(sesid: JET_SESID, dbid: UInt, objtyp: UInt, szcontainername: Long, szobjectname: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetObjectInfoA(sesid.toString(), dbid.toInt(), objtyp.toInt(), szcontainername.toString(), szobjectname.toString(), pvresult.toString(), cbmax.toInt(), infolevel.toInt()) as Int) else 0

public actual fun JetGetObjectInfoW(sesid: JET_SESID, dbid: UInt, objtyp: UInt, szcontainername: Long, szobjectname: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetObjectInfoW(sesid.toString(), dbid.toInt(), objtyp.toInt(), szcontainername.toString(), szobjectname.toString(), pvresult.toString(), cbmax.toInt(), infolevel.toInt()) as Int) else 0

public actual fun JetGetRecordPosition(sesid: JET_SESID, tableid: JET_TABLEID, precpos: Long, cbrecpos: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetRecordPosition(sesid.toString(), tableid.toString(), precpos.toString(), cbrecpos.toInt()) as Int) else 0

public actual fun JetGetRecordSize(sesid: JET_SESID, tableid: JET_TABLEID, precsize: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetRecordSize(sesid.toString(), tableid.toString(), precsize.toString(), grbit.toInt()) as Int) else 0

public actual fun JetGetRecordSize2(sesid: JET_SESID, tableid: JET_TABLEID, precsize: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetRecordSize2(sesid.toString(), tableid.toString(), precsize.toString(), grbit.toInt()) as Int) else 0

public actual fun JetGetSecondaryIndexBookmark(sesid: JET_SESID, tableid: JET_TABLEID, pvsecondarykey: Long, cbsecondarykeymax: UInt, pcbsecondarykeyactual: Long, pvprimarybookmark: Long, cbprimarybookmarkmax: UInt, pcbprimarybookmarkactual: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetSecondaryIndexBookmark(sesid.toString(), tableid.toString(), pvsecondarykey.toString(), cbsecondarykeymax.toInt(), pcbsecondarykeyactual.toString(), pvprimarybookmark.toString(), cbprimarybookmarkmax.toInt(), pcbprimarybookmarkactual.toString(), grbit.toInt()) as Int) else 0

public actual fun JetGetSessionParameter(sesid: JET_SESID, sesparamid: UInt, pvparam: Long, cbparammax: UInt, pcbparamactual: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetSessionParameter(sesid.toString(), sesparamid.toInt(), pvparam.toString(), cbparammax.toInt(), pcbparamactual.toString()) as Int) else 0

public actual fun JetGetSystemParameterA(instance: JET_INSTANCE, sesid: JET_SESID, paramid: UInt, plparam: Long, szparam: Long, cbmax: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetSystemParameterA(instance.toString(), sesid.toString(), paramid.toInt(), plparam.toString(), szparam.toString(), cbmax.toInt()) as Int) else 0

public actual fun JetGetSystemParameterW(instance: JET_INSTANCE, sesid: JET_SESID, paramid: UInt, plparam: Long, szparam: Long, cbmax: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetSystemParameterW(instance.toString(), sesid.toString(), paramid.toInt(), plparam.toString(), szparam.toString(), cbmax.toInt()) as Int) else 0

public actual fun JetGetTableColumnInfoA(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetTableColumnInfoA(sesid.toString(), tableid.toString(), szcolumnname.toString(), pvresult.toString(), cbmax.toInt(), infolevel.toInt()) as Int) else 0

public actual fun JetGetTableColumnInfoW(sesid: JET_SESID, tableid: JET_TABLEID, szcolumnname: Long, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetTableColumnInfoW(sesid.toString(), tableid.toString(), szcolumnname.toString(), pvresult.toString(), cbmax.toInt(), infolevel.toInt()) as Int) else 0

public actual fun JetGetTableIndexInfoA(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, pvresult: Long, cbresult: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetTableIndexInfoA(sesid.toString(), tableid.toString(), szindexname.toString(), pvresult.toString(), cbresult.toInt(), infolevel.toInt()) as Int) else 0

public actual fun JetGetTableIndexInfoW(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, pvresult: Long, cbresult: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetTableIndexInfoW(sesid.toString(), tableid.toString(), szindexname.toString(), pvresult.toString(), cbresult.toInt(), infolevel.toInt()) as Int) else 0

public actual fun JetGetTableInfoA(sesid: JET_SESID, tableid: JET_TABLEID, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetTableInfoA(sesid.toString(), tableid.toString(), pvresult.toString(), cbmax.toInt(), infolevel.toInt()) as Int) else 0

public actual fun JetGetTableInfoW(sesid: JET_SESID, tableid: JET_TABLEID, pvresult: Long, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetTableInfoW(sesid.toString(), tableid.toString(), pvresult.toString(), cbmax.toInt(), infolevel.toInt()) as Int) else 0

public actual fun JetGetThreadStats(pvresult: Long, cbmax: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetThreadStats(pvresult.toString(), cbmax.toInt()) as Int) else 0

public actual fun JetGetTruncateLogInfoInstanceA(instance: JET_INSTANCE, szzlogs: Long, cbmax: UInt, pcbactual: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetTruncateLogInfoInstanceA(instance.toString(), szzlogs.toString(), cbmax.toInt(), pcbactual.toString()) as Int) else 0

public actual fun JetGetTruncateLogInfoInstanceW(instance: JET_INSTANCE, wszzlogs: Long, cbmax: UInt, pcbactual: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetTruncateLogInfoInstanceW(instance.toString(), wszzlogs.toString(), cbmax.toInt(), pcbactual.toString()) as Int) else 0

public actual fun JetGetVersion(sesid: JET_SESID, pwversion: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGetVersion(sesid.toString(), pwversion.toString()) as Int) else 0

public actual fun JetGotoBookmark(sesid: JET_SESID, tableid: JET_TABLEID, pvbookmark: Long, cbbookmark: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGotoBookmark(sesid.toString(), tableid.toString(), pvbookmark.toString(), cbbookmark.toInt()) as Int) else 0

public actual fun JetGotoPosition(sesid: JET_SESID, tableid: JET_TABLEID, precpos: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGotoPosition(sesid.toString(), tableid.toString(), precpos.toString()) as Int) else 0

public actual fun JetGotoSecondaryIndexBookmark(sesid: JET_SESID, tableid: JET_TABLEID, pvsecondarykey: Long, cbsecondarykey: UInt, pvprimarybookmark: Long, cbprimarybookmark: UInt, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGotoSecondaryIndexBookmark(sesid.toString(), tableid.toString(), pvsecondarykey.toString(), cbsecondarykey.toInt(), pvprimarybookmark.toString(), cbprimarybookmark.toInt(), grbit.toInt()) as Int) else 0

public actual fun JetGrowDatabase(sesid: JET_SESID, dbid: UInt, cpg: UInt, pcpgreal: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetGrowDatabase(sesid.toString(), dbid.toInt(), cpg.toInt(), pcpgreal.toString()) as Int) else 0

public actual fun JetIdle(sesid: JET_SESID, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetIdle(sesid.toString(), grbit.toInt()) as Int) else 0

public actual fun JetIndexRecordCount(sesid: JET_SESID, tableid: JET_TABLEID, pcrec: Long, crecmax: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetIndexRecordCount(sesid.toString(), tableid.toString(), pcrec.toString(), crecmax.toInt()) as Int) else 0

public actual fun JetInit(pinstance: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetInit(pinstance.toString()) as Int) else 0

public actual fun JetInit2(pinstance: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetInit2(pinstance.toString(), grbit.toInt()) as Int) else 0

public actual fun JetInit3A(pinstance: Long, prstinfo: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetInit3A(pinstance.toString(), prstinfo.toString(), grbit.toInt()) as Int) else 0

public actual fun JetInit3W(pinstance: Long, prstinfo: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetInit3W(pinstance.toString(), prstinfo.toString(), grbit.toInt()) as Int) else 0

public actual fun JetIntersectIndexes(sesid: JET_SESID, rgindexrange: Long, cindexrange: UInt, precordlist: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetIntersectIndexes(sesid.toString(), rgindexrange.toString(), cindexrange.toInt(), precordlist.toString(), grbit.toInt()) as Int) else 0

public actual fun JetMakeKey(sesid: JET_SESID, tableid: JET_TABLEID, pvdata: Long, cbdata: UInt, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetMakeKey(sesid.toString(), tableid.toString(), pvdata.toString(), cbdata.toInt(), grbit.toInt()) as Int) else 0

public actual fun JetMove(sesid: JET_SESID, tableid: JET_TABLEID, crow: Int, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetMove(sesid.toString(), tableid.toString(), crow, grbit.toInt()) as Int) else 0

public actual fun JetOSSnapshotAbort(snapid: JET_OSSNAPID, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetOSSnapshotAbort(snapid.toString(), grbit.toInt()) as Int) else 0

public actual fun JetOSSnapshotEnd(snapid: JET_OSSNAPID, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetOSSnapshotEnd(snapid.toString(), grbit.toInt()) as Int) else 0

public actual fun JetOSSnapshotFreezeA(snapid: JET_OSSNAPID, pcinstanceinfo: Long, painstanceinfo: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetOSSnapshotFreezeA(snapid.toString(), pcinstanceinfo.toString(), painstanceinfo.toString(), grbit.toInt()) as Int) else 0

public actual fun JetOSSnapshotFreezeW(snapid: JET_OSSNAPID, pcinstanceinfo: Long, painstanceinfo: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetOSSnapshotFreezeW(snapid.toString(), pcinstanceinfo.toString(), painstanceinfo.toString(), grbit.toInt()) as Int) else 0

public actual fun JetOSSnapshotGetFreezeInfoA(snapid: JET_OSSNAPID, pcinstanceinfo: Long, painstanceinfo: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetOSSnapshotGetFreezeInfoA(snapid.toString(), pcinstanceinfo.toString(), painstanceinfo.toString(), grbit.toInt()) as Int) else 0

public actual fun JetOSSnapshotGetFreezeInfoW(snapid: JET_OSSNAPID, pcinstanceinfo: Long, painstanceinfo: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetOSSnapshotGetFreezeInfoW(snapid.toString(), pcinstanceinfo.toString(), painstanceinfo.toString(), grbit.toInt()) as Int) else 0

public actual fun JetOSSnapshotPrepare(psnapid: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetOSSnapshotPrepare(psnapid.toString(), grbit.toInt()) as Int) else 0

public actual fun JetOSSnapshotPrepareInstance(snapid: JET_OSSNAPID, instance: JET_INSTANCE, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetOSSnapshotPrepareInstance(snapid.toString(), instance.toString(), grbit.toInt()) as Int) else 0

public actual fun JetOSSnapshotThaw(snapid: JET_OSSNAPID, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetOSSnapshotThaw(snapid.toString(), grbit.toInt()) as Int) else 0

public actual fun JetOSSnapshotTruncateLog(snapid: JET_OSSNAPID, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetOSSnapshotTruncateLog(snapid.toString(), grbit.toInt()) as Int) else 0

public actual fun JetOSSnapshotTruncateLogInstance(snapid: JET_OSSNAPID, instance: JET_INSTANCE, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetOSSnapshotTruncateLogInstance(snapid.toString(), instance.toString(), grbit.toInt()) as Int) else 0

public actual fun JetOpenDatabaseA(sesid: JET_SESID, szfilename: Long, szconnect: Long, pdbid: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetOpenDatabaseA(sesid.toString(), szfilename.toString(), szconnect.toString(), pdbid.toString(), grbit.toInt()) as Int) else 0

public actual fun JetOpenDatabaseW(sesid: JET_SESID, szfilename: Long, szconnect: Long, pdbid: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetOpenDatabaseW(sesid.toString(), szfilename.toString(), szconnect.toString(), pdbid.toString(), grbit.toInt()) as Int) else 0

public actual fun JetOpenFileA(szfilename: Long, phffile: Long, pulfilesizelow: Long, pulfilesizehigh: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetOpenFileA(szfilename.toString(), phffile.toString(), pulfilesizelow.toString(), pulfilesizehigh.toString()) as Int) else 0

public actual fun JetOpenFileInstanceA(instance: JET_INSTANCE, szfilename: Long, phffile: Long, pulfilesizelow: Long, pulfilesizehigh: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetOpenFileInstanceA(instance.toString(), szfilename.toString(), phffile.toString(), pulfilesizelow.toString(), pulfilesizehigh.toString()) as Int) else 0

public actual fun JetOpenFileInstanceW(instance: JET_INSTANCE, szfilename: Long, phffile: Long, pulfilesizelow: Long, pulfilesizehigh: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetOpenFileInstanceW(instance.toString(), szfilename.toString(), phffile.toString(), pulfilesizelow.toString(), pulfilesizehigh.toString()) as Int) else 0

public actual fun JetOpenFileW(szfilename: Long, phffile: Long, pulfilesizelow: Long, pulfilesizehigh: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetOpenFileW(szfilename.toString(), phffile.toString(), pulfilesizelow.toString(), pulfilesizehigh.toString()) as Int) else 0

public actual fun JetOpenTableA(sesid: JET_SESID, dbid: UInt, sztablename: Long, pvparameters: Long, cbparameters: UInt, grbit: UInt, ptableid: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetOpenTableA(sesid.toString(), dbid.toInt(), sztablename.toString(), pvparameters.toString(), cbparameters.toInt(), grbit.toInt(), ptableid.toString()) as Int) else 0

public actual fun JetOpenTableW(sesid: JET_SESID, dbid: UInt, sztablename: Long, pvparameters: Long, cbparameters: UInt, grbit: UInt, ptableid: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetOpenTableW(sesid.toString(), dbid.toInt(), sztablename.toString(), pvparameters.toString(), cbparameters.toInt(), grbit.toInt(), ptableid.toString()) as Int) else 0

public actual fun JetOpenTempTable(sesid: JET_SESID, prgcolumndef: Long, ccolumn: UInt, grbit: UInt, ptableid: Long, prgcolumnid: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetOpenTempTable(sesid.toString(), prgcolumndef.toString(), ccolumn.toInt(), grbit.toInt(), ptableid.toString(), prgcolumnid.toString()) as Int) else 0

public actual fun JetOpenTempTable2(sesid: JET_SESID, prgcolumndef: Long, ccolumn: UInt, lcid: UInt, grbit: UInt, ptableid: Long, prgcolumnid: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetOpenTempTable2(sesid.toString(), prgcolumndef.toString(), ccolumn.toInt(), lcid.toInt(), grbit.toInt(), ptableid.toString(), prgcolumnid.toString()) as Int) else 0

public actual fun JetOpenTempTable3(sesid: JET_SESID, prgcolumndef: Long, ccolumn: UInt, pidxunicode: Long, grbit: UInt, ptableid: Long, prgcolumnid: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetOpenTempTable3(sesid.toString(), prgcolumndef.toString(), ccolumn.toInt(), pidxunicode.toString(), grbit.toInt(), ptableid.toString(), prgcolumnid.toString()) as Int) else 0

public actual fun JetOpenTemporaryTable(sesid: JET_SESID, popentemporarytable: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetOpenTemporaryTable(sesid.toString(), popentemporarytable.toString()) as Int) else 0

public actual fun JetOpenTemporaryTable2(sesid: JET_SESID, popentemporarytable: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetOpenTemporaryTable2(sesid.toString(), popentemporarytable.toString()) as Int) else 0

public actual fun JetPrepareUpdate(sesid: JET_SESID, tableid: JET_TABLEID, prep: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetPrepareUpdate(sesid.toString(), tableid.toString(), prep.toInt()) as Int) else 0

public actual fun JetPrereadIndexRanges(sesid: JET_SESID, tableid: JET_TABLEID, rgindexranges: Long, cindexranges: UInt, pcrangespreread: Long, rgcolumnidpreread: Long, ccolumnidpreread: UInt, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetPrereadIndexRanges(sesid.toString(), tableid.toString(), rgindexranges.toString(), cindexranges.toInt(), pcrangespreread.toString(), rgcolumnidpreread.toString(), ccolumnidpreread.toInt(), grbit.toInt()) as Int) else 0

public actual fun JetPrereadKeys(sesid: JET_SESID, tableid: JET_TABLEID, rgpvkeys: Long, rgcbkeys: Long, ckeys: Int, pckeyspreread: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetPrereadKeys(sesid.toString(), tableid.toString(), rgpvkeys.toString(), rgcbkeys.toString(), ckeys, pckeyspreread.toString(), grbit.toInt()) as Int) else 0

public actual fun JetReadFile(hffile: JET_HANDLE, pv: Long, cb: UInt, pcbactual: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetReadFile(hffile.toString(), pv.toString(), cb.toInt(), pcbactual.toString()) as Int) else 0

public actual fun JetReadFileInstance(instance: JET_INSTANCE, hffile: JET_HANDLE, pv: Long, cb: UInt, pcbactual: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetReadFileInstance(instance.toString(), hffile.toString(), pv.toString(), cb.toInt(), pcbactual.toString()) as Int) else 0

public actual fun JetRegisterCallback(sesid: JET_SESID, tableid: JET_TABLEID, cbtyp: UInt, pcallback: JET_CALLBACK, pvcontext: Long, phcallbackid: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetRegisterCallback(sesid.toString(), tableid.toString(), cbtyp.toInt(), pcallback.toLong().toString(), pvcontext.toString(), phcallbackid.toString()) as Int) else 0

public actual fun JetRenameColumnA(sesid: JET_SESID, tableid: JET_TABLEID, szname: Long, sznamenew: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetRenameColumnA(sesid.toString(), tableid.toString(), szname.toString(), sznamenew.toString(), grbit.toInt()) as Int) else 0

public actual fun JetRenameColumnW(sesid: JET_SESID, tableid: JET_TABLEID, szname: Long, sznamenew: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetRenameColumnW(sesid.toString(), tableid.toString(), szname.toString(), sznamenew.toString(), grbit.toInt()) as Int) else 0

public actual fun JetRenameTableA(sesid: JET_SESID, dbid: UInt, szname: Long, sznamenew: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetRenameTableA(sesid.toString(), dbid.toInt(), szname.toString(), sznamenew.toString()) as Int) else 0

public actual fun JetRenameTableW(sesid: JET_SESID, dbid: UInt, szname: Long, sznamenew: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetRenameTableW(sesid.toString(), dbid.toInt(), szname.toString(), sznamenew.toString()) as Int) else 0

public actual fun JetResetSessionContext(sesid: JET_SESID): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetResetSessionContext(sesid.toString()) as Int) else 0

public actual fun JetResetTableSequential(sesid: JET_SESID, tableid: JET_TABLEID, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetResetTableSequential(sesid.toString(), tableid.toString(), grbit.toInt()) as Int) else 0

public actual fun JetResizeDatabase(sesid: JET_SESID, dbid: UInt, cpgtarget: UInt, pcpgactual: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetResizeDatabase(sesid.toString(), dbid.toInt(), cpgtarget.toInt(), pcpgactual.toString(), grbit.toInt()) as Int) else 0

public actual fun JetRestore2A(sz: Long, szdest: Long, pfn: JET_PFNSTATUS): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetRestore2A(sz.toString(), szdest.toString(), pfn.toLong().toString()) as Int) else 0

public actual fun JetRestore2W(sz: Long, szdest: Long, pfn: JET_PFNSTATUS): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetRestore2W(sz.toString(), szdest.toString(), pfn.toLong().toString()) as Int) else 0

public actual fun JetRestoreA(szsource: Long, pfn: JET_PFNSTATUS): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetRestoreA(szsource.toString(), pfn.toLong().toString()) as Int) else 0

public actual fun JetRestoreInstanceA(instance: JET_INSTANCE, sz: Long, szdest: Long, pfn: JET_PFNSTATUS): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetRestoreInstanceA(instance.toString(), sz.toString(), szdest.toString(), pfn.toLong().toString()) as Int) else 0

public actual fun JetRestoreInstanceW(instance: JET_INSTANCE, sz: Long, szdest: Long, pfn: JET_PFNSTATUS): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetRestoreInstanceW(instance.toString(), sz.toString(), szdest.toString(), pfn.toLong().toString()) as Int) else 0

public actual fun JetRestoreW(szsource: Long, pfn: JET_PFNSTATUS): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetRestoreW(szsource.toString(), pfn.toLong().toString()) as Int) else 0

public actual fun JetRetrieveColumn(sesid: JET_SESID, tableid: JET_TABLEID, columnid: UInt, pvdata: Long, cbdata: UInt, pcbactual: Long, grbit: UInt, pretinfo: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetRetrieveColumn(sesid.toString(), tableid.toString(), columnid.toInt(), pvdata.toString(), cbdata.toInt(), pcbactual.toString(), grbit.toInt(), pretinfo.toString()) as Int) else 0

public actual fun JetRetrieveColumns(sesid: JET_SESID, tableid: JET_TABLEID, pretrievecolumn: Long, cretrievecolumn: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetRetrieveColumns(sesid.toString(), tableid.toString(), pretrievecolumn.toString(), cretrievecolumn.toInt()) as Int) else 0

public actual fun JetRetrieveKey(sesid: JET_SESID, tableid: JET_TABLEID, pvkey: Long, cbmax: UInt, pcbactual: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetRetrieveKey(sesid.toString(), tableid.toString(), pvkey.toString(), cbmax.toInt(), pcbactual.toString(), grbit.toInt()) as Int) else 0

public actual fun JetRollback(sesid: JET_SESID, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetRollback(sesid.toString(), grbit.toInt()) as Int) else 0

public actual fun JetSeek(sesid: JET_SESID, tableid: JET_TABLEID, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetSeek(sesid.toString(), tableid.toString(), grbit.toInt()) as Int) else 0

public actual fun JetSetColumn(sesid: JET_SESID, tableid: JET_TABLEID, columnid: UInt, pvdata: Long, cbdata: UInt, grbit: UInt, psetinfo: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetSetColumn(sesid.toString(), tableid.toString(), columnid.toInt(), pvdata.toString(), cbdata.toInt(), grbit.toInt(), psetinfo.toString()) as Int) else 0

public actual fun JetSetColumnDefaultValueA(sesid: JET_SESID, dbid: UInt, sztablename: Long, szcolumnname: Long, pvdata: Long, cbdata: UInt, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetSetColumnDefaultValueA(sesid.toString(), dbid.toInt(), sztablename.toString(), szcolumnname.toString(), pvdata.toString(), cbdata.toInt(), grbit.toInt()) as Int) else 0

public actual fun JetSetColumnDefaultValueW(sesid: JET_SESID, dbid: UInt, sztablename: Long, szcolumnname: Long, pvdata: Long, cbdata: UInt, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetSetColumnDefaultValueW(sesid.toString(), dbid.toInt(), sztablename.toString(), szcolumnname.toString(), pvdata.toString(), cbdata.toInt(), grbit.toInt()) as Int) else 0

public actual fun JetSetColumns(sesid: JET_SESID, tableid: JET_TABLEID, psetcolumn: Long, csetcolumn: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetSetColumns(sesid.toString(), tableid.toString(), psetcolumn.toString(), csetcolumn.toInt()) as Int) else 0

public actual fun JetSetCurrentIndex2A(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetSetCurrentIndex2A(sesid.toString(), tableid.toString(), szindexname.toString(), grbit.toInt()) as Int) else 0

public actual fun JetSetCurrentIndex2W(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetSetCurrentIndex2W(sesid.toString(), tableid.toString(), szindexname.toString(), grbit.toInt()) as Int) else 0

public actual fun JetSetCurrentIndex3A(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, grbit: UInt, itagsequence: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetSetCurrentIndex3A(sesid.toString(), tableid.toString(), szindexname.toString(), grbit.toInt(), itagsequence.toInt()) as Int) else 0

public actual fun JetSetCurrentIndex3W(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, grbit: UInt, itagsequence: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetSetCurrentIndex3W(sesid.toString(), tableid.toString(), szindexname.toString(), grbit.toInt(), itagsequence.toInt()) as Int) else 0

public actual fun JetSetCurrentIndex4A(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, pindexid: Long, grbit: UInt, itagsequence: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetSetCurrentIndex4A(sesid.toString(), tableid.toString(), szindexname.toString(), pindexid.toString(), grbit.toInt(), itagsequence.toInt()) as Int) else 0

public actual fun JetSetCurrentIndex4W(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long, pindexid: Long, grbit: UInt, itagsequence: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetSetCurrentIndex4W(sesid.toString(), tableid.toString(), szindexname.toString(), pindexid.toString(), grbit.toInt(), itagsequence.toInt()) as Int) else 0

public actual fun JetSetCurrentIndexA(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetSetCurrentIndexA(sesid.toString(), tableid.toString(), szindexname.toString()) as Int) else 0

public actual fun JetSetCurrentIndexW(sesid: JET_SESID, tableid: JET_TABLEID, szindexname: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetSetCurrentIndexW(sesid.toString(), tableid.toString(), szindexname.toString()) as Int) else 0

public actual fun JetSetCursorFilter(sesid: JET_SESID, tableid: JET_TABLEID, rgcolumnfilters: Long, ccolumnfilters: UInt, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetSetCursorFilter(sesid.toString(), tableid.toString(), rgcolumnfilters.toString(), ccolumnfilters.toInt(), grbit.toInt()) as Int) else 0

public actual fun JetSetDatabaseSizeA(sesid: JET_SESID, szdatabasename: Long, cpg: UInt, pcpgreal: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetSetDatabaseSizeA(sesid.toString(), szdatabasename.toString(), cpg.toInt(), pcpgreal.toString()) as Int) else 0

public actual fun JetSetDatabaseSizeW(sesid: JET_SESID, szdatabasename: Long, cpg: UInt, pcpgreal: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetSetDatabaseSizeW(sesid.toString(), szdatabasename.toString(), cpg.toInt(), pcpgreal.toString()) as Int) else 0

public actual fun JetSetIndexRange(sesid: JET_SESID, tableidsrc: JET_TABLEID, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetSetIndexRange(sesid.toString(), tableidsrc.toString(), grbit.toInt()) as Int) else 0

public actual fun JetSetLS(sesid: JET_SESID, tableid: JET_TABLEID, ls: JET_LS, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetSetLS(sesid.toString(), tableid.toString(), ls.toString(), grbit.toInt()) as Int) else 0

public actual fun JetSetSessionContext(sesid: JET_SESID, ulcontext: JET_API_PTR): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetSetSessionContext(sesid.toString(), ulcontext.toString()) as Int) else 0

public actual fun JetSetSessionParameter(sesid: JET_SESID, sesparamid: UInt, pvparam: Long, cbparam: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetSetSessionParameter(sesid.toString(), sesparamid.toInt(), pvparam.toString(), cbparam.toInt()) as Int) else 0

public actual fun JetSetSystemParameterA(pinstance: Long, sesid: JET_SESID, paramid: UInt, lparam: JET_API_PTR, szparam: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetSetSystemParameterA(pinstance.toString(), sesid.toString(), paramid.toInt(), lparam.toString(), szparam.toString()) as Int) else 0

public actual fun JetSetSystemParameterW(pinstance: Long, sesid: JET_SESID, paramid: UInt, lparam: JET_API_PTR, szparam: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetSetSystemParameterW(pinstance.toString(), sesid.toString(), paramid.toInt(), lparam.toString(), szparam.toString()) as Int) else 0

public actual fun JetSetTableSequential(sesid: JET_SESID, tableid: JET_TABLEID, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetSetTableSequential(sesid.toString(), tableid.toString(), grbit.toInt()) as Int) else 0

public actual fun JetStopBackup(): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetStopBackup() as Int) else 0

public actual fun JetStopBackupInstance(instance: JET_INSTANCE): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetStopBackupInstance(instance.toString()) as Int) else 0

public actual fun JetStopService(): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetStopService() as Int) else 0

public actual fun JetStopServiceInstance(instance: JET_INSTANCE): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetStopServiceInstance(instance.toString()) as Int) else 0

public actual fun JetStopServiceInstance2(instance: JET_INSTANCE, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetStopServiceInstance2(instance.toString(), grbit.toInt()) as Int) else 0

public actual fun JetTerm(instance: JET_INSTANCE): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetTerm(instance.toString()) as Int) else 0

public actual fun JetTerm2(instance: JET_INSTANCE, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetTerm2(instance.toString(), grbit.toInt()) as Int) else 0

public actual fun JetTruncateLog(): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetTruncateLog() as Int) else 0

public actual fun JetTruncateLogInstance(instance: JET_INSTANCE): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetTruncateLogInstance(instance.toString()) as Int) else 0

public actual fun JetUnregisterCallback(sesid: JET_SESID, tableid: JET_TABLEID, cbtyp: UInt, hcallbackid: JET_HANDLE): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetUnregisterCallback(sesid.toString(), tableid.toString(), cbtyp.toInt(), hcallbackid.toString()) as Int) else 0

public actual fun JetUpdate(sesid: JET_SESID, tableid: JET_TABLEID, pvbookmark: Long, cbbookmark: UInt, pcbactual: Long): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetUpdate(sesid.toString(), tableid.toString(), pvbookmark.toString(), cbbookmark.toInt(), pcbactual.toString()) as Int) else 0

public actual fun JetUpdate2(sesid: JET_SESID, tableid: JET_TABLEID, pvbookmark: Long, cbbookmark: UInt, pcbactual: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_JetUpdate2(sesid.toString(), tableid.toString(), pvbookmark.toString(), cbbookmark.toInt(), pcbactual.toString(), grbit.toInt()) as Int) else 0
