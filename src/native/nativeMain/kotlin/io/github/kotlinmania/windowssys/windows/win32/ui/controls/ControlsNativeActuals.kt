@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.controls

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Colorref
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.foundation.Size
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.DrawEdgeFlags
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.DrawTextFormat
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.DrawedgeFlags
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbrush
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hrgn
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Logfontw
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Rgbquad
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Textmetricw
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsBeginBufferedAnimation
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsBeginBufferedPaint
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsBeginPanningFeedback
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsBufferedPaintClear
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsBufferedPaintInit
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsBufferedPaintRenderAnimation
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsBufferedPaintSetAlpha
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsBufferedPaintStopAllAnimations
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsBufferedPaintUnInit
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsCheckDlgButton
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsCheckRadioButton
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsCloseThemeData
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsCreateMappedBitmap
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsCreatePropertySheetPageA
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsCreatePropertySheetPageW
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsCreateStatusWindowA
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsCreateStatusWindowW
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsCreateSyntheticPointerDevice
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsCreateToolbarEx
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsCreateUpDownControl
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDestroyPropertySheetPage
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDestroySyntheticPointerDevice
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDlgDirListA
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDlgDirListComboBoxA
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDlgDirListComboBoxW
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDlgDirListW
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDlgDirSelectComboBoxExA
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDlgDirSelectComboBoxExW
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDlgDirSelectExA
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDlgDirSelectExW
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDpaClone
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDpaCreate
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDpaCreateEx
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDpaDeleteAllPtrs
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDpaDeletePtr
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDpaDestroy
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDpaDestroyCallback
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDpaEnumCallback
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDpaGetPtr
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDpaGetPtrIndex
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDpaGetSize
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDpaGrow
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDpaInsertPtr
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDpaLoadStream
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDpaMerge
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDpaSaveStream
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDpaSearch
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDpaSetPtr
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDpaSort
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDrawInsert
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDrawShadowText
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDrawStatusTextA
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDrawStatusTextW
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDrawThemeBackground
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDrawThemeBackgroundEx
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDrawThemeEdge
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDrawThemeIcon
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDrawThemeParentBackground
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDrawThemeParentBackgroundEx
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDrawThemeText
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDrawThemeTextEx
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDsaClone
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDsaCreate
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDsaDeleteAllItems
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDsaDeleteItem
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDsaDestroy
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDsaDestroyCallback
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDsaEnumCallback
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDsaGetItem
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDsaGetItemPtr
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDsaGetSize
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDsaInsertItem
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDsaSetItem
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsDsaSort
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsEnableScrollBar
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsEnableThemeDialogTexture
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsEnableTheming
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsEndBufferedAnimation
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsEndBufferedPaint
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsEndPanningFeedback
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsEvaluateProximityToPolygon
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsEvaluateProximityToRect
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsFlatSbEnableScrollBar
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsFlatSbGetScrollInfo
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsFlatSbGetScrollPos
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsFlatSbGetScrollProp
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsFlatSbGetScrollRange
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsFlatSbSetScrollInfo
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsFlatSbSetScrollPos
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsFlatSbSetScrollProp
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsFlatSbSetScrollRange
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsFlatSbShowScrollBar
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetBufferedPaintBits
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetBufferedPaintDC
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetBufferedPaintTargetDC
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetBufferedPaintTargetRect
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetComboBoxInfo
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetCurrentThemeName
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetEffectiveClientRect
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetListBoxInfo
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetMUILanguage
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetThemeAnimationProperty
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetThemeAnimationTransform
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetThemeAppProperties
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetThemeBackgroundContentRect
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetThemeBackgroundExtent
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetThemeBackgroundRegion
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetThemeBitmap
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetThemeBool
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetThemeColor
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetThemeDocumentationProperty
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetThemeEnumValue
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetThemeFilename
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetThemeFont
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetThemeInt
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetThemeIntList
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetThemeMargins
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetThemeMetric
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetThemePartSize
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetThemePosition
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetThemePropertyOrigin
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetThemeRect
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetThemeStream
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetThemeString
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetThemeSysBool
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetThemeSysColor
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetThemeSysColorBrush
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetThemeSysFont
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetThemeSysInt
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetThemeSysSize
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetThemeSysString
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetThemeTextExtent
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetThemeTextMetrics
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetThemeTimingFunction
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetThemeTransitionDuration
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetWindowFeedbackSetting
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsGetWindowTheme
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsHimagelistQueryInterface
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsImageListAdd
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsImageListAddMasked
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsImageListBeginDrag
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsImageListCoCreateInstance
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsImageListCopy
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsImageListCreate
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsImageListDestroy
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsImageListDragEnter
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsImageListDragLeave
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsImageListDragMove
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsImageListDragShowNolock
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsImageListDraw
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsImageListDrawEx
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsImageListDrawIndirect
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsImageListDuplicate
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsImageListEndDrag
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsImageListGetBkColor
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsImageListGetDragImage
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsImageListGetIcon
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsImageListGetIconSize
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsImageListGetImageCount
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsImageListGetImageInfo
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsImageListLoadImageA
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsImageListLoadImageW
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsImageListMerge
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsImageListRead
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsImageListReadEx
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsImageListRemove
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsImageListReplace
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsImageListReplaceIcon
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsImageListSetBkColor
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsImageListSetDragCursorImage
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsImageListSetIconSize
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsImageListSetImageCount
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsImageListSetOverlayImage
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsImageListWrite
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsImageListWriteEx
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsInitCommonControls
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsInitCommonControlsEx
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsInitMUILanguage
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsInitializeFlatSB
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsIsAppThemed
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsIsCharLowerW
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsIsCompositionActive
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsIsDlgButtonChecked
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsIsThemeActive
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsIsThemeBackgroundPartiallyTransparent
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsIsThemeDialogTextureEnabled
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsIsThemePartDefined
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsLoadIconMetric
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsLoadIconWithScaleDown
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsMakeDragList
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsMenuHelp
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsOpenThemeData
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsOpenThemeDataEx
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsPackTouchHitTestingProximityEvaluation
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsPropertySheetA
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsPropertySheetW
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsRegisterPointerDeviceNotifications
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsRegisterTouchHitTestingWindow
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsSetScrollInfo
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsSetScrollPos
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsSetScrollRange
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsSetThemeAppProperties
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsSetWindowFeedbackSetting
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsSetWindowTheme
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsSetWindowThemeAttribute
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsShowHideMenuCtl
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsShowScrollBar
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsStrSetPtrW
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsTaskDialog
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsTaskDialogIndirect
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsUninitializeFlatSB
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.cinterop.windowssysWindowsWin32UiControlsUpdatePanningFeedback
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hmenu
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.ImageFlags
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.PointerInputType
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.ScrollbarConstants
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Scrollinfo
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun beginBufferedAnimation(hwnd: Hwnd, hdctarget: Hdc, prctarget: ConstPtr<Rect>, dwformat: BpBufferformat, ppaintparams: ConstPtr<BpPaintparams>, panimationparams: ConstPtr<BpAnimationparams>, phdcfrom: MutPtr<Hdc>, phdcto: MutPtr<Hdc>): Long =
    windowssysWindowsWin32UiControlsBeginBufferedAnimation(hwnd.rawAddress.toCPointer<ByteVar>(), hdctarget.rawAddress.toCPointer<ByteVar>(), prctarget.rawAddress.toCPointer<ByteVar>(), dwformat, ppaintparams.rawAddress.toCPointer<ByteVar>(), panimationparams.rawAddress.toCPointer<ByteVar>(), phdcfrom.rawAddress.toCPointer<ByteVar>(), phdcto.rawAddress.toCPointer<ByteVar>())

public actual fun beginBufferedPaint(hdctarget: Hdc, prctarget: ConstPtr<Rect>, dwformat: BpBufferformat, ppaintparams: ConstPtr<BpPaintparams>, phdc: MutPtr<Hdc>): Long =
    windowssysWindowsWin32UiControlsBeginBufferedPaint(hdctarget.rawAddress.toCPointer<ByteVar>(), prctarget.rawAddress.toCPointer<ByteVar>(), dwformat, ppaintparams.rawAddress.toCPointer<ByteVar>(), phdc.rawAddress.toCPointer<ByteVar>())

public actual fun beginPanningFeedback(hwnd: Hwnd): Bool =
    windowssysWindowsWin32UiControlsBeginPanningFeedback(hwnd.rawAddress.toCPointer<ByteVar>())

public actual fun bufferedPaintClear(hbufferedpaint: Long, prc: ConstPtr<Rect>): Hresult =
    windowssysWindowsWin32UiControlsBufferedPaintClear(hbufferedpaint, prc.rawAddress.toCPointer<ByteVar>())

public actual fun bufferedPaintInit(): Hresult =
    windowssysWindowsWin32UiControlsBufferedPaintInit()

public actual fun bufferedPaintRenderAnimation(hwnd: Hwnd, hdctarget: Hdc): Bool =
    windowssysWindowsWin32UiControlsBufferedPaintRenderAnimation(hwnd.rawAddress.toCPointer<ByteVar>(), hdctarget.rawAddress.toCPointer<ByteVar>())

