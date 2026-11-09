@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public actual fun WMCreateBackupRestorer(pcallback: Long, ppbackup: Long): HRESULT =
    0

public actual fun WMCreateEditor(ppeditor: Long): HRESULT =
    0

public actual fun WMCreateIndexer(ppindexer: Long): HRESULT =
    0

public actual fun WMCreateProfileManager(ppprofilemanager: Long): HRESULT =
    0

public actual fun WMCreateReader(punkcert: Long, dwrights: UInt, ppreader: Long): HRESULT =
    0

public actual fun WMCreateSyncReader(punkcert: Long, dwrights: UInt, ppsyncreader: Long): HRESULT =
    0

public actual fun WMCreateWriter(punkcert: Long, ppwriter: Long): HRESULT =
    0

public actual fun WMCreateWriterFileSink(ppsink: Long): HRESULT =
    0

public actual fun WMCreateWriterNetworkSink(ppsink: Long): HRESULT =
    0

public actual fun WMCreateWriterPushSink(ppsink: Long): HRESULT =
    0

public actual fun WMIsContentProtected(pwszfilename: PCWSTR, pfisprotected: Long): HRESULT =
    0
