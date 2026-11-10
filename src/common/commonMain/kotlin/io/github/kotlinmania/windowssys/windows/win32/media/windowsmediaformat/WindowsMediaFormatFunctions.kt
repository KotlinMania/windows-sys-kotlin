package io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

public expect fun wMCreateBackupRestorer(pcallback: COpaquePointer?, ppbackup: COpaquePointer?): Hresult

public expect fun wMCreateEditor(ppeditor: COpaquePointer?): Hresult

public expect fun wMCreateIndexer(ppindexer: COpaquePointer?): Hresult

public expect fun wMCreateProfileManager(ppprofilemanager: COpaquePointer?): Hresult

public expect fun wMCreateReader(punkcert: COpaquePointer?, dwrights: UInt, ppreader: COpaquePointer?): Hresult

public expect fun wMCreateSyncReader(punkcert: COpaquePointer?, dwrights: UInt, ppsyncreader: COpaquePointer?): Hresult

public expect fun wMCreateWriter(punkcert: COpaquePointer?, ppwriter: COpaquePointer?): Hresult

public expect fun wMCreateWriterFileSink(ppsink: COpaquePointer?): Hresult

public expect fun wMCreateWriterNetworkSink(ppsink: COpaquePointer?): Hresult

public expect fun wMCreateWriterPushSink(ppsink: COpaquePointer?): Hresult

public expect fun wMIsContentProtected(pwszfilename: Pcwstr, pfisprotected: COpaquePointer?): Hresult
