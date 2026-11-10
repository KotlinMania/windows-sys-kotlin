@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.jet

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetApiPtr
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetHandle
import io.github.kotlinmania.windowssys.windows.win32.storage.structuredstorage.JetTableid

private val _windowsWin32StorageJetNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun jetAddColumnA(sesid: JetSesid, tableid: JetTableid, szcolumnname: COpaquePointer?, pcolumndef: COpaquePointer?, pvdefault: COpaquePointer?, cbdefault: UInt, pcolumnid: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetAddColumnA(sesid.toString(), tableid.toString(), (szcolumnname?.value ?: 0L).toString(), (pcolumndef?.value ?: 0L).toString(), (pvdefault?.value ?: 0L).toString(), cbdefault.toInt(), (pcolumnid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetAddColumnW(sesid: JetSesid, tableid: JetTableid, szcolumnname: COpaquePointer?, pcolumndef: COpaquePointer?, pvdefault: COpaquePointer?, cbdefault: UInt, pcolumnid: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetAddColumnW(sesid.toString(), tableid.toString(), (szcolumnname?.value ?: 0L).toString(), (pcolumndef?.value ?: 0L).toString(), (pvdefault?.value ?: 0L).toString(), cbdefault.toInt(), (pcolumnid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetAttachDatabase2A(sesid: JetSesid, szfilename: COpaquePointer?, cpgdatabasesizemax: UInt, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetAttachDatabase2A(sesid.toString(), (szfilename?.value ?: 0L).toString(), cpgdatabasesizemax.toInt(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetAttachDatabase2W(sesid: JetSesid, szfilename: COpaquePointer?, cpgdatabasesizemax: UInt, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetAttachDatabase2W(sesid.toString(), (szfilename?.value ?: 0L).toString(), cpgdatabasesizemax.toInt(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetAttachDatabaseA(sesid: JetSesid, szfilename: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetAttachDatabaseA(sesid.toString(), (szfilename?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetAttachDatabaseW(sesid: JetSesid, szfilename: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetAttachDatabaseW(sesid.toString(), (szfilename?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBackupA(szbackuppath: COpaquePointer?, grbit: UInt, pfnstatus: JetPfnstatus): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetBackupA((szbackuppath?.value ?: 0L).toString(), grbit.toInt(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBackupInstanceA(instance: JetInstance, szbackuppath: COpaquePointer?, grbit: UInt, pfnstatus: JetPfnstatus): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetBackupInstanceA(instance.toString(), (szbackuppath?.value ?: 0L).toString(), grbit.toInt(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBackupInstanceW(instance: JetInstance, szbackuppath: COpaquePointer?, grbit: UInt, pfnstatus: JetPfnstatus): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetBackupInstanceW(instance.toString(), (szbackuppath?.value ?: 0L).toString(), grbit.toInt(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBackupW(szbackuppath: COpaquePointer?, grbit: UInt, pfnstatus: JetPfnstatus): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetBackupW((szbackuppath?.value ?: 0L).toString(), grbit.toInt(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBeginExternalBackup(grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetBeginExternalBackup(grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBeginExternalBackupInstance(instance: JetInstance, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetBeginExternalBackupInstance(instance.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBeginSessionA(instance: JetInstance, psesid: COpaquePointer?, szusername: COpaquePointer?, szpassword: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetBeginSessionA(instance.toString(), (psesid?.value ?: 0L).toString(), (szusername?.value ?: 0L).toString(), (szpassword?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBeginSessionW(instance: JetInstance, psesid: COpaquePointer?, szusername: COpaquePointer?, szpassword: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetBeginSessionW(instance.toString(), (psesid?.value ?: 0L).toString(), (szusername?.value ?: 0L).toString(), (szpassword?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBeginTransaction(sesid: JetSesid): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetBeginTransaction(sesid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBeginTransaction2(sesid: JetSesid, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetBeginTransaction2(sesid.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetBeginTransaction3(sesid: JetSesid, trxid: Long, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetBeginTransaction3(sesid.toString(), trxid.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCloseDatabase(sesid: JetSesid, dbid: UInt, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetCloseDatabase(sesid.toString(), dbid.toInt(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCloseFile(hffile: JetHandle): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetCloseFile(hffile.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCloseFileInstance(instance: JetInstance, hffile: JetHandle): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetCloseFileInstance(instance.toString(), hffile.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCloseTable(sesid: JetSesid, tableid: JetTableid): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetCloseTable(sesid.toString(), tableid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCommitTransaction(sesid: JetSesid, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetCommitTransaction(sesid.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCommitTransaction2(sesid: JetSesid, grbit: UInt, cmsecdurablecommit: UInt, pcommitid: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetCommitTransaction2(sesid.toString(), grbit.toInt(), cmsecdurablecommit.toInt(), (pcommitid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCompactA(sesid: JetSesid, szdatabasesrc: COpaquePointer?, szdatabasedest: COpaquePointer?, pfnstatus: JetPfnstatus, pconvert: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetCompactA(sesid.toString(), (szdatabasesrc?.value ?: 0L).toString(), (szdatabasedest?.value ?: 0L).toString(), 0L.toString(), (pconvert?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCompactW(sesid: JetSesid, szdatabasesrc: COpaquePointer?, szdatabasedest: COpaquePointer?, pfnstatus: JetPfnstatus, pconvert: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetCompactW(sesid.toString(), (szdatabasesrc?.value ?: 0L).toString(), (szdatabasedest?.value ?: 0L).toString(), 0L.toString(), (pconvert?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetComputeStats(sesid: JetSesid, tableid: JetTableid): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetComputeStats(sesid.toString(), tableid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetConfigureProcessForCrashDump(grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetConfigureProcessForCrashDump(grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateDatabase2A(sesid: JetSesid, szfilename: COpaquePointer?, cpgdatabasesizemax: UInt, pdbid: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetCreateDatabase2A(sesid.toString(), (szfilename?.value ?: 0L).toString(), cpgdatabasesizemax.toInt(), (pdbid?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateDatabase2W(sesid: JetSesid, szfilename: COpaquePointer?, cpgdatabasesizemax: UInt, pdbid: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetCreateDatabase2W(sesid.toString(), (szfilename?.value ?: 0L).toString(), cpgdatabasesizemax.toInt(), (pdbid?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateDatabaseA(sesid: JetSesid, szfilename: COpaquePointer?, szconnect: COpaquePointer?, pdbid: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetCreateDatabaseA(sesid.toString(), (szfilename?.value ?: 0L).toString(), (szconnect?.value ?: 0L).toString(), (pdbid?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateDatabaseW(sesid: JetSesid, szfilename: COpaquePointer?, szconnect: COpaquePointer?, pdbid: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetCreateDatabaseW(sesid.toString(), (szfilename?.value ?: 0L).toString(), (szconnect?.value ?: 0L).toString(), (pdbid?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateIndex2A(sesid: JetSesid, tableid: JetTableid, pindexcreate: COpaquePointer?, cindexcreate: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetCreateIndex2A(sesid.toString(), tableid.toString(), (pindexcreate?.value ?: 0L).toString(), cindexcreate.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateIndex2W(sesid: JetSesid, tableid: JetTableid, pindexcreate: COpaquePointer?, cindexcreate: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetCreateIndex2W(sesid.toString(), tableid.toString(), (pindexcreate?.value ?: 0L).toString(), cindexcreate.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateIndex3A(sesid: JetSesid, tableid: JetTableid, pindexcreate: COpaquePointer?, cindexcreate: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetCreateIndex3A(sesid.toString(), tableid.toString(), (pindexcreate?.value ?: 0L).toString(), cindexcreate.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateIndex3W(sesid: JetSesid, tableid: JetTableid, pindexcreate: COpaquePointer?, cindexcreate: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetCreateIndex3W(sesid.toString(), tableid.toString(), (pindexcreate?.value ?: 0L).toString(), cindexcreate.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateIndex4A(sesid: JetSesid, tableid: JetTableid, pindexcreate: COpaquePointer?, cindexcreate: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetCreateIndex4A(sesid.toString(), tableid.toString(), (pindexcreate?.value ?: 0L).toString(), cindexcreate.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateIndex4W(sesid: JetSesid, tableid: JetTableid, pindexcreate: COpaquePointer?, cindexcreate: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetCreateIndex4W(sesid.toString(), tableid.toString(), (pindexcreate?.value ?: 0L).toString(), cindexcreate.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, grbit: UInt, szkey: Pcstr, cbkey: UInt, ldensity: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetCreateIndexA(sesid.toString(), tableid.toString(), (szindexname?.value ?: 0L).toString(), grbit.toInt(), (szkey?.value ?: 0L).toString(), cbkey.toInt(), ldensity.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, grbit: UInt, szkey: Pcwstr, cbkey: UInt, ldensity: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetCreateIndexW(sesid.toString(), tableid.toString(), (szindexname?.value ?: 0L).toString(), grbit.toInt(), (szkey?.value ?: 0L).toString(), cbkey.toInt(), ldensity.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateInstance2A(pinstance: COpaquePointer?, szinstancename: COpaquePointer?, szdisplayname: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetCreateInstance2A((pinstance?.value ?: 0L).toString(), (szinstancename?.value ?: 0L).toString(), (szdisplayname?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateInstance2W(pinstance: COpaquePointer?, szinstancename: COpaquePointer?, szdisplayname: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetCreateInstance2W((pinstance?.value ?: 0L).toString(), (szinstancename?.value ?: 0L).toString(), (szdisplayname?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateInstanceA(pinstance: COpaquePointer?, szinstancename: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetCreateInstanceA((pinstance?.value ?: 0L).toString(), (szinstancename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateInstanceW(pinstance: COpaquePointer?, szinstancename: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetCreateInstanceW((pinstance?.value ?: 0L).toString(), (szinstancename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableA(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, lpages: UInt, ldensity: UInt, ptableid: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetCreateTableA(sesid.toString(), dbid.toInt(), (sztablename?.value ?: 0L).toString(), lpages.toInt(), ldensity.toInt(), (ptableid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableColumnIndex2A(sesid: JetSesid, dbid: UInt, ptablecreate: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex2A(sesid.toString(), dbid.toInt(), (ptablecreate?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableColumnIndex2W(sesid: JetSesid, dbid: UInt, ptablecreate: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex2W(sesid.toString(), dbid.toInt(), (ptablecreate?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableColumnIndex3A(sesid: JetSesid, dbid: UInt, ptablecreate: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex3A(sesid.toString(), dbid.toInt(), (ptablecreate?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableColumnIndex3W(sesid: JetSesid, dbid: UInt, ptablecreate: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex3W(sesid.toString(), dbid.toInt(), (ptablecreate?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableColumnIndex4A(sesid: JetSesid, dbid: UInt, ptablecreate: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex4A(sesid.toString(), dbid.toInt(), (ptablecreate?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableColumnIndex4W(sesid: JetSesid, dbid: UInt, ptablecreate: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetCreateTableColumnIndex4W(sesid.toString(), dbid.toInt(), (ptablecreate?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableColumnIndexA(sesid: JetSesid, dbid: UInt, ptablecreate: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetCreateTableColumnIndexA(sesid.toString(), dbid.toInt(), (ptablecreate?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableColumnIndexW(sesid: JetSesid, dbid: UInt, ptablecreate: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetCreateTableColumnIndexW(sesid.toString(), dbid.toInt(), (ptablecreate?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetCreateTableW(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, lpages: UInt, ldensity: UInt, ptableid: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetCreateTableW(sesid.toString(), dbid.toInt(), (sztablename?.value ?: 0L).toString(), lpages.toInt(), ldensity.toInt(), (ptableid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDefragment2A(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, pcpasses: COpaquePointer?, pcseconds: COpaquePointer?, callback: JetCallback, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetDefragment2A(sesid.toString(), dbid.toInt(), (sztablename?.value ?: 0L).toString(), (pcpasses?.value ?: 0L).toString(), (pcseconds?.value ?: 0L).toString(), 0L.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDefragment2W(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, pcpasses: COpaquePointer?, pcseconds: COpaquePointer?, callback: JetCallback, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetDefragment2W(sesid.toString(), dbid.toInt(), (sztablename?.value ?: 0L).toString(), (pcpasses?.value ?: 0L).toString(), (pcseconds?.value ?: 0L).toString(), 0L.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDefragment3A(sesid: JetSesid, szdatabasename: COpaquePointer?, sztablename: COpaquePointer?, pcpasses: COpaquePointer?, pcseconds: COpaquePointer?, callback: JetCallback, pvcontext: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetDefragment3A(sesid.toString(), (szdatabasename?.value ?: 0L).toString(), (sztablename?.value ?: 0L).toString(), (pcpasses?.value ?: 0L).toString(), (pcseconds?.value ?: 0L).toString(), 0L.toString(), (pvcontext?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDefragment3W(sesid: JetSesid, szdatabasename: COpaquePointer?, sztablename: COpaquePointer?, pcpasses: COpaquePointer?, pcseconds: COpaquePointer?, callback: JetCallback, pvcontext: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetDefragment3W(sesid.toString(), (szdatabasename?.value ?: 0L).toString(), (sztablename?.value ?: 0L).toString(), (pcpasses?.value ?: 0L).toString(), (pcseconds?.value ?: 0L).toString(), 0L.toString(), (pvcontext?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDefragmentA(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, pcpasses: COpaquePointer?, pcseconds: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetDefragmentA(sesid.toString(), dbid.toInt(), (sztablename?.value ?: 0L).toString(), (pcpasses?.value ?: 0L).toString(), (pcseconds?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDefragmentW(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, pcpasses: COpaquePointer?, pcseconds: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetDefragmentW(sesid.toString(), dbid.toInt(), (sztablename?.value ?: 0L).toString(), (pcpasses?.value ?: 0L).toString(), (pcseconds?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDelete(sesid: JetSesid, tableid: JetTableid): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetDelete(sesid.toString(), tableid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDeleteColumn2A(sesid: JetSesid, tableid: JetTableid, szcolumnname: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetDeleteColumn2A(sesid.toString(), tableid.toString(), (szcolumnname?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDeleteColumn2W(sesid: JetSesid, tableid: JetTableid, szcolumnname: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetDeleteColumn2W(sesid.toString(), tableid.toString(), (szcolumnname?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDeleteColumnA(sesid: JetSesid, tableid: JetTableid, szcolumnname: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetDeleteColumnA(sesid.toString(), tableid.toString(), (szcolumnname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDeleteColumnW(sesid: JetSesid, tableid: JetTableid, szcolumnname: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetDeleteColumnW(sesid.toString(), tableid.toString(), (szcolumnname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDeleteIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetDeleteIndexA(sesid.toString(), tableid.toString(), (szindexname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDeleteIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetDeleteIndexW(sesid.toString(), tableid.toString(), (szindexname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDeleteTableA(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetDeleteTableA(sesid.toString(), dbid.toInt(), (sztablename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDeleteTableW(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetDeleteTableW(sesid.toString(), dbid.toInt(), (sztablename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDetachDatabase2A(sesid: JetSesid, szfilename: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetDetachDatabase2A(sesid.toString(), (szfilename?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDetachDatabase2W(sesid: JetSesid, szfilename: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetDetachDatabase2W(sesid.toString(), (szfilename?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDetachDatabaseA(sesid: JetSesid, szfilename: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetDetachDatabaseA(sesid.toString(), (szfilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDetachDatabaseW(sesid: JetSesid, szfilename: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetDetachDatabaseW(sesid.toString(), (szfilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDupCursor(sesid: JetSesid, tableid: JetTableid, ptableid: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetDupCursor(sesid.toString(), tableid.toString(), (ptableid?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetDupSession(sesid: JetSesid, psesid: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetDupSession(sesid.toString(), (psesid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetEnableMultiInstanceA(psetsysparam: COpaquePointer?, csetsysparam: UInt, pcsetsucceed: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetEnableMultiInstanceA((psetsysparam?.value ?: 0L).toString(), csetsysparam.toInt(), (pcsetsucceed?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetEnableMultiInstanceW(psetsysparam: COpaquePointer?, csetsysparam: UInt, pcsetsucceed: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetEnableMultiInstanceW((psetsysparam?.value ?: 0L).toString(), csetsysparam.toInt(), (pcsetsucceed?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetEndExternalBackup(): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetEndExternalBackup() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetEndExternalBackupInstance(instance: JetInstance): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetEndExternalBackupInstance(instance.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetEndExternalBackupInstance2(instance: JetInstance, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetEndExternalBackupInstance2(instance.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetEndSession(sesid: JetSesid, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetEndSession(sesid.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetEnumerateColumns(sesid: JetSesid, tableid: JetTableid, cenumcolumnid: UInt, rgenumcolumnid: COpaquePointer?, pcenumcolumn: COpaquePointer?, prgenumcolumn: COpaquePointer?, pfnrealloc: JetPfnrealloc, pvrealloccontext: COpaquePointer?, cbdatamost: UInt, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetEnumerateColumns(sesid.toString(), tableid.toString(), cenumcolumnid.toInt(), (rgenumcolumnid?.value ?: 0L).toString(), (pcenumcolumn?.value ?: 0L).toString(), (prgenumcolumn?.value ?: 0L).toString(), 0L.toString(), (pvrealloccontext?.value ?: 0L).toString(), cbdatamost.toInt(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetEscrowUpdate(sesid: JetSesid, tableid: JetTableid, columnid: UInt, pv: COpaquePointer?, cbmax: UInt, pvold: COpaquePointer?, cboldmax: UInt, pcboldactual: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetEscrowUpdate(sesid.toString(), tableid.toString(), columnid.toInt(), (pv?.value ?: 0L).toString(), cbmax.toInt(), (pvold?.value ?: 0L).toString(), cboldmax.toInt(), (pcboldactual?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetExternalRestore2A(szcheckpointfilepath: COpaquePointer?, szlogpath: COpaquePointer?, rgrstmap: COpaquePointer?, crstfilemap: Int, szbackuplogpath: COpaquePointer?, ploginfo: COpaquePointer?, sztargetinstancename: COpaquePointer?, sztargetinstancelogpath: COpaquePointer?, sztargetinstancecheckpointpath: COpaquePointer?, pfn: JetPfnstatus): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetExternalRestore2A((szcheckpointfilepath?.value ?: 0L).toString(), (szlogpath?.value ?: 0L).toString(), (rgrstmap?.value ?: 0L).toString(), crstfilemap, (szbackuplogpath?.value ?: 0L).toString(), (ploginfo?.value ?: 0L).toString(), (sztargetinstancename?.value ?: 0L).toString(), (sztargetinstancelogpath?.value ?: 0L).toString(), (sztargetinstancecheckpointpath?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetExternalRestore2W(szcheckpointfilepath: COpaquePointer?, szlogpath: COpaquePointer?, rgrstmap: COpaquePointer?, crstfilemap: Int, szbackuplogpath: COpaquePointer?, ploginfo: COpaquePointer?, sztargetinstancename: COpaquePointer?, sztargetinstancelogpath: COpaquePointer?, sztargetinstancecheckpointpath: COpaquePointer?, pfn: JetPfnstatus): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetExternalRestore2W((szcheckpointfilepath?.value ?: 0L).toString(), (szlogpath?.value ?: 0L).toString(), (rgrstmap?.value ?: 0L).toString(), crstfilemap, (szbackuplogpath?.value ?: 0L).toString(), (ploginfo?.value ?: 0L).toString(), (sztargetinstancename?.value ?: 0L).toString(), (sztargetinstancelogpath?.value ?: 0L).toString(), (sztargetinstancecheckpointpath?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetExternalRestoreA(szcheckpointfilepath: COpaquePointer?, szlogpath: COpaquePointer?, rgrstmap: COpaquePointer?, crstfilemap: Int, szbackuplogpath: COpaquePointer?, genlow: Int, genhigh: Int, pfn: JetPfnstatus): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetExternalRestoreA((szcheckpointfilepath?.value ?: 0L).toString(), (szlogpath?.value ?: 0L).toString(), (rgrstmap?.value ?: 0L).toString(), crstfilemap, (szbackuplogpath?.value ?: 0L).toString(), genlow, genhigh, 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetExternalRestoreW(szcheckpointfilepath: COpaquePointer?, szlogpath: COpaquePointer?, rgrstmap: COpaquePointer?, crstfilemap: Int, szbackuplogpath: COpaquePointer?, genlow: Int, genhigh: Int, pfn: JetPfnstatus): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetExternalRestoreW((szcheckpointfilepath?.value ?: 0L).toString(), (szlogpath?.value ?: 0L).toString(), (rgrstmap?.value ?: 0L).toString(), crstfilemap, (szbackuplogpath?.value ?: 0L).toString(), genlow, genhigh, 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetFreeBuffer(pbbuf: Pcstr): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetFreeBuffer((pbbuf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetAttachInfoA(szzdatabases: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetAttachInfoA((szzdatabases?.value ?: 0L).toString(), cbmax.toInt(), (pcbactual?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetAttachInfoInstanceA(instance: JetInstance, szzdatabases: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetAttachInfoInstanceA(instance.toString(), (szzdatabases?.value ?: 0L).toString(), cbmax.toInt(), (pcbactual?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetAttachInfoInstanceW(instance: JetInstance, szzdatabases: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetAttachInfoInstanceW(instance.toString(), (szzdatabases?.value ?: 0L).toString(), cbmax.toInt(), (pcbactual?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetAttachInfoW(wszzdatabases: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetAttachInfoW((wszzdatabases?.value ?: 0L).toString(), cbmax.toInt(), (pcbactual?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetBookmark(sesid: JetSesid, tableid: JetTableid, pvbookmark: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetBookmark(sesid.toString(), tableid.toString(), (pvbookmark?.value ?: 0L).toString(), cbmax.toInt(), (pcbactual?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetColumnInfoA(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, pcolumnnameorid: COpaquePointer?, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetColumnInfoA(sesid.toString(), dbid.toInt(), (sztablename?.value ?: 0L).toString(), (pcolumnnameorid?.value ?: 0L).toString(), (pvresult?.value ?: 0L).toString(), cbmax.toInt(), infolevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetColumnInfoW(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, pwcolumnnameorid: COpaquePointer?, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetColumnInfoW(sesid.toString(), dbid.toInt(), (sztablename?.value ?: 0L).toString(), (pwcolumnnameorid?.value ?: 0L).toString(), (pvresult?.value ?: 0L).toString(), cbmax.toInt(), infolevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetCurrentIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, cbindexname: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetCurrentIndexA(sesid.toString(), tableid.toString(), (szindexname?.value ?: 0L).toString(), cbindexname.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetCurrentIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, cbindexname: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetCurrentIndexW(sesid.toString(), tableid.toString(), (szindexname?.value ?: 0L).toString(), cbindexname.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetCursorInfo(sesid: JetSesid, tableid: JetTableid, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetCursorInfo(sesid.toString(), tableid.toString(), (pvresult?.value ?: 0L).toString(), cbmax.toInt(), infolevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetDatabaseFileInfoA(szdatabasename: COpaquePointer?, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetDatabaseFileInfoA((szdatabasename?.value ?: 0L).toString(), (pvresult?.value ?: 0L).toString(), cbmax.toInt(), infolevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetDatabaseFileInfoW(szdatabasename: COpaquePointer?, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetDatabaseFileInfoW((szdatabasename?.value ?: 0L).toString(), (pvresult?.value ?: 0L).toString(), cbmax.toInt(), infolevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetDatabaseInfoA(sesid: JetSesid, dbid: UInt, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetDatabaseInfoA(sesid.toString(), dbid.toInt(), (pvresult?.value ?: 0L).toString(), cbmax.toInt(), infolevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetDatabaseInfoW(sesid: JetSesid, dbid: UInt, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetDatabaseInfoW(sesid.toString(), dbid.toInt(), (pvresult?.value ?: 0L).toString(), cbmax.toInt(), infolevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetErrorInfoW(pvcontext: COpaquePointer?, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetErrorInfoW((pvcontext?.value ?: 0L).toString(), (pvresult?.value ?: 0L).toString(), cbmax.toInt(), infolevel.toInt(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetIndexInfoA(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, szindexname: COpaquePointer?, pvresult: COpaquePointer?, cbresult: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetIndexInfoA(sesid.toString(), dbid.toInt(), (sztablename?.value ?: 0L).toString(), (szindexname?.value ?: 0L).toString(), (pvresult?.value ?: 0L).toString(), cbresult.toInt(), infolevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetIndexInfoW(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, szindexname: COpaquePointer?, pvresult: COpaquePointer?, cbresult: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetIndexInfoW(sesid.toString(), dbid.toInt(), (sztablename?.value ?: 0L).toString(), (szindexname?.value ?: 0L).toString(), (pvresult?.value ?: 0L).toString(), cbresult.toInt(), infolevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetInstanceInfoA(pcinstanceinfo: COpaquePointer?, painstanceinfo: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetInstanceInfoA((pcinstanceinfo?.value ?: 0L).toString(), (painstanceinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetInstanceInfoW(pcinstanceinfo: COpaquePointer?, painstanceinfo: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetInstanceInfoW((pcinstanceinfo?.value ?: 0L).toString(), (painstanceinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetInstanceMiscInfo(instance: JetInstance, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetInstanceMiscInfo(instance.toString(), (pvresult?.value ?: 0L).toString(), cbmax.toInt(), infolevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetLS(sesid: JetSesid, tableid: JetTableid, pls: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetLS(sesid.toString(), tableid.toString(), (pls?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetLock(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetLock(sesid.toString(), tableid.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetLogInfoA(szzlogs: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetLogInfoA((szzlogs?.value ?: 0L).toString(), cbmax.toInt(), (pcbactual?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetLogInfoInstance2A(instance: JetInstance, szzlogs: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?, ploginfo: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetLogInfoInstance2A(instance.toString(), (szzlogs?.value ?: 0L).toString(), cbmax.toInt(), (pcbactual?.value ?: 0L).toString(), (ploginfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetLogInfoInstance2W(instance: JetInstance, wszzlogs: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?, ploginfo: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetLogInfoInstance2W(instance.toString(), (wszzlogs?.value ?: 0L).toString(), cbmax.toInt(), (pcbactual?.value ?: 0L).toString(), (ploginfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetLogInfoInstanceA(instance: JetInstance, szzlogs: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetLogInfoInstanceA(instance.toString(), (szzlogs?.value ?: 0L).toString(), cbmax.toInt(), (pcbactual?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetLogInfoInstanceW(instance: JetInstance, wszzlogs: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetLogInfoInstanceW(instance.toString(), (wszzlogs?.value ?: 0L).toString(), cbmax.toInt(), (pcbactual?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetLogInfoW(szzlogs: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetLogInfoW((szzlogs?.value ?: 0L).toString(), cbmax.toInt(), (pcbactual?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetObjectInfoA(sesid: JetSesid, dbid: UInt, objtyp: UInt, szcontainername: COpaquePointer?, szobjectname: COpaquePointer?, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetObjectInfoA(sesid.toString(), dbid.toInt(), objtyp.toInt(), (szcontainername?.value ?: 0L).toString(), (szobjectname?.value ?: 0L).toString(), (pvresult?.value ?: 0L).toString(), cbmax.toInt(), infolevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetObjectInfoW(sesid: JetSesid, dbid: UInt, objtyp: UInt, szcontainername: COpaquePointer?, szobjectname: COpaquePointer?, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetObjectInfoW(sesid.toString(), dbid.toInt(), objtyp.toInt(), (szcontainername?.value ?: 0L).toString(), (szobjectname?.value ?: 0L).toString(), (pvresult?.value ?: 0L).toString(), cbmax.toInt(), infolevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetRecordPosition(sesid: JetSesid, tableid: JetTableid, precpos: COpaquePointer?, cbrecpos: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetRecordPosition(sesid.toString(), tableid.toString(), (precpos?.value ?: 0L).toString(), cbrecpos.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetRecordSize(sesid: JetSesid, tableid: JetTableid, precsize: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetRecordSize(sesid.toString(), tableid.toString(), (precsize?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetRecordSize2(sesid: JetSesid, tableid: JetTableid, precsize: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetRecordSize2(sesid.toString(), tableid.toString(), (precsize?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetSecondaryIndexBookmark(sesid: JetSesid, tableid: JetTableid, pvsecondarykey: COpaquePointer?, cbsecondarykeymax: UInt, pcbsecondarykeyactual: COpaquePointer?, pvprimarybookmark: COpaquePointer?, cbprimarybookmarkmax: UInt, pcbprimarybookmarkactual: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetSecondaryIndexBookmark(sesid.toString(), tableid.toString(), (pvsecondarykey?.value ?: 0L).toString(), cbsecondarykeymax.toInt(), (pcbsecondarykeyactual?.value ?: 0L).toString(), (pvprimarybookmark?.value ?: 0L).toString(), cbprimarybookmarkmax.toInt(), (pcbprimarybookmarkactual?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetSessionParameter(sesid: JetSesid, sesparamid: UInt, pvparam: COpaquePointer?, cbparammax: UInt, pcbparamactual: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetSessionParameter(sesid.toString(), sesparamid.toInt(), (pvparam?.value ?: 0L).toString(), cbparammax.toInt(), (pcbparamactual?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetSystemParameterA(instance: JetInstance, sesid: JetSesid, paramid: UInt, plparam: COpaquePointer?, szparam: COpaquePointer?, cbmax: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetSystemParameterA(instance.toString(), sesid.toString(), paramid.toInt(), (plparam?.value ?: 0L).toString(), (szparam?.value ?: 0L).toString(), cbmax.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetSystemParameterW(instance: JetInstance, sesid: JetSesid, paramid: UInt, plparam: COpaquePointer?, szparam: COpaquePointer?, cbmax: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetSystemParameterW(instance.toString(), sesid.toString(), paramid.toInt(), (plparam?.value ?: 0L).toString(), (szparam?.value ?: 0L).toString(), cbmax.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetTableColumnInfoA(sesid: JetSesid, tableid: JetTableid, szcolumnname: COpaquePointer?, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetTableColumnInfoA(sesid.toString(), tableid.toString(), (szcolumnname?.value ?: 0L).toString(), (pvresult?.value ?: 0L).toString(), cbmax.toInt(), infolevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetTableColumnInfoW(sesid: JetSesid, tableid: JetTableid, szcolumnname: COpaquePointer?, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetTableColumnInfoW(sesid.toString(), tableid.toString(), (szcolumnname?.value ?: 0L).toString(), (pvresult?.value ?: 0L).toString(), cbmax.toInt(), infolevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetTableIndexInfoA(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, pvresult: COpaquePointer?, cbresult: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetTableIndexInfoA(sesid.toString(), tableid.toString(), (szindexname?.value ?: 0L).toString(), (pvresult?.value ?: 0L).toString(), cbresult.toInt(), infolevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetTableIndexInfoW(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, pvresult: COpaquePointer?, cbresult: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetTableIndexInfoW(sesid.toString(), tableid.toString(), (szindexname?.value ?: 0L).toString(), (pvresult?.value ?: 0L).toString(), cbresult.toInt(), infolevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetTableInfoA(sesid: JetSesid, tableid: JetTableid, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetTableInfoA(sesid.toString(), tableid.toString(), (pvresult?.value ?: 0L).toString(), cbmax.toInt(), infolevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetTableInfoW(sesid: JetSesid, tableid: JetTableid, pvresult: COpaquePointer?, cbmax: UInt, infolevel: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetTableInfoW(sesid.toString(), tableid.toString(), (pvresult?.value ?: 0L).toString(), cbmax.toInt(), infolevel.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetThreadStats(pvresult: COpaquePointer?, cbmax: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetThreadStats((pvresult?.value ?: 0L).toString(), cbmax.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetTruncateLogInfoInstanceA(instance: JetInstance, szzlogs: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetTruncateLogInfoInstanceA(instance.toString(), (szzlogs?.value ?: 0L).toString(), cbmax.toInt(), (pcbactual?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetTruncateLogInfoInstanceW(instance: JetInstance, wszzlogs: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetTruncateLogInfoInstanceW(instance.toString(), (wszzlogs?.value ?: 0L).toString(), cbmax.toInt(), (pcbactual?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGetVersion(sesid: JetSesid, pwversion: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGetVersion(sesid.toString(), (pwversion?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGotoBookmark(sesid: JetSesid, tableid: JetTableid, pvbookmark: COpaquePointer?, cbbookmark: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGotoBookmark(sesid.toString(), tableid.toString(), (pvbookmark?.value ?: 0L).toString(), cbbookmark.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGotoPosition(sesid: JetSesid, tableid: JetTableid, precpos: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGotoPosition(sesid.toString(), tableid.toString(), (precpos?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGotoSecondaryIndexBookmark(sesid: JetSesid, tableid: JetTableid, pvsecondarykey: COpaquePointer?, cbsecondarykey: UInt, pvprimarybookmark: COpaquePointer?, cbprimarybookmark: UInt, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGotoSecondaryIndexBookmark(sesid.toString(), tableid.toString(), (pvsecondarykey?.value ?: 0L).toString(), cbsecondarykey.toInt(), (pvprimarybookmark?.value ?: 0L).toString(), cbprimarybookmark.toInt(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetGrowDatabase(sesid: JetSesid, dbid: UInt, cpg: UInt, pcpgreal: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetGrowDatabase(sesid.toString(), dbid.toInt(), cpg.toInt(), (pcpgreal?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetIdle(sesid: JetSesid, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetIdle(sesid.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetIndexRecordCount(sesid: JetSesid, tableid: JetTableid, pcrec: COpaquePointer?, crecmax: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetIndexRecordCount(sesid.toString(), tableid.toString(), (pcrec?.value ?: 0L).toString(), crecmax.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetInit(pinstance: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetInit((pinstance?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetInit2(pinstance: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetInit2((pinstance?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetInit3A(pinstance: COpaquePointer?, prstinfo: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetInit3A((pinstance?.value ?: 0L).toString(), (prstinfo?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetInit3W(pinstance: COpaquePointer?, prstinfo: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetInit3W((pinstance?.value ?: 0L).toString(), (prstinfo?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetIntersectIndexes(sesid: JetSesid, rgindexrange: COpaquePointer?, cindexrange: UInt, precordlist: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetIntersectIndexes(sesid.toString(), (rgindexrange?.value ?: 0L).toString(), cindexrange.toInt(), (precordlist?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetMakeKey(sesid: JetSesid, tableid: JetTableid, pvdata: COpaquePointer?, cbdata: UInt, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetMakeKey(sesid.toString(), tableid.toString(), (pvdata?.value ?: 0L).toString(), cbdata.toInt(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetMove(sesid: JetSesid, tableid: JetTableid, crow: Int, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetMove(sesid.toString(), tableid.toString(), crow, grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotAbort(snapid: JetOssnapid, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetOSSnapshotAbort(snapid.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotEnd(snapid: JetOssnapid, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetOSSnapshotEnd(snapid.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotFreezeA(snapid: JetOssnapid, pcinstanceinfo: COpaquePointer?, painstanceinfo: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetOSSnapshotFreezeA(snapid.toString(), (pcinstanceinfo?.value ?: 0L).toString(), (painstanceinfo?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotFreezeW(snapid: JetOssnapid, pcinstanceinfo: COpaquePointer?, painstanceinfo: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetOSSnapshotFreezeW(snapid.toString(), (pcinstanceinfo?.value ?: 0L).toString(), (painstanceinfo?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotGetFreezeInfoA(snapid: JetOssnapid, pcinstanceinfo: COpaquePointer?, painstanceinfo: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetOSSnapshotGetFreezeInfoA(snapid.toString(), (pcinstanceinfo?.value ?: 0L).toString(), (painstanceinfo?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotGetFreezeInfoW(snapid: JetOssnapid, pcinstanceinfo: COpaquePointer?, painstanceinfo: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetOSSnapshotGetFreezeInfoW(snapid.toString(), (pcinstanceinfo?.value ?: 0L).toString(), (painstanceinfo?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotPrepare(psnapid: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetOSSnapshotPrepare((psnapid?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotPrepareInstance(snapid: JetOssnapid, instance: JetInstance, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetOSSnapshotPrepareInstance(snapid.toString(), instance.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotThaw(snapid: JetOssnapid, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetOSSnapshotThaw(snapid.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotTruncateLog(snapid: JetOssnapid, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetOSSnapshotTruncateLog(snapid.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOSSnapshotTruncateLogInstance(snapid: JetOssnapid, instance: JetInstance, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetOSSnapshotTruncateLogInstance(snapid.toString(), instance.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenDatabaseA(sesid: JetSesid, szfilename: COpaquePointer?, szconnect: COpaquePointer?, pdbid: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetOpenDatabaseA(sesid.toString(), (szfilename?.value ?: 0L).toString(), (szconnect?.value ?: 0L).toString(), (pdbid?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenDatabaseW(sesid: JetSesid, szfilename: COpaquePointer?, szconnect: COpaquePointer?, pdbid: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetOpenDatabaseW(sesid.toString(), (szfilename?.value ?: 0L).toString(), (szconnect?.value ?: 0L).toString(), (pdbid?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenFileA(szfilename: COpaquePointer?, phffile: COpaquePointer?, pulfilesizelow: COpaquePointer?, pulfilesizehigh: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetOpenFileA((szfilename?.value ?: 0L).toString(), (phffile?.value ?: 0L).toString(), (pulfilesizelow?.value ?: 0L).toString(), (pulfilesizehigh?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenFileInstanceA(instance: JetInstance, szfilename: COpaquePointer?, phffile: COpaquePointer?, pulfilesizelow: COpaquePointer?, pulfilesizehigh: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetOpenFileInstanceA(instance.toString(), (szfilename?.value ?: 0L).toString(), (phffile?.value ?: 0L).toString(), (pulfilesizelow?.value ?: 0L).toString(), (pulfilesizehigh?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenFileInstanceW(instance: JetInstance, szfilename: COpaquePointer?, phffile: COpaquePointer?, pulfilesizelow: COpaquePointer?, pulfilesizehigh: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetOpenFileInstanceW(instance.toString(), (szfilename?.value ?: 0L).toString(), (phffile?.value ?: 0L).toString(), (pulfilesizelow?.value ?: 0L).toString(), (pulfilesizehigh?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenFileW(szfilename: COpaquePointer?, phffile: COpaquePointer?, pulfilesizelow: COpaquePointer?, pulfilesizehigh: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetOpenFileW((szfilename?.value ?: 0L).toString(), (phffile?.value ?: 0L).toString(), (pulfilesizelow?.value ?: 0L).toString(), (pulfilesizehigh?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenTableA(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, pvparameters: COpaquePointer?, cbparameters: UInt, grbit: UInt, ptableid: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetOpenTableA(sesid.toString(), dbid.toInt(), (sztablename?.value ?: 0L).toString(), (pvparameters?.value ?: 0L).toString(), cbparameters.toInt(), grbit.toInt(), (ptableid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenTableW(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, pvparameters: COpaquePointer?, cbparameters: UInt, grbit: UInt, ptableid: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetOpenTableW(sesid.toString(), dbid.toInt(), (sztablename?.value ?: 0L).toString(), (pvparameters?.value ?: 0L).toString(), cbparameters.toInt(), grbit.toInt(), (ptableid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenTempTable(sesid: JetSesid, prgcolumndef: COpaquePointer?, ccolumn: UInt, grbit: UInt, ptableid: COpaquePointer?, prgcolumnid: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetOpenTempTable(sesid.toString(), (prgcolumndef?.value ?: 0L).toString(), ccolumn.toInt(), grbit.toInt(), (ptableid?.value ?: 0L).toString(), (prgcolumnid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenTempTable2(sesid: JetSesid, prgcolumndef: COpaquePointer?, ccolumn: UInt, lcid: UInt, grbit: UInt, ptableid: COpaquePointer?, prgcolumnid: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetOpenTempTable2(sesid.toString(), (prgcolumndef?.value ?: 0L).toString(), ccolumn.toInt(), lcid.toInt(), grbit.toInt(), (ptableid?.value ?: 0L).toString(), (prgcolumnid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenTempTable3(sesid: JetSesid, prgcolumndef: COpaquePointer?, ccolumn: UInt, pidxunicode: COpaquePointer?, grbit: UInt, ptableid: COpaquePointer?, prgcolumnid: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetOpenTempTable3(sesid.toString(), (prgcolumndef?.value ?: 0L).toString(), ccolumn.toInt(), (pidxunicode?.value ?: 0L).toString(), grbit.toInt(), (ptableid?.value ?: 0L).toString(), (prgcolumnid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenTemporaryTable(sesid: JetSesid, popentemporarytable: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetOpenTemporaryTable(sesid.toString(), (popentemporarytable?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetOpenTemporaryTable2(sesid: JetSesid, popentemporarytable: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetOpenTemporaryTable2(sesid.toString(), (popentemporarytable?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetPrepareUpdate(sesid: JetSesid, tableid: JetTableid, prep: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetPrepareUpdate(sesid.toString(), tableid.toString(), prep.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetPrereadIndexRanges(sesid: JetSesid, tableid: JetTableid, rgindexranges: COpaquePointer?, cindexranges: UInt, pcrangespreread: COpaquePointer?, rgcolumnidpreread: COpaquePointer?, ccolumnidpreread: UInt, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetPrereadIndexRanges(sesid.toString(), tableid.toString(), (rgindexranges?.value ?: 0L).toString(), cindexranges.toInt(), (pcrangespreread?.value ?: 0L).toString(), (rgcolumnidpreread?.value ?: 0L).toString(), ccolumnidpreread.toInt(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetPrereadKeys(sesid: JetSesid, tableid: JetTableid, rgpvkeys: COpaquePointer?, rgcbkeys: COpaquePointer?, ckeys: Int, pckeyspreread: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetPrereadKeys(sesid.toString(), tableid.toString(), (rgpvkeys?.value ?: 0L).toString(), (rgcbkeys?.value ?: 0L).toString(), ckeys, (pckeyspreread?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetReadFile(hffile: JetHandle, pv: COpaquePointer?, cb: UInt, pcbactual: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetReadFile(hffile.toString(), (pv?.value ?: 0L).toString(), cb.toInt(), (pcbactual?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetReadFileInstance(instance: JetInstance, hffile: JetHandle, pv: COpaquePointer?, cb: UInt, pcbactual: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetReadFileInstance(instance.toString(), hffile.toString(), (pv?.value ?: 0L).toString(), cb.toInt(), (pcbactual?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRegisterCallback(sesid: JetSesid, tableid: JetTableid, cbtyp: UInt, pcallback: JetCallback, pvcontext: COpaquePointer?, phcallbackid: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetRegisterCallback(sesid.toString(), tableid.toString(), cbtyp.toInt(), 0L.toString(), (pvcontext?.value ?: 0L).toString(), (phcallbackid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRenameColumnA(sesid: JetSesid, tableid: JetTableid, szname: COpaquePointer?, sznamenew: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetRenameColumnA(sesid.toString(), tableid.toString(), (szname?.value ?: 0L).toString(), (sznamenew?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRenameColumnW(sesid: JetSesid, tableid: JetTableid, szname: COpaquePointer?, sznamenew: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetRenameColumnW(sesid.toString(), tableid.toString(), (szname?.value ?: 0L).toString(), (sznamenew?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRenameTableA(sesid: JetSesid, dbid: UInt, szname: COpaquePointer?, sznamenew: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetRenameTableA(sesid.toString(), dbid.toInt(), (szname?.value ?: 0L).toString(), (sznamenew?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRenameTableW(sesid: JetSesid, dbid: UInt, szname: COpaquePointer?, sznamenew: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetRenameTableW(sesid.toString(), dbid.toInt(), (szname?.value ?: 0L).toString(), (sznamenew?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetResetSessionContext(sesid: JetSesid): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetResetSessionContext(sesid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetResetTableSequential(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetResetTableSequential(sesid.toString(), tableid.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetResizeDatabase(sesid: JetSesid, dbid: UInt, cpgtarget: UInt, pcpgactual: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetResizeDatabase(sesid.toString(), dbid.toInt(), cpgtarget.toInt(), (pcpgactual?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRestore2A(sz: COpaquePointer?, szdest: COpaquePointer?, pfn: JetPfnstatus): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetRestore2A((sz?.value ?: 0L).toString(), (szdest?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRestore2W(sz: COpaquePointer?, szdest: COpaquePointer?, pfn: JetPfnstatus): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetRestore2W((sz?.value ?: 0L).toString(), (szdest?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRestoreA(szsource: COpaquePointer?, pfn: JetPfnstatus): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetRestoreA((szsource?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRestoreInstanceA(instance: JetInstance, sz: COpaquePointer?, szdest: COpaquePointer?, pfn: JetPfnstatus): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetRestoreInstanceA(instance.toString(), (sz?.value ?: 0L).toString(), (szdest?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRestoreInstanceW(instance: JetInstance, sz: COpaquePointer?, szdest: COpaquePointer?, pfn: JetPfnstatus): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetRestoreInstanceW(instance.toString(), (sz?.value ?: 0L).toString(), (szdest?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRestoreW(szsource: COpaquePointer?, pfn: JetPfnstatus): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetRestoreW((szsource?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRetrieveColumn(sesid: JetSesid, tableid: JetTableid, columnid: UInt, pvdata: COpaquePointer?, cbdata: UInt, pcbactual: COpaquePointer?, grbit: UInt, pretinfo: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetRetrieveColumn(sesid.toString(), tableid.toString(), columnid.toInt(), (pvdata?.value ?: 0L).toString(), cbdata.toInt(), (pcbactual?.value ?: 0L).toString(), grbit.toInt(), (pretinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRetrieveColumns(sesid: JetSesid, tableid: JetTableid, pretrievecolumn: COpaquePointer?, cretrievecolumn: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetRetrieveColumns(sesid.toString(), tableid.toString(), (pretrievecolumn?.value ?: 0L).toString(), cretrievecolumn.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRetrieveKey(sesid: JetSesid, tableid: JetTableid, pvkey: COpaquePointer?, cbmax: UInt, pcbactual: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetRetrieveKey(sesid.toString(), tableid.toString(), (pvkey?.value ?: 0L).toString(), cbmax.toInt(), (pcbactual?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetRollback(sesid: JetSesid, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetRollback(sesid.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSeek(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetSeek(sesid.toString(), tableid.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetColumn(sesid: JetSesid, tableid: JetTableid, columnid: UInt, pvdata: COpaquePointer?, cbdata: UInt, grbit: UInt, psetinfo: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetSetColumn(sesid.toString(), tableid.toString(), columnid.toInt(), (pvdata?.value ?: 0L).toString(), cbdata.toInt(), grbit.toInt(), (psetinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetColumnDefaultValueA(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, szcolumnname: COpaquePointer?, pvdata: COpaquePointer?, cbdata: UInt, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetSetColumnDefaultValueA(sesid.toString(), dbid.toInt(), (sztablename?.value ?: 0L).toString(), (szcolumnname?.value ?: 0L).toString(), (pvdata?.value ?: 0L).toString(), cbdata.toInt(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetColumnDefaultValueW(sesid: JetSesid, dbid: UInt, sztablename: COpaquePointer?, szcolumnname: COpaquePointer?, pvdata: COpaquePointer?, cbdata: UInt, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetSetColumnDefaultValueW(sesid.toString(), dbid.toInt(), (sztablename?.value ?: 0L).toString(), (szcolumnname?.value ?: 0L).toString(), (pvdata?.value ?: 0L).toString(), cbdata.toInt(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetColumns(sesid: JetSesid, tableid: JetTableid, psetcolumn: COpaquePointer?, csetcolumn: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetSetColumns(sesid.toString(), tableid.toString(), (psetcolumn?.value ?: 0L).toString(), csetcolumn.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetCurrentIndex2A(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetSetCurrentIndex2A(sesid.toString(), tableid.toString(), (szindexname?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetCurrentIndex2W(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetSetCurrentIndex2W(sesid.toString(), tableid.toString(), (szindexname?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetCurrentIndex3A(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, grbit: UInt, itagsequence: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetSetCurrentIndex3A(sesid.toString(), tableid.toString(), (szindexname?.value ?: 0L).toString(), grbit.toInt(), itagsequence.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetCurrentIndex3W(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, grbit: UInt, itagsequence: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetSetCurrentIndex3W(sesid.toString(), tableid.toString(), (szindexname?.value ?: 0L).toString(), grbit.toInt(), itagsequence.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetCurrentIndex4A(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, pindexid: COpaquePointer?, grbit: UInt, itagsequence: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetSetCurrentIndex4A(sesid.toString(), tableid.toString(), (szindexname?.value ?: 0L).toString(), (pindexid?.value ?: 0L).toString(), grbit.toInt(), itagsequence.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetCurrentIndex4W(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?, pindexid: COpaquePointer?, grbit: UInt, itagsequence: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetSetCurrentIndex4W(sesid.toString(), tableid.toString(), (szindexname?.value ?: 0L).toString(), (pindexid?.value ?: 0L).toString(), grbit.toInt(), itagsequence.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetCurrentIndexA(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetSetCurrentIndexA(sesid.toString(), tableid.toString(), (szindexname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetCurrentIndexW(sesid: JetSesid, tableid: JetTableid, szindexname: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetSetCurrentIndexW(sesid.toString(), tableid.toString(), (szindexname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetCursorFilter(sesid: JetSesid, tableid: JetTableid, rgcolumnfilters: COpaquePointer?, ccolumnfilters: UInt, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetSetCursorFilter(sesid.toString(), tableid.toString(), (rgcolumnfilters?.value ?: 0L).toString(), ccolumnfilters.toInt(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetDatabaseSizeA(sesid: JetSesid, szdatabasename: COpaquePointer?, cpg: UInt, pcpgreal: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetSetDatabaseSizeA(sesid.toString(), (szdatabasename?.value ?: 0L).toString(), cpg.toInt(), (pcpgreal?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetDatabaseSizeW(sesid: JetSesid, szdatabasename: COpaquePointer?, cpg: UInt, pcpgreal: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetSetDatabaseSizeW(sesid.toString(), (szdatabasename?.value ?: 0L).toString(), cpg.toInt(), (pcpgreal?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetIndexRange(sesid: JetSesid, tableidsrc: JetTableid, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetSetIndexRange(sesid.toString(), tableidsrc.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetLS(sesid: JetSesid, tableid: JetTableid, ls: JetLs, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetSetLS(sesid.toString(), tableid.toString(), ls.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetSessionContext(sesid: JetSesid, ulcontext: JetApiPtr): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetSetSessionContext(sesid.toString(), ulcontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetSessionParameter(sesid: JetSesid, sesparamid: UInt, pvparam: COpaquePointer?, cbparam: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetSetSessionParameter(sesid.toString(), sesparamid.toInt(), (pvparam?.value ?: 0L).toString(), cbparam.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetSystemParameterA(pinstance: COpaquePointer?, sesid: JetSesid, paramid: UInt, lparam: JetApiPtr, szparam: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetSetSystemParameterA((pinstance?.value ?: 0L).toString(), sesid.toString(), paramid.toInt(), lparam.toString(), (szparam?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetSystemParameterW(pinstance: COpaquePointer?, sesid: JetSesid, paramid: UInt, lparam: JetApiPtr, szparam: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetSetSystemParameterW((pinstance?.value ?: 0L).toString(), sesid.toString(), paramid.toInt(), lparam.toString(), (szparam?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetSetTableSequential(sesid: JetSesid, tableid: JetTableid, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetSetTableSequential(sesid.toString(), tableid.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetStopBackup(): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetStopBackup() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetStopBackupInstance(instance: JetInstance): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetStopBackupInstance(instance.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetStopService(): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetStopService() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetStopServiceInstance(instance: JetInstance): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetStopServiceInstance(instance.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetStopServiceInstance2(instance: JetInstance, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetStopServiceInstance2(instance.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetTerm(instance: JetInstance): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetTerm(instance.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetTerm2(instance: JetInstance, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetTerm2(instance.toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetTruncateLog(): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetTruncateLog() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetTruncateLogInstance(instance: JetInstance): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetTruncateLogInstance(instance.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetUnregisterCallback(sesid: JetSesid, tableid: JetTableid, cbtyp: UInt, hcallbackid: JetHandle): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetUnregisterCallback(sesid.toString(), tableid.toString(), cbtyp.toInt(), hcallbackid.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetUpdate(sesid: JetSesid, tableid: JetTableid, pvbookmark: COpaquePointer?, cbbookmark: UInt, pcbactual: COpaquePointer?): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetUpdate(sesid.toString(), tableid.toString(), (pvbookmark?.value ?: 0L).toString(), cbbookmark.toInt(), (pcbactual?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun jetUpdate2(sesid: JetSesid, tableid: JetTableid, pvbookmark: COpaquePointer?, cbbookmark: UInt, pcbactual: COpaquePointer?, grbit: UInt): Int =
    if (_windowsWin32StorageJetNapiAddon != null) (_windowsWin32StorageJetNapiAddon.windowssys_windows_win32_storage_jet_jetUpdate2(sesid.toString(), tableid.toString(), (pvbookmark?.value ?: 0L).toString(), cbbookmark.toInt(), (pcbactual?.value ?: 0L).toString(), grbit.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