public actual fun bufferedPaintSetAlpha(hbufferedpaint: Long, prc: ConstPtr<Rect>, alpha: UByte): Hresult =
    windowssysWindowsWin32UiControlsBufferedPaintSetAlpha(hbufferedpaint, prc.rawAddress.toCPointer<ByteVar>(), alpha)

public actual fun bufferedPaintStopAllAnimations(hwnd: Hwnd): Hresult =
    windowssysWindowsWin32UiControlsBufferedPaintStopAllAnimations(hwnd.rawAddress.toCPointer<ByteVar>())

public actual fun bufferedPaintUnInit(): Hresult =
    windowssysWindowsWin32UiControlsBufferedPaintUnInit()

public actual fun checkDlgButton(hdlg: Hwnd, nidbutton: Int, ucheck: DlgButtonCheckState): Bool =
    windowssysWindowsWin32UiControlsCheckDlgButton(hdlg.rawAddress.toCPointer<ByteVar>(), nidbutton, ucheck)

public actual fun checkRadioButton(hdlg: Hwnd, nidfirstbutton: Int, nidlastbutton: Int, nidcheckbutton: Int): Bool =
    windowssysWindowsWin32UiControlsCheckRadioButton(hdlg.rawAddress.toCPointer<ByteVar>(), nidfirstbutton, nidlastbutton, nidcheckbutton)

public actual fun closeThemeData(htheme: Htheme): Hresult =
    windowssysWindowsWin32UiControlsCloseThemeData(htheme)

public actual fun createMappedBitmap(hinstance: Hinstance, idbitmap: Long, wflags: UInt, lpcolormap: ConstPtr<Colormap>, inummaps: Int): Hbitmap =
    MutPtr(windowssysWindowsWin32UiControlsCreateMappedBitmap(hinstance.rawAddress.toCPointer<ByteVar>(), idbitmap, wflags, lpcolormap.rawAddress.toCPointer<ByteVar>(), inummaps)?.toLong() ?: 0L)

