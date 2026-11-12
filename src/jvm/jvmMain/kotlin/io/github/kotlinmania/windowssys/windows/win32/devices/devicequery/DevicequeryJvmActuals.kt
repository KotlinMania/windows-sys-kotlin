@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.devicequery

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devpropcompkey
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devproperty
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devpropstore
import io.github.kotlinmania.windowssys.windows.win32.foundation.Devpropkey

private object WindowsWin32DevicesDevicequeryJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32DevicesDevicequeryJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDevicequeryDevCloseObjectQuery(hdevquery: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQuery(objecttype: Int, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, cfilterexpressioncount: Int, pfilter: Long, pcallback: Long, pcontext: Long, phdevquery: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryEx(objecttype: Int, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, cfilterexpressioncount: Int, pfilter: Long, cextendedparametercount: Int, pextendedparameters: Long, pcallback: Long, pcontext: Long, phdevquery: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromId(objecttype: Int, pszobjectid: Long, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, cfilterexpressioncount: Int, pfilter: Long, pcallback: Long, pcontext: Long, phdevquery: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIdEx(objecttype: Int, pszobjectid: Long, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, cfilterexpressioncount: Int, pfilter: Long, cextendedparametercount: Int, pextendedparameters: Long, pcallback: Long, pcontext: Long, phdevquery: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIds(objecttype: Int, pszzobjectids: Long, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, cfilterexpressioncount: Int, pfilter: Long, pcallback: Long, pcontext: Long, phdevquery: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIdsEx(objecttype: Int, pszzobjectids: Long, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, cfilterexpressioncount: Int, pfilter: Long, cextendedparametercount: Int, pextendedparameters: Long, pcallback: Long, pcontext: Long, phdevquery: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDevicequeryDevFindProperty(pkey: Long, store: Int, pszlocalename: Long, cproperties: Int, pproperties: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDevicequeryDevFreeObjectProperties(cpropertycount: Int, pproperties: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDevicequeryDevFreeObjects(cobjectcount: Int, pobjects: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDevicequeryDevGetObjectProperties(objecttype: Int, pszobjectid: Long, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, pcpropertycount: Long, ppproperties: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDevicequeryDevGetObjectPropertiesEx(objecttype: Int, pszobjectid: Long, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, cextendedparametercount: Int, pextendedparameters: Long, pcpropertycount: Long, ppproperties: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDevicequeryDevGetObjects(objecttype: Int, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, cfilterexpressioncount: Int, pfilter: Long, pcobjectcount: Long, ppobjects: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDevicequeryDevGetObjectsEx(objecttype: Int, queryflags: Int, crequestedproperties: Int, prequestedproperties: Long, cfilterexpressioncount: Int, pfilter: Long, cextendedparametercount: Int, pextendedparameters: Long, pcobjectcount: Long, ppobjects: Long): Int
}

public actual fun devCloseObjectQuery(hdevquery: Hdevquery) {
    WindowsWin32DevicesDevicequeryJniBridge.windowssysWindowsWin32DevicesDevicequeryDevCloseObjectQuery(hdevquery.rawAddress)
}

public actual fun devCreateObjectQuery(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, pcallback: PdevQueryResultCallback, pcontext: ConstPtr<CVoid>, phdevquery: MutPtr<Hdevquery>): Hresult =
    WindowsWin32DevicesDevicequeryJniBridge.windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQuery(objecttype, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress, cfilterexpressioncount.toInt(), pfilter.rawAddress, 0L, pcontext.rawAddress, phdevquery.rawAddress)

public actual fun devCreateObjectQueryEx(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, cextendedparametercount: UInt, pextendedparameters: ConstPtr<DevQueryParameter>, pcallback: PdevQueryResultCallback, pcontext: ConstPtr<CVoid>, phdevquery: MutPtr<Hdevquery>): Hresult =
    WindowsWin32DevicesDevicequeryJniBridge.windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryEx(objecttype, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress, cfilterexpressioncount.toInt(), pfilter.rawAddress, cextendedparametercount.toInt(), pextendedparameters.rawAddress, 0L, pcontext.rawAddress, phdevquery.rawAddress)

public actual fun devCreateObjectQueryFromId(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, pcallback: PdevQueryResultCallback, pcontext: ConstPtr<CVoid>, phdevquery: MutPtr<Hdevquery>): Hresult =
    WindowsWin32DevicesDevicequeryJniBridge.windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromId(objecttype, pszobjectid.rawAddress, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress, cfilterexpressioncount.toInt(), pfilter.rawAddress, 0L, pcontext.rawAddress, phdevquery.rawAddress)

public actual fun devCreateObjectQueryFromIdEx(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, cextendedparametercount: UInt, pextendedparameters: ConstPtr<DevQueryParameter>, pcallback: PdevQueryResultCallback, pcontext: ConstPtr<CVoid>, phdevquery: MutPtr<Hdevquery>): Hresult =
    WindowsWin32DevicesDevicequeryJniBridge.windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIdEx(objecttype, pszobjectid.rawAddress, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress, cfilterexpressioncount.toInt(), pfilter.rawAddress, cextendedparametercount.toInt(), pextendedparameters.rawAddress, 0L, pcontext.rawAddress, phdevquery.rawAddress)

public actual fun devCreateObjectQueryFromIds(objecttype: DevObjectType, pszzobjectids: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, pcallback: PdevQueryResultCallback, pcontext: ConstPtr<CVoid>, phdevquery: MutPtr<Hdevquery>): Hresult =
    WindowsWin32DevicesDevicequeryJniBridge.windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIds(objecttype, pszzobjectids.rawAddress, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress, cfilterexpressioncount.toInt(), pfilter.rawAddress, 0L, pcontext.rawAddress, phdevquery.rawAddress)

public actual fun devCreateObjectQueryFromIdsEx(objecttype: DevObjectType, pszzobjectids: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, cextendedparametercount: UInt, pextendedparameters: ConstPtr<DevQueryParameter>, pcallback: PdevQueryResultCallback, pcontext: ConstPtr<CVoid>, phdevquery: MutPtr<Hdevquery>): Hresult =
    WindowsWin32DevicesDevicequeryJniBridge.windowssysWindowsWin32DevicesDevicequeryDevCreateObjectQueryFromIdsEx(objecttype, pszzobjectids.rawAddress, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress, cfilterexpressioncount.toInt(), pfilter.rawAddress, cextendedparametercount.toInt(), pextendedparameters.rawAddress, 0L, pcontext.rawAddress, phdevquery.rawAddress)

public actual fun devFindProperty(pkey: ConstPtr<Devpropkey>, store: Devpropstore, pszlocalename: Pcwstr, cproperties: UInt, pproperties: ConstPtr<Devproperty>): MutPtr<Devproperty> =
    MutPtr(WindowsWin32DevicesDevicequeryJniBridge.windowssysWindowsWin32DevicesDevicequeryDevFindProperty(pkey.rawAddress, store, pszlocalename.rawAddress, cproperties.toInt(), pproperties.rawAddress))

public actual fun devFreeObjectProperties(cpropertycount: UInt, pproperties: ConstPtr<Devproperty>) {
    WindowsWin32DevicesDevicequeryJniBridge.windowssysWindowsWin32DevicesDevicequeryDevFreeObjectProperties(cpropertycount.toInt(), pproperties.rawAddress)
}

public actual fun devFreeObjects(cobjectcount: UInt, pobjects: ConstPtr<DevObject>) {
    WindowsWin32DevicesDevicequeryJniBridge.windowssysWindowsWin32DevicesDevicequeryDevFreeObjects(cobjectcount.toInt(), pobjects.rawAddress)
}

public actual fun devGetObjectProperties(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, pcpropertycount: MutPtr<UInt>, ppproperties: MutPtr<MutPtr<Devproperty>>): Hresult =
    WindowsWin32DevicesDevicequeryJniBridge.windowssysWindowsWin32DevicesDevicequeryDevGetObjectProperties(objecttype, pszobjectid.rawAddress, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress, pcpropertycount.rawAddress, ppproperties.rawAddress)

public actual fun devGetObjectPropertiesEx(objecttype: DevObjectType, pszobjectid: Pcwstr, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cextendedparametercount: UInt, pextendedparameters: ConstPtr<DevQueryParameter>, pcpropertycount: MutPtr<UInt>, ppproperties: MutPtr<MutPtr<Devproperty>>): Hresult =
    WindowsWin32DevicesDevicequeryJniBridge.windowssysWindowsWin32DevicesDevicequeryDevGetObjectPropertiesEx(objecttype, pszobjectid.rawAddress, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress, cextendedparametercount.toInt(), pextendedparameters.rawAddress, pcpropertycount.rawAddress, ppproperties.rawAddress)

public actual fun devGetObjects(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, pcobjectcount: MutPtr<UInt>, ppobjects: MutPtr<MutPtr<DevObject>>): Hresult =
    WindowsWin32DevicesDevicequeryJniBridge.windowssysWindowsWin32DevicesDevicequeryDevGetObjects(objecttype, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress, cfilterexpressioncount.toInt(), pfilter.rawAddress, pcobjectcount.rawAddress, ppobjects.rawAddress)

public actual fun devGetObjectsEx(objecttype: DevObjectType, queryflags: UInt, crequestedproperties: UInt, prequestedproperties: ConstPtr<Devpropcompkey>, cfilterexpressioncount: UInt, pfilter: ConstPtr<DevpropFilterExpression>, cextendedparametercount: UInt, pextendedparameters: ConstPtr<DevQueryParameter>, pcobjectcount: MutPtr<UInt>, ppobjects: MutPtr<MutPtr<DevObject>>): Hresult =
    WindowsWin32DevicesDevicequeryJniBridge.windowssysWindowsWin32DevicesDevicequeryDevGetObjectsEx(objecttype, queryflags.toInt(), crequestedproperties.toInt(), prequestedproperties.rawAddress, cfilterexpressioncount.toInt(), pfilter.rawAddress, cextendedparametercount.toInt(), pextendedparameters.rawAddress, pcobjectcount.rawAddress, ppobjects.rawAddress)
