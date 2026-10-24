// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipAddPathArc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipAddPathArc`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `x` : Float, `y` : Float, `width` : Float, `height` : Float, `startangle` : Float, `sweepangle` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipAddPathArcI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipAddPathArcI`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `x` : Int, `y` : Int, `width` : Int, `height` : Int, `startangle` : Float, `sweepangle` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipAddPathBezier; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipAddPathBezier`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `x1` : Float, `y1` : Float, `x2` : Float, `y2` : Float, `x3` : Float, `y3` : Float, `x4` : Float, `y4` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipAddPathBezierI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipAddPathBezierI`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `x1` : Int, `y1` : Int, `x2` : Int, `y2` : Int, `x3` : Int, `y3` : Int, `x4` : Int, `y4` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipAddPathBeziers; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipAddPathBeziers`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`PointF`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipAddPathBeziersI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipAddPathBeziersI`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`Point`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipAddPathClosedCurve; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipAddPathClosedCurve`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`PointF`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipAddPathClosedCurve2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipAddPathClosedCurve2`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`PointF`>?, `count` : Int, `tension` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipAddPathClosedCurve2I; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipAddPathClosedCurve2I`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`Point`>?, `count` : Int, `tension` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipAddPathClosedCurveI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipAddPathClosedCurveI`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`Point`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipAddPathCurve; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipAddPathCurve`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`PointF`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipAddPathCurve2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipAddPathCurve2`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`PointF`>?, `count` : Int, `tension` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipAddPathCurve2I; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipAddPathCurve2I`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`Point`>?, `count` : Int, `tension` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipAddPathCurve3; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipAddPathCurve3`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`PointF`>?, `count` : Int, `offset` : Int, `numberofsegments` : Int, `tension` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipAddPathCurve3I; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipAddPathCurve3I`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`Point`>?, `count` : Int, `offset` : Int, `numberofsegments` : Int, `tension` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipAddPathCurveI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipAddPathCurveI`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`Point`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipAddPathEllipse; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipAddPathEllipse`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `x` : Float, `y` : Float, `width` : Float, `height` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipAddPathEllipseI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipAddPathEllipseI`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `x` : Int, `y` : Int, `width` : Int, `height` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipAddPathLine; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipAddPathLine`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `x1` : Float, `y1` : Float, `x2` : Float, `y2` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipAddPathLine2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipAddPathLine2`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`PointF`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipAddPathLine2I; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipAddPathLine2I`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`Point`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipAddPathLineI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipAddPathLineI`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `x1` : Int, `y1` : Int, `x2` : Int, `y2` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipAddPathPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipAddPathPath`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `addingpath` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpPath`>?, `connect` : `windows_sys`.`core`.`BOOL`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipAddPathPie; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipAddPathPie`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `x` : Float, `y` : Float, `width` : Float, `height` : Float, `startangle` : Float, `sweepangle` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipAddPathPieI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipAddPathPieI`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `x` : Int, `y` : Int, `width` : Int, `height` : Int, `startangle` : Float, `sweepangle` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipAddPathPolygon; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipAddPathPolygon`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`PointF`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipAddPathPolygonI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipAddPathPolygonI`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`Point`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipAddPathRectangle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipAddPathRectangle`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `x` : Float, `y` : Float, `width` : Float, `height` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipAddPathRectangleI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipAddPathRectangleI`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `x` : Int, `y` : Int, `width` : Int, `height` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipAddPathRectangles; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipAddPathRectangles`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `rects` : /* Rust *const */ kotlinx.cinterop.CPointer<`RectF`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipAddPathRectanglesI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipAddPathRectanglesI`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `rects` : /* Rust *const */ kotlinx.cinterop.CPointer<`Rect`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipAddPathString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipAddPathString`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `string` : `windows_sys`.`core`.`PCWSTR`, `length` : Int, `family` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpFontFamily`>?, `style` : Int, `emsize` : Float, `layoutrect` : /* Rust *const */ kotlinx.cinterop.CPointer<`RectF`>?, `format` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpStringFormat`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipAddPathStringI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipAddPathStringI`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `string` : `windows_sys`.`core`.`PCWSTR`, `length` : Int, `family` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpFontFamily`>?, `style` : Int, `emsize` : Float, `layoutrect` : /* Rust *const */ kotlinx.cinterop.CPointer<`Rect`>?, `format` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpStringFormat`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipAlloc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipAlloc`(`size` : ULong) : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipBeginContainer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipBeginContainer`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `dstrect` : /* Rust *const */ kotlinx.cinterop.CPointer<`RectF`>?, `srcrect` : /* Rust *const */ kotlinx.cinterop.CPointer<`RectF`>?, `unit` : `Unit`, `state` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipBeginContainer2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipBeginContainer2`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `state` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipBeginContainerI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipBeginContainerI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `dstrect` : /* Rust *const */ kotlinx.cinterop.CPointer<`Rect`>?, `srcrect` : /* Rust *const */ kotlinx.cinterop.CPointer<`Rect`>?, `unit` : `Unit`, `state` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipBitmapApplyEffect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipBitmapApplyEffect`(`bitmap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpBitmap`>?, `effect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CGpEffect`>?, `roi` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `useauxdata` : `windows_sys`.`core`.`BOOL`, `auxdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `auxdatasize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipBitmapConvertFormat; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipBitmapConvertFormat`(`pinputbitmap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpBitmap`>?, `format` : Int, `dithertype` : `DitherType`, `palettetype` : `PaletteType`, `palette` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ColorPalette`>?, `alphathresholdpercent` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipBitmapCreateApplyEffect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipBitmapCreateApplyEffect`(`inputbitmaps` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpBitmap`>>?, `numinputs` : Int, `effect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CGpEffect`>?, `roi` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `outputrect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?, `outputbitmap` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpBitmap`>>?, `useauxdata` : `windows_sys`.`core`.`BOOL`, `auxdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `auxdatasize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipBitmapGetHistogram; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipBitmapGetHistogram`(`bitmap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpBitmap`>?, `format` : `HistogramFormat`, `numberofentries` : UInt, `channel0` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `channel1` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `channel2` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `channel3` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipBitmapGetHistogramSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipBitmapGetHistogramSize`(`format` : `HistogramFormat`, `numberofentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipBitmapGetPixel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipBitmapGetPixel`(`bitmap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpBitmap`>?, `x` : Int, `y` : Int, `color` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipBitmapLockBits; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipBitmapLockBits`(`bitmap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpBitmap`>?, `rect` : /* Rust *const */ kotlinx.cinterop.CPointer<`Rect`>?, `flags` : UInt, `format` : Int, `lockedbitmapdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`BitmapData`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipBitmapSetPixel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipBitmapSetPixel`(`bitmap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpBitmap`>?, `x` : Int, `y` : Int, `color` : UInt) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipBitmapSetResolution; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipBitmapSetResolution`(`bitmap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpBitmap`>?, `xdpi` : Float, `ydpi` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipBitmapUnlockBits; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipBitmapUnlockBits`(`bitmap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpBitmap`>?, `lockedbitmapdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`BitmapData`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipClearPathMarkers; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipClearPathMarkers`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCloneBitmapArea; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCloneBitmapArea`(`x` : Float, `y` : Float, `width` : Float, `height` : Float, `format` : Int, `srcbitmap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpBitmap`>?, `dstbitmap` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpBitmap`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCloneBitmapAreaI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCloneBitmapAreaI`(`x` : Int, `y` : Int, `width` : Int, `height` : Int, `format` : Int, `srcbitmap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpBitmap`>?, `dstbitmap` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpBitmap`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCloneBrush; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCloneBrush`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpBrush`>?, `clonebrush` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpBrush`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCloneCustomLineCap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCloneCustomLineCap`(`customcap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpCustomLineCap`>?, `clonedcap` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpCustomLineCap`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCloneFont; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCloneFont`(`font` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpFont`>?, `clonefont` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpFont`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCloneFontFamily; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCloneFontFamily`(`fontfamily` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpFontFamily`>?, `clonedfontfamily` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpFontFamily`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCloneImage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCloneImage`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `cloneimage` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpImage`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCloneImageAttributes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCloneImageAttributes`(`imageattr` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpImageAttributes`>?, `cloneimageattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpImageAttributes`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCloneMatrix; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCloneMatrix`(`matrix` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Matrix`>?, `clonematrix` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`Matrix`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipClonePath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipClonePath`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `clonepath` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpPath`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipClonePen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipClonePen`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `clonepen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpPen`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCloneRegion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCloneRegion`(`region` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpRegion`>?, `cloneregion` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpRegion`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCloneStringFormat; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCloneStringFormat`(`format` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpStringFormat`>?, `newformat` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpStringFormat`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipClosePathFigure; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipClosePathFigure`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipClosePathFigures; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipClosePathFigures`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCombineRegionPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCombineRegionPath`(`region` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpRegion`>?, `path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `combinemode` : `CombineMode`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCombineRegionRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCombineRegionRect`(`region` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpRegion`>?, `rect` : /* Rust *const */ kotlinx.cinterop.CPointer<`RectF`>?, `combinemode` : `CombineMode`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCombineRegionRectI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCombineRegionRectI`(`region` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpRegion`>?, `rect` : /* Rust *const */ kotlinx.cinterop.CPointer<`Rect`>?, `combinemode` : `CombineMode`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCombineRegionRegion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCombineRegionRegion`(`region` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpRegion`>?, `region2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpRegion`>?, `combinemode` : `CombineMode`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipComment; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipComment`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `sizedata` : UInt, `data` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipConvertToEmfPlus; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipConvertToEmfPlus`(`refgraphics` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `metafile` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpMetafile`>?, `conversionfailureflag` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `emftype` : `EmfType`, `description` : `windows_sys`.`core`.`PCWSTR`, `out_metafile` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpMetafile`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipConvertToEmfPlusToFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipConvertToEmfPlusToFile`(`refgraphics` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `metafile` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpMetafile`>?, `conversionfailureflag` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `filename` : `windows_sys`.`core`.`PCWSTR`, `emftype` : `EmfType`, `description` : `windows_sys`.`core`.`PCWSTR`, `out_metafile` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpMetafile`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipConvertToEmfPlusToStream; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `GdipConvertToEmfPlusToStream`(`refgraphics` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `metafile` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpMetafile`>?, `conversionfailureflag` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `stream` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `emftype` : `EmfType`, `description` : `windows_sys`.`core`.`PCWSTR`, `out_metafile` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpMetafile`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateAdjustableArrowCap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateAdjustableArrowCap`(`height` : Float, `width` : Float, `isfilled` : `windows_sys`.`core`.`BOOL`, `cap` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpAdjustableArrowCap`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateBitmapFromFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateBitmapFromFile`(`filename` : `windows_sys`.`core`.`PCWSTR`, `bitmap` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpBitmap`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateBitmapFromFileICM; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateBitmapFromFileICM`(`filename` : `windows_sys`.`core`.`PCWSTR`, `bitmap` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpBitmap`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateBitmapFromGdiDib; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GdipCreateBitmapFromGdiDib`(`gdibitmapinfo` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`BITMAPINFO`>?, `gdibitmapdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bitmap` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpBitmap`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateBitmapFromGraphics; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateBitmapFromGraphics`(`width` : Int, `height` : Int, `target` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `bitmap` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpBitmap`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateBitmapFromHBITMAP; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GdipCreateBitmapFromHBITMAP`(`hbm` : `super`.`Gdi`.`HBITMAP`, `hpal` : `super`.`Gdi`.`HPALETTE`, `bitmap` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpBitmap`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateBitmapFromHICON; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `GdipCreateBitmapFromHICON`(`hicon` : `super`.`super`.`UI`.`WindowsAndMessaging`.`HICON`, `bitmap` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpBitmap`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateBitmapFromResource; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateBitmapFromResource`(`hinstance` : `super`.`super`.`Foundation`.`HINSTANCE`, `lpbitmapname` : `windows_sys`.`core`.`PCWSTR`, `bitmap` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpBitmap`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateBitmapFromScan0; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateBitmapFromScan0`(`width` : Int, `height` : Int, `stride` : Int, `format` : Int, `scan0` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `bitmap` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpBitmap`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateBitmapFromStream; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `GdipCreateBitmapFromStream`(`stream` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bitmap` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpBitmap`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateBitmapFromStreamICM; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `GdipCreateBitmapFromStreamICM`(`stream` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `bitmap` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpBitmap`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateCachedBitmap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateCachedBitmap`(`bitmap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpBitmap`>?, `graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `cachedbitmap` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpCachedBitmap`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateCustomLineCap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateCustomLineCap`(`fillpath` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `strokepath` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `basecap` : `LineCap`, `baseinset` : Float, `customcap` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpCustomLineCap`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateEffect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateEffect`(`guid` : `windows_sys`.`core`.`GUID`, `effect` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`CGpEffect`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateFont; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateFont`(`fontfamily` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpFontFamily`>?, `emsize` : Float, `style` : Int, `unit` : `Unit`, `font` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpFont`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateFontFamilyFromName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateFontFamilyFromName`(`name` : `windows_sys`.`core`.`PCWSTR`, `fontcollection` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpFontCollection`>?, `fontfamily` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpFontFamily`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateFontFromDC; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GdipCreateFontFromDC`(`hdc` : `super`.`Gdi`.`HDC`, `font` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpFont`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateFontFromLogfontA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GdipCreateFontFromLogfontA`(`hdc` : `super`.`Gdi`.`HDC`, `logfont` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`LOGFONTA`>?, `font` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpFont`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateFontFromLogfontW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GdipCreateFontFromLogfontW`(`hdc` : `super`.`Gdi`.`HDC`, `logfont` : /* Rust *const */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`LOGFONTW`>?, `font` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpFont`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateFromHDC; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GdipCreateFromHDC`(`hdc` : `super`.`Gdi`.`HDC`, `graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpGraphics`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateFromHDC2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GdipCreateFromHDC2`(`hdc` : `super`.`Gdi`.`HDC`, `hdevice` : `super`.`super`.`Foundation`.`HANDLE`, `graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpGraphics`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateFromHWND; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateFromHWND`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpGraphics`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateFromHWNDICM; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateFromHWNDICM`(`hwnd` : `super`.`super`.`Foundation`.`HWND`, `graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpGraphics`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateHBITMAPFromBitmap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GdipCreateHBITMAPFromBitmap`(`bitmap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpBitmap`>?, `hbmreturn` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`HBITMAP`>?, `background` : UInt) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateHICONFromBitmap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_UI_WindowsAndMessaging")]
public external fun `GdipCreateHICONFromBitmap`(`bitmap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpBitmap`>?, `hbmreturn` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`UI`.`WindowsAndMessaging`.`HICON`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateHalftonePalette; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GdipCreateHalftonePalette`() : `super`.`Gdi`.`HPALETTE`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateHatchBrush; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateHatchBrush`(`hatchstyle` : `HatchStyle`, `forecol` : UInt, `backcol` : UInt, `brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpHatch`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateImageAttributes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateImageAttributes`(`imageattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpImageAttributes`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateLineBrush; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateLineBrush`(`point1` : /* Rust *const */ kotlinx.cinterop.CPointer<`PointF`>?, `point2` : /* Rust *const */ kotlinx.cinterop.CPointer<`PointF`>?, `color1` : UInt, `color2` : UInt, `wrapmode` : `WrapMode`, `linegradient` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpLineGradient`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateLineBrushFromRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateLineBrushFromRect`(`rect` : /* Rust *const */ kotlinx.cinterop.CPointer<`RectF`>?, `color1` : UInt, `color2` : UInt, `mode` : `LinearGradientMode`, `wrapmode` : `WrapMode`, `linegradient` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpLineGradient`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateLineBrushFromRectI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateLineBrushFromRectI`(`rect` : /* Rust *const */ kotlinx.cinterop.CPointer<`Rect`>?, `color1` : UInt, `color2` : UInt, `mode` : `LinearGradientMode`, `wrapmode` : `WrapMode`, `linegradient` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpLineGradient`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateLineBrushFromRectWithAngle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateLineBrushFromRectWithAngle`(`rect` : /* Rust *const */ kotlinx.cinterop.CPointer<`RectF`>?, `color1` : UInt, `color2` : UInt, `angle` : Float, `isanglescalable` : `windows_sys`.`core`.`BOOL`, `wrapmode` : `WrapMode`, `linegradient` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpLineGradient`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateLineBrushFromRectWithAngleI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateLineBrushFromRectWithAngleI`(`rect` : /* Rust *const */ kotlinx.cinterop.CPointer<`Rect`>?, `color1` : UInt, `color2` : UInt, `angle` : Float, `isanglescalable` : `windows_sys`.`core`.`BOOL`, `wrapmode` : `WrapMode`, `linegradient` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpLineGradient`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateLineBrushI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateLineBrushI`(`point1` : /* Rust *const */ kotlinx.cinterop.CPointer<`Point`>?, `point2` : /* Rust *const */ kotlinx.cinterop.CPointer<`Point`>?, `color1` : UInt, `color2` : UInt, `wrapmode` : `WrapMode`, `linegradient` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpLineGradient`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateMatrix; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateMatrix`(`matrix` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`Matrix`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateMatrix2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateMatrix2`(`m11` : Float, `m12` : Float, `m21` : Float, `m22` : Float, `dx` : Float, `dy` : Float, `matrix` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`Matrix`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateMatrix3; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateMatrix3`(`rect` : /* Rust *const */ kotlinx.cinterop.CPointer<`RectF`>?, `dstplg` : /* Rust *const */ kotlinx.cinterop.CPointer<`PointF`>?, `matrix` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`Matrix`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateMatrix3I; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateMatrix3I`(`rect` : /* Rust *const */ kotlinx.cinterop.CPointer<`Rect`>?, `dstplg` : /* Rust *const */ kotlinx.cinterop.CPointer<`Point`>?, `matrix` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`Matrix`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateMetafileFromEmf; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GdipCreateMetafileFromEmf`(`hemf` : `super`.`Gdi`.`HENHMETAFILE`, `deleteemf` : `windows_sys`.`core`.`BOOL`, `metafile` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpMetafile`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateMetafileFromFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateMetafileFromFile`(`file` : `windows_sys`.`core`.`PCWSTR`, `metafile` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpMetafile`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateMetafileFromStream; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `GdipCreateMetafileFromStream`(`stream` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `metafile` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpMetafile`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateMetafileFromWmf; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GdipCreateMetafileFromWmf`(`hwmf` : `super`.`Gdi`.`HMETAFILE`, `deletewmf` : `windows_sys`.`core`.`BOOL`, `wmfplaceablefileheader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WmfPlaceableFileHeader`>?, `metafile` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpMetafile`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateMetafileFromWmfFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateMetafileFromWmfFile`(`file` : `windows_sys`.`core`.`PCWSTR`, `wmfplaceablefileheader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WmfPlaceableFileHeader`>?, `metafile` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpMetafile`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreatePath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreatePath`(`brushmode` : `FillMode`, `path` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpPath`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreatePath2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreatePath2`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<`PointF`>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : Int, `param3` : `FillMode`, `path` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpPath`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreatePath2I; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreatePath2I`(`param0` : /* Rust *const */ kotlinx.cinterop.CPointer<`Point`>?, `param1` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `param2` : Int, `param3` : `FillMode`, `path` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpPath`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreatePathGradient; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreatePathGradient`(`points` : /* Rust *const */ kotlinx.cinterop.CPointer<`PointF`>?, `count` : Int, `wrapmode` : `WrapMode`, `polygradient` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpPathGradient`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreatePathGradientFromPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreatePathGradientFromPath`(`path` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpPath`>?, `polygradient` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpPathGradient`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreatePathGradientI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreatePathGradientI`(`points` : /* Rust *const */ kotlinx.cinterop.CPointer<`Point`>?, `count` : Int, `wrapmode` : `WrapMode`, `polygradient` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpPathGradient`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreatePathIter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreatePathIter`(`iterator` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpPathIterator`>>?, `path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreatePen1; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreatePen1`(`color` : UInt, `width` : Float, `unit` : `Unit`, `pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpPen`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreatePen2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreatePen2`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpBrush`>?, `width` : Float, `unit` : `Unit`, `pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpPen`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateRegion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateRegion`(`region` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpRegion`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateRegionHrgn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GdipCreateRegionHrgn`(`hrgn` : `super`.`Gdi`.`HRGN`, `region` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpRegion`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateRegionPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateRegionPath`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `region` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpRegion`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateRegionRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateRegionRect`(`rect` : /* Rust *const */ kotlinx.cinterop.CPointer<`RectF`>?, `region` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpRegion`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateRegionRectI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateRegionRectI`(`rect` : /* Rust *const */ kotlinx.cinterop.CPointer<`Rect`>?, `region` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpRegion`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateRegionRgnData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateRegionRgnData`(`regiondata` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `size` : Int, `region` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpRegion`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateSolidFill; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateSolidFill`(`color` : UInt, `brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpSolidFill`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateStreamOnFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `GdipCreateStreamOnFile`(`filename` : `windows_sys`.`core`.`PCWSTR`, `access` : UInt, `stream` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateStringFormat; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateStringFormat`(`formatattributes` : Int, `language` : UShort, `format` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpStringFormat`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateTexture; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateTexture`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `wrapmode` : `WrapMode`, `texture` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpTexture`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateTexture2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateTexture2`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `wrapmode` : `WrapMode`, `x` : Float, `y` : Float, `width` : Float, `height` : Float, `texture` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpTexture`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateTexture2I; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateTexture2I`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `wrapmode` : `WrapMode`, `x` : Int, `y` : Int, `width` : Int, `height` : Int, `texture` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpTexture`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateTextureIA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateTextureIA`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `imageattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpImageAttributes`>?, `x` : Float, `y` : Float, `width` : Float, `height` : Float, `texture` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpTexture`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipCreateTextureIAI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipCreateTextureIAI`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `imageattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpImageAttributes`>?, `x` : Int, `y` : Int, `width` : Int, `height` : Int, `texture` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpTexture`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDeleteBrush; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDeleteBrush`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpBrush`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDeleteCachedBitmap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDeleteCachedBitmap`(`cachedbitmap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpCachedBitmap`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDeleteCustomLineCap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDeleteCustomLineCap`(`customcap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpCustomLineCap`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDeleteEffect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDeleteEffect`(`effect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CGpEffect`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDeleteFont; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDeleteFont`(`font` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpFont`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDeleteFontFamily; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDeleteFontFamily`(`fontfamily` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpFontFamily`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDeleteGraphics; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDeleteGraphics`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDeleteMatrix; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDeleteMatrix`(`matrix` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Matrix`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDeletePath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDeletePath`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDeletePathIter; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDeletePathIter`(`iterator` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathIterator`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDeletePen; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDeletePen`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDeletePrivateFontCollection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDeletePrivateFontCollection`(`fontcollection` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpFontCollection`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDeleteRegion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDeleteRegion`(`region` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpRegion`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDeleteStringFormat; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDeleteStringFormat`(`format` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpStringFormat`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDisposeImage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDisposeImage`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDisposeImageAttributes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDisposeImageAttributes`(`imageattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImageAttributes`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawArc; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawArc`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `x` : Float, `y` : Float, `width` : Float, `height` : Float, `startangle` : Float, `sweepangle` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawArcI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawArcI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `x` : Int, `y` : Int, `width` : Int, `height` : Int, `startangle` : Float, `sweepangle` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawBezier; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawBezier`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `x1` : Float, `y1` : Float, `x2` : Float, `y2` : Float, `x3` : Float, `y3` : Float, `x4` : Float, `y4` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawBezierI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawBezierI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `x1` : Int, `y1` : Int, `x2` : Int, `y2` : Int, `x3` : Int, `y3` : Int, `x4` : Int, `y4` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawBeziers; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawBeziers`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`PointF`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawBeziersI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawBeziersI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`Point`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawCachedBitmap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawCachedBitmap`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `cachedbitmap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpCachedBitmap`>?, `x` : Int, `y` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawClosedCurve; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawClosedCurve`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`PointF`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawClosedCurve2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawClosedCurve2`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`PointF`>?, `count` : Int, `tension` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawClosedCurve2I; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawClosedCurve2I`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`Point`>?, `count` : Int, `tension` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawClosedCurveI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawClosedCurveI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`Point`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawCurve; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawCurve`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`PointF`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawCurve2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawCurve2`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`PointF`>?, `count` : Int, `tension` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawCurve2I; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawCurve2I`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`Point`>?, `count` : Int, `tension` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawCurve3; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawCurve3`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`PointF`>?, `count` : Int, `offset` : Int, `numberofsegments` : Int, `tension` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawCurve3I; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawCurve3I`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`Point`>?, `count` : Int, `offset` : Int, `numberofsegments` : Int, `tension` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawCurveI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawCurveI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`Point`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawDriverString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawDriverString`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `text` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `length` : Int, `font` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpFont`>?, `brush` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpBrush`>?, `positions` : /* Rust *const */ kotlinx.cinterop.CPointer<`PointF`>?, `flags` : Int, `matrix` : /* Rust *const */ kotlinx.cinterop.CPointer<`Matrix`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawEllipse; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawEllipse`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `x` : Float, `y` : Float, `width` : Float, `height` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawEllipseI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawEllipseI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `x` : Int, `y` : Int, `width` : Int, `height` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawImage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawImage`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `x` : Float, `y` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawImageFX; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawImageFX`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `source` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RectF`>?, `xform` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Matrix`>?, `effect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CGpEffect`>?, `imageattributes` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImageAttributes`>?, `srcunit` : `Unit`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawImageI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawImageI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `x` : Int, `y` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawImagePointRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawImagePointRect`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `x` : Float, `y` : Float, `srcx` : Float, `srcy` : Float, `srcwidth` : Float, `srcheight` : Float, `srcunit` : `Unit`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawImagePointRectI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawImagePointRectI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `x` : Int, `y` : Int, `srcx` : Int, `srcy` : Int, `srcwidth` : Int, `srcheight` : Int, `srcunit` : `Unit`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawImagePoints; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawImagePoints`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `dstpoints` : /* Rust *const */ kotlinx.cinterop.CPointer<`PointF`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawImagePointsI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawImagePointsI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `dstpoints` : /* Rust *const */ kotlinx.cinterop.CPointer<`Point`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawImagePointsRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawImagePointsRect`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`PointF`>?, `count` : Int, `srcx` : Float, `srcy` : Float, `srcwidth` : Float, `srcheight` : Float, `srcunit` : `Unit`, `imageattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpImageAttributes`>?, `callback` : Long, `callbackdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawImagePointsRectI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawImagePointsRectI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`Point`>?, `count` : Int, `srcx` : Int, `srcy` : Int, `srcwidth` : Int, `srcheight` : Int, `srcunit` : `Unit`, `imageattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpImageAttributes`>?, `callback` : Long, `callbackdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawImageRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawImageRect`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `x` : Float, `y` : Float, `width` : Float, `height` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawImageRectI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawImageRectI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `x` : Int, `y` : Int, `width` : Int, `height` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawImageRectRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawImageRectRect`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `dstx` : Float, `dsty` : Float, `dstwidth` : Float, `dstheight` : Float, `srcx` : Float, `srcy` : Float, `srcwidth` : Float, `srcheight` : Float, `srcunit` : `Unit`, `imageattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpImageAttributes`>?, `callback` : Long, `callbackdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawImageRectRectI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawImageRectRectI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `dstx` : Int, `dsty` : Int, `dstwidth` : Int, `dstheight` : Int, `srcx` : Int, `srcy` : Int, `srcwidth` : Int, `srcheight` : Int, `srcunit` : `Unit`, `imageattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpImageAttributes`>?, `callback` : Long, `callbackdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawLine; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawLine`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `x1` : Float, `y1` : Float, `x2` : Float, `y2` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawLineI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawLineI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `x1` : Int, `y1` : Int, `x2` : Int, `y2` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawLines; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawLines`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`PointF`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawLinesI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawLinesI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`Point`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawPath`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawPie; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawPie`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `x` : Float, `y` : Float, `width` : Float, `height` : Float, `startangle` : Float, `sweepangle` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawPieI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawPieI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `x` : Int, `y` : Int, `width` : Int, `height` : Int, `startangle` : Float, `sweepangle` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawPolygon; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawPolygon`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`PointF`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawPolygonI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawPolygonI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`Point`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawRectangle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawRectangle`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `x` : Float, `y` : Float, `width` : Float, `height` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawRectangleI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawRectangleI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `x` : Int, `y` : Int, `width` : Int, `height` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawRectangles; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawRectangles`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `rects` : /* Rust *const */ kotlinx.cinterop.CPointer<`RectF`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawRectanglesI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawRectanglesI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `rects` : /* Rust *const */ kotlinx.cinterop.CPointer<`Rect`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipDrawString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipDrawString`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `string` : `windows_sys`.`core`.`PCWSTR`, `length` : Int, `font` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpFont`>?, `layoutrect` : /* Rust *const */ kotlinx.cinterop.CPointer<`RectF`>?, `stringformat` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpStringFormat`>?, `brush` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpBrush`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipEmfToWmfBits; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GdipEmfToWmfBits`(`hemf` : `super`.`Gdi`.`HENHMETAFILE`, `cbdata16` : UInt, `pdata16` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `imapmode` : Int, `eflags` : Int) : UInt
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipEndContainer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipEndContainer`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `state` : UInt) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipEnumerateMetafileDestPoint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipEnumerateMetafileDestPoint`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `metafile` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpMetafile`>?, `destpoint` : /* Rust *const */ kotlinx.cinterop.CPointer<`PointF`>?, `callback` : Long, `callbackdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `imageattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpImageAttributes`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipEnumerateMetafileDestPointI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipEnumerateMetafileDestPointI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `metafile` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpMetafile`>?, `destpoint` : /* Rust *const */ kotlinx.cinterop.CPointer<`Point`>?, `callback` : Long, `callbackdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `imageattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpImageAttributes`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipEnumerateMetafileDestPoints; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipEnumerateMetafileDestPoints`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `metafile` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpMetafile`>?, `destpoints` : /* Rust *const */ kotlinx.cinterop.CPointer<`PointF`>?, `count` : Int, `callback` : Long, `callbackdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `imageattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpImageAttributes`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipEnumerateMetafileDestPointsI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipEnumerateMetafileDestPointsI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `metafile` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpMetafile`>?, `destpoints` : /* Rust *const */ kotlinx.cinterop.CPointer<`Point`>?, `count` : Int, `callback` : Long, `callbackdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `imageattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpImageAttributes`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipEnumerateMetafileDestRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipEnumerateMetafileDestRect`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `metafile` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpMetafile`>?, `destrect` : /* Rust *const */ kotlinx.cinterop.CPointer<`RectF`>?, `callback` : Long, `callbackdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `imageattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpImageAttributes`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipEnumerateMetafileDestRectI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipEnumerateMetafileDestRectI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `metafile` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpMetafile`>?, `destrect` : /* Rust *const */ kotlinx.cinterop.CPointer<`Rect`>?, `callback` : Long, `callbackdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `imageattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpImageAttributes`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipEnumerateMetafileSrcRectDestPoint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipEnumerateMetafileSrcRectDestPoint`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `metafile` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpMetafile`>?, `destpoint` : /* Rust *const */ kotlinx.cinterop.CPointer<`PointF`>?, `srcrect` : /* Rust *const */ kotlinx.cinterop.CPointer<`RectF`>?, `srcunit` : `Unit`, `callback` : Long, `callbackdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `imageattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpImageAttributes`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipEnumerateMetafileSrcRectDestPointI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipEnumerateMetafileSrcRectDestPointI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `metafile` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpMetafile`>?, `destpoint` : /* Rust *const */ kotlinx.cinterop.CPointer<`Point`>?, `srcrect` : /* Rust *const */ kotlinx.cinterop.CPointer<`Rect`>?, `srcunit` : `Unit`, `callback` : Long, `callbackdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `imageattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpImageAttributes`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipEnumerateMetafileSrcRectDestPoints; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipEnumerateMetafileSrcRectDestPoints`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `metafile` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpMetafile`>?, `destpoints` : /* Rust *const */ kotlinx.cinterop.CPointer<`PointF`>?, `count` : Int, `srcrect` : /* Rust *const */ kotlinx.cinterop.CPointer<`RectF`>?, `srcunit` : `Unit`, `callback` : Long, `callbackdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `imageattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpImageAttributes`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipEnumerateMetafileSrcRectDestPointsI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipEnumerateMetafileSrcRectDestPointsI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `metafile` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpMetafile`>?, `destpoints` : /* Rust *const */ kotlinx.cinterop.CPointer<`Point`>?, `count` : Int, `srcrect` : /* Rust *const */ kotlinx.cinterop.CPointer<`Rect`>?, `srcunit` : `Unit`, `callback` : Long, `callbackdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `imageattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpImageAttributes`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipEnumerateMetafileSrcRectDestRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipEnumerateMetafileSrcRectDestRect`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `metafile` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpMetafile`>?, `destrect` : /* Rust *const */ kotlinx.cinterop.CPointer<`RectF`>?, `srcrect` : /* Rust *const */ kotlinx.cinterop.CPointer<`RectF`>?, `srcunit` : `Unit`, `callback` : Long, `callbackdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `imageattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpImageAttributes`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipEnumerateMetafileSrcRectDestRectI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipEnumerateMetafileSrcRectDestRectI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `metafile` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpMetafile`>?, `destrect` : /* Rust *const */ kotlinx.cinterop.CPointer<`Rect`>?, `srcrect` : /* Rust *const */ kotlinx.cinterop.CPointer<`Rect`>?, `srcunit` : `Unit`, `callback` : Long, `callbackdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `imageattributes` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpImageAttributes`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipFillClosedCurve; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipFillClosedCurve`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpBrush`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`PointF`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipFillClosedCurve2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipFillClosedCurve2`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpBrush`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`PointF`>?, `count` : Int, `tension` : Float, `fillmode` : `FillMode`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipFillClosedCurve2I; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipFillClosedCurve2I`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpBrush`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`Point`>?, `count` : Int, `tension` : Float, `fillmode` : `FillMode`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipFillClosedCurveI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipFillClosedCurveI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpBrush`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`Point`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipFillEllipse; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipFillEllipse`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpBrush`>?, `x` : Float, `y` : Float, `width` : Float, `height` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipFillEllipseI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipFillEllipseI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpBrush`>?, `x` : Int, `y` : Int, `width` : Int, `height` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipFillPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipFillPath`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpBrush`>?, `path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipFillPie; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipFillPie`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpBrush`>?, `x` : Float, `y` : Float, `width` : Float, `height` : Float, `startangle` : Float, `sweepangle` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipFillPieI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipFillPieI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpBrush`>?, `x` : Int, `y` : Int, `width` : Int, `height` : Int, `startangle` : Float, `sweepangle` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipFillPolygon; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipFillPolygon`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpBrush`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`PointF`>?, `count` : Int, `fillmode` : `FillMode`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipFillPolygon2; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipFillPolygon2`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpBrush`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`PointF`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipFillPolygon2I; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipFillPolygon2I`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpBrush`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`Point`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipFillPolygonI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipFillPolygonI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpBrush`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`Point`>?, `count` : Int, `fillmode` : `FillMode`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipFillRectangle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipFillRectangle`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpBrush`>?, `x` : Float, `y` : Float, `width` : Float, `height` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipFillRectangleI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipFillRectangleI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpBrush`>?, `x` : Int, `y` : Int, `width` : Int, `height` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipFillRectangles; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipFillRectangles`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpBrush`>?, `rects` : /* Rust *const */ kotlinx.cinterop.CPointer<`RectF`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipFillRectanglesI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipFillRectanglesI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpBrush`>?, `rects` : /* Rust *const */ kotlinx.cinterop.CPointer<`Rect`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipFillRegion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipFillRegion`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpBrush`>?, `region` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpRegion`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipFindFirstImageItem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipFindFirstImageItem`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `item` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ImageItemData`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipFindNextImageItem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipFindNextImageItem`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `item` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ImageItemData`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipFlattenPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipFlattenPath`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `matrix` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Matrix`>?, `flatness` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipFlush; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipFlush`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `intention` : `FlushIntention`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipFree; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipFree`(`ptr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetAdjustableArrowCapFillState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetAdjustableArrowCapFillState`(`cap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpAdjustableArrowCap`>?, `fillstate` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetAdjustableArrowCapHeight; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetAdjustableArrowCapHeight`(`cap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpAdjustableArrowCap`>?, `height` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetAdjustableArrowCapMiddleInset; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetAdjustableArrowCapMiddleInset`(`cap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpAdjustableArrowCap`>?, `middleinset` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetAdjustableArrowCapWidth; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetAdjustableArrowCapWidth`(`cap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpAdjustableArrowCap`>?, `width` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetAllPropertyItems; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetAllPropertyItems`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `totalbuffersize` : UInt, `numproperties` : UInt, `allitems` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PropertyItem`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetBrushType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetBrushType`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpBrush`>?, `type` : /* Rust *mut */ kotlinx.cinterop.CPointer<`BrushType`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetCellAscent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetCellAscent`(`family` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpFontFamily`>?, `style` : Int, `cellascent` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetCellDescent; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetCellDescent`(`family` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpFontFamily`>?, `style` : Int, `celldescent` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetClip; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetClip`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `region` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpRegion`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetClipBounds; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetClipBounds`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `rect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RectF`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetClipBoundsI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetClipBoundsI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `rect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Rect`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetCompositingMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetCompositingMode`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `compositingmode` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CompositingMode`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetCompositingQuality; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetCompositingQuality`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `compositingquality` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CompositingQuality`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetCustomLineCapBaseCap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetCustomLineCapBaseCap`(`customcap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpCustomLineCap`>?, `basecap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LineCap`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetCustomLineCapBaseInset; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetCustomLineCapBaseInset`(`customcap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpCustomLineCap`>?, `inset` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetCustomLineCapStrokeCaps; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetCustomLineCapStrokeCaps`(`customcap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpCustomLineCap`>?, `startcap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LineCap`>?, `endcap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LineCap`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetCustomLineCapStrokeJoin; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetCustomLineCapStrokeJoin`(`customcap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpCustomLineCap`>?, `linejoin` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LineJoin`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetCustomLineCapType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetCustomLineCapType`(`customcap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpCustomLineCap`>?, `captype` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CustomLineCapType`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetCustomLineCapWidthScale; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetCustomLineCapWidthScale`(`customcap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpCustomLineCap`>?, `widthscale` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetDC; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GdipGetDC`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `hdc` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`HDC`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetDpiX; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetDpiX`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `dpi` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetDpiY; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetDpiY`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `dpi` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetEffectParameterSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetEffectParameterSize`(`effect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CGpEffect`>?, `size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetEffectParameters; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetEffectParameters`(`effect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CGpEffect`>?, `size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `params` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetEmHeight; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetEmHeight`(`family` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpFontFamily`>?, `style` : Int, `emheight` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetEncoderParameterList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetEncoderParameterList`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `clsidencoder` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `size` : UInt, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`EncoderParameters`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetEncoderParameterListSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetEncoderParameterListSize`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `clsidencoder` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetFamily; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetFamily`(`font` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpFont`>?, `family` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpFontFamily`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetFamilyName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetFamilyName`(`family` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpFontFamily`>?, `name` : `windows_sys`.`core`.`PWSTR`, `language` : UShort) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetFontCollectionFamilyCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetFontCollectionFamilyCount`(`fontcollection` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpFontCollection`>?, `numfound` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetFontCollectionFamilyList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetFontCollectionFamilyList`(`fontcollection` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpFontCollection`>?, `numsought` : Int, `gpfamilies` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpFontFamily`>>?, `numfound` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetFontHeight; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetFontHeight`(`font` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpFont`>?, `graphics` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `height` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetFontHeightGivenDPI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetFontHeightGivenDPI`(`font` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpFont`>?, `dpi` : Float, `height` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetFontSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetFontSize`(`font` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpFont`>?, `size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetFontStyle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetFontStyle`(`font` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpFont`>?, `style` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetFontUnit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetFontUnit`(`font` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpFont`>?, `unit` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Unit`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetGenericFontFamilyMonospace; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetGenericFontFamilyMonospace`(`nativefamily` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpFontFamily`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetGenericFontFamilySansSerif; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetGenericFontFamilySansSerif`(`nativefamily` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpFontFamily`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetGenericFontFamilySerif; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetGenericFontFamilySerif`(`nativefamily` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpFontFamily`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetHatchBackgroundColor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetHatchBackgroundColor`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpHatch`>?, `backcol` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetHatchForegroundColor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetHatchForegroundColor`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpHatch`>?, `forecol` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetHatchStyle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetHatchStyle`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpHatch`>?, `hatchstyle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HatchStyle`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetHemfFromMetafile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GdipGetHemfFromMetafile`(`metafile` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpMetafile`>?, `hemf` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`HENHMETAFILE`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetImageAttributesAdjustedPalette; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetImageAttributesAdjustedPalette`(`imageattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImageAttributes`>?, `colorpalette` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ColorPalette`>?, `coloradjusttype` : `ColorAdjustType`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetImageBounds; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetImageBounds`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `srcrect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RectF`>?, `srcunit` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Unit`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetImageDecoders; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetImageDecoders`(`numdecoders` : UInt, `size` : UInt, `decoders` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ImageCodecInfo`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetImageDecodersSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetImageDecodersSize`(`numdecoders` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetImageDimension; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetImageDimension`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `width` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?, `height` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetImageEncoders; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetImageEncoders`(`numencoders` : UInt, `size` : UInt, `encoders` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ImageCodecInfo`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetImageEncodersSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetImageEncodersSize`(`numencoders` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetImageFlags; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetImageFlags`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `flags` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetImageGraphicsContext; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetImageGraphicsContext`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpGraphics`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetImageHeight; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetImageHeight`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `height` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetImageHorizontalResolution; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetImageHorizontalResolution`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `resolution` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetImageItemData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetImageItemData`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `item` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ImageItemData`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetImagePalette; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetImagePalette`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `palette` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ColorPalette`>?, `size` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetImagePaletteSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetImagePaletteSize`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetImagePixelFormat; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetImagePixelFormat`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `format` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetImageRawFormat; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetImageRawFormat`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `format` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetImageThumbnail; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetImageThumbnail`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `thumbwidth` : UInt, `thumbheight` : UInt, `thumbimage` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpImage`>>?, `callback` : Long, `callbackdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetImageType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetImageType`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `type` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ImageType`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetImageVerticalResolution; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetImageVerticalResolution`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `resolution` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetImageWidth; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetImageWidth`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `width` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetInterpolationMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetInterpolationMode`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `interpolationmode` : /* Rust *mut */ kotlinx.cinterop.CPointer<`InterpolationMode`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetLineBlend; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetLineBlend`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpLineGradient`>?, `blend` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?, `positions` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetLineBlendCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetLineBlendCount`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpLineGradient`>?, `count` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetLineColors; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetLineColors`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpLineGradient`>?, `colors` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetLineGammaCorrection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetLineGammaCorrection`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpLineGradient`>?, `usegammacorrection` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetLinePresetBlend; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetLinePresetBlend`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpLineGradient`>?, `blend` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `positions` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetLinePresetBlendCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetLinePresetBlendCount`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpLineGradient`>?, `count` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetLineRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetLineRect`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpLineGradient`>?, `rect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RectF`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetLineRectI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetLineRectI`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpLineGradient`>?, `rect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Rect`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetLineSpacing; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetLineSpacing`(`family` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpFontFamily`>?, `style` : Int, `linespacing` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetLineTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetLineTransform`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpLineGradient`>?, `matrix` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Matrix`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetLineWrapMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetLineWrapMode`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpLineGradient`>?, `wrapmode` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WrapMode`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetLogFontA; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GdipGetLogFontA`(`font` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpFont`>?, `graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `logfonta` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`LOGFONTA`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetLogFontW; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GdipGetLogFontW`(`font` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpFont`>?, `graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `logfontw` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`LOGFONTW`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetMatrixElements; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetMatrixElements`(`matrix` : /* Rust *const */ kotlinx.cinterop.CPointer<`Matrix`>?, `matrixout` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetMetafileDownLevelRasterizationLimit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetMetafileDownLevelRasterizationLimit`(`metafile` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpMetafile`>?, `metafilerasterizationlimitdpi` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetMetafileHeaderFromEmf; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GdipGetMetafileHeaderFromEmf`(`hemf` : `super`.`Gdi`.`HENHMETAFILE`, `header` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MetafileHeader`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetMetafileHeaderFromFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GdipGetMetafileHeaderFromFile`(`filename` : `windows_sys`.`core`.`PCWSTR`, `header` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MetafileHeader`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetMetafileHeaderFromMetafile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GdipGetMetafileHeaderFromMetafile`(`metafile` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpMetafile`>?, `header` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MetafileHeader`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetMetafileHeaderFromStream; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_System_Com"))]
public external fun `GdipGetMetafileHeaderFromStream`(`stream` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `header` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MetafileHeader`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetMetafileHeaderFromWmf; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GdipGetMetafileHeaderFromWmf`(`hwmf` : `super`.`Gdi`.`HMETAFILE`, `wmfplaceablefileheader` : /* Rust *const */ kotlinx.cinterop.CPointer<`WmfPlaceableFileHeader`>?, `header` : /* Rust *mut */ kotlinx.cinterop.CPointer<`MetafileHeader`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetNearestColor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetNearestColor`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `argb` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPageScale; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPageScale`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `scale` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPageUnit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPageUnit`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `unit` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Unit`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPathData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPathData`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `pathdata` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PathData`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPathFillMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPathFillMode`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `fillmode` : /* Rust *mut */ kotlinx.cinterop.CPointer<`FillMode`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPathGradientBlend; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPathGradientBlend`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathGradient`>?, `blend` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?, `positions` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPathGradientBlendCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPathGradientBlendCount`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathGradient`>?, `count` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPathGradientCenterColor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPathGradientCenterColor`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathGradient`>?, `colors` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPathGradientCenterPoint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPathGradientCenterPoint`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathGradient`>?, `points` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PointF`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPathGradientCenterPointI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPathGradientCenterPointI`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathGradient`>?, `points` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Point`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPathGradientFocusScales; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPathGradientFocusScales`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathGradient`>?, `xscale` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?, `yscale` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPathGradientGammaCorrection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPathGradientGammaCorrection`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathGradient`>?, `usegammacorrection` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPathGradientPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPathGradientPath`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathGradient`>?, `path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPathGradientPointCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPathGradientPointCount`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathGradient`>?, `count` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPathGradientPresetBlend; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPathGradientPresetBlend`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathGradient`>?, `blend` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `positions` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPathGradientPresetBlendCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPathGradientPresetBlendCount`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathGradient`>?, `count` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPathGradientRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPathGradientRect`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathGradient`>?, `rect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RectF`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPathGradientRectI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPathGradientRectI`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathGradient`>?, `rect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Rect`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPathGradientSurroundColorCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPathGradientSurroundColorCount`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathGradient`>?, `count` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPathGradientSurroundColorsWithCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPathGradientSurroundColorsWithCount`(`brush` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpPathGradient`>?, `color` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `count` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPathGradientTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPathGradientTransform`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathGradient`>?, `matrix` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Matrix`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPathGradientWrapMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPathGradientWrapMode`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathGradient`>?, `wrapmode` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WrapMode`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPathLastPoint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPathLastPoint`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `lastpoint` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PointF`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPathPoints; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPathPoints`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `points` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PointF`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPathPointsI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPathPointsI`(`param0` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `points` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Point`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPathTypes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPathTypes`(`path` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpPath`>?, `types` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPathWorldBounds; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPathWorldBounds`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `bounds` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RectF`>?, `matrix` : /* Rust *const */ kotlinx.cinterop.CPointer<`Matrix`>?, `pen` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpPen`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPathWorldBoundsI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPathWorldBoundsI`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `bounds` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Rect`>?, `matrix` : /* Rust *const */ kotlinx.cinterop.CPointer<`Matrix`>?, `pen` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpPen`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPenBrushFill; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPenBrushFill`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpBrush`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPenColor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPenColor`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `argb` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPenCompoundArray; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPenCompoundArray`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `dash` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPenCompoundCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPenCompoundCount`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `count` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPenCustomEndCap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPenCustomEndCap`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `customcap` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpCustomLineCap`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPenCustomStartCap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPenCustomStartCap`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `customcap` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpCustomLineCap`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPenDashArray; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPenDashArray`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `dash` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPenDashCap197819; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPenDashCap197819`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `dashcap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DashCap`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPenDashCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPenDashCount`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `count` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPenDashOffset; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPenDashOffset`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `offset` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPenDashStyle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPenDashStyle`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `dashstyle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`DashStyle`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPenEndCap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPenEndCap`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `endcap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LineCap`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPenFillType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPenFillType`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `type` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PenType`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPenLineJoin; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPenLineJoin`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `linejoin` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LineJoin`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPenMiterLimit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPenMiterLimit`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `miterlimit` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPenMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPenMode`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `penmode` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PenAlignment`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPenStartCap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPenStartCap`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `startcap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`LineCap`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPenTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPenTransform`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `matrix` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Matrix`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPenUnit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPenUnit`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `unit` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Unit`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPenWidth; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPenWidth`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `width` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPixelOffsetMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPixelOffsetMode`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `pixeloffsetmode` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PixelOffsetMode`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPointCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPointCount`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `count` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPropertyCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPropertyCount`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `numofproperty` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPropertyIdList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPropertyIdList`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `numofproperty` : UInt, `list` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPropertyItem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPropertyItem`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `propid` : UInt, `propsize` : UInt, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PropertyItem`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPropertyItemSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPropertyItemSize`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `propid` : UInt, `size` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetPropertySize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetPropertySize`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `totalbuffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `numproperties` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetRegionBounds; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetRegionBounds`(`region` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpRegion`>?, `graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `rect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RectF`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetRegionBoundsI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetRegionBoundsI`(`region` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpRegion`>?, `graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `rect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Rect`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetRegionData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetRegionData`(`region` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpRegion`>?, `buffer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `buffersize` : UInt, `sizefilled` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetRegionDataSize; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetRegionDataSize`(`region` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpRegion`>?, `buffersize` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetRegionHRgn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GdipGetRegionHRgn`(`region` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpRegion`>?, `graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `hrgn` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`Gdi`.`HRGN`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetRegionScans; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetRegionScans`(`region` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpRegion`>?, `rects` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RectF`>?, `count` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `matrix` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Matrix`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetRegionScansCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetRegionScansCount`(`region` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpRegion`>?, `count` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `matrix` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Matrix`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetRegionScansI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetRegionScansI`(`region` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpRegion`>?, `rects` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Rect`>?, `count` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `matrix` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Matrix`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetRenderingOrigin; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetRenderingOrigin`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `x` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `y` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetSmoothingMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetSmoothingMode`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `smoothingmode` : /* Rust *mut */ kotlinx.cinterop.CPointer<`SmoothingMode`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetSolidFillColor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetSolidFillColor`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpSolidFill`>?, `color` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetStringFormatAlign; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetStringFormatAlign`(`format` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpStringFormat`>?, `align` : /* Rust *mut */ kotlinx.cinterop.CPointer<`StringAlignment`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetStringFormatDigitSubstitution; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetStringFormatDigitSubstitution`(`format` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpStringFormat`>?, `language` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `substitute` : /* Rust *mut */ kotlinx.cinterop.CPointer<`StringDigitSubstitute`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetStringFormatFlags; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetStringFormatFlags`(`format` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpStringFormat`>?, `flags` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetStringFormatHotkeyPrefix; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetStringFormatHotkeyPrefix`(`format` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpStringFormat`>?, `hotkeyprefix` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetStringFormatLineAlign; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetStringFormatLineAlign`(`format` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpStringFormat`>?, `align` : /* Rust *mut */ kotlinx.cinterop.CPointer<`StringAlignment`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetStringFormatMeasurableCharacterRangeCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetStringFormatMeasurableCharacterRangeCount`(`format` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpStringFormat`>?, `count` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetStringFormatTabStopCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetStringFormatTabStopCount`(`format` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpStringFormat`>?, `count` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetStringFormatTabStops; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetStringFormatTabStops`(`format` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpStringFormat`>?, `count` : Int, `firsttaboffset` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?, `tabstops` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetStringFormatTrimming; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetStringFormatTrimming`(`format` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpStringFormat`>?, `trimming` : /* Rust *mut */ kotlinx.cinterop.CPointer<`StringTrimming`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetTextContrast; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetTextContrast`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `contrast` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetTextRenderingHint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetTextRenderingHint`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `mode` : /* Rust *mut */ kotlinx.cinterop.CPointer<`TextRenderingHint`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetTextureImage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetTextureImage`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpTexture`>?, `image` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpImage`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetTextureTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetTextureTransform`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpTexture`>?, `matrix` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Matrix`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetTextureWrapMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetTextureWrapMode`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpTexture`>?, `wrapmode` : /* Rust *mut */ kotlinx.cinterop.CPointer<`WrapMode`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetVisibleClipBounds; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetVisibleClipBounds`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `rect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RectF`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetVisibleClipBoundsI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetVisibleClipBoundsI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `rect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Rect`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGetWorldTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGetWorldTransform`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `matrix` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Matrix`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGraphicsClear; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGraphicsClear`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `color` : UInt) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipGraphicsSetAbort; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipGraphicsSetAbort`(`pgraphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `piabort` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipImageForceValidation; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipImageForceValidation`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipImageGetFrameCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipImageGetFrameCount`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `dimensionid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `count` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipImageGetFrameDimensionsCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipImageGetFrameDimensionsCount`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `count` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipImageGetFrameDimensionsList; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipImageGetFrameDimensionsList`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `dimensionids` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `count` : UInt) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipImageRotateFlip; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipImageRotateFlip`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `rftype` : `RotateFlipType`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipImageSelectActiveFrame; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipImageSelectActiveFrame`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `dimensionid` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `frameindex` : UInt) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipImageSetAbort; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipImageSetAbort`(`pimage` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `piabort` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipInitializePalette; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipInitializePalette`(`palette` : /* Rust *mut */ kotlinx.cinterop.CPointer<`ColorPalette`>?, `palettetype` : `PaletteType`, `optimalcolors` : Int, `usetransparentcolor` : `windows_sys`.`core`.`BOOL`, `bitmap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpBitmap`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipInvertMatrix; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipInvertMatrix`(`matrix` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Matrix`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipIsClipEmpty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipIsClipEmpty`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `result` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipIsEmptyRegion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipIsEmptyRegion`(`region` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpRegion`>?, `graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `result` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipIsEqualRegion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipIsEqualRegion`(`region` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpRegion`>?, `region2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpRegion`>?, `graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `result` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipIsInfiniteRegion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipIsInfiniteRegion`(`region` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpRegion`>?, `graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `result` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipIsMatrixEqual; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipIsMatrixEqual`(`matrix` : /* Rust *const */ kotlinx.cinterop.CPointer<`Matrix`>?, `matrix2` : /* Rust *const */ kotlinx.cinterop.CPointer<`Matrix`>?, `result` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipIsMatrixIdentity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipIsMatrixIdentity`(`matrix` : /* Rust *const */ kotlinx.cinterop.CPointer<`Matrix`>?, `result` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipIsMatrixInvertible; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipIsMatrixInvertible`(`matrix` : /* Rust *const */ kotlinx.cinterop.CPointer<`Matrix`>?, `result` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipIsOutlineVisiblePathPoint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipIsOutlineVisiblePathPoint`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `x` : Float, `y` : Float, `pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `result` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipIsOutlineVisiblePathPointI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipIsOutlineVisiblePathPointI`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `x` : Int, `y` : Int, `pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `result` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipIsStyleAvailable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipIsStyleAvailable`(`family` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpFontFamily`>?, `style` : Int, `isstyleavailable` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipIsVisibleClipEmpty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipIsVisibleClipEmpty`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `result` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipIsVisiblePathPoint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipIsVisiblePathPoint`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `x` : Float, `y` : Float, `graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `result` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipIsVisiblePathPointI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipIsVisiblePathPointI`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `x` : Int, `y` : Int, `graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `result` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipIsVisiblePoint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipIsVisiblePoint`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `x` : Float, `y` : Float, `result` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipIsVisiblePointI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipIsVisiblePointI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `x` : Int, `y` : Int, `result` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipIsVisibleRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipIsVisibleRect`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `x` : Float, `y` : Float, `width` : Float, `height` : Float, `result` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipIsVisibleRectI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipIsVisibleRectI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `x` : Int, `y` : Int, `width` : Int, `height` : Int, `result` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipIsVisibleRegionPoint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipIsVisibleRegionPoint`(`region` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpRegion`>?, `x` : Float, `y` : Float, `graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `result` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipIsVisibleRegionPointI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipIsVisibleRegionPointI`(`region` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpRegion`>?, `x` : Int, `y` : Int, `graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `result` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipIsVisibleRegionRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipIsVisibleRegionRect`(`region` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpRegion`>?, `x` : Float, `y` : Float, `width` : Float, `height` : Float, `graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `result` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipIsVisibleRegionRectI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipIsVisibleRegionRectI`(`region` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpRegion`>?, `x` : Int, `y` : Int, `width` : Int, `height` : Int, `graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `result` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipLoadImageFromFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipLoadImageFromFile`(`filename` : `windows_sys`.`core`.`PCWSTR`, `image` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpImage`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipLoadImageFromFileICM; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipLoadImageFromFileICM`(`filename` : `windows_sys`.`core`.`PCWSTR`, `image` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpImage`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipLoadImageFromStream; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `GdipLoadImageFromStream`(`stream` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `image` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpImage`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipLoadImageFromStreamICM; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `GdipLoadImageFromStreamICM`(`stream` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `image` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpImage`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipMeasureCharacterRanges; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipMeasureCharacterRanges`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `string` : `windows_sys`.`core`.`PCWSTR`, `length` : Int, `font` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpFont`>?, `layoutrect` : /* Rust *const */ kotlinx.cinterop.CPointer<`RectF`>?, `stringformat` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpStringFormat`>?, `regioncount` : Int, `regions` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpRegion`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipMeasureDriverString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipMeasureDriverString`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `text` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UShortVar>?, `length` : Int, `font` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpFont`>?, `positions` : /* Rust *const */ kotlinx.cinterop.CPointer<`PointF`>?, `flags` : Int, `matrix` : /* Rust *const */ kotlinx.cinterop.CPointer<`Matrix`>?, `boundingbox` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RectF`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipMeasureString; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipMeasureString`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `string` : `windows_sys`.`core`.`PCWSTR`, `length` : Int, `font` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpFont`>?, `layoutrect` : /* Rust *const */ kotlinx.cinterop.CPointer<`RectF`>?, `stringformat` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpStringFormat`>?, `boundingbox` : /* Rust *mut */ kotlinx.cinterop.CPointer<`RectF`>?, `codepointsfitted` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `linesfilled` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipMultiplyLineTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipMultiplyLineTransform`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpLineGradient`>?, `matrix` : /* Rust *const */ kotlinx.cinterop.CPointer<`Matrix`>?, `order` : `MatrixOrder`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipMultiplyMatrix; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipMultiplyMatrix`(`matrix` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Matrix`>?, `matrix2` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Matrix`>?, `order` : `MatrixOrder`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipMultiplyPathGradientTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipMultiplyPathGradientTransform`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathGradient`>?, `matrix` : /* Rust *const */ kotlinx.cinterop.CPointer<`Matrix`>?, `order` : `MatrixOrder`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipMultiplyPenTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipMultiplyPenTransform`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `matrix` : /* Rust *const */ kotlinx.cinterop.CPointer<`Matrix`>?, `order` : `MatrixOrder`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipMultiplyTextureTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipMultiplyTextureTransform`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpTexture`>?, `matrix` : /* Rust *const */ kotlinx.cinterop.CPointer<`Matrix`>?, `order` : `MatrixOrder`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipMultiplyWorldTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipMultiplyWorldTransform`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `matrix` : /* Rust *const */ kotlinx.cinterop.CPointer<`Matrix`>?, `order` : `MatrixOrder`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipNewInstalledFontCollection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipNewInstalledFontCollection`(`fontcollection` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpFontCollection`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipNewPrivateFontCollection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipNewPrivateFontCollection`(`fontcollection` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpFontCollection`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipPathIterCopyData; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipPathIterCopyData`(`iterator` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathIterator`>?, `resultcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `points` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PointF`>?, `types` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `startindex` : Int, `endindex` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipPathIterEnumerate; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipPathIterEnumerate`(`iterator` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathIterator`>?, `resultcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `points` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PointF`>?, `types` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipPathIterGetCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipPathIterGetCount`(`iterator` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathIterator`>?, `count` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipPathIterGetSubpathCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipPathIterGetSubpathCount`(`iterator` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathIterator`>?, `count` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipPathIterHasCurve; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipPathIterHasCurve`(`iterator` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathIterator`>?, `hascurve` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipPathIterIsValid; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipPathIterIsValid`(`iterator` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathIterator`>?, `valid` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipPathIterNextMarker; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipPathIterNextMarker`(`iterator` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathIterator`>?, `resultcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `startindex` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `endindex` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipPathIterNextMarkerPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipPathIterNextMarkerPath`(`iterator` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathIterator`>?, `resultcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipPathIterNextPathType; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipPathIterNextPathType`(`iterator` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathIterator`>?, `resultcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `pathtype` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, `startindex` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `endindex` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipPathIterNextSubpath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipPathIterNextSubpath`(`iterator` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathIterator`>?, `resultcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `startindex` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `endindex` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `isclosed` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipPathIterNextSubpathPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipPathIterNextSubpathPath`(`iterator` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathIterator`>?, `resultcount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?, `path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `isclosed` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`BOOL`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipPathIterRewind; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipPathIterRewind`(`iterator` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathIterator`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipPlayMetafileRecord; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipPlayMetafileRecord`(`metafile` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpMetafile`>?, `recordtype` : `EmfPlusRecordType`, `flags` : UInt, `datasize` : UInt, `data` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipPrivateAddFontFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipPrivateAddFontFile`(`fontcollection` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpFontCollection`>?, `filename` : `windows_sys`.`core`.`PCWSTR`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipPrivateAddMemoryFont; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipPrivateAddMemoryFont`(`fontcollection` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpFontCollection`>?, `memory` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `length` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipRecordMetafile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GdipRecordMetafile`(`referencehdc` : `super`.`Gdi`.`HDC`, `type` : `EmfType`, `framerect` : /* Rust *const */ kotlinx.cinterop.CPointer<`RectF`>?, `frameunit` : `MetafileFrameUnit`, `description` : `windows_sys`.`core`.`PCWSTR`, `metafile` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpMetafile`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipRecordMetafileFileName; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GdipRecordMetafileFileName`(`filename` : `windows_sys`.`core`.`PCWSTR`, `referencehdc` : `super`.`Gdi`.`HDC`, `type` : `EmfType`, `framerect` : /* Rust *const */ kotlinx.cinterop.CPointer<`RectF`>?, `frameunit` : `MetafileFrameUnit`, `description` : `windows_sys`.`core`.`PCWSTR`, `metafile` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpMetafile`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipRecordMetafileFileNameI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GdipRecordMetafileFileNameI`(`filename` : `windows_sys`.`core`.`PCWSTR`, `referencehdc` : `super`.`Gdi`.`HDC`, `type` : `EmfType`, `framerect` : /* Rust *const */ kotlinx.cinterop.CPointer<`Rect`>?, `frameunit` : `MetafileFrameUnit`, `description` : `windows_sys`.`core`.`PCWSTR`, `metafile` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpMetafile`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipRecordMetafileI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GdipRecordMetafileI`(`referencehdc` : `super`.`Gdi`.`HDC`, `type` : `EmfType`, `framerect` : /* Rust *const */ kotlinx.cinterop.CPointer<`Rect`>?, `frameunit` : `MetafileFrameUnit`, `description` : `windows_sys`.`core`.`PCWSTR`, `metafile` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpMetafile`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipRecordMetafileStream; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_System_Com"))]
public external fun `GdipRecordMetafileStream`(`stream` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `referencehdc` : `super`.`Gdi`.`HDC`, `type` : `EmfType`, `framerect` : /* Rust *const */ kotlinx.cinterop.CPointer<`RectF`>?, `frameunit` : `MetafileFrameUnit`, `description` : `windows_sys`.`core`.`PCWSTR`, `metafile` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpMetafile`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipRecordMetafileStreamI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(all(feature = "Win32_Graphics_Gdi", feature = "Win32_System_Com"))]
public external fun `GdipRecordMetafileStreamI`(`stream` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `referencehdc` : `super`.`Gdi`.`HDC`, `type` : `EmfType`, `framerect` : /* Rust *const */ kotlinx.cinterop.CPointer<`Rect`>?, `frameunit` : `MetafileFrameUnit`, `description` : `windows_sys`.`core`.`PCWSTR`, `metafile` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpMetafile`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipReleaseDC; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GdipReleaseDC`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `hdc` : `super`.`Gdi`.`HDC`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipRemovePropertyItem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipRemovePropertyItem`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `propid` : UInt) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipResetClip; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipResetClip`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipResetImageAttributes; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipResetImageAttributes`(`imageattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImageAttributes`>?, `type` : `ColorAdjustType`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipResetLineTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipResetLineTransform`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpLineGradient`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipResetPageTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipResetPageTransform`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipResetPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipResetPath`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipResetPathGradientTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipResetPathGradientTransform`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathGradient`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipResetPenTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipResetPenTransform`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipResetTextureTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipResetTextureTransform`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpTexture`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipResetWorldTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipResetWorldTransform`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipRestoreGraphics; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipRestoreGraphics`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `state` : UInt) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipReversePath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipReversePath`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipRotateLineTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipRotateLineTransform`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpLineGradient`>?, `angle` : Float, `order` : `MatrixOrder`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipRotateMatrix; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipRotateMatrix`(`matrix` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Matrix`>?, `angle` : Float, `order` : `MatrixOrder`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipRotatePathGradientTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipRotatePathGradientTransform`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathGradient`>?, `angle` : Float, `order` : `MatrixOrder`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipRotatePenTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipRotatePenTransform`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `angle` : Float, `order` : `MatrixOrder`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipRotateTextureTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipRotateTextureTransform`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpTexture`>?, `angle` : Float, `order` : `MatrixOrder`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipRotateWorldTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipRotateWorldTransform`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `angle` : Float, `order` : `MatrixOrder`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSaveAdd; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSaveAdd`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `encoderparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`EncoderParameters`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSaveAddImage; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSaveAddImage`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `newimage` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `encoderparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`EncoderParameters`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSaveGraphics; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSaveGraphics`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `state` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSaveImageToFile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSaveImageToFile`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `filename` : `windows_sys`.`core`.`PCWSTR`, `clsidencoder` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `encoderparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`EncoderParameters`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSaveImageToStream; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_System_Com")]
public external fun `GdipSaveImageToStream`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `stream` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `clsidencoder` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `encoderparams` : /* Rust *const */ kotlinx.cinterop.CPointer<`EncoderParameters`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipScaleLineTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipScaleLineTransform`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpLineGradient`>?, `sx` : Float, `sy` : Float, `order` : `MatrixOrder`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipScaleMatrix; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipScaleMatrix`(`matrix` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Matrix`>?, `scalex` : Float, `scaley` : Float, `order` : `MatrixOrder`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipScalePathGradientTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipScalePathGradientTransform`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathGradient`>?, `sx` : Float, `sy` : Float, `order` : `MatrixOrder`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipScalePenTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipScalePenTransform`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `sx` : Float, `sy` : Float, `order` : `MatrixOrder`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipScaleTextureTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipScaleTextureTransform`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpTexture`>?, `sx` : Float, `sy` : Float, `order` : `MatrixOrder`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipScaleWorldTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipScaleWorldTransform`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `sx` : Float, `sy` : Float, `order` : `MatrixOrder`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetAdjustableArrowCapFillState; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetAdjustableArrowCapFillState`(`cap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpAdjustableArrowCap`>?, `fillstate` : `windows_sys`.`core`.`BOOL`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetAdjustableArrowCapHeight; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetAdjustableArrowCapHeight`(`cap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpAdjustableArrowCap`>?, `height` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetAdjustableArrowCapMiddleInset; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetAdjustableArrowCapMiddleInset`(`cap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpAdjustableArrowCap`>?, `middleinset` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetAdjustableArrowCapWidth; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetAdjustableArrowCapWidth`(`cap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpAdjustableArrowCap`>?, `width` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetClipGraphics; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetClipGraphics`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `srcgraphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `combinemode` : `CombineMode`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetClipHrgn; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
public external fun `GdipSetClipHrgn`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `hrgn` : `super`.`Gdi`.`HRGN`, `combinemode` : `CombineMode`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetClipPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetClipPath`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `combinemode` : `CombineMode`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetClipRect; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetClipRect`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `x` : Float, `y` : Float, `width` : Float, `height` : Float, `combinemode` : `CombineMode`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetClipRectI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetClipRectI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `x` : Int, `y` : Int, `width` : Int, `height` : Int, `combinemode` : `CombineMode`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetClipRegion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetClipRegion`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `region` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpRegion`>?, `combinemode` : `CombineMode`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetCompositingMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetCompositingMode`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `compositingmode` : `CompositingMode`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetCompositingQuality; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetCompositingQuality`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `compositingquality` : `CompositingQuality`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetCustomLineCapBaseCap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetCustomLineCapBaseCap`(`customcap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpCustomLineCap`>?, `basecap` : `LineCap`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetCustomLineCapBaseInset; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetCustomLineCapBaseInset`(`customcap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpCustomLineCap`>?, `inset` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetCustomLineCapStrokeCaps; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetCustomLineCapStrokeCaps`(`customcap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpCustomLineCap`>?, `startcap` : `LineCap`, `endcap` : `LineCap`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetCustomLineCapStrokeJoin; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetCustomLineCapStrokeJoin`(`customcap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpCustomLineCap`>?, `linejoin` : `LineJoin`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetCustomLineCapWidthScale; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetCustomLineCapWidthScale`(`customcap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpCustomLineCap`>?, `widthscale` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetEffectParameters; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetEffectParameters`(`effect` : /* Rust *mut */ kotlinx.cinterop.CPointer<`CGpEffect`>?, `params` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `size` : UInt) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetEmpty; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetEmpty`(`region` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpRegion`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetImageAttributesCachedBackground; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetImageAttributesCachedBackground`(`imageattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImageAttributes`>?, `enableflag` : `windows_sys`.`core`.`BOOL`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetImageAttributesColorKeys; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetImageAttributesColorKeys`(`imageattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImageAttributes`>?, `type` : `ColorAdjustType`, `enableflag` : `windows_sys`.`core`.`BOOL`, `colorlow` : UInt, `colorhigh` : UInt) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetImageAttributesColorMatrix; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetImageAttributesColorMatrix`(`imageattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImageAttributes`>?, `type` : `ColorAdjustType`, `enableflag` : `windows_sys`.`core`.`BOOL`, `colormatrix` : /* Rust *const */ kotlinx.cinterop.CPointer<`ColorMatrix`>?, `graymatrix` : /* Rust *const */ kotlinx.cinterop.CPointer<`ColorMatrix`>?, `flags` : `ColorMatrixFlags`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetImageAttributesGamma; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetImageAttributesGamma`(`imageattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImageAttributes`>?, `type` : `ColorAdjustType`, `enableflag` : `windows_sys`.`core`.`BOOL`, `gamma` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetImageAttributesNoOp; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetImageAttributesNoOp`(`imageattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImageAttributes`>?, `type` : `ColorAdjustType`, `enableflag` : `windows_sys`.`core`.`BOOL`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetImageAttributesOutputChannel; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetImageAttributesOutputChannel`(`imageattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImageAttributes`>?, `type` : `ColorAdjustType`, `enableflag` : `windows_sys`.`core`.`BOOL`, `channelflags` : `ColorChannelFlags`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetImageAttributesOutputChannelColorProfile; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetImageAttributesOutputChannelColorProfile`(`imageattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImageAttributes`>?, `type` : `ColorAdjustType`, `enableflag` : `windows_sys`.`core`.`BOOL`, `colorprofilefilename` : `windows_sys`.`core`.`PCWSTR`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetImageAttributesRemapTable; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetImageAttributesRemapTable`(`imageattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImageAttributes`>?, `type` : `ColorAdjustType`, `enableflag` : `windows_sys`.`core`.`BOOL`, `mapsize` : UInt, `map` : /* Rust *const */ kotlinx.cinterop.CPointer<`ColorMap`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetImageAttributesThreshold; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetImageAttributesThreshold`(`imageattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImageAttributes`>?, `type` : `ColorAdjustType`, `enableflag` : `windows_sys`.`core`.`BOOL`, `threshold` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetImageAttributesToIdentity; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetImageAttributesToIdentity`(`imageattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImageAttributes`>?, `type` : `ColorAdjustType`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetImageAttributesWrapMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetImageAttributesWrapMode`(`imageattr` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImageAttributes`>?, `wrap` : `WrapMode`, `argb` : UInt, `clamp` : `windows_sys`.`core`.`BOOL`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetImagePalette; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetImagePalette`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `palette` : /* Rust *const */ kotlinx.cinterop.CPointer<`ColorPalette`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetInfinite; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetInfinite`(`region` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpRegion`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetInterpolationMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetInterpolationMode`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `interpolationmode` : `InterpolationMode`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetLineBlend; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetLineBlend`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpLineGradient`>?, `blend` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?, `positions` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetLineColors; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetLineColors`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpLineGradient`>?, `color1` : UInt, `color2` : UInt) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetLineGammaCorrection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetLineGammaCorrection`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpLineGradient`>?, `usegammacorrection` : `windows_sys`.`core`.`BOOL`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetLineLinearBlend; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetLineLinearBlend`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpLineGradient`>?, `focus` : Float, `scale` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetLinePresetBlend; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetLinePresetBlend`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpLineGradient`>?, `blend` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `positions` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetLineSigmaBlend; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetLineSigmaBlend`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpLineGradient`>?, `focus` : Float, `scale` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetLineTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetLineTransform`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpLineGradient`>?, `matrix` : /* Rust *const */ kotlinx.cinterop.CPointer<`Matrix`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetLineWrapMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetLineWrapMode`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpLineGradient`>?, `wrapmode` : `WrapMode`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetMatrixElements; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetMatrixElements`(`matrix` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Matrix`>?, `m11` : Float, `m12` : Float, `m21` : Float, `m22` : Float, `dx` : Float, `dy` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetMetafileDownLevelRasterizationLimit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetMetafileDownLevelRasterizationLimit`(`metafile` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpMetafile`>?, `metafilerasterizationlimitdpi` : UInt) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetPageScale; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetPageScale`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `scale` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetPageUnit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetPageUnit`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `unit` : `Unit`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetPathFillMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetPathFillMode`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `fillmode` : `FillMode`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetPathGradientBlend; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetPathGradientBlend`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathGradient`>?, `blend` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?, `positions` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetPathGradientCenterColor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetPathGradientCenterColor`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathGradient`>?, `colors` : UInt) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetPathGradientCenterPoint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetPathGradientCenterPoint`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathGradient`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`PointF`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetPathGradientCenterPointI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetPathGradientCenterPointI`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathGradient`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`Point`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetPathGradientFocusScales; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetPathGradientFocusScales`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathGradient`>?, `xscale` : Float, `yscale` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetPathGradientGammaCorrection; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetPathGradientGammaCorrection`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathGradient`>?, `usegammacorrection` : `windows_sys`.`core`.`BOOL`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetPathGradientLinearBlend; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetPathGradientLinearBlend`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathGradient`>?, `focus` : Float, `scale` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetPathGradientPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetPathGradientPath`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathGradient`>?, `path` : /* Rust *const */ kotlinx.cinterop.CPointer<`GpPath`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetPathGradientPresetBlend; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetPathGradientPresetBlend`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathGradient`>?, `blend` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `positions` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetPathGradientSigmaBlend; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetPathGradientSigmaBlend`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathGradient`>?, `focus` : Float, `scale` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetPathGradientSurroundColorsWithCount; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetPathGradientSurroundColorsWithCount`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathGradient`>?, `color` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `count` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.IntVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetPathGradientTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetPathGradientTransform`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathGradient`>?, `matrix` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Matrix`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetPathGradientWrapMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetPathGradientWrapMode`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathGradient`>?, `wrapmode` : `WrapMode`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetPathMarker; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetPathMarker`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetPenBrushFill; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetPenBrushFill`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpBrush`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetPenColor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetPenColor`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `argb` : UInt) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetPenCompoundArray; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetPenCompoundArray`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `dash` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetPenCustomEndCap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetPenCustomEndCap`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `customcap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpCustomLineCap`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetPenCustomStartCap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetPenCustomStartCap`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `customcap` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpCustomLineCap`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetPenDashArray; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetPenDashArray`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `dash` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetPenDashCap197819; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetPenDashCap197819`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `dashcap` : `DashCap`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetPenDashOffset; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetPenDashOffset`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `offset` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetPenDashStyle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetPenDashStyle`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `dashstyle` : `DashStyle`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetPenEndCap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetPenEndCap`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `endcap` : `LineCap`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetPenLineCap197819; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetPenLineCap197819`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `startcap` : `LineCap`, `endcap` : `LineCap`, `dashcap` : `DashCap`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetPenLineJoin; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetPenLineJoin`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `linejoin` : `LineJoin`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetPenMiterLimit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetPenMiterLimit`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `miterlimit` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetPenMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetPenMode`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `penmode` : `PenAlignment`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetPenStartCap; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetPenStartCap`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `startcap` : `LineCap`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetPenTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetPenTransform`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `matrix` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Matrix`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetPenUnit; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetPenUnit`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `unit` : `Unit`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetPenWidth; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetPenWidth`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `width` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetPixelOffsetMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetPixelOffsetMode`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `pixeloffsetmode` : `PixelOffsetMode`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetPropertyItem; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetPropertyItem`(`image` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpImage`>?, `item` : /* Rust *const */ kotlinx.cinterop.CPointer<`PropertyItem`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetRenderingOrigin; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetRenderingOrigin`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `x` : Int, `y` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetSmoothingMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetSmoothingMode`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `smoothingmode` : `SmoothingMode`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetSolidFillColor; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetSolidFillColor`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpSolidFill`>?, `color` : UInt) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetStringFormatAlign; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetStringFormatAlign`(`format` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpStringFormat`>?, `align` : `StringAlignment`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetStringFormatDigitSubstitution; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetStringFormatDigitSubstitution`(`format` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpStringFormat`>?, `language` : UShort, `substitute` : `StringDigitSubstitute`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetStringFormatFlags; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetStringFormatFlags`(`format` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpStringFormat`>?, `flags` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetStringFormatHotkeyPrefix; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetStringFormatHotkeyPrefix`(`format` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpStringFormat`>?, `hotkeyprefix` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetStringFormatLineAlign; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetStringFormatLineAlign`(`format` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpStringFormat`>?, `align` : `StringAlignment`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetStringFormatMeasurableCharacterRanges; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetStringFormatMeasurableCharacterRanges`(`format` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpStringFormat`>?, `rangecount` : Int, `ranges` : /* Rust *const */ kotlinx.cinterop.CPointer<`CharacterRange`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetStringFormatTabStops; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetStringFormatTabStops`(`format` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpStringFormat`>?, `firsttaboffset` : Float, `count` : Int, `tabstops` : /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.FloatVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetStringFormatTrimming; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetStringFormatTrimming`(`format` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpStringFormat`>?, `trimming` : `StringTrimming`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetTextContrast; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetTextContrast`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `contrast` : UInt) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetTextRenderingHint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetTextRenderingHint`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `mode` : `TextRenderingHint`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetTextureTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetTextureTransform`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpTexture`>?, `matrix` : /* Rust *const */ kotlinx.cinterop.CPointer<`Matrix`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetTextureWrapMode; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetTextureWrapMode`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpTexture`>?, `wrapmode` : `WrapMode`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipSetWorldTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipSetWorldTransform`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `matrix` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Matrix`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipShearMatrix; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipShearMatrix`(`matrix` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Matrix`>?, `shearx` : Float, `sheary` : Float, `order` : `MatrixOrder`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipStartPathFigure; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipStartPathFigure`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipStringFormatGetGenericDefault; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipStringFormatGetGenericDefault`(`format` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpStringFormat`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipStringFormatGetGenericTypographic; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipStringFormatGetGenericTypographic`(`format` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`GpStringFormat`>>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipTestControl; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipTestControl`(`control` : `GpTestControlEnum`, `param1` : /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipTransformMatrixPoints; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipTransformMatrixPoints`(`matrix` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Matrix`>?, `pts` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PointF`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipTransformMatrixPointsI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipTransformMatrixPointsI`(`matrix` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Matrix`>?, `pts` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Point`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipTransformPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipTransformPath`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `matrix` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Matrix`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipTransformPoints; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipTransformPoints`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `destspace` : `CoordinateSpace`, `srcspace` : `CoordinateSpace`, `points` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PointF`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipTransformPointsI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipTransformPointsI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `destspace` : `CoordinateSpace`, `srcspace` : `CoordinateSpace`, `points` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Point`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipTransformRegion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipTransformRegion`(`region` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpRegion`>?, `matrix` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Matrix`>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipTranslateClip; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipTranslateClip`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `dx` : Float, `dy` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipTranslateClipI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipTranslateClipI`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `dx` : Int, `dy` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipTranslateLineTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipTranslateLineTransform`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpLineGradient`>?, `dx` : Float, `dy` : Float, `order` : `MatrixOrder`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipTranslateMatrix; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipTranslateMatrix`(`matrix` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Matrix`>?, `offsetx` : Float, `offsety` : Float, `order` : `MatrixOrder`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipTranslatePathGradientTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipTranslatePathGradientTransform`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPathGradient`>?, `dx` : Float, `dy` : Float, `order` : `MatrixOrder`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipTranslatePenTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipTranslatePenTransform`(`pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `dx` : Float, `dy` : Float, `order` : `MatrixOrder`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipTranslateRegion; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipTranslateRegion`(`region` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpRegion`>?, `dx` : Float, `dy` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipTranslateRegionI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipTranslateRegionI`(`region` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpRegion`>?, `dx` : Int, `dy` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipTranslateTextureTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipTranslateTextureTransform`(`brush` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpTexture`>?, `dx` : Float, `dy` : Float, `order` : `MatrixOrder`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipTranslateWorldTransform; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipTranslateWorldTransform`(`graphics` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpGraphics`>?, `dx` : Float, `dy` : Float, `order` : `MatrixOrder`) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipVectorTransformMatrixPoints; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipVectorTransformMatrixPoints`(`matrix` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Matrix`>?, `pts` : /* Rust *mut */ kotlinx.cinterop.CPointer<`PointF`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipVectorTransformMatrixPointsI; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipVectorTransformMatrixPointsI`(`matrix` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Matrix`>?, `pts` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Point`>?, `count` : Int) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipWarpPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipWarpPath`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `matrix` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Matrix`>?, `points` : /* Rust *const */ kotlinx.cinterop.CPointer<`PointF`>?, `count` : Int, `srcx` : Float, `srcy` : Float, `srcwidth` : Float, `srcheight` : Float, `warpmode` : `WarpMode`, `flatness` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipWidenPath; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipWidenPath`(`nativepath` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `pen` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPen`>?, `matrix` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Matrix`>?, `flatness` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdipWindingModeOutline; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdipWindingModeOutline`(`path` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GpPath`>?, `matrix` : /* Rust *mut */ kotlinx.cinterop.CPointer<`Matrix`>?, `flatness` : Float) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdiplusNotificationHook; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdiplusNotificationHook`(`token` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) : `Status`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdiplusNotificationUnhook; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdiplusNotificationUnhook`(`token` : ULong)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdiplusShutdown; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdiplusShutdown`(`token` : ULong)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=gdiplus.dll, ABI=system, export=GdiplusStartup; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `GdiplusStartup`(`token` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?, `input` : /* Rust *const */ kotlinx.cinterop.CPointer<`GdiplusStartupInput`>?, `output` : /* Rust *mut */ kotlinx.cinterop.CPointer<`GdiplusStartupOutput`>?) : `Status`
public const val `ALPHA_SHIFT`: UInt = 24u;
public const val `Aborted`: `Status` = 9;
public const val `AccessDenied`: `Status` = 12;
public const val `AdjustBlackSaturation`: `CurveAdjustments` = 7;
public const val `AdjustContrast`: `CurveAdjustments` = 2;
public const val `AdjustDensity`: `CurveAdjustments` = 1;
public const val `AdjustExposure`: `CurveAdjustments` = 0;
public const val `AdjustHighlight`: `CurveAdjustments` = 3;
public const val `AdjustMidtone`: `CurveAdjustments` = 5;
public const val `AdjustShadow`: `CurveAdjustments` = 4;
public const val `AdjustWhiteSaturation`: `CurveAdjustments` = 6;
public const val `BLUE_SHIFT`: UInt = 0u;
public typealias `Bitmap` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BitmapData` (
    public var `Width`: UInt,
    public var `Height`: UInt,
    public var `Stride`: Int,
    public var `PixelFormat`: Int,
    public var `Scan0`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `Reserved`: ULong,
)
// UNSUPPORTED Rust 693:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for BitmapData {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `Blur` (
    public var `Base`: `Effect`,
)
// UNSUPPORTED Rust 703:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const BlurEffectGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x633c80a4_1843_482b_9ef2_be2834c5fdd4);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `BlurParams` (
    public var `radius`: Float,
    public var `expandEdge`: `windows_sys`.`core`.`BOOL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `BrightnessContrast` (
    public var `Base`: `Effect`,
)
// UNSUPPORTED Rust 715:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const BrightnessContrastEffectGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xd3a1dbe1_8ec4_4c17_9f4c_ea97ad1c343d);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `BrightnessContrastParams` (
    public var `brightnessLevel`: Int,
    public var `contrastLevel`: Int,
)
public typealias `BrushType` = Int;
public const val `BrushTypeHatchFill`: `BrushType` = 1;
public const val `BrushTypeLinearGradient`: `BrushType` = 4;
public const val `BrushTypePathGradient`: `BrushType` = 3;
public const val `BrushTypeSolidColor`: `BrushType` = 0;
public const val `BrushTypeTextureFill`: `BrushType` = 2;
public typealias `CGpEffect` = Long;
public typealias `CachedBitmap` = Long;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `CharacterRange` (
    public var `First`: Int,
    public var `Length`: Int,
)
// UNSUPPORTED Rust 736:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const CodecIImageBytes: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x025d1823_6c7d_447b_bbdb_a3cbc3dfa2fc);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `Color` (
    public var `Argb`: UInt,
)
// UNSUPPORTED Rust 742:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Color {
//     pub const AliceBlue: i32 = -984833i32;
//     pub const AntiqueWhite: i32 = -332841i32;
//     pub const Aqua: i32 = -16711681i32;
//     pub const Aquamarine: i32 = -8388652i32;
//     pub const Azure: i32 = -983041i32;
//     pub const Beige: i32 = -657956i32;
//     pub const Bisque: i32 = -6972i32;
//     pub const Black: i32 = -16777216i32;
//     pub const BlanchedAlmond: i32 = -5171i32;
//     pub const Blue: i32 = -16776961i32;
//     pub const BlueViolet: i32 = -7722014i32;
//     pub const Brown: i32 = -5952982i32;
//     pub const BurlyWood: i32 = -2180985i32;
//     pub const CadetBlue: i32 = -10510688i32;
//     pub const Chartreuse: i32 = -8388864i32;
//     pub const Chocolate: i32 = -2987746i32;
//     pub const Coral: i32 = -32944i32;
//     pub const CornflowerBlue: i32 = -10185235i32;
//     pub const Cornsilk: i32 = -1828i32;
//     pub const Crimson: i32 = -2354116i32;
//     pub const Cyan: i32 = -16711681i32;
//     pub const DarkBlue: i32 = -16777077i32;
//     pub const DarkCyan: i32 = -16741493i32;
//     pub const DarkGoldenrod: i32 = -4684277i32;
//     pub const DarkGray: i32 = -5658199i32;
//     pub const DarkGreen: i32 = -16751616i32;
//     pub const DarkKhaki: i32 = -4343957i32;
//     pub const DarkMagenta: i32 = -7667573i32;
//     pub const DarkOliveGreen: i32 = -11179217i32;
//     pub const DarkOrange: i32 = -29696i32;
//     pub const DarkOrchid: i32 = -6737204i32;
//     pub const DarkRed: i32 = -7667712i32;
//     pub const DarkSalmon: i32 = -1468806i32;
//     pub const DarkSeaGreen: i32 = -7357301i32;
//     pub const DarkSlateBlue: i32 = -12042869i32;
//     pub const DarkSlateGray: i32 = -13676721i32;
//     pub const DarkTurquoise: i32 = -16724271i32;
//     pub const DarkViolet: i32 = -7077677i32;
//     pub const DeepPink: i32 = -60269i32;
//     pub const DeepSkyBlue: i32 = -16728065i32;
//     pub const DimGray: i32 = -9868951i32;
//     pub const DodgerBlue: i32 = -14774017i32;
//     pub const Firebrick: i32 = -5103070i32;
//     pub const FloralWhite: i32 = -1296i32;
//     pub const ForestGreen: i32 = -14513374i32;
//     pub const Fuchsia: i32 = -65281i32;
//     pub const Gainsboro: i32 = -2302756i32;
//     pub const GhostWhite: i32 = -460545i32;
//     pub const Gold: i32 = -10496i32;
//     pub const Goldenrod: i32 = -2448096i32;
//     pub const Gray: i32 = -8355712i32;
//     pub const Green: i32 = -16744448i32;
//     pub const GreenYellow: i32 = -5374161i32;
//     pub const Honeydew: i32 = -983056i32;
//     pub const HotPink: i32 = -38476i32;
//     pub const IndianRed: i32 = -3318692i32;
//     pub const Indigo: i32 = -11861886i32;
//     pub const Ivory: i32 = -16i32;
//     pub const Khaki: i32 = -989556i32;
//     pub const Lavender: i32 = -1644806i32;
//     pub const LavenderBlush: i32 = -3851i32;
//     pub const LawnGreen: i32 = -8586240i32;
//     pub const LemonChiffon: i32 = -1331i32;
//     pub const LightBlue: i32 = -5383962i32;
//     pub const LightCoral: i32 = -1015680i32;
//     pub const LightCyan: i32 = -2031617i32;
//     pub const LightGoldenrodYellow: i32 = -329006i32;
//     pub const LightGray: i32 = -2894893i32;
//     pub const LightGreen: i32 = -7278960i32;
//     pub const LightPink: i32 = -18751i32;
//     pub const LightSalmon: i32 = -24454i32;
//     pub const LightSeaGreen: i32 = -14634326i32;
//     pub const LightSkyBlue: i32 = -7876870i32;
//     pub const LightSlateGray: i32 = -8943463i32;
//     pub const LightSteelBlue: i32 = -5192482i32;
//     pub const LightYellow: i32 = -32i32;
//     pub const Lime: i32 = -16711936i32;
//     pub const LimeGreen: i32 = -13447886i32;
//     pub const Linen: i32 = -331546i32;
//     pub const Magenta: i32 = -65281i32;
//     pub const Maroon: i32 = -8388608i32;
//     pub const MediumAquamarine: i32 = -10039894i32;
//     pub const MediumBlue: i32 = -16777011i32;
//     pub const MediumOrchid: i32 = -4565549i32;
//     pub const MediumPurple: i32 = -7114533i32;
//     pub const MediumSeaGreen: i32 = -12799119i32;
//     pub const MediumSlateBlue: i32 = -8689426i32;
//     pub const MediumSpringGreen: i32 = -16713062i32;
//     pub const MediumTurquoise: i32 = -12004916i32;
//     pub const MediumVioletRed: i32 = -3730043i32;
//     pub const MidnightBlue: i32 = -15132304i32;
//     pub const MintCream: i32 = -655366i32;
//     pub const MistyRose: i32 = -6943i32;
//     pub const Moccasin: i32 = -6987i32;
//     pub const NavajoWhite: i32 = -8531i32;
//     pub const Navy: i32 = -16777088i32;
//     pub const OldLace: i32 = -133658i32;
//     pub const Olive: i32 = -8355840i32;
//     pub const OliveDrab: i32 = -9728477i32;
//     pub const Orange: i32 = -23296i32;
//     pub const OrangeRed: i32 = -47872i32;
//     pub const Orchid: i32 = -2461482i32;
//     pub const PaleGoldenrod: i32 = -1120086i32;
//     pub const PaleGreen: i32 = -6751336i32;
//     pub const PaleTurquoise: i32 = -5247250i32;
//     pub const PaleVioletRed: i32 = -2396013i32;
//     pub const PapayaWhip: i32 = -4139i32;
//     pub const PeachPuff: i32 = -9543i32;
//     pub const Peru: i32 = -3308225i32;
//     pub const Pink: i32 = -16181i32;
//     pub const Plum: i32 = -2252579i32;
//     pub const PowderBlue: i32 = -5185306i32;
//     pub const Purple: i32 = -8388480i32;
//     pub const Red: i32 = -65536i32;
//     pub const RosyBrown: i32 = -4419697i32;
//     pub const RoyalBlue: i32 = -12490271i32;
//     pub const SaddleBrown: i32 = -7650029i32;
//     pub const Salmon: i32 = -360334i32;
//     pub const SandyBrown: i32 = -744352i32;
//     pub const SeaGreen: i32 = -13726889i32;
//     pub const SeaShell: i32 = -2578i32;
//     pub const Sienna: i32 = -6270419i32;
//     pub const Silver: i32 = -4144960i32;
//     pub const SkyBlue: i32 = -7876885i32;
//     pub const SlateBlue: i32 = -9807155i32;
//     pub const SlateGray: i32 = -9404272i32;
//     pub const Snow: i32 = -1286i32;
//     pub const SpringGreen: i32 = -16711809i32;
//     pub const SteelBlue: i32 = -12156236i32;
//     pub const Tan: i32 = -2968436i32;
//     pub const Teal: i32 = -16744320i32;
//     pub const Thistle: i32 = -2572328i32;
//     pub const Tomato: i32 = -40121i32;
//     pub const Transparent: i32 = 16777215i32;
//     pub const Turquoise: i32 = -12525360i32;
//     pub const Violet: i32 = -1146130i32;
//     pub const Wheat: i32 = -663885i32;
//     pub const White: i32 = -1i32;
//     pub const WhiteSmoke: i32 = -657931i32;
//     pub const Yellow: i32 = -256i32;
//     pub const YellowGreen: i32 = -6632142i32;
//     pub const AlphaShift: i32 = 24i32;
//     pub const RedShift: i32 = 16i32;
//     pub const GreenShift: i32 = 8i32;
//     pub const BlueShift: i32 = 0i32;
//     pub const AlphaMask: i32 = -16777216i32;
//     pub const RedMask: i32 = 16711680i32;
//     pub const GreenMask: i32 = 65280i32;
//     pub const BlueMask: i32 = 255i32;
// }

public typealias `ColorAdjustType` = Int;
public const val `ColorAdjustTypeAny`: `ColorAdjustType` = 6;
public const val `ColorAdjustTypeBitmap`: `ColorAdjustType` = 1;
public const val `ColorAdjustTypeBrush`: `ColorAdjustType` = 2;
public const val `ColorAdjustTypeCount`: `ColorAdjustType` = 5;
public const val `ColorAdjustTypeDefault`: `ColorAdjustType` = 0;
public const val `ColorAdjustTypePen`: `ColorAdjustType` = 3;
public const val `ColorAdjustTypeText`: `ColorAdjustType` = 4;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ColorBalance` (
    public var `Base`: `Effect`,
)
// UNSUPPORTED Rust 906:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ColorBalanceEffectGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x537e597d_251e_48da_9664_29ca496b70f8);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ColorBalanceParams` (
    public var `cyanRed`: Int,
    public var `magentaGreen`: Int,
    public var `yellowBlue`: Int,
)
public typealias `ColorChannelFlags` = Int;
public const val `ColorChannelFlagsC`: `ColorChannelFlags` = 0;
public const val `ColorChannelFlagsK`: `ColorChannelFlags` = 3;
public const val `ColorChannelFlagsLast`: `ColorChannelFlags` = 4;
public const val `ColorChannelFlagsM`: `ColorChannelFlags` = 1;
public const val `ColorChannelFlagsY`: `ColorChannelFlags` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ColorCurve` (
    public var `Base`: `Effect`,
)
// UNSUPPORTED Rust 925:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ColorCurveEffectGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xdd6a0022_58e4_4a67_9d9b_d48eb881a53d);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ColorCurveParams` (
    public var `adjustment`: `CurveAdjustments`,
    public var `channel`: `CurveChannel`,
    public var `adjustValue`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ColorLUT` (
    public var `Base`: `Effect`,
)
// UNSUPPORTED Rust 938:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ColorLUTEffectGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa7ce72a9_0f7f_40d7_b3cc_d0c02d5c3212);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ColorLUTParams` (
    public var `lutB`: UByteArray,
    public var `lutG`: UByteArray,
    public var `lutR`: UByteArray,
    public var `lutA`: UByteArray,
)
// UNSUPPORTED Rust 947:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ColorLUTParams {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ColorMap` (
    public var `oldColor`: `Color`,
    public var `newColor`: `Color`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 25 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ColorMatrix` (
    public var `m`: FloatArray,
)
// UNSUPPORTED Rust 963:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ColorMatrix {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ColorMatrixEffect` (
    public var `Base`: `Effect`,
)
// UNSUPPORTED Rust 973:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ColorMatrixEffectGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x718f2615_7933_40e3_a511_5f68fe14dd74);

public typealias `ColorMatrixFlags` = Int;
public const val `ColorMatrixFlagsAltGray`: `ColorMatrixFlags` = 2;
public const val `ColorMatrixFlagsDefault`: `ColorMatrixFlags` = 0;
public const val `ColorMatrixFlagsSkipGrays`: `ColorMatrixFlags` = 1;
public typealias `ColorMode` = Int;
public const val `ColorModeARGB32`: `ColorMode` = 0;
public const val `ColorModeARGB64`: `ColorMode` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ColorPalette` (
    public var `Flags`: UInt,
    public var `Count`: UInt,
    public var `Entries`: UIntArray,
)
// UNSUPPORTED Rust 988:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ColorPalette {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `CombineMode` = Int;
public const val `CombineModeComplement`: `CombineMode` = 5;
public const val `CombineModeExclude`: `CombineMode` = 4;
public const val `CombineModeIntersect`: `CombineMode` = 1;
public const val `CombineModeReplace`: `CombineMode` = 0;
public const val `CombineModeUnion`: `CombineMode` = 2;
public const val `CombineModeXor`: `CombineMode` = 3;
public typealias `CompositingMode` = Int;
public const val `CompositingModeSourceCopy`: `CompositingMode` = 1;
public const val `CompositingModeSourceOver`: `CompositingMode` = 0;
public typealias `CompositingQuality` = Int;
public const val `CompositingQualityAssumeLinear`: `CompositingQuality` = 4;
public const val `CompositingQualityDefault`: `CompositingQuality` = 0;
public const val `CompositingQualityGammaCorrected`: `CompositingQuality` = 3;
public const val `CompositingQualityHighQuality`: `CompositingQuality` = 2;
public const val `CompositingQualityHighSpeed`: `CompositingQuality` = 1;
public const val `CompositingQualityInvalid`: `CompositingQuality` = -1;
public typealias `ConvertToEmfPlusFlags` = Int;
public const val `ConvertToEmfPlusFlagsDefault`: `ConvertToEmfPlusFlags` = 0;
public const val `ConvertToEmfPlusFlagsInvalidRecord`: `ConvertToEmfPlusFlags` = 4;
public const val `ConvertToEmfPlusFlagsRopUsed`: `ConvertToEmfPlusFlags` = 1;
public const val `ConvertToEmfPlusFlagsText`: `ConvertToEmfPlusFlags` = 2;
public typealias `CoordinateSpace` = Int;
public const val `CoordinateSpaceDevice`: `CoordinateSpace` = 2;
public const val `CoordinateSpacePage`: `CoordinateSpace` = 1;
public const val `CoordinateSpaceWorld`: `CoordinateSpace` = 0;
public typealias `CurveAdjustments` = Int;
public typealias `CurveChannel` = Int;
public const val `CurveChannelAll`: `CurveChannel` = 0;
public const val `CurveChannelBlue`: `CurveChannel` = 3;
public const val `CurveChannelGreen`: `CurveChannel` = 2;
public const val `CurveChannelRed`: `CurveChannel` = 1;
public typealias `CustomLineCap` = Long;
public typealias `CustomLineCapType` = Int;
public const val `CustomLineCapTypeAdjustableArrow`: `CustomLineCapType` = 1;
public const val `CustomLineCapTypeDefault`: `CustomLineCapType` = 0;
public typealias `DashCap` = Int;
public const val `DashCapFlat`: `DashCap` = 0;
public const val `DashCapRound`: `DashCap` = 2;
public const val `DashCapTriangle`: `DashCap` = 3;
public typealias `DashStyle` = Int;
public const val `DashStyleCustom`: `DashStyle` = 5;
public const val `DashStyleDash`: `DashStyle` = 1;
public const val `DashStyleDashDot`: `DashStyle` = 3;
public const val `DashStyleDashDotDot`: `DashStyle` = 4;
public const val `DashStyleDot`: `DashStyle` = 2;
public const val `DashStyleSolid`: `DashStyle` = 0;
public typealias `DebugEventLevel` = Int;
public const val `DebugEventLevelFatal`: `DebugEventLevel` = 0;
public const val `DebugEventLevelWarning`: `DebugEventLevel` = 1;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DebugEventProc` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`DebugEventLevel`, `windows_sys`.`core`.`PCSTR`) -> Unit>>>;
public typealias `DitherType` = Int;
public const val `DitherTypeDualSpiral4x4`: `DitherType` = 7;
public const val `DitherTypeDualSpiral8x8`: `DitherType` = 8;
public const val `DitherTypeErrorDiffusion`: `DitherType` = 9;
public const val `DitherTypeMax`: `DitherType` = 10;
public const val `DitherTypeNone`: `DitherType` = 0;
public const val `DitherTypeOrdered16x16`: `DitherType` = 4;
public const val `DitherTypeOrdered4x4`: `DitherType` = 2;
public const val `DitherTypeOrdered8x8`: `DitherType` = 3;
public const val `DitherTypeSolid`: `DitherType` = 1;
public const val `DitherTypeSpiral4x4`: `DitherType` = 5;
public const val `DitherTypeSpiral8x8`: `DitherType` = 6;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `DrawImageAbort` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> `windows_sys`.`core`.`BOOL`>>>;
public typealias `DriverStringOptions` = Int;
public const val `DriverStringOptionsCmapLookup`: `DriverStringOptions` = 1;
public const val `DriverStringOptionsLimitSubpixel`: `DriverStringOptions` = 8;
public const val `DriverStringOptionsRealizedAdvance`: `DriverStringOptions` = 4;
public const val `DriverStringOptionsVertical`: `DriverStringOptions` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ENHMETAHEADER3` (
    public var `iType`: UInt,
    public var `nSize`: UInt,
    public var `rclBounds`: `super`.`super`.`Foundation`.`RECTL`,
    public var `rclFrame`: `super`.`super`.`Foundation`.`RECTL`,
    public var `dSignature`: UInt,
    public var `nVersion`: UInt,
    public var `nBytes`: UInt,
    public var `nRecords`: UInt,
    public var `nHandles`: UShort,
    public var `sReserved`: UShort,
    public var `nDescription`: UInt,
    public var `offDescription`: UInt,
    public var `nPalEntries`: UInt,
    public var `szlDevice`: `super`.`super`.`Foundation`.`SIZE`,
    public var `szlMillimeters`: `super`.`super`.`Foundation`.`SIZE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `Effect` (
    public var `lpVtbl`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?,
    public var `nativeEffect`: /* Rust *mut */ kotlinx.cinterop.CPointer<`CGpEffect`>?,
    public var `auxDataSize`: Int,
    public var `auxData`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `useAuxData`: `windows_sys`.`core`.`BOOL`,
)
// UNSUPPORTED Rust 1090:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for Effect {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `EmfPlusRecordTotal`: `EmfPlusRecordType` = 16443;
public typealias `EmfPlusRecordType` = Int;
public const val `EmfPlusRecordTypeBeginContainer`: `EmfPlusRecordType` = 16423;
public const val `EmfPlusRecordTypeBeginContainerNoParams`: `EmfPlusRecordType` = 16424;
public const val `EmfPlusRecordTypeClear`: `EmfPlusRecordType` = 16393;
public const val `EmfPlusRecordTypeComment`: `EmfPlusRecordType` = 16387;
public const val `EmfPlusRecordTypeDrawArc`: `EmfPlusRecordType` = 16402;
public const val `EmfPlusRecordTypeDrawBeziers`: `EmfPlusRecordType` = 16409;
public const val `EmfPlusRecordTypeDrawClosedCurve`: `EmfPlusRecordType` = 16407;
public const val `EmfPlusRecordTypeDrawCurve`: `EmfPlusRecordType` = 16408;
public const val `EmfPlusRecordTypeDrawDriverString`: `EmfPlusRecordType` = 16438;
public const val `EmfPlusRecordTypeDrawEllipse`: `EmfPlusRecordType` = 16399;
public const val `EmfPlusRecordTypeDrawImage`: `EmfPlusRecordType` = 16410;
public const val `EmfPlusRecordTypeDrawImagePoints`: `EmfPlusRecordType` = 16411;
public const val `EmfPlusRecordTypeDrawLines`: `EmfPlusRecordType` = 16397;
public const val `EmfPlusRecordTypeDrawPath`: `EmfPlusRecordType` = 16405;
public const val `EmfPlusRecordTypeDrawPie`: `EmfPlusRecordType` = 16401;
public const val `EmfPlusRecordTypeDrawRects`: `EmfPlusRecordType` = 16395;
public const val `EmfPlusRecordTypeDrawString`: `EmfPlusRecordType` = 16412;
public const val `EmfPlusRecordTypeEndContainer`: `EmfPlusRecordType` = 16425;
public const val `EmfPlusRecordTypeEndOfFile`: `EmfPlusRecordType` = 16386;
public const val `EmfPlusRecordTypeFillClosedCurve`: `EmfPlusRecordType` = 16406;
public const val `EmfPlusRecordTypeFillEllipse`: `EmfPlusRecordType` = 16398;
public const val `EmfPlusRecordTypeFillPath`: `EmfPlusRecordType` = 16404;
public const val `EmfPlusRecordTypeFillPie`: `EmfPlusRecordType` = 16400;
public const val `EmfPlusRecordTypeFillPolygon`: `EmfPlusRecordType` = 16396;
public const val `EmfPlusRecordTypeFillRects`: `EmfPlusRecordType` = 16394;
public const val `EmfPlusRecordTypeFillRegion`: `EmfPlusRecordType` = 16403;
public const val `EmfPlusRecordTypeGetDC`: `EmfPlusRecordType` = 16388;
public const val `EmfPlusRecordTypeHeader`: `EmfPlusRecordType` = 16385;
public const val `EmfPlusRecordTypeInvalid`: `EmfPlusRecordType` = 16384;
public const val `EmfPlusRecordTypeMax`: `EmfPlusRecordType` = 16442;
public const val `EmfPlusRecordTypeMin`: `EmfPlusRecordType` = 16385;
public const val `EmfPlusRecordTypeMultiFormatEnd`: `EmfPlusRecordType` = 16391;
public const val `EmfPlusRecordTypeMultiFormatSection`: `EmfPlusRecordType` = 16390;
public const val `EmfPlusRecordTypeMultiFormatStart`: `EmfPlusRecordType` = 16389;
public const val `EmfPlusRecordTypeMultiplyWorldTransform`: `EmfPlusRecordType` = 16428;
public const val `EmfPlusRecordTypeObject`: `EmfPlusRecordType` = 16392;
public const val `EmfPlusRecordTypeOffsetClip`: `EmfPlusRecordType` = 16437;
public const val `EmfPlusRecordTypeResetClip`: `EmfPlusRecordType` = 16433;
public const val `EmfPlusRecordTypeResetWorldTransform`: `EmfPlusRecordType` = 16427;
public const val `EmfPlusRecordTypeRestore`: `EmfPlusRecordType` = 16422;
public const val `EmfPlusRecordTypeRotateWorldTransform`: `EmfPlusRecordType` = 16431;
public const val `EmfPlusRecordTypeSave`: `EmfPlusRecordType` = 16421;
public const val `EmfPlusRecordTypeScaleWorldTransform`: `EmfPlusRecordType` = 16430;
public const val `EmfPlusRecordTypeSerializableObject`: `EmfPlusRecordType` = 16440;
public const val `EmfPlusRecordTypeSetAntiAliasMode`: `EmfPlusRecordType` = 16414;
public const val `EmfPlusRecordTypeSetClipPath`: `EmfPlusRecordType` = 16435;
public const val `EmfPlusRecordTypeSetClipRect`: `EmfPlusRecordType` = 16434;
public const val `EmfPlusRecordTypeSetClipRegion`: `EmfPlusRecordType` = 16436;
public const val `EmfPlusRecordTypeSetCompositingMode`: `EmfPlusRecordType` = 16419;
public const val `EmfPlusRecordTypeSetCompositingQuality`: `EmfPlusRecordType` = 16420;
public const val `EmfPlusRecordTypeSetInterpolationMode`: `EmfPlusRecordType` = 16417;
public const val `EmfPlusRecordTypeSetPageTransform`: `EmfPlusRecordType` = 16432;
public const val `EmfPlusRecordTypeSetPixelOffsetMode`: `EmfPlusRecordType` = 16418;
public const val `EmfPlusRecordTypeSetRenderingOrigin`: `EmfPlusRecordType` = 16413;
public const val `EmfPlusRecordTypeSetTSClip`: `EmfPlusRecordType` = 16442;
public const val `EmfPlusRecordTypeSetTSGraphics`: `EmfPlusRecordType` = 16441;
public const val `EmfPlusRecordTypeSetTextContrast`: `EmfPlusRecordType` = 16416;
public const val `EmfPlusRecordTypeSetTextRenderingHint`: `EmfPlusRecordType` = 16415;
public const val `EmfPlusRecordTypeSetWorldTransform`: `EmfPlusRecordType` = 16426;
public const val `EmfPlusRecordTypeStrokeFillPath`: `EmfPlusRecordType` = 16439;
public const val `EmfPlusRecordTypeTranslateWorldTransform`: `EmfPlusRecordType` = 16429;
public const val `EmfRecordTypeAbortPath`: `EmfPlusRecordType` = 68;
public const val `EmfRecordTypeAlphaBlend`: `EmfPlusRecordType` = 114;
public const val `EmfRecordTypeAngleArc`: `EmfPlusRecordType` = 41;
public const val `EmfRecordTypeArc`: `EmfPlusRecordType` = 45;
public const val `EmfRecordTypeArcTo`: `EmfPlusRecordType` = 55;
public const val `EmfRecordTypeBeginPath`: `EmfPlusRecordType` = 59;
public const val `EmfRecordTypeBitBlt`: `EmfPlusRecordType` = 76;
public const val `EmfRecordTypeChord`: `EmfPlusRecordType` = 46;
public const val `EmfRecordTypeCloseFigure`: `EmfPlusRecordType` = 61;
public const val `EmfRecordTypeColorCorrectPalette`: `EmfPlusRecordType` = 111;
public const val `EmfRecordTypeColorMatchToTargetW`: `EmfPlusRecordType` = 121;
public const val `EmfRecordTypeCreateBrushIndirect`: `EmfPlusRecordType` = 39;
public const val `EmfRecordTypeCreateColorSpace`: `EmfPlusRecordType` = 99;
public const val `EmfRecordTypeCreateColorSpaceW`: `EmfPlusRecordType` = 122;
public const val `EmfRecordTypeCreateDIBPatternBrushPt`: `EmfPlusRecordType` = 94;
public const val `EmfRecordTypeCreateMonoBrush`: `EmfPlusRecordType` = 93;
public const val `EmfRecordTypeCreatePalette`: `EmfPlusRecordType` = 49;
public const val `EmfRecordTypeCreatePen`: `EmfPlusRecordType` = 38;
public const val `EmfRecordTypeDeleteColorSpace`: `EmfPlusRecordType` = 101;
public const val `EmfRecordTypeDeleteObject`: `EmfPlusRecordType` = 40;
public const val `EmfRecordTypeDrawEscape`: `EmfPlusRecordType` = 105;
public const val `EmfRecordTypeEOF`: `EmfPlusRecordType` = 14;
public const val `EmfRecordTypeEllipse`: `EmfPlusRecordType` = 42;
public const val `EmfRecordTypeEndPath`: `EmfPlusRecordType` = 60;
public const val `EmfRecordTypeExcludeClipRect`: `EmfPlusRecordType` = 29;
public const val `EmfRecordTypeExtCreateFontIndirect`: `EmfPlusRecordType` = 82;
public const val `EmfRecordTypeExtCreatePen`: `EmfPlusRecordType` = 95;
public const val `EmfRecordTypeExtEscape`: `EmfPlusRecordType` = 106;
public const val `EmfRecordTypeExtFloodFill`: `EmfPlusRecordType` = 53;
public const val `EmfRecordTypeExtSelectClipRgn`: `EmfPlusRecordType` = 75;
public const val `EmfRecordTypeExtTextOutA`: `EmfPlusRecordType` = 83;
public const val `EmfRecordTypeExtTextOutW`: `EmfPlusRecordType` = 84;
public const val `EmfRecordTypeFillPath`: `EmfPlusRecordType` = 62;
public const val `EmfRecordTypeFillRgn`: `EmfPlusRecordType` = 71;
public const val `EmfRecordTypeFlattenPath`: `EmfPlusRecordType` = 65;
public const val `EmfRecordTypeForceUFIMapping`: `EmfPlusRecordType` = 109;
public const val `EmfRecordTypeFrameRgn`: `EmfPlusRecordType` = 72;
public const val `EmfRecordTypeGLSBoundedRecord`: `EmfPlusRecordType` = 103;
public const val `EmfRecordTypeGLSRecord`: `EmfPlusRecordType` = 102;
public const val `EmfRecordTypeGdiComment`: `EmfPlusRecordType` = 70;
public const val `EmfRecordTypeGradientFill`: `EmfPlusRecordType` = 118;
public const val `EmfRecordTypeHeader`: `EmfPlusRecordType` = 1;
public const val `EmfRecordTypeIntersectClipRect`: `EmfPlusRecordType` = 30;
public const val `EmfRecordTypeInvertRgn`: `EmfPlusRecordType` = 73;
public const val `EmfRecordTypeLineTo`: `EmfPlusRecordType` = 54;
public const val `EmfRecordTypeMaskBlt`: `EmfPlusRecordType` = 78;
public const val `EmfRecordTypeMax`: `EmfPlusRecordType` = 122;
public const val `EmfRecordTypeMin`: `EmfPlusRecordType` = 1;
public const val `EmfRecordTypeModifyWorldTransform`: `EmfPlusRecordType` = 36;
public const val `EmfRecordTypeMoveToEx`: `EmfPlusRecordType` = 27;
public const val `EmfRecordTypeNamedEscape`: `EmfPlusRecordType` = 110;
public const val `EmfRecordTypeOffsetClipRgn`: `EmfPlusRecordType` = 26;
public const val `EmfRecordTypePaintRgn`: `EmfPlusRecordType` = 74;
public const val `EmfRecordTypePie`: `EmfPlusRecordType` = 47;
public const val `EmfRecordTypePixelFormat`: `EmfPlusRecordType` = 104;
public const val `EmfRecordTypePlgBlt`: `EmfPlusRecordType` = 79;
public const val `EmfRecordTypePolyBezier`: `EmfPlusRecordType` = 2;
public const val `EmfRecordTypePolyBezier16`: `EmfPlusRecordType` = 85;
public const val `EmfRecordTypePolyBezierTo`: `EmfPlusRecordType` = 5;
public const val `EmfRecordTypePolyBezierTo16`: `EmfPlusRecordType` = 88;
public const val `EmfRecordTypePolyDraw`: `EmfPlusRecordType` = 56;
public const val `EmfRecordTypePolyDraw16`: `EmfPlusRecordType` = 92;
public const val `EmfRecordTypePolyLineTo`: `EmfPlusRecordType` = 6;
public const val `EmfRecordTypePolyPolygon`: `EmfPlusRecordType` = 8;
public const val `EmfRecordTypePolyPolygon16`: `EmfPlusRecordType` = 91;
public const val `EmfRecordTypePolyPolyline`: `EmfPlusRecordType` = 7;
public const val `EmfRecordTypePolyPolyline16`: `EmfPlusRecordType` = 90;
public const val `EmfRecordTypePolyTextOutA`: `EmfPlusRecordType` = 96;
public const val `EmfRecordTypePolyTextOutW`: `EmfPlusRecordType` = 97;
public const val `EmfRecordTypePolygon`: `EmfPlusRecordType` = 3;
public const val `EmfRecordTypePolygon16`: `EmfPlusRecordType` = 86;
public const val `EmfRecordTypePolyline`: `EmfPlusRecordType` = 4;
public const val `EmfRecordTypePolyline16`: `EmfPlusRecordType` = 87;
public const val `EmfRecordTypePolylineTo16`: `EmfPlusRecordType` = 89;
public const val `EmfRecordTypeRealizePalette`: `EmfPlusRecordType` = 52;
public const val `EmfRecordTypeRectangle`: `EmfPlusRecordType` = 43;
public const val `EmfRecordTypeReserved_069`: `EmfPlusRecordType` = 69;
public const val `EmfRecordTypeReserved_117`: `EmfPlusRecordType` = 117;
public const val `EmfRecordTypeResizePalette`: `EmfPlusRecordType` = 51;
public const val `EmfRecordTypeRestoreDC`: `EmfPlusRecordType` = 34;
public const val `EmfRecordTypeRoundRect`: `EmfPlusRecordType` = 44;
public const val `EmfRecordTypeSaveDC`: `EmfPlusRecordType` = 33;
public const val `EmfRecordTypeScaleViewportExtEx`: `EmfPlusRecordType` = 31;
public const val `EmfRecordTypeScaleWindowExtEx`: `EmfPlusRecordType` = 32;
public const val `EmfRecordTypeSelectClipPath`: `EmfPlusRecordType` = 67;
public const val `EmfRecordTypeSelectObject`: `EmfPlusRecordType` = 37;
public const val `EmfRecordTypeSelectPalette`: `EmfPlusRecordType` = 48;
public const val `EmfRecordTypeSetArcDirection`: `EmfPlusRecordType` = 57;
public const val `EmfRecordTypeSetBkColor`: `EmfPlusRecordType` = 25;
public const val `EmfRecordTypeSetBkMode`: `EmfPlusRecordType` = 18;
public const val `EmfRecordTypeSetBrushOrgEx`: `EmfPlusRecordType` = 13;
public const val `EmfRecordTypeSetColorAdjustment`: `EmfPlusRecordType` = 23;
public const val `EmfRecordTypeSetColorSpace`: `EmfPlusRecordType` = 100;
public const val `EmfRecordTypeSetDIBitsToDevice`: `EmfPlusRecordType` = 80;
public const val `EmfRecordTypeSetICMMode`: `EmfPlusRecordType` = 98;
public const val `EmfRecordTypeSetICMProfileA`: `EmfPlusRecordType` = 112;
public const val `EmfRecordTypeSetICMProfileW`: `EmfPlusRecordType` = 113;
public const val `EmfRecordTypeSetLayout`: `EmfPlusRecordType` = 115;
public const val `EmfRecordTypeSetLinkedUFIs`: `EmfPlusRecordType` = 119;
public const val `EmfRecordTypeSetMapMode`: `EmfPlusRecordType` = 17;
public const val `EmfRecordTypeSetMapperFlags`: `EmfPlusRecordType` = 16;
public const val `EmfRecordTypeSetMetaRgn`: `EmfPlusRecordType` = 28;
public const val `EmfRecordTypeSetMiterLimit`: `EmfPlusRecordType` = 58;
public const val `EmfRecordTypeSetPaletteEntries`: `EmfPlusRecordType` = 50;
public const val `EmfRecordTypeSetPixelV`: `EmfPlusRecordType` = 15;
public const val `EmfRecordTypeSetPolyFillMode`: `EmfPlusRecordType` = 19;
public const val `EmfRecordTypeSetROP2`: `EmfPlusRecordType` = 20;
public const val `EmfRecordTypeSetStretchBltMode`: `EmfPlusRecordType` = 21;
public const val `EmfRecordTypeSetTextAlign`: `EmfPlusRecordType` = 22;
public const val `EmfRecordTypeSetTextColor`: `EmfPlusRecordType` = 24;
public const val `EmfRecordTypeSetTextJustification`: `EmfPlusRecordType` = 120;
public const val `EmfRecordTypeSetViewportExtEx`: `EmfPlusRecordType` = 11;
public const val `EmfRecordTypeSetViewportOrgEx`: `EmfPlusRecordType` = 12;
public const val `EmfRecordTypeSetWindowExtEx`: `EmfPlusRecordType` = 9;
public const val `EmfRecordTypeSetWindowOrgEx`: `EmfPlusRecordType` = 10;
public const val `EmfRecordTypeSetWorldTransform`: `EmfPlusRecordType` = 35;
public const val `EmfRecordTypeSmallTextOut`: `EmfPlusRecordType` = 108;
public const val `EmfRecordTypeStartDoc`: `EmfPlusRecordType` = 107;
public const val `EmfRecordTypeStretchBlt`: `EmfPlusRecordType` = 77;
public const val `EmfRecordTypeStretchDIBits`: `EmfPlusRecordType` = 81;
public const val `EmfRecordTypeStrokeAndFillPath`: `EmfPlusRecordType` = 63;
public const val `EmfRecordTypeStrokePath`: `EmfPlusRecordType` = 64;
public const val `EmfRecordTypeTransparentBlt`: `EmfPlusRecordType` = 116;
public const val `EmfRecordTypeWidenPath`: `EmfPlusRecordType` = 66;
public typealias `EmfToWmfBitsFlags` = Int;
public const val `EmfToWmfBitsFlagsDefault`: `EmfToWmfBitsFlags` = 0;
public const val `EmfToWmfBitsFlagsEmbedEmf`: `EmfToWmfBitsFlags` = 1;
public const val `EmfToWmfBitsFlagsIncludePlaceable`: `EmfToWmfBitsFlags` = 2;
public const val `EmfToWmfBitsFlagsNoXORClip`: `EmfToWmfBitsFlags` = 4;
public typealias `EmfType` = Int;
public const val `EmfTypeEmfOnly`: `EmfType` = 3;
public const val `EmfTypeEmfPlusDual`: `EmfType` = 5;
public const val `EmfTypeEmfPlusOnly`: `EmfType` = 4;
// UNSUPPORTED Rust 1291:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const EncoderChrominanceTable: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xf2e455dc_09b3_4316_8260_676ada32481c);

// UNSUPPORTED Rust 1292:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const EncoderColorDepth: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x66087055_ad66_4c7c_9a18_38a2310b8337);

// UNSUPPORTED Rust 1293:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const EncoderColorSpace: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xae7a62a0_ee2c_49d8_9d07_1ba8a927596e);

// UNSUPPORTED Rust 1294:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const EncoderCompression: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe09d739d_ccd4_44ee_8eba_3fbf8be4fc58);

// UNSUPPORTED Rust 1295:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const EncoderImageItems: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x63875e13_1f1d_45ab_9195_a29b6066a650);

// UNSUPPORTED Rust 1296:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const EncoderLuminanceTable: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xedb33bce_0266_4a77_b904_27216099e717);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EncoderParameter` (
    public var `Guid`: `windows_sys`.`core`.`GUID`,
    public var `NumberOfValues`: UInt,
    public var `Type`: UInt,
    public var `Value`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1305:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EncoderParameter {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `EncoderParameterValueType` = Int;
public const val `EncoderParameterValueTypeASCII`: `EncoderParameterValueType` = 2;
public const val `EncoderParameterValueTypeByte`: `EncoderParameterValueType` = 1;
public const val `EncoderParameterValueTypeLong`: `EncoderParameterValueType` = 4;
public const val `EncoderParameterValueTypeLongRange`: `EncoderParameterValueType` = 6;
public const val `EncoderParameterValueTypePointer`: `EncoderParameterValueType` = 9;
public const val `EncoderParameterValueTypeRational`: `EncoderParameterValueType` = 5;
public const val `EncoderParameterValueTypeRationalRange`: `EncoderParameterValueType` = 8;
public const val `EncoderParameterValueTypeShort`: `EncoderParameterValueType` = 3;
public const val `EncoderParameterValueTypeUndefined`: `EncoderParameterValueType` = 7;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `EncoderParameters` (
    public var `Count`: UInt,
    public var `Parameter`: Array<`EncoderParameter`>,
)
// UNSUPPORTED Rust 1326:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for EncoderParameters {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1331:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const EncoderQuality: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1d5be4b5_fa4a_452d_9cdd_5db35105e7eb);

// UNSUPPORTED Rust 1332:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const EncoderRenderMethod: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6d42c53a_229a_4825_8bb7_5c99e2b9a8b8);

// UNSUPPORTED Rust 1333:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const EncoderSaveAsCMYK: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xa219bbc9_0a9d_4005_a3ee_3a421b8bb06c);

// UNSUPPORTED Rust 1334:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const EncoderSaveFlag: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x292266fc_ac40_47bf_8cfc_a85b89a655de);

// UNSUPPORTED Rust 1335:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const EncoderScanMethod: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x3a4e2661_3109_4e56_8536_42c156e7dcfa);

// UNSUPPORTED Rust 1336:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const EncoderTransformation: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8d0eb2d1_a58e_4ea8_aa14_108074b7b6f9);

public typealias `EncoderValue` = Int;
public const val `EncoderValueColorTypeCMYK`: `EncoderValue` = 0;
public const val `EncoderValueColorTypeGray`: `EncoderValue` = 24;
public const val `EncoderValueColorTypeRGB`: `EncoderValue` = 25;
public const val `EncoderValueColorTypeYCCK`: `EncoderValue` = 1;
public const val `EncoderValueCompressionCCITT3`: `EncoderValue` = 3;
public const val `EncoderValueCompressionCCITT4`: `EncoderValue` = 4;
public const val `EncoderValueCompressionLZW`: `EncoderValue` = 2;
public const val `EncoderValueCompressionNone`: `EncoderValue` = 6;
public const val `EncoderValueCompressionRle`: `EncoderValue` = 5;
public const val `EncoderValueFlush`: `EncoderValue` = 20;
public const val `EncoderValueFrameDimensionPage`: `EncoderValue` = 23;
public const val `EncoderValueFrameDimensionResolution`: `EncoderValue` = 22;
public const val `EncoderValueFrameDimensionTime`: `EncoderValue` = 21;
public const val `EncoderValueLastFrame`: `EncoderValue` = 19;
public const val `EncoderValueMultiFrame`: `EncoderValue` = 18;
public const val `EncoderValueRenderNonProgressive`: `EncoderValue` = 12;
public const val `EncoderValueRenderProgressive`: `EncoderValue` = 11;
public const val `EncoderValueScanMethodInterlaced`: `EncoderValue` = 7;
public const val `EncoderValueScanMethodNonInterlaced`: `EncoderValue` = 8;
public const val `EncoderValueTransformFlipHorizontal`: `EncoderValue` = 16;
public const val `EncoderValueTransformFlipVertical`: `EncoderValue` = 17;
public const val `EncoderValueTransformRotate180`: `EncoderValue` = 14;
public const val `EncoderValueTransformRotate270`: `EncoderValue` = 15;
public const val `EncoderValueTransformRotate90`: `EncoderValue` = 13;
public const val `EncoderValueVersionGif87`: `EncoderValue` = 9;
public const val `EncoderValueVersionGif89`: `EncoderValue` = 10;
// UNSUPPORTED Rust 1364:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const EncoderVersion: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x24d18c76_814a_41a4_bf53_1c219cccf797);

// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `EnumerateMetafileProc` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(`EmfPlusRecordType`, UInt, UInt, /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?, /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
public const val `FileNotFound`: `Status` = 10;
public typealias `FillMode` = Int;
public const val `FillModeAlternate`: `FillMode` = 0;
public const val `FillModeWinding`: `FillMode` = 1;
// UNSUPPORTED Rust 1370:1: unresolved scalar type f32; syntax: no per-file syntax rule for Const
// pub const FlatnessDefault: f32 = 0.25f32;

public typealias `FlushIntention` = Int;
public const val `FlushIntentionFlush`: `FlushIntention` = 0;
public const val `FlushIntentionSync`: `FlushIntention` = 1;
public typealias `Font` = Long;
public typealias `FontCollection` = Long;
public typealias `FontFamily` = Long;
public const val `FontFamilyNotFound`: `Status` = 14;
public typealias `FontStyle` = Int;
public const val `FontStyleBold`: `FontStyle` = 1;
public const val `FontStyleBoldItalic`: `FontStyle` = 3;
public const val `FontStyleItalic`: `FontStyle` = 2;
public const val `FontStyleNotFound`: `Status` = 15;
public const val `FontStyleRegular`: `FontStyle` = 0;
public const val `FontStyleStrikeout`: `FontStyle` = 8;
public const val `FontStyleUnderline`: `FontStyle` = 4;
// UNSUPPORTED Rust 1386:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FormatIDImageInformation: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xe5836cbe_5eef_4f1d_acde_ae4c43b608ce);

// UNSUPPORTED Rust 1387:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FormatIDJpegAppHeaders: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1c4afdcd_6177_43cf_abc7_5f51af39ee85);

// UNSUPPORTED Rust 1388:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FrameDimensionPage: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x7462dc86_6180_4c7e_8e3f_ee7333a7a483);

// UNSUPPORTED Rust 1389:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FrameDimensionResolution: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x84236f7b_3bd3_428f_8dab_4ea1439ca315);

// UNSUPPORTED Rust 1390:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const FrameDimensionTime: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x6aedbd6d_3fb5_418a_83a6_7f45229dc872);

public const val `GDIP_EMFPLUSFLAGS_DISPLAY`: UInt = 1u;
public const val `GDIP_EMFPLUS_RECORD_BASE`: UInt = 16384u;
public const val `GDIP_WMF_RECORD_BASE`: UInt = 65536u;
public const val `GREEN_SHIFT`: UInt = 8u;
public const val `GdiplusNotInitialized`: `Status` = 18;
public const val `GdiplusStartupDefault`: `GdiplusStartupParams` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GdiplusStartupInput` (
    public var `GdiplusVersion`: UInt,
    public var `DebugEventCallback`: Long,
    public var `SuppressBackgroundThread`: `windows_sys`.`core`.`BOOL`,
    public var `SuppressExternalCodecs`: `windows_sys`.`core`.`BOOL`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GdiplusStartupInputEx` (
    public var `Base`: `GdiplusStartupInput`,
    public var `StartupParameters`: Int,
)
public const val `GdiplusStartupNoSetRound`: `GdiplusStartupParams` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `GdiplusStartupOutput` (
    public var `NotificationHook`: Long,
    public var `NotificationUnhook`: Long,
)
public typealias `GdiplusStartupParams` = Int;
public const val `GdiplusStartupSetPSValue`: `GdiplusStartupParams` = 2;
public const val `GdiplusStartupTransparencyMask`: `GdiplusStartupParams` = -16777216;
public const val `GenericError`: `Status` = 1;
public typealias `GenericFontFamily` = Int;
public const val `GenericFontFamilyMonospace`: `GenericFontFamily` = 2;
public const val `GenericFontFamilySansSerif`: `GenericFontFamily` = 1;
public const val `GenericFontFamilySerif`: `GenericFontFamily` = 0;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `GetThumbnailImageAbort` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<() -> `windows_sys`.`core`.`BOOL`>>>;
// UNSUPPORTED Rust 1427:1: declaration Struct has no candidate rule; syntax: only named record shapes currently supported
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GpAdjustableArrowCap(pub u8);

// UNSUPPORTED Rust 1430:1: declaration Struct has no candidate rule; syntax: only named record shapes currently supported
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GpBitmap(pub u8);

// UNSUPPORTED Rust 1433:1: declaration Struct has no candidate rule; syntax: only named record shapes currently supported
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GpBrush(pub u8);

// UNSUPPORTED Rust 1436:1: declaration Struct has no candidate rule; syntax: only named record shapes currently supported
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GpCachedBitmap(pub u8);

// UNSUPPORTED Rust 1439:1: declaration Struct has no candidate rule; syntax: only named record shapes currently supported
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GpCustomLineCap(pub u8);

// UNSUPPORTED Rust 1442:1: declaration Struct has no candidate rule; syntax: only named record shapes currently supported
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GpFont(pub u8);

// UNSUPPORTED Rust 1445:1: declaration Struct has no candidate rule; syntax: only named record shapes currently supported
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GpFontCollection(pub u8);

// UNSUPPORTED Rust 1448:1: declaration Struct has no candidate rule; syntax: only named record shapes currently supported
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GpFontFamily(pub u8);

// UNSUPPORTED Rust 1451:1: declaration Struct has no candidate rule; syntax: only named record shapes currently supported
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GpGraphics(pub u8);

// UNSUPPORTED Rust 1454:1: declaration Struct has no candidate rule; syntax: only named record shapes currently supported
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GpHatch(pub u8);

// UNSUPPORTED Rust 1457:1: declaration Struct has no candidate rule; syntax: only named record shapes currently supported
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GpImage(pub u8);

// UNSUPPORTED Rust 1460:1: declaration Struct has no candidate rule; syntax: only named record shapes currently supported
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GpImageAttributes(pub u8);

// UNSUPPORTED Rust 1463:1: declaration Struct has no candidate rule; syntax: only named record shapes currently supported
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GpInstalledFontCollection(pub u8);

// UNSUPPORTED Rust 1466:1: declaration Struct has no candidate rule; syntax: only named record shapes currently supported
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GpLineGradient(pub u8);

// UNSUPPORTED Rust 1469:1: declaration Struct has no candidate rule; syntax: only named record shapes currently supported
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GpMetafile(pub u8);

// UNSUPPORTED Rust 1472:1: declaration Struct has no candidate rule; syntax: only named record shapes currently supported
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GpPath(pub u8);

// UNSUPPORTED Rust 1475:1: declaration Struct has no candidate rule; syntax: only named record shapes currently supported
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GpPathGradient(pub u8);

// UNSUPPORTED Rust 1478:1: declaration Struct has no candidate rule; syntax: only named record shapes currently supported
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GpPathIterator(pub u8);

// UNSUPPORTED Rust 1481:1: declaration Struct has no candidate rule; syntax: only named record shapes currently supported
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GpPen(pub u8);

// UNSUPPORTED Rust 1484:1: declaration Struct has no candidate rule; syntax: only named record shapes currently supported
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GpPrivateFontCollection(pub u8);

// UNSUPPORTED Rust 1487:1: declaration Struct has no candidate rule; syntax: only named record shapes currently supported
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GpRegion(pub u8);

// UNSUPPORTED Rust 1490:1: declaration Struct has no candidate rule; syntax: only named record shapes currently supported
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GpSolidFill(pub u8);

// UNSUPPORTED Rust 1493:1: declaration Struct has no candidate rule; syntax: only named record shapes currently supported
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GpStringFormat(pub u8);

public typealias `GpTestControlEnum` = Int;
// UNSUPPORTED Rust 1497:1: declaration Struct has no candidate rule; syntax: only named record shapes currently supported
// #[repr(C)]
// #[derive(Clone, Copy, Default)]
// pub struct GpTexture(pub u8);

public typealias `HatchStyle` = Int;
public const val `HatchStyle05Percent`: `HatchStyle` = 6;
public const val `HatchStyle10Percent`: `HatchStyle` = 7;
public const val `HatchStyle20Percent`: `HatchStyle` = 8;
public const val `HatchStyle25Percent`: `HatchStyle` = 9;
public const val `HatchStyle30Percent`: `HatchStyle` = 10;
public const val `HatchStyle40Percent`: `HatchStyle` = 11;
public const val `HatchStyle50Percent`: `HatchStyle` = 12;
public const val `HatchStyle60Percent`: `HatchStyle` = 13;
public const val `HatchStyle70Percent`: `HatchStyle` = 14;
public const val `HatchStyle75Percent`: `HatchStyle` = 15;
public const val `HatchStyle80Percent`: `HatchStyle` = 16;
public const val `HatchStyle90Percent`: `HatchStyle` = 17;
public const val `HatchStyleBackwardDiagonal`: `HatchStyle` = 3;
public const val `HatchStyleCross`: `HatchStyle` = 4;
public const val `HatchStyleDarkDownwardDiagonal`: `HatchStyle` = 20;
public const val `HatchStyleDarkHorizontal`: `HatchStyle` = 29;
public const val `HatchStyleDarkUpwardDiagonal`: `HatchStyle` = 21;
public const val `HatchStyleDarkVertical`: `HatchStyle` = 28;
public const val `HatchStyleDashedDownwardDiagonal`: `HatchStyle` = 30;
public const val `HatchStyleDashedHorizontal`: `HatchStyle` = 32;
public const val `HatchStyleDashedUpwardDiagonal`: `HatchStyle` = 31;
public const val `HatchStyleDashedVertical`: `HatchStyle` = 33;
public const val `HatchStyleDiagonalBrick`: `HatchStyle` = 38;
public const val `HatchStyleDiagonalCross`: `HatchStyle` = 5;
public const val `HatchStyleDivot`: `HatchStyle` = 42;
public const val `HatchStyleDottedDiamond`: `HatchStyle` = 44;
public const val `HatchStyleDottedGrid`: `HatchStyle` = 43;
public const val `HatchStyleForwardDiagonal`: `HatchStyle` = 2;
public const val `HatchStyleHorizontal`: `HatchStyle` = 0;
public const val `HatchStyleHorizontalBrick`: `HatchStyle` = 39;
public const val `HatchStyleLargeCheckerBoard`: `HatchStyle` = 50;
public const val `HatchStyleLargeConfetti`: `HatchStyle` = 35;
public const val `HatchStyleLargeGrid`: `HatchStyle` = 4;
public const val `HatchStyleLightDownwardDiagonal`: `HatchStyle` = 18;
public const val `HatchStyleLightHorizontal`: `HatchStyle` = 25;
public const val `HatchStyleLightUpwardDiagonal`: `HatchStyle` = 19;
public const val `HatchStyleLightVertical`: `HatchStyle` = 24;
public const val `HatchStyleMax`: `HatchStyle` = 52;
public const val `HatchStyleMin`: `HatchStyle` = 0;
public const val `HatchStyleNarrowHorizontal`: `HatchStyle` = 27;
public const val `HatchStyleNarrowVertical`: `HatchStyle` = 26;
public const val `HatchStyleOutlinedDiamond`: `HatchStyle` = 51;
public const val `HatchStylePlaid`: `HatchStyle` = 41;
public const val `HatchStyleShingle`: `HatchStyle` = 45;
public const val `HatchStyleSmallCheckerBoard`: `HatchStyle` = 49;
public const val `HatchStyleSmallConfetti`: `HatchStyle` = 34;
public const val `HatchStyleSmallGrid`: `HatchStyle` = 48;
public const val `HatchStyleSolidDiamond`: `HatchStyle` = 52;
public const val `HatchStyleSphere`: `HatchStyle` = 47;
public const val `HatchStyleTotal`: `HatchStyle` = 53;
public const val `HatchStyleTrellis`: `HatchStyle` = 46;
public const val `HatchStyleVertical`: `HatchStyle` = 1;
public const val `HatchStyleWave`: `HatchStyle` = 37;
public const val `HatchStyleWeave`: `HatchStyle` = 40;
public const val `HatchStyleWideDownwardDiagonal`: `HatchStyle` = 22;
public const val `HatchStyleWideUpwardDiagonal`: `HatchStyle` = 23;
public const val `HatchStyleZigZag`: `HatchStyle` = 36;
public typealias `HistogramFormat` = Int;
public const val `HistogramFormatA`: `HistogramFormat` = 7;
public const val `HistogramFormatARGB`: `HistogramFormat` = 0;
public const val `HistogramFormatB`: `HistogramFormat` = 4;
public const val `HistogramFormatG`: `HistogramFormat` = 5;
public const val `HistogramFormatGray`: `HistogramFormat` = 3;
public const val `HistogramFormatPARGB`: `HistogramFormat` = 1;
public const val `HistogramFormatR`: `HistogramFormat` = 6;
public const val `HistogramFormatRGB`: `HistogramFormat` = 2;
public typealias `HotkeyPrefix` = Int;
public const val `HotkeyPrefixHide`: `HotkeyPrefix` = 2;
public const val `HotkeyPrefixNone`: `HotkeyPrefix` = 0;
public const val `HotkeyPrefixShow`: `HotkeyPrefix` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HueSaturationLightness` (
    public var `Base`: `Effect`,
)
// UNSUPPORTED Rust 1576:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const HueSaturationLightnessEffectGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x8b2dd6c3_eb07_4d87_a5f0_7108e26a9c5f);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HueSaturationLightnessParams` (
    public var `hueLevel`: Int,
    public var `saturationLevel`: Int,
    public var `lightnessLevel`: Int,
)
public typealias `Image` = Long;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `ImageAbort` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) -> `windows_sys`.`core`.`BOOL`>>>;
public typealias `ImageCodecFlags` = Int;
public const val `ImageCodecFlagsBlockingDecode`: `ImageCodecFlags` = 32;
public const val `ImageCodecFlagsBuiltin`: `ImageCodecFlags` = 65536;
public const val `ImageCodecFlagsDecoder`: `ImageCodecFlags` = 2;
public const val `ImageCodecFlagsEncoder`: `ImageCodecFlags` = 1;
public const val `ImageCodecFlagsSeekableEncode`: `ImageCodecFlags` = 16;
public const val `ImageCodecFlagsSupportBitmap`: `ImageCodecFlags` = 4;
public const val `ImageCodecFlagsSupportVector`: `ImageCodecFlags` = 8;
public const val `ImageCodecFlagsSystem`: `ImageCodecFlags` = 131072;
public const val `ImageCodecFlagsUser`: `ImageCodecFlags` = 262144;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ImageCodecInfo` (
    public var `Clsid`: `windows_sys`.`core`.`GUID`,
    public var `FormatID`: `windows_sys`.`core`.`GUID`,
    public var `CodecName`: `windows_sys`.`core`.`PCWSTR`,
    public var `DllName`: `windows_sys`.`core`.`PCWSTR`,
    public var `FormatDescription`: `windows_sys`.`core`.`PCWSTR`,
    public var `FilenameExtension`: `windows_sys`.`core`.`PCWSTR`,
    public var `MimeType`: `windows_sys`.`core`.`PCWSTR`,
    public var `Flags`: UInt,
    public var `Version`: UInt,
    public var `SigCount`: UInt,
    public var `SigSize`: UInt,
    public var `SigPattern`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `SigMask`: /* Rust *const */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
)
// UNSUPPORTED Rust 1613:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ImageCodecInfo {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ImageFlags` = Int;
public const val `ImageFlagsCaching`: `ImageFlags` = 131072;
public const val `ImageFlagsColorSpaceCMYK`: `ImageFlags` = 32;
public const val `ImageFlagsColorSpaceGRAY`: `ImageFlags` = 64;
public const val `ImageFlagsColorSpaceRGB`: `ImageFlags` = 16;
public const val `ImageFlagsColorSpaceYCBCR`: `ImageFlags` = 128;
public const val `ImageFlagsColorSpaceYCCK`: `ImageFlags` = 256;
public const val `ImageFlagsHasAlpha`: `ImageFlags` = 2;
public const val `ImageFlagsHasRealDPI`: `ImageFlags` = 4096;
public const val `ImageFlagsHasRealPixelSize`: `ImageFlags` = 8192;
public const val `ImageFlagsHasTranslucent`: `ImageFlags` = 4;
public const val `ImageFlagsNone`: `ImageFlags` = 0;
public const val `ImageFlagsPartiallyScalable`: `ImageFlags` = 8;
public const val `ImageFlagsReadOnly`: `ImageFlags` = 65536;
public const val `ImageFlagsScalable`: `ImageFlags` = 1;
// UNSUPPORTED Rust 1633:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ImageFormatBMP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb96b3cab_0728_11d3_9d7b_0000f81ef32e);

// UNSUPPORTED Rust 1634:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ImageFormatEMF: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb96b3cac_0728_11d3_9d7b_0000f81ef32e);

// UNSUPPORTED Rust 1635:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ImageFormatEXIF: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb96b3cb2_0728_11d3_9d7b_0000f81ef32e);

// UNSUPPORTED Rust 1636:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ImageFormatGIF: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb96b3cb0_0728_11d3_9d7b_0000f81ef32e);

// UNSUPPORTED Rust 1637:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ImageFormatHEIF: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb96b3cb6_0728_11d3_9d7b_0000f81ef32e);

// UNSUPPORTED Rust 1638:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ImageFormatIcon: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb96b3cb5_0728_11d3_9d7b_0000f81ef32e);

// UNSUPPORTED Rust 1639:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ImageFormatJPEG: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb96b3cae_0728_11d3_9d7b_0000f81ef32e);

// UNSUPPORTED Rust 1640:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ImageFormatMemoryBMP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb96b3caa_0728_11d3_9d7b_0000f81ef32e);

// UNSUPPORTED Rust 1641:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ImageFormatPNG: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb96b3caf_0728_11d3_9d7b_0000f81ef32e);

// UNSUPPORTED Rust 1642:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ImageFormatTIFF: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb96b3cb1_0728_11d3_9d7b_0000f81ef32e);

// UNSUPPORTED Rust 1643:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ImageFormatUndefined: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb96b3ca9_0728_11d3_9d7b_0000f81ef32e);

// UNSUPPORTED Rust 1644:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ImageFormatWEBP: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb96b3cb7_0728_11d3_9d7b_0000f81ef32e);

// UNSUPPORTED Rust 1645:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const ImageFormatWMF: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0xb96b3cad_0728_11d3_9d7b_0000f81ef32e);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ImageItemData` (
    public var `Size`: UInt,
    public var `Position`: UInt,
    public var `Desc`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `DescSize`: UInt,
    public var `Data`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
    public var `DataSize`: UInt,
    public var `Cookie`: UInt,
)
// UNSUPPORTED Rust 1657:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for ImageItemData {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `ImageLockMode` = Int;
public const val `ImageLockModeRead`: `ImageLockMode` = 1;
public const val `ImageLockModeUserInputBuf`: `ImageLockMode` = 4;
public const val `ImageLockModeWrite`: `ImageLockMode` = 2;
public typealias `ImageType` = Int;
public const val `ImageTypeBitmap`: `ImageType` = 1;
public const val `ImageTypeMetafile`: `ImageType` = 2;
public const val `ImageTypeUnknown`: `ImageType` = 0;
public typealias `InstalledFontCollection` = Long;
public const val `InsufficientBuffer`: `Status` = 5;
public typealias `InterpolationMode` = Int;
public const val `InterpolationModeBicubic`: `InterpolationMode` = 4;
public const val `InterpolationModeBilinear`: `InterpolationMode` = 3;
public const val `InterpolationModeDefault`: `InterpolationMode` = 0;
public const val `InterpolationModeHighQuality`: `InterpolationMode` = 2;
public const val `InterpolationModeHighQualityBicubic`: `InterpolationMode` = 7;
public const val `InterpolationModeHighQualityBilinear`: `InterpolationMode` = 6;
public const val `InterpolationModeInvalid`: `InterpolationMode` = -1;
public const val `InterpolationModeLowQuality`: `InterpolationMode` = 1;
public const val `InterpolationModeNearestNeighbor`: `InterpolationMode` = 5;
public const val `InvalidParameter`: `Status` = 2;
public typealias `ItemDataPosition` = Int;
public const val `ItemDataPositionAfterBits`: `ItemDataPosition` = 2;
public const val `ItemDataPositionAfterHeader`: `ItemDataPosition` = 0;
public const val `ItemDataPositionAfterPalette`: `ItemDataPosition` = 1;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `Levels` (
    public var `Base`: `Effect`,
)
// UNSUPPORTED Rust 1692:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const LevelsEffectGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x99c354ec_2a31_4f3a_8c34_17a803b33a25);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `LevelsParams` (
    public var `highlight`: Int,
    public var `midtone`: Int,
    public var `shadow`: Int,
)
public typealias `LineCap` = Int;
public const val `LineCapAnchorMask`: `LineCap` = 240;
public const val `LineCapArrowAnchor`: `LineCap` = 20;
public const val `LineCapCustom`: `LineCap` = 255;
public const val `LineCapDiamondAnchor`: `LineCap` = 19;
public const val `LineCapFlat`: `LineCap` = 0;
public const val `LineCapNoAnchor`: `LineCap` = 16;
public const val `LineCapRound`: `LineCap` = 2;
public const val `LineCapRoundAnchor`: `LineCap` = 18;
public const val `LineCapSquare`: `LineCap` = 1;
public const val `LineCapSquareAnchor`: `LineCap` = 17;
public const val `LineCapTriangle`: `LineCap` = 3;
public typealias `LineJoin` = Int;
public const val `LineJoinBevel`: `LineJoin` = 1;
public const val `LineJoinMiter`: `LineJoin` = 0;
public const val `LineJoinMiterClipped`: `LineJoin` = 3;
public const val `LineJoinRound`: `LineJoin` = 2;
public typealias `LinearGradientMode` = Int;
public const val `LinearGradientModeBackwardDiagonal`: `LinearGradientMode` = 3;
public const val `LinearGradientModeForwardDiagonal`: `LinearGradientMode` = 2;
public const val `LinearGradientModeHorizontal`: `LinearGradientMode` = 0;
public const val `LinearGradientModeVertical`: `LinearGradientMode` = 1;
public typealias `Matrix` = Long;
public typealias `MatrixOrder` = Int;
public const val `MatrixOrderAppend`: `MatrixOrder` = 1;
public const val `MatrixOrderPrepend`: `MatrixOrder` = 0;
public typealias `Metafile` = Long;
public typealias `MetafileFrameUnit` = Int;
public const val `MetafileFrameUnitDocument`: `MetafileFrameUnit` = 5;
public const val `MetafileFrameUnitGdi`: `MetafileFrameUnit` = 7;
public const val `MetafileFrameUnitInch`: `MetafileFrameUnit` = 4;
public const val `MetafileFrameUnitMillimeter`: `MetafileFrameUnit` = 6;
public const val `MetafileFrameUnitPixel`: `MetafileFrameUnit` = 2;
public const val `MetafileFrameUnitPoint`: `MetafileFrameUnit` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(feature = "Win32_Graphics_Gdi")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `MetafileHeader` (
    public var `Type`: `MetafileType`,
    public var `Size`: UInt,
    public var `Version`: UInt,
    public var `EmfPlusFlags`: UInt,
    public var `DpiX`: Float,
    public var `DpiY`: Float,
    public var `X`: Int,
    public var `Y`: Int,
    public var `Width`: Int,
    public var `Height`: Int,
    public var `Anonymous`: `MetafileHeader_0`,
    public var `EmfPlusHeaderSize`: Int,
    public var `LogicalDpiX`: Int,
    public var `LogicalDpiY`: Int,
)
// UNSUPPORTED Rust 1753:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for MetafileHeader {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

// UNSUPPORTED Rust 1759:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[cfg(feature = "Win32_Graphics_Gdi")]
// #[derive(Clone, Copy)]
// pub union MetafileHeader_0 {
//     pub WmfHeader: super::Gdi::METAHEADER,
//     pub EmfHeader: ENHMETAHEADER3,
// }

// UNSUPPORTED Rust 1766:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// #[cfg(feature = "Win32_Graphics_Gdi")]
// impl Default for MetafileHeader_0 {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `MetafileType` = Int;
public const val `MetafileTypeEmf`: `MetafileType` = 3;
public const val `MetafileTypeEmfPlusDual`: `MetafileType` = 5;
public const val `MetafileTypeEmfPlusOnly`: `MetafileType` = 4;
public const val `MetafileTypeInvalid`: `MetafileType` = 0;
public const val `MetafileTypeWmf`: `MetafileType` = 1;
public const val `MetafileTypeWmfPlaceable`: `MetafileType` = 2;
public const val `NotImplemented`: `Status` = 6;
public const val `NotTrueTypeFont`: `Status` = 16;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `NotificationHookProc` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(/* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.ULongVar>?) -> `Status`>>>;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `NotificationUnhookProc` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(ULong) -> Unit>>>;
public const val `ObjectBusy`: `Status` = 4;
public typealias `ObjectType` = Int;
public const val `ObjectTypeBrush`: `ObjectType` = 1;
public const val `ObjectTypeCustomLineCap`: `ObjectType` = 9;
public const val `ObjectTypeFont`: `ObjectType` = 6;
public const val `ObjectTypeGraphics`: `ObjectType` = 10;
public const val `ObjectTypeImage`: `ObjectType` = 5;
public const val `ObjectTypeImageAttributes`: `ObjectType` = 8;
public const val `ObjectTypeInvalid`: `ObjectType` = 0;
public const val `ObjectTypeMax`: `ObjectType` = 10;
public const val `ObjectTypeMin`: `ObjectType` = 1;
public const val `ObjectTypePath`: `ObjectType` = 3;
public const val `ObjectTypePen`: `ObjectType` = 2;
public const val `ObjectTypeRegion`: `ObjectType` = 4;
public const val `ObjectTypeStringFormat`: `ObjectType` = 7;
public const val `Ok`: `Status` = 0;
public const val `OutOfMemory`: `Status` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PWMFRect16` (
    public var `Left`: Short,
    public var `Top`: Short,
    public var `Right`: Short,
    public var `Bottom`: Short,
)
public typealias `PaletteFlags` = Int;
public const val `PaletteFlagsGrayScale`: `PaletteFlags` = 2;
public const val `PaletteFlagsHalftone`: `PaletteFlags` = 4;
public const val `PaletteFlagsHasAlpha`: `PaletteFlags` = 1;
public typealias `PaletteType` = Int;
public const val `PaletteTypeCustom`: `PaletteType` = 0;
public const val `PaletteTypeFixedBW`: `PaletteType` = 2;
public const val `PaletteTypeFixedHalftone125`: `PaletteType` = 6;
public const val `PaletteTypeFixedHalftone216`: `PaletteType` = 7;
public const val `PaletteTypeFixedHalftone252`: `PaletteType` = 8;
public const val `PaletteTypeFixedHalftone256`: `PaletteType` = 9;
public const val `PaletteTypeFixedHalftone27`: `PaletteType` = 4;
public const val `PaletteTypeFixedHalftone64`: `PaletteType` = 5;
public const val `PaletteTypeFixedHalftone8`: `PaletteType` = 3;
public const val `PaletteTypeOptimal`: `PaletteType` = 1;
public typealias `PathData` = Long;
public typealias `PathPointType` = Int;
public const val `PathPointTypeBezier`: `PathPointType` = 3;
public const val `PathPointTypeBezier3`: `PathPointType` = 3;
public const val `PathPointTypeCloseSubpath`: `PathPointType` = 128;
public const val `PathPointTypeDashMode`: `PathPointType` = 16;
public const val `PathPointTypeLine`: `PathPointType` = 1;
public const val `PathPointTypePathMarker`: `PathPointType` = 32;
public const val `PathPointTypePathTypeMask`: `PathPointType` = 7;
public const val `PathPointTypeStart`: `PathPointType` = 0;
public typealias `PenAlignment` = Int;
public const val `PenAlignmentCenter`: `PenAlignment` = 0;
public const val `PenAlignmentInset`: `PenAlignment` = 1;
public typealias `PenType` = Int;
public const val `PenTypeHatchFill`: `PenType` = 1;
public const val `PenTypeLinearGradient`: `PenType` = 4;
public const val `PenTypePathGradient`: `PenType` = 3;
public const val `PenTypeSolidColor`: `PenType` = 0;
public const val `PenTypeTextureFill`: `PenType` = 2;
public const val `PenTypeUnknown`: `PenType` = -1;
public const val `PixelFormatAlpha`: UInt = 262144u;
public const val `PixelFormatCanonical`: UInt = 2097152u;
public const val `PixelFormatDontCare`: UInt = 0u;
public const val `PixelFormatExtended`: UInt = 1048576u;
public const val `PixelFormatGDI`: UInt = 131072u;
public const val `PixelFormatIndexed`: UInt = 65536u;
public const val `PixelFormatMax`: UInt = 16u;
public const val `PixelFormatPAlpha`: UInt = 524288u;
public const val `PixelFormatUndefined`: UInt = 0u;
public typealias `PixelOffsetMode` = Int;
public const val `PixelOffsetModeDefault`: `PixelOffsetMode` = 0;
public const val `PixelOffsetModeHalf`: `PixelOffsetMode` = 4;
public const val `PixelOffsetModeHighQuality`: `PixelOffsetMode` = 2;
public const val `PixelOffsetModeHighSpeed`: `PixelOffsetMode` = 1;
public const val `PixelOffsetModeInvalid`: `PixelOffsetMode` = -1;
public const val `PixelOffsetModeNone`: `PixelOffsetMode` = 3;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `Point` (
    public var `X`: Int,
    public var `Y`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `PointF` (
    public var `X`: Float,
    public var `Y`: Float,
)
public typealias `PrivateFontCollection` = Long;
public const val `ProfileNotFound`: `Status` = 21;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `PropertyItem` (
    public var `id`: UInt,
    public var `length`: UInt,
    public var `type`: UShort,
    public var `value`: /* Rust *mut */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?,
)
// UNSUPPORTED Rust 1881:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for PropertyItem {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public const val `PropertyNotFound`: `Status` = 19;
public const val `PropertyNotSupported`: `Status` = 20;
public const val `PropertyTagArtist`: UInt = 315u;
public const val `PropertyTagBitsPerSample`: UInt = 258u;
public const val `PropertyTagCellHeight`: UInt = 265u;
public const val `PropertyTagCellWidth`: UInt = 264u;
public const val `PropertyTagChrominanceTable`: UInt = 20625u;
public const val `PropertyTagColorMap`: UInt = 320u;
public const val `PropertyTagColorTransferFunction`: UInt = 20506u;
public const val `PropertyTagCompression`: UInt = 259u;
public const val `PropertyTagCopyright`: UInt = 33432u;
public const val `PropertyTagDateTime`: UInt = 306u;
public const val `PropertyTagDocumentName`: UInt = 269u;
public const val `PropertyTagDotRange`: UInt = 336u;
public const val `PropertyTagEquipMake`: UInt = 271u;
public const val `PropertyTagEquipModel`: UInt = 272u;
public const val `PropertyTagExifAperture`: UInt = 37378u;
public const val `PropertyTagExifBrightness`: UInt = 37379u;
public const val `PropertyTagExifCfaPattern`: UInt = 41730u;
public const val `PropertyTagExifColorSpace`: UInt = 40961u;
public const val `PropertyTagExifCompBPP`: UInt = 37122u;
public const val `PropertyTagExifCompConfig`: UInt = 37121u;
public const val `PropertyTagExifContrast`: UInt = 41992u;
public const val `PropertyTagExifCustomRendered`: UInt = 41985u;
public const val `PropertyTagExifDTDigSS`: UInt = 37522u;
public const val `PropertyTagExifDTDigitized`: UInt = 36868u;
public const val `PropertyTagExifDTOrig`: UInt = 36867u;
public const val `PropertyTagExifDTOrigSS`: UInt = 37521u;
public const val `PropertyTagExifDTSubsec`: UInt = 37520u;
public const val `PropertyTagExifDeviceSettingDesc`: UInt = 41995u;
public const val `PropertyTagExifDigitalZoomRatio`: UInt = 41988u;
public const val `PropertyTagExifExposureBias`: UInt = 37380u;
public const val `PropertyTagExifExposureIndex`: UInt = 41493u;
public const val `PropertyTagExifExposureMode`: UInt = 41986u;
public const val `PropertyTagExifExposureProg`: UInt = 34850u;
public const val `PropertyTagExifExposureTime`: UInt = 33434u;
public const val `PropertyTagExifFNumber`: UInt = 33437u;
public const val `PropertyTagExifFPXVer`: UInt = 40960u;
public const val `PropertyTagExifFileSource`: UInt = 41728u;
public const val `PropertyTagExifFlash`: UInt = 37385u;
public const val `PropertyTagExifFlashEnergy`: UInt = 41483u;
public const val `PropertyTagExifFocalLength`: UInt = 37386u;
public const val `PropertyTagExifFocalLengthIn35mmFilm`: UInt = 41989u;
public const val `PropertyTagExifFocalResUnit`: UInt = 41488u;
public const val `PropertyTagExifFocalXRes`: UInt = 41486u;
public const val `PropertyTagExifFocalYRes`: UInt = 41487u;
public const val `PropertyTagExifGainControl`: UInt = 41991u;
public const val `PropertyTagExifIFD`: UInt = 34665u;
public const val `PropertyTagExifISOSpeed`: UInt = 34855u;
public const val `PropertyTagExifInterop`: UInt = 40965u;
public const val `PropertyTagExifLightSource`: UInt = 37384u;
public const val `PropertyTagExifMakerNote`: UInt = 37500u;
public const val `PropertyTagExifMaxAperture`: UInt = 37381u;
public const val `PropertyTagExifMeteringMode`: UInt = 37383u;
public const val `PropertyTagExifOECF`: UInt = 34856u;
public const val `PropertyTagExifPixXDim`: UInt = 40962u;
public const val `PropertyTagExifPixYDim`: UInt = 40963u;
public const val `PropertyTagExifRelatedWav`: UInt = 40964u;
public const val `PropertyTagExifSaturation`: UInt = 41993u;
public const val `PropertyTagExifSceneCaptureType`: UInt = 41990u;
public const val `PropertyTagExifSceneType`: UInt = 41729u;
public const val `PropertyTagExifSensingMethod`: UInt = 41495u;
public const val `PropertyTagExifSharpness`: UInt = 41994u;
public const val `PropertyTagExifShutterSpeed`: UInt = 37377u;
public const val `PropertyTagExifSpatialFR`: UInt = 41484u;
public const val `PropertyTagExifSpectralSense`: UInt = 34852u;
public const val `PropertyTagExifSubjectArea`: UInt = 37396u;
public const val `PropertyTagExifSubjectDist`: UInt = 37382u;
public const val `PropertyTagExifSubjectDistanceRange`: UInt = 41996u;
public const val `PropertyTagExifSubjectLoc`: UInt = 41492u;
public const val `PropertyTagExifUniqueImageID`: UInt = 42016u;
public const val `PropertyTagExifUserComment`: UInt = 37510u;
public const val `PropertyTagExifVer`: UInt = 36864u;
public const val `PropertyTagExifWhiteBalance`: UInt = 41987u;
public const val `PropertyTagExtraSamples`: UInt = 338u;
public const val `PropertyTagFillOrder`: UInt = 266u;
public const val `PropertyTagFrameDelay`: UInt = 20736u;
public const val `PropertyTagFreeByteCounts`: UInt = 289u;
public const val `PropertyTagFreeOffset`: UInt = 288u;
public const val `PropertyTagGamma`: UInt = 769u;
public const val `PropertyTagGlobalPalette`: UInt = 20738u;
public const val `PropertyTagGpsAltitude`: UInt = 6u;
public const val `PropertyTagGpsAltitudeRef`: UInt = 5u;
public const val `PropertyTagGpsAreaInformation`: UInt = 28u;
public const val `PropertyTagGpsDate`: UInt = 29u;
public const val `PropertyTagGpsDestBear`: UInt = 24u;
public const val `PropertyTagGpsDestBearRef`: UInt = 23u;
public const val `PropertyTagGpsDestDist`: UInt = 26u;
public const val `PropertyTagGpsDestDistRef`: UInt = 25u;
public const val `PropertyTagGpsDestLat`: UInt = 20u;
public const val `PropertyTagGpsDestLatRef`: UInt = 19u;
public const val `PropertyTagGpsDestLong`: UInt = 22u;
public const val `PropertyTagGpsDestLongRef`: UInt = 21u;
public const val `PropertyTagGpsDifferential`: UInt = 30u;
public const val `PropertyTagGpsGpsDop`: UInt = 11u;
public const val `PropertyTagGpsGpsMeasureMode`: UInt = 10u;
public const val `PropertyTagGpsGpsSatellites`: UInt = 8u;
public const val `PropertyTagGpsGpsStatus`: UInt = 9u;
public const val `PropertyTagGpsGpsTime`: UInt = 7u;
public const val `PropertyTagGpsIFD`: UInt = 34853u;
public const val `PropertyTagGpsImgDir`: UInt = 17u;
public const val `PropertyTagGpsImgDirRef`: UInt = 16u;
public const val `PropertyTagGpsLatitude`: UInt = 2u;
public const val `PropertyTagGpsLatitudeRef`: UInt = 1u;
public const val `PropertyTagGpsLongitude`: UInt = 4u;
public const val `PropertyTagGpsLongitudeRef`: UInt = 3u;
public const val `PropertyTagGpsMapDatum`: UInt = 18u;
public const val `PropertyTagGpsProcessingMethod`: UInt = 27u;
public const val `PropertyTagGpsSpeed`: UInt = 13u;
public const val `PropertyTagGpsSpeedRef`: UInt = 12u;
public const val `PropertyTagGpsTrack`: UInt = 15u;
public const val `PropertyTagGpsTrackRef`: UInt = 14u;
public const val `PropertyTagGpsVer`: UInt = 0u;
public const val `PropertyTagGrayResponseCurve`: UInt = 291u;
public const val `PropertyTagGrayResponseUnit`: UInt = 290u;
public const val `PropertyTagGridSize`: UInt = 20497u;
public const val `PropertyTagHalftoneDegree`: UInt = 20492u;
public const val `PropertyTagHalftoneHints`: UInt = 321u;
public const val `PropertyTagHalftoneLPI`: UInt = 20490u;
public const val `PropertyTagHalftoneLPIUnit`: UInt = 20491u;
public const val `PropertyTagHalftoneMisc`: UInt = 20494u;
public const val `PropertyTagHalftoneScreen`: UInt = 20495u;
public const val `PropertyTagHalftoneShape`: UInt = 20493u;
public const val `PropertyTagHostComputer`: UInt = 316u;
public const val `PropertyTagICCProfile`: UInt = 34675u;
public const val `PropertyTagICCProfileDescriptor`: UInt = 770u;
public const val `PropertyTagImageDescription`: UInt = 270u;
public const val `PropertyTagImageHeight`: UInt = 257u;
public const val `PropertyTagImageTitle`: UInt = 800u;
public const val `PropertyTagImageWidth`: UInt = 256u;
public const val `PropertyTagIndexBackground`: UInt = 20739u;
public const val `PropertyTagIndexTransparent`: UInt = 20740u;
public const val `PropertyTagInkNames`: UInt = 333u;
public const val `PropertyTagInkSet`: UInt = 332u;
public const val `PropertyTagJPEGACTables`: UInt = 521u;
public const val `PropertyTagJPEGDCTables`: UInt = 520u;
public const val `PropertyTagJPEGInterFormat`: UInt = 513u;
public const val `PropertyTagJPEGInterLength`: UInt = 514u;
public const val `PropertyTagJPEGLosslessPredictors`: UInt = 517u;
public const val `PropertyTagJPEGPointTransforms`: UInt = 518u;
public const val `PropertyTagJPEGProc`: UInt = 512u;
public const val `PropertyTagJPEGQTables`: UInt = 519u;
public const val `PropertyTagJPEGQuality`: UInt = 20496u;
public const val `PropertyTagJPEGRestartInterval`: UInt = 515u;
public const val `PropertyTagLoopCount`: UInt = 20737u;
public const val `PropertyTagLuminanceTable`: UInt = 20624u;
public const val `PropertyTagMaxSampleValue`: UInt = 281u;
public const val `PropertyTagMinSampleValue`: UInt = 280u;
public const val `PropertyTagNewSubfileType`: UInt = 254u;
public const val `PropertyTagNumberOfInks`: UInt = 334u;
public const val `PropertyTagOrientation`: UInt = 274u;
public const val `PropertyTagPageName`: UInt = 285u;
public const val `PropertyTagPageNumber`: UInt = 297u;
public const val `PropertyTagPaletteHistogram`: UInt = 20755u;
public const val `PropertyTagPhotometricInterp`: UInt = 262u;
public const val `PropertyTagPixelPerUnitX`: UInt = 20753u;
public const val `PropertyTagPixelPerUnitY`: UInt = 20754u;
public const val `PropertyTagPixelUnit`: UInt = 20752u;
public const val `PropertyTagPlanarConfig`: UInt = 284u;
public const val `PropertyTagPredictor`: UInt = 317u;
public const val `PropertyTagPrimaryChromaticities`: UInt = 319u;
public const val `PropertyTagPrintFlags`: UInt = 20485u;
public const val `PropertyTagPrintFlagsBleedWidth`: UInt = 20488u;
public const val `PropertyTagPrintFlagsBleedWidthScale`: UInt = 20489u;
public const val `PropertyTagPrintFlagsCrop`: UInt = 20487u;
public const val `PropertyTagPrintFlagsVersion`: UInt = 20486u;
public const val `PropertyTagREFBlackWhite`: UInt = 532u;
public const val `PropertyTagResolutionUnit`: UInt = 296u;
public const val `PropertyTagResolutionXLengthUnit`: UInt = 20483u;
public const val `PropertyTagResolutionXUnit`: UInt = 20481u;
public const val `PropertyTagResolutionYLengthUnit`: UInt = 20484u;
public const val `PropertyTagResolutionYUnit`: UInt = 20482u;
public const val `PropertyTagRowsPerStrip`: UInt = 278u;
public const val `PropertyTagSMaxSampleValue`: UInt = 341u;
public const val `PropertyTagSMinSampleValue`: UInt = 340u;
public const val `PropertyTagSRGBRenderingIntent`: UInt = 771u;
public const val `PropertyTagSampleFormat`: UInt = 339u;
public const val `PropertyTagSamplesPerPixel`: UInt = 277u;
public const val `PropertyTagSoftwareUsed`: UInt = 305u;
public const val `PropertyTagStripBytesCount`: UInt = 279u;
public const val `PropertyTagStripOffsets`: UInt = 273u;
public const val `PropertyTagSubfileType`: UInt = 255u;
public const val `PropertyTagT4Option`: UInt = 292u;
public const val `PropertyTagT6Option`: UInt = 293u;
public const val `PropertyTagTargetPrinter`: UInt = 337u;
public const val `PropertyTagThreshHolding`: UInt = 263u;
public const val `PropertyTagThumbnailArtist`: UInt = 20532u;
public const val `PropertyTagThumbnailBitsPerSample`: UInt = 20514u;
public const val `PropertyTagThumbnailColorDepth`: UInt = 20501u;
public const val `PropertyTagThumbnailCompressedSize`: UInt = 20505u;
public const val `PropertyTagThumbnailCompression`: UInt = 20515u;
public const val `PropertyTagThumbnailCopyRight`: UInt = 20539u;
public const val `PropertyTagThumbnailData`: UInt = 20507u;
public const val `PropertyTagThumbnailDateTime`: UInt = 20531u;
public const val `PropertyTagThumbnailEquipMake`: UInt = 20518u;
public const val `PropertyTagThumbnailEquipModel`: UInt = 20519u;
public const val `PropertyTagThumbnailFormat`: UInt = 20498u;
public const val `PropertyTagThumbnailHeight`: UInt = 20500u;
public const val `PropertyTagThumbnailImageDescription`: UInt = 20517u;
public const val `PropertyTagThumbnailImageHeight`: UInt = 20513u;
public const val `PropertyTagThumbnailImageWidth`: UInt = 20512u;
public const val `PropertyTagThumbnailOrientation`: UInt = 20521u;
public const val `PropertyTagThumbnailPhotometricInterp`: UInt = 20516u;
public const val `PropertyTagThumbnailPlanarConfig`: UInt = 20527u;
public const val `PropertyTagThumbnailPlanes`: UInt = 20502u;
public const val `PropertyTagThumbnailPrimaryChromaticities`: UInt = 20534u;
public const val `PropertyTagThumbnailRawBytes`: UInt = 20503u;
public const val `PropertyTagThumbnailRefBlackWhite`: UInt = 20538u;
public const val `PropertyTagThumbnailResolutionUnit`: UInt = 20528u;
public const val `PropertyTagThumbnailResolutionX`: UInt = 20525u;
public const val `PropertyTagThumbnailResolutionY`: UInt = 20526u;
public const val `PropertyTagThumbnailRowsPerStrip`: UInt = 20523u;
public const val `PropertyTagThumbnailSamplesPerPixel`: UInt = 20522u;
public const val `PropertyTagThumbnailSize`: UInt = 20504u;
public const val `PropertyTagThumbnailSoftwareUsed`: UInt = 20530u;
public const val `PropertyTagThumbnailStripBytesCount`: UInt = 20524u;
public const val `PropertyTagThumbnailStripOffsets`: UInt = 20520u;
public const val `PropertyTagThumbnailTransferFunction`: UInt = 20529u;
public const val `PropertyTagThumbnailWhitePoint`: UInt = 20533u;
public const val `PropertyTagThumbnailWidth`: UInt = 20499u;
public const val `PropertyTagThumbnailYCbCrCoefficients`: UInt = 20535u;
public const val `PropertyTagThumbnailYCbCrPositioning`: UInt = 20537u;
public const val `PropertyTagThumbnailYCbCrSubsampling`: UInt = 20536u;
public const val `PropertyTagTileByteCounts`: UInt = 325u;
public const val `PropertyTagTileLength`: UInt = 323u;
public const val `PropertyTagTileOffset`: UInt = 324u;
public const val `PropertyTagTileWidth`: UInt = 322u;
public const val `PropertyTagTransferFuncition`: UInt = 301u;
public const val `PropertyTagTransferRange`: UInt = 342u;
public const val `PropertyTagTypeASCII`: UInt = 2u;
public const val `PropertyTagTypeByte`: UInt = 1u;
public const val `PropertyTagTypeLong`: UInt = 4u;
public const val `PropertyTagTypeRational`: UInt = 5u;
public const val `PropertyTagTypeSLONG`: UInt = 9u;
public const val `PropertyTagTypeSRational`: UInt = 10u;
public const val `PropertyTagTypeShort`: UInt = 3u;
public const val `PropertyTagTypeUndefined`: UInt = 7u;
public const val `PropertyTagWhitePoint`: UInt = 318u;
public const val `PropertyTagXPosition`: UInt = 286u;
public const val `PropertyTagXResolution`: UInt = 282u;
public const val `PropertyTagYCbCrCoefficients`: UInt = 529u;
public const val `PropertyTagYCbCrPositioning`: UInt = 531u;
public const val `PropertyTagYCbCrSubsampling`: UInt = 530u;
public const val `PropertyTagYPosition`: UInt = 287u;
public const val `PropertyTagYResolution`: UInt = 283u;
public typealias `QualityMode` = Int;
public const val `QualityModeDefault`: `QualityMode` = 0;
public const val `QualityModeHigh`: `QualityMode` = 2;
public const val `QualityModeInvalid`: `QualityMode` = -1;
public const val `QualityModeLow`: `QualityMode` = 1;
public const val `RED_SHIFT`: UInt = 16u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `Rect` (
    public var `X`: Int,
    public var `Y`: Int,
    public var `Width`: Int,
    public var `Height`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RectF` (
    public var `X`: Float,
    public var `Y`: Float,
    public var `Width`: Float,
    public var `Height`: Float,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `RedEyeCorrection` (
    public var `Base`: `Effect`,
)
// UNSUPPORTED Rust 2158:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const RedEyeCorrectionEffectGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x74d29d05_69a4_4266_9549_3cc52836b632);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `RedEyeCorrectionParams` (
    public var `numberOfAreas`: UInt,
    public var `areas`: /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`RECT`>?,
)
// UNSUPPORTED Rust 2165:1: declaration Impl has no candidate rule; syntax: no per-file syntax rule for Impl
// impl Default for RedEyeCorrectionParams {
//     fn default() -> Self {
//         unsafe { core::mem::zeroed() }
//     }
// }

public typealias `Region` = Long;
public const val `Rotate180FlipNone`: `RotateFlipType` = 2;
public const val `Rotate180FlipX`: `RotateFlipType` = 6;
public const val `Rotate180FlipXY`: `RotateFlipType` = 0;
public const val `Rotate180FlipY`: `RotateFlipType` = 4;
public const val `Rotate270FlipNone`: `RotateFlipType` = 3;
public const val `Rotate270FlipX`: `RotateFlipType` = 7;
public const val `Rotate270FlipXY`: `RotateFlipType` = 1;
public const val `Rotate270FlipY`: `RotateFlipType` = 5;
public const val `Rotate90FlipNone`: `RotateFlipType` = 1;
public const val `Rotate90FlipX`: `RotateFlipType` = 5;
public const val `Rotate90FlipXY`: `RotateFlipType` = 3;
public const val `Rotate90FlipY`: `RotateFlipType` = 7;
public typealias `RotateFlipType` = Int;
public const val `RotateNoneFlipNone`: `RotateFlipType` = 0;
public const val `RotateNoneFlipX`: `RotateFlipType` = 4;
public const val `RotateNoneFlipXY`: `RotateFlipType` = 2;
public const val `RotateNoneFlipY`: `RotateFlipType` = 6;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `Sharpen` (
    public var `Base`: `Effect`,
)
// UNSUPPORTED Rust 2193:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const SharpenEffectGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x63cbf3ee_c526_402c_8f71_62c540bf5142);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SharpenParams` (
    public var `radius`: Float,
    public var `amount`: Float,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `Size` (
    public var `Width`: Int,
    public var `Height`: Int,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SizeF` (
    public var `Width`: Float,
    public var `Height`: Float,
)
public typealias `SmoothingMode` = Int;
public const val `SmoothingModeAntiAlias`: `SmoothingMode` = 4;
public const val `SmoothingModeAntiAlias8x4`: `SmoothingMode` = 4;
public const val `SmoothingModeAntiAlias8x8`: `SmoothingMode` = 5;
public const val `SmoothingModeDefault`: `SmoothingMode` = 0;
public const val `SmoothingModeHighQuality`: `SmoothingMode` = 2;
public const val `SmoothingModeHighSpeed`: `SmoothingMode` = 1;
public const val `SmoothingModeInvalid`: `SmoothingMode` = -1;
public const val `SmoothingModeNone`: `SmoothingMode` = 3;
public typealias `Status` = Int;
public typealias `StringAlignment` = Int;
public const val `StringAlignmentCenter`: `StringAlignment` = 1;
public const val `StringAlignmentFar`: `StringAlignment` = 2;
public const val `StringAlignmentNear`: `StringAlignment` = 0;
public typealias `StringDigitSubstitute` = Int;
public const val `StringDigitSubstituteNational`: `StringDigitSubstitute` = 2;
public const val `StringDigitSubstituteNone`: `StringDigitSubstitute` = 1;
public const val `StringDigitSubstituteTraditional`: `StringDigitSubstitute` = 3;
public const val `StringDigitSubstituteUser`: `StringDigitSubstitute` = 0;
public typealias `StringFormatFlags` = Int;
public const val `StringFormatFlagsBypassGDI`: `StringFormatFlags` = -2147483648;
public const val `StringFormatFlagsDirectionRightToLeft`: `StringFormatFlags` = 1;
public const val `StringFormatFlagsDirectionVertical`: `StringFormatFlags` = 2;
public const val `StringFormatFlagsDisplayFormatControl`: `StringFormatFlags` = 32;
public const val `StringFormatFlagsLineLimit`: `StringFormatFlags` = 8192;
public const val `StringFormatFlagsMeasureTrailingSpaces`: `StringFormatFlags` = 2048;
public const val `StringFormatFlagsNoClip`: `StringFormatFlags` = 16384;
public const val `StringFormatFlagsNoFitBlackBox`: `StringFormatFlags` = 4;
public const val `StringFormatFlagsNoFontFallback`: `StringFormatFlags` = 1024;
public const val `StringFormatFlagsNoWrap`: `StringFormatFlags` = 4096;
public typealias `StringTrimming` = Int;
public const val `StringTrimmingCharacter`: `StringTrimming` = 1;
public const val `StringTrimmingEllipsisCharacter`: `StringTrimming` = 3;
public const val `StringTrimmingEllipsisPath`: `StringTrimming` = 5;
public const val `StringTrimmingEllipsisWord`: `StringTrimming` = 4;
public const val `StringTrimmingNone`: `StringTrimming` = 0;
public const val `StringTrimmingWord`: `StringTrimming` = 2;
public const val `TestControlForceBilinear`: `GpTestControlEnum` = 0;
public const val `TestControlGetBuildNumber`: `GpTestControlEnum` = 2;
public const val `TestControlNoICM`: `GpTestControlEnum` = 1;
public typealias `TextRenderingHint` = Int;
public const val `TextRenderingHintAntiAlias`: `TextRenderingHint` = 4;
public const val `TextRenderingHintAntiAliasGridFit`: `TextRenderingHint` = 3;
public const val `TextRenderingHintClearTypeGridFit`: `TextRenderingHint` = 5;
public const val `TextRenderingHintSingleBitPerPixel`: `TextRenderingHint` = 2;
public const val `TextRenderingHintSingleBitPerPixelGridFit`: `TextRenderingHint` = 1;
public const val `TextRenderingHintSystemDefault`: `TextRenderingHint` = 0;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `Tint` (
    public var `Base`: `Effect`,
)
// UNSUPPORTED Rust 2264:1: missing/ambiguous source-backed scalar alias windows_sys::core::GUID; syntax: no per-file syntax rule for Const
// pub const TintEffectGuid: windows_sys::core::GUID = windows_sys::core::GUID::from_u128(0x1077af00_2848_4441_9489_44ad4c2d7a2c);

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `TintParams` (
    public var `hue`: Int,
    public var `amount`: Int,
)
public typealias `Unit` = Int;
public const val `UnitDisplay`: `Unit` = 1;
public const val `UnitDocument`: `Unit` = 5;
public const val `UnitInch`: `Unit` = 4;
public const val `UnitMillimeter`: `Unit` = 6;
public const val `UnitPixel`: `Unit` = 2;
public const val `UnitPoint`: `Unit` = 3;
public const val `UnitWorld`: `Unit` = 0;
public const val `UnknownImageFormat`: `Status` = 13;
public const val `UnsupportedGdiplusVersion`: `Status` = 17;
public const val `ValueOverflow`: `Status` = 11;
public typealias `WarpMode` = Int;
public const val `WarpModeBilinear`: `WarpMode` = 1;
public const val `WarpModePerspective`: `WarpMode` = 0;
public const val `Win32Error`: `Status` = 7;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(2))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `WmfPlaceableFileHeader` (
    public var `Key`: UInt,
    public var `Hmf`: Short,
    public var `BoundingBox`: `PWMFRect16`,
    public var `Inch`: Short,
    public var `Reserved`: UInt,
    public var `Checksum`: Short,
)
public const val `WmfRecordTypeAbortDoc`: `EmfPlusRecordType` = 65618;
public const val `WmfRecordTypeAnimatePalette`: `EmfPlusRecordType` = 66614;
public const val `WmfRecordTypeArc`: `EmfPlusRecordType` = 67607;
public const val `WmfRecordTypeBitBlt`: `EmfPlusRecordType` = 67874;
public const val `WmfRecordTypeChord`: `EmfPlusRecordType` = 67632;
public const val `WmfRecordTypeCreateBitmap`: `EmfPlusRecordType` = 67326;
public const val `WmfRecordTypeCreateBitmapIndirect`: `EmfPlusRecordType` = 66301;
public const val `WmfRecordTypeCreateBrush`: `EmfPlusRecordType` = 65784;
public const val `WmfRecordTypeCreateBrushIndirect`: `EmfPlusRecordType` = 66300;
public const val `WmfRecordTypeCreateFontIndirect`: `EmfPlusRecordType` = 66299;
public const val `WmfRecordTypeCreatePalette`: `EmfPlusRecordType` = 65783;
public const val `WmfRecordTypeCreatePatternBrush`: `EmfPlusRecordType` = 66041;
public const val `WmfRecordTypeCreatePenIndirect`: `EmfPlusRecordType` = 66298;
public const val `WmfRecordTypeCreateRegion`: `EmfPlusRecordType` = 67327;
public const val `WmfRecordTypeDIBBitBlt`: `EmfPlusRecordType` = 67904;
public const val `WmfRecordTypeDIBCreatePatternBrush`: `EmfPlusRecordType` = 65858;
public const val `WmfRecordTypeDIBStretchBlt`: `EmfPlusRecordType` = 68417;
public const val `WmfRecordTypeDeleteObject`: `EmfPlusRecordType` = 66032;
public const val `WmfRecordTypeDrawText`: `EmfPlusRecordType` = 67119;
public const val `WmfRecordTypeEllipse`: `EmfPlusRecordType` = 66584;
public const val `WmfRecordTypeEndDoc`: `EmfPlusRecordType` = 65630;
public const val `WmfRecordTypeEndPage`: `EmfPlusRecordType` = 65616;
public const val `WmfRecordTypeEscape`: `EmfPlusRecordType` = 67110;
public const val `WmfRecordTypeExcludeClipRect`: `EmfPlusRecordType` = 66581;
public const val `WmfRecordTypeExtFloodFill`: `EmfPlusRecordType` = 66888;
public const val `WmfRecordTypeExtTextOut`: `EmfPlusRecordType` = 68146;
public const val `WmfRecordTypeFillRegion`: `EmfPlusRecordType` = 66088;
public const val `WmfRecordTypeFloodFill`: `EmfPlusRecordType` = 66585;
public const val `WmfRecordTypeFrameRegion`: `EmfPlusRecordType` = 66601;
public const val `WmfRecordTypeIntersectClipRect`: `EmfPlusRecordType` = 66582;
public const val `WmfRecordTypeInvertRegion`: `EmfPlusRecordType` = 65834;
public const val `WmfRecordTypeLineTo`: `EmfPlusRecordType` = 66067;
public const val `WmfRecordTypeMoveTo`: `EmfPlusRecordType` = 66068;
public const val `WmfRecordTypeOffsetClipRgn`: `EmfPlusRecordType` = 66080;
public const val `WmfRecordTypeOffsetViewportOrg`: `EmfPlusRecordType` = 66065;
public const val `WmfRecordTypeOffsetWindowOrg`: `EmfPlusRecordType` = 66063;
public const val `WmfRecordTypePaintRegion`: `EmfPlusRecordType` = 65835;
public const val `WmfRecordTypePatBlt`: `EmfPlusRecordType` = 67101;
public const val `WmfRecordTypePie`: `EmfPlusRecordType` = 67610;
public const val `WmfRecordTypePolyPolygon`: `EmfPlusRecordType` = 66872;
public const val `WmfRecordTypePolygon`: `EmfPlusRecordType` = 66340;
public const val `WmfRecordTypePolyline`: `EmfPlusRecordType` = 66341;
public const val `WmfRecordTypeRealizePalette`: `EmfPlusRecordType` = 65589;
public const val `WmfRecordTypeRectangle`: `EmfPlusRecordType` = 66587;
public const val `WmfRecordTypeResetDC`: `EmfPlusRecordType` = 65868;
public const val `WmfRecordTypeResizePalette`: `EmfPlusRecordType` = 65849;
public const val `WmfRecordTypeRestoreDC`: `EmfPlusRecordType` = 65831;
public const val `WmfRecordTypeRoundRect`: `EmfPlusRecordType` = 67100;
public const val `WmfRecordTypeSaveDC`: `EmfPlusRecordType` = 65566;
public const val `WmfRecordTypeScaleViewportExt`: `EmfPlusRecordType` = 66578;
public const val `WmfRecordTypeScaleWindowExt`: `EmfPlusRecordType` = 66576;
public const val `WmfRecordTypeSelectClipRegion`: `EmfPlusRecordType` = 65836;
public const val `WmfRecordTypeSelectObject`: `EmfPlusRecordType` = 65837;
public const val `WmfRecordTypeSelectPalette`: `EmfPlusRecordType` = 66100;
public const val `WmfRecordTypeSetBkColor`: `EmfPlusRecordType` = 66049;
public const val `WmfRecordTypeSetBkMode`: `EmfPlusRecordType` = 65794;
public const val `WmfRecordTypeSetDIBToDev`: `EmfPlusRecordType` = 68915;
public const val `WmfRecordTypeSetLayout`: `EmfPlusRecordType` = 65865;
public const val `WmfRecordTypeSetMapMode`: `EmfPlusRecordType` = 65795;
public const val `WmfRecordTypeSetMapperFlags`: `EmfPlusRecordType` = 66097;
public const val `WmfRecordTypeSetPalEntries`: `EmfPlusRecordType` = 65591;
public const val `WmfRecordTypeSetPixel`: `EmfPlusRecordType` = 66591;
public const val `WmfRecordTypeSetPolyFillMode`: `EmfPlusRecordType` = 65798;
public const val `WmfRecordTypeSetROP2`: `EmfPlusRecordType` = 65796;
public const val `WmfRecordTypeSetRelAbs`: `EmfPlusRecordType` = 65797;
public const val `WmfRecordTypeSetStretchBltMode`: `EmfPlusRecordType` = 65799;
public const val `WmfRecordTypeSetTextAlign`: `EmfPlusRecordType` = 65838;
public const val `WmfRecordTypeSetTextCharExtra`: `EmfPlusRecordType` = 65800;
public const val `WmfRecordTypeSetTextColor`: `EmfPlusRecordType` = 66057;
public const val `WmfRecordTypeSetTextJustification`: `EmfPlusRecordType` = 66058;
public const val `WmfRecordTypeSetViewportExt`: `EmfPlusRecordType` = 66062;
public const val `WmfRecordTypeSetViewportOrg`: `EmfPlusRecordType` = 66061;
public const val `WmfRecordTypeSetWindowExt`: `EmfPlusRecordType` = 66060;
public const val `WmfRecordTypeSetWindowOrg`: `EmfPlusRecordType` = 66059;
public const val `WmfRecordTypeStartDoc`: `EmfPlusRecordType` = 65869;
public const val `WmfRecordTypeStartPage`: `EmfPlusRecordType` = 65615;
public const val `WmfRecordTypeStretchBlt`: `EmfPlusRecordType` = 68387;
public const val `WmfRecordTypeStretchDIB`: `EmfPlusRecordType` = 69443;
public const val `WmfRecordTypeTextOut`: `EmfPlusRecordType` = 66849;
public typealias `WrapMode` = Int;
public const val `WrapModeClamp`: `WrapMode` = 4;
public const val `WrapModeTile`: `WrapMode` = 0;
public const val `WrapModeTileFlipX`: `WrapMode` = 1;
public const val `WrapModeTileFlipXY`: `WrapMode` = 3;
public const val `WrapModeTileFlipY`: `WrapMode` = 2;
public const val `WrongState`: `Status` = 8;
