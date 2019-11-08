package com.example.kaanapos.utils.customviews;

import androidx.recyclerview.widget.RecyclerView;

public class RecyclerSectionItemDecoration extends RecyclerView.ItemDecoration {
//
//    private final int             headerOffset;
//    private final boolean         sticky;
//    private final SectionCallback sectionCallback;
//
//    private View headerView;
//    private TextView header , count;
//
//    public RecyclerSectionItemDecoration(int headerHeight, boolean sticky, @NonNull SectionCallback sectionCallback) {
//        headerOffset = headerHeight;
//        this.sticky = sticky;
//        this.sectionCallback = sectionCallback;
//    }
//
//    @Override
//    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
//        super.getItemOffsets(outRect,
//                view,
//                parent,
//                state);
//
//        int pos = parent.getChildAdapterPosition(view);
//        if (sectionCallback.isSection(pos)) {
//            outRect.top = headerOffset;
//        }
//    }
//
//    @Override
//    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
//        super.onDrawOver(c,
//                parent,
//                state);
//
//        if (headerView == null) {
//            headerView = inflateHeaderView(parent);
//            header = (TextView) headerView.findViewById(R.id.item_header_name);
//            count = (TextView) headerView.findViewById(R.id.item_header_total_count);
//            fixLayoutSize(headerView,
//                    parent);
//        }
//
//        CharSequence previousHeader = "";
//        for (int i = 0; i < parent.getChildCount(); i++) {
//            View child = parent.getChildAt(i);
//            final int position = parent.getChildAdapterPosition(child);
//
//            int x = 0 , y;
//            CharSequence title = sectionCallback.getSectionHeader(position);
//            String[] arrOfStr = title.toString().split("-");
//            header.setText(arrOfStr[0]);
////            String mCount = "(" + arrOfStr[1];
////            mCount =  mCount + ")";
//            count.setText("(" + arrOfStr[1] + ")");
//            if (!previousHeader.equals(title) || sectionCallback.isSection(position)) {
//
//                drawHeader(c,
//                        child,
//                        headerView);
//                previousHeader = title;
//            }
//        }
//    }
//
//    private void drawHeader(Canvas c, View child, View headerView) {
//        c.save();
//        if (sticky) {
//            c.translate(0,
//                    Math.max(0,
//                            child.getTop() - headerView.getHeight()));
//        } else {
//            c.translate(0,
//                    child.getTop() - headerView.getHeight());
//        }
//        headerView.draw(c);
//        c.restore();
//    }
//
//    private View inflateHeaderView(RecyclerView parent) {
//        return LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.order_list_header_layout,
//                        parent,
//                        false);
//    }
//
//    /**
//     * Measures the header view to make sure its size is greater than 0 and will be drawn
//     * https://yoda.entelect.co.za/view/9627/how-to-android-recyclerview-item-decorations
//     */
//    private void fixLayoutSize(View view, ViewGroup parent) {
//        int widthSpec = View.MeasureSpec.makeMeasureSpec(parent.getWidth(),
//                View.MeasureSpec.EXACTLY);
//        int heightSpec = View.MeasureSpec.makeMeasureSpec(parent.getHeight(),
//                View.MeasureSpec.UNSPECIFIED);
//
//        int childWidth = ViewGroup.getChildMeasureSpec(widthSpec,
//                parent.getPaddingLeft() + parent.getPaddingRight(),
//                view.getLayoutParams().width);
//        int childHeight = ViewGroup.getChildMeasureSpec(heightSpec,
//                parent.getPaddingTop() + parent.getPaddingBottom(),
//                view.getLayoutParams().height);
//
//        view.measure(childWidth,
//                childHeight);
//
//        view.layout(0,
//                0,
//                view.getMeasuredWidth(),
//                view.getMeasuredHeight());
//    }
//
//    public interface SectionCallback {
//
//        boolean isSection(int position);
//
//        CharSequence getSectionHeader(int position);
//    }
}
