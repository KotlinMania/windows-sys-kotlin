package io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public expect fun WMCreateBackupRestorer(pcallback: Long, ppbackup: Long): HRESULT

public expect fun WMCreateEditor(ppeditor: Long): HRESULT

public expect fun WMCreateIndexer(ppindexer: Long): HRESULT

public expect fun WMCreateProfileManager(ppprofilemanager: Long): HRESULT

public expect fun WMCreateReader(punkcert: Long, dwrights: UInt, ppreader: Long): HRESULT

public expect fun WMCreateSyncReader(punkcert: Long, dwrights: UInt, ppsyncreader: Long): HRESULT

public expect fun WMCreateWriter(punkcert: Long, ppwriter: Long): HRESULT

public expect fun WMCreateWriterFileSink(ppsink: Long): HRESULT

public expect fun WMCreateWriterNetworkSink(ppsink: Long): HRESULT

public expect fun WMCreateWriterPushSink(ppsink: Long): HRESULT

public expect fun WMIsContentProtected(pwszfilename: PCWSTR, pfisprotected: Long): HRESULT