public actual fun createPropertySheetPageA(constpropsheetpagepointer: MutPtr<Propsheetpagea>): Hpropsheetpage =
    MutPtr(windowssysWindowsWin32UiControlsCreatePropertySheetPageA(constpropsheetpagepointer.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun createPropertySheetPageW(constpropsheetpagepointer: MutPtr<Propsheetpagew>): Hpropsheetpage =
    MutPtr(windowssysWindowsWin32UiControlsCreatePropertySheetPageW(constpropsheetpagepointer.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun createStatusWindowA(style: Int, lpsztext: Pcstr, hwndparent: Hwnd, wid: UInt): Hwnd =
    MutPtr(windowssysWindowsWin32UiControlsCreateStatusWindowA(style, lpsztext.rawAddress.toCPointer<ByteVar>(), hwndparent.rawAddress.toCPointer<ByteVar>(), wid)?.toLong() ?: 0L)

public actual fun createStatusWindowW(style: Int, lpsztext: Pcwstr, hwndparent: Hwnd, wid: UInt): Hwnd =
    MutPtr(windowssysWindowsWin32UiControlsCreateStatusWindowW(style, lpsztext.rawAddress.toCPointer<ByteVar>(), hwndparent.rawAddress.toCPointer<ByteVar>(), wid)?.toLong() ?: 0L)

public actual fun createSyntheticPointerDevice(pointertype: PointerInputType, maxcount: UInt, mode: PointerFeedbackMode): Hsyntheticpointerdevice =
    MutPtr(windowssysWindowsWin32UiControlsCreateSyntheticPointerDevice(pointertype, maxcount, mode)?.toLong() ?: 0L)

public actual fun createToolbarEx(hwnd: Hwnd, ws: UInt, wid: UInt, nbitmaps: Int, hbminst: Hinstance, wbmid: ULong, lpbuttons: MutPtr<Tbbutton>, inumbuttons: Int, dxbutton: Int, dybutton: Int, dxbitmap: Int, dybitmap: Int, ustructsize: UInt): Hwnd =
    MutPtr(windowssysWindowsWin32UiControlsCreateToolbarEx(hwnd.rawAddress.toCPointer<ByteVar>(), ws, wid, nbitmaps, hbminst.rawAddress.toCPointer<ByteVar>(), wbmid, lpbuttons.rawAddress.toCPointer<ByteVar>(), inumbuttons, dxbutton, dybutton, dxbitmap, dybitmap, ustructsize)?.toLong() ?: 0L)

public actual fun createUpDownControl(dwstyle: UInt, x: Int, y: Int, cx: Int, cy: Int, hparent: Hwnd, nid: Int, hinst: Hinstance, hbuddy: Hwnd, nupper: Int, nlower: Int, npos: Int): Hwnd =
    MutPtr(windowssysWindowsWin32UiControlsCreateUpDownControl(dwstyle, x, y, cx, cy, hparent.rawAddress.toCPointer<ByteVar>(), nid, hinst.rawAddress.toCPointer<ByteVar>(), hbuddy.rawAddress.toCPointer<ByteVar>(), nupper, nlower, npos)?.toLong() ?: 0L)

public actual fun dpaClone(hdpa: Hdpa, hdpanew: Hdpa): Hdpa =
    windowssysWindowsWin32UiControlsDpaClone(hdpa, hdpanew)

public actual fun dpaCreate(citemgrow: Int): Hdpa =
    windowssysWindowsWin32UiControlsDpaCreate(citemgrow)

public actual fun dpaCreateEx(cpgrow: Int, hheap: Handle): Hdpa =
    windowssysWindowsWin32UiControlsDpaCreateEx(cpgrow, hheap.rawAddress.toCPointer<ByteVar>())

public actual fun dpaDeleteAllPtrs(hdpa: Hdpa): Bool =
    windowssysWindowsWin32UiControlsDpaDeleteAllPtrs(hdpa)

public actual fun dpaDeletePtr(hdpa: Hdpa, i: Int): MutPtr<CVoid> =
    MutPtr(windowssysWindowsWin32UiControlsDpaDeletePtr(hdpa, i)?.toLong() ?: 0L)

public actual fun dpaDestroy(hdpa: Hdpa): Bool =
    windowssysWindowsWin32UiControlsDpaDestroy(hdpa)

public actual fun dpaDestroyCallback(hdpa: Hdpa, pfncb: Pfndaenumcallback, pdata: ConstPtr<CVoid>) {
    windowssysWindowsWin32UiControlsDpaDestroyCallback(hdpa, 0L.toCPointer<ByteVar>(), pdata.rawAddress.toCPointer<ByteVar>())
}

public actual fun dpaEnumCallback(hdpa: Hdpa, pfncb: Pfndaenumcallback, pdata: ConstPtr<CVoid>) {
    windowssysWindowsWin32UiControlsDpaEnumCallback(hdpa, 0L.toCPointer<ByteVar>(), pdata.rawAddress.toCPointer<ByteVar>())
}

public actual fun dpaGetPtr(hdpa: Hdpa, i: Long): MutPtr<CVoid> =
    MutPtr(windowssysWindowsWin32UiControlsDpaGetPtr(hdpa, i)?.toLong() ?: 0L)

public actual fun dpaGetPtrIndex(hdpa: Hdpa, p: ConstPtr<CVoid>): Int =
    windowssysWindowsWin32UiControlsDpaGetPtrIndex(hdpa, p.rawAddress.toCPointer<ByteVar>())

public actual fun dpaGetSize(hdpa: Hdpa): ULong =
    windowssysWindowsWin32UiControlsDpaGetSize(hdpa)

public actual fun dpaGrow(pdpa: Hdpa, cp: Int): Bool =
    windowssysWindowsWin32UiControlsDpaGrow(pdpa, cp)

public actual fun dpaInsertPtr(hdpa: Hdpa, i: Int, p: ConstPtr<CVoid>): Int =
    windowssysWindowsWin32UiControlsDpaInsertPtr(hdpa, i, p.rawAddress.toCPointer<ByteVar>())

public actual fun dpaLoadStream(phdpa: MutPtr<Hdpa>, pfn: Pfndpastream, pstream: MutPtr<CVoid>, pvinstdata: ConstPtr<CVoid>): Hresult =
    windowssysWindowsWin32UiControlsDpaLoadStream(phdpa.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), pstream.rawAddress.toCPointer<ByteVar>(), pvinstdata.rawAddress.toCPointer<ByteVar>())

public actual fun dpaMerge(hdpadest: Hdpa, hdpasrc: Hdpa, dwflags: UInt, pfncompare: Pfndacompare, pfnmerge: Pfndpamerge, lparam: Lparam): Bool =
    windowssysWindowsWin32UiControlsDpaMerge(hdpadest, hdpasrc, dwflags, 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam)

public actual fun dpaSaveStream(hdpa: Hdpa, pfn: Pfndpastream, pstream: MutPtr<CVoid>, pvinstdata: ConstPtr<CVoid>): Hresult =
    windowssysWindowsWin32UiControlsDpaSaveStream(hdpa, 0L.toCPointer<ByteVar>(), pstream.rawAddress.toCPointer<ByteVar>(), pvinstdata.rawAddress.toCPointer<ByteVar>())

public actual fun dpaSearch(hdpa: Hdpa, pfind: ConstPtr<CVoid>, istart: Int, pfncompare: Pfndacompare, lparam: Lparam, options: UInt): Int =
    windowssysWindowsWin32UiControlsDpaSearch(hdpa, pfind.rawAddress.toCPointer<ByteVar>(), istart, 0L.toCPointer<ByteVar>(), lparam, options)

public actual fun dpaSetPtr(hdpa: Hdpa, i: Int, p: ConstPtr<CVoid>): Bool =
    windowssysWindowsWin32UiControlsDpaSetPtr(hdpa, i, p.rawAddress.toCPointer<ByteVar>())

public actual fun dpaSort(hdpa: Hdpa, pfncompare: Pfndacompare, lparam: Lparam): Bool =
    windowssysWindowsWin32UiControlsDpaSort(hdpa, 0L.toCPointer<ByteVar>(), lparam)

public actual fun dsaClone(hdsa: Hdsa): Hdsa =
    windowssysWindowsWin32UiControlsDsaClone(hdsa)

public actual fun dsaCreate(cbitem: Int, citemgrow: Int): Hdsa =
    windowssysWindowsWin32UiControlsDsaCreate(cbitem, citemgrow)

public actual fun dsaDeleteAllItems(hdsa: Hdsa): Bool =
    windowssysWindowsWin32UiControlsDsaDeleteAllItems(hdsa)

public actual fun dsaDeleteItem(hdsa: Hdsa, i: Int): Bool =
    windowssysWindowsWin32UiControlsDsaDeleteItem(hdsa, i)

public actual fun dsaDestroy(hdsa: Hdsa): Bool =
    windowssysWindowsWin32UiControlsDsaDestroy(hdsa)

public actual fun dsaDestroyCallback(hdsa: Hdsa, pfncb: Pfndaenumcallback, pdata: ConstPtr<CVoid>) {
    windowssysWindowsWin32UiControlsDsaDestroyCallback(hdsa, 0L.toCPointer<ByteVar>(), pdata.rawAddress.toCPointer<ByteVar>())
}

public actual fun dsaEnumCallback(hdsa: Hdsa, pfncb: Pfndaenumcallback, pdata: ConstPtr<CVoid>) {
    windowssysWindowsWin32UiControlsDsaEnumCallback(hdsa, 0L.toCPointer<ByteVar>(), pdata.rawAddress.toCPointer<ByteVar>())
}

public actual fun dsaGetItem(hdsa: Hdsa, i: Int, pitem: MutPtr<CVoid>): Bool =
    windowssysWindowsWin32UiControlsDsaGetItem(hdsa, i, pitem.rawAddress.toCPointer<ByteVar>())

public actual fun dsaGetItemPtr(hdsa: Hdsa, i: Int): MutPtr<CVoid> =
    MutPtr(windowssysWindowsWin32UiControlsDsaGetItemPtr(hdsa, i)?.toLong() ?: 0L)

public actual fun dsaGetSize(hdsa: Hdsa): ULong =
    windowssysWindowsWin32UiControlsDsaGetSize(hdsa)

public actual fun dsaInsertItem(hdsa: Hdsa, i: Int, pitem: ConstPtr<CVoid>): Int =
    windowssysWindowsWin32UiControlsDsaInsertItem(hdsa, i, pitem.rawAddress.toCPointer<ByteVar>())

public actual fun dsaSetItem(hdsa: Hdsa, i: Int, pitem: ConstPtr<CVoid>): Bool =
    windowssysWindowsWin32UiControlsDsaSetItem(hdsa, i, pitem.rawAddress.toCPointer<ByteVar>())

public actual fun dsaSort(pdsa: Hdsa, pfncompare: Pfndacompare, lparam: Lparam): Bool =
    windowssysWindowsWin32UiControlsDsaSort(pdsa, 0L.toCPointer<ByteVar>(), lparam)

public actual fun destroyPropertySheetPage(param0: Hpropsheetpage): Bool =
    windowssysWindowsWin32UiControlsDestroyPropertySheetPage(param0.rawAddress.toCPointer<ByteVar>())

public actual fun destroySyntheticPointerDevice(device: Hsyntheticpointerdevice) {
    windowssysWindowsWin32UiControlsDestroySyntheticPointerDevice(device.rawAddress.toCPointer<ByteVar>())
}

public actual fun dlgDirListA(hdlg: Hwnd, lppathspec: Pstr, nidlistbox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int =
    windowssysWindowsWin32UiControlsDlgDirListA(hdlg.rawAddress.toCPointer<ByteVar>(), lppathspec.rawAddress.toCPointer<ByteVar>(), nidlistbox, nidstaticpath, ufiletype)

public actual fun dlgDirListComboBoxA(hdlg: Hwnd, lppathspec: Pstr, nidcombobox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int =
    windowssysWindowsWin32UiControlsDlgDirListComboBoxA(hdlg.rawAddress.toCPointer<ByteVar>(), lppathspec.rawAddress.toCPointer<ByteVar>(), nidcombobox, nidstaticpath, ufiletype)

public actual fun dlgDirListComboBoxW(hdlg: Hwnd, lppathspec: Pwstr, nidcombobox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int =
    windowssysWindowsWin32UiControlsDlgDirListComboBoxW(hdlg.rawAddress.toCPointer<ByteVar>(), lppathspec.rawAddress.toCPointer<ByteVar>(), nidcombobox, nidstaticpath, ufiletype)

public actual fun dlgDirListW(hdlg: Hwnd, lppathspec: Pwstr, nidlistbox: Int, nidstaticpath: Int, ufiletype: DlgDirListFileType): Int =
    windowssysWindowsWin32UiControlsDlgDirListW(hdlg.rawAddress.toCPointer<ByteVar>(), lppathspec.rawAddress.toCPointer<ByteVar>(), nidlistbox, nidstaticpath, ufiletype)

public actual fun dlgDirSelectComboBoxExA(hwnddlg: Hwnd, lpstring: Pstr, cchout: Int, idcombobox: Int): Bool =
    windowssysWindowsWin32UiControlsDlgDirSelectComboBoxExA(hwnddlg.rawAddress.toCPointer<ByteVar>(), lpstring.rawAddress.toCPointer<ByteVar>(), cchout, idcombobox)

public actual fun dlgDirSelectComboBoxExW(hwnddlg: Hwnd, lpstring: Pwstr, cchout: Int, idcombobox: Int): Bool =
    windowssysWindowsWin32UiControlsDlgDirSelectComboBoxExW(hwnddlg.rawAddress.toCPointer<ByteVar>(), lpstring.rawAddress.toCPointer<ByteVar>(), cchout, idcombobox)

public actual fun dlgDirSelectExA(hwnddlg: Hwnd, lpstring: Pstr, chcount: Int, idlistbox: Int): Bool =
    windowssysWindowsWin32UiControlsDlgDirSelectExA(hwnddlg.rawAddress.toCPointer<ByteVar>(), lpstring.rawAddress.toCPointer<ByteVar>(), chcount, idlistbox)

public actual fun dlgDirSelectExW(hwnddlg: Hwnd, lpstring: Pwstr, chcount: Int, idlistbox: Int): Bool =
    windowssysWindowsWin32UiControlsDlgDirSelectExW(hwnddlg.rawAddress.toCPointer<ByteVar>(), lpstring.rawAddress.toCPointer<ByteVar>(), chcount, idlistbox)

public actual fun drawInsert(handparent: Hwnd, hlb: Hwnd, nitem: Int) {
    windowssysWindowsWin32UiControlsDrawInsert(handparent.rawAddress.toCPointer<ByteVar>(), hlb.rawAddress.toCPointer<ByteVar>(), nitem)
}

public actual fun drawShadowText(hdc: Hdc, psztext: Pcwstr, cch: UInt, prc: ConstPtr<Rect>, dwflags: UInt, crtext: Colorref, crshadow: Colorref, ixoffset: Int, iyoffset: Int): Int =
    windowssysWindowsWin32UiControlsDrawShadowText(hdc.rawAddress.toCPointer<ByteVar>(), psztext.rawAddress.toCPointer<ByteVar>(), cch, prc.rawAddress.toCPointer<ByteVar>(), dwflags, crtext, crshadow, ixoffset, iyoffset)

public actual fun drawStatusTextA(hdc: Hdc, lprc: MutPtr<Rect>, psztext: Pcstr, uflags: UInt) {
    windowssysWindowsWin32UiControlsDrawStatusTextA(hdc.rawAddress.toCPointer<ByteVar>(), lprc.rawAddress.toCPointer<ByteVar>(), psztext.rawAddress.toCPointer<ByteVar>(), uflags)
}

public actual fun drawStatusTextW(hdc: Hdc, lprc: MutPtr<Rect>, psztext: Pcwstr, uflags: UInt) {
    windowssysWindowsWin32UiControlsDrawStatusTextW(hdc.rawAddress.toCPointer<ByteVar>(), lprc.rawAddress.toCPointer<ByteVar>(), psztext.rawAddress.toCPointer<ByteVar>(), uflags)
}

public actual fun drawThemeBackground(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: ConstPtr<Rect>, pcliprect: ConstPtr<Rect>): Hresult =
    windowssysWindowsWin32UiControlsDrawThemeBackground(htheme, hdc.rawAddress.toCPointer<ByteVar>(), ipartid, istateid, prect.rawAddress.toCPointer<ByteVar>(), pcliprect.rawAddress.toCPointer<ByteVar>())

public actual fun drawThemeBackgroundEx(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: ConstPtr<Rect>, poptions: ConstPtr<Dtbgopts>): Hresult =
    windowssysWindowsWin32UiControlsDrawThemeBackgroundEx(htheme, hdc.rawAddress.toCPointer<ByteVar>(), ipartid, istateid, prect.rawAddress.toCPointer<ByteVar>(), poptions.rawAddress.toCPointer<ByteVar>())

public actual fun drawThemeEdge(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, pdestrect: ConstPtr<Rect>, uedge: DrawedgeFlags, uflags: DrawEdgeFlags, pcontentrect: MutPtr<Rect>): Hresult =
    windowssysWindowsWin32UiControlsDrawThemeEdge(htheme, hdc.rawAddress.toCPointer<ByteVar>(), ipartid, istateid, pdestrect.rawAddress.toCPointer<ByteVar>(), uedge, uflags, pcontentrect.rawAddress.toCPointer<ByteVar>())

public actual fun drawThemeIcon(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: ConstPtr<Rect>, himl: Himagelist, iimageindex: Int): Hresult =
    windowssysWindowsWin32UiControlsDrawThemeIcon(htheme, hdc.rawAddress.toCPointer<ByteVar>(), ipartid, istateid, prect.rawAddress.toCPointer<ByteVar>(), himl, iimageindex)

public actual fun drawThemeParentBackground(hwnd: Hwnd, hdc: Hdc, prc: ConstPtr<Rect>): Hresult =
    windowssysWindowsWin32UiControlsDrawThemeParentBackground(hwnd.rawAddress.toCPointer<ByteVar>(), hdc.rawAddress.toCPointer<ByteVar>(), prc.rawAddress.toCPointer<ByteVar>())

public actual fun drawThemeParentBackgroundEx(hwnd: Hwnd, hdc: Hdc, dwflags: DrawThemeParentBackgroundFlags, prc: ConstPtr<Rect>): Hresult =
    windowssysWindowsWin32UiControlsDrawThemeParentBackgroundEx(hwnd.rawAddress.toCPointer<ByteVar>(), hdc.rawAddress.toCPointer<ByteVar>(), dwflags, prc.rawAddress.toCPointer<ByteVar>())

public actual fun drawThemeText(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, psztext: Pcwstr, cchtext: Int, dwtextflags: DrawTextFormat, dwtextflags2: UInt, prect: ConstPtr<Rect>): Hresult =
    windowssysWindowsWin32UiControlsDrawThemeText(htheme, hdc.rawAddress.toCPointer<ByteVar>(), ipartid, istateid, psztext.rawAddress.toCPointer<ByteVar>(), cchtext, dwtextflags, dwtextflags2, prect.rawAddress.toCPointer<ByteVar>())

public actual fun drawThemeTextEx(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, psztext: Pcwstr, cchtext: Int, dwtextflags: DrawTextFormat, prect: MutPtr<Rect>, poptions: ConstPtr<Dttopts>): Hresult =
    windowssysWindowsWin32UiControlsDrawThemeTextEx(htheme, hdc.rawAddress.toCPointer<ByteVar>(), ipartid, istateid, psztext.rawAddress.toCPointer<ByteVar>(), cchtext, dwtextflags, prect.rawAddress.toCPointer<ByteVar>(), poptions.rawAddress.toCPointer<ByteVar>())

public actual fun enableScrollBar(hwnd: Hwnd, wsbflags: UInt, warrows: EnableScrollBarArrows): Bool =
    windowssysWindowsWin32UiControlsEnableScrollBar(hwnd.rawAddress.toCPointer<ByteVar>(), wsbflags, warrows)

public actual fun enableThemeDialogTexture(hwnd: Hwnd, dwflags: UInt): Hresult =
    windowssysWindowsWin32UiControlsEnableThemeDialogTexture(hwnd.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun enableTheming(fenable: Bool): Hresult =
    windowssysWindowsWin32UiControlsEnableTheming(fenable)

public actual fun endBufferedAnimation(hbpanimation: Long, fupdatetarget: Bool): Hresult =
    windowssysWindowsWin32UiControlsEndBufferedAnimation(hbpanimation, fupdatetarget)

public actual fun endBufferedPaint(hbufferedpaint: Long, fupdatetarget: Bool): Hresult =
    windowssysWindowsWin32UiControlsEndBufferedPaint(hbufferedpaint, fupdatetarget)

public actual fun endPanningFeedback(hwnd: Hwnd, fanimateback: Bool): Bool =
    windowssysWindowsWin32UiControlsEndPanningFeedback(hwnd.rawAddress.toCPointer<ByteVar>(), fanimateback)

public actual fun evaluateProximityToPolygon(numvertices: UInt, controlpolygon: ConstPtr<Point>, phittestinginput: ConstPtr<TouchHitTestingInput>, pproximityeval: MutPtr<TouchHitTestingProximityEvaluation>): Bool =
    windowssysWindowsWin32UiControlsEvaluateProximityToPolygon(numvertices, controlpolygon.rawAddress.toCPointer<ByteVar>(), phittestinginput.rawAddress.toCPointer<ByteVar>(), pproximityeval.rawAddress.toCPointer<ByteVar>())

public actual fun evaluateProximityToRect(controlboundingbox: ConstPtr<Rect>, phittestinginput: ConstPtr<TouchHitTestingInput>, pproximityeval: MutPtr<TouchHitTestingProximityEvaluation>): Bool =
    windowssysWindowsWin32UiControlsEvaluateProximityToRect(controlboundingbox.rawAddress.toCPointer<ByteVar>(), phittestinginput.rawAddress.toCPointer<ByteVar>(), pproximityeval.rawAddress.toCPointer<ByteVar>())

public actual fun flatSbEnableScrollBar(param0: Hwnd, param1: Int, param2: UInt): Bool =
    windowssysWindowsWin32UiControlsFlatSbEnableScrollBar(param0.rawAddress.toCPointer<ByteVar>(), param1, param2)

public actual fun flatSbGetScrollInfo(param0: Hwnd, code: ScrollbarConstants, param2: MutPtr<Scrollinfo>): Bool =
    windowssysWindowsWin32UiControlsFlatSbGetScrollInfo(param0.rawAddress.toCPointer<ByteVar>(), code, param2.rawAddress.toCPointer<ByteVar>())

public actual fun flatSbGetScrollPos(param0: Hwnd, code: ScrollbarConstants): Int =
    windowssysWindowsWin32UiControlsFlatSbGetScrollPos(param0.rawAddress.toCPointer<ByteVar>(), code)

public actual fun flatSbGetScrollProp(param0: Hwnd, propindex: WsbProp, param2: MutPtr<Int>): Bool =
    windowssysWindowsWin32UiControlsFlatSbGetScrollProp(param0.rawAddress.toCPointer<ByteVar>(), propindex, param2.rawAddress.toCPointer<ByteVar>())

public actual fun flatSbGetScrollRange(param0: Hwnd, code: ScrollbarConstants, param2: MutPtr<Int>, param3: MutPtr<Int>): Bool =
    windowssysWindowsWin32UiControlsFlatSbGetScrollRange(param0.rawAddress.toCPointer<ByteVar>(), code, param2.rawAddress.toCPointer<ByteVar>(), param3.rawAddress.toCPointer<ByteVar>())

public actual fun flatSbSetScrollInfo(param0: Hwnd, code: ScrollbarConstants, psi: MutPtr<Scrollinfo>, fredraw: Bool): Int =
    windowssysWindowsWin32UiControlsFlatSbSetScrollInfo(param0.rawAddress.toCPointer<ByteVar>(), code, psi.rawAddress.toCPointer<ByteVar>(), fredraw)

public actual fun flatSbSetScrollPos(param0: Hwnd, code: ScrollbarConstants, pos: Int, fredraw: Bool): Int =
    windowssysWindowsWin32UiControlsFlatSbSetScrollPos(param0.rawAddress.toCPointer<ByteVar>(), code, pos, fredraw)

public actual fun flatSbSetScrollProp(param0: Hwnd, index: UInt, newvalue: Long, param3: Bool): Bool =
    windowssysWindowsWin32UiControlsFlatSbSetScrollProp(param0.rawAddress.toCPointer<ByteVar>(), index, newvalue, param3)

public actual fun flatSbSetScrollRange(param0: Hwnd, code: ScrollbarConstants, min: Int, max: Int, fredraw: Bool): Int =
    windowssysWindowsWin32UiControlsFlatSbSetScrollRange(param0.rawAddress.toCPointer<ByteVar>(), code, min, max, fredraw)

public actual fun flatSbShowScrollBar(param0: Hwnd, code: ScrollbarConstants, param2: Bool): Bool =
    windowssysWindowsWin32UiControlsFlatSbShowScrollBar(param0.rawAddress.toCPointer<ByteVar>(), code, param2)

public actual fun getBufferedPaintBits(hbufferedpaint: Long, ppbbuffer: MutPtr<MutPtr<Rgbquad>>, pcxrow: MutPtr<Int>): Hresult =
    windowssysWindowsWin32UiControlsGetBufferedPaintBits(hbufferedpaint, ppbbuffer.rawAddress.toCPointer<ByteVar>(), pcxrow.rawAddress.toCPointer<ByteVar>())

public actual fun getBufferedPaintDC(hbufferedpaint: Long): Hdc =
    MutPtr(windowssysWindowsWin32UiControlsGetBufferedPaintDC(hbufferedpaint)?.toLong() ?: 0L)

public actual fun getBufferedPaintTargetDC(hbufferedpaint: Long): Hdc =
    MutPtr(windowssysWindowsWin32UiControlsGetBufferedPaintTargetDC(hbufferedpaint)?.toLong() ?: 0L)

public actual fun getBufferedPaintTargetRect(hbufferedpaint: Long, prc: MutPtr<Rect>): Hresult =
    windowssysWindowsWin32UiControlsGetBufferedPaintTargetRect(hbufferedpaint, prc.rawAddress.toCPointer<ByteVar>())

public actual fun getComboBoxInfo(hwndcombo: Hwnd, pcbi: MutPtr<Comboboxinfo>): Bool =
    windowssysWindowsWin32UiControlsGetComboBoxInfo(hwndcombo.rawAddress.toCPointer<ByteVar>(), pcbi.rawAddress.toCPointer<ByteVar>())

public actual fun getCurrentThemeName(pszthemefilename: Pwstr, cchmaxnamechars: Int, pszcolorbuff: Pwstr, cchmaxcolorchars: Int, pszsizebuff: Pwstr, cchmaxsizechars: Int): Hresult =
    windowssysWindowsWin32UiControlsGetCurrentThemeName(pszthemefilename.rawAddress.toCPointer<ByteVar>(), cchmaxnamechars, pszcolorbuff.rawAddress.toCPointer<ByteVar>(), cchmaxcolorchars, pszsizebuff.rawAddress.toCPointer<ByteVar>(), cchmaxsizechars)

public actual fun getEffectiveClientRect(hwnd: Hwnd, lprc: MutPtr<Rect>, lpinfo: ConstPtr<Int>) {
    windowssysWindowsWin32UiControlsGetEffectiveClientRect(hwnd.rawAddress.toCPointer<ByteVar>(), lprc.rawAddress.toCPointer<ByteVar>(), lpinfo.rawAddress.toCPointer<ByteVar>())
}

public actual fun getListBoxInfo(hwnd: Hwnd): UInt =
    windowssysWindowsWin32UiControlsGetListBoxInfo(hwnd.rawAddress.toCPointer<ByteVar>())

public actual fun getMUILanguage(): UShort =
    windowssysWindowsWin32UiControlsGetMUILanguage()

public actual fun getThemeAnimationProperty(htheme: Htheme, istoryboardid: Int, itargetid: Int, eproperty: TaProperty, pvproperty: MutPtr<CVoid>, cbsize: UInt, pcbsizeout: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32UiControlsGetThemeAnimationProperty(htheme, istoryboardid, itargetid, eproperty, pvproperty.rawAddress.toCPointer<ByteVar>(), cbsize, pcbsizeout.rawAddress.toCPointer<ByteVar>())

public actual fun getThemeAnimationTransform(htheme: Htheme, istoryboardid: Int, itargetid: Int, dwtransformindex: UInt, ptransform: MutPtr<TaTransform>, cbsize: UInt, pcbsizeout: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32UiControlsGetThemeAnimationTransform(htheme, istoryboardid, itargetid, dwtransformindex, ptransform.rawAddress.toCPointer<ByteVar>(), cbsize, pcbsizeout.rawAddress.toCPointer<ByteVar>())

public actual fun getThemeAppProperties(): SetThemeAppPropertiesFlags =
    windowssysWindowsWin32UiControlsGetThemeAppProperties()

public actual fun getThemeBackgroundContentRect(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, pboundingrect: ConstPtr<Rect>, pcontentrect: MutPtr<Rect>): Hresult =
    windowssysWindowsWin32UiControlsGetThemeBackgroundContentRect(htheme, hdc.rawAddress.toCPointer<ByteVar>(), ipartid, istateid, pboundingrect.rawAddress.toCPointer<ByteVar>(), pcontentrect.rawAddress.toCPointer<ByteVar>())

public actual fun getThemeBackgroundExtent(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, pcontentrect: ConstPtr<Rect>, pextentrect: MutPtr<Rect>): Hresult =
    windowssysWindowsWin32UiControlsGetThemeBackgroundExtent(htheme, hdc.rawAddress.toCPointer<ByteVar>(), ipartid, istateid, pcontentrect.rawAddress.toCPointer<ByteVar>(), pextentrect.rawAddress.toCPointer<ByteVar>())

public actual fun getThemeBackgroundRegion(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prect: ConstPtr<Rect>, pregion: MutPtr<Hrgn>): Hresult =
    windowssysWindowsWin32UiControlsGetThemeBackgroundRegion(htheme, hdc.rawAddress.toCPointer<ByteVar>(), ipartid, istateid, prect.rawAddress.toCPointer<ByteVar>(), pregion.rawAddress.toCPointer<ByteVar>())

public actual fun getThemeBitmap(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, dwflags: GetThemeBitmapFlags, phbitmap: MutPtr<Hbitmap>): Hresult =
    windowssysWindowsWin32UiControlsGetThemeBitmap(htheme, ipartid, istateid, ipropid, dwflags, phbitmap.rawAddress.toCPointer<ByteVar>())

public actual fun getThemeBool(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pfval: MutPtr<Bool>): Hresult =
    windowssysWindowsWin32UiControlsGetThemeBool(htheme, ipartid, istateid, ipropid, pfval.rawAddress.toCPointer<ByteVar>())

public actual fun getThemeColor(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pcolor: MutPtr<Colorref>): Hresult =
    windowssysWindowsWin32UiControlsGetThemeColor(htheme, ipartid, istateid, ipropid, pcolor.rawAddress.toCPointer<ByteVar>())

public actual fun getThemeDocumentationProperty(pszthemename: Pcwstr, pszpropertyname: Pcwstr, pszvaluebuff: Pwstr, cchmaxvalchars: Int): Hresult =
    windowssysWindowsWin32UiControlsGetThemeDocumentationProperty(pszthemename.rawAddress.toCPointer<ByteVar>(), pszpropertyname.rawAddress.toCPointer<ByteVar>(), pszvaluebuff.rawAddress.toCPointer<ByteVar>(), cchmaxvalchars)

public actual fun getThemeEnumValue(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pival: MutPtr<Int>): Hresult =
    windowssysWindowsWin32UiControlsGetThemeEnumValue(htheme, ipartid, istateid, ipropid, pival.rawAddress.toCPointer<ByteVar>())

public actual fun getThemeFilename(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pszthemefilename: Pwstr, cchmaxbuffchars: Int): Hresult =
    windowssysWindowsWin32UiControlsGetThemeFilename(htheme, ipartid, istateid, ipropid, pszthemefilename.rawAddress.toCPointer<ByteVar>(), cchmaxbuffchars)

public actual fun getThemeFont(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ipropid: Int, pfont: MutPtr<Logfontw>): Hresult =
    windowssysWindowsWin32UiControlsGetThemeFont(htheme, hdc.rawAddress.toCPointer<ByteVar>(), ipartid, istateid, ipropid, pfont.rawAddress.toCPointer<ByteVar>())

public actual fun getThemeInt(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pival: MutPtr<Int>): Hresult =
    windowssysWindowsWin32UiControlsGetThemeInt(htheme, ipartid, istateid, ipropid, pival.rawAddress.toCPointer<ByteVar>())

public actual fun getThemeIntList(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pintlist: MutPtr<Intlist>): Hresult =
    windowssysWindowsWin32UiControlsGetThemeIntList(htheme, ipartid, istateid, ipropid, pintlist.rawAddress.toCPointer<ByteVar>())

public actual fun getThemeMargins(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ipropid: Int, prc: ConstPtr<Rect>, pmargins: MutPtr<Margins>): Hresult =
    windowssysWindowsWin32UiControlsGetThemeMargins(htheme, hdc.rawAddress.toCPointer<ByteVar>(), ipartid, istateid, ipropid, prc.rawAddress.toCPointer<ByteVar>(), pmargins.rawAddress.toCPointer<ByteVar>())

public actual fun getThemeMetric(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ipropid: Int, pival: MutPtr<Int>): Hresult =
    windowssysWindowsWin32UiControlsGetThemeMetric(htheme, hdc.rawAddress.toCPointer<ByteVar>(), ipartid, istateid, ipropid, pival.rawAddress.toCPointer<ByteVar>())

public actual fun getThemePartSize(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, prc: ConstPtr<Rect>, esize: Themesize, psz: MutPtr<Size>): Hresult =
    windowssysWindowsWin32UiControlsGetThemePartSize(htheme, hdc.rawAddress.toCPointer<ByteVar>(), ipartid, istateid, prc.rawAddress.toCPointer<ByteVar>(), esize, psz.rawAddress.toCPointer<ByteVar>())

public actual fun getThemePosition(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, ppoint: MutPtr<Point>): Hresult =
    windowssysWindowsWin32UiControlsGetThemePosition(htheme, ipartid, istateid, ipropid, ppoint.rawAddress.toCPointer<ByteVar>())

public actual fun getThemePropertyOrigin(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, porigin: MutPtr<Propertyorigin>): Hresult =
    windowssysWindowsWin32UiControlsGetThemePropertyOrigin(htheme, ipartid, istateid, ipropid, porigin.rawAddress.toCPointer<ByteVar>())

public actual fun getThemeRect(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, prect: MutPtr<Rect>): Hresult =
    windowssysWindowsWin32UiControlsGetThemeRect(htheme, ipartid, istateid, ipropid, prect.rawAddress.toCPointer<ByteVar>())

public actual fun getThemeStream(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, ppvstream: MutPtr<MutPtr<CVoid>>, pcbstream: MutPtr<UInt>, hinst: Hinstance): Hresult =
    windowssysWindowsWin32UiControlsGetThemeStream(htheme, ipartid, istateid, ipropid, ppvstream.rawAddress.toCPointer<ByteVar>(), pcbstream.rawAddress.toCPointer<ByteVar>(), hinst.rawAddress.toCPointer<ByteVar>())

public actual fun getThemeString(htheme: Htheme, ipartid: Int, istateid: Int, ipropid: Int, pszbuff: Pwstr, cchmaxbuffchars: Int): Hresult =
    windowssysWindowsWin32UiControlsGetThemeString(htheme, ipartid, istateid, ipropid, pszbuff.rawAddress.toCPointer<ByteVar>(), cchmaxbuffchars)

public actual fun getThemeSysBool(htheme: Htheme, iboolid: Int): Bool =
    windowssysWindowsWin32UiControlsGetThemeSysBool(htheme, iboolid)

public actual fun getThemeSysColor(htheme: Htheme, icolorid: Int): Colorref =
    windowssysWindowsWin32UiControlsGetThemeSysColor(htheme, icolorid)

public actual fun getThemeSysColorBrush(htheme: Htheme, icolorid: Int): Hbrush =
    MutPtr(windowssysWindowsWin32UiControlsGetThemeSysColorBrush(htheme, icolorid)?.toLong() ?: 0L)

public actual fun getThemeSysFont(htheme: Htheme, ifontid: Int, plf: MutPtr<Logfontw>): Hresult =
    windowssysWindowsWin32UiControlsGetThemeSysFont(htheme, ifontid, plf.rawAddress.toCPointer<ByteVar>())

public actual fun getThemeSysInt(htheme: Htheme, iintid: Int, pivalue: MutPtr<Int>): Hresult =
    windowssysWindowsWin32UiControlsGetThemeSysInt(htheme, iintid, pivalue.rawAddress.toCPointer<ByteVar>())

public actual fun getThemeSysSize(htheme: Htheme, isizeid: Int): Int =
    windowssysWindowsWin32UiControlsGetThemeSysSize(htheme, isizeid)

public actual fun getThemeSysString(htheme: Htheme, istringid: Int, pszstringbuff: Pwstr, cchmaxstringchars: Int): Hresult =
    windowssysWindowsWin32UiControlsGetThemeSysString(htheme, istringid, pszstringbuff.rawAddress.toCPointer<ByteVar>(), cchmaxstringchars)

public actual fun getThemeTextExtent(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, psztext: Pcwstr, cchcharcount: Int, dwtextflags: DrawTextFormat, pboundingrect: ConstPtr<Rect>, pextentrect: MutPtr<Rect>): Hresult =
    windowssysWindowsWin32UiControlsGetThemeTextExtent(htheme, hdc.rawAddress.toCPointer<ByteVar>(), ipartid, istateid, psztext.rawAddress.toCPointer<ByteVar>(), cchcharcount, dwtextflags, pboundingrect.rawAddress.toCPointer<ByteVar>(), pextentrect.rawAddress.toCPointer<ByteVar>())

public actual fun getThemeTextMetrics(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, ptm: MutPtr<Textmetricw>): Hresult =
    windowssysWindowsWin32UiControlsGetThemeTextMetrics(htheme, hdc.rawAddress.toCPointer<ByteVar>(), ipartid, istateid, ptm.rawAddress.toCPointer<ByteVar>())

public actual fun getThemeTimingFunction(htheme: Htheme, itimingfunctionid: Int, ptimingfunction: MutPtr<TaTimingfunction>, cbsize: UInt, pcbsizeout: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32UiControlsGetThemeTimingFunction(htheme, itimingfunctionid, ptimingfunction.rawAddress.toCPointer<ByteVar>(), cbsize, pcbsizeout.rawAddress.toCPointer<ByteVar>())

public actual fun getThemeTransitionDuration(htheme: Htheme, ipartid: Int, istateidfrom: Int, istateidto: Int, ipropid: Int, pdwduration: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32UiControlsGetThemeTransitionDuration(htheme, ipartid, istateidfrom, istateidto, ipropid, pdwduration.rawAddress.toCPointer<ByteVar>())

public actual fun getWindowFeedbackSetting(hwnd: Hwnd, feedback: FeedbackType, dwflags: UInt, psize: MutPtr<UInt>, config: MutPtr<CVoid>): Bool =
    windowssysWindowsWin32UiControlsGetWindowFeedbackSetting(hwnd.rawAddress.toCPointer<ByteVar>(), feedback, dwflags, psize.rawAddress.toCPointer<ByteVar>(), config.rawAddress.toCPointer<ByteVar>())

public actual fun getWindowTheme(hwnd: Hwnd): Htheme =
    windowssysWindowsWin32UiControlsGetWindowTheme(hwnd.rawAddress.toCPointer<ByteVar>())

public actual fun himagelistQueryInterface(himl: Himagelist, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32UiControlsHimagelistQueryInterface(himl, riid.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun hitTestThemeBackground(htheme: Htheme, hdc: Hdc, ipartid: Int, istateid: Int, dwoptions: HitTestBackgroundOptions, prect: ConstPtr<Rect>, hrgn: Hrgn, pttest: Point, pwhittestcode: MutPtr<UShort>): Hresult =
    0

public actual fun imageListAdd(himl: Himagelist, hbmimage: Hbitmap, hbmmask: Hbitmap): Int =
    windowssysWindowsWin32UiControlsImageListAdd(himl, hbmimage.rawAddress.toCPointer<ByteVar>(), hbmmask.rawAddress.toCPointer<ByteVar>())

public actual fun imageListAddMasked(himl: Himagelist, hbmimage: Hbitmap, crmask: Colorref): Int =
    windowssysWindowsWin32UiControlsImageListAddMasked(himl, hbmimage.rawAddress.toCPointer<ByteVar>(), crmask)

public actual fun imageListBeginDrag(himltrack: Himagelist, itrack: Int, dxhotspot: Int, dyhotspot: Int): Bool =
    windowssysWindowsWin32UiControlsImageListBeginDrag(himltrack, itrack, dxhotspot, dyhotspot)

public actual fun imageListCoCreateInstance(rclsid: ConstPtr<Guid>, punkouter: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32UiControlsImageListCoCreateInstance(rclsid.rawAddress.toCPointer<ByteVar>(), punkouter.rawAddress.toCPointer<ByteVar>(), riid.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun imageListCopy(himldst: Himagelist, idst: Int, himlsrc: Himagelist, isrc: Int, uflags: ImageListCopyFlags): Bool =
    windowssysWindowsWin32UiControlsImageListCopy(himldst, idst, himlsrc, isrc, uflags)

public actual fun imageListCreate(cx: Int, cy: Int, flags: ImagelistCreationFlags, cinitial: Int, cgrow: Int): Himagelist =
    windowssysWindowsWin32UiControlsImageListCreate(cx, cy, flags, cinitial, cgrow)

public actual fun imageListDestroy(himl: Himagelist): Bool =
    windowssysWindowsWin32UiControlsImageListDestroy(himl)

public actual fun imageListDragEnter(hwndlock: Hwnd, x: Int, y: Int): Bool =
    windowssysWindowsWin32UiControlsImageListDragEnter(hwndlock.rawAddress.toCPointer<ByteVar>(), x, y)

public actual fun imageListDragLeave(hwndlock: Hwnd): Bool =
    windowssysWindowsWin32UiControlsImageListDragLeave(hwndlock.rawAddress.toCPointer<ByteVar>())

public actual fun imageListDragMove(x: Int, y: Int): Bool =
    windowssysWindowsWin32UiControlsImageListDragMove(x, y)

public actual fun imageListDragShowNolock(fshow: Bool): Bool =
    windowssysWindowsWin32UiControlsImageListDragShowNolock(fshow)

public actual fun imageListDraw(himl: Himagelist, i: Int, hdcdst: Hdc, x: Int, y: Int, fstyle: ImageListDrawStyle): Bool =
    windowssysWindowsWin32UiControlsImageListDraw(himl, i, hdcdst.rawAddress.toCPointer<ByteVar>(), x, y, fstyle)

public actual fun imageListDrawEx(himl: Himagelist, i: Int, hdcdst: Hdc, x: Int, y: Int, dx: Int, dy: Int, rgbbk: Colorref, rgbfg: Colorref, fstyle: ImageListDrawStyle): Bool =
    windowssysWindowsWin32UiControlsImageListDrawEx(himl, i, hdcdst.rawAddress.toCPointer<ByteVar>(), x, y, dx, dy, rgbbk, rgbfg, fstyle)

public actual fun imageListDrawIndirect(pimldp: ConstPtr<Imagelistdrawparams>): Bool =
    windowssysWindowsWin32UiControlsImageListDrawIndirect(pimldp.rawAddress.toCPointer<ByteVar>())

public actual fun imageListDuplicate(himl: Himagelist): Himagelist =
    windowssysWindowsWin32UiControlsImageListDuplicate(himl)

public actual fun imageListEndDrag() {
    windowssysWindowsWin32UiControlsImageListEndDrag()
}

public actual fun imageListGetBkColor(himl: Himagelist): Colorref =
    windowssysWindowsWin32UiControlsImageListGetBkColor(himl)

public actual fun imageListGetDragImage(ppt: MutPtr<Point>, ppthotspot: MutPtr<Point>): Himagelist =
    windowssysWindowsWin32UiControlsImageListGetDragImage(ppt.rawAddress.toCPointer<ByteVar>(), ppthotspot.rawAddress.toCPointer<ByteVar>())

public actual fun imageListGetIcon(himl: Himagelist, i: Int, flags: ImageListDrawStyle): Hicon =
    MutPtr(windowssysWindowsWin32UiControlsImageListGetIcon(himl, i, flags)?.toLong() ?: 0L)

public actual fun imageListGetIconSize(himl: Himagelist, cx: MutPtr<Int>, cy: MutPtr<Int>): Bool =
    windowssysWindowsWin32UiControlsImageListGetIconSize(himl, cx.rawAddress.toCPointer<ByteVar>(), cy.rawAddress.toCPointer<ByteVar>())

public actual fun imageListGetImageCount(himl: Himagelist): Int =
    windowssysWindowsWin32UiControlsImageListGetImageCount(himl)

public actual fun imageListGetImageInfo(himl: Himagelist, i: Int, pimageinfo: MutPtr<Imageinfo>): Bool =
    windowssysWindowsWin32UiControlsImageListGetImageInfo(himl, i, pimageinfo.rawAddress.toCPointer<ByteVar>())

public actual fun imageListLoadImageA(hi: Hinstance, lpbmp: Pcstr, cx: Int, cgrow: Int, crmask: Colorref, utype: UInt, uflags: ImageFlags): Himagelist =
    windowssysWindowsWin32UiControlsImageListLoadImageA(hi.rawAddress.toCPointer<ByteVar>(), lpbmp.rawAddress.toCPointer<ByteVar>(), cx, cgrow, crmask, utype, uflags)

public actual fun imageListLoadImageW(hi: Hinstance, lpbmp: Pcwstr, cx: Int, cgrow: Int, crmask: Colorref, utype: UInt, uflags: ImageFlags): Himagelist =
    windowssysWindowsWin32UiControlsImageListLoadImageW(hi.rawAddress.toCPointer<ByteVar>(), lpbmp.rawAddress.toCPointer<ByteVar>(), cx, cgrow, crmask, utype, uflags)

public actual fun imageListMerge(himl1: Himagelist, i1: Int, himl2: Himagelist, i2: Int, dx: Int, dy: Int): Himagelist =
    windowssysWindowsWin32UiControlsImageListMerge(himl1, i1, himl2, i2, dx, dy)

public actual fun imageListRead(pstm: MutPtr<CVoid>): Himagelist =
    windowssysWindowsWin32UiControlsImageListRead(pstm.rawAddress.toCPointer<ByteVar>())

public actual fun imageListReadEx(dwflags: UInt, pstm: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32UiControlsImageListReadEx(dwflags, pstm.rawAddress.toCPointer<ByteVar>(), riid.rawAddress.toCPointer<ByteVar>(), ppv.rawAddress.toCPointer<ByteVar>())

public actual fun imageListRemove(himl: Himagelist, i: Int): Bool =
    windowssysWindowsWin32UiControlsImageListRemove(himl, i)

public actual fun imageListReplace(himl: Himagelist, i: Int, hbmimage: Hbitmap, hbmmask: Hbitmap): Bool =
    windowssysWindowsWin32UiControlsImageListReplace(himl, i, hbmimage.rawAddress.toCPointer<ByteVar>(), hbmmask.rawAddress.toCPointer<ByteVar>())

public actual fun imageListReplaceIcon(himl: Himagelist, i: Int, hicon: Hicon): Int =
    windowssysWindowsWin32UiControlsImageListReplaceIcon(himl, i, hicon.rawAddress.toCPointer<ByteVar>())

public actual fun imageListSetBkColor(himl: Himagelist, clrbk: Colorref): Colorref =
    windowssysWindowsWin32UiControlsImageListSetBkColor(himl, clrbk)

public actual fun imageListSetDragCursorImage(himldrag: Himagelist, idrag: Int, dxhotspot: Int, dyhotspot: Int): Bool =
    windowssysWindowsWin32UiControlsImageListSetDragCursorImage(himldrag, idrag, dxhotspot, dyhotspot)

public actual fun imageListSetIconSize(himl: Himagelist, cx: Int, cy: Int): Bool =
    windowssysWindowsWin32UiControlsImageListSetIconSize(himl, cx, cy)

public actual fun imageListSetImageCount(himl: Himagelist, unewcount: UInt): Bool =
    windowssysWindowsWin32UiControlsImageListSetImageCount(himl, unewcount)

public actual fun imageListSetOverlayImage(himl: Himagelist, iimage: Int, ioverlay: Int): Bool =
    windowssysWindowsWin32UiControlsImageListSetOverlayImage(himl, iimage, ioverlay)

public actual fun imageListWrite(himl: Himagelist, pstm: MutPtr<CVoid>): Bool =
    windowssysWindowsWin32UiControlsImageListWrite(himl, pstm.rawAddress.toCPointer<ByteVar>())

public actual fun imageListWriteEx(himl: Himagelist, dwflags: ImageListWriteStreamFlags, pstm: MutPtr<CVoid>): Hresult =
    windowssysWindowsWin32UiControlsImageListWriteEx(himl, dwflags, pstm.rawAddress.toCPointer<ByteVar>())

public actual fun initCommonControls() {
    windowssysWindowsWin32UiControlsInitCommonControls()
}

public actual fun initCommonControlsEx(picce: ConstPtr<Initcommoncontrolsex>): Bool =
    windowssysWindowsWin32UiControlsInitCommonControlsEx(picce.rawAddress.toCPointer<ByteVar>())

public actual fun initMUILanguage(uilang: UShort) {
    windowssysWindowsWin32UiControlsInitMUILanguage(uilang)
}

public actual fun initializeFlatSB(param0: Hwnd): Bool =
    windowssysWindowsWin32UiControlsInitializeFlatSB(param0.rawAddress.toCPointer<ByteVar>())

public actual fun isAppThemed(): Bool =
    windowssysWindowsWin32UiControlsIsAppThemed()

public actual fun isCharLowerW(ch: UShort): Bool =
    windowssysWindowsWin32UiControlsIsCharLowerW(ch)

public actual fun isCompositionActive(): Bool =
    windowssysWindowsWin32UiControlsIsCompositionActive()

public actual fun isDlgButtonChecked(hdlg: Hwnd, nidbutton: Int): UInt =
    windowssysWindowsWin32UiControlsIsDlgButtonChecked(hdlg.rawAddress.toCPointer<ByteVar>(), nidbutton)

public actual fun isThemeActive(): Bool =
    windowssysWindowsWin32UiControlsIsThemeActive()

public actual fun isThemeBackgroundPartiallyTransparent(htheme: Htheme, ipartid: Int, istateid: Int): Bool =
    windowssysWindowsWin32UiControlsIsThemeBackgroundPartiallyTransparent(htheme, ipartid, istateid)

public actual fun isThemeDialogTextureEnabled(hwnd: Hwnd): Bool =
    windowssysWindowsWin32UiControlsIsThemeDialogTextureEnabled(hwnd.rawAddress.toCPointer<ByteVar>())

public actual fun isThemePartDefined(htheme: Htheme, ipartid: Int, istateid: Int): Bool =
    windowssysWindowsWin32UiControlsIsThemePartDefined(htheme, ipartid, istateid)

public actual fun lBItemFromPt(hlb: Hwnd, pt: Point, bautoscroll: Bool): Int =
    0

public actual fun loadIconMetric(hinst: Hinstance, pszname: Pcwstr, lims: LiMetric, phico: MutPtr<Hicon>): Hresult =
    windowssysWindowsWin32UiControlsLoadIconMetric(hinst.rawAddress.toCPointer<ByteVar>(), pszname.rawAddress.toCPointer<ByteVar>(), lims, phico.rawAddress.toCPointer<ByteVar>())

public actual fun loadIconWithScaleDown(hinst: Hinstance, pszname: Pcwstr, cx: Int, cy: Int, phico: MutPtr<Hicon>): Hresult =
    windowssysWindowsWin32UiControlsLoadIconWithScaleDown(hinst.rawAddress.toCPointer<ByteVar>(), pszname.rawAddress.toCPointer<ByteVar>(), cx, cy, phico.rawAddress.toCPointer<ByteVar>())

public actual fun makeDragList(hlb: Hwnd): Bool =
    windowssysWindowsWin32UiControlsMakeDragList(hlb.rawAddress.toCPointer<ByteVar>())

public actual fun menuHelp(umsg: UInt, wparam: Wparam, lparam: Lparam, hmainmenu: Hmenu, hinst: Hinstance, hwndstatus: Hwnd, lpwids: ConstPtr<UInt>) {
    windowssysWindowsWin32UiControlsMenuHelp(umsg, wparam, lparam, hmainmenu.rawAddress.toCPointer<ByteVar>(), hinst.rawAddress.toCPointer<ByteVar>(), hwndstatus.rawAddress.toCPointer<ByteVar>(), lpwids.rawAddress.toCPointer<ByteVar>())
}

public actual fun openThemeData(hwnd: Hwnd, pszclasslist: Pcwstr): Htheme =
    windowssysWindowsWin32UiControlsOpenThemeData(hwnd.rawAddress.toCPointer<ByteVar>(), pszclasslist.rawAddress.toCPointer<ByteVar>())

public actual fun openThemeDataEx(hwnd: Hwnd, pszclasslist: Pcwstr, dwflags: OpenThemeDataFlags): Htheme =
    windowssysWindowsWin32UiControlsOpenThemeDataEx(hwnd.rawAddress.toCPointer<ByteVar>(), pszclasslist.rawAddress.toCPointer<ByteVar>(), dwflags)

public actual fun packTouchHitTestingProximityEvaluation(phittestinginput: ConstPtr<TouchHitTestingInput>, pproximityeval: ConstPtr<TouchHitTestingProximityEvaluation>): Lresult =
    windowssysWindowsWin32UiControlsPackTouchHitTestingProximityEvaluation(phittestinginput.rawAddress.toCPointer<ByteVar>(), pproximityeval.rawAddress.toCPointer<ByteVar>())

public actual fun propertySheetA(param0: MutPtr<PropsheetheaderaV2>): Long =
    windowssysWindowsWin32UiControlsPropertySheetA(param0.rawAddress.toCPointer<ByteVar>())

public actual fun propertySheetW(param0: MutPtr<PropsheetheaderwV2>): Long =
    windowssysWindowsWin32UiControlsPropertySheetW(param0.rawAddress.toCPointer<ByteVar>())

public actual fun registerPointerDeviceNotifications(window: Hwnd, notifyrange: Bool): Bool =
    windowssysWindowsWin32UiControlsRegisterPointerDeviceNotifications(window.rawAddress.toCPointer<ByteVar>(), notifyrange)

public actual fun registerTouchHitTestingWindow(hwnd: Hwnd, value: UInt): Bool =
    windowssysWindowsWin32UiControlsRegisterTouchHitTestingWindow(hwnd.rawAddress.toCPointer<ByteVar>(), value)

public actual fun setScrollInfo(hwnd: Hwnd, nbar: ScrollbarConstants, lpsi: ConstPtr<Scrollinfo>, redraw: Bool): Int =
    windowssysWindowsWin32UiControlsSetScrollInfo(hwnd.rawAddress.toCPointer<ByteVar>(), nbar, lpsi.rawAddress.toCPointer<ByteVar>(), redraw)

public actual fun setScrollPos(hwnd: Hwnd, nbar: ScrollbarConstants, npos: Int, bredraw: Bool): Int =
    windowssysWindowsWin32UiControlsSetScrollPos(hwnd.rawAddress.toCPointer<ByteVar>(), nbar, npos, bredraw)

public actual fun setScrollRange(hwnd: Hwnd, nbar: ScrollbarConstants, nminpos: Int, nmaxpos: Int, bredraw: Bool): Bool =
    windowssysWindowsWin32UiControlsSetScrollRange(hwnd.rawAddress.toCPointer<ByteVar>(), nbar, nminpos, nmaxpos, bredraw)

public actual fun setThemeAppProperties(dwflags: SetThemeAppPropertiesFlags) {
    windowssysWindowsWin32UiControlsSetThemeAppProperties(dwflags)
}

public actual fun setWindowFeedbackSetting(hwnd: Hwnd, feedback: FeedbackType, dwflags: UInt, size: UInt, configuration: ConstPtr<CVoid>): Bool =
    windowssysWindowsWin32UiControlsSetWindowFeedbackSetting(hwnd.rawAddress.toCPointer<ByteVar>(), feedback, dwflags, size, configuration.rawAddress.toCPointer<ByteVar>())

public actual fun setWindowTheme(hwnd: Hwnd, pszsubappname: Pcwstr, pszsubidlist: Pcwstr): Hresult =
    windowssysWindowsWin32UiControlsSetWindowTheme(hwnd.rawAddress.toCPointer<ByteVar>(), pszsubappname.rawAddress.toCPointer<ByteVar>(), pszsubidlist.rawAddress.toCPointer<ByteVar>())

public actual fun setWindowThemeAttribute(hwnd: Hwnd, eattribute: Windowthemeattributetype, pvattribute: ConstPtr<CVoid>, cbattribute: UInt): Hresult =
    windowssysWindowsWin32UiControlsSetWindowThemeAttribute(hwnd.rawAddress.toCPointer<ByteVar>(), eattribute, pvattribute.rawAddress.toCPointer<ByteVar>(), cbattribute)

public actual fun showHideMenuCtl(hwnd: Hwnd, uflags: ULong, lpinfo: ConstPtr<Int>): Bool =
    windowssysWindowsWin32UiControlsShowHideMenuCtl(hwnd.rawAddress.toCPointer<ByteVar>(), uflags, lpinfo.rawAddress.toCPointer<ByteVar>())

public actual fun showScrollBar(hwnd: Hwnd, wbar: ScrollbarConstants, bshow: Bool): Bool =
    windowssysWindowsWin32UiControlsShowScrollBar(hwnd.rawAddress.toCPointer<ByteVar>(), wbar, bshow)

public actual fun strSetPtrW(ppsz: MutPtr<Pwstr>, psz: Pcwstr): Bool =
    windowssysWindowsWin32UiControlsStrSetPtrW(ppsz.rawAddress.toCPointer<ByteVar>(), psz.rawAddress.toCPointer<ByteVar>())

public actual fun taskDialog(hwndowner: Hwnd, hinstance: Hinstance, pszwindowtitle: Pcwstr, pszmaininstruction: Pcwstr, pszcontent: Pcwstr, dwcommonbuttons: TaskdialogCommonButtonFlags, pszicon: Pcwstr, pnbutton: MutPtr<Int>): Hresult =
    windowssysWindowsWin32UiControlsTaskDialog(hwndowner.rawAddress.toCPointer<ByteVar>(), hinstance.rawAddress.toCPointer<ByteVar>(), pszwindowtitle.rawAddress.toCPointer<ByteVar>(), pszmaininstruction.rawAddress.toCPointer<ByteVar>(), pszcontent.rawAddress.toCPointer<ByteVar>(), dwcommonbuttons, pszicon.rawAddress.toCPointer<ByteVar>(), pnbutton.rawAddress.toCPointer<ByteVar>())

public actual fun taskDialogIndirect(ptaskconfig: ConstPtr<Taskdialogconfig>, pnbutton: MutPtr<Int>, pnradiobutton: MutPtr<Int>, pfverificationflagchecked: MutPtr<Bool>): Hresult =
    windowssysWindowsWin32UiControlsTaskDialogIndirect(ptaskconfig.rawAddress.toCPointer<ByteVar>(), pnbutton.rawAddress.toCPointer<ByteVar>(), pnradiobutton.rawAddress.toCPointer<ByteVar>(), pfverificationflagchecked.rawAddress.toCPointer<ByteVar>())

public actual fun uninitializeFlatSB(param0: Hwnd): Hresult =
    windowssysWindowsWin32UiControlsUninitializeFlatSB(param0.rawAddress.toCPointer<ByteVar>())

public actual fun updatePanningFeedback(hwnd: Hwnd, ltotaloverpanoffsetx: Int, ltotaloverpanoffsety: Int, fininertia: Bool): Bool =
    windowssysWindowsWin32UiControlsUpdatePanningFeedback(hwnd.rawAddress.toCPointer<ByteVar>(), ltotaloverpanoffsetx, ltotaloverpanoffsety, fininertia)
